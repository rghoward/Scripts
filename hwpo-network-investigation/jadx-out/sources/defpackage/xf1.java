package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xf1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                zf1 zf1Var = (zf1) obj;
                oy0.d(zf1Var.Q1(), null, null, new zf1.a.C0293a(zf1Var, null), 3);
                return g2b.a;
            case 1:
                wq4 wq4Var = (wq4) obj;
                wq4.a aVar = wq4.Companion;
                return new qq4(new wq4.b(2, wq4Var.w(), rr4.class, "onItemChecked", "onItemChecked(IZ)V", 0), new wq4.c(1, wq4Var.w(), rr4.class, "onItemShown", "onItemShown(I)V", 0));
            default:
                aba abaVar = (aba) obj;
                abaVar.W = null;
                ew2.f(abaVar).R();
                ew2.f(abaVar).Q();
                b73.a(abaVar);
                return Boolean.TRUE;
        }
    }
}
