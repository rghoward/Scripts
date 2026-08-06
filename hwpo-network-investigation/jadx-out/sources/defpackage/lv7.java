package defpackage;

import android.animation.Animator;
import com.hwpo_training_app.sessions.presentation.widget.PerformanceExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lv7 implements Animator.AnimatorListener {
    public final /* synthetic */ PerformanceExpandableLayout a;
    public final /* synthetic */ float b;

    public lv7(PerformanceExpandableLayout performanceExpandableLayout, float f) {
        this.a = performanceExpandableLayout;
        this.b = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.O.b.setVisibility(this.b == 0.0f ? 8 : 0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
