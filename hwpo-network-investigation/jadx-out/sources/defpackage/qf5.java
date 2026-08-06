package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qf5 extends i98<Integer, int[], mf5> {
    public static final qf5 c = new qf5(ig5.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        mf5 mf5Var = (mf5) obj;
        mf5Var.getClass();
        int iR = rt1Var.R(this.b, i);
        mf5Var.b(mf5Var.d() + 1);
        int[] iArr = mf5Var.a;
        int i2 = mf5Var.b;
        mf5Var.b = i2 + 1;
        iArr[i2] = iR;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        mf5 mf5Var = new mf5();
        mf5Var.a = iArr;
        mf5Var.b = iArr.length;
        mf5Var.b(10);
        return mf5Var;
    }

    @Override // defpackage.i98
    public final int[] j() {
        return new int[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, int[] iArr, int i) {
        int[] iArr2 = iArr;
        st1Var.getClass();
        iArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.g(i2, iArr2[i2], this.b);
        }
    }
}
