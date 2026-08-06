package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class on9 extends i98<Short, short[], nn9> {
    public static final on9 c = new on9(pn9.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        nn9 nn9Var = (nn9) obj;
        nn9Var.getClass();
        short sP = rt1Var.P(this.b, i);
        nn9Var.b(nn9Var.d() + 1);
        short[] sArr = nn9Var.a;
        int i2 = nn9Var.b;
        nn9Var.b = i2 + 1;
        sArr[i2] = sP;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        nn9 nn9Var = new nn9();
        nn9Var.a = sArr;
        nn9Var.b = sArr.length;
        nn9Var.b(10);
        return nn9Var;
    }

    @Override // defpackage.i98
    public final short[] j() {
        return new short[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, short[] sArr, int i) {
        short[] sArr2 = sArr;
        st1Var.getClass();
        sArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.r(this.b, i2, sArr2[i2]);
        }
    }
}
