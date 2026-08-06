package defpackage;

import android.animation.ObjectAnimator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e35 implements mh4<g2b> {
    public final /* synthetic */ z25 t;

    public e35(z25 z25Var) {
        this.t = z25Var;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        ObjectAnimator objectAnimator = this.t.k;
        if (objectAnimator != null) {
            objectAnimator.start();
            return g2b.a;
        }
        xj5.e("endAnimator");
        throw null;
    }
}
