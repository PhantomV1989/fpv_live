package dji.thirdparty.io.reactivex.internal.operators.maybe;

import dji.thirdparty.io.reactivex.Maybe;
import dji.thirdparty.io.reactivex.MaybeObserver;
import dji.thirdparty.io.reactivex.disposables.Disposables;

public final class MaybeError<T> extends Maybe<T> {
    final Throwable error;

    public MaybeError(Throwable error2) {
        this.error = error2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super T> observer) {
        observer.onSubscribe(Disposables.disposed());
        observer.onError(this.error);
    }
}
