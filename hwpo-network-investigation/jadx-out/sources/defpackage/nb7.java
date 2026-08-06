package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nb7 extends wp5 implements ci4<n41, ko4, g2b> {
    public final /* synthetic */ mb7 u;
    public final /* synthetic */ ob7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb7(mb7 mb7Var, ob7 ob7Var) {
        super(2);
        this.u = mb7Var;
        this.v = ob7Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(n41 n41Var, ko4 ko4Var) {
        n41 n41Var2 = n41Var;
        ko4 ko4Var2 = ko4Var;
        mb7 mb7Var = this.u;
        qr5 qr5Var = mb7Var.H;
        if (qr5Var.j()) {
            mb7Var.c0 = n41Var2;
            mb7Var.b0 = ko4Var2;
            un7 snapshotObserver = ur5.a(qr5Var).getSnapshotObserver();
            sv8 sv8Var = mb7.i0;
            snapshotObserver.a.d(mb7Var, mb7.c.u, this.v);
            mb7Var.f0 = false;
        } else {
            mb7Var.f0 = true;
        }
        return g2b.a;
    }
}
