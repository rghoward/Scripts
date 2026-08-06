package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import defpackage.ek7;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static int a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final Animation a;
        public final AnimatorSet b;

        public a(Animator animator) {
            this.a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
        }

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup t;
        public final View u;
        public boolean v;
        public boolean w;
        public boolean x;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.x = true;
            this.t = viewGroup;
            this.u = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.x = true;
            if (this.v) {
                return !this.w;
            }
            if (!super.getTransformation(j, transformation)) {
                this.v = true;
                ek7.a(this.t, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.v;
            ViewGroup viewGroup = this.t;
            if (z || !this.x) {
                viewGroup.endViewTransition(this.u);
                this.w = true;
            } else {
                this.x = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.x = true;
            if (this.v) {
                return !this.w;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.v = true;
                ek7.a(this.t, this);
            }
            return true;
        }
    }
}
