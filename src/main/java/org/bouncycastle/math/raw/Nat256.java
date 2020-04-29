package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = 0 + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L);
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = 0 + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L) + (((long) iArr3[i3 + 0]) & 4294967295L);
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L) + (((long) iArr3[i3 + 1]) & 4294967295L);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L) + (((long) iArr3[i3 + 2]) & 4294967295L);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L) + (((long) iArr3[i3 + 3]) & 4294967295L);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L) + (((long) iArr3[i3 + 4]) & 4294967295L);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L) + (((long) iArr3[i3 + 5]) & 4294967295L);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L) + (((long) iArr3[i3 + 6]) & 4294967295L);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L) + (((long) iArr3[i3 + 7]) & 4294967295L);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L);
        iArr2[i2 + 0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L);
        iArr2[i2 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L);
        iArr2[i2 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L);
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = 0 + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L);
        iArr[i + 0] = (int) j;
        iArr2[i2 + 0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L);
        iArr[i + 1] = (int) j2;
        iArr2[i2 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L);
        iArr[i + 2] = (int) j3;
        iArr2[i2 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L);
        iArr[i + 3] = (int) j4;
        iArr2[i2 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L);
        iArr[i + 4] = (int) j5;
        iArr2[i2 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L);
        iArr[i + 5] = (int) j6;
        iArr2[i2 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L);
        iArr[i + 6] = (int) j7;
        iArr2[i2 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L);
        iArr[i + 7] = (int) j8;
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            sub(iArr2, i2, iArr, i, iArr3, i3);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i) {
        if (i == 0) {
            return iArr[0] & 1;
        }
        if ((i & 255) != i) {
            return 0;
        }
        return (iArr[i >>> 5] >>> (i & 31)) & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = iArr2[i2 + i3] ^ Integer.MIN_VALUE;
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = iArr2[i] ^ Integer.MIN_VALUE;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = 4294967295L & ((long) iArr2[i2 + 0]);
        long j2 = 4294967295L & ((long) iArr2[i2 + 1]);
        long j3 = 4294967295L & ((long) iArr2[i2 + 2]);
        long j4 = 4294967295L & ((long) iArr2[i2 + 3]);
        long j5 = 4294967295L & ((long) iArr2[i2 + 4]);
        long j6 = 4294967295L & ((long) iArr2[i2 + 5]);
        long j7 = 4294967295L & ((long) iArr2[i2 + 6]);
        long j8 = 4294967295L & ((long) iArr2[i2 + 7]);
        long j9 = ((long) iArr[i + 0]) & 4294967295L;
        long j10 = 0 + (j9 * j);
        iArr3[i3 + 0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[i3 + 7] = (int) j17;
        iArr3[i3 + 8] = (int) (j17 >>> 32);
        for (int i4 = 1; i4 < 8; i4++) {
            i3++;
            long j18 = ((long) iArr[i + i4]) & 4294967295L;
            long j19 = 0 + (j18 * j) + (((long) iArr3[i3 + 0]) & 4294967295L);
            iArr3[i3 + 0] = (int) j19;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i3 + 1]) & 4294967295L);
            iArr3[i3 + 1] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr3[i3 + 2]) & 4294967295L);
            iArr3[i3 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr3[i3 + 3]) & 4294967295L);
            iArr3[i3 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr3[i3 + 4]) & 4294967295L);
            iArr3[i3 + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr3[i3 + 5]) & 4294967295L);
            iArr3[i3 + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr3[i3 + 6]) & 4294967295L);
            iArr3[i3 + 6] = (int) j25;
            long j26 = (j25 >>> 32) + (j18 * j8) + (((long) iArr3[i3 + 7]) & 4294967295L);
            iArr3[i3 + 7] = (int) j26;
            iArr3[i3 + 8] = (int) (j26 >>> 32);
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L & ((long) iArr2[0]);
        long j2 = 4294967295L & ((long) iArr2[1]);
        long j3 = 4294967295L & ((long) iArr2[2]);
        long j4 = 4294967295L & ((long) iArr2[3]);
        long j5 = 4294967295L & ((long) iArr2[4]);
        long j6 = 4294967295L & ((long) iArr2[5]);
        long j7 = 4294967295L & ((long) iArr2[6]);
        long j8 = 4294967295L & ((long) iArr2[7]);
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = 0 + (j9 * j);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        for (int i = 1; i < 8; i++) {
            long j18 = ((long) iArr[i]) & 4294967295L;
            long j19 = 0 + (j18 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j19;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr3[i + 4]) & 4294967295L);
            iArr3[i + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr3[i + 5]) & 4294967295L);
            iArr3[i + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr3[i + 6]) & 4294967295L);
            iArr3[i + 6] = (int) j25;
            long j26 = (j25 >>> 32) + (j18 * j8) + (((long) iArr3[i + 7]) & 4294967295L);
            iArr3[i + 7] = (int) j26;
            iArr3[i + 8] = (int) (j26 >>> 32);
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2 + 0]) & 4294967295L;
        long j3 = 0 + (j * j2) + (((long) iArr2[i3 + 0]) & 4294967295L);
        iArr3[i4 + 0] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j3 >>> 32) + j2 + (j * j4) + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j7 = (j5 >>> 32) + j4 + (j * j6) + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j9 = (j7 >>> 32) + j6 + (j * j8) + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j9;
        long j10 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j11 = (j9 >>> 32) + j8 + (j * j10) + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j11;
        long j12 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j13 = (j11 >>> 32) + j10 + (j * j12) + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j13;
        long j14 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j15 = (j13 >>> 32) + j12 + (j * j14) + (((long) iArr2[i3 + 6]) & 4294967295L);
        iArr3[i4 + 6] = (int) j15;
        long j16 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j17 = (j15 >>> 32) + (j * j16) + j14 + (((long) iArr2[i3 + 7]) & 4294967295L);
        iArr3[i4 + 7] = (int) j17;
        return (j17 >>> 32) + j16;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = 4294967295L & j;
        long j4 = 0 + (j2 * j3) + (((long) iArr[i2 + 0]) & 4294967295L);
        iArr[i2 + 0] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr[i2 + 1]) & 4294967295L);
        iArr[i2 + 1] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i2 + 2]) & 4294967295L) + j5;
        iArr[i2 + 2] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i2 + 3]) & 4294967295L);
        iArr[i2 + 3] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i2) & 4294967295L;
        long j2 = ((((long) i) & 4294967295L) * j) + (((long) iArr[i3 + 0]) & 4294967295L) + 0;
        iArr[i3 + 0] = (int) j2;
        long j3 = (j2 >>> 32) + j + (((long) iArr[i3 + 1]) & 4294967295L);
        iArr[i3 + 1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i3 + 2]) & 4294967295L);
        iArr[i3 + 2] = (int) j4;
        if ((j4 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j9 = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            long j10 = ((long) iArr[i + i4]) & 4294967295L;
            long j11 = 0 + (j10 * j) + (((long) iArr3[i3 + 0]) & 4294967295L);
            iArr3[i3 + 0] = (int) j11;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i3 + 1]) & 4294967295L);
            iArr3[i3 + 1] = (int) j12;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i3 + 2]) & 4294967295L);
            iArr3[i3 + 2] = (int) j13;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i3 + 3]) & 4294967295L);
            iArr3[i3 + 3] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i3 + 4]) & 4294967295L);
            iArr3[i3 + 4] = (int) j15;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i3 + 5]) & 4294967295L);
            iArr3[i3 + 5] = (int) j16;
            long j17 = (j16 >>> 32) + (j10 * j7) + (((long) iArr3[i3 + 6]) & 4294967295L);
            iArr3[i3 + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (j10 * j8) + (((long) iArr3[i3 + 7]) & 4294967295L);
            iArr3[i3 + 7] = (int) j18;
            long j19 = j9 + (((long) iArr3[i3 + 8]) & 4294967295L) + (j18 >>> 32);
            iArr3[i3 + 8] = (int) j19;
            j9 = j19 >>> 32;
            i3++;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        for (int i = 0; i < 8; i++) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = 0 + (j10 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j11;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j12;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j13;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i + 4]) & 4294967295L);
            iArr3[i + 4] = (int) j15;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i + 5]) & 4294967295L);
            iArr3[i + 5] = (int) j16;
            long j17 = (j16 >>> 32) + (j10 * j7) + (((long) iArr3[i + 6]) & 4294967295L);
            iArr3[i + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (j10 * j8) + (((long) iArr3[i + 7]) & 4294967295L);
            iArr3[i + 7] = (int) j18;
            long j19 = j9 + (((long) iArr3[i + 8]) & 4294967295L) + (j18 >>> 32);
            iArr3[i + 8] = (int) j19;
            j9 = j19 >>> 32;
        }
        return (int) j9;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = ((long) i) & 4294967295L;
        long j2 = 0 + ((((long) iArr[0]) & 4294967295L) * j);
        iArr[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr[1]) & 4294967295L) * j);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr[2]) & 4294967295L) * j);
        iArr[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr[3]) & 4294967295L) * j);
        iArr[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr[4]) & 4294967295L) * j);
        iArr[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr[5]) & 4294967295L) * j);
        iArr[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr[6]) & 4294967295L) * j);
        iArr[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr[7]) & 4294967295L));
        iArr[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & 4294967295L;
        long j2 = 0 + ((((long) iArr2[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr2[7]) & 4294967295L)) + (((long) iArr[7]) & 4294967295L);
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        long j2 = ((long) i) & 4294967295L;
        int i3 = 0;
        do {
            long j3 = j + ((((long) iArr[i3]) & 4294967295L) * j2);
            iArr2[i2 + i3] = (int) j3;
            j = j3 >>> 32;
            i3++;
        } while (i3 < 8);
        return (int) j;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & 4294967295L;
        long j2 = 0 + ((((long) iArr[i2 + 0]) & 4294967295L) * j) + (((long) iArr2[i3 + 0]) & 4294967295L);
        iArr2[i3 + 0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & 4294967295L) * j) + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr2[i3 + 1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & 4294967295L) * j) + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr2[i3 + 2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & 4294967295L) * j) + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr2[i3 + 3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr[i2 + 4]) & 4294967295L) * j) + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr2[i3 + 4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr[i2 + 5]) & 4294967295L) * j) + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr2[i3 + 5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr[i2 + 6]) & 4294967295L) * j) + (((long) iArr2[i3 + 6]) & 4294967295L);
        iArr2[i3 + 6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr[i2 + 7]) & 4294967295L)) + (((long) iArr2[i3 + 7]) & 4294967295L);
        iArr2[i3 + 7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = 0 + ((4294967295L & j) * j2) + (((long) iArr[i2 + 0]) & 4294967295L);
        iArr[i2 + 0] = (int) j3;
        long j4 = (j3 >>> 32) + (j2 * (j >>> 32)) + (((long) iArr[i2 + 1]) & 4294967295L);
        iArr[i2 + 1] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i2 + 2]) & 4294967295L);
        iArr[i2 + 2] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 7;
        int i4 = 16;
        int i5 = 0;
        while (true) {
            int i6 = i3 - 1;
            long j2 = ((long) iArr[i3 + i]) & 4294967295L;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i5 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i5 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2 + 0] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & 4294967295L;
                long j6 = ((((long) (i5 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i8 = (int) j6;
                iArr2[i2 + 1] = (((int) (j4 >>> 32)) & 1) | (i8 << 1);
                int i9 = i8 >>> 31;
                long j7 = (j6 >>> 32) + (((long) iArr2[i2 + 2]) & 4294967295L);
                long j8 = ((long) iArr[i + 2]) & 4294967295L;
                long j9 = j7 + (j8 * j);
                int i10 = (int) j9;
                iArr2[i2 + 2] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long j10 = (j9 >>> 32) + (j8 * j5) + (((long) iArr2[i2 + 3]) & 4294967295L);
                long j11 = (j10 >>> 32) + (((long) iArr2[i2 + 4]) & 4294967295L);
                long j12 = ((long) iArr[i + 3]) & 4294967295L;
                long j13 = (((long) iArr2[i2 + 5]) & 4294967295L) + (j11 >>> 32);
                long j14 = (((long) iArr2[i2 + 6]) & 4294967295L) + (j13 >>> 32);
                long j15 = (j10 & 4294967295L) + (j12 * j);
                int i12 = (int) j15;
                iArr2[i2 + 3] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j16 = (j15 >>> 32) + (j12 * j5) + (j11 & 4294967295L);
                long j17 = (j16 >>> 32) + (j12 * j8) + (j13 & 4294967295L);
                long j18 = (j17 >>> 32) + j14;
                long j19 = ((long) iArr[i + 4]) & 4294967295L;
                long j20 = (((long) iArr2[i2 + 7]) & 4294967295L) + (j18 >>> 32);
                long j21 = (((long) iArr2[i2 + 8]) & 4294967295L) + (j20 >>> 32);
                long j22 = (j16 & 4294967295L) + (j19 * j);
                int i14 = (int) j22;
                iArr2[i2 + 4] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long j23 = (j22 >>> 32) + (j19 * j5) + (j17 & 4294967295L);
                long j24 = (j23 >>> 32) + (j19 * j8) + (j18 & 4294967295L);
                long j25 = (j24 >>> 32) + (j19 * j12) + (j20 & 4294967295L);
                long j26 = (j25 >>> 32) + j21;
                long j27 = ((long) iArr[i + 5]) & 4294967295L;
                long j28 = (((long) iArr2[i2 + 9]) & 4294967295L) + (j26 >>> 32);
                long j29 = (((long) iArr2[i2 + 10]) & 4294967295L) + (j28 >>> 32);
                long j30 = (j23 & 4294967295L) + (j27 * j);
                int i16 = (int) j30;
                iArr2[i2 + 5] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long j31 = (j30 >>> 32) + (j27 * j5) + (j24 & 4294967295L);
                long j32 = (j31 >>> 32) + (j27 * j8) + (j25 & 4294967295L);
                long j33 = (j32 >>> 32) + (j27 * j12) + (j26 & 4294967295L);
                long j34 = (j33 >>> 32) + (j27 * j19) + (j28 & 4294967295L);
                long j35 = (j34 >>> 32) + j29;
                long j36 = ((long) iArr[i + 6]) & 4294967295L;
                long j37 = (((long) iArr2[i2 + 11]) & 4294967295L) + (j35 >>> 32);
                long j38 = (((long) iArr2[i2 + 12]) & 4294967295L) + (j37 >>> 32);
                long j39 = (j31 & 4294967295L) + (j36 * j);
                int i18 = (int) j39;
                iArr2[i2 + 6] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                long j40 = (j39 >>> 32) + (j36 * j5) + (j32 & 4294967295L);
                long j41 = (j40 >>> 32) + (j36 * j8) + (j33 & 4294967295L);
                long j42 = (j41 >>> 32) + (j36 * j12) + (j34 & 4294967295L);
                long j43 = (j42 >>> 32) + (j36 * j19) + (j35 & 4294967295L);
                long j44 = (j43 >>> 32) + (j36 * j27) + (j37 & 4294967295L);
                long j45 = (j44 >>> 32) + j38;
                long j46 = ((long) iArr[i + 7]) & 4294967295L;
                long j47 = (((long) iArr2[i2 + 13]) & 4294967295L) + (j45 >>> 32);
                long j48 = (j40 & 4294967295L) + (j * j46);
                int i20 = (int) j48;
                iArr2[i2 + 7] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                long j49 = (j48 >>> 32) + (j46 * j5) + (j41 & 4294967295L);
                long j50 = (j49 >>> 32) + (j46 * j8) + (j42 & 4294967295L);
                long j51 = (j50 >>> 32) + (j46 * j12) + (j43 & 4294967295L);
                long j52 = (j51 >>> 32) + (j46 * j19) + (j44 & 4294967295L);
                long j53 = (j52 >>> 32) + (j46 * j27) + (j45 & 4294967295L);
                long j54 = (j53 >>> 32) + (j46 * j36) + (j47 & 4294967295L);
                long j55 = (j54 >>> 32) + (((long) iArr2[i2 + 14]) & 4294967295L) + (j47 >>> 32);
                int i22 = (int) j49;
                iArr2[i2 + 8] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j50;
                iArr2[i2 + 9] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j51;
                iArr2[i2 + 10] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j52;
                iArr2[i2 + 11] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j53;
                iArr2[i2 + 12] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j54;
                iArr2[i2 + 13] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j55;
                iArr2[i2 + 14] = i33 | (i34 << 1);
                iArr2[i2 + 15] = (i34 >>> 31) | ((iArr2[i2 + 15] + ((int) (j55 >>> 32))) << 1);
                return;
            }
            i3 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j2 = ((long) iArr[i]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i2 - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i5 - 1;
            iArr2[i2] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & 4294967295L;
                long j6 = ((((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i6 = (int) j6;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                int i7 = i6 >>> 31;
                long j7 = (j6 >>> 32) + (((long) iArr2[2]) & 4294967295L);
                long j8 = ((long) iArr[2]) & 4294967295L;
                long j9 = j7 + (j8 * j);
                int i8 = (int) j9;
                iArr2[2] = i7 | (i8 << 1);
                int i9 = i8 >>> 31;
                long j10 = (j9 >>> 32) + (j8 * j5) + (((long) iArr2[3]) & 4294967295L);
                long j11 = (j10 >>> 32) + (((long) iArr2[4]) & 4294967295L);
                long j12 = ((long) iArr[3]) & 4294967295L;
                long j13 = (((long) iArr2[5]) & 4294967295L) + (j11 >>> 32);
                long j14 = (((long) iArr2[6]) & 4294967295L) + (j13 >>> 32);
                long j15 = (j10 & 4294967295L) + (j12 * j);
                int i10 = (int) j15;
                iArr2[3] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long j16 = (j15 >>> 32) + (j12 * j5) + (j11 & 4294967295L);
                long j17 = (j16 >>> 32) + (j12 * j8) + (j13 & 4294967295L);
                long j18 = (j17 >>> 32) + j14;
                long j19 = ((long) iArr[4]) & 4294967295L;
                long j20 = (((long) iArr2[7]) & 4294967295L) + (j18 >>> 32);
                long j21 = (((long) iArr2[8]) & 4294967295L) + (j20 >>> 32);
                long j22 = (j16 & 4294967295L) + (j19 * j);
                int i12 = (int) j22;
                iArr2[4] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j23 = (j22 >>> 32) + (j19 * j5) + (j17 & 4294967295L);
                long j24 = (j23 >>> 32) + (j19 * j8) + (j18 & 4294967295L);
                long j25 = (j24 >>> 32) + (j19 * j12) + (j20 & 4294967295L);
                long j26 = (j25 >>> 32) + j21;
                long j27 = ((long) iArr[5]) & 4294967295L;
                long j28 = (((long) iArr2[9]) & 4294967295L) + (j26 >>> 32);
                long j29 = (((long) iArr2[10]) & 4294967295L) + (j28 >>> 32);
                long j30 = (j23 & 4294967295L) + (j27 * j);
                int i14 = (int) j30;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long j31 = (j30 >>> 32) + (j27 * j5) + (j24 & 4294967295L);
                long j32 = (j31 >>> 32) + (j27 * j8) + (j25 & 4294967295L);
                long j33 = (j32 >>> 32) + (j27 * j12) + (j26 & 4294967295L);
                long j34 = (j33 >>> 32) + (j27 * j19) + (j28 & 4294967295L);
                long j35 = (j34 >>> 32) + j29;
                long j36 = ((long) iArr[6]) & 4294967295L;
                long j37 = (((long) iArr2[11]) & 4294967295L) + (j35 >>> 32);
                long j38 = (((long) iArr2[12]) & 4294967295L) + (j37 >>> 32);
                long j39 = (j31 & 4294967295L) + (j36 * j);
                int i16 = (int) j39;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long j40 = (j39 >>> 32) + (j36 * j5) + (j32 & 4294967295L);
                long j41 = (j40 >>> 32) + (j36 * j8) + (j33 & 4294967295L);
                long j42 = (j41 >>> 32) + (j36 * j12) + (j34 & 4294967295L);
                long j43 = (j42 >>> 32) + (j36 * j19) + (j35 & 4294967295L);
                long j44 = (j43 >>> 32) + (j36 * j27) + (j37 & 4294967295L);
                long j45 = (j44 >>> 32) + j38;
                long j46 = ((long) iArr[7]) & 4294967295L;
                long j47 = (((long) iArr2[13]) & 4294967295L) + (j45 >>> 32);
                long j48 = (j40 & 4294967295L) + (j * j46);
                int i18 = (int) j48;
                iArr2[7] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                long j49 = (j48 >>> 32) + (j46 * j5) + (j41 & 4294967295L);
                long j50 = (j49 >>> 32) + (j46 * j8) + (j42 & 4294967295L);
                long j51 = (j50 >>> 32) + (j46 * j12) + (j43 & 4294967295L);
                long j52 = (j51 >>> 32) + (j46 * j19) + (j44 & 4294967295L);
                long j53 = (j52 >>> 32) + (j46 * j27) + (j45 & 4294967295L);
                long j54 = (j53 >>> 32) + (j46 * j36) + (j47 & 4294967295L);
                long j55 = (j54 >>> 32) + (((long) iArr2[14]) & 4294967295L) + (j47 >>> 32);
                int i20 = (int) j49;
                iArr2[8] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j50;
                iArr2[9] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j51;
                iArr2[10] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j52;
                iArr2[11] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j53;
                iArr2[12] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j54;
                iArr2[13] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j55;
                iArr2[14] = i31 | (i32 << 1);
                iArr2[15] = (i32 >>> 31) | ((iArr2[15] + ((int) (j55 >>> 32))) << 1);
                return;
            }
            i = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = 0 + ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L));
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L));
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((((long) iArr3[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) - (((long) iArr2[0]) & 4294967295L));
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((((long) iArr3[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + (((((long) iArr3[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + (((((long) iArr3[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L)) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = 0 + ((((long) iArr2[i2 + 0]) & 4294967295L) - (((long) iArr[i + 0]) & 4294967295L));
        iArr2[i2 + 0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[i2 + 1]) & 4294967295L) - (((long) iArr[i + 1]) & 4294967295L));
        iArr2[i2 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i2 + 2]) & 4294967295L) - (((long) iArr[i + 2]) & 4294967295L));
        iArr2[i2 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i2 + 3]) & 4294967295L) - (((long) iArr[i + 3]) & 4294967295L));
        iArr2[i2 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i2 + 4]) & 4294967295L) - (((long) iArr[i + 4]) & 4294967295L));
        iArr2[i2 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[i2 + 5]) & 4294967295L) - (((long) iArr[i + 5]) & 4294967295L));
        iArr2[i2 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[i2 + 6]) & 4294967295L) - (((long) iArr[i + 6]) & 4294967295L));
        iArr2[i2 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[i2 + 7]) & 4294967295L) - (((long) iArr[i + 7]) & 4294967295L));
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = 0 + ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L));
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }
}
