package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qx7 implements pya {
    public final ce3 a;
    public final ot7 b = new ot7(new byte[10], 10);
    public int c = 0;
    public int d;
    public apa e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public qx7(ce3 ce3Var) {
        this.a = ce3Var;
    }

    @Override // defpackage.pya
    public final void a(int i, pt7 pt7Var) {
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        ce3 ce3Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    md6.g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        d43.c();
                        return;
                    }
                    if (this.j != -1) {
                        md6.g("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    ce3Var.d(pt7Var.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (pt7Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                ot7 ot7Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(pt7Var, ot7Var.a, Math.min(10, this.i)) && d(pt7Var, null, this.i)) {
                            ot7Var.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                ot7Var.o(4);
                                long jG = ((long) ot7Var.g(3)) << 30;
                                ot7Var.o(1);
                                long jG2 = ((long) (ot7Var.g(15) << 15)) | jG;
                                ot7Var.o(1);
                                long jG3 = jG2 | ((long) ot7Var.g(15));
                                ot7Var.o(1);
                                if (!this.h && this.g) {
                                    ot7Var.o(4);
                                    long jG4 = ((long) ot7Var.g(3)) << 30;
                                    ot7Var.o(1);
                                    long jG5 = jG4 | ((long) (ot7Var.g(15) << 15));
                                    ot7Var.o(1);
                                    long jG6 = jG5 | ((long) ot7Var.g(15));
                                    ot7Var.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jG3);
                            }
                            i6 |= this.k ? 4 : 0;
                            ce3Var.e(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            d43.c();
                            return;
                        }
                        int iA = pt7Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            pt7Var.L(pt7Var.b + iA);
                        }
                        ce3Var.a(pt7Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                ce3Var.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(pt7Var, ot7Var.a, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                pt7Var.N(pt7Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // defpackage.pya
    public final void b(apa apaVar, ls3 ls3Var, pya.c cVar) {
        this.e = apaVar;
        this.a.f(ls3Var, cVar);
    }

    @Override // defpackage.pya
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(pt7 pt7Var, byte[] bArr, int i) {
        int iMin = Math.min(pt7Var.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            pt7Var.N(iMin);
        } else {
            pt7Var.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        ot7 ot7Var = this.b;
        ot7Var.m(0);
        int iG = ot7Var.g(24);
        if (iG != 1) {
            d80.a(iG, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        ot7Var.o(8);
        int iG2 = ot7Var.g(16);
        ot7Var.o(5);
        this.k = ot7Var.f();
        ot7Var.o(2);
        this.f = ot7Var.f();
        this.g = ot7Var.f();
        ot7Var.o(6);
        int iG3 = ot7Var.g(8);
        this.i = iG3;
        if (iG2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (iG2 - 3) - iG3;
        this.j = i;
        if (i < 0) {
            md6.g("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
