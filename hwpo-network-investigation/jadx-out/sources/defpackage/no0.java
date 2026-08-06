package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class no0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ no0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                oo0 oo0Var = (oo0) obj2;
                gm3 gm3Var = (gm3) obj;
                oo0.a aVar = oo0.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof gp0) {
                    oo0Var.m(((gp0) gm3Var).b);
                }
                break;
            default:
                hc9 hc9Var = (hc9) obj;
                ec9.b((String) obj2, hc9Var);
                ec9.e(hc9Var, 5);
                break;
        }
        return g2b.a;
    }
}
