package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w91<T> implements s54<T> {
    public final sc9<T> t;

    /* JADX WARN: Multi-variable type inference failed */
    public w91(sc9<? super T> sc9Var) {
        sc9Var.getClass();
        this.t = sc9Var;
    }

    @Override // defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) {
        Object objA = this.t.a(r02Var, t);
        return objA == v72.t ? objA : g2b.a;
    }
}
