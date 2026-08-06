package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xr0 extends i98<Boolean, boolean[], ur0> {
    public static final xr0 c = new xr0(is0.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        ur0 ur0Var = (ur0) obj;
        ur0Var.getClass();
        boolean zA0 = rt1Var.a0(this.b, i);
        ur0Var.b(ur0Var.d() + 1);
        boolean[] zArr = ur0Var.a;
        int i2 = ur0Var.b;
        ur0Var.b = i2 + 1;
        zArr[i2] = zA0;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ur0 ur0Var = new ur0();
        ur0Var.a = zArr;
        ur0Var.b = zArr.length;
        ur0Var.b(10);
        return ur0Var;
    }

    @Override // defpackage.i98
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        st1Var.getClass();
        zArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.o(this.b, i2, zArr2[i2]);
        }
    }
}
