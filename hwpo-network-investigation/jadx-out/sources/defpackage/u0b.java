package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0b extends i98<r0b, s0b, t0b> {
    public static final u0b c = new u0b(v0b.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        return ((s0b) obj).t.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        t0b t0bVar = (t0b) obj;
        t0bVar.getClass();
        int iO = rt1Var.u(this.b, i).O();
        t0bVar.b(t0bVar.d() + 1);
        int[] iArr = t0bVar.a;
        int i2 = t0bVar.b;
        t0bVar.b = i2 + 1;
        iArr[i2] = iO;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        int[] iArr = ((s0b) obj).t;
        t0b t0bVar = new t0b();
        t0bVar.a = iArr;
        t0bVar.b = iArr.length;
        t0bVar.b(10);
        return t0bVar;
    }

    @Override // defpackage.i98
    public final s0b j() {
        return new s0b(new int[0]);
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, s0b s0bVar, int i) {
        int[] iArr = s0bVar.t;
        st1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.A(this.b, i2).u(iArr[i2]);
        }
    }
}
