package dji.midware.data.model.P3;

public class DataRTKPushGpsSnrAntB extends DataRTKPushSnr {
    private static DataRTKPushGpsSnrAntB instance = null;

    public /* bridge */ /* synthetic */ long getRecTime() {
        return super.getRecTime();
    }

    public /* bridge */ /* synthetic */ int[] getSnrValues() {
        return super.getSnrValues();
    }

    public /* bridge */ /* synthetic */ int[] getSnrValues2() {
        return super.getSnrValues2();
    }

    public /* bridge */ /* synthetic */ void setRecData(byte[] bArr) {
        super.setRecData(bArr);
    }

    public static synchronized DataRTKPushGpsSnrAntB getInstance() {
        DataRTKPushGpsSnrAntB dataRTKPushGpsSnrAntB;
        synchronized (DataRTKPushGpsSnrAntB.class) {
            if (instance == null) {
                instance = new DataRTKPushGpsSnrAntB();
            }
            dataRTKPushGpsSnrAntB = instance;
        }
        return dataRTKPushGpsSnrAntB;
    }
}
