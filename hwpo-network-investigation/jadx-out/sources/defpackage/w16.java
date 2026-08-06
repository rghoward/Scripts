package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w16 implements ru5 {
    public final s06 a;
    public long b = zx1.b(0, 0, 0, 0, 15);
    public float c;
    public x16 d;

    public w16(s06 s06Var) {
        this.a = s06Var;
    }

    @Override // defpackage.ru5
    public final x16 a(tw5 tw5Var, long j) {
        g4a g4aVar = tw5Var.u;
        if (this.d != null && xx1.b(this.b, j) && this.c == g4aVar.getDensity()) {
            x16 x16Var = this.d;
            x16Var.getClass();
            return x16Var;
        }
        this.b = j;
        this.c = g4aVar.getDensity();
        s06 s06Var = this.a;
        ko7 ko7Var = s06Var.t;
        az9.a aVar = s06Var.u;
        c30.e eVar = s06Var.v;
        if (xx1.h(j) == Integer.MAX_VALUE) {
            xc5.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        tq5 tq5Var = tq5.t;
        int iH = xx1.h(j) - tw5Var.n1(eo7.d(ko7Var, tq5Var) + eo7.e(ko7Var, tq5Var));
        int[] iArrA = aVar.a(iH, tw5Var.n1(eVar.mo1getSpacingD9Ej5fM()));
        int[] iArr = new int[iArrA.length];
        eVar.a(tw5Var, iH, iArrA, tq5Var, iArr);
        x16 x16Var2 = new x16(iArr, iArrA);
        this.d = x16Var2;
        return x16Var2;
    }
}
