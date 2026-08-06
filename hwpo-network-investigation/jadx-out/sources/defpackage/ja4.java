package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja4 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ ja4(int i, Object obj, Object obj2) {
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
                ((h27) obj3).b((qg5) obj2);
                break;
            default:
                fo7 fo7Var = (fo7) obj3;
                jz7 jz7Var = (jz7) obj2;
                jz7.a aVar = (jz7.a) obj;
                boolean z = fo7Var.L;
                float f = fo7Var.H;
                if (z) {
                    jz7.a.t(aVar, jz7Var, aVar.n1(f), aVar.n1(fo7Var.I));
                } else {
                    aVar.l(jz7Var, aVar.n1(f), aVar.n1(fo7Var.I), 0.0f);
                }
                break;
        }
        return g2b.a;
    }
}
