package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bq5 implements ce3 {
    public final String a;
    public final int b;
    public final pt7 c;
    public final ot7 d;
    public hsa e;
    public String f;
    public id4 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public bq5(String str, int i) {
        this.a = str;
        this.b = i;
        pt7 pt7Var = new pt7(1024);
        this.c = pt7Var;
        byte[] bArr = pt7Var.a;
        this.d = new ot7(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) throws ut7 {
        int iG;
        boolean zF;
        this.e.getClass();
        while (pt7Var.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    pt7 pt7Var2 = this.c;
                    ot7 ot7Var = this.d;
                    if (i == 2) {
                        int iZ = ((this.k & (-225)) << 8) | pt7Var.z();
                        this.j = iZ;
                        if (iZ > pt7Var2.a.length) {
                            pt7Var2.J(iZ);
                            byte[] bArr = pt7Var2.a;
                            ot7Var.getClass();
                            ot7Var.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            d43.c();
                            return;
                        }
                        int iMin = Math.min(pt7Var.a(), this.j - this.i);
                        pt7Var.k(ot7Var.a, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            ot7Var.m(0);
                            if (ot7Var.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = ot7Var.g(1);
                                int iG3 = iG2 == 1 ? ot7Var.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw ut7.a(null, null);
                                }
                                if (iG2 == 1) {
                                    ot7Var.g((ot7Var.g(2) + 1) * 8);
                                }
                                if (!ot7Var.f()) {
                                    throw ut7.a(null, null);
                                }
                                this.o = ot7Var.g(6);
                                int iG4 = ot7Var.g(4);
                                int iG5 = ot7Var.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ut7.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = ot7Var.e();
                                    int iB = ot7Var.b();
                                    x.a aVarB = x.b(ot7Var, true);
                                    this.v = aVarB.c;
                                    this.s = aVarB.a;
                                    this.u = aVarB.b;
                                    int iB2 = iB - ot7Var.b();
                                    ot7Var.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    ot7Var.h(bArr2, iB2);
                                    id4.a aVar = new id4.a();
                                    aVar.a = this.f;
                                    aVar.m = fv6.n("video/mp2t");
                                    aVar.n = fv6.n("audio/mp4a-latm");
                                    aVar.j = this.v;
                                    aVar.F = this.u;
                                    aVar.G = this.s;
                                    aVar.q = Collections.singletonList(bArr2);
                                    aVar.d = this.a;
                                    aVar.f = this.b;
                                    id4 id4Var = new id4(aVar);
                                    if (!id4Var.equals(this.g)) {
                                        this.g = id4Var;
                                        this.t = 1024000000 / ((long) id4Var.H);
                                        this.e.g(id4Var);
                                    }
                                } else {
                                    int iG6 = ot7Var.g((ot7Var.g(2) + 1) * 8);
                                    int iB3 = ot7Var.b();
                                    x.a aVarB2 = x.b(ot7Var, true);
                                    this.v = aVarB2.c;
                                    this.s = aVarB2.a;
                                    this.u = aVarB2.b;
                                    ot7Var.o(iG6 - (iB3 - ot7Var.b()));
                                }
                                int iG7 = ot7Var.g(3);
                                this.p = iG7;
                                if (iG7 == 0) {
                                    ot7Var.o(8);
                                } else if (iG7 == 1) {
                                    ot7Var.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    ot7Var.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        d43.c();
                                        return;
                                    }
                                    ot7Var.o(1);
                                }
                                boolean zF2 = ot7Var.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = ot7Var.g((ot7Var.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = ot7Var.f();
                                            this.r = (this.r << 8) + ((long) ot7Var.g(8));
                                        } while (zF);
                                    }
                                }
                                if (ot7Var.f()) {
                                    ot7Var.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ut7.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ut7.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ut7.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = ot7Var.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = ot7Var.e();
                            if ((iE2 & 7) == 0) {
                                pt7Var2.M(iE2 >> 3);
                            } else {
                                ot7Var.h(pt7Var2.a, i3 * 8);
                                pt7Var2.M(0);
                            }
                            this.e.e(i3, pt7Var2);
                            xl7.r(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                ot7Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iZ2 = pt7Var.z();
                    if ((iZ2 & 224) == 224) {
                        this.k = iZ2;
                        this.h = 2;
                    } else if (iZ2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (pt7Var.z() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.e = ls3Var.p(cVar.d, 1);
        cVar.b();
        this.f = cVar.e;
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
    }
}
