package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vv<T, V extends fw> {
    public final cza<T, V> a;
    public final T b;
    public final long c;
    public final mh4<g2b> d;
    public final dt7 e;
    public V f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final dt7 i = bl7.i(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public vv(Object obj, cza czaVar, fw fwVar, long j, Object obj2, long j2, mh4 mh4Var) {
        this.a = czaVar;
        this.b = obj2;
        this.c = j2;
        this.d = mh4Var;
        this.e = bl7.i(obj);
        this.f = (V) gw.b(fwVar);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }
}
