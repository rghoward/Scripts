package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class uh8 extends hnb {
    public static double e(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float f(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int g(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long h(long j, long j2, long j3) {
        if (j2 > j3) {
            z90.a(fh0.b(ao3.b("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum "), j2, '.'));
            return 0L;
        }
        if (j < j2) {
            return j2;
        }
        return j > j3 ? j3 : j;
    }

    public static dg5 i(fg5 fg5Var, int i) {
        fg5Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = fg5Var.t;
        int i3 = fg5Var.u;
        if (fg5Var.v <= 0) {
            i = -i;
        }
        return new dg5(i2, i3, i);
    }

    public static fg5 j(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new fg5(i, i2 - 1, 1);
        }
        fg5 fg5Var = fg5.w;
        return fg5.w;
    }
}
