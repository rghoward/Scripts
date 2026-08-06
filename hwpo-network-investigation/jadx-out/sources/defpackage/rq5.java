package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rq5 {
    public static final /* synthetic */ int a = 0;

    public static final sk8 a(qq5 qq5Var) {
        qq5 qq5VarG = qq5Var.G();
        return qq5VarG != null ? qq5VarG.Z(qq5Var, true) : new sk8(0.0f, 0.0f, (int) (qq5Var.a() >> 32), (int) (qq5Var.a() & 4294967295L));
    }

    public static final sk8 b(qq5 qq5Var, boolean z) {
        qq5 qq5VarD = d(qq5Var);
        float fA = (int) (qq5VarD.a() >> 32);
        float fA2 = (int) (qq5VarD.a() & 4294967295L);
        sk8 sk8VarZ = qq5VarD.Z(qq5Var, z);
        float f = sk8VarZ.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fA) {
                f = fA;
            }
        }
        float f2 = sk8VarZ.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fA2) {
                f2 = fA2;
            }
        }
        float f3 = sk8VarZ.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fA) {
                fA = f3;
            }
            f3 = fA;
        }
        float f4 = sk8VarZ.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fA2) {
                fA2 = f5;
            }
            f4 = fA2;
        }
        if (f == f3 || f2 == f4) {
            return sk8.e;
        }
        long jQ = qq5VarD.q((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jQ2 = qq5VarD.q((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jQ3 = qq5VarD.q((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jQ4 = qq5VarD.q((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jQ4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jQ3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jQ & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jQ2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jQ4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jQ3 & 4294967295L));
        return new sk8(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static byte c(long j) {
        xl7.e(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static final qq5 d(qq5 qq5Var) {
        qq5 qq5Var2;
        qq5 qq5VarG = qq5Var.G();
        while (true) {
            qq5 qq5Var3 = qq5VarG;
            qq5Var2 = qq5Var;
            qq5Var = qq5Var3;
            if (qq5Var == null) {
                break;
            }
            qq5VarG = qq5Var.G();
        }
        mb7 mb7Var = qq5Var2 instanceof mb7 ? (mb7) qq5Var2 : null;
        if (mb7Var == null) {
            return qq5Var2;
        }
        mb7 mb7Var2 = mb7Var.L;
        while (true) {
            mb7 mb7Var3 = mb7Var2;
            mb7 mb7Var4 = mb7Var;
            mb7Var = mb7Var3;
            if (mb7Var == null) {
                return mb7Var4;
            }
            mb7Var2 = mb7Var.L;
        }
    }
}
