package dji.internal.diagnostics.handler;

import dji.midware.data.model.P3.DataOsdGetPushHome;
import dji.utils.function.Predicate;
import dji.utils.function.Predicate$$CC;

final /* synthetic */ class FlightControllerDiagnosticsHandler$$Lambda$2 implements Predicate {
    static final Predicate $instance = new FlightControllerDiagnosticsHandler$$Lambda$2();

    private FlightControllerDiagnosticsHandler$$Lambda$2() {
    }

    public Predicate and(Predicate predicate) {
        return Predicate$$CC.and(this, predicate);
    }

    public Predicate negate() {
        return Predicate$$CC.negate(this);
    }

    public Predicate or(Predicate predicate) {
        return Predicate$$CC.or(this, predicate);
    }

    public boolean test(Object obj) {
        return FlightControllerDiagnosticsHandler.lambda$initHeightLimitType$2$FlightControllerDiagnosticsHandler((DataOsdGetPushHome) obj);
    }
}
