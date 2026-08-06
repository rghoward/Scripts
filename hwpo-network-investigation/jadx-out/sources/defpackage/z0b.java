package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0b extends i98<w0b, x0b, y0b> {
    public static final z0b c = new z0b(a1b.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        return ((x0b) obj).t.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        y0b y0bVar = (y0b) obj;
        y0bVar.getClass();
        long jZ = rt1Var.u(this.b, i).Z();
        y0bVar.b(y0bVar.d() + 1);
        long[] jArr = y0bVar.a;
        int i2 = y0bVar.b;
        y0bVar.b = i2 + 1;
        jArr[i2] = jZ;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        long[] jArr = ((x0b) obj).t;
        y0b y0bVar = new y0b();
        y0bVar.a = jArr;
        y0bVar.b = jArr.length;
        y0bVar.b(10);
        return y0bVar;
    }

    @Override // defpackage.i98
    public final x0b j() {
        return new x0b(new long[0]);
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, x0b x0bVar, int i) {
        long[] jArr = x0bVar.t;
        st1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.A(this.b, i2).y(jArr[i2]);
        }
    }
}
