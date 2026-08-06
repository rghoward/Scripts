package defpackage;

import androidx.media3.exoplayer.g;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sf1 implements up6, up6.a {
    public tf1.c A;
    public final up6 t;
    public up6.a u;
    public a[] v = new a[0];
    public long w;
    public long x;
    public long y;
    public long z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements xz8 {
        public final xz8 a;
        public boolean b;

        public a(xz8 xz8Var) {
            this.a = xz8Var;
        }

        @Override // defpackage.xz8
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.xz8
        public final boolean b() {
            return !sf1.this.h() && this.a.b();
        }

        @Override // defpackage.xz8
        public final int c(long j) {
            if (sf1.this.h()) {
                return -3;
            }
            return this.a.c(j);
        }

        @Override // defpackage.xz8
        public final int d(jd4 jd4Var, nn2 nn2Var, int i) {
            sf1 sf1Var = sf1.this;
            if (sf1Var.h()) {
                return -3;
            }
            if (this.b) {
                nn2Var.t = 4;
                return -4;
            }
            long jQ = sf1Var.q();
            int iD = this.a.d(jd4Var, nn2Var, i);
            if (sf1Var.x != -9223372036854775807L && iD != -3) {
                sf1Var.x = -9223372036854775807L;
            }
            if (iD != -5) {
                long j = sf1Var.z;
                if (j == Long.MIN_VALUE || ((iD != -4 || nn2Var.y < j) && !(iD == -3 && jQ == Long.MIN_VALUE && !nn2Var.x))) {
                    return iD;
                }
                nn2Var.j();
                nn2Var.t = 4;
                this.b = true;
                return -4;
            }
            long j2 = sf1Var.y;
            long j3 = sf1Var.z;
            id4 id4Var = jd4Var.b;
            id4Var.getClass();
            int i2 = id4Var.K;
            int i3 = id4Var.J;
            if (i3 != 0 || i2 != 0) {
                if (j2 != 0) {
                    i3 = 0;
                }
                if (j3 != Long.MIN_VALUE) {
                    i2 = 0;
                }
                id4.a aVarA = id4Var.a();
                aVarA.I = i3;
                aVarA.J = i2;
                jd4Var.b = new id4(aVarA);
            }
            return -5;
        }
    }

    public sf1(up6 up6Var, boolean z, long j, long j2, int i) {
        this.t = up6Var;
        this.w = z ? j : -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.y = j;
        this.z = j2;
    }

    @Override // up6.a
    public final void a(up6 up6Var) {
        if (this.A != null) {
            return;
        }
        up6.a aVar = this.u;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // bd9.a
    public final void b(bd9 bd9Var) {
        up6.a aVar = this.u;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        return this.t.c(gVar);
    }

    @Override // defpackage.up6
    public final long d(fq3[] fq3VarArr, boolean[] zArr, xz8[] xz8VarArr, boolean[] zArr2, long j) {
        long j2;
        this.v = new a[xz8VarArr.length];
        xz8[] xz8VarArr2 = new xz8[xz8VarArr.length];
        for (int i = 0; i < xz8VarArr.length; i++) {
            a[] aVarArr = this.v;
            a aVar = (a) xz8VarArr[i];
            aVarArr[i] = aVar;
            xz8VarArr2[i] = aVar != null ? aVar.a : null;
        }
        long jD = this.t.d(fq3VarArr, zArr, xz8VarArr2, zArr2, j);
        long j3 = this.z;
        long jMax = Math.max(jD, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (h()) {
            if (jD >= j) {
                if (jD != 0) {
                    int length = fq3VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            fq3 fq3Var = fq3VarArr[i2];
                            if (fq3Var != null) {
                                id4 id4VarR = fq3Var.r();
                                if (!fv6.a(id4VarR.o, id4VarR.k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.w = j2;
        for (int i3 = 0; i3 < xz8VarArr.length; i3++) {
            xz8 xz8Var = xz8VarArr2[i3];
            a[] aVarArr2 = this.v;
            if (xz8Var == null) {
                aVarArr2[i3] = null;
            } else {
                a aVar2 = aVarArr2[i3];
                if (aVar2 == null || aVar2.a != xz8Var) {
                    aVarArr2[i3] = new a(xz8Var);
                }
            }
            xz8VarArr[i3] = aVarArr2[i3];
        }
        return jMax;
    }

    @Override // defpackage.bd9
    public final long e() {
        long jE = this.t.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.z;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.up6
    public final long f(long j, u89 u89Var) {
        long j2 = this.y;
        if (j == j2) {
            return j2;
        }
        long j3 = n6b.j(u89Var.a, 0L, j - j2);
        long j4 = u89Var.b;
        long j5 = this.z;
        long j6 = n6b.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != u89Var.a || j6 != u89Var.b) {
            u89Var = new u89(j3, j6);
        }
        return this.t.f(j, u89Var);
    }

    @Override // defpackage.up6
    public final void g() throws tf1.c {
        tf1.c cVar = this.A;
        if (cVar != null) {
            throw cVar;
        }
        this.t.g();
    }

    public final boolean h() {
        return this.w != -9223372036854775807L;
    }

    @Override // defpackage.up6
    public final long i(long j) {
        this.w = -9223372036854775807L;
        for (a aVar : this.v) {
            if (aVar != null) {
                aVar.b = false;
            }
        }
        long jI = this.t.i(j);
        long j2 = this.y;
        long j3 = this.z;
        long jMax = Math.max(jI, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.bd9
    public final boolean j() {
        return this.t.j();
    }

    @Override // defpackage.up6
    public final long l() {
        if (h()) {
            long j = this.w;
            this.w = -9223372036854775807L;
            this.x = j;
            long jL = l();
            return jL != -9223372036854775807L ? jL : j;
        }
        long jL2 = this.t.l();
        if (jL2 != -9223372036854775807L) {
            long j2 = this.y;
            long j3 = this.z;
            long jMax = Math.max(jL2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.x) {
                this.x = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.up6
    public final void m(up6.a aVar, long j) {
        this.u = aVar;
        this.t.m(this, j);
    }

    @Override // defpackage.up6
    public final gsa n() {
        return this.t.n();
    }

    @Override // defpackage.bd9
    public final long q() {
        long jQ = this.t.q();
        if (jQ != Long.MIN_VALUE) {
            long j = this.z;
            if (j == Long.MIN_VALUE || jQ < j) {
                return jQ;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.up6
    public final void s(long j, boolean z) {
        this.t.s(j, z);
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        this.t.v(j);
    }
}
