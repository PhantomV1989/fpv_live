package dji.common.airlink;

import dji.fieldAnnotation.EXClassNullAway;

@EXClassNullAway
public enum OcuSyncWarningMessage {
    STRONG_TAKE_OFF_INTERFERENCE,
    STRONG_DOWN_LINK_INTERFERENCE,
    STRONG_UP_LINK_INTERFERENCE,
    WEAK_SIGNAL,
    STRONG_INTERFERENCE_WITH_MANUAL_SETTING,
    WEAK_SIGNAL_FROM_REMOTE_CONTROLLER_TO_GLASS,
    WEAK_SIGNAL_FROM_GLASS_TO_REMOTE_CONTROLLER,
    DEBUG,
    AIRCRAFT_LINK_REBOOT,
    UP_LINK_BROKEN,
    DOWN_LINK_BROKEN,
    LINK_UNUSABLE
}
