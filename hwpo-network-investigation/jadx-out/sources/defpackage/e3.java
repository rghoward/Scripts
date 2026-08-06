package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements ce3 {
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

    public e3(String str, int i, String str2) {
        ot7 ot7Var = new ot7(new byte[128], 128);
        this.a = ot7Var;
        this.b = new pt7(ot7Var.a);
        this.h = 0;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:149:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int iG;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.g.getClass();
        while (pt7Var.a() > 0) {
            int i17 = this.h;
            pt7 pt7Var2 = this.b;
            if (i17 == 0) {
                while (pt7Var.a() > 0) {
                    if (this.j) {
                        int iZ = pt7Var.z();
                        if (iZ == 119) {
                            this.j = false;
                            this.h = 1;
                            byte[] bArr = pt7Var2.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.i = 2;
                            break;
                        }
                        this.j = iZ == 11;
                    } else {
                        this.j = pt7Var.z() == 11;
                    }
                }
            } else if (i17 == 1) {
                byte[] bArr2 = pt7Var2.a;
                int iMin = Math.min(pt7Var.a(), 128 - this.i);
                pt7Var.k(bArr2, this.i, iMin);
                int i18 = this.i + iMin;
                this.i = i18;
                if (i18 == 128) {
                    ot7 ot7Var = this.a;
                    ot7Var.m(0);
                    int iE = ot7Var.e();
                    ot7Var.o(40);
                    Object[] objArr = ot7Var.g(5) > 10;
                    ot7Var.m(iE);
                    int[] iArr = f3.d;
                    int[] iArr2 = f3.b;
                    if (objArr == true) {
                        ot7Var.o(16);
                        int iG2 = ot7Var.g(2);
                        if (iG2 == 0) {
                            b = 0;
                        } else if (iG2 != 1) {
                            b = iG2 != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        ot7Var.o(3);
                        iG = (ot7Var.g(11) + 1) * 2;
                        int iG3 = ot7Var.g(2);
                        if (iG3 == 3) {
                            i5 = f3.c[ot7Var.g(2)];
                            i6 = 3;
                            i7 = 6;
                        } else {
                            int iG4 = ot7Var.g(2);
                            int i19 = f3.a[iG4];
                            i5 = iArr2[iG3];
                            i6 = iG4;
                            i7 = i19;
                        }
                        i3 = i7 * 256;
                        int i20 = (iG * i5) / (i7 * 32);
                        int iG5 = ot7Var.g(3);
                        boolean zF = ot7Var.f();
                        i2 = iArr[iG5] + (zF ? 1 : 0);
                        ot7Var.o(10);
                        if (ot7Var.f()) {
                            ot7Var.o(8);
                        }
                        if (iG5 == 0) {
                            ot7Var.o(5);
                            if (ot7Var.f()) {
                                ot7Var.o(8);
                            }
                        }
                        if (b == 1 && ot7Var.f()) {
                            ot7Var.o(16);
                        }
                        if (ot7Var.f()) {
                            if (iG5 > 2) {
                                ot7Var.o(2);
                            }
                            if ((iG5 & 1) == 0 || iG5 <= 2) {
                                i12 = 6;
                            } else {
                                i12 = 6;
                                ot7Var.o(6);
                            }
                            if ((iG5 & 4) != 0) {
                                ot7Var.o(i12);
                            }
                            if (zF && ot7Var.f()) {
                                ot7Var.o(5);
                            }
                            if (b != 0) {
                                i8 = i6;
                            } else {
                                if (ot7Var.f()) {
                                    i13 = 6;
                                    ot7Var.o(6);
                                } else {
                                    i13 = 6;
                                }
                                if (iG5 == 0 && ot7Var.f()) {
                                    ot7Var.o(i13);
                                }
                                if (ot7Var.f()) {
                                    ot7Var.o(i13);
                                }
                                int iG6 = ot7Var.g(2);
                                if (iG6 == 1) {
                                    ot7Var.o(5);
                                    i15 = 2;
                                } else {
                                    if (iG6 == 2) {
                                        ot7Var.o(12);
                                    } else if (iG6 == 3) {
                                        int iG7 = ot7Var.g(5);
                                        if (ot7Var.f()) {
                                            ot7Var.o(5);
                                            if (ot7Var.f()) {
                                                i16 = 4;
                                                ot7Var.o(4);
                                            } else {
                                                i16 = 4;
                                            }
                                            if (ot7Var.f()) {
                                                ot7Var.o(i16);
                                            }
                                            if (ot7Var.f()) {
                                                ot7Var.o(i16);
                                            }
                                            if (ot7Var.f()) {
                                                ot7Var.o(i16);
                                            }
                                            if (ot7Var.f()) {
                                                ot7Var.o(i16);
                                            }
                                            if (ot7Var.f()) {
                                                ot7Var.o(i16);
                                            }
                                            if (ot7Var.f()) {
                                                ot7Var.o(i16);
                                            }
                                            if (ot7Var.f()) {
                                                if (ot7Var.f()) {
                                                    ot7Var.o(i16);
                                                }
                                                if (ot7Var.f()) {
                                                    ot7Var.o(i16);
                                                }
                                            }
                                        }
                                        if (ot7Var.f()) {
                                            ot7Var.o(5);
                                            if (ot7Var.f()) {
                                                ot7Var.o(7);
                                                if (ot7Var.f()) {
                                                    i14 = 8;
                                                    ot7Var.o(8);
                                                } else {
                                                    i14 = 8;
                                                }
                                            } else {
                                                i14 = 8;
                                            }
                                        } else {
                                            i14 = 8;
                                        }
                                        i15 = 2;
                                        ot7Var.o((iG7 + 2) * i14);
                                        ot7Var.c();
                                    }
                                    i15 = 2;
                                }
                                if (iG5 < i15) {
                                    if (ot7Var.f()) {
                                        ot7Var.o(14);
                                    }
                                    if (iG5 == 0 && ot7Var.f()) {
                                        ot7Var.o(14);
                                    }
                                }
                                if (ot7Var.f()) {
                                    i8 = i6;
                                    if (i8 == 0) {
                                        ot7Var.o(5);
                                    } else {
                                        for (int i21 = 0; i21 < i7; i21++) {
                                            if (ot7Var.f()) {
                                                ot7Var.o(5);
                                            }
                                        }
                                    }
                                } else {
                                    i8 = i6;
                                }
                            }
                        } else {
                            i8 = i6;
                        }
                        if (ot7Var.f()) {
                            ot7Var.o(5);
                            if (iG5 == 2) {
                                ot7Var.o(4);
                            }
                            if (iG5 >= 6) {
                                ot7Var.o(2);
                            }
                            if (ot7Var.f()) {
                                i11 = 8;
                                ot7Var.o(8);
                            } else {
                                i11 = 8;
                            }
                            if (iG5 == 0 && ot7Var.f()) {
                                ot7Var.o(i11);
                            }
                            i9 = 3;
                            if (iG3 < 3) {
                                ot7Var.n();
                            }
                        } else {
                            i9 = 3;
                        }
                        if (b == 0 && i8 != i9) {
                            ot7Var.n();
                        }
                        if (b == 2 && (i8 == i9 || ot7Var.f())) {
                            i10 = 6;
                            ot7Var.o(6);
                        } else {
                            i10 = 6;
                        }
                        str = (ot7Var.f() && ot7Var.g(i10) == 1 && ot7Var.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i4 = i20;
                    } else {
                        ot7Var.o(32);
                        int iG8 = ot7Var.g(2);
                        String str2 = iG8 == 3 ? null : "audio/ac3";
                        int iG9 = ot7Var.g(6);
                        int i22 = f3.e[iG9 / 2] * 1000;
                        int iA = f3.a(iG8, iG9);
                        ot7Var.o(8);
                        int iG10 = ot7Var.g(3);
                        if ((iG10 & 1) == 0 || iG10 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            ot7Var.o(2);
                        }
                        if ((iG10 & 4) != 0) {
                            ot7Var.o(i);
                        }
                        if (iG10 == i) {
                            ot7Var.o(i);
                        }
                        int i23 = iG8 < 3 ? iArr2[iG8] : -1;
                        i2 = iArr[iG10] + (ot7Var.f() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        i4 = i22;
                        iG = iA;
                        i5 = i23;
                    }
                    id4 id4Var = this.l;
                    if (id4Var == null || i2 != id4Var.G || i5 != id4Var.H || !Objects.equals(str, id4Var.o)) {
                        id4.a aVar = new id4.a();
                        aVar.a = this.f;
                        aVar.m = fv6.n(this.e);
                        aVar.n = fv6.n(str);
                        aVar.F = i2;
                        aVar.G = i5;
                        aVar.d = this.c;
                        aVar.f = this.d;
                        aVar.i = i4;
                        if ("audio/ac3".equals(str)) {
                            aVar.h = i4;
                        }
                        id4 id4Var2 = new id4(aVar);
                        this.l = id4Var2;
                        this.g.g(id4Var2);
                    }
                    this.m = iG;
                    this.k = (((long) i3) * 1000000) / ((long) this.l.H);
                    pt7Var2.M(0);
                    this.g.e(128, pt7Var2);
                    this.h = 2;
                }
            } else if (i17 == 2) {
                int iMin2 = Math.min(pt7Var.a(), this.m - this.i);
                this.g.e(iMin2, pt7Var);
                int i24 = this.i + iMin2;
                this.i = i24;
                if (i24 == this.m) {
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

    public e3(String str) {
        this(null, 0, str);
    }
}
