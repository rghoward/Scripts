package defpackage;

import android.animation.Animator;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class go0 implements Animator.AnimatorListener {
    public final /* synthetic */ BenchmarksExpandableLayout a;
    public final /* synthetic */ float b;

    public go0(BenchmarksExpandableLayout benchmarksExpandableLayout, float f) {
        this.a = benchmarksExpandableLayout;
        this.b = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BenchmarksExpandableLayout benchmarksExpandableLayout = this.a;
        float f = this.b;
        benchmarksExpandableLayout.L = f;
        benchmarksExpandableLayout.K.g.setVisibility(f == 0.0f ? 8 : 0);
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
