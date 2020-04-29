package dji.internal.version.component;

import dji.fieldAnnotation.EXClassNullAway;
import dji.internal.version.DJIModelUpgradePackList;
import dji.internal.version.DJIVersionBaseComponent;
import java.util.ArrayList;

@EXClassNullAway
public class DJIVersionP3cComponent extends DJIVersionBaseComponent {
    private static final String TAG = "UpgradeP3cComponent";

    /* access modifiers changed from: protected */
    public String[] getFirmwareList() {
        return new String[]{"0400", "1100", "0100", "0101", "0305", "0306", "0700", "0900", "1200", "1201", "1202", "1203", "1400", "2700"};
    }

    /* access modifiers changed from: protected */
    public ArrayList<DJIModelUpgradePackList.DJIUpgradePack> getDJIUpgradePackList(DJIModelUpgradePackList model) {
        if (model == null) {
            return null;
        }
        return model.versionlistc;
    }

    /* access modifiers changed from: protected */
    public String getVersion(DJIModelUpgradePackList.DJIUpgradePack pack) {
        if (pack == null) {
            return null;
        }
        return pack.version;
    }

    /* access modifiers changed from: protected */
    public String getComponentName() {
        return "DJIVersionP3cComponent";
    }
}
