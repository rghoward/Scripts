package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class flb implements js3 {
    public final pt7 a = new pt7(4);
    public final pq9 b = new pq9(-1, -1, "image/webp");

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        return this.b.c(ks3Var, o68Var);
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        pt7 pt7Var = this.a;
        pt7Var.J(4);
        zq2 zq2Var = (zq2) ks3Var;
        zq2Var.f(pt7Var.a, 0, 4, false);
        if (pt7Var.B() == 1380533830) {
            zq2Var.o(4, false);
            pt7Var.J(4);
            zq2Var.f(pt7Var.a, 0, 4, false);
            if (pt7Var.B() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.b.e(j, j2);
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.b.g(ls3Var);
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
