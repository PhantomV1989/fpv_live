package kotlin.jvm.internal;

import dji.pilot.fpv.util.DJIFlurryReport;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayByteIterator;", "Lkotlin/collections/ByteIterator;", "array", "", "([B)V", DJIFlurryReport.NativeExplore.V2_EXPLORE_SMALLBANNER_SUBKEY_INDEX, "", "hasNext", "", "nextByte", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: ArrayIterators.kt */
final class ArrayByteIterator extends ByteIterator {
    private final byte[] array;
    private int index;

    public ArrayByteIterator(@NotNull byte[] array2) {
        Intrinsics.checkParameterIsNotNull(array2, "array");
        this.array = array2;
    }

    public boolean hasNext() {
        return this.index < this.array.length;
    }

    public byte nextByte() {
        try {
            byte[] bArr = this.array;
            int i = this.index;
            this.index = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.index--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
