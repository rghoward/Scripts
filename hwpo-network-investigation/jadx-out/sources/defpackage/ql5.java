package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ql5 implements js3 {
    public final js3 a;

    public ql5(int i) {
        if ((i & 1) != 0) {
            this.a = new pq9(65496, 2, "image/jpeg");
        } else {
            this.a = new rl5();
        }
    }

    @Override // defpackage.js3
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        return this.a.c(ks3Var, o68Var);
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        return this.a.d(ks3Var);
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.a.e(j, j2);
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.a.g(ls3Var);
    }
}
