package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lw8 extends ii1 {
    public static final dw8 r = new dw8();
    public final amb d;
    public final float e;
    public final float f;
    public final zua g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final l43 k;
    public final c l;
    public final bw8 m;
    public final l43 n;
    public final b o;
    public final cw8 p;
    public final boolean q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<Double, Double> {
        public b() {
            super(1);
        }

        @Override // defpackage.oh4
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            lw8 lw8Var = lw8.this;
            return Double.valueOf(lw8Var.n.c(uh8.e(dDoubleValue, lw8Var.e, lw8Var.f)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<Double, Double> {
        public c() {
            super(1);
        }

        @Override // defpackage.oh4
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            lw8 lw8Var = lw8.this;
            return Double.valueOf(uh8.e(lw8Var.k.c(dDoubleValue), lw8Var.e, lw8Var.f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x020e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0217  */
    /* JADX WARN: Code duplicated, block: B:63:0x022b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0243  */
    /* JADX WARN: Code duplicated, block: B:68:0x025d  */
    /* JADX WARN: Code duplicated, block: B:77:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0260 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x025d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public lw8(String str, float[] fArr, amb ambVar, float[] fArr2, l43 l43Var, l43 l43Var2, float f, float f2, zua zuaVar, int i) {
        int i2;
        float f3;
        float f4;
        boolean z;
        float[] fArr3;
        lw8 lw8Var;
        double d;
        int i3;
        super(i, 12884901888L, str);
        this.d = ambVar;
        this.e = f;
        this.f = f2;
        this.g = zuaVar;
        this.k = l43Var;
        this.l = new c();
        this.m = new bw8(this);
        this.n = l43Var2;
        this.o = new b();
        this.p = new cw8(this);
        if (fArr.length != 6 && fArr.length != 9) {
            z90.a("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.h = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = ambVar.a;
            i2 = 0;
            float f21 = ambVar.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            i2 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                mp2.a(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.i = fArr2;
        }
        this.j = ji1.e(this.i);
        float fA = a.a(fArr4);
        float[] fArr5 = si1.a;
        if (fA / a.a(si1.b) > 0.9f) {
            float[] fArr6 = si1.a;
            float f38 = fArr4[i2];
            float f39 = fArr6[i2];
            float f40 = fArr4[1];
            float f41 = fArr6[1];
            float f42 = fArr4[2];
            float f43 = fArr6[2];
            float f44 = fArr4[3];
            float f45 = fArr6[3];
            float f46 = fArr4[4];
            float f47 = fArr6[4];
            float f48 = fArr4[5];
            float f49 = fArr6[5];
            f4 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[i2] = f38 - f39;
            fArr7[1] = f40 - f41;
            fArr7[2] = f42 - f43;
            fArr7[3] = f44 - f45;
            fArr7[4] = f46 - f47;
            fArr7[5] = f48 - f49;
            float f50 = fArr7[i2];
            float f51 = fArr7[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr7[2];
                float f53 = fArr7[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr7[4];
                    float f55 = fArr7[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr3 = si1.a;
                if (fArr4 == fArr3) {
                    i3 = i2;
                    while (true) {
                        if (i3 < 6) {
                            if (Float.compare(fArr4[i3], fArr3[i3]) != 0 || Math.abs(fArr4[i3] - fArr3[i3]) <= 0.001f) {
                                i3++;
                            }
                        } else if (ji1.c(ambVar, e75.d)) {
                            float[] fArr8 = si1.a;
                            lw8Var = si1.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = 1;
                                } else if (Math.abs(l43Var.c(d) - lw8Var.k.c(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (ji1.c(ambVar, e75.d) && f == f4 && f2 == f3) {
                    float[] fArr9 = si1.a;
                    lw8Var = si1.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = 1;
                        } else if (Math.abs(l43Var.c(d) - lw8Var.k.c(d)) > 0.001d && Math.abs(l43Var2.c(d) - lw8Var.n.c(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = i2;
            } else {
                z = 1;
            }
            this.q = z;
        }
        f4 = 0.0f;
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr3 = si1.a;
            if (fArr4 == fArr3) {
                i3 = i2;
                while (true) {
                    if (i3 < 6) {
                        if (Float.compare(fArr4[i3], fArr3[i3]) != 0) {
                        }
                        i3++;
                    } else if (ji1.c(ambVar, e75.d)) {
                        float[] fArr10 = si1.a;
                        lw8Var = si1.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = 1;
                            } else if (Math.abs(l43Var.c(d) - lw8Var.k.c(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (ji1.c(ambVar, e75.d)) {
                float[] fArr11 = si1.a;
                lw8Var = si1.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = 1;
                    } else if (Math.abs(l43Var.c(d) - lw8Var.k.c(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = i2;
        } else {
            z = 1;
        }
        this.q = z;
    }

    @Override // defpackage.ii1
    public final float[] a(float[] fArr) {
        ji1.g(this.j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        bw8 bw8Var = this.m;
        fArr[0] = (float) bw8Var.c(d);
        fArr[1] = (float) bw8Var.c(fArr[1]);
        fArr[2] = (float) bw8Var.c(fArr[2]);
        return fArr;
    }

    @Override // defpackage.ii1
    public final float b(int i) {
        return this.f;
    }

    @Override // defpackage.ii1
    public final float c(int i) {
        return this.e;
    }

    @Override // defpackage.ii1
    public final boolean d() {
        return this.q;
    }

    @Override // defpackage.ii1
    public final long e(float f, float f2, float f3) {
        double d = f;
        cw8 cw8Var = this.p;
        float fC = (float) cw8Var.c(d);
        float fC2 = (float) cw8Var.c(f2);
        float fC3 = (float) cw8Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fC3) + ((fArr[3] * fC2) + (fArr[0] * fC)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))));
    }

    @Override // defpackage.ii1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lw8.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        lw8 lw8Var = (lw8) obj;
        if (Float.compare(lw8Var.e, this.e) != 0 || Float.compare(lw8Var.f, this.f) != 0 || !xj5.a(this.d, lw8Var.d) || !Arrays.equals(this.h, lw8Var.h)) {
            return false;
        }
        zua zuaVar = lw8Var.g;
        zua zuaVar2 = this.g;
        if (zuaVar2 != null) {
            return xj5.a(zuaVar2, zuaVar);
        }
        if (zuaVar == null) {
            return true;
        }
        if (xj5.a(this.k, lw8Var.k)) {
            return xj5.a(this.n, lw8Var.n);
        }
        return false;
    }

    @Override // defpackage.ii1
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        cw8 cw8Var = this.p;
        fArr[0] = (float) cw8Var.c(d);
        fArr[1] = (float) cw8Var.c(fArr[1]);
        fArr[2] = (float) cw8Var.c(fArr[2]);
        ji1.g(this.i, fArr);
        return fArr;
    }

    @Override // defpackage.ii1
    public final float g(float f, float f2, float f3) {
        double d = f;
        cw8 cw8Var = this.p;
        float fC = (float) cw8Var.c(d);
        float fC2 = (float) cw8Var.c(f2);
        float fC3 = (float) cw8Var.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // defpackage.ii1
    public final long h(float f, float f2, float f3, float f4, ii1 ii1Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        bw8 bw8Var = this.m;
        return u7d.a((float) bw8Var.c(f5), (float) bw8Var.c(f6), (float) bw8Var.c(f7), f4, ii1Var);
    }

    @Override // defpackage.ii1
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        zua zuaVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (zuaVar != null ? zuaVar.hashCode() : 0);
        if (zuaVar != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public lw8(String str, float[] fArr, amb ambVar, final zua zuaVar, int i) {
        l43 u26Var;
        l43 iw8Var;
        double d = zuaVar.a;
        boolean z = d == -3.0d;
        double d2 = zuaVar.g;
        double d3 = zuaVar.f;
        if (z) {
            u26Var = new t26(zuaVar);
        } else if (d == -2.0d) {
            u26Var = new u26(zuaVar);
        } else if (d3 == 0.0d && d2 == 0.0d) {
            u26Var = new l43() { // from class: jw8
                @Override // defpackage.l43
                public final double c(double d4) {
                    zua zuaVar2 = zuaVar;
                    double d5 = zuaVar2.b;
                    double d6 = zuaVar2.c;
                    double d7 = zuaVar2.d;
                    return d4 >= zuaVar2.e * d7 ? (Math.pow(d4, 1.0d / zuaVar2.a) - d6) / d5 : d4 / d7;
                }
            };
        } else {
            u26Var = new l43() { // from class: kw8
                @Override // defpackage.l43
                public final double c(double d4) {
                    zua zuaVar2 = zuaVar;
                    double d5 = zuaVar2.b;
                    double d6 = zuaVar2.c;
                    double d7 = zuaVar2.d;
                    return d4 >= zuaVar2.e * d7 ? (Math.pow(d4 - zuaVar2.f, 1.0d / zuaVar2.a) - d6) / d5 : (d4 - zuaVar2.g) / d7;
                }
            };
        }
        if (d == -3.0d) {
            iw8Var = new pp1(zuaVar);
        } else if (d == -2.0d) {
            iw8Var = new l43() { // from class: gw8
                @Override // defpackage.l43
                public final double c(double d4) {
                    float[] fArr2 = si1.a;
                    return si1.c(zuaVar, d4);
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            iw8Var = new l43() { // from class: hw8
                @Override // defpackage.l43
                public final double c(double d4) {
                    zua zuaVar2 = zuaVar;
                    double d5 = zuaVar2.b;
                    return d4 >= zuaVar2.e ? Math.pow((d5 * d4) + zuaVar2.c, zuaVar2.a) : zuaVar2.d * d4;
                }
            };
        } else {
            iw8Var = new iw8(zuaVar);
        }
        this(str, fArr, ambVar, null, u26Var, iw8Var, 0.0f, 1.0f, zuaVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lw8(String str, float[] fArr, amb ambVar, final double d, float f, float f2, int i) {
        l43 l43Var = r;
        this(str, fArr, ambVar, null, d == 1.0d ? l43Var : new l43() { // from class: ew8
            @Override // defpackage.l43
            public final double c(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / d);
            }
        }, d != 1.0d ? new l43() { // from class: fw8
            @Override // defpackage.l43
            public final double c(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d);
            }
        } : l43Var, f, f2, new zua(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
