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
public class DataFlycGetLimits extends DataBase implements DJIDataSyncListener {
    private static DataFlycGetLimits instance = null;
    private MODE mode;

    public static synchronized DataFlycGetLimits getInstance() {
        DataFlycGetLimits dataFlycGetLimits;
        synchronized (DataFlycGetLimits.class) {
            if (instance == null) {
                instance = new DataFlycGetLimits();
            }
            dataFlycGetLimits = instance;
        }
        return dataFlycGetLimits;
    }

    public DataFlycGetLimits setMode(MODE mode2) {
        this.mode = mode2;
        return this;
    }

    public MODE getMode() {
        return MODE.find(this._recData[0]);
    }

    public int getValue() {
        return ((Integer) get(1, 2, Integer.class)).intValue();
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[1];
        this._sendData[0] = (byte) this.mode.value();
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.FLYC.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.FLYC.value();
        pack.cmdId = CmdIdFlyc.CmdIdType.GetLimits.value();
        pack.data = getSendData();
        start(pack, callBack);
    }

    @Keep
    public enum MODE {
        High(1),
        Far(2),
        Low(3),
        OTHER(100);
        
        private int data;

        private MODE(int _data) {
            this.data = _data;
        }

        public int value() {
            return this.data;
        }

        public boolean _equals(int b) {
            return this.data == b;
        }

        public static MODE find(int b) {
            MODE result = OTHER;
            for (int i = 0; i < values().length; i++) {
                if (values()[i]._equals(b)) {
                    return values()[i];
                }
            }
            return result;
        }
    }
}
