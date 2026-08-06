package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j11 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ j11(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((n11) obj2).b.f(null);
                break;
            default:
                qq5 qq5Var = (qq5) obj;
                sia siaVarD = ((u56) obj2).d();
                if (siaVarD != null) {
                    siaVarD.c = qq5Var;
                }
                break;
        }
        return g2b.a;
    }
}
