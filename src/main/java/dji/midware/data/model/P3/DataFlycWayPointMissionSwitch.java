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
public class DataFlycWayPointMissionSwitch extends DataBase implements DJIDataSyncListener {
    private static DataFlycWayPointMissionSwitch instance = null;
    private CMD cmd;

    public static synchronized DataFlycWayPointMissionSwitch getInstance() {
        DataFlycWayPointMissionSwitch dataFlycWayPointMissionSwitch;
        synchronized (DataFlycWayPointMissionSwitch.class) {
            if (instance == null) {
                instance = new DataFlycWayPointMissionSwitch();
            }
            dataFlycWayPointMissionSwitch = instance;
        }
        return dataFlycWayPointMissionSwitch;
    }

    public int getResult() {
        return ((Integer) get(0, 1, Integer.class)).intValue();
    }

    public DataFlycWayPointMissionSwitch setCMD(CMD cmd2) {
        this.cmd = cmd2;
        return this;
    }

    @Keep
    public enum CMD {
        START(0),
        CANCEL(1);
        
        private int data;

        private CMD(int data2) {
            this.data = data2;
        }

        public int value() {
            return this.data;
        }

        public boolean _equals(int b) {
            return this.data == b;
        }

        public static CMD find(int b) {
            CMD result = START;
            for (int i = 0; i < values().length; i++) {
                if (values()[i]._equals(b)) {
                    return values()[i];
                }
            }
            return result;
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
        pack.cmdId = CmdIdFlyc.CmdIdType.WayPointMissionSwitch.value();
        pack.repeatTimes = 1;
        pack.data = getSendData();
        start(pack, callBack);
    }

    /* access modifiers changed from: protected */
    public void doPack() {
        this._sendData = new byte[1];
        this._sendData[0] = (byte) this.cmd.value();
    }
}
