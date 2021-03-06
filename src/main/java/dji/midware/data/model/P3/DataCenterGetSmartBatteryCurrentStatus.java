package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.CmdIdCenter;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.config.P3.ProductType;
import dji.midware.data.manager.P3.DJIProductManager;
import dji.midware.data.manager.P3.DataBase;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;
import dji.midware.interfaces.DJIDataSyncListener;

@Keep
@EXClassNullAway
public class DataCenterGetSmartBatteryCurrentStatus extends DataBase implements DJIDataSyncListener {
    private static DataCenterGetSmartBatteryCurrentStatus instance = null;

    public static synchronized DataCenterGetSmartBatteryCurrentStatus getInstance() {
        DataCenterGetSmartBatteryCurrentStatus dataCenterGetSmartBatteryCurrentStatus;
        synchronized (DataCenterGetSmartBatteryCurrentStatus.class) {
            if (instance == null) {
                instance = new DataCenterGetSmartBatteryCurrentStatus();
            }
            dataCenterGetSmartBatteryCurrentStatus = instance;
        }
        return dataCenterGetSmartBatteryCurrentStatus;
    }

    public int getCurrentStatus() {
        return ((Integer) get(1, 4, Integer.class)).intValue();
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        ProductType type = DJIProductManager.getInstance().getType();
        if (type == ProductType.litchiC || type == ProductType.litchiS || type == ProductType.litchiX) {
            pack.receiverType = DeviceType.BATTERY.value();
        } else {
            pack.receiverType = DeviceType.CENTER.value();
        }
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.CENTER.value();
        pack.cmdId = CmdIdCenter.CmdIdType.GetSmartBatteryCurrentStatus.value();
        pack.data = getSendData();
        start(pack, callBack);
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[1];
        this._sendData[0] = 1;
    }
}
