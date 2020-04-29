package com.jakewharton.rxbinding2.widget;

import android.support.annotation.NonNull;
import android.widget.AdapterView;

public abstract class AdapterViewSelectionEvent {
    @NonNull
    public abstract AdapterView<?> view();

    AdapterViewSelectionEvent() {
    }
}
