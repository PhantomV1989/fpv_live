package dji.thirdparty.io.reactivex.internal.observers;

public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
            this.d.dispose();
            countDown();
        }
    }

    public void onError(Throwable t) {
        if (this.value == null) {
            this.error = t;
        }
        countDown();
    }
}
