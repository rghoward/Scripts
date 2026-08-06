package defpackage;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f2c<T> extends AbstractList<T> {
    public final d2c t;
    public final e2c<T> u;

    public f2c(d2c d2cVar, e2c<T> e2cVar) {
        this.t = d2cVar;
        this.u = e2cVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        int iF = ((v1c) this.t).f(i);
        ((kvc) this.u).getClass();
        T t = (T) yzb.e(iF);
        return t == null ? (T) yzb.UNKNOWN : t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((v1c) this.t).v;
    }
}
