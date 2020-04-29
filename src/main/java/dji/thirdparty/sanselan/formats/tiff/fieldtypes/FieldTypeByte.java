package dji.thirdparty.sanselan.formats.tiff.fieldtypes;

import dji.thirdparty.sanselan.ImageWriteException;
import dji.thirdparty.sanselan.formats.tiff.TiffField;
import dji.thirdparty.sanselan.util.Debug;

public class FieldTypeByte extends FieldType {
    public FieldTypeByte(int type, String name) {
        super(type, 1, name);
    }

    public Object getSimpleValue(TiffField entry) {
        if (entry.length == 1) {
            return new Byte(entry.valueOffsetBytes[0]);
        }
        return getRawBytes(entry);
    }

    public byte[] writeData(Object o, int byteOrder) throws ImageWriteException {
        if (o instanceof Byte) {
            return new byte[]{((Byte) o).byteValue()};
        } else if (o instanceof byte[]) {
            return (byte[]) o;
        } else {
            throw new ImageWriteException("Invalid data: " + o + " (" + Debug.getType(o) + ")");
        }
    }
}
