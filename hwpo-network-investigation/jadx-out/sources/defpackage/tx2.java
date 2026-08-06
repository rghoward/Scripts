package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface tx2 {
    default long A0(float f) {
        return O(I0(f));
    }

    default float C1(long j) {
        if (!dka.a(bka.b(j), 4294967296L)) {
            wc5.b("Only Sp can convert to Px");
        }
        return U0(d0(j));
    }

    default float F0(int i) {
        return i / getDensity();
    }

    default float I0(float f) {
        return f / getDensity();
    }

    float N0();

    default long O(float f) {
        float[] fArr = kb4.a;
        if (N0() < 1.03f) {
            return cka.c(f / N0(), 4294967296L);
        }
        jb4 jb4VarA = kb4.a(N0());
        return cka.c(jb4VarA != null ? jb4VarA.a(f) : f / N0(), 4294967296L);
    }

    default long P(long j) {
        if (j != 9205357640488583168L) {
            return a53.a(I0(Float.intBitsToFloat((int) (j >> 32))), I0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float U0(float f) {
        return getDensity() * f;
    }

    default float d0(long j) {
        if (!dka.a(bka.b(j), 4294967296L)) {
            wc5.b("Only Sp can convert to Px");
        }
        float[] fArr = kb4.a;
        if (N0() < 1.03f) {
            return N0() * bka.c(j);
        }
        jb4 jb4VarA = kb4.a(N0());
        if (jb4VarA != null) {
            return jb4VarA.b(bka.c(j));
        }
        return N0() * bka.c(j);
    }

    float getDensity();

    default int n1(float f) {
        float fU0 = U0(f);
        if (Float.isInfinite(fU0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fU0);
    }

    default long w0(int i) {
        return O(F0(i));
    }

    default long z1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fU0 = U0(c53.b(j));
        float fU1 = U0(c53.a(j));
        return (((long) Float.floatToRawIntBits(fU0)) << 32) | (((long) Float.floatToRawIntBits(fU1)) & 4294967295L);
    }
}
