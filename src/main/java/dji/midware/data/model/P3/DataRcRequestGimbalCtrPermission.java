package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.Ccode;
import dji.midware.data.config.P3.CmdIdRc;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.manager.P3.DataBase;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;
import dji.midware.interfaces.DJIDataSyncListener;

@Keep
@EXClassNullAway
public class DataRcRequestGimbalCtrPermission extends DataBase implements DJIDataSyncListener {
    private static DataRcRequestGimbalCtrPermission instance = null;

    public static synchronized DataRcRequestGimbalCtrPermission getInstance() {
        DataRcRequestGimbalCtrPermission dataRcRequestGimbalCtrPermission;
        synchronized (DataRcRequestGimbalCtrPermission.class) {
            if (instance == null) {
                instance = new DataRcRequestGimbalCtrPermission();
            }
            dataRcRequestGimbalCtrPermission = instance;
        }
        return dataRcRequestGimbalCtrPermission;
    }

    public RcGimbalError getError(Ccode ccode) {
        return RcGimbalError.find(ccode.relValue());
    }

    /* access modifiers changed from: protected */
    public void doPack() {
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.OSD.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.RC.value();
        pack.cmdId = CmdIdRc.CmdIdType.RequestGimbalCtrPermission.value();
        pack.data = getSendData();
        pack.timeOut = 10000;
        start(pack, callBack);
    }

    @Keep
    public enum RcGimbalError {
        Refused(1),
        TimeOut(2),
        Getted(3),
        OTHER(100);
        
        private int data;

        private RcGimbalError(int _data) {
            this.data = _data;
        }

        public int value() {
            return this.data;
        }

        public boolean _equals(int b) {
            return this.data == b;
        }

        public static RcGimbalError find(int b) {
            RcGimbalError result = OTHER;
            for (int i = 0; i < values().length; i++) {
                if (values()[i]._equals(b)) {
                    return values()[i];
                }
            }
            return result;
        }
    }
}
