package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.CmdIdFlyc;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.manager.P3.DataBase;
import dji.midware.data.model.P3.DataFlycGetLimits;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;
import dji.midware.interfaces.DJIDataSyncListener;
import dji.midware.util.BytesUtil;

@Keep
@EXClassNullAway
public class DataFlycSetLimits extends DataBase implements DJIDataSyncListener {
    private static DataFlycSetLimits instance = null;
    private DataFlycGetLimits.MODE mode;
    private int value;

    public static synchronized DataFlycSetLimits getInstance() {
        DataFlycSetLimits dataFlycSetLimits;
        synchronized (DataFlycSetLimits.class) {
            if (instance == null) {
                instance = new DataFlycSetLimits();
            }
            dataFlycSetLimits = instance;
        }
        return dataFlycSetLimits;
    }

    public DataFlycSetLimits setMode(DataFlycGetLimits.MODE mode2) {
        this.mode = mode2;
        return this;
    }

    public DataFlycSetLimits setValue(int value2) {
        this.value = value2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[3];
        this._sendData[0] = (byte) this.mode.value();
        System.arraycopy(BytesUtil.getUnsignedBytes(this.value), 0, this._sendData, 1, 2);
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.FLYC.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.FLYC.value();
        pack.cmdId = CmdIdFlyc.CmdIdType.SetLimits.value();
        pack.data = getSendData();
        start(pack, callBack);
    }
}
