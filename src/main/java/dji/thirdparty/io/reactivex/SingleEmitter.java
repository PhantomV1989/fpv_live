package dji.thirdparty.io.reactivex;

import dji.thirdparty.io.reactivex.disposables.Disposable;
import dji.thirdparty.io.reactivex.functions.Cancellable;

public interface SingleEmitter<T> {
    boolean isDisposed();

    void onError(Throwable th);

    void onSuccess(T t);

    void setCancellable(Cancellable cancellable);

    void setDisposable(Disposable disposable);
}
