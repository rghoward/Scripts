package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class bv4 extends vx6<fv4> {
    public final wja t;
    public final int u;
    public final int v;

    public bv4(wja wjaVar, int i, int i2) {
        this.t = wjaVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        fv4 fv4Var = new fv4();
        fv4Var.H = this.t;
        fv4Var.I = this.u;
        fv4Var.J = this.v;
        fv4Var.L = -1;
        fv4Var.M = -1;
        return fv4Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        fv4 fv4Var = (fv4) cVar;
        wja wjaVar = fv4Var.H;
        wja wjaVar2 = this.t;
        boolean zA = xj5.a(wjaVar, wjaVar2);
        int i = this.u;
        int i2 = this.v;
        if (zA && fv4Var.I == i && fv4Var.J == i2) {
            return;
        }
        fv4Var.H = wjaVar2;
        fv4Var.I = i;
        fv4Var.J = i2;
        fv4Var.N = zu1.d(wjaVar2, ew2.f(fv4Var).S);
        fv4Var.K = true;
        ew2.f(fv4Var).Q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv4)) {
            return false;
        }
        bv4 bv4Var = (bv4) obj;
        return xj5.a(this.t, bv4Var.t) && this.u == bv4Var.u && this.v == bv4Var.v;
    }

    public final int hashCode() {
        return (((this.t.hashCode() * 31) + this.u) * 31) + this.v;
    }
}
