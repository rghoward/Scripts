package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q44 extends i98<Float, float[], n44> {
    public static final q44 c = new q44(w44.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        n44 n44Var = (n44) obj;
        n44Var.getClass();
        float fW0 = rt1Var.w0(this.b, i);
        n44Var.b(n44Var.d() + 1);
        float[] fArr = n44Var.a;
        int i2 = n44Var.b;
        n44Var.b = i2 + 1;
        fArr[i2] = fW0;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        n44 n44Var = new n44();
        n44Var.a = fArr;
        n44Var.b = fArr.length;
        n44Var.b(10);
        return n44Var;
    }

    @Override // defpackage.i98
    public final float[] j() {
        return new float[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, float[] fArr, int i) {
        float[] fArr2 = fArr;
        st1Var.getClass();
        fArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.f(this.b, i2, fArr2[i2]);
        }
    }
}
