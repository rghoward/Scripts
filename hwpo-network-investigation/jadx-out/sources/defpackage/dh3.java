package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dh3 extends wp5 implements oh4<tva.b<wg3>, a04<Float>> {
    public final /* synthetic */ th3 u;
    public final /* synthetic */ jo3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh3(th3 th3Var, jo3 jo3Var) {
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
            t39 t39Var = this.u.a().d;
            return (t39Var == null || (a04Var2 = t39Var.c) == null) ? zg3.b : a04Var2;
        }
        if (!bVar2.c(wg3Var2, wg3.v)) {
            return zg3.b;
        }
        t39 t39Var2 = this.v.a().d;
        return (t39Var2 == null || (a04Var = t39Var2.c) == null) ? zg3.b : a04Var;
    }
}
