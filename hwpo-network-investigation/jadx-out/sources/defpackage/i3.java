package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements ce3 {
    public final ot7 a;
    public final pt7 b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public hsa g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public id4 l;
    public int m;
    public long n;

    public i3(String str, int i, String str2) {
        ot7 ot7Var = new ot7(new byte[16], 16);
        this.a = ot7Var;
        this.b = new pt7(ot7Var.a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        this.g.getClass();
        while (pt7Var.a() > 0) {
            int i = this.h;
            pt7 pt7Var2 = this.b;
            if (i == 0) {
                while (pt7Var.a() > 0) {
                    if (this.j) {
                        int iZ = pt7Var.z();
                        this.j = iZ == 172;
                        if (iZ == 64 || iZ == 65) {
                            boolean z = iZ == 65;
                            this.h = 1;
                            byte[] bArr = pt7Var2.a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.i = 2;
                            break;
                        }
                    } else {
                        this.j = pt7Var.z() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = pt7Var2.a;
                int iMin = Math.min(pt7Var.a(), 16 - this.i);
                pt7Var.k(bArr2, this.i, iMin);
                int i2 = this.i + iMin;
                this.i = i2;
                if (i2 == 16) {
                    ot7 ot7Var = this.a;
                    ot7Var.m(0);
                    j3.b bVarB = j3.b(ot7Var);
                    int i3 = bVarB.a;
                    id4 id4Var = this.l;
                    if (id4Var == null || 2 != id4Var.G || i3 != id4Var.H || !"audio/ac4".equals(id4Var.o)) {
                        id4.a aVar = new id4.a();
                        aVar.a = this.f;
                        aVar.m = fv6.n(this.e);
                        aVar.n = fv6.n("audio/ac4");
                        aVar.F = 2;
                        aVar.G = i3;
                        aVar.d = this.c;
                        aVar.f = this.d;
                        id4 id4Var2 = new id4(aVar);
                        this.l = id4Var2;
                        this.g.g(id4Var2);
                    }
                    this.m = bVarB.b;
                    this.k = (((long) bVarB.c) * 1000000) / ((long) this.l.H);
                    pt7Var2.M(0);
                    this.g.e(16, pt7Var2);
                    this.h = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(pt7Var.a(), this.m - this.i);
                this.g.e(iMin2, pt7Var);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 == this.m) {
                    xl7.r(this.n != -9223372036854775807L);
                    this.g.a(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = ls3Var.p(cVar.d, 1);
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
    }
}
