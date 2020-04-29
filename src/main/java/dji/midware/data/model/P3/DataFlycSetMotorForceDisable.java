package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.CmdIdFlyc;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.manager.P3.DataBase;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;
import dji.midware.interfaces.DJIDataSyncListener;

@Keep
@EXClassNullAway
public class DataFlycSetMotorForceDisable extends DataBase implements DJIDataSyncListener {
    private static DataFlycSetMotorForceDisable instance = null;
    private boolean isDisable = false;

    public static synchronized DataFlycSetMotorForceDisable getInstance() {
        DataFlycSetMotorForceDisable dataFlycSetMotorForceDisable;
        synchronized (DataFlycSetMotorForceDisable.class) {
            if (instance == null) {
                instance = new DataFlycSetMotorForceDisable();
            }
            dataFlycSetMotorForceDisable = instance;
        }
        return dataFlycSetMotorForceDisable;
    }

    public DataFlycSetMotorForceDisable setDisable(boolean disable) {
        this.isDisable = disable;
        return this;
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[1];
        if (this.isDisable) {
            this._sendData[0] = 1;
        } else {
            this._sendData[0] = 0;
        }
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.FLYC.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.FLYC.value();
        pack.cmdId = CmdIdFlyc.CmdIdType.SetMotorForceDisable.value();
        super.start(pack, callBack);
    }
}
