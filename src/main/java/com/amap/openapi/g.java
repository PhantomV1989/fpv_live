package com.amap.openapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AbstractBuilder */
public abstract class g {
    protected i a = new i(this.b);
    private ByteBuffer b;

    protected g(int i) {
        this.b = ByteBuffer.allocate(i);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
    }

    public g a() {
        this.a.a(this.b);
        return this;
    }
}
