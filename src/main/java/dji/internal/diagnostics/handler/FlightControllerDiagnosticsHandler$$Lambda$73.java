package dji.internal.diagnostics.handler;

import dji.midware.data.model.P3.DataFlycGetPushCheckStatus;
import dji.utils.function.Predicate;
import dji.utils.function.Predicate$$CC;

final /* synthetic */ class FlightControllerDiagnosticsHandler$$Lambda$73 implements Predicate {
    static final Predicate $instance = new FlightControllerDiagnosticsHandler$$Lambda$73();

    private FlightControllerDiagnosticsHandler$$Lambda$73() {
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
        return ((DataFlycGetPushCheckStatus) obj).getDataLoggerStatus();
    }
}
