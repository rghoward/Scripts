package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dv4 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ dv4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                yz9<? extends Object> yz9Var = ((fv4) obj).O;
                if (yz9Var == null) {
                    throw x70.a("Font resolution state is not set.");
                }
                yz9Var.getValue();
                return g2b.a;
            case 1:
                w89 w89Var = (w89) obj;
                tva<S> tvaVar = w89Var.e;
                w89Var.f = tvaVar != 0 ? ((Number) tvaVar.l.getValue()).longValue() : 0L;
                return g2b.a;
            default:
                return Boolean.valueOf(((Number) ((yz9) obj).getValue()).floatValue() > 0.0f);
        }
    }
}
