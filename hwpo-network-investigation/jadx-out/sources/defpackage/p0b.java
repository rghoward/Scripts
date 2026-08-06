package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0b extends i98<m0b, n0b, o0b> {
    public static final p0b c = new p0b(q0b.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        return ((n0b) obj).t.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        o0b o0bVar = (o0b) obj;
        o0bVar.getClass();
        byte bQ0 = rt1Var.u(this.b, i).q0();
        o0bVar.b(o0bVar.d() + 1);
        byte[] bArr = o0bVar.a;
        int i2 = o0bVar.b;
        o0bVar.b = i2 + 1;
        bArr[i2] = bQ0;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        byte[] bArr = ((n0b) obj).t;
        o0b o0bVar = new o0b();
        o0bVar.a = bArr;
        o0bVar.b = bArr.length;
        o0bVar.b(10);
        return o0bVar;
    }

    @Override // defpackage.i98
    public final n0b j() {
        return new n0b(new byte[0]);
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, n0b n0bVar, int i) {
        byte[] bArr = n0bVar.t;
        st1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.A(this.b, i2).d(bArr[i2]);
        }
    }
}
