package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

public final class SerpentEngine extends SerpentEngineBase {
    /* JADX WARN: Type inference failed for: r4v0, types: [org.bouncycastle.crypto.engines.SerpentEngine], assign insn: null */
    /* access modifiers changed from: protected */
    public void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.X0 = this.wKey[128] ^ Pack.littleEndianToInt(bArr, i);
        this.X1 = this.wKey[129] ^ Pack.littleEndianToInt(bArr, i + 4);
        this.X2 = this.wKey[130] ^ Pack.littleEndianToInt(bArr, i + 8);
        this.X3 = this.wKey[131] ^ Pack.littleEndianToInt(bArr, i + 12);
        ib7(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[124];
        this.X1 ^= this.wKey[125];
        this.X2 ^= this.wKey[126];
        this.X3 ^= this.wKey[127];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[120];
        this.X1 ^= this.wKey[121];
        this.X2 ^= this.wKey[122];
        this.X3 ^= this.wKey[123];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[116];
        this.X1 ^= this.wKey[117];
        this.X2 ^= this.wKey[118];
        this.X3 ^= this.wKey[119];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[112];
        this.X1 ^= this.wKey[113];
        this.X2 ^= this.wKey[114];
        this.X3 ^= this.wKey[115];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[108];
        this.X1 ^= this.wKey[109];
        this.X2 ^= this.wKey[110];
        this.X3 ^= this.wKey[111];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[104];
        this.X1 ^= this.wKey[105];
        this.X2 ^= this.wKey[106];
        this.X3 ^= this.wKey[107];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[100];
        this.X1 ^= this.wKey[101];
        this.X2 ^= this.wKey[102];
        this.X3 ^= this.wKey[103];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[96];
        this.X1 ^= this.wKey[97];
        this.X2 ^= this.wKey[98];
        this.X3 ^= this.wKey[99];
        inverseLT();
        ib7(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[92];
        this.X1 ^= this.wKey[93];
        this.X2 ^= this.wKey[94];
        this.X3 ^= this.wKey[95];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[88];
        this.X1 ^= this.wKey[89];
        this.X2 ^= this.wKey[90];
        this.X3 ^= this.wKey[91];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[84];
        this.X1 ^= this.wKey[85];
        this.X2 ^= this.wKey[86];
        this.X3 ^= this.wKey[87];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[80];
        this.X1 ^= this.wKey[81];
        this.X2 ^= this.wKey[82];
        this.X3 ^= this.wKey[83];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[76];
        this.X1 ^= this.wKey[77];
        this.X2 ^= this.wKey[78];
        this.X3 ^= this.wKey[79];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[72];
        this.X1 ^= this.wKey[73];
        this.X2 ^= this.wKey[74];
        this.X3 ^= this.wKey[75];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[68];
        this.X1 ^= this.wKey[69];
        this.X2 ^= this.wKey[70];
        this.X3 ^= this.wKey[71];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[64];
        this.X1 ^= this.wKey[65];
        this.X2 ^= this.wKey[66];
        this.X3 ^= this.wKey[67];
        inverseLT();
        ib7(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[60];
        this.X1 ^= this.wKey[61];
        this.X2 ^= this.wKey[62];
        this.X3 ^= this.wKey[63];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[56];
        this.X1 ^= this.wKey[57];
        this.X2 ^= this.wKey[58];
        this.X3 ^= this.wKey[59];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[52];
        this.X1 ^= this.wKey[53];
        this.X2 ^= this.wKey[54];
        this.X3 ^= this.wKey[55];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[48];
        this.X1 ^= this.wKey[49];
        this.X2 ^= this.wKey[50];
        this.X3 ^= this.wKey[51];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[44];
        this.X1 ^= this.wKey[45];
        this.X2 ^= this.wKey[46];
        this.X3 ^= this.wKey[47];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[40];
        this.X1 ^= this.wKey[41];
        this.X2 ^= this.wKey[42];
        this.X3 ^= this.wKey[43];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[36];
        this.X1 ^= this.wKey[37];
        this.X2 ^= this.wKey[38];
        this.X3 ^= this.wKey[39];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[32];
        this.X1 ^= this.wKey[33];
        this.X2 ^= this.wKey[34];
        this.X3 ^= this.wKey[35];
        inverseLT();
        ib7(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[28];
        this.X1 ^= this.wKey[29];
        this.X2 ^= this.wKey[30];
        this.X3 ^= this.wKey[31];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[24];
        this.X1 ^= this.wKey[25];
        this.X2 ^= this.wKey[26];
        this.X3 ^= this.wKey[27];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[20];
        this.X1 ^= this.wKey[21];
        this.X2 ^= this.wKey[22];
        this.X3 ^= this.wKey[23];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[16];
        this.X1 ^= this.wKey[17];
        this.X2 ^= this.wKey[18];
        this.X3 ^= this.wKey[19];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[12];
        this.X1 ^= this.wKey[13];
        this.X2 ^= this.wKey[14];
        this.X3 ^= this.wKey[15];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[8];
        this.X1 ^= this.wKey[9];
        this.X2 ^= this.wKey[10];
        this.X3 ^= this.wKey[11];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        this.X0 ^= this.wKey[4];
        this.X1 ^= this.wKey[5];
        this.X2 ^= this.wKey[6];
        this.X3 ^= this.wKey[7];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        Pack.intToLittleEndian(this.X0 ^ this.wKey[0], bArr2, i2);
        Pack.intToLittleEndian(this.X1 ^ this.wKey[1], bArr2, i2 + 4);
        Pack.intToLittleEndian(this.X2 ^ this.wKey[2], bArr2, i2 + 8);
        Pack.intToLittleEndian(this.X3 ^ this.wKey[3], bArr2, i2 + 12);
    }

    /* access modifiers changed from: protected */
    public void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.X0 = Pack.littleEndianToInt(bArr, i);
        this.X1 = Pack.littleEndianToInt(bArr, i + 4);
        this.X2 = Pack.littleEndianToInt(bArr, i + 8);
        this.X3 = Pack.littleEndianToInt(bArr, i + 12);
        sb0(this.wKey[0] ^ this.X0, this.wKey[1] ^ this.X1, this.wKey[2] ^ this.X2, this.wKey[3] ^ this.X3);
        LT();
        sb1(this.wKey[4] ^ this.X0, this.wKey[5] ^ this.X1, this.wKey[6] ^ this.X2, this.wKey[7] ^ this.X3);
        LT();
        sb2(this.wKey[8] ^ this.X0, this.wKey[9] ^ this.X1, this.wKey[10] ^ this.X2, this.wKey[11] ^ this.X3);
        LT();
        sb3(this.wKey[12] ^ this.X0, this.wKey[13] ^ this.X1, this.wKey[14] ^ this.X2, this.wKey[15] ^ this.X3);
        LT();
        sb4(this.wKey[16] ^ this.X0, this.wKey[17] ^ this.X1, this.wKey[18] ^ this.X2, this.wKey[19] ^ this.X3);
        LT();
        sb5(this.wKey[20] ^ this.X0, this.wKey[21] ^ this.X1, this.wKey[22] ^ this.X2, this.wKey[23] ^ this.X3);
        LT();
        sb6(this.wKey[24] ^ this.X0, this.wKey[25] ^ this.X1, this.wKey[26] ^ this.X2, this.wKey[27] ^ this.X3);
        LT();
        sb7(this.wKey[28] ^ this.X0, this.wKey[29] ^ this.X1, this.wKey[30] ^ this.X2, this.wKey[31] ^ this.X3);
        LT();
        sb0(this.wKey[32] ^ this.X0, this.wKey[33] ^ this.X1, this.wKey[34] ^ this.X2, this.wKey[35] ^ this.X3);
        LT();
        sb1(this.wKey[36] ^ this.X0, this.wKey[37] ^ this.X1, this.wKey[38] ^ this.X2, this.wKey[39] ^ this.X3);
        LT();
        sb2(this.wKey[40] ^ this.X0, this.wKey[41] ^ this.X1, this.wKey[42] ^ this.X2, this.wKey[43] ^ this.X3);
        LT();
        sb3(this.wKey[44] ^ this.X0, this.wKey[45] ^ this.X1, this.wKey[46] ^ this.X2, this.wKey[47] ^ this.X3);
        LT();
        sb4(this.wKey[48] ^ this.X0, this.wKey[49] ^ this.X1, this.wKey[50] ^ this.X2, this.wKey[51] ^ this.X3);
        LT();
        sb5(this.wKey[52] ^ this.X0, this.wKey[53] ^ this.X1, this.wKey[54] ^ this.X2, this.wKey[55] ^ this.X3);
        LT();
        sb6(this.wKey[56] ^ this.X0, this.wKey[57] ^ this.X1, this.wKey[58] ^ this.X2, this.wKey[59] ^ this.X3);
        LT();
        sb7(this.wKey[60] ^ this.X0, this.wKey[61] ^ this.X1, this.wKey[62] ^ this.X2, this.wKey[63] ^ this.X3);
        LT();
        sb0(this.wKey[64] ^ this.X0, this.wKey[65] ^ this.X1, this.wKey[66] ^ this.X2, this.wKey[67] ^ this.X3);
        LT();
        sb1(this.wKey[68] ^ this.X0, this.wKey[69] ^ this.X1, this.wKey[70] ^ this.X2, this.wKey[71] ^ this.X3);
        LT();
        sb2(this.wKey[72] ^ this.X0, this.wKey[73] ^ this.X1, this.wKey[74] ^ this.X2, this.wKey[75] ^ this.X3);
        LT();
        sb3(this.wKey[76] ^ this.X0, this.wKey[77] ^ this.X1, this.wKey[78] ^ this.X2, this.wKey[79] ^ this.X3);
        LT();
        sb4(this.wKey[80] ^ this.X0, this.wKey[81] ^ this.X1, this.wKey[82] ^ this.X2, this.wKey[83] ^ this.X3);
        LT();
        sb5(this.wKey[84] ^ this.X0, this.wKey[85] ^ this.X1, this.wKey[86] ^ this.X2, this.wKey[87] ^ this.X3);
        LT();
        sb6(this.wKey[88] ^ this.X0, this.wKey[89] ^ this.X1, this.wKey[90] ^ this.X2, this.wKey[91] ^ this.X3);
        LT();
        sb7(this.wKey[92] ^ this.X0, this.wKey[93] ^ this.X1, this.wKey[94] ^ this.X2, this.wKey[95] ^ this.X3);
        LT();
        sb0(this.wKey[96] ^ this.X0, this.wKey[97] ^ this.X1, this.wKey[98] ^ this.X2, this.wKey[99] ^ this.X3);
        LT();
        sb1(this.wKey[100] ^ this.X0, this.wKey[101] ^ this.X1, this.wKey[102] ^ this.X2, this.wKey[103] ^ this.X3);
        LT();
        sb2(this.wKey[104] ^ this.X0, this.wKey[105] ^ this.X1, this.wKey[106] ^ this.X2, this.wKey[107] ^ this.X3);
        LT();
        sb3(this.wKey[108] ^ this.X0, this.wKey[109] ^ this.X1, this.wKey[110] ^ this.X2, this.wKey[111] ^ this.X3);
        LT();
        sb4(this.wKey[112] ^ this.X0, this.wKey[113] ^ this.X1, this.wKey[114] ^ this.X2, this.wKey[115] ^ this.X3);
        LT();
        sb5(this.wKey[116] ^ this.X0, this.wKey[117] ^ this.X1, this.wKey[118] ^ this.X2, this.wKey[119] ^ this.X3);
        LT();
        sb6(this.wKey[120] ^ this.X0, this.wKey[121] ^ this.X1, this.wKey[122] ^ this.X2, this.wKey[123] ^ this.X3);
        LT();
        sb7(this.wKey[124] ^ this.X0, this.wKey[125] ^ this.X1, this.wKey[126] ^ this.X2, this.wKey[127] ^ this.X3);
        Pack.intToLittleEndian(this.wKey[128] ^ this.X0, bArr2, i2);
        Pack.intToLittleEndian(this.wKey[129] ^ this.X1, bArr2, i2 + 4);
        Pack.intToLittleEndian(this.wKey[130] ^ this.X2, bArr2, i2 + 8);
        Pack.intToLittleEndian(this.wKey[131] ^ this.X3, bArr2, i2 + 12);
    }

    /* access modifiers changed from: protected */
    public int[] makeWorkingKey(byte[] bArr) throws IllegalArgumentException {
        int[] iArr = new int[16];
        int i = 0;
        int i2 = 0;
        while (i2 + 4 < bArr.length) {
            iArr[i] = Pack.littleEndianToInt(bArr, i2);
            i2 += 4;
            i++;
        }
        if (i2 % 4 == 0) {
            int i3 = i + 1;
            iArr[i] = Pack.littleEndianToInt(bArr, i2);
            if (i3 < 8) {
                iArr[i3] = 1;
            }
            int[] iArr2 = new int[132];
            for (int i4 = 8; i4 < 16; i4++) {
                iArr[i4] = rotateLeft(((((iArr[i4 - 8] ^ iArr[i4 - 5]) ^ iArr[i4 - 3]) ^ iArr[i4 - 1]) ^ -1640531527) ^ (i4 - 8), 11);
            }
            System.arraycopy(iArr, 8, iArr2, 0, 8);
            for (int i5 = 8; i5 < 132; i5++) {
                iArr2[i5] = rotateLeft(((((iArr2[i5 - 8] ^ iArr2[i5 - 5]) ^ iArr2[i5 - 3]) ^ iArr2[i5 - 1]) ^ -1640531527) ^ i5, 11);
            }
            sb3(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            iArr2[0] = this.X0;
            iArr2[1] = this.X1;
            iArr2[2] = this.X2;
            iArr2[3] = this.X3;
            sb2(iArr2[4], iArr2[5], iArr2[6], iArr2[7]);
            iArr2[4] = this.X0;
            iArr2[5] = this.X1;
            iArr2[6] = this.X2;
            iArr2[7] = this.X3;
            sb1(iArr2[8], iArr2[9], iArr2[10], iArr2[11]);
            iArr2[8] = this.X0;
            iArr2[9] = this.X1;
            iArr2[10] = this.X2;
            iArr2[11] = this.X3;
            sb0(iArr2[12], iArr2[13], iArr2[14], iArr2[15]);
            iArr2[12] = this.X0;
            iArr2[13] = this.X1;
            iArr2[14] = this.X2;
            iArr2[15] = this.X3;
            sb7(iArr2[16], iArr2[17], iArr2[18], iArr2[19]);
            iArr2[16] = this.X0;
            iArr2[17] = this.X1;
            iArr2[18] = this.X2;
            iArr2[19] = this.X3;
            sb6(iArr2[20], iArr2[21], iArr2[22], iArr2[23]);
            iArr2[20] = this.X0;
            iArr2[21] = this.X1;
            iArr2[22] = this.X2;
            iArr2[23] = this.X3;
            sb5(iArr2[24], iArr2[25], iArr2[26], iArr2[27]);
            iArr2[24] = this.X0;
            iArr2[25] = this.X1;
            iArr2[26] = this.X2;
            iArr2[27] = this.X3;
            sb4(iArr2[28], iArr2[29], iArr2[30], iArr2[31]);
            iArr2[28] = this.X0;
            iArr2[29] = this.X1;
            iArr2[30] = this.X2;
            iArr2[31] = this.X3;
            sb3(iArr2[32], iArr2[33], iArr2[34], iArr2[35]);
            iArr2[32] = this.X0;
            iArr2[33] = this.X1;
            iArr2[34] = this.X2;
            iArr2[35] = this.X3;
            sb2(iArr2[36], iArr2[37], iArr2[38], iArr2[39]);
            iArr2[36] = this.X0;
            iArr2[37] = this.X1;
            iArr2[38] = this.X2;
            iArr2[39] = this.X3;
            sb1(iArr2[40], iArr2[41], iArr2[42], iArr2[43]);
            iArr2[40] = this.X0;
            iArr2[41] = this.X1;
            iArr2[42] = this.X2;
            iArr2[43] = this.X3;
            sb0(iArr2[44], iArr2[45], iArr2[46], iArr2[47]);
            iArr2[44] = this.X0;
            iArr2[45] = this.X1;
            iArr2[46] = this.X2;
            iArr2[47] = this.X3;
            sb7(iArr2[48], iArr2[49], iArr2[50], iArr2[51]);
            iArr2[48] = this.X0;
            iArr2[49] = this.X1;
            iArr2[50] = this.X2;
            iArr2[51] = this.X3;
            sb6(iArr2[52], iArr2[53], iArr2[54], iArr2[55]);
            iArr2[52] = this.X0;
            iArr2[53] = this.X1;
            iArr2[54] = this.X2;
            iArr2[55] = this.X3;
            sb5(iArr2[56], iArr2[57], iArr2[58], iArr2[59]);
            iArr2[56] = this.X0;
            iArr2[57] = this.X1;
            iArr2[58] = this.X2;
            iArr2[59] = this.X3;
            sb4(iArr2[60], iArr2[61], iArr2[62], iArr2[63]);
            iArr2[60] = this.X0;
            iArr2[61] = this.X1;
            iArr2[62] = this.X2;
            iArr2[63] = this.X3;
            sb3(iArr2[64], iArr2[65], iArr2[66], iArr2[67]);
            iArr2[64] = this.X0;
            iArr2[65] = this.X1;
            iArr2[66] = this.X2;
            iArr2[67] = this.X3;
            sb2(iArr2[68], iArr2[69], iArr2[70], iArr2[71]);
            iArr2[68] = this.X0;
            iArr2[69] = this.X1;
            iArr2[70] = this.X2;
            iArr2[71] = this.X3;
            sb1(iArr2[72], iArr2[73], iArr2[74], iArr2[75]);
            iArr2[72] = this.X0;
            iArr2[73] = this.X1;
            iArr2[74] = this.X2;
            iArr2[75] = this.X3;
            sb0(iArr2[76], iArr2[77], iArr2[78], iArr2[79]);
            iArr2[76] = this.X0;
            iArr2[77] = this.X1;
            iArr2[78] = this.X2;
            iArr2[79] = this.X3;
            sb7(iArr2[80], iArr2[81], iArr2[82], iArr2[83]);
            iArr2[80] = this.X0;
            iArr2[81] = this.X1;
            iArr2[82] = this.X2;
            iArr2[83] = this.X3;
            sb6(iArr2[84], iArr2[85], iArr2[86], iArr2[87]);
            iArr2[84] = this.X0;
            iArr2[85] = this.X1;
            iArr2[86] = this.X2;
            iArr2[87] = this.X3;
            sb5(iArr2[88], iArr2[89], iArr2[90], iArr2[91]);
            iArr2[88] = this.X0;
            iArr2[89] = this.X1;
            iArr2[90] = this.X2;
            iArr2[91] = this.X3;
            sb4(iArr2[92], iArr2[93], iArr2[94], iArr2[95]);
            iArr2[92] = this.X0;
            iArr2[93] = this.X1;
            iArr2[94] = this.X2;
            iArr2[95] = this.X3;
            sb3(iArr2[96], iArr2[97], iArr2[98], iArr2[99]);
            iArr2[96] = this.X0;
            iArr2[97] = this.X1;
            iArr2[98] = this.X2;
            iArr2[99] = this.X3;
            sb2(iArr2[100], iArr2[101], iArr2[102], iArr2[103]);
            iArr2[100] = this.X0;
            iArr2[101] = this.X1;
            iArr2[102] = this.X2;
            iArr2[103] = this.X3;
            sb1(iArr2[104], iArr2[105], iArr2[106], iArr2[107]);
            iArr2[104] = this.X0;
            iArr2[105] = this.X1;
            iArr2[106] = this.X2;
            iArr2[107] = this.X3;
            sb0(iArr2[108], iArr2[109], iArr2[110], iArr2[111]);
            iArr2[108] = this.X0;
            iArr2[109] = this.X1;
            iArr2[110] = this.X2;
            iArr2[111] = this.X3;
            sb7(iArr2[112], iArr2[113], iArr2[114], iArr2[115]);
            iArr2[112] = this.X0;
            iArr2[113] = this.X1;
            iArr2[114] = this.X2;
            iArr2[115] = this.X3;
            sb6(iArr2[116], iArr2[117], iArr2[118], iArr2[119]);
            iArr2[116] = this.X0;
            iArr2[117] = this.X1;
            iArr2[118] = this.X2;
            iArr2[119] = this.X3;
            sb5(iArr2[120], iArr2[121], iArr2[122], iArr2[123]);
            iArr2[120] = this.X0;
            iArr2[121] = this.X1;
            iArr2[122] = this.X2;
            iArr2[123] = this.X3;
            sb4(iArr2[124], iArr2[125], iArr2[126], iArr2[127]);
            iArr2[124] = this.X0;
            iArr2[125] = this.X1;
            iArr2[126] = this.X2;
            iArr2[127] = this.X3;
            sb3(iArr2[128], iArr2[129], iArr2[130], iArr2[131]);
            iArr2[128] = this.X0;
            iArr2[129] = this.X1;
            iArr2[130] = this.X2;
            iArr2[131] = this.X3;
            return iArr2;
        }
        throw new IllegalArgumentException("key must be a multiple of 4 bytes");
    }
}
