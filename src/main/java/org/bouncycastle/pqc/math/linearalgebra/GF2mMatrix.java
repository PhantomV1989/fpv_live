package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;

public class GF2mMatrix extends Matrix {
    protected GF2mField field;
    protected int[][] matrix;

    public GF2mMatrix(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i = 8;
        int i2 = 1;
        while (gF2mField.getDegree() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length < 5) {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        this.numRows = (((bArr[1] & 255) << 8) ^ (((bArr[3] & 255) << 24) ^ ((bArr[2] & 255) << Tnaf.POW_2_WIDTH))) ^ (bArr[0] & 255);
        int i3 = i2 * this.numRows;
        if (this.numRows <= 0 || (bArr.length - 4) % i3 != 0) {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        this.numColumns = (bArr.length - 4) / i3;
        this.matrix = (int[][]) Array.newInstance(Integer.TYPE, this.numRows, this.numColumns);
        int i4 = 4;
        for (int i5 = 0; i5 < this.numRows; i5++) {
            for (int i6 = 0; i6 < this.numColumns; i6++) {
                int i7 = 0;
                while (i7 < i) {
                    int[] iArr = this.matrix[i5];
                    iArr[i6] = ((bArr[i4] & 255) << i7) ^ iArr[i6];
                    i7 += 8;
                    i4++;
                }
                if (!this.field.isElementOfThisField(this.matrix[i5][i6])) {
                    throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                }
            }
        }
    }

    protected GF2mMatrix(GF2mField gF2mField, int[][] iArr) {
        this.field = gF2mField;
        this.matrix = iArr;
        this.numRows = iArr.length;
        this.numColumns = iArr[0].length;
    }

    public GF2mMatrix(GF2mMatrix gF2mMatrix) {
        this.numRows = gF2mMatrix.numRows;
        this.numColumns = gF2mMatrix.numColumns;
        this.field = gF2mMatrix.field;
        this.matrix = new int[this.numRows][];
        for (int i = 0; i < this.numRows; i++) {
            this.matrix[i] = IntUtils.clone(gF2mMatrix.matrix[i]);
        }
    }

    private void addToRow(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.add(iArr[length], iArr2[length]);
        }
    }

    private int[] multRowWithElement(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.mult(iArr[length], i);
        }
        return iArr2;
    }

    private void multRowWithElementThis(int[] iArr, int i) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.field.mult(iArr[length], i);
        }
    }

    private static void swapColumns(int[][] iArr, int i, int i2) {
        int[] iArr2 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = iArr2;
    }

    public Matrix computeInverse() {
        int i;
        if (this.numRows != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, this.numRows, this.numRows);
        for (int i2 = this.numRows - 1; i2 >= 0; i2--) {
            iArr[i2] = IntUtils.clone(this.matrix[i2]);
        }
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, this.numRows, this.numRows);
        for (int i3 = this.numRows - 1; i3 >= 0; i3--) {
            iArr2[i3][i3] = 1;
        }
        for (int i4 = 0; i4 < this.numRows; i4++) {
            if (iArr[i4][i4] == 0) {
                int i5 = i4 + 1;
                boolean z = false;
                while (i5 < this.numRows) {
                    if (iArr[i5][i4] != 0) {
                        swapColumns(iArr, i4, i5);
                        swapColumns(iArr2, i4, i5);
                        i5 = this.numRows;
                        z = true;
                    }
                    i5++;
                }
                if (!z) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            int inverse = this.field.inverse(iArr[i4][i4]);
            multRowWithElementThis(iArr[i4], inverse);
            multRowWithElementThis(iArr2[i4], inverse);
            for (int i6 = 0; i6 < this.numRows; i6++) {
                if (!(i6 == i4 || (i = iArr[i6][i4]) == 0)) {
                    int[] multRowWithElement = multRowWithElement(iArr[i4], i);
                    int[] multRowWithElement2 = multRowWithElement(iArr2[i4], i);
                    addToRow(multRowWithElement, iArr[i6]);
                    addToRow(multRowWithElement2, iArr2[i6]);
                }
            }
        }
        return new GF2mMatrix(this.field, iArr2);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2mMatrix)) {
            return false;
        }
        GF2mMatrix gF2mMatrix = (GF2mMatrix) obj;
        if (!this.field.equals(gF2mMatrix.field) || gF2mMatrix.numRows != this.numColumns || gF2mMatrix.numColumns != this.numColumns) {
            return false;
        }
        for (int i = 0; i < this.numRows; i++) {
            for (int i2 = 0; i2 < this.numColumns; i2++) {
                if (this.matrix[i][i2] != gF2mMatrix.matrix[i][i2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public byte[] getEncoded() {
        int i = 8;
        int i2 = 1;
        while (this.field.getDegree() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[((i2 * this.numRows * this.numColumns) + 4)];
        bArr[0] = (byte) (this.numRows & 255);
        bArr[1] = (byte) ((this.numRows >>> 8) & 255);
        bArr[2] = (byte) ((this.numRows >>> 16) & 255);
        bArr[3] = (byte) ((this.numRows >>> 24) & 255);
        int i3 = 4;
        for (int i4 = 0; i4 < this.numRows; i4++) {
            for (int i5 = 0; i5 < this.numColumns; i5++) {
                int i6 = 0;
                while (i6 < i) {
                    bArr[i3] = (byte) (this.matrix[i4][i5] >>> i6);
                    i6 += 8;
                    i3++;
                }
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.numColumns + (((this.field.hashCode() * 31) + this.numRows) * 31);
        for (int i = 0; i < this.numRows; i++) {
            for (int i2 = 0; i2 < this.numColumns; i2++) {
                hashCode = (hashCode * 31) + this.matrix[i][i2];
            }
        }
        return hashCode;
    }

    public boolean isZero() {
        for (int i = 0; i < this.numRows; i++) {
            for (int i2 = 0; i2 < this.numColumns; i2++) {
                if (this.matrix[i][i2] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Vector leftMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    public Matrix rightMultiply(Matrix matrix2) {
        throw new RuntimeException("Not implemented.");
    }

    public Matrix rightMultiply(Permutation permutation) {
        throw new RuntimeException("Not implemented.");
    }

    public Vector rightMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    public String toString() {
        String str = this.numRows + " x " + this.numColumns + " Matrix over " + this.field.toString() + ": \n";
        for (int i = 0; i < this.numRows; i++) {
            String str2 = str;
            for (int i2 = 0; i2 < this.numColumns; i2++) {
                str2 = str2 + this.field.elementToStr(this.matrix[i][i2]) + " : ";
            }
            str = str2 + "\n";
        }
        return str;
    }
}
