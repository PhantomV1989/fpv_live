package dji.internal.mission.abstraction.intelligenthotpoint;

import dji.common.util.CommonCallbacks;

final /* synthetic */ class IntelligentHotpointMissionAbstraction$$Lambda$8 implements Runnable {
    private final IntelligentHotpointMissionAbstraction arg$1;
    private final float arg$2;
    private final CommonCallbacks.CompletionCallback arg$3;

    IntelligentHotpointMissionAbstraction$$Lambda$8(IntelligentHotpointMissionAbstraction intelligentHotpointMissionAbstraction, float f, CommonCallbacks.CompletionCallback completionCallback) {
        this.arg$1 = intelligentHotpointMissionAbstraction;
        this.arg$2 = f;
        this.arg$3 = completionCallback;
    }

    public void run() {
        this.arg$1.lambda$updateAngularVelocity$8$IntelligentHotpointMissionAbstraction(this.arg$2, this.arg$3);
    }
}
