package defpackage;

import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pl3<T extends Enum<T>> extends m1<T> implements nl3<T>, RandomAccess, Serializable {
    public final T[] t;

    public pl3(T[] tArr) {
        tArr.getClass();
        this.t = tArr;
    }

    @Override // defpackage.s0, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) u30.z(r3.ordinal(), this.t)) == r3;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.t.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.t;
        int length = tArr.length;
        if (i >= 0 && i < length) {
            return tArr[i];
        }
        r.b(u.a(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.m1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) u30.z(iOrdinal, this.t)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.m1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) u30.z(iOrdinal, this.t)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
