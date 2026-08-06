package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zga implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ zga(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                tx2 tx2Var = (tx2) obj3;
                c53 c53Var = (c53) obj;
                int iN1 = tx2Var.n1(c53.b(c53Var.a));
                ((h37) obj2).setValue(new kg5((((long) tx2Var.n1(c53.a(c53Var.a))) & 4294967295L) | (((long) iN1) << 32)));
                break;
            default:
                ((yq6) obj3).j(((oh4) obj2).invoke(obj));
                break;
        }
        return g2b.a;
    }
}
