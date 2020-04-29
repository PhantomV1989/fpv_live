package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.CmdIdGimbal;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.manager.P3.DataBase;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;
import dji.midware.interfaces.DJIDataSyncListener;

@Keep
@EXClassNullAway
public class DataGimbalSetTutorialStep extends DataBase implements DJIDataSyncListener {
    private static DataGimbalSetTutorialStep instance = null;
    byte mCurStep;

    public static synchronized DataGimbalSetTutorialStep getInstance() {
        DataGimbalSetTutorialStep dataGimbalSetTutorialStep;
        synchronized (DataGimbalSetTutorialStep.class) {
            if (instance == null) {
                instance = new DataGimbalSetTutorialStep();
            }
            dataGimbalSetTutorialStep = instance;
        }
        return dataGimbalSetTutorialStep;
    }

    public DataGimbalSetTutorialStep setCurStep(int step) {
        this.mCurStep = (byte) step;
        return this;
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[1];
        this._sendData[0] = this.mCurStep;
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.GIMBAL.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.GIMBAL.value();
        pack.cmdId = CmdIdGimbal.CmdIdType.SetTutorialStep.value();
        start(pack, callBack);
    }
}
