package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ lq1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                z03 z03Var = new z03();
                ((oq1) obj).getNavigationEventDispatcher().b(z03Var);
                return z03Var;
            default:
                qr5 qr5VarF = ew2.f((a72) obj);
                if (!qr5VarF.M) {
                    ur5.a(qr5VarF).g(qr5VarF);
                }
                return g2b.a;
        }
    }
}
