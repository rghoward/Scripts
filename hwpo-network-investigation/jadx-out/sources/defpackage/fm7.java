package defpackage;

import android.graphics.Outline;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fm7 {
    public static void a(Outline outline, cu7 cu7Var) {
        if (cu7Var instanceof vp) {
            outline.setPath(((vp) cu7Var).a);
        } else {
            ru3.f("Unable to obtain android.graphics.Path");
        }
    }
}
