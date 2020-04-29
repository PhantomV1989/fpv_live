package dji.midware.data.model.P3;

import android.support.annotation.Keep;
import dji.fieldAnnotation.EXClassNullAway;
import dji.midware.data.config.P3.CmdIdCommon;
import dji.midware.data.config.P3.CmdSet;
import dji.midware.data.config.P3.DataConfig;
import dji.midware.data.config.P3.DeviceType;
import dji.midware.data.model.common.DataAbstractGetPushActiveStatus;
import dji.midware.data.packages.P3.SendPack;
import dji.midware.interfaces.DJIDataCallBack;

@Keep
@EXClassNullAway
public class DataGimbalActiveStatus extends DataAbstractGetPushActiveStatus {
    private static DataGimbalActiveStatus instance = null;

    public static synchronized DataGimbalActiveStatus getInstance() {
        DataGimbalActiveStatus dataGimbalActiveStatus;
        synchronized (DataGimbalActiveStatus.class) {
            if (instance == null) {
                instance = new DataGimbalActiveStatus();
                instance.setVersion(DataAbstractGetPushActiveStatus.DJIActiveVersion.Ver1_1);
            }
            dataGimbalActiveStatus = instance;
        }
        return dataGimbalActiveStatus;
    }

    public void start(DJIDataCallBack callBack) {
        SendPack pack = new SendPack();
        pack.senderType = DeviceType.APP.value();
        pack.receiverType = DeviceType.GIMBAL.value();
        pack.cmdType = DataConfig.CMDTYPE.REQUEST.value();
        pack.isNeedAck = DataConfig.NEEDACK.YES.value();
        pack.encryptType = DataConfig.EncryptType.NO.value();
        pack.cmdSet = CmdSet.COMMON.value();
        pack.cmdId = CmdIdCommon.CmdIdType.ActiveStatus.value();
        start(pack, callBack);
    }
}
