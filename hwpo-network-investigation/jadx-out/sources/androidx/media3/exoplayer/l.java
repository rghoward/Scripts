package androidx.media3.exoplayer;

import defpackage.id4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
    }

    static boolean m(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    static int r(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    int f(id4 id4Var);

    String getName();

    int x();
}
