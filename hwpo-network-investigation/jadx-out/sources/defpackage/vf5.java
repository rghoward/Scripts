package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vf5 {
    public static final d27 a = new d27(0);

    public static final d27 a(int... iArr) {
        d27 d27Var = new d27(iArr.length);
        int i = d27Var.b;
        if (i < 0) {
            r.b(BuildConfig.FLAVOR);
            return null;
        }
        if (iArr.length == 0) {
            return d27Var;
        }
        d27Var.d(iArr.length + i);
        int[] iArr2 = d27Var.a;
        int i2 = d27Var.b;
        if (i != i2) {
            gz3.e(iArr.length + i, i, i2, iArr2, iArr2);
        }
        gz3.h(i, 0, 12, iArr, iArr2);
        d27Var.b += iArr.length;
        return d27Var;
    }
}
