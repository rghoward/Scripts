package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iw4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ HideBottomViewOnScrollBehavior t;

    public iw4(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.t = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.t;
        hw4 hw4Var = hideBottomViewOnScrollBehavior.A;
        if (hw4Var == null || (accessibilityManager = hideBottomViewOnScrollBehavior.z) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(hw4Var);
        hideBottomViewOnScrollBehavior.A = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
