package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.CmdIdCamera;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.manager.P3.DataBase;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;
import dji.midware.interfaces.DJIDataSyncListener;
import dji.midware.media.DJIVideoDecoder;
import dji.midware.util.BytesUtil;

@Keep
@EXClassNullAway
public class DataCameraSetTapZoomTarget extends DataBase implements DJIDataSyncListener {
    private static DataCameraSetTapZoomTarget instance = null;
    private float x;
    private float y;

    public static synchronized DataCameraSetTapZoomTarget getInstance() {
        DataCameraSetTapZoomTarget dataCameraSetTapZoomTarget;
        synchronized (DataCameraSetTapZoomTarget.class) {
            if (instance == null) {
                instance = new DataCameraSetTapZoomTarget();
            }
            dataCameraSetTapZoomTarget = instance;
        }
        return dataCameraSetTapZoomTarget;
    }

    public DataCameraSetTapZoomTarget setXAxis(float x2) {
        this.x = x2;
        return this;
    }

    public DataCameraSetTapZoomTarget setYAxis(float y2) {
        this.y = y2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[8];
        System.arraycopy(BytesUtil.getBytes(this.x), 0, this._sendData, 0, 4);
        System.arraycopy(BytesUtil.getBytes(this.y), 0, this._sendData, 4, 4);
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.CAMERA.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.CAMERA.value();
        pack.cmdId = CmdIdCamera.CmdIdType.SetTapZoomTarget.value();
        pack.timeOut = DJIVideoDecoder.connectLosedelay;
        pack.repeatTimes = 2;
        start(pack, callBack);
    }
}
