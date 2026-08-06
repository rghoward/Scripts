package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wm {
    public static final wm a = new wm();

    public final void a(View view, w48 w48Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (w48Var instanceof dq) {
            systemIcon = null;
        } else {
            systemIcon = w48Var instanceof eq ? PointerIcon.getSystemIcon(context, ((eq) w48Var).b) : PointerIcon.getSystemIcon(context, 1000);
        }
        if (xj5.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
