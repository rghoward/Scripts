package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s34 implements js3 {
    public ls3 e;
    public hsa f;
    public su6 h;
    public x34 i;
    public int j;
    public int k;
    public q34 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final pt7 b = new pt7(new byte[32768], 0);
    public final boolean c = false;
    public final t34.a d = new t34.a();
    public int g = 0;

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        x34 x34Var;
        t89 bVar;
        long j;
        long j2;
        boolean zA;
        int i = this.g;
        su6 su6Var = null;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            ks3Var.l();
            long jG = ks3Var.g();
            su6 su6VarA = new w65().a(ks3Var, !this.c ? null : u65.y, 0);
            if (su6VarA != null && su6VarA.a.length != 0) {
                su6Var = su6VarA;
            }
            ks3Var.m((int) (ks3Var.g() - jG));
            this.h = su6Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            ks3Var.n(bArr, 0, bArr.length);
            ks3Var.l();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i == 2) {
            pt7 pt7Var = new pt7(4);
            ks3Var.readFully(pt7Var.a, 0, 4);
            if (pt7Var.B() != 1716281667) {
                throw ut7.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 7;
        int i6 = 6;
        if (i == 3) {
            int i7 = 0;
            x34 x34Var2 = this.i;
            boolean z2 = false;
            while (!z2) {
                ks3Var.l();
                byte[] bArr2 = new byte[i3];
                ot7 ot7Var = new ot7(bArr2, i3);
                int i8 = i7;
                ks3Var.n(bArr2, i8, i3);
                boolean zF = ot7Var.f();
                int iG = ot7Var.g(i5);
                int iG2 = ot7Var.g(24) + i3;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    ks3Var.readFully(bArr3, i8, 38);
                    x34Var2 = new x34(bArr3, i3);
                } else {
                    if (x34Var2 == null) {
                        zn3.b();
                        return 0;
                    }
                    su6 su6Var2 = x34Var2.l;
                    if (iG == i4) {
                        pt7 pt7Var2 = new pt7(iG2);
                        ks3Var.readFully(pt7Var2.a, i8, iG2);
                        x34Var2 = new x34(x34Var2.a, x34Var2.b, x34Var2.c, x34Var2.d, x34Var2.e, x34Var2.g, x34Var2.h, x34Var2.j, u34.a(pt7Var2), x34Var2.l);
                    } else {
                        if (iG == i3) {
                            pt7 pt7Var3 = new pt7(iG2);
                            ks3Var.readFully(pt7Var3.a, 0, iG2);
                            pt7Var3.N(i3);
                            su6 su6VarA2 = ujb.a(Arrays.asList(ujb.b(pt7Var3, false, false).a));
                            if (su6Var2 != null) {
                                su6VarA2 = su6Var2.b(su6VarA2);
                            }
                            x34Var = new x34(x34Var2.a, x34Var2.b, x34Var2.c, x34Var2.d, x34Var2.e, x34Var2.g, x34Var2.h, x34Var2.j, x34Var2.k, su6VarA2);
                        } else if (iG == i6) {
                            pt7 pt7Var4 = new pt7(iG2);
                            ks3Var.readFully(pt7Var4.a, 0, iG2);
                            pt7Var4.N(4);
                            su6 su6Var3 = new su6(k95.v(zy7.d(pt7Var4)));
                            if (su6Var2 != null) {
                                su6Var3 = su6Var2.b(su6Var3);
                            }
                            x34Var = new x34(x34Var2.a, x34Var2.b, x34Var2.c, x34Var2.d, x34Var2.e, x34Var2.g, x34Var2.h, x34Var2.j, x34Var2.k, su6Var3);
                        } else {
                            ks3Var.m(iG2);
                        }
                        x34Var2 = x34Var;
                    }
                }
                String str = n6b.a;
                this.i = x34Var2;
                z2 = zF;
                i3 = 4;
                i4 = 3;
                i5 = 7;
                i6 = 6;
                i7 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            id4 id4VarC = this.i.c(bArr, this.h);
            hsa hsaVar = this.f;
            id4.a aVarA = id4VarC.a();
            aVarA.m = fv6.n("audio/flac");
            hy1.b(aVarA, hsaVar);
            this.f.d(this.i.b());
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            ks3Var.l();
            pt7 pt7Var5 = new pt7(2);
            ks3Var.n(pt7Var5.a, 0, 2);
            int iG3 = pt7Var5.G();
            if ((iG3 >> 2) != 16382) {
                ks3Var.l();
                throw ut7.a(null, "First frame does not start with sync code.");
            }
            ks3Var.l();
            this.k = iG3;
            ls3 ls3Var = this.e;
            String str2 = n6b.a;
            long position = ks3Var.getPosition();
            long jA = ks3Var.a();
            this.i.getClass();
            final x34 x34Var3 = this.i;
            x34.a aVar = x34Var3.k;
            if (aVar != null && aVar.a.length > 0) {
                bVar = new w34(x34Var3, position);
                i2 = 0;
            } else if (jA == -1 || x34Var3.j <= 0) {
                i2 = 0;
                bVar = new t89.b(x34Var3.b());
            } else {
                int i9 = this.k;
                int i10 = x34Var3.c;
                bq0.d dVar = new bq0.d() { // from class: p34
                    @Override // bq0.d
                    public final long a(long j4) {
                        x34 x34Var4 = x34Var3;
                        return n6b.j((j4 * ((long) x34Var4.e)) / 1000000, 0L, x34Var4.j - 1);
                    }
                };
                q34.a aVar2 = new q34.a(x34Var3, i9);
                long jB = x34Var3.b();
                long j4 = x34Var3.j;
                int i11 = x34Var3.d;
                if (i11 > 0) {
                    j = ((((long) i11) + ((long) i10)) / 2) + 1;
                } else {
                    int i12 = x34Var3.a;
                    j = 64 + (((((i12 != x34Var3.b || i12 <= 0) ? 4096L : i12) * ((long) x34Var3.g)) * ((long) x34Var3.h)) / 8);
                }
                q34 q34Var = new q34(dVar, aVar2, jB, j4, position, jA, j, Math.max(6, i10));
                this.l = q34Var;
                bVar = q34Var.a;
            }
            ls3Var.t(bVar);
            this.g = 5;
            return i2;
        }
        if (i != 5) {
            d43.c();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        q34 q34Var2 = this.l;
        if (q34Var2 != null && q34Var2.c != null) {
            return q34Var2.a(ks3Var, o68Var);
        }
        if (this.n == -1) {
            x34 x34Var4 = this.i;
            ks3Var.l();
            ks3Var.h(1);
            byte[] bArr4 = new byte[1];
            ks3Var.n(bArr4, 0, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            ks3Var.h(2);
            i5 = z3 ? 7 : 6;
            pt7 pt7Var6 = new pt7(i5);
            byte[] bArr5 = pt7Var6.a;
            int i13 = 0;
            while (i13 < i5) {
                int iJ = ks3Var.j(bArr5, i13, i5 - i13);
                if (iJ == -1) {
                    break;
                }
                i13 += iJ;
            }
            pt7Var6.L(i13);
            ks3Var.l();
            try {
                long jH = pt7Var6.H();
                if (!z3) {
                    jH *= (long) x34Var4.b;
                }
                long j5 = x34Var4.j;
                if (j5 == 0 || jH <= j5) {
                    j3 = jH;
                } else {
                    z = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z) {
                throw ut7.a(null, null);
            }
            this.n = j3;
        } else {
            pt7 pt7Var7 = this.b;
            int i14 = pt7Var7.c;
            if (i14 < 32768) {
                int i15 = ks3Var.read(pt7Var7.a, i14, 32768 - i14);
                z = i15 == -1;
                if (!z) {
                    pt7Var7.L(i14 + i15);
                } else if (pt7Var7.a() == 0) {
                    long j6 = this.n * 1000000;
                    x34 x34Var5 = this.i;
                    String str3 = n6b.a;
                    this.f.a(j6 / ((long) x34Var5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i16 = pt7Var7.b;
            int i17 = this.m;
            int i18 = this.j;
            if (i17 < i18) {
                pt7Var7.N(Math.min(i18 - i17, pt7Var7.a()));
            }
            this.i.getClass();
            int i19 = pt7Var7.b;
            while (true) {
                int i20 = pt7Var7.c - 16;
                t34.a aVar3 = this.d;
                if (i19 > i20) {
                    if (z) {
                        while (true) {
                            int i21 = pt7Var7.c;
                            if (i19 <= i21 - this.j) {
                                pt7Var7.M(i19);
                                try {
                                    zA = t34.a(pt7Var7, this.i, this.k, aVar3);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (pt7Var7.b > pt7Var7.c) {
                                    zA = false;
                                }
                                if (zA) {
                                    pt7Var7.M(i19);
                                    j2 = aVar3.a;
                                    break;
                                }
                                i19++;
                            } else {
                                pt7Var7.M(i21);
                            }
                        }
                    } else {
                        pt7Var7.M(i19);
                    }
                    j2 = -1;
                    break;
                }
                pt7Var7.M(i19);
                if (t34.a(pt7Var7, this.i, this.k, aVar3)) {
                    pt7Var7.M(i19);
                    j2 = aVar3.a;
                    break;
                }
                i19++;
            }
            int i22 = pt7Var7.b - i16;
            pt7Var7.M(i16);
            this.f.e(i22, pt7Var7);
            int i23 = this.m + i22;
            this.m = i23;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                x34 x34Var6 = this.i;
                String str4 = n6b.a;
                this.f.a(j7 / ((long) x34Var6.e), 1, i23, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length = pt7Var7.a.length - pt7Var7.c;
            if (pt7Var7.a() < 16 && length < 16) {
                int iA = pt7Var7.a();
                byte[] bArr6 = pt7Var7.a;
                System.arraycopy(bArr6, pt7Var7.b, bArr6, 0, iA);
                pt7Var7.M(0);
                pt7Var7.L(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        su6 su6VarA = new w65().a(ks3Var, u65.y, 0);
        if (su6VarA != null) {
            int length = su6VarA.a.length;
        }
        pt7 pt7Var = new pt7(4);
        ((zq2) ks3Var).f(pt7Var.a, 0, 4, false);
        return pt7Var.B() == 1716281667;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            q34 q34Var = this.l;
            if (q34Var != null) {
                q34Var.c(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.J(0);
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.e = ls3Var;
        this.f = ls3Var.p(0, 1);
        ls3Var.k();
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
