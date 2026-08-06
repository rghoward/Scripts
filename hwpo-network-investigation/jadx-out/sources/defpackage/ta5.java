package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ta5<T> implements Iterable<sa5<? extends T>>, zn5 {
    public final s30 t;

    public ta5(s30 s30Var) {
        this.t = s30Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<sa5<T>> iterator() {
        Object[] objArr = (Object[]) this.t.u;
        objArr.getClass();
        return new ua5(new i30(objArr));
    }
}
