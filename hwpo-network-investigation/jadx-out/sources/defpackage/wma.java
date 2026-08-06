package defpackage;

import androidx.media3.exoplayer.g;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wma implements up6, up6.a {
    public final up6 t;
    public final long u;
    public up6.a v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements xz8 {
        public final xz8 a;
        public final long b;

        public a(xz8 xz8Var, long j) {
            this.a = xz8Var;
            this.b = j;
        }

        @Override // defpackage.xz8
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.xz8
        public final boolean b() {
            return this.a.b();
        }

        @Override // defpackage.xz8
        public final int c(long j) {
            return this.a.c(j - this.b);
        }

        @Override // defpackage.xz8
        public final int d(jd4 jd4Var, nn2 nn2Var, int i) {
            int iD = this.a.d(jd4Var, nn2Var, i);
            if (iD == -4) {
                nn2Var.y += this.b;
            }
            return iD;
        }
    }

    public wma(up6 up6Var, long j) {
        this.t = up6Var;
        this.u = j;
    }

    @Override // up6.a
    public final void a(up6 up6Var) {
        up6.a aVar = this.v;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // bd9.a
    public final void b(bd9 bd9Var) {
        up6.a aVar = this.v;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        g.a aVar = new g.a();
        long j = gVar.a;
        aVar.b = gVar.b;
        aVar.c = gVar.c;
        aVar.a = j - this.u;
        return this.t.c(new g(aVar));
    }

    @Override // defpackage.up6
    public final long d(fq3[] fq3VarArr, boolean[] zArr, xz8[] xz8VarArr, boolean[] zArr2, long j) {
        xz8[] xz8VarArr2 = new xz8[xz8VarArr.length];
        int i = 0;
        while (true) {
            xz8 xz8Var = null;
            if (i >= xz8VarArr.length) {
                break;
            }
            a aVar = (a) xz8VarArr[i];
            if (aVar != null) {
                xz8Var = aVar.a;
            }
            xz8VarArr2[i] = xz8Var;
            i++;
        }
        up6 up6Var = this.t;
        long j2 = this.u;
        long jD = up6Var.d(fq3VarArr, zArr, xz8VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < xz8VarArr.length; i2++) {
            xz8 xz8Var2 = xz8VarArr2[i2];
            if (xz8Var2 == null) {
                xz8VarArr[i2] = null;
            } else {
                xz8 xz8Var3 = xz8VarArr[i2];
                if (xz8Var3 == null || ((a) xz8Var3).a != xz8Var2) {
                    xz8VarArr[i2] = new a(xz8Var2, j2);
                }
            }
        }
        return jD + j2;
    }

    @Override // defpackage.bd9
    public final long e() {
        long jE = this.t.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jE + this.u;
    }

    @Override // defpackage.up6
    public final long f(long j, u89 u89Var) {
        long j2 = this.u;
        return this.t.f(j - j2, u89Var) + j2;
    }

    @Override // defpackage.up6
    public final void g() {
        this.t.g();
    }

    @Override // defpackage.up6
    public final long i(long j) {
        long j2 = this.u;
        return this.t.i(j - j2) + j2;
    }

    @Override // defpackage.bd9
    public final boolean j() {
        return this.t.j();
    }

    @Override // defpackage.up6
    public final long l() {
        long jL = this.t.l();
        if (jL == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jL + this.u;
    }

    @Override // defpackage.up6
    public final void m(up6.a aVar, long j) {
        this.v = aVar;
        this.t.m(this, j - this.u);
    }

    @Override // defpackage.up6
    public final gsa n() {
        return this.t.n();
    }

    @Override // defpackage.bd9
    public final long q() {
        long jQ = this.t.q();
        if (jQ == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jQ + this.u;
    }

    @Override // defpackage.up6
    public final void s(long j, boolean z) {
        this.t.s(j - this.u, z);
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        this.t.v(j - this.u);
    }
}
