package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public static final long b = u7d.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final long a;

    static {
        u7d.d(4282664004L);
        c = u7d.d(4287137928L);
        d = u7d.d(4291611852L);
        e = u7d.d(4294967295L);
        f = u7d.d(4294901760L);
        g = u7d.d(4278255360L);
        h = u7d.d(4278190335L);
        i = u7d.d(4294967040L);
        u7d.d(4278255615L);
        u7d.d(4294902015L);
        j = u7d.c(0);
        k = u7d.a(0.0f, 0.0f, 0.0f, 0.0f, si1.u);
    }

    public /* synthetic */ uh1(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, ii1 ii1Var) {
        jx1 jx1VarD;
        ii1 ii1VarF = f(j2);
        int i2 = ii1VarF.c;
        int i3 = ii1Var.c;
        if ((i2 | i3) < 0) {
            jx1VarD = ji1.d(ii1VarF, ii1Var);
        } else {
            e27<jx1> e27Var = kx1.a;
            int i4 = i2 | (i3 << 6);
            jx1 jx1VarB = e27Var.b(i4);
            if (jx1VarB == null) {
                jx1VarB = ji1.d(ii1VarF, ii1Var);
                e27Var.i(i4, jx1VarB);
            }
            jx1VarD = jx1VarB;
        }
        return jx1VarD.a(j2);
    }

    public static long b(float f2, long j2) {
        return u7d.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float fE;
        float f2;
        if ((63 & j2) == 0) {
            fE = (float) yq5.e((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fE = (float) yq5.e((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fE / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) yq5.e((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - l44.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final ii1 f(long j2) {
        float[] fArr = si1.a;
        return si1.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) yq5.e((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - l44.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) yq5.e((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - l44.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return wu0.a(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uh1) {
            return this.a == ((uh1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
