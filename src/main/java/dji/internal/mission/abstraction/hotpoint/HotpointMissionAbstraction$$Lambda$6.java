package dji.internal.mission.abstraction.hotpoint;

import dji.common.util.CommonCallbacks;

final /* synthetic */ class HotpointMissionAbstraction$$Lambda$6 implements Runnable {
    private final HotpointMissionAbstraction arg$1;
    private final float arg$2;
    private final CommonCallbacks.CompletionCallback arg$3;

    HotpointMissionAbstraction$$Lambda$6(HotpointMissionAbstraction hotpointMissionAbstraction, float f, CommonCallbacks.CompletionCallback completionCallback) {
        this.arg$1 = hotpointMissionAbstraction;
        this.arg$2 = f;
        this.arg$3 = completionCallback;
    }

    public void run() {
        this.arg$1.lambda$updateRadius$6$HotpointMissionAbstraction(this.arg$2, this.arg$3);
    }
}
