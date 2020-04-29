package dji.thirdparty.io.reactivex.internal.operators.observable;

import dji.thirdparty.io.reactivex.Emitter;
import dji.thirdparty.io.reactivex.Notification;
import dji.thirdparty.io.reactivex.Observable;
import dji.thirdparty.io.reactivex.ObservableSource;
import dji.thirdparty.io.reactivex.Observer;
import dji.thirdparty.io.reactivex.Scheduler;
import dji.thirdparty.io.reactivex.functions.Action;
import dji.thirdparty.io.reactivex.functions.BiConsumer;
import dji.thirdparty.io.reactivex.functions.BiFunction;
import dji.thirdparty.io.reactivex.functions.Consumer;
import dji.thirdparty.io.reactivex.functions.Function;
import dji.thirdparty.io.reactivex.functions.Predicate;
import dji.thirdparty.io.reactivex.internal.functions.Functions;
import dji.thirdparty.io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class ObservableInternalHelper {
    private ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleGenerator.apply(java.lang.Object, dji.thirdparty.io.reactivex.Emitter):S
         arg types: [java.lang.Object, java.lang.Object]
         candidates:
          dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleGenerator.apply(java.lang.Object, java.lang.Object):java.lang.Object
          dji.thirdparty.io.reactivex.functions.BiFunction.apply(java.lang.Object, java.lang.Object):R
          dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleGenerator.apply(java.lang.Object, dji.thirdparty.io.reactivex.Emitter):S */
        public /* bridge */ /* synthetic */ Object apply(Object x0, Object x1) throws Exception {
            return apply(x0, (Emitter) ((Emitter) x1));
        }

        SimpleGenerator(Consumer<Emitter<T>> consumer2) {
            this.consumer = consumer2;
        }

        public S apply(S t1, Emitter<T> t2) throws Exception {
            this.consumer.accept(t2);
            return t1;
        }
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleBiGenerator.apply(java.lang.Object, dji.thirdparty.io.reactivex.Emitter):S
         arg types: [java.lang.Object, java.lang.Object]
         candidates:
          dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleBiGenerator.apply(java.lang.Object, java.lang.Object):java.lang.Object
          dji.thirdparty.io.reactivex.functions.BiFunction.apply(java.lang.Object, java.lang.Object):R
          dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleBiGenerator.apply(java.lang.Object, dji.thirdparty.io.reactivex.Emitter):S */
        public /* bridge */ /* synthetic */ Object apply(Object x0, Object x1) throws Exception {
            return apply(x0, (Emitter) ((Emitter) x1));
        }

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> consumer2) {
            this.consumer = consumer2;
        }

        public S apply(S t1, Emitter<T> t2) throws Exception {
            this.consumer.accept(t1, t2);
            return t1;
        }
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
        return new SimpleBiGenerator(consumer);
    }

    static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        final Function<? super T, ? extends ObservableSource<U>> itemDelay;

        ItemDelayFunction(Function<? super T, ? extends ObservableSource<U>> itemDelay2) {
            this.itemDelay = itemDelay2;
        }

        public ObservableSource<T> apply(T v) throws Exception {
            return new ObservableTake((ObservableSource) this.itemDelay.apply(v), 1).map(Functions.justFunction(v)).defaultIfEmpty(v);
        }
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> itemDelay) {
        return new ItemDelayFunction(itemDelay);
    }

    static final class ObserverOnNext<T> implements Consumer<T> {
        final Observer<T> observer;

        ObserverOnNext(Observer<T> observer2) {
            this.observer = observer2;
        }

        public void accept(T v) throws Exception {
            this.observer.onNext(v);
        }
    }

    static final class ObserverOnError<T> implements Consumer<Throwable> {
        final Observer<T> observer;

        ObserverOnError(Observer<T> observer2) {
            this.observer = observer2;
        }

        public void accept(Throwable v) throws Exception {
            this.observer.onError(v);
        }
    }

    static final class ObserverOnComplete<T> implements Action {
        final Observer<T> observer;

        ObserverOnComplete(Observer<T> observer2) {
            this.observer = observer2;
        }

        public void run() throws Exception {
            this.observer.onComplete();
        }
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new ObserverOnNext(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new ObserverOnError(observer);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new ObserverOnComplete(observer);
    }

    static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final T t;

        FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> combiner2, T t2) {
            this.combiner = combiner2;
            this.t = t2;
        }

        public R apply(U w) throws Exception {
            return this.combiner.apply(this.t, w);
        }
    }

    static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends ObservableSource<? extends U>> mapper;

        FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> combiner2, Function<? super T, ? extends ObservableSource<? extends U>> mapper2) {
            this.combiner = combiner2;
            this.mapper = mapper2;
        }

        public ObservableSource<R> apply(T t) throws Exception {
            return new ObservableMap((ObservableSource) this.mapper.apply(t), new FlatMapWithCombinerInner(this.combiner, t));
        }
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> mapper, BiFunction<? super T, ? super U, ? extends R> combiner) {
        return new FlatMapWithCombinerOuter(combiner, mapper);
    }

    static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> mapper2) {
            this.mapper = mapper2;
        }

        public ObservableSource<U> apply(T t) throws Exception {
            return new ObservableFromIterable((Iterable) this.mapper.apply(t));
        }
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> mapper) {
        return new FlatMapIntoIterable(mapper);
    }

    enum MapToInt implements Function<Object, Object> {
        INSTANCE;

        public Object apply(Object t) throws Exception {
            return 0;
        }
    }

    static final class RepeatWhenOuterHandler implements Function<Observable<Notification<Object>>, ObservableSource<?>> {
        private final Function<? super Observable<Object>, ? extends ObservableSource<?>> handler;

        public /* bridge */ /* synthetic */ Object apply(Object x0) throws Exception {
            return apply((Observable<Notification<Object>>) ((Observable) x0));
        }

        RepeatWhenOuterHandler(Function<? super Observable<Object>, ? extends ObservableSource<?>> handler2) {
            this.handler = handler2;
        }

        public ObservableSource<?> apply(Observable<Notification<Object>> no) throws Exception {
            return (ObservableSource) this.handler.apply(no.map(MapToInt.INSTANCE));
        }
    }

    public static Function<Observable<Notification<Object>>, ObservableSource<?>> repeatWhenHandler(Function<? super Observable<Object>, ? extends ObservableSource<?>> handler) {
        return new RepeatWhenOuterHandler(handler);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(final Observable<T> parent) {
        return new Callable<ConnectableObservable<T>>() {
            /* class dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.AnonymousClass1 */

            public ConnectableObservable<T> call() {
                return parent.replay();
            }
        };
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(final Observable<T> parent, final int bufferSize) {
        return new Callable<ConnectableObservable<T>>() {
            /* class dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.AnonymousClass2 */

            public ConnectableObservable<T> call() {
                return parent.replay(bufferSize);
            }
        };
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> parent, int bufferSize, long time, TimeUnit unit, Scheduler scheduler) {
        final Observable<T> observable = parent;
        final int i = bufferSize;
        final long j = time;
        final TimeUnit timeUnit = unit;
        final Scheduler scheduler2 = scheduler;
        return new Callable<ConnectableObservable<T>>() {
            /* class dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.AnonymousClass3 */

            public ConnectableObservable<T> call() {
                return observable.replay(i, j, timeUnit, scheduler2);
            }
        };
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> parent, long time, TimeUnit unit, Scheduler scheduler) {
        final Observable<T> observable = parent;
        final long j = time;
        final TimeUnit timeUnit = unit;
        final Scheduler scheduler2 = scheduler;
        return new Callable<ConnectableObservable<T>>() {
            /* class dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.AnonymousClass4 */

            public ConnectableObservable<T> call() {
                return observable.replay(j, timeUnit, scheduler2);
            }
        };
    }

    public static <T, R> Function<Observable<T>, ObservableSource<R>> replayFunction(final Function<? super Observable<T>, ? extends ObservableSource<R>> selector, final Scheduler scheduler) {
        return new Function<Observable<T>, ObservableSource<R>>() {
            /* class dji.thirdparty.io.reactivex.internal.operators.observable.ObservableInternalHelper.AnonymousClass5 */

            public /* bridge */ /* synthetic */ Object apply(Object x0) throws Exception {
                return apply((Observable) ((Observable) x0));
            }

            public ObservableSource<R> apply(Observable<T> t) throws Exception {
                return Observable.wrap((ObservableSource) selector.apply(t)).observeOn(scheduler);
            }
        };
    }

    enum ErrorMapperFilter implements Function<Notification<Object>, Throwable>, Predicate<Notification<Object>> {
        INSTANCE;

        public /* bridge */ /* synthetic */ Object apply(Object x0) throws Exception {
            return apply((Notification<Object>) ((Notification) x0));
        }

        public /* bridge */ /* synthetic */ boolean test(Object x0) throws Exception {
            return test((Notification<Object>) ((Notification) x0));
        }

        public Throwable apply(Notification<Object> t) throws Exception {
            return t.getError();
        }

        public boolean test(Notification<Object> t) throws Exception {
            return t.isOnError();
        }
    }

    static final class RetryWhenInner implements Function<Observable<Notification<Object>>, ObservableSource<?>> {
        private final Function<? super Observable<Throwable>, ? extends ObservableSource<?>> handler;

        public /* bridge */ /* synthetic */ Object apply(Object x0) throws Exception {
            return apply((Observable<Notification<Object>>) ((Observable) x0));
        }

        RetryWhenInner(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> handler2) {
            this.handler = handler2;
        }

        public ObservableSource<?> apply(Observable<Notification<Object>> no) throws Exception {
            return (ObservableSource) this.handler.apply(no.takeWhile(ErrorMapperFilter.INSTANCE).map(ErrorMapperFilter.INSTANCE));
        }
    }

    public static <T> Function<Observable<Notification<Object>>, ObservableSource<?>> retryWhenHandler(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> handler) {
        return new RetryWhenInner(handler);
    }

    static final class ZipIterableFunction<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        private final Function<? super Object[], ? extends R> zipper;

        public /* bridge */ /* synthetic */ Object apply(Object x0) throws Exception {
            return apply((List) ((List) x0));
        }

        ZipIterableFunction(Function<? super Object[], ? extends R> zipper2) {
            this.zipper = zipper2;
        }

        public ObservableSource<? extends R> apply(List<ObservableSource<? extends T>> list) {
            return Observable.zipIterable(list, this.zipper, false, Observable.bufferSize());
        }
    }

    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> zipIterable(Function<? super Object[], ? extends R> zipper) {
        return new ZipIterableFunction(zipper);
    }
}
