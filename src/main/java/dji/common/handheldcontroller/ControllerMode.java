package dji.common.handheldcontroller;

import dji.fieldAnnotation.EXClassNullAway;

@EXClassNullAway
public enum ControllerMode {
    ONE_AXIS(0),
    TWO_AXIS(1),
    UNKNOWN(255);
    
    private final int value;

    private ControllerMode(int value2) {
        this.value = value2;
    }

    public int value() {
        return this.value;
    }

    public boolean _equals(int b) {
        return this.value == b;
    }

    public static ControllerMode find(int value2) {
        ControllerMode result = UNKNOWN;
        for (int i = 0; i < values().length; i++) {
            if (values()[i]._equals(value2)) {
                return values()[i];
            }
        }
        return result;
    }
}
