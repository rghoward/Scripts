package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cva<T> {
    public static final cva<Object> d = new cva<>(0, hf3.t);
    public final int[] a;
    public final List<T> b;
    public final int c;

    public cva(int[] iArr, List list, int i) {
        iArr.getClass();
        list.getClass();
        this.a = iArr;
        this.b = list;
        this.c = i;
        if (iArr.length != 0) {
            return;
        }
        z90.a("originalPageOffsets cannot be empty when constructing TransformablePage");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cva.class != obj.getClass()) {
            return false;
        }
        cva cvaVar = (cva) obj;
        return Arrays.equals(this.a, cvaVar.a) && xj5.a(this.b, cvaVar.b) && this.c == cvaVar.c;
    }

    public final int hashCode() {
        return (ho2.a(Arrays.hashCode(this.a) * 31, 31, this.b) + this.c) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        return i34.b(this.c, ", hintOriginalIndices=null)", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cva(int i, List<? extends T> list) {
        this(new int[]{i}, list, i);
        list.getClass();
    }
}
