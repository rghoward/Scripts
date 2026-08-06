package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mu7 {
    public static final void a(cu7 cu7Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(cu7Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            cu7Var.j((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            dSin2 = dSin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void b(List list, cu7 cu7Var) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        List list2 = list;
        cu7 cu7Var2 = cu7Var;
        int iH = cu7Var2.h();
        cu7Var2.k();
        cu7Var2.f(iH);
        ju7 ju7Var = list2.isEmpty() ? ju7.b.c : (ju7) list2.get(0);
        int size = list2.size();
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i < size) {
            ju7 ju7Var2 = (ju7) list2.get(i);
            if (ju7Var2 instanceof ju7.b) {
                cu7Var2.close();
                size = size;
                f9 = f9;
                i = i;
                ju7Var2 = ju7Var2;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else {
                if (ju7Var2 instanceof ju7.n) {
                    ju7.n nVar = (ju7.n) ju7Var2;
                    float f16 = nVar.c;
                    f12 += f16;
                    float f17 = nVar.d;
                    f13 += f17;
                    cu7Var2.b(f16, f17);
                    f14 = f12;
                    f15 = f13;
                } else if (ju7Var2 instanceof ju7.f) {
                    ju7.f fVar = (ju7.f) ju7Var2;
                    float f18 = fVar.c;
                    float f19 = fVar.d;
                    cu7Var2.i(f18, f19);
                    f13 = f19;
                    f15 = f13;
                    f12 = f18;
                    f14 = f12;
                } else if (ju7Var2 instanceof ju7.m) {
                    ju7.m mVar = (ju7.m) ju7Var2;
                    float f20 = mVar.d;
                    float f21 = mVar.c;
                    cu7Var2.m(f21, f20);
                    f12 += f21;
                    f13 += f20;
                } else if (ju7Var2 instanceof ju7.e) {
                    ju7.e eVar = (ju7.e) ju7Var2;
                    float f22 = eVar.d;
                    float f23 = eVar.c;
                    cu7Var2.n(f23, f22);
                    f12 = f23;
                    f13 = f22;
                } else if (ju7Var2 instanceof ju7.l) {
                    float f24 = ((ju7.l) ju7Var2).c;
                    cu7Var2.m(f24, f9);
                    f12 += f24;
                } else if (ju7Var2 instanceof ju7.d) {
                    float f25 = ((ju7.d) ju7Var2).c;
                    cu7Var2.n(f25, f13);
                    f12 = f25;
                } else if (ju7Var2 instanceof ju7.r) {
                    float f26 = ((ju7.r) ju7Var2).c;
                    cu7Var2.m(f9, f26);
                    f13 += f26;
                } else if (ju7Var2 instanceof ju7.s) {
                    float f27 = ((ju7.s) ju7Var2).c;
                    cu7Var2.n(f12, f27);
                    f13 = f27;
                } else {
                    if (ju7Var2 instanceof ju7.k) {
                        ju7.k kVar = (ju7.k) ju7Var2;
                        cu7Var2.c(kVar.c, kVar.d, kVar.e, kVar.f, kVar.g, kVar.h);
                        f6 = kVar.e + f12;
                        f7 = kVar.f + f13;
                        f12 += kVar.g;
                        f8 = kVar.h;
                    } else if (ju7Var2 instanceof ju7.c) {
                        ju7.c cVar = (ju7.c) ju7Var2;
                        cu7Var.j(cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
                        float f28 = cVar.e;
                        float f29 = cVar.f;
                        float f30 = cVar.g;
                        float f31 = cVar.h;
                        f12 = f30;
                        f13 = f31;
                        size = size;
                        f9 = f9;
                        i = i;
                        ju7Var2 = ju7Var2;
                        f10 = f28;
                        f11 = f29;
                    } else if (ju7Var2 instanceof ju7.p) {
                        if (ju7Var.a) {
                            float f32 = f12 - f10;
                            f5 = f13 - f11;
                            f4 = f32;
                        } else {
                            f4 = f9;
                            f5 = f4;
                        }
                        ju7.p pVar = (ju7.p) ju7Var2;
                        cu7Var.c(f4, f5, pVar.c, pVar.d, pVar.e, pVar.f);
                        f6 = pVar.c + f12;
                        f7 = pVar.d + f13;
                        f12 += pVar.e;
                        f8 = pVar.f;
                    } else {
                        if (ju7Var2 instanceof ju7.h) {
                            if (ju7Var.a) {
                                f12 = (f12 * 2.0f) - f10;
                                f13 = (2.0f * f13) - f11;
                            }
                            ju7.h hVar = (ju7.h) ju7Var2;
                            cu7Var.j(f12, f13, hVar.c, hVar.d, hVar.e, hVar.f);
                            f3 = hVar.c;
                            float f33 = hVar.d;
                            float f34 = hVar.e;
                            float f35 = hVar.f;
                            f12 = f34;
                            f13 = f35;
                            f11 = f33;
                        } else if (ju7Var2 instanceof ju7.o) {
                            ju7.o oVar = (ju7.o) ju7Var2;
                            float f36 = oVar.f;
                            float f37 = oVar.e;
                            float f38 = oVar.d;
                            float f39 = oVar.c;
                            cu7Var.a(f39, f38, f37, f36);
                            float f40 = f39 + f12;
                            float f41 = f38 + f13;
                            f12 += f37;
                            f13 += f36;
                            f10 = f40;
                            f11 = f41;
                        } else if (ju7Var2 instanceof ju7.g) {
                            ju7.g gVar = (ju7.g) ju7Var2;
                            float f42 = gVar.f;
                            float f43 = gVar.e;
                            float f44 = gVar.d;
                            f3 = gVar.c;
                            cu7Var.g(f3, f44, f43, f42);
                            f13 = f42;
                            f12 = f43;
                            f11 = f44;
                        } else if (ju7Var2 instanceof ju7.q) {
                            if (ju7Var.b) {
                                f = f12 - f10;
                                f2 = f13 - f11;
                            } else {
                                f = f9;
                                f2 = f;
                            }
                            ju7.q qVar = (ju7.q) ju7Var2;
                            float f45 = qVar.d;
                            float f46 = qVar.c;
                            cu7Var.a(f, f2, f46, f45);
                            f3 = f + f12;
                            float f47 = f2 + f13;
                            f12 += f46;
                            f13 += f45;
                            f11 = f47;
                        } else if (ju7Var2 instanceof ju7.i) {
                            if (ju7Var.b) {
                                f12 = (f12 * 2.0f) - f10;
                                f13 = (2.0f * f13) - f11;
                            }
                            ju7.i iVar = (ju7.i) ju7Var2;
                            float f48 = iVar.d;
                            float f49 = iVar.c;
                            cu7Var.g(f12, f13, f49, f48);
                            size = size;
                            f9 = f9;
                            i = i;
                            f11 = f13;
                            ju7Var2 = ju7Var2;
                            f13 = f48;
                            f10 = f12;
                            f12 = f49;
                        } else if (ju7Var2 instanceof ju7.j) {
                            ju7.j jVar = (ju7.j) ju7Var2;
                            float f50 = jVar.h + f12;
                            float f51 = jVar.i + f13;
                            f9 = f9;
                            size = size;
                            i = i;
                            a(cu7Var, f12, f13, f50, f51, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g);
                            f10 = f50;
                            f12 = f10;
                            f11 = f51;
                            f13 = f11;
                            ju7Var2 = ju7Var2;
                        } else {
                            size = size;
                            f9 = f9;
                            i = i;
                            if (!(ju7Var2 instanceof ju7.a)) {
                                u.b();
                                return;
                            }
                            ju7.a aVar = (ju7.a) ju7Var2;
                            float f52 = aVar.i;
                            float f53 = aVar.h;
                            ju7Var2 = ju7Var2;
                            a(cu7Var, f12, f13, f53, f52, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
                            f11 = f52;
                            f13 = f11;
                            f10 = f53;
                            f12 = f10;
                        }
                        f10 = f3;
                    }
                    f13 += f8;
                    f10 = f6;
                    f11 = f7;
                }
                ju7Var2 = ju7Var2;
            }
            i++;
            list2 = list;
            cu7Var2 = cu7Var;
            size = size;
            ju7Var = ju7Var2;
            f9 = f9;
        }
    }
}
