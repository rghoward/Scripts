package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf1 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yf1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                zf1 zf1Var = (zf1) obj3;
                oy0.d(zf1Var.Q1(), null, null, new zf1.a.b(zf1Var, (vf7) obj2, null), 3);
                return g2b.a;
            default:
                return new bg5(((long) ((sp0.b) obj3).a(0, (int) (((kg5) obj).a & 4294967295L))) & 4294967295L);
        }
    }
}
