package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 implements bq8 {
    public final s66 t;
    public final el5 u;

    public uk0(s66 s66Var, el5 el5Var) {
        this.t = s66Var;
        this.u = el5Var;
    }

    @Override // defpackage.as2
    public final void onDestroy(m76 m76Var) {
        this.u.k(null);
    }

    @Override // defpackage.bq8
    public final void start() {
        this.t.a(this);
    }

    @Override // defpackage.bq8
    public final void v() {
        this.t.c(this);
    }
}
