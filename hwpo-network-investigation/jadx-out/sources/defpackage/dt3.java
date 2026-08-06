package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dt3 extends ljb {
    public dt3(int i) {
        this.Y = i;
    }

    public static float R(wwa wwaVar, float f) {
        Float f2;
        return (wwaVar == null || (f2 = (Float) wwaVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public final ObjectAnimator Q(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        zib.a.b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, zib.b, f2);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        q().a(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.wva
    public final void g(wwa wwaVar) {
        ljb.O(wwaVar);
        View view = wwaVar.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(zib.a.a(view)) : Float.valueOf(0.0f);
        }
        wwaVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.wva
    public final boolean v() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends AnimatorListenerAdapter implements wva.f {
        public final View a;
        public boolean b = false;

        public a(View view) {
            this.a = view;
        }

        @Override // wva.f
        public final void d() {
            View view = this.a;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? zib.a.a(view) : 0.0f));
        }

        @Override // wva.f
        public final void k() {
            this.a.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            zib.a.b(this.a, 1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.b;
            View view = this.a;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            djb djbVar = zib.a;
            djbVar.b(view, 1.0f);
            djbVar.getClass();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.b = true;
                view.setLayerType(2, null);
            }
        }

        @Override // wva.f
        public final void a(wva wvaVar) {
        }

        @Override // wva.f
        public final void e(wva wvaVar) {
        }

        @Override // wva.f
        public final void g(wva wvaVar) {
        }

        @Override // wva.f
        public final void l(wva wvaVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
