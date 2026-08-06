package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zo4 implements ou5 {
    public final ft5 a;
    public long b = zx1.b(0, 0, 0, 0, 15);
    public float c;
    public nu5 d;

    public zo4(ft5 ft5Var) {
        this.a = ft5Var;
    }

    @Override // defpackage.ou5
    public final nu5 a(tw5 tw5Var, long j) {
        g4a g4aVar = tw5Var.u;
        if (this.d != null && xx1.b(this.b, j) && this.c == g4aVar.getDensity()) {
            nu5 nu5Var = this.d;
            nu5Var.getClass();
            return nu5Var;
        }
        this.b = j;
        this.c = g4aVar.getDensity();
        ft5 ft5Var = this.a;
        wo4.a aVar = (wo4.a) ft5Var.u;
        c30.e eVar = (c30.e) ft5Var.v;
        if (xx1.h(j) == Integer.MAX_VALUE) {
            xc5.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int iH = xx1.h(j);
        int[] iArrS = th1.S(aVar.a(iH, tw5Var.n1(eVar.mo1getSpacingD9Ej5fM())));
        int[] iArr = new int[iArrS.length];
        eVar.a(tw5Var, iH, iArrS, tq5.t, iArr);
        nu5 nu5Var2 = new nu5(iArrS, iArr);
        this.d = nu5Var2;
        return nu5Var2;
    }
}
