package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vx5 implements sx5 {
    public final my2 a;
    public final /* synthetic */ nz5 b;
    public final /* synthetic */ boolean c;

    public vx5(nz5 nz5Var, boolean z) {
        this.b = nz5Var;
        this.c = z;
        this.a = bl7.f(new tx5(0, nz5Var));
    }

    @Override // defpackage.sx5
    public final int a() {
        nz5 nz5Var = this.b;
        return (int) (nz5Var.j().c() == fl7.t ? nz5Var.j().a() & 4294967295L : nz5Var.j().a() >> 32);
    }

    @Override // defpackage.sx5
    public final float b() {
        nz5 nz5Var = this.b;
        return (nz5Var.h() * 500) + nz5Var.i();
    }

    @Override // defpackage.sx5
    public final int c() {
        nz5 nz5Var = this.b;
        return nz5Var.j().b() + nz5Var.j().d();
    }

    @Override // defpackage.sx5
    public final float d() {
        nz5 nz5Var = this.b;
        int iH = nz5Var.h();
        int i = nz5Var.i();
        return nz5Var.d() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }

    @Override // defpackage.sx5
    public final ah1 e() {
        boolean z = this.c;
        my2 my2Var = this.a;
        return z ? new ah1(((Number) my2Var.getValue()).intValue(), 1) : new ah1(1, ((Number) my2Var.getValue()).intValue());
    }

    @Override // defpackage.sx5
    public final Object f(int i, ay5.a aVar) throws Throwable {
        Object objK = nz5.k(this.b, i, aVar);
        return objK == v72.t ? objK : g2b.a;
    }
}
