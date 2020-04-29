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

@Keep
@EXClassNullAway
public class DataCameraSetVideoEncode extends DataBase implements DJIDataSyncListener {
    private VideoEncodeType mPrimaryType = VideoEncodeType.H264;
    private VideoEncodeType mSecondaryType = VideoEncodeType.H264;

    public DataCameraSetVideoEncode setPrimaryEncodeType(VideoEncodeType type) {
        this.mPrimaryType = type;
        return this;
    }

    public DataCameraSetVideoEncode setSecondaryEncodeType(VideoEncodeType type) {
        this.mSecondaryType = type;
        return this;
    }

    public DataCameraSetVideoEncode resetAll() {
        this.mPrimaryType = DataCameraGetPushShotParams.getInstance().getPrimaryVideoEncodeType(this.receiverID);
        this.mSecondaryType = DataCameraGetPushShotParams.getInstance().getSecondaryVideoEncodeType(this.receiverID);
        return this;
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[1];
        byte[] bArr = this._sendData;
        bArr[0] = (byte) (bArr[0] | this.mPrimaryType.value());
        byte[] bArr2 = this._sendData;
        bArr2[0] = (byte) (bArr2[0] | (this.mSecondaryType.value() << 4));
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.CAMERA.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.CAMERA.value();
        pack.cmdId = CmdIdCamera.CmdIdType.SetVideoEncode.value();
        pack.data = getSendData();
        pack.timeOut = 3000;
        start(pack, callBack);
    }

    @Keep
    public enum VideoEncodeType {
        H264(0),
        H265(1),
        OTHER(100);
        
        private final int data;

        private VideoEncodeType(int _data) {
            this.data = _data;
        }

        public int value() {
            return this.data;
        }

        public boolean _equals(int b) {
            return this.data == b;
        }

        public static VideoEncodeType find(int b) {
            VideoEncodeType result = H264;
            VideoEncodeType[] values = values();
            for (VideoEncodeType tmp : values) {
                if (tmp._equals(b)) {
                    return tmp;
                }
            }
            return result;
        }
    }
}
