package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rp7 implements pv5 {
    public final dr7 a;

    public rp7(dr7 dr7Var) {
        this.a = dr7Var;
    }

    @Override // defpackage.pv5
    public final int b() {
        return this.a.o();
    }

    @Override // defpackage.pv5
    public final int c() {
        dr7 dr7Var = this.a;
        return Math.min(dr7Var.o() - 1, ((kp7) th1.G(dr7Var.n().f())).getIndex());
    }

    @Override // defpackage.pv5
    public final int d() {
        int i;
        dr7 dr7Var = this.a;
        if (dr7Var.n().f().size() == 0) {
            return 0;
        }
        int iB = oq3.b(dr7Var.n());
        int i2 = dr7Var.n().i() + dr7Var.n().g();
        if (i2 != 0 && (i = iB / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.pv5
    public final boolean e() {
        return !this.a.n().f().isEmpty();
    }

    @Override // defpackage.pv5
    public final int f() {
        return Math.max(0, this.a.e);
    }
}
