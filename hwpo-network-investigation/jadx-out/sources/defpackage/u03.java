package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u03 {
    public static final ll0.a a = new ll0.a();

    public static boolean a(vx1 vx1Var) {
        vx1.a[] aVarArr = vx1Var.U;
        vx1.a aVar = aVarArr[0];
        vx1.a aVar2 = aVarArr[1];
        vx1 vx1Var2 = vx1Var.V;
        wx1 wx1Var = vx1Var2 != null ? (wx1) vx1Var2 : null;
        vx1.a aVar3 = vx1.a.t;
        if (wx1Var != null) {
            vx1.a aVar4 = wx1Var.U[0];
        }
        if (wx1Var != null) {
            vx1.a aVar5 = wx1Var.U[1];
        }
        vx1.a aVar6 = vx1.a.v;
        vx1.a aVar7 = vx1.a.u;
        boolean z = aVar == aVar3 || vx1Var.y() || aVar == aVar7 || (aVar == aVar6 && vx1Var.r == 0 && vx1Var.Y == 0.0f && vx1Var.r(0)) || (aVar == aVar6 && vx1Var.r == 1 && vx1Var.s(0, vx1Var.o()));
        boolean z2 = aVar2 == aVar3 || vx1Var.z() || aVar2 == aVar7 || (aVar2 == aVar6 && vx1Var.s == 0 && vx1Var.Y == 0.0f && vx1Var.r(1)) || (aVar2 == aVar6 && vx1Var.s == 1 && vx1Var.s(1, vx1Var.i()));
        return (vx1Var.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static void b(int i, ll0.b bVar, vx1 vx1Var, boolean z) {
        sx1 sx1Var;
        sx1 sx1Var2;
        boolean z2;
        sx1 sx1Var3;
        sx1 sx1Var4;
        if (vx1Var.m) {
            return;
        }
        if (!(vx1Var instanceof wx1) && vx1Var.x() && a(vx1Var)) {
            wx1.R(vx1Var, bVar, new ll0.a());
        }
        sx1 sx1VarG = vx1Var.g(sx1.a.t);
        sx1 sx1VarG2 = vx1Var.g(sx1.a.v);
        int iC = sx1VarG.c();
        int iC2 = sx1VarG2.c();
        HashSet<sx1> hashSet = sx1VarG.a;
        vx1.a aVar = vx1.a.v;
        if (hashSet != null && sx1VarG.c) {
            Iterator<sx1> it = hashSet.iterator();
            while (it.hasNext()) {
                sx1 next = it.next();
                vx1 vx1Var2 = next.d;
                int i2 = i + 1;
                boolean zA = a(vx1Var2);
                sx1 sx1Var5 = vx1Var2.J;
                sx1 sx1Var6 = vx1Var2.L;
                if (vx1Var2.x() && zA) {
                    z2 = true;
                    wx1.R(vx1Var2, bVar, new ll0.a());
                } else {
                    z2 = true;
                }
                boolean z3 = ((next == sx1Var5 && (sx1Var4 = sx1Var6.f) != null && sx1Var4.c) || (next == sx1Var6 && (sx1Var3 = sx1Var5.f) != null && sx1Var3.c)) ? z2 : false;
                vx1.a aVar2 = vx1Var2.U[0];
                if (aVar2 != aVar || zA) {
                    if (!vx1Var2.x()) {
                        if (next == sx1Var5 && sx1Var6.f == null) {
                            int iD = sx1Var5.d() + iC;
                            vx1Var2.F(iD, vx1Var2.o() + iD);
                            b(i2, bVar, vx1Var2, z);
                        } else if (next == sx1Var6 && sx1Var5.f == null) {
                            int iD2 = iC - sx1Var6.d();
                            vx1Var2.F(iD2 - vx1Var2.o(), iD2);
                            b(i2, bVar, vx1Var2, z);
                        } else if (z3 && !vx1Var2.v()) {
                            c(i2, bVar, vx1Var2, z);
                        }
                    }
                } else if (aVar2 == aVar && vx1Var2.v >= 0 && vx1Var2.u >= 0 && (vx1Var2.i0 == 8 || (vx1Var2.r == 0 && vx1Var2.Y == 0.0f))) {
                    if (!vx1Var2.v() && !vx1Var2.G && z3 && !vx1Var2.v()) {
                        d(i2, vx1Var, bVar, vx1Var2, z);
                    }
                }
            }
        }
        if (vx1Var instanceof vp4) {
            return;
        }
        HashSet<sx1> hashSet2 = sx1VarG2.a;
        if (hashSet2 != null && sx1VarG2.c) {
            Iterator<sx1> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                sx1 next2 = it2.next();
                vx1 vx1Var3 = next2.d;
                int i3 = i + 1;
                boolean zA2 = a(vx1Var3);
                sx1 sx1Var7 = vx1Var3.J;
                sx1 sx1Var8 = vx1Var3.L;
                if (vx1Var3.x() && zA2) {
                    wx1.R(vx1Var3, bVar, new ll0.a());
                }
                boolean z4 = (next2 == sx1Var7 && (sx1Var2 = sx1Var8.f) != null && sx1Var2.c) || (next2 == sx1Var8 && (sx1Var = sx1Var7.f) != null && sx1Var.c);
                vx1.a aVar3 = vx1Var3.U[0];
                if (aVar3 != aVar || zA2) {
                    if (!vx1Var3.x()) {
                        if (next2 == sx1Var7 && sx1Var8.f == null) {
                            int iD3 = sx1Var7.d() + iC2;
                            vx1Var3.F(iD3, vx1Var3.o() + iD3);
                            b(i3, bVar, vx1Var3, z);
                        } else if (next2 == sx1Var8 && sx1Var7.f == null) {
                            int iD4 = iC2 - sx1Var8.d();
                            vx1Var3.F(iD4 - vx1Var3.o(), iD4);
                            b(i3, bVar, vx1Var3, z);
                        } else if (z4 && !vx1Var3.v()) {
                            c(i3, bVar, vx1Var3, z);
                        }
                    }
                } else if (aVar3 == aVar && vx1Var3.v >= 0 && vx1Var3.u >= 0) {
                    if (vx1Var3.i0 == 8 || (vx1Var3.r == 0 && vx1Var3.Y == 0.0f)) {
                        if (!vx1Var3.v() && !vx1Var3.G && z4 && !vx1Var3.v()) {
                            d(i3, vx1Var, bVar, vx1Var3, z);
                        }
                    }
                }
            }
        }
        vx1Var.m = true;
    }

    public static void c(int i, ll0.b bVar, vx1 vx1Var, boolean z) {
        float f = vx1Var.f0;
        sx1 sx1Var = vx1Var.J;
        int iC = sx1Var.f.c();
        sx1 sx1Var2 = vx1Var.L;
        int iC2 = sx1Var2.f.c();
        int iD = sx1Var.d() + iC;
        int iD2 = iC2 - sx1Var2.d();
        if (iC == iC2) {
            f = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int iO = vx1Var.o();
        int i2 = (iC2 - iC) - iO;
        if (iC > iC2) {
            i2 = (iC - iC2) - iO;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iC;
        int i4 = i3 + iO;
        if (iC > iC2) {
            i4 = i3 - iO;
        }
        vx1Var.F(i3, i4);
        b(i + 1, bVar, vx1Var, z);
    }

    public static void d(int i, vx1 vx1Var, ll0.b bVar, vx1 vx1Var2, boolean z) {
        float f = vx1Var2.f0;
        sx1 sx1Var = vx1Var2.J;
        int iD = sx1Var.d() + sx1Var.f.c();
        sx1 sx1Var2 = vx1Var2.L;
        int iC = sx1Var2.f.c() - sx1Var2.d();
        if (iC >= iD) {
            int iO = vx1Var2.o();
            if (vx1Var2.i0 != 8) {
                int i2 = vx1Var2.r;
                if (i2 == 2) {
                    iO = (int) (vx1Var2.f0 * 0.5f * (vx1Var instanceof wx1 ? vx1Var.o() : vx1Var.V.o()));
                } else if (i2 == 0) {
                    iO = iC - iD;
                }
                iO = Math.max(vx1Var2.u, iO);
                int i3 = vx1Var2.v;
                if (i3 > 0) {
                    iO = Math.min(i3, iO);
                }
            }
            int i4 = iD + ((int) ((f * ((iC - iD) - iO)) + 0.5f));
            vx1Var2.F(i4, iO + i4);
            b(i + 1, bVar, vx1Var2, z);
        }
    }

    public static void e(int i, ll0.b bVar, vx1 vx1Var) {
        float f = vx1Var.g0;
        sx1 sx1Var = vx1Var.K;
        int iC = sx1Var.f.c();
        sx1 sx1Var2 = vx1Var.M;
        int iC2 = sx1Var2.f.c();
        int iD = sx1Var.d() + iC;
        int iD2 = iC2 - sx1Var2.d();
        if (iC == iC2) {
            f = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int i2 = vx1Var.i();
        int i3 = (iC2 - iC) - i2;
        if (iC > iC2) {
            i3 = (iC - iC2) - i2;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = iC + i4;
        int i6 = i5 + i2;
        if (iC > iC2) {
            i5 = iC - i4;
            i6 = i5 - i2;
        }
        vx1Var.G(i5, i6);
        g(i + 1, bVar, vx1Var);
    }

    public static void f(int i, vx1 vx1Var, ll0.b bVar, vx1 vx1Var2) {
        float f = vx1Var2.g0;
        sx1 sx1Var = vx1Var2.K;
        int iD = sx1Var.d() + sx1Var.f.c();
        sx1 sx1Var2 = vx1Var2.M;
        int iC = sx1Var2.f.c() - sx1Var2.d();
        if (iC >= iD) {
            int i2 = vx1Var2.i();
            if (vx1Var2.i0 != 8) {
                int i3 = vx1Var2.s;
                if (i3 == 2) {
                    i2 = (int) (f * 0.5f * (vx1Var instanceof wx1 ? vx1Var.i() : vx1Var.V.i()));
                } else if (i3 == 0) {
                    i2 = iC - iD;
                }
                i2 = Math.max(vx1Var2.x, i2);
                int i4 = vx1Var2.y;
                if (i4 > 0) {
                    i2 = Math.min(i4, i2);
                }
            }
            int i5 = iD + ((int) ((f * ((iC - iD) - i2)) + 0.5f));
            vx1Var2.G(i5, i2 + i5);
            g(i + 1, bVar, vx1Var2);
        }
    }

    public static void g(int i, ll0.b bVar, vx1 vx1Var) {
        boolean z;
        sx1 sx1Var;
        sx1 sx1Var2;
        sx1 sx1Var3;
        sx1 sx1Var4;
        if (vx1Var.n) {
            return;
        }
        if (!(vx1Var instanceof wx1) && vx1Var.x() && a(vx1Var)) {
            wx1.R(vx1Var, bVar, new ll0.a());
        }
        sx1 sx1VarG = vx1Var.g(sx1.a.u);
        sx1 sx1VarG2 = vx1Var.g(sx1.a.w);
        int iC = sx1VarG.c();
        int iC2 = sx1VarG2.c();
        HashSet<sx1> hashSet = sx1VarG.a;
        vx1.a aVar = vx1.a.v;
        if (hashSet != null && sx1VarG.c) {
            Iterator<sx1> it = hashSet.iterator();
            while (it.hasNext()) {
                sx1 next = it.next();
                vx1 vx1Var2 = next.d;
                int i2 = i + 1;
                boolean zA = a(vx1Var2);
                sx1 sx1Var5 = vx1Var2.K;
                sx1 sx1Var6 = vx1Var2.M;
                if (vx1Var2.x() && zA) {
                    wx1.R(vx1Var2, bVar, new ll0.a());
                }
                boolean z2 = (next == sx1Var5 && (sx1Var4 = sx1Var6.f) != null && sx1Var4.c) || (next == sx1Var6 && (sx1Var3 = sx1Var5.f) != null && sx1Var3.c);
                vx1.a aVar2 = vx1Var2.U[1];
                if (aVar2 != aVar || zA) {
                    if (!vx1Var2.x()) {
                        if (next == sx1Var5 && sx1Var6.f == null) {
                            int iD = sx1Var5.d() + iC;
                            vx1Var2.G(iD, vx1Var2.i() + iD);
                            g(i2, bVar, vx1Var2);
                        } else if (next == sx1Var6 && sx1Var5.f == null) {
                            int iD2 = iC - sx1Var6.d();
                            vx1Var2.G(iD2 - vx1Var2.i(), iD2);
                            g(i2, bVar, vx1Var2);
                        } else if (z2 && !vx1Var2.w()) {
                            e(i2, bVar, vx1Var2);
                        }
                    }
                } else if (aVar2 == aVar && vx1Var2.y >= 0 && vx1Var2.x >= 0 && (vx1Var2.i0 == 8 || (vx1Var2.s == 0 && vx1Var2.Y == 0.0f))) {
                    if (!vx1Var2.w() && !vx1Var2.G && z2 && !vx1Var2.w()) {
                        f(i2, vx1Var, bVar, vx1Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (vx1Var instanceof vp4) {
            return;
        }
        HashSet<sx1> hashSet2 = sx1VarG2.a;
        if (hashSet2 != null && sx1VarG2.c) {
            Iterator<sx1> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                sx1 next2 = it2.next();
                vx1 vx1Var3 = next2.d;
                int i3 = i + 1;
                boolean zA2 = a(vx1Var3);
                sx1 sx1Var7 = vx1Var3.K;
                sx1 sx1Var8 = vx1Var3.M;
                if (vx1Var3.x() && zA2) {
                    wx1.R(vx1Var3, bVar, new ll0.a());
                }
                boolean z4 = (next2 == sx1Var7 && (sx1Var2 = sx1Var8.f) != null && sx1Var2.c) || (next2 == sx1Var8 && (sx1Var = sx1Var7.f) != null && sx1Var.c);
                vx1.a aVar3 = vx1Var3.U[1];
                if (aVar3 != aVar || zA2) {
                    if (!vx1Var3.x()) {
                        if (next2 == sx1Var7 && sx1Var8.f == null) {
                            int iD3 = sx1Var7.d() + iC2;
                            vx1Var3.G(iD3, vx1Var3.i() + iD3);
                            g(i3, bVar, vx1Var3);
                        } else if (next2 == sx1Var8 && sx1Var7.f == null) {
                            int iD4 = iC2 - sx1Var8.d();
                            vx1Var3.G(iD4 - vx1Var3.i(), iD4);
                            g(i3, bVar, vx1Var3);
                        } else if (z4 && !vx1Var3.w()) {
                            e(i3, bVar, vx1Var3);
                        }
                    }
                } else if (aVar3 == aVar && vx1Var3.y >= 0 && vx1Var3.x >= 0 && (vx1Var3.i0 == 8 || (vx1Var3.s == 0 && vx1Var3.Y == 0.0f))) {
                    if (!vx1Var3.w() && !vx1Var3.G && z4 && !vx1Var3.w()) {
                        f(i3, vx1Var, bVar, vx1Var3);
                    }
                }
            }
        }
        sx1 sx1VarG3 = vx1Var.g(sx1.a.x);
        if (sx1VarG3.a != null && sx1VarG3.c) {
            int iC3 = sx1VarG3.c();
            for (sx1 sx1Var9 : sx1VarG3.a) {
                vx1 vx1Var4 = sx1Var9.d;
                int i4 = i + 1;
                boolean zA3 = a(vx1Var4);
                sx1 sx1Var10 = vx1Var4.N;
                if (vx1Var4.x() && zA3) {
                    wx1.R(vx1Var4, bVar, new ll0.a());
                }
                if (vx1Var4.U[z3 ? 1 : 0] != aVar || zA3) {
                    if (!vx1Var4.x()) {
                        if (sx1Var9 == sx1Var10) {
                            int iD5 = sx1Var9.d() + iC3;
                            if (vx1Var4.E) {
                                int i5 = iD5 - vx1Var4.c0;
                                int i6 = vx1Var4.X + i5;
                                vx1Var4.b0 = i5;
                                vx1Var4.K.i(i5);
                                vx1Var4.M.i(i6);
                                sx1Var10.i(iD5);
                                z = z3 ? 1 : 0;
                                vx1Var4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            g(i4, bVar, vx1Var4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        vx1Var.n = z3;
    }
}
