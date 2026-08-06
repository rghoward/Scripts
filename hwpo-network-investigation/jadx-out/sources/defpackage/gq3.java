package defpackage;

import android.animation.ValueAnimator;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gq3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ExpandableLayout a;

    public gq3(ExpandableLayout expandableLayout) {
        this.a = expandableLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setExpansion(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
