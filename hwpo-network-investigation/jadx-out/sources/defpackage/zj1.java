package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj1 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ zj1(int i, Object obj, Object obj2) {
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
                w60 w60Var = (w60) obj;
                w60Var.getClass();
                ((ci4) obj3).invoke(((ya) obj2).t(), w60Var);
                return g2b.a;
            case 1:
                String str = (String) obj2;
                x27 x27Var = (x27) obj;
                x27Var.g(xu4.d, str);
                ((xu4) obj3).d(x27Var, str);
                return null;
            default:
                ((oh4) obj3).invoke(obj);
                ((oh4) obj2).invoke(obj);
                return g2b.a;
        }
    }
}
