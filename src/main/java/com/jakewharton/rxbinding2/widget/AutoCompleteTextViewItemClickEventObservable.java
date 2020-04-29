package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

final class AutoCompleteTextViewItemClickEventObservable extends Observable<AdapterViewItemClickEvent> {
    private final AutoCompleteTextView view;

    AutoCompleteTextViewItemClickEventObservable(AutoCompleteTextView view2) {
        this.view = view2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Observer<? super AdapterViewItemClickEvent> observer) {
        if (Preconditions.checkMainThread(observer)) {
            Listener listener = new Listener(this.view, observer);
            observer.onSubscribe(listener);
            this.view.setOnItemClickListener(listener);
        }
    }

    static final class Listener extends MainThreadDisposable implements AdapterView.OnItemClickListener {
        private final Observer<? super AdapterViewItemClickEvent> observer;
        private final AutoCompleteTextView view;

        Listener(AutoCompleteTextView view2, Observer<? super AdapterViewItemClickEvent> observer2) {
            this.view = view2;
            this.observer = observer2;
        }

        public void onItemClick(AdapterView<?> parent, View view2, int position, long id) {
            if (!isDisposed()) {
                this.observer.onNext(AdapterViewItemClickEvent.create(parent, view2, position, id));
            }
        }

        /* access modifiers changed from: protected */
        public void onDispose() {
            this.view.setOnItemClickListener(null);
        }
    }
}
