package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ty3<T> extends px3<T> implements brb<T> {
    @Override // defpackage.brb
    public final Object d(Object obj, qg2 qg2Var) throws Throwable {
        if (this.c.get()) {
            aa0.c("This scope has already been closed.");
            return null;
        }
        Object objA = cy3.a(this.a, new sy3(this, obj, null), qg2Var);
        return objA == v72.t ? objA : g2b.a;
    }
}
