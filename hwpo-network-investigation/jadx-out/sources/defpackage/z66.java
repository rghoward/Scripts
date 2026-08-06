package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z66 extends x66 implements g76 {
    public final s66 t;
    public final h72 u;

    public z66(s66 s66Var, h72 h72Var) {
        s66Var.getClass();
        h72Var.getClass();
        this.t = s66Var;
        this.u = h72Var;
        if (s66Var.b() == s66.b.t) {
            sd.c(h72Var, null);
        }
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.u;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        s66 s66Var = this.t;
        if (s66Var.b().compareTo(s66.b.t) <= 0) {
            s66Var.c(this);
            sd.c(this.u, null);
        }
    }
}
