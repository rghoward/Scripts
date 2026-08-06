package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class odc {
    public final hnc a;

    public odc(hnc hncVar) {
        this.a = hncVar;
    }

    public static odc a(String str) {
        return new odc((TextUtils.isEmpty(str) || str.length() > 1) ? hnc.UNINITIALIZED : nnc.e(str.charAt(0)));
    }
}
