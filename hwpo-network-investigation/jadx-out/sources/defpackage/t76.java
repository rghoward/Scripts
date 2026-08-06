package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t76 extends wp5 implements mh4<g2b> {
    public final /* synthetic */ s76.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t76(s76.b bVar) {
        super(0);
        this.u = bVar;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        fh6 fh6Var = (fh6) this.u.a.t;
        if (!fh6Var.u) {
            if (fh6Var.v) {
                d78.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
            }
            fh6Var.a();
            fh6Var.v = true;
        }
        return g2b.a;
    }
}
