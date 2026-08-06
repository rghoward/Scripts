package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s09 implements g76, AutoCloseable {
    public final String t;
    public final q09 u;
    public boolean v;

    public s09(String str, q09 q09Var) {
        this.t = str;
        this.u = q09Var;
    }

    public final void k(s66 s66Var, b19 b19Var) {
        b19Var.getClass();
        s66Var.getClass();
        if (this.v) {
            aa0.c("Already attached to lifecycleOwner");
            return;
        }
        this.v = true;
        s66Var.a(this);
        b19Var.c(this.t, this.u.b.e);
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        if (aVar == s66.a.ON_DESTROY) {
            this.v = false;
            m76Var.getLifecycle().c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
