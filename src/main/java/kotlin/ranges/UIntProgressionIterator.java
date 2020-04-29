package kotlin.ranges;

import dji.publics.LogReport.base.Fields;
import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.collections.UIntIterator;

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\u0003X\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "Lkotlin/collections/UIntIterator;", "first", "Lkotlin/UInt;", "last", Fields.Dgo_update.STEP, "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "nextUInt", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: UIntRange.kt */
final class UIntProgressionIterator extends UIntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    /* Debug info: failed to restart local var, previous not found, register: 4 */
    private UIntProgressionIterator(int first, int last, int step2) {
        UIntProgressionIterator uIntProgressionIterator;
        boolean z = true;
        this.finalElement = last;
        if (step2 > 0) {
            if (UnsignedKt.uintCompare(first, last) <= 0) {
                uIntProgressionIterator = this;
            } else {
                z = false;
                uIntProgressionIterator = this;
            }
        } else if (UnsignedKt.uintCompare(first, last) >= 0) {
            uIntProgressionIterator = this;
        } else {
            z = false;
            uIntProgressionIterator = this;
        }
        uIntProgressionIterator.hasNext = z;
        this.step = UInt.m88constructorimpl(step2);
        this.next = !this.hasNext ? this.finalElement : first;
    }

    public /* synthetic */ UIntProgressionIterator(int first, int last, int step2, DefaultConstructorMarker $constructor_marker) {
        this(first, last, step2);
    }

    public boolean hasNext() {
        return this.hasNext;
    }

    public int nextUInt() {
        int value = this.next;
        if (value != this.finalElement) {
            this.next = UInt.m88constructorimpl(this.next + this.step);
        } else if (!this.hasNext) {
            throw new NoSuchElementException();
        } else {
            this.hasNext = false;
        }
        return value;
    }
}
