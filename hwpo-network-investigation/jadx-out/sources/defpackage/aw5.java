package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aw5<T> implements Comparator {
    public final /* synthetic */ kw5 t;

    public aw5(kw5 kw5Var) {
        this.t = kw5Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Object key = ((uw5) t2).getKey();
        kw5 kw5Var = this.t;
        return eo7.f(Integer.valueOf(kw5Var.d(key)), Integer.valueOf(kw5Var.d(((uw5) t).getKey())));
    }
}
