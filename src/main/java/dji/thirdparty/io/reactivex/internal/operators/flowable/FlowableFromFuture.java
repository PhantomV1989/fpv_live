package dji.thirdparty.io.reactivex.internal.operators.flowable;

import dji.thirdparty.io.reactivex.Flowable;
import dji.thirdparty.io.reactivex.exceptions.Exceptions;
import dji.thirdparty.io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future2, long timeout2, TimeUnit unit2) {
        this.future = future2;
        this.timeout = timeout2;
        this.unit = unit2;
    }

    public void subscribeActual(Subscriber<? super T> s) {
        DeferredScalarSubscription<T> deferred = new DeferredScalarSubscription<>(s);
        s.onSubscribe(deferred);
        try {
            T v = this.unit != null ? this.future.get(this.timeout, this.unit) : this.future.get();
            if (v == null) {
                s.onError(new NullPointerException("The future returned null"));
            } else {
                deferred.complete(v);
            }
        } catch (Throwable ex) {
            Exceptions.throwIfFatal(ex);
            if (!deferred.isCancelled()) {
                s.onError(ex);
            }
        }
    }
}
