package com.jakewharton.rxbinding2.view;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import io.reactivex.functions.Consumer;

final /* synthetic */ class RxMenuItem$$Lambda$2 implements Consumer {
    private final MenuItem arg$1;

    private RxMenuItem$$Lambda$2(MenuItem menuItem) {
        this.arg$1 = menuItem;
    }

    static Consumer get$Lambda(MenuItem menuItem) {
        return new RxMenuItem$$Lambda$2(menuItem);
    }

    public void accept(Object obj) {
        this.arg$1.setIcon((Drawable) obj);
    }
}
