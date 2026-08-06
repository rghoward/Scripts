package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d18 {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    public static final void a(Logger logger, q9a q9aVar, y9a y9aVar, String str) {
        logger.fine(y9aVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + q9aVar.a);
    }

    public static final String b(long j) {
        String strA;
        if (j <= -999500000) {
            strA = jp2.a((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strA = jp2.a((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strA = jp2.a((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strA = jp2.a((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strA = jp2.a((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strA = jp2.a((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strA}, 1));
    }
}
