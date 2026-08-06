package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zu4 implements js3 {
    public ls3 b;
    public ks3 c;
    public qz9 d;
    public vz6 e;
    public int g;
    public long h;
    public int i;
    public final pt7 a = new pt7(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.js3
    public final void a() {
        vz6 vz6Var = this.e;
        if (vz6Var != null) {
            vz6Var.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                pt7 pt7Var = this.a;
                if (i2 == 0) {
                    if (!ks3Var.b(pt7Var.a, 0, 8, true)) {
                        ls3 ls3Var = this.b;
                        ls3Var.getClass();
                        ls3Var.k();
                        this.b.t(new t89.b(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    pt7Var.M(0);
                    this.h = pt7Var.B();
                    this.g = pt7Var.m();
                }
                if (this.h == 1) {
                    ks3Var.readFully(pt7Var.a, 8, 8);
                    this.i += 8;
                    this.h = pt7Var.F();
                }
                if (this.g == 1836086884) {
                    long position = ks3Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    sy6 sy6Var = new sy6(0L, position - j, -9223372036854775807L, position, this.h - j);
                    ls3 ls3Var2 = this.b;
                    ls3Var2.getClass();
                    hsa hsaVarP = ls3Var2.p(1024, 4);
                    id4.a aVar = new id4.a();
                    aVar.m = fv6.n("image/heic");
                    aVar.k = new su6(sy6Var);
                    hy1.b(aVar, hsaVarP);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                ks3Var.m((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        d43.c();
                        return 0;
                    }
                    if (this.d == null || ks3Var != this.c) {
                        this.c = ks3Var;
                        this.d = new qz9(ks3Var, this.j);
                    }
                    vz6 vz6Var = this.e;
                    vz6Var.getClass();
                    int iC = vz6Var.c(this.d, o68Var);
                    if (iC == 1) {
                        o68Var.a += this.j;
                    }
                    return iC;
                }
                if (this.e == null) {
                    this.e = new vz6(z4a.a.a, 8);
                }
                qz9 qz9Var = new qz9(ks3Var, this.j);
                this.d = qz9Var;
                if (this.e.d(qz9Var)) {
                    vz6 vz6Var2 = this.e;
                    long j2 = this.j;
                    ls3 ls3Var3 = this.b;
                    ls3Var3.getClass();
                    vz6Var2.g(new rz9(j2, ls3Var3));
                    this.f = 3;
                } else {
                    ls3 ls3Var4 = this.b;
                    ls3Var4.getClass();
                    ls3Var4.k();
                    this.b.t(new t89.b(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        return utb.e((zq2) ks3Var, true);
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                vz6 vz6Var = this.e;
                vz6Var.getClass();
                vz6Var.e(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.b = ls3Var;
    }
}
