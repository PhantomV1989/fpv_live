package dji.thirdparty.rx.android.plugins;

import dji.thirdparty.rx.Scheduler;
import dji.thirdparty.rx.functions.Action0;

public class RxAndroidSchedulersHook {
    private static final RxAndroidSchedulersHook DEFAULT_INSTANCE = new RxAndroidSchedulersHook();

    public static RxAndroidSchedulersHook getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Scheduler getMainThreadScheduler() {
        return null;
    }

    public Action0 onSchedule(Action0 action) {
        return action;
    }
}
