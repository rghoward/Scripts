package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1b extends i98<d1b, e1b, f1b> {
    public static final g1b c = new g1b(h1b.a);

    @Override // defpackage.t0
    public final int d(Object obj) {
        return ((e1b) obj).t.length;
    }

    @Override // defpackage.dh1, defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        f1b f1bVar = (f1b) obj;
        f1bVar.getClass();
        short sT0 = rt1Var.u(this.b, i).t0();
        f1bVar.b(f1bVar.d() + 1);
        short[] sArr = f1bVar.a;
        int i2 = f1bVar.b;
        f1bVar.b = i2 + 1;
        sArr[i2] = sT0;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        short[] sArr = ((e1b) obj).t;
        f1b f1bVar = new f1b();
        f1bVar.a = sArr;
        f1bVar.b = sArr.length;
        f1bVar.b(10);
        return f1bVar;
    }

    @Override // defpackage.i98
    public final e1b j() {
        return new e1b(new short[0]);
    }

    @Override // defpackage.i98
    public final void k(st1 st1Var, e1b e1bVar, int i) {
        short[] sArr = e1bVar.t;
        st1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            st1Var.A(this.b, i2).c(sArr[i2]);
        }
    }
}
