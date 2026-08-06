package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b35 extends AnimatorListenerAdapter {
    public final /* synthetic */ z25 a;

    public b35(z25 z25Var) {
        this.a = z25Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        super.onAnimationCancel(animator);
        z25 z25Var = this.a;
        ViewGroup viewGroup = z25Var.c;
        if (viewGroup != null) {
            viewGroup.removeView(z25Var.a());
            z25Var.c = null;
        }
        z25Var.l = false;
    }
}
