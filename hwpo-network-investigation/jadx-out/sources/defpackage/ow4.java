package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ow4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ HideViewOnScrollBehavior t;

    public ow4(HideViewOnScrollBehavior hideViewOnScrollBehavior) {
        this.t = hideViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.t;
        nw4 nw4Var = hideViewOnScrollBehavior.v;
        if (nw4Var == null || (accessibilityManager = hideViewOnScrollBehavior.u) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(nw4Var);
        hideViewOnScrollBehavior.v = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
