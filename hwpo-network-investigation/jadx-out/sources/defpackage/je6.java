package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class je6 extends i98<Long, long[], ee6> {
    public static final je6 c = new je6(ue6.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        ee6 ee6Var = (ee6) obj;
        ee6Var.getClass();
        long jG = rt1Var.G(this.b, i);
        ee6Var.b(ee6Var.d() + 1);
        long[] jArr = ee6Var.a;
        int i2 = ee6Var.b;
        ee6Var.b = i2 + 1;
        jArr[i2] = jG;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ee6 ee6Var = new ee6();
        ee6Var.a = jArr;
        ee6Var.b = jArr.length;
        ee6Var.b(10);
        return ee6Var;
    }

    @Override // defpackage.i98
    public final long[] j() {
        return new long[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, long[] jArr, int i) {
        long[] jArr2 = jArr;
        st1Var.getClass();
        jArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.B(this.b, i2, jArr2[i2]);
        }
    }
}
