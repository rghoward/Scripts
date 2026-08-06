package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u34 {
    public static x34.a a(pt7 pt7Var) {
        pt7Var.N(1);
        int iC = pt7Var.C();
        long j = ((long) pt7Var.b) + ((long) iC);
        int i = iC / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jT = pt7Var.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jT;
            jArrCopyOf2[i2] = pt7Var.t();
            pt7Var.N(2);
        }
        pt7Var.N((int) (j - ((long) pt7Var.b)));
        return new x34.a(jArrCopyOf, jArrCopyOf2);
    }
}
