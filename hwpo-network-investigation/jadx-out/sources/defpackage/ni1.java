package defpackage;

import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ni1 {
    public static final ColorSpace a(ii1 ii1Var) {
        if (xj5.a(ii1Var, si1.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (xj5.a(ii1Var, si1.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
