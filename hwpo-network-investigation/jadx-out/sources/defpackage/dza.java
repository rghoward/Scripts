package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dza<T, V extends fw> implements cza<T, V> {
    public final oh4<T, V> a;
    public final oh4<V, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public dza(oh4<? super T, ? extends V> oh4Var, oh4<? super V, ? extends T> oh4Var2) {
        this.a = oh4Var;
        this.b = oh4Var2;
    }

    @Override // defpackage.cza
    public final oh4<T, V> a() {
        return this.a;
    }

    @Override // defpackage.cza
    public final oh4<V, T> b() {
        return this.b;
    }
}
