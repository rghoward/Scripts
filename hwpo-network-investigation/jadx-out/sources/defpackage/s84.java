package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s84 {
    public static final View a(ox6.c cVar) {
        zgb zgbVar = ew2.f(cVar.t).H;
        View interopView = zgbVar != null ? zgbVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        aa0.c("Could not fetch interop view");
        return null;
    }
}
