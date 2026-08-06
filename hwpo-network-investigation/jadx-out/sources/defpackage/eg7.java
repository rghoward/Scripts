package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eg7 implements js3 {
    public ls3 a;
    public u1a b;
    public boolean c;

    /* JADX WARN: Code duplicated, block: B:70:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!h(ks3Var)) {
                throw ut7.a(null, "Failed to determine bitstream type");
            }
            ks3Var.l();
        }
        if (!this.c) {
            hsa hsaVarP = this.a.p(0, 1);
            this.a.k();
            u1a u1aVar = this.b;
            u1aVar.c = this.a;
            u1aVar.b = hsaVarP;
            u1aVar.d(true);
            this.c = true;
        }
        u1a u1aVar2 = this.b;
        gg7 gg7Var = u1aVar2.a;
        u1aVar2.b.getClass();
        String str = n6b.a;
        int i = u1aVar2.h;
        if (i != 0) {
            if (i == 1) {
                ks3Var.m((int) u1aVar2.f);
                u1aVar2.h = 2;
                return 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                d43.c();
                return 0;
            }
            long jA = u1aVar2.d.a(ks3Var);
            if (jA >= 0) {
                o68Var.a = jA;
                return 1;
            }
            if (jA < -1) {
                u1aVar2.a(-(jA + 2));
            }
            if (!u1aVar2.l) {
                t89 t89VarB = u1aVar2.d.b();
                t89VarB.getClass();
                u1aVar2.c.t(t89VarB);
                u1aVar2.b.d(t89VarB.g());
                u1aVar2.l = true;
            }
            if (u1aVar2.k <= 0 && !gg7Var.b(ks3Var)) {
                u1aVar2.h = 3;
                return -1;
            }
            u1aVar2.k = 0L;
            pt7 pt7Var = gg7Var.b;
            long jB = u1aVar2.b(pt7Var);
            if (jB >= 0) {
                long j = u1aVar2.g;
                if (j + jB >= u1aVar2.e) {
                    long j2 = (j * 1000000) / ((long) u1aVar2.i);
                    u1aVar2.b.e(pt7Var.c, pt7Var);
                    u1aVar2.b.a(j2, 1, pt7Var.c, 0, null);
                    u1aVar2.e = -1L;
                }
            }
            u1aVar2.g += jB;
            return 0;
        }
        while (true) {
            boolean zB = gg7Var.b(ks3Var);
            pt7 pt7Var2 = gg7Var.b;
            if (!zB) {
                u1aVar2.h = 3;
                return -1;
            }
            long position = ks3Var.getPosition();
            long j3 = u1aVar2.f;
            u1aVar2.k = position - j3;
            if (!u1aVar2.c(pt7Var2, j3, u1aVar2.j)) {
                id4 id4Var = u1aVar2.j.a;
                u1aVar2.i = id4Var.H;
                if (!u1aVar2.m) {
                    u1aVar2.b.g(id4Var);
                    u1aVar2.m = true;
                }
                v34.a aVar = u1aVar2.j.b;
                if (aVar == null) {
                    if (ks3Var.a() == -1) {
                        u1aVar2.d = new u1a.b();
                    } else {
                        hg7 hg7Var = gg7Var.a;
                        u1aVar2.d = new rs2(u1aVar2, u1aVar2.f, ks3Var.a(), hg7Var.d + hg7Var.e, hg7Var.b, (hg7Var.a & 4) != 0);
                    }
                    u1aVar2.h = 2;
                    bArr = pt7Var2.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    pt7Var2.K(Arrays.copyOf(bArr, Math.max(65025, pt7Var2.c)), pt7Var2.c);
                    return 0;
                }
                u1aVar2.d = aVar;
                u1aVar2.h = 2;
                bArr = pt7Var2.a;
                if (bArr.length == 65025) {
                    return 0;
                }
                pt7Var2.K(Arrays.copyOf(bArr, Math.max(65025, pt7Var2.c)), pt7Var2.c);
                return 0;
            }
            u1aVar2.f = ks3Var.getPosition();
        }
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        try {
            return h(ks3Var);
        } catch (ut7 unused) {
            return false;
        }
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        u1a u1aVar = this.b;
        if (u1aVar != null) {
            gg7 gg7Var = u1aVar.a;
            hg7 hg7Var = gg7Var.a;
            hg7Var.a = 0;
            hg7Var.b = 0L;
            hg7Var.c = 0;
            hg7Var.d = 0;
            hg7Var.e = 0;
            gg7Var.b.J(0);
            gg7Var.c = -1;
            gg7Var.e = false;
            if (j == 0) {
                u1aVar.d(!u1aVar.l);
                return;
            }
            if (u1aVar.h != 0) {
                long j3 = (((long) u1aVar.i) * j2) / 1000000;
                u1aVar.e = j3;
                ig7 ig7Var = u1aVar.d;
                String str = n6b.a;
                ig7Var.c(j3);
                u1aVar.h = 2;
            }
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.a = ls3Var;
    }

    public final boolean h(ks3 ks3Var) {
        boolean zC;
        hg7 hg7Var = new hg7();
        if (hg7Var.a(ks3Var, true) && (hg7Var.a & 2) == 2) {
            int iMin = Math.min(hg7Var.e, 8);
            pt7 pt7Var = new pt7(iMin);
            ks3Var.n(pt7Var.a, 0, iMin);
            pt7Var.M(0);
            if (pt7Var.a() >= 5 && pt7Var.z() == 127 && pt7Var.B() == 1179402563) {
                this.b = new v34();
                return true;
            }
            pt7Var.M(0);
            try {
                zC = ujb.c(1, pt7Var, true);
            } catch (ut7 unused) {
                zC = false;
            }
            if (zC) {
                this.b = new tjb();
            } else {
                pt7Var.M(0);
                if (al7.e(pt7Var, al7.o)) {
                    this.b = new al7();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
