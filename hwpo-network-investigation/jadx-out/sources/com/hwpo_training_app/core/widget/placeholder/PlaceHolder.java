package com.hwpo_training_app.core.widget.placeholder;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import defpackage.ch8;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.eu2;
import defpackage.g2b;
import defpackage.hs5;
import defpackage.mh4;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.t72;
import defpackage.vz7;
import defpackage.xgb;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaceHolder extends ConstraintLayout {
    public static final a Companion = new a();
    public final hs5 J;
    public int K;
    public final ValueAnimator L;
    public final ValueAnimator M;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.core.widget.placeholder.PlaceHolder$onClick$1", f = "PlaceHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public final /* synthetic */ mh4<g2b> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mh4<g2b> mh4Var, r02<? super d> r02Var) {
            super(3, r02Var);
            this.t = mh4Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return new d(this.t, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.t.invoke();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        hs5 hs5VarInflate = hs5.inflate(LayoutInflater.from(getContext()), this, true);
        hs5VarInflate.getClass();
        this.J = hs5VarInflate;
        this.K = -1;
        setClickable(true);
        setFocusable(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ch8.e);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(4);
        if (string == null) {
            string = context.getString(R.string.something_went_wrong);
            string.getClass();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(3);
        if (string2 == null) {
            string2 = context.getString(R.string.no_internet_description);
            string2.getClass();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(0);
        if (string3 == null) {
            string3 = context.getString(R.string.reload);
            string3.getClass();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        setTitle(string);
        q(string2);
        p(string3, z);
        g2b g2bVar = g2b.a;
        typedArrayObtainStyledAttributes.recycle();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hz7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlaceHolder.a aVar = PlaceHolder.Companion;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                this.a.setAlpha(((Float) animatedValue).floatValue());
            }
        });
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addListener(new b());
        this.L = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iz7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlaceHolder.a aVar = PlaceHolder.Companion;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                this.a.setAlpha(((Float) animatedValue).floatValue());
            }
        });
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addListener(new f());
        valueAnimatorOfFloat2.addListener(new e());
        this.M = valueAnimatorOfFloat2;
    }

    public static void h(PlaceHolder placeHolder) {
        ValueAnimator valueAnimator = placeHolder.M;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        placeHolder.L.start();
    }

    public static void r(PlaceHolder placeHolder) {
        ValueAnimator valueAnimator = placeHolder.L;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        placeHolder.M.start();
    }

    public final void g(vz7 vz7Var, mh4<g2b> mh4Var) {
        vz7Var.getClass();
        setVisibility(vz7Var.b ? 0 : 8);
        if (getVisibility() == 0) {
            setTitle(vz7Var.d);
            q(vz7Var.e);
            p(vz7Var.f, vz7Var.c);
            i(new eu2(1, mh4Var));
            r(this);
        }
    }

    public final int getPlaceholderId() {
        return this.K;
    }

    public final void i(mh4<g2b> mh4Var) {
        xgb.a(this.J.b, new d(mh4Var, null));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void p(String str, boolean z) {
        str.getClass();
        hs5 hs5Var = this.J;
        if (!z) {
            hs5Var.b.setVisibility(8);
        } else {
            hs5Var.b.setVisibility(0);
            setActionButtonText(str);
        }
    }

    public final void q(String str) {
        str.getClass();
        hs5 hs5Var = this.J;
        hs5Var.c.setText(str);
        hs5Var.c.setVisibility(0);
    }

    public final void setActionButtonText(String str) {
        str.getClass();
        this.J.b.setText(str);
    }

    public final void setPlaceholderId(int i) {
        this.K = i;
    }

    public final void setTitle(String str) {
        str.getClass();
        this.J.d.setText(str);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            PlaceHolder placeHolder = PlaceHolder.this;
            placeHolder.setVisibility(0);
            placeHolder.setAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlaceHolder placeHolder = PlaceHolder.this;
            placeHolder.setVisibility(8);
            placeHolder.setAlpha(1.0f);
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            PlaceHolder placeHolder = PlaceHolder.this;
            placeHolder.setVisibility(8);
            placeHolder.setAlpha(0.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements Animator.AnimatorListener {
        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            PlaceHolder.this.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlaceHolder(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PlaceHolder(Context context, AttributeSet attributeSet, int i, qq2 qq2Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
