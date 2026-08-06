package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dpa extends ContextWrapper {
    public static final Object a = null;

    public static void a(Context context) {
        if ((context instanceof dpa) || (context.getResources() instanceof fpa)) {
            return;
        }
        context.getResources();
        int i = xcb.a;
    }
}
