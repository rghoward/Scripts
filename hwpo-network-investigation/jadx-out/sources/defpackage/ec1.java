package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ec1 {
    public static ox6 a(ox6 ox6Var) {
        return ox6Var.H(new hc1(new dc1(0)));
    }

    public static final long b(String str, long j, long j2, long j3) {
        String property;
        int i = e8a.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lG = v2a.g(property);
        if (lG == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lG.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int c(int i, int i2, String str) {
        return (int) b(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
