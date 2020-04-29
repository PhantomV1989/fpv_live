package kotlin.collections;

import com.dji.component.fpv.base.errorpop.ErrorPopModel;
import dji.pilot.fpv.util.DJIFlurryReport;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a(\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\n\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\n\u001a(\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\n\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\n\u001a-\u0010\u0016\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\b¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\b¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001c\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\b\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a-\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001e\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\b\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a\u0015\u0010\u001f\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b \u001a \u0010!\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020%\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\"\u001a\u00020#H\u0007¨\u0006&"}, d2 = {"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", ErrorPopModel.ACTION_REMOVE, "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", DJIFlurryReport.NativeExplore.V2_EXPLORE_SMALLBANNER_SUBKEY_INDEX, "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "shuffle", "random", "Lkotlin/random/Random;", "shuffled", "", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/collections/CollectionsKt")
/* compiled from: MutableCollections.kt */
class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    @InlineOnly
    private static final <T> boolean remove(@NotNull Collection<? extends T> $this$remove, T element) {
        if ($this$remove != null) {
            return TypeIntrinsics.asMutableCollection($this$remove).remove(element);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @InlineOnly
    private static final <T> boolean removeAll(@NotNull Collection $this$removeAll, Collection elements) {
        if ($this$removeAll != null) {
            return TypeIntrinsics.asMutableCollection($this$removeAll).removeAll(elements);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @InlineOnly
    private static final <T> boolean retainAll(@NotNull Collection $this$retainAll, Collection elements) {
        if ($this$retainAll != null) {
            return TypeIntrinsics.asMutableCollection($this$retainAll).retainAll(elements);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    @InlineOnly
    private static final <T> T remove(@NotNull List<T> $this$remove, int index) {
        return $this$remove.remove(index);
    }

    @InlineOnly
    private static final <T> void plusAssign(@NotNull Collection<? super T> $this$plusAssign, T element) {
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        $this$plusAssign.add(element);
    }

    @InlineOnly
    private static final <T> void plusAssign(@NotNull Collection<? super T> $this$plusAssign, Iterable<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        CollectionsKt.addAll($this$plusAssign, elements);
    }

    @InlineOnly
    private static final <T> void plusAssign(@NotNull Collection<? super T> $this$plusAssign, T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        CollectionsKt.addAll($this$plusAssign, elements);
    }

    @InlineOnly
    private static final <T> void plusAssign(@NotNull Collection<? super T> $this$plusAssign, Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        CollectionsKt.addAll($this$plusAssign, elements);
    }

    @InlineOnly
    private static final <T> void minusAssign(@NotNull Collection<? super T> $this$minusAssign, T element) {
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        $this$minusAssign.remove(element);
    }

    @InlineOnly
    private static final <T> void minusAssign(@NotNull Collection<? super T> $this$minusAssign, Iterable<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        CollectionsKt.removeAll($this$minusAssign, elements);
    }

    @InlineOnly
    private static final <T> void minusAssign(@NotNull Collection<? super T> $this$minusAssign, T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        CollectionsKt.removeAll($this$minusAssign, elements);
    }

    @InlineOnly
    private static final <T> void minusAssign(@NotNull Collection<? super T> $this$minusAssign, Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        CollectionsKt.removeAll($this$minusAssign, elements);
    }

    public static final <T> boolean addAll(@NotNull Collection $this$addAll, @NotNull Iterable elements) {
        Intrinsics.checkParameterIsNotNull($this$addAll, "$this$addAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        if (elements instanceof Collection) {
            return $this$addAll.addAll((Collection) elements);
        }
        boolean result = false;
        for (Object item : elements) {
            if ($this$addAll.add(item)) {
                result = true;
            }
        }
        return result;
    }

    public static final <T> boolean addAll(@NotNull Collection $this$addAll, @NotNull Sequence elements) {
        Intrinsics.checkParameterIsNotNull($this$addAll, "$this$addAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        boolean result = false;
        for (Object item : elements) {
            if ($this$addAll.add(item)) {
                result = true;
            }
        }
        return result;
    }

    public static final <T> boolean addAll(@NotNull Collection $this$addAll, @NotNull Object[] elements) {
        Intrinsics.checkParameterIsNotNull($this$addAll, "$this$addAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return $this$addAll.addAll(ArraysKt.asList(elements));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable, kotlin.jvm.functions.Function1, boolean):boolean
     arg types: [java.lang.Iterable, kotlin.jvm.functions.Function1, int]
     candidates:
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List, kotlin.jvm.functions.Function1, boolean):boolean
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable, kotlin.jvm.functions.Function1, boolean):boolean */
    public static final <T> boolean removeAll(@NotNull Iterable $this$removeAll, @NotNull Function1 predicate) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable, kotlin.jvm.functions.Function1, boolean):boolean
     arg types: [java.lang.Iterable, kotlin.jvm.functions.Function1, int]
     candidates:
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List, kotlin.jvm.functions.Function1, boolean):boolean
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable, kotlin.jvm.functions.Function1, boolean):boolean */
    public static final <T> boolean retainAll(@NotNull Iterable $this$retainAll, @NotNull Function1 predicate) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(@NotNull Iterable<? extends T> $this$filterInPlace, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) {
        boolean result = false;
        Iterator $this$with = $this$filterInPlace.iterator();
        while ($this$with.hasNext()) {
            if (predicate.invoke($this$with.next()).booleanValue() == predicateResultToRemove) {
                $this$with.remove();
                result = true;
            }
        }
        return result;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List, kotlin.jvm.functions.Function1, boolean):boolean
     arg types: [java.util.List, kotlin.jvm.functions.Function1, int]
     candidates:
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable, kotlin.jvm.functions.Function1, boolean):boolean
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List, kotlin.jvm.functions.Function1, boolean):boolean */
    public static final <T> boolean removeAll(@NotNull List $this$removeAll, @NotNull Function1 predicate) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List, kotlin.jvm.functions.Function1, boolean):boolean
     arg types: [java.util.List, kotlin.jvm.functions.Function1, int]
     candidates:
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable, kotlin.jvm.functions.Function1, boolean):boolean
      kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List, kotlin.jvm.functions.Function1, boolean):boolean */
    public static final <T> boolean retainAll(@NotNull List $this$retainAll, @NotNull Function1 predicate) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(@NotNull List<T> $this$filterInPlace, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) {
        if ($this$filterInPlace instanceof RandomAccess) {
            int writeIndex = 0;
            int lastIndex = CollectionsKt.getLastIndex($this$filterInPlace);
            if (0 <= lastIndex) {
                int readIndex = 0;
                while (true) {
                    Object element = $this$filterInPlace.get(readIndex);
                    if (predicate.invoke(element).booleanValue() != predicateResultToRemove) {
                        if (writeIndex != readIndex) {
                            $this$filterInPlace.set(writeIndex, element);
                        }
                        writeIndex++;
                    }
                    if (readIndex == lastIndex) {
                        break;
                    }
                    readIndex++;
                }
            }
            if (writeIndex >= $this$filterInPlace.size()) {
                return false;
            }
            int lastIndex2 = CollectionsKt.getLastIndex($this$filterInPlace);
            if (lastIndex2 >= writeIndex) {
                while (true) {
                    $this$filterInPlace.remove(lastIndex2);
                    if (lastIndex2 == writeIndex) {
                        break;
                    }
                    lastIndex2--;
                }
            }
            return true;
        } else if ($this$filterInPlace != null) {
            return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable($this$filterInPlace), predicate, predicateResultToRemove);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }

    public static final <T> boolean removeAll(@NotNull Collection $this$removeAll, @NotNull Iterable elements) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return TypeIntrinsics.asMutableCollection($this$removeAll).removeAll(CollectionsKt.convertToSetForSetOperationWith(elements, $this$removeAll));
    }

    public static final <T> boolean removeAll(@NotNull Collection $this$removeAll, @NotNull Sequence elements) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        HashSet set = SequencesKt.toHashSet(elements);
        return (!set.isEmpty()) && $this$removeAll.removeAll(set);
    }

    public static final <T> boolean removeAll(@NotNull Collection $this$removeAll, @NotNull Object[] elements) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return (!(elements.length == 0)) && $this$removeAll.removeAll(ArraysKt.toHashSet(elements));
    }

    public static final <T> boolean retainAll(@NotNull Collection $this$retainAll, @NotNull Iterable elements) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return TypeIntrinsics.asMutableCollection($this$retainAll).retainAll(CollectionsKt.convertToSetForSetOperationWith(elements, $this$retainAll));
    }

    public static final <T> boolean retainAll(@NotNull Collection $this$retainAll, @NotNull Object[] elements) {
        boolean z;
        boolean z2 = true;
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        if (elements.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = false;
        }
        if (z2) {
            return $this$retainAll.retainAll(ArraysKt.toHashSet(elements));
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt($this$retainAll);
    }

    public static final <T> boolean retainAll(@NotNull Collection $this$retainAll, @NotNull Sequence elements) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        HashSet set = SequencesKt.toHashSet(elements);
        if (!set.isEmpty()) {
            return $this$retainAll.retainAll(set);
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt($this$retainAll);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(@NotNull Collection<?> $this$retainNothing) {
        boolean result = !$this$retainNothing.isEmpty();
        $this$retainNothing.clear();
        return result;
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void shuffle(@NotNull List<T> $this$shuffle, @NotNull Random random) {
        Intrinsics.checkParameterIsNotNull($this$shuffle, "$this$shuffle");
        Intrinsics.checkParameterIsNotNull(random, "random");
        for (int lastIndex = CollectionsKt.getLastIndex($this$shuffle); lastIndex >= 1; lastIndex--) {
            int j = random.nextInt(lastIndex + 1);
            Object copy = $this$shuffle.get(lastIndex);
            $this$shuffle.set(lastIndex, $this$shuffle.get(j));
            $this$shuffle.set(j, copy);
        }
    }

    @NotNull
    @SinceKotlin(version = "1.3")
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled, @NotNull Random random) {
        Intrinsics.checkParameterIsNotNull($this$shuffled, "$this$shuffled");
        Intrinsics.checkParameterIsNotNull(random, "random");
        List $this$apply = CollectionsKt.toMutableList($this$shuffled);
        CollectionsKt.shuffle($this$apply, random);
        return $this$apply;
    }
}
