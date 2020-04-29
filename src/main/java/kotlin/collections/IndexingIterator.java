package kotlin.collections;

import dji.pilot.fpv.util.DJIFlurryReport;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", DJIFlurryReport.NativeExplore.V2_EXPLORE_SMALLBANNER_SUBKEY_INDEX, "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Iterators.kt */
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
    private int index;
    private final Iterator<T> iterator;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public IndexingIterator(@NotNull Iterator<? extends T> iterator2) {
        Intrinsics.checkParameterIsNotNull(iterator2, "iterator");
        this.iterator = iterator2;
    }

    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @NotNull
    public final IndexedValue<T> next() {
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            CollectionsKt.throwIndexOverflow();
        }
        return new IndexedValue<>(i, this.iterator.next());
    }
}
