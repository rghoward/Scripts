package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pq9 implements js3 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public ls3 f;
    public hsa g;

    public pq9(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            d43.c();
            return 0;
        }
        hsa hsaVar = this.g;
        hsaVar.getClass();
        int iF = hsaVar.f(ks3Var, 1024, true);
        if (iF != -1) {
            this.d += iF;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        int i = this.b;
        int i2 = this.a;
        xl7.r((i2 == -1 || i == -1) ? false : true);
        pt7 pt7Var = new pt7(i);
        ((zq2) ks3Var).f(pt7Var.a, 0, i, false);
        return pt7Var.G() == i2;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.f = ls3Var;
        hsa hsaVarP = ls3Var.p(1024, 4);
        this.g = hsaVarP;
        id4.a aVar = new id4.a();
        String str = this.c;
        aVar.m = fv6.n(str);
        aVar.n = fv6.n(str);
        hy1.b(aVar, hsaVarP);
        this.f.k();
        this.f.t(new qq9());
        this.e = 1;
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
