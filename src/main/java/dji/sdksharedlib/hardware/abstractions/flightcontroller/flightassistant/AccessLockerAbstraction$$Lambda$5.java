package dji.sdksharedlib.hardware.abstractions.flightcontroller.flightassistant;

import dji.common.flightcontroller.accesslocker.UserAccountInfo;
import dji.sdksharedlib.util.CallbackResult;
import dji.thirdparty.rx.functions.Func1;

final /* synthetic */ class AccessLockerAbstraction$$Lambda$5 implements Func1 {
    private final AccessLockerAbstraction arg$1;
    private final UserAccountInfo arg$2;

    AccessLockerAbstraction$$Lambda$5(AccessLockerAbstraction accessLockerAbstraction, UserAccountInfo userAccountInfo) {
        this.arg$1 = accessLockerAbstraction;
        this.arg$2 = userAccountInfo;
    }

    public Object call(Object obj) {
        return this.arg$1.lambda$clearPassword$5$AccessLockerAbstraction(this.arg$2, (CallbackResult) obj);
    }
}
