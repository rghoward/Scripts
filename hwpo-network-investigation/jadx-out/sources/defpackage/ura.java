package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ura {
    public fl7 a;
    public long b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fl7.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ura(long j, fl7 fl7Var) {
        this.a = fl7Var;
        this.b = j;
    }

    public final long a(long j, float f, boolean z) {
        long jE;
        long j2 = this.b;
        if (z) {
            jE = vf7.e(j2, j);
            this.b = jE;
        } else {
            jE = vf7.e(j2, j);
        }
        if ((this.a == null ? vf7.c(jE) : Math.abs(b(jE))) < f) {
            return 9205357640488583168L;
        }
        fl7 fl7Var = this.a;
        long j3 = this.b;
        if (fl7Var == null) {
            float fC = vf7.c(j3);
            return vf7.d(this.b, vf7.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / fC)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC)) & 4294967295L)));
        }
        float fB = b(j3) - (Math.signum(b(this.b)) * f);
        long j4 = this.b;
        fl7 fl7Var2 = this.a;
        fl7 fl7Var3 = fl7.u;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fl7Var2 == fl7Var3 ? j4 & 4294967295L : j4 >> 32));
        if (this.a == fl7Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == fl7.u ? j >> 32 : j & 4294967295L));
    }

    public /* synthetic */ ura(fl7 fl7Var) {
        this(0L, fl7Var);
    }
}
