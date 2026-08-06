package net.cachapa.expandablelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import defpackage.fh8;
import defpackage.gq3;
import defpackage.pt3;
import defpackage.z90;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ExpandableLayout extends FrameLayout {
    public b A;
    public int t;
    public float u;
    public float v;
    public int w;
    public int x;
    public Interpolator y;
    public ValueAnimator z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a(int i);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS;
        this.y = new pt3();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fh8.a);
            this.t = typedArrayObtainStyledAttributes.getInt(1, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
            this.v = typedArrayObtainStyledAttributes.getBoolean(2, false) ? 1.0f : 0.0f;
            this.w = typedArrayObtainStyledAttributes.getInt(0, 1);
            this.u = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.x = this.v != 0.0f ? 3 : 0;
            setParallax(this.u);
        }
    }

    public final boolean a() {
        int i = this.x;
        return i == 2 || i == 3;
    }

    public final void b(boolean z, boolean z2) {
        if (z == a()) {
            return;
        }
        if (!z2) {
            setExpansion(z ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.z = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, z ? 1.0f : 0.0f);
        this.z = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.y);
        this.z.setDuration(this.t);
        this.z.addUpdateListener(new gq3(this));
        this.z.addListener(new a(z ? 1 : 0));
        this.z.start();
    }

    public int getDuration() {
        return this.t;
    }

    public float getExpansion() {
        return this.v;
    }

    public int getOrientation() {
        return this.w;
    }

    public float getParallax() {
        return this.u;
    }

    public int getState() {
        return this.x;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.w == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.v == 0.0f && i3 == 0) ? 8 : 0);
        int iRound = i3 - Math.round(i3 * this.v);
        float f = this.u;
        if (f > 0.0f) {
            float f2 = iRound * f;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (this.w == 0) {
                    childAt.setTranslationX((getLayoutDirection() != 1 ? -1 : 1) * f2);
                } else {
                    childAt.setTranslationY(-f2);
                }
            }
        }
        if (this.w == 0) {
            setMeasuredDimension(measuredWidth - iRound, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - iRound);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f = bundle.getFloat("expansion");
        this.v = f;
        this.x = f == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        float f = a() ? 1.0f : 0.0f;
        this.v = f;
        bundle.putFloat("expansion", f);
        bundle.putParcelable("super_state", parcelableOnSaveInstanceState);
        return bundle;
    }

    public void setDuration(int i) {
        this.t = i;
    }

    public void setExpanded(boolean z) {
        b(z, true);
    }

    public void setExpansion(float f) {
        float f2 = this.v;
        if (f2 == f) {
            return;
        }
        float f3 = f - f2;
        if (f == 0.0f) {
            this.x = 0;
        } else if (f == 1.0f) {
            this.x = 3;
        } else if (f3 < 0.0f) {
            this.x = 1;
        } else if (f3 > 0.0f) {
            this.x = 2;
        }
        setVisibility(this.x == 0 ? 8 : 0);
        this.v = f;
        requestLayout();
        b bVar = this.A;
        if (bVar != null) {
            bVar.a(this.x);
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.y = interpolator;
    }

    public void setOnExpansionUpdateListener(b bVar) {
        this.A = bVar;
    }

    public void setOrientation(int i) {
        if (i < 0 || i > 1) {
            z90.a("Orientation must be either 0 (horizontal) or 1 (vertical)");
        } else {
            this.w = i;
        }
    }

    public void setParallax(float f) {
        this.u = Math.min(1.0f, Math.max(0.0f, f));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Animator.AnimatorListener {
        public final int a;
        public boolean b;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            int i = this.a;
            int i2 = i == 0 ? 0 : 3;
            ExpandableLayout expandableLayout = ExpandableLayout.this;
            expandableLayout.x = i2;
            expandableLayout.setExpansion(i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ExpandableLayout.this.x = this.a == 0 ? 1 : 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    public ExpandableLayout(Context context) {
        this(context, null);
    }
}
