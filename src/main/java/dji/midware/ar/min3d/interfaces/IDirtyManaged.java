package dji.midware.ar.min3d.interfaces;

import dji.fieldAnnotation.EXClassNullAway;

@EXClassNullAway
public interface IDirtyManaged {
    void clearDirtyFlag();

    boolean isDirty();

    void setDirtyFlag();
}
