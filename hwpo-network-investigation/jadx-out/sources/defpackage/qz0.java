package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qz0 extends i98<Byte, byte[], nz0> {
    public static final qz0 c = new qz0(zz0.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        nz0 nz0Var = (nz0) obj;
        nz0Var.getClass();
        byte bN = rt1Var.N(this.b, i);
        nz0Var.b(nz0Var.d() + 1);
        byte[] bArr = nz0Var.a;
        int i2 = nz0Var.b;
        nz0Var.b = i2 + 1;
        bArr[i2] = bN;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        nz0 nz0Var = new nz0();
        nz0Var.a = bArr;
        nz0Var.b = bArr.length;
        nz0Var.b(10);
        return nz0Var;
    }

    @Override // defpackage.i98
    public final byte[] j() {
        return new byte[0];
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        st1Var.getClass();
        bArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.l(this.b, i2, bArr2[i2]);
        }
    }
}
