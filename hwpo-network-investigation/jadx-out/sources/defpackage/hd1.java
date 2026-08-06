package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ jd1.a a;
    public final /* synthetic */ jd1 b;

    public hd1(jd1 jd1Var, jd1.a aVar) {
        this.b = jd1Var;
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        jd1.a aVar = this.a;
        jd1.d(fFloatValue, aVar);
        jd1 jd1Var = this.b;
        jd1Var.a(fFloatValue, aVar, false);
        jd1Var.invalidateSelf();
    }
}
