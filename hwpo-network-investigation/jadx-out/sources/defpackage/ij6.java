package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ij6 extends AnimatorListenerAdapter {
    public final /* synthetic */ jj6 a;

    public ij6(jj6 jj6Var) {
        this.a = jj6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jj6 jj6Var = this.a;
        jj6Var.b.setTranslationY(0.0f);
        jj6Var.b(0.0f);
    }
}
