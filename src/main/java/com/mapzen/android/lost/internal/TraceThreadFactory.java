package com.mapzen.android.lost.internal;

import android.content.Context;
import java.io.File;

public interface TraceThreadFactory {
    TraceThread createTraceThread(Context context, File file, MockEngine mockEngine, SleepFactory sleepFactory);
}
