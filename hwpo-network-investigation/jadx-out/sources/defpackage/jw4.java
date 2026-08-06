package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jw4 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ HideBottomViewOnScrollBehavior b;

    public jw4(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view) {
        this.b = hideBottomViewOnScrollBehavior;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.b;
        hideBottomViewOnScrollBehavior.D = null;
        if (hideBottomViewOnScrollBehavior.C == 1) {
            View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
