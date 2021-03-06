package com.mapzen.android.lost.internal;

class ThreadSleepFactory implements SleepFactory {
    ThreadSleepFactory() {
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
