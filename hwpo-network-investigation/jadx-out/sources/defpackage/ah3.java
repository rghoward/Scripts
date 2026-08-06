package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ah3 extends wp5 implements oh4<tva.b<wg3>, a04<Float>> {
    public final /* synthetic */ th3 u;
    public final /* synthetic */ jo3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(th3 th3Var, jo3 jo3Var) {
        super(1);
        this.u = th3Var;
        this.v = jo3Var;
    }

    @Override // defpackage.oh4
    public final a04<Float> invoke(tva.b<wg3> bVar) {
        a04<Float> a04Var;
        a04<Float> a04Var2;
        tva.b<wg3> bVar2 = bVar;
        wg3 wg3Var = wg3.t;
        wg3 wg3Var2 = wg3.u;
        if (bVar2.c(wg3Var, wg3Var2)) {
            et3 et3Var = this.u.a().a;
            return (et3Var == null || (a04Var2 = et3Var.b) == null) ? zg3.b : a04Var2;
        }
        if (!bVar2.c(wg3Var2, wg3.v)) {
            return zg3.b;
        }
        et3 et3Var2 = this.v.a().a;
        return (et3Var2 == null || (a04Var = et3Var2.b) == null) ? zg3.b : a04Var;
    }
}
