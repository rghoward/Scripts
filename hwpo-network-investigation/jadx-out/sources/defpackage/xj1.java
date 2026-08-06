package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj1 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ di4 u;
    public final /* synthetic */ Object v;

    public /* synthetic */ xj1(di4 di4Var, Object obj, int i) {
        this.t = i;
        this.u = di4Var;
        this.v = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        di4 di4Var = this.u;
        switch (i) {
            case 0:
                w60.b bVar = (w60.b) obj;
                bVar.getClass();
                ((ci4) di4Var).invoke(bVar, ((sk1.a) ((ya) obj2).t()).k);
                break;
            default:
                ((oh4) di4Var).invoke(obj);
                ((oh4) obj2).invoke(obj);
                break;
        }
        return g2b.a;
    }
}
