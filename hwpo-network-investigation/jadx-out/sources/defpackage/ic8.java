package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ic8 implements Animator.AnimatorListener {
    public final /* synthetic */ ql2.b a;
    public final /* synthetic */ ya b;

    public ic8(ql2.b bVar, ya yaVar) {
        this.a = bVar;
        this.b = yaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ya yaVar = this.b;
        this.a.invoke(yaVar.t());
        ((ja6) yaVar.u).a.setClickable(true);
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
