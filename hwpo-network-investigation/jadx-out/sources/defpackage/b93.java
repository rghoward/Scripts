package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b93 extends AnimatorListenerAdapter {
    public final /* synthetic */ c93 a;

    public b93(c93 c93Var) {
        this.a = c93Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c93 c93Var = this.a;
        c93Var.p();
        c93Var.r.start();
    }
}
