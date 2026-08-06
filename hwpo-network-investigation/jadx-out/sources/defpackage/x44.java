package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x44 {
    public static final float[] a;

    static {
        long[] jArr;
        long[] jArr2 = z39.a;
        int iE = z39.e(0);
        int iMax = iE > 0 ? Math.max(7, z39.d(iE)) : 0;
        if (iMax == 0) {
            jArr = z39.a;
        } else {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i];
            Arrays.fill(jArr3, 0, i, -9187201950435737472L);
            jArr = jArr3;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}
