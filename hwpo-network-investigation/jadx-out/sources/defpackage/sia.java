package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sia {
    public final ria a;
    public qq5 b = null;
    public qq5 c;

    public sia(qq5 qq5Var, ria riaVar) {
        this.a = riaVar;
        this.c = qq5Var;
    }

    public final long a(long j) {
        sk8 sk8VarZ;
        qq5 qq5Var = this.b;
        sk8 sk8Var = sk8.e;
        if (qq5Var != null) {
            if (qq5Var.e()) {
                qq5 qq5Var2 = this.c;
                sk8VarZ = qq5Var2 != null ? qq5Var2.Z(qq5Var, true) : null;
            } else {
                sk8VarZ = sk8Var;
            }
            if (sk8VarZ != null) {
                sk8Var = sk8VarZ;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = sk8Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = sk8Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = sk8Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = sk8Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        ria riaVar = this.a;
        int iE = riaVar.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= riaVar.e(iE) && Float.intBitsToFloat(i) <= riaVar.f(iE);
    }

    public final long d(long j) {
        qq5 qq5Var;
        qq5 qq5Var2 = this.b;
        if (qq5Var2 != null) {
            if (!qq5Var2.e()) {
                qq5Var2 = null;
            }
            if (qq5Var2 != null && (qq5Var = this.c) != null) {
                qq5 qq5Var3 = qq5Var.e() ? qq5Var : null;
                if (qq5Var3 != null) {
                    return qq5Var2.T(qq5Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        qq5 qq5Var;
        qq5 qq5Var2 = this.b;
        if (qq5Var2 != null) {
            if (!qq5Var2.e()) {
                qq5Var2 = null;
            }
            if (qq5Var2 != null && (qq5Var = this.c) != null) {
                qq5 qq5Var3 = qq5Var.e() ? qq5Var : null;
                if (qq5Var3 != null) {
                    return qq5Var3.T(qq5Var2, j);
                }
            }
        }
        return j;
    }
}
