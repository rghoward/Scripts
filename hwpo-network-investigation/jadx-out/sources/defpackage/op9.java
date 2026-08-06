package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class op9<T> implements np9<T>, t72, sc9<T> {
    public final /* synthetic */ t72 t;
    public final zx0 u;

    public op9(t72 t72Var, zx0 zx0Var) {
        t72Var.getClass();
        this.t = t72Var;
        this.u = zx0Var;
    }

    @Override // defpackage.sc9
    public final Object a(r02 r02Var, Object obj) {
        return this.u.a(r02Var, obj);
    }

    @Override // defpackage.sc9
    public final boolean g(Throwable th) {
        return this.u.p(null, false);
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.t.getCoroutineContext();
    }

    @Override // defpackage.sc9
    public final Object n(T t) {
        return this.u.n(t);
    }
}
