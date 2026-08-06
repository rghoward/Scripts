package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r09 implements g76 {
    public final z09 t;

    public r09(z09 z09Var) {
        this.t = z09Var;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        if (aVar != s66.a.ON_CREATE) {
            p.b(aVar, "Next event must be ON_CREATE, it was ");
        } else {
            m76Var.getLifecycle().c(this);
            this.t.b();
        }
    }
}
