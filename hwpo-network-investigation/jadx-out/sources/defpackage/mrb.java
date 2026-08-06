package defpackage;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mrb extends bh0 {
    public final a K;
    public final boolean F = true;
    public final boolean G = true;
    public final float H = 10.0f;
    public final float I = 10.0f;
    public final b J = b.t;
    public final float L = Float.POSITIVE_INFINITY;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("LEFT", 0);
            t = aVar;
            a aVar2 = new a("RIGHT", 1);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final /* synthetic */ b[] u;

        static {
            b bVar = new b("OUTSIDE_CHART", 0);
            t = bVar;
            u = new b[]{bVar, new b("INSIDE_CHART", 1)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) u.clone();
        }
    }

    public mrb(a aVar) {
        this.K = aVar;
        this.c = 0.0f;
    }

    @Override // defpackage.bh0
    public final void a(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float fAbs = Math.abs(f2 - f);
        float f3 = this.A ? this.D : f - ((fAbs / 100.0f) * this.I);
        this.D = f3;
        float f4 = this.B ? this.C : f2 + ((fAbs / 100.0f) * this.H);
        this.C = f4;
        this.E = Math.abs(f3 - f4);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.e);
        String strC = c();
        DisplayMetrics displayMetrics = t6b.a;
        float fMeasureText = (this.b * 2.0f) + ((int) paint.measureText(strC));
        float fC = this.L;
        if (fC > 0.0f && fC != Float.POSITIVE_INFINITY) {
            fC = t6b.c(fC);
        }
        if (fC <= 0.0d) {
            fC = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fC));
    }
}
