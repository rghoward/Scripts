package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fra {
    public final w37 a;
    public final j37<Boolean> b = new j37<>(Boolean.FALSE);
    public e41 c;

    public fra(w37 w37Var) {
        this.a = w37Var;
    }

    public final void a() {
        this.b.u(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        j37<Boolean> j37Var = this.b;
        return ((Boolean) j37Var.b.getValue()).booleanValue() || ((Boolean) j37Var.c.getValue()).booleanValue();
    }

    public final Object c(o37 o37Var, p6a p6aVar) {
        dra draVar = new dra(this, new era(this, null), o37Var, null);
        w37 w37Var = this.a;
        w37Var.getClass();
        Object objD = u72.d(new t37(o37Var, w37Var, draVar, null), p6aVar);
        return objD == v72.t ? objD : g2b.a;
    }
}
