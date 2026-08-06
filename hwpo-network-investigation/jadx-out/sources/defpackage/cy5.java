package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cy5 implements pv5 {
    public final nz5 a;

    public cy5(nz5 nz5Var) {
        this.a = nz5Var;
    }

    @Override // defpackage.pv5
    public final int b() {
        return this.a.j().e();
    }

    @Override // defpackage.pv5
    public final int c() {
        return Math.min(b() - 1, ((hy5) th1.G(this.a.j().g())).getIndex());
    }

    @Override // defpackage.pv5
    public final int d() {
        int i;
        nz5 nz5Var = this.a;
        if (nz5Var.j().g().isEmpty()) {
            return 0;
        }
        ty5 ty5VarJ = nz5Var.j();
        int iA = (int) (ty5VarJ.c() == fl7.t ? ty5VarJ.a() & 4294967295L : ty5VarJ.a() >> 32);
        int iE = uy5.e(nz5Var.j());
        if (iE != 0 && (i = iA / iE) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.pv5
    public final boolean e() {
        return !this.a.j().g().isEmpty();
    }

    @Override // defpackage.pv5
    public final int f() {
        return Math.max(0, this.a.h());
    }
}
