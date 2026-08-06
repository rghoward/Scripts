package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.hwpo_training_app.R;
import defpackage.av;
import defpackage.aw;
import defpackage.bh8;
import defpackage.e0;
import defpackage.e56;
import defpackage.egb;
import defpackage.en9;
import defpackage.fib;
import defpackage.fj6;
import defpackage.gh0;
import defpackage.go9;
import defpackage.h0;
import defpackage.j08;
import defpackage.j4;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.ll9;
import defpackage.mk6;
import defpackage.nk6;
import defpackage.ogb;
import defpackage.ow8;
import defpackage.pk;
import defpackage.qt3;
import defpackage.vm9;
import defpackage.ym7;
import defpackage.z4;
import defpackage.z90;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements fj6 {
    public int A;
    public ogb B;
    public boolean C;
    public final float D;
    public int E;
    public int F;
    public int G;
    public int H;
    public WeakReference<V> I;
    public WeakReference<View> J;
    public final int K;
    public VelocityTracker L;
    public nk6 M;
    public int N;
    public final LinkedHashSet O;
    public final a P;
    public en9 t;
    public final kk6 u;
    public final ColorStateList v;
    public final ll9 w;
    public final SideSheetBehavior<V>.d x;
    public final float y;
    public final boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ogb.c {
        public a() {
        }

        @Override // ogb.c
        public final int a(int i, View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return ym7.d(i, sideSheetBehavior.t.g(), sideSheetBehavior.t.f());
        }

        @Override // ogb.c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // ogb.c
        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.E + sideSheetBehavior.H;
        }

        @Override // ogb.c
        public final void f(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.z) {
                    sideSheetBehavior.x(1);
                }
            }
        }

        @Override // ogb.c
        public final void g(View view, int i, int i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.J;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.t.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.O;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.t.b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((vm9) it.next()).b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0053  */
        @Override // ogb.c
        public final void h(View view, float f, float f2) {
            int i;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.t.k(f)) {
                if (!sideSheetBehavior.t.n(view, f)) {
                    if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        i = Math.abs(left - sideSheetBehavior.t.d()) < Math.abs(left - sideSheetBehavior.t.e()) ? 3 : 5;
                    }
                } else if (sideSheetBehavior.t.m(f, f2) || sideSheetBehavior.t.l(view)) {
                }
            }
            sideSheetBehavior.z(view, i, true);
        }

        @Override // ogb.c
        public final boolean i(int i, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.A == 1 || (weakReference = sideSheetBehavior.I) == null || weakReference.get() != view) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.x(5);
            WeakReference<V> weakReference = sideSheetBehavior.I;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.I.get().requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d {
        public int a;
        public boolean b;
        public final go9 c = new Runnable() { // from class: go9
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d dVar = this.t;
                dVar.b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                ogb ogbVar = sideSheetBehavior.B;
                if (ogbVar != null && ogbVar.f()) {
                    dVar.a(dVar.a);
                } else if (sideSheetBehavior.A == 2) {
                    sideSheetBehavior.x(dVar.a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [go9] */
        public d() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.I;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            sideSheetBehavior.I.get().postOnAnimation(this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new d();
        this.z = true;
        this.A = 5;
        this.D = 0.1f;
        this.K = -1;
        this.O = new LinkedHashSet();
        this.P = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.D);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.v = jk6.b(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.w = ll9.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.K = resourceId;
            WeakReference<View> weakReference = this.J;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.J = null;
            WeakReference<V> weakReference2 = this.I;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1 && v.isLaidOut()) {
                    v.requestLayout();
                }
            }
        }
        ll9 ll9Var = this.w;
        if (ll9Var != null) {
            kk6 kk6Var = new kk6(ll9Var);
            this.u = kk6Var;
            kk6Var.l(context);
            ColorStateList colorStateList = this.v;
            if (colorStateList != null) {
                this.u.p(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.u.setTint(typedValue.data);
            }
        }
        this.y = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.z = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        V v;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        egb.l(262144, v);
        egb.i(0, v);
        egb.l(1048576, v);
        egb.i(0, v);
        final int i = 5;
        if (this.A != 5) {
            egb.m(v, j4.a.l, new z4() { // from class: eo9
                @Override // defpackage.z4
                public final boolean a(View view) {
                    this.a.w(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.A != 3) {
            egb.m(v, j4.a.k, new z4() { // from class: eo9
                @Override // defpackage.z4
                public final boolean a(View view) {
                    this.a.w(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.fj6
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        nk6 nk6Var = this.M;
        if (nk6Var == null) {
            return;
        }
        gh0 gh0Var = nk6Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        nk6Var.f = null;
        int i2 = 5;
        if (gh0Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        en9 en9Var = this.t;
        if (en9Var != null && en9Var.j() != 0) {
            i2 = 3;
        }
        b bVar = new b();
        WeakReference<View> weakReference = this.J;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iC = this.t.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: fo9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.t.o(marginLayoutParams, aw.c(iC, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        V v = nk6Var.b;
        boolean z = gh0Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, v.getLayoutDirection()) & 3) == 3;
        float scaleX = v.getScaleX() * v.getWidth();
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new qt3());
        objectAnimatorOfFloat.setDuration(aw.c(nk6Var.c, gh0Var.c, nk6Var.d));
        objectAnimatorOfFloat.addListener(new mk6(nk6Var, z, i2));
        objectAnimatorOfFloat.addListener(bVar);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.fj6
    public final void b(gh0 gh0Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        nk6 nk6Var = this.M;
        if (nk6Var == null) {
            return;
        }
        en9 en9Var = this.t;
        int i = (en9Var == null || en9Var.j() == 0) ? 5 : 3;
        if (nk6Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        gh0 gh0Var2 = nk6Var.f;
        nk6Var.f = gh0Var;
        if (gh0Var2 != null) {
            nk6Var.a(gh0Var.c, i, gh0Var.d == 0);
        }
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.I.get();
        WeakReference<View> weakReference2 = this.J;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        this.t.o(marginLayoutParams, (int) ((v.getScaleX() * this.E) + this.H));
        view.requestLayout();
    }

    @Override // defpackage.fj6
    public final void c(gh0 gh0Var) {
        nk6 nk6Var = this.M;
        if (nk6Var == null) {
            return;
        }
        nk6Var.f = gh0Var;
    }

    @Override // defpackage.fj6
    public final void d() {
        nk6 nk6Var = this.M;
        if (nk6Var == null) {
            return;
        }
        V v = nk6Var.b;
        if (nk6Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        gh0 gh0Var = nk6Var.f;
        nk6Var.f = null;
        if (gh0Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(v, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(nk6Var.e);
        animatorSet.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(CoordinatorLayout.f fVar) {
        this.I = null;
        this.B = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void j() {
        this.I = null;
        this.B = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ogb ogbVar;
        VelocityTracker velocityTracker;
        if ((!v.isShown() && egb.f(v) == null) || !this.z) {
            this.C = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.L) != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.N = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.C) {
            this.C = false;
            return false;
        }
        return (this.C || (ogbVar = this.B) == null || !ogbVar.o(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        V v2;
        V v3;
        int i2;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        WeakReference<V> weakReference = this.I;
        kk6 kk6Var = this.u;
        int iH = 0;
        if (weakReference == null) {
            this.I = new WeakReference<>(v);
            this.M = new nk6(v);
            if (kk6Var != null) {
                v.setBackground(kk6Var);
                float elevation = this.y;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                kk6Var.o(elevation);
            } else {
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    v.setBackgroundTintList(colorStateList);
                }
            }
            int i3 = this.A == 5 ? 4 : 0;
            if (v.getVisibility() != i3) {
                v.setVisibility(i3);
            }
            A();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            if (egb.f(v) == null) {
                egb.p(v, v.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i4 = Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v.getLayoutParams()).c, i) == 3 ? 1 : 0;
        en9 en9Var = this.t;
        if (en9Var == null || en9Var.j() != i4) {
            CoordinatorLayout.f fVar = null;
            ll9 ll9Var = this.w;
            if (i4 == 0) {
                this.t = new ow8(this);
                if (ll9Var != null) {
                    WeakReference<V> weakReference2 = this.I;
                    if (weakReference2 != null && (v3 = weakReference2.get()) != null && (v3.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        ll9.a aVarK = ll9Var.k();
                        aVarK.f = new h0(0.0f);
                        aVarK.g = new h0(0.0f);
                        ll9 ll9VarA = aVarK.a();
                        if (kk6Var != null) {
                            kk6Var.setShapeAppearanceModel(ll9VarA);
                        }
                    }
                }
            } else {
                if (i4 != 1) {
                    z90.a(pk.d(i4, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.t = new e56(this);
                if (ll9Var != null) {
                    WeakReference<V> weakReference3 = this.I;
                    if (weakReference3 != null && (v2 = weakReference3.get()) != null && (v2.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        ll9.a aVarK2 = ll9Var.k();
                        aVarK2.e = new h0(0.0f);
                        aVarK2.h = new h0(0.0f);
                        ll9 ll9VarA2 = aVarK2.a();
                        if (kk6Var != null) {
                            kk6Var.setShapeAppearanceModel(ll9VarA2);
                        }
                    }
                }
            }
        }
        if (this.B == null) {
            this.B = new ogb(coordinatorLayout.getContext(), coordinatorLayout, this.P);
        }
        int iH2 = this.t.h(v);
        coordinatorLayout.r(i, v);
        this.F = coordinatorLayout.getWidth();
        this.G = this.t.i(coordinatorLayout);
        this.E = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.H = marginLayoutParams != null ? this.t.a(marginLayoutParams) : 0;
        int i5 = this.A;
        if (i5 == 1 || i5 == 2) {
            iH = iH2 - this.t.h(v);
        } else if (i5 != 3) {
            if (i5 != 5) {
                j08.a(this.A, "Unexpected value: ");
                return false;
            }
            iH = this.t.e();
        }
        WeakHashMap<View, fib> weakHashMap2 = egb.a;
        v.offsetLeftAndRight(iH);
        if (this.J == null && (i2 = this.K) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.J = new WeakReference<>(viewFindViewById);
        }
        for (vm9 vm9Var : this.O) {
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(View view, Parcelable parcelable) {
        int i = ((c) parcelable).v;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.A = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.B.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.L) != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.C && y()) {
            float fAbs = Math.abs(this.N - motionEvent.getX());
            ogb ogbVar = this.B;
            if (fAbs > ogbVar.b) {
                ogbVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.C;
    }

    public final void w(final int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(av.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        V v = this.I.get();
        Runnable runnable = new Runnable() { // from class: do9
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior sideSheetBehavior = this.t;
                Reference reference = sideSheetBehavior.I;
                View view = reference != null ? (View) reference.get() : null;
                if (view != null) {
                    sideSheetBehavior.z(view, i, false);
                }
            }
        };
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void x(int i) {
        V v;
        if (this.A == i) {
            return;
        }
        this.A = i;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.A == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((vm9) it.next()).a();
        }
        A();
    }

    public final boolean y() {
        if (this.B != null) {
            return this.z || this.A == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        x(2);
        r2.x.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            en9 r0 = r2.t
            int r0 = r0.e()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.pp2.a(r4, r2)
            defpackage.z90.a(r2)
            return
        L17:
            en9 r0 = r2.t
            int r0 = r0.d()
        L1d:
            ogb r1 = r2.B
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.n(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.x(r3)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$d r2 = r2.x
            r2.a(r4)
            return
        L55:
            r2.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends e0 {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public final int v;

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.v = parcel.readInt();
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.v);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.v = sideSheetBehavior.A;
        }
    }

    public SideSheetBehavior() {
        this.x = new d();
        this.z = true;
        this.A = 5;
        this.D = 0.1f;
        this.K = -1;
        this.O = new LinkedHashSet();
        this.P = new a();
    }
}
