package org.bouncycastle.util.encoders;

import org.msgpack.core.MessagePack;
import org.xeustechnologies.jtar.TarHeader;

public class HexTranslator implements Translator {
    private static final byte[] hexTable = {TarHeader.LF_NORMAL, TarHeader.LF_LINK, TarHeader.LF_SYMLINK, TarHeader.LF_CHR, TarHeader.LF_BLK, TarHeader.LF_DIR, TarHeader.LF_FIFO, TarHeader.LF_CONTIG, 56, 57, 97, 98, 99, 100, 101, 102};

    public int decode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 / 2;
        for (int i5 = 0; i5 < i4; i5++) {
            byte b = bArr[(i5 * 2) + i];
            byte b2 = bArr[(i5 * 2) + i + 1];
            if (b < 97) {
                bArr2[i3] = (byte) ((b + MessagePack.Code.INT8) << 4);
            } else {
                bArr2[i3] = (byte) (((b - 97) + 10) << 4);
            }
            if (b2 < 97) {
                bArr2[i3] = (byte) (bArr2[i3] + ((byte) (b2 + MessagePack.Code.INT8)));
            } else {
                bArr2[i3] = (byte) (bArr2[i3] + ((byte) ((b2 - 97) + 10)));
            }
            i3++;
        }
        return i4;
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i3 + i4] = hexTable[(bArr[i] >> 4) & 15];
            bArr2[i3 + i4 + 1] = hexTable[bArr[i] & 15];
            i++;
            i4 += 2;
        }
        return i2 * 2;
    }

    public int getDecodedBlockSize() {
        return 1;
    }

    public int getEncodedBlockSize() {
        return 2;
    }
}
