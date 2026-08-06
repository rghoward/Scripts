package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h43 extends i98<Double, double[], f43> {
    public static final h43 c = new h43(n43.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        f43 f43Var = (f43) obj;
        f43Var.getClass();
        double dO0 = rt1Var.o0(this.b, i);
        f43Var.b(f43Var.d() + 1);
        double[] dArr = f43Var.a;
        int i2 = f43Var.b;
        f43Var.b = i2 + 1;
        dArr[i2] = dO0;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        f43 f43Var = new f43();
        f43Var.a = dArr;
        f43Var.b = dArr.length;
        f43Var.b(10);
        return f43Var;
    }

    @Override // defpackage.i98
    public final double[] j() {
        return new double[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, double[] dArr, int i) {
        double[] dArr2 = dArr;
        st1Var.getClass();
        dArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.x(this.b, i2, dArr2[i2]);
        }
    }
}
