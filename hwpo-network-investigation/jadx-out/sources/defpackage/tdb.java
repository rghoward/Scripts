package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tdb {
    public final boolean a;
    public final a b;
    public final int c;
    public final df2[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("Lsq2", 0);
            t = aVar;
            a aVar2 = new a("Impulse", 1);
            u = aVar2;
            v = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    public tdb(boolean z, a aVar) {
        int i;
        this.a = z;
        this.b = aVar;
        if (z && aVar.equals(a.t)) {
            aa0.c("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                u.b();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new df2[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        df2[] df2VarArr = this.d;
        df2 df2Var = df2VarArr[i];
        if (df2Var != null) {
            df2Var.a = j;
            df2Var.b = f;
        } else {
            df2 df2Var2 = new df2();
            df2Var2.a = j;
            df2Var2.b = f;
            df2VarArr[i] = df2Var2;
        }
    }

    public final float b(float f) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            uc5.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        df2[] df2VarArr = this.d;
        df2 df2Var = df2VarArr[i2];
        if (df2Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            df2 df2Var2 = df2Var;
            while (true) {
                df2 df2Var3 = df2VarArr[i2];
                boolean z2 = this.a;
                aVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (df2Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = df2Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = df2Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - df2Var2.a);
                df2Var2 = (aVar == a.t || z) ? df2Var3 : df2Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = df2Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        oj5.g(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        u.b();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ tdb() {
        this(false, a.t);
    }

    public tdb(int i) {
        this(true, a.u);
    }
}
