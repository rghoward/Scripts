package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.hwpo_training_app.R;
import defpackage.bh8;
import defpackage.dx8;
import defpackage.egb;
import defpackage.fib;
import defpackage.ft0;
import defpackage.iq3;
import defpackage.it0;
import defpackage.jk6;
import defpackage.jq3;
import defpackage.ks0;
import defpackage.lk6;
import defpackage.ll9;
import defpackage.mjb;
import defpackage.py2;
import defpackage.qr3;
import defpackage.tl9;
import defpackage.tz;
import defpackage.uk6;
import defpackage.vka;
import defpackage.wib;
import defpackage.xy6;
import defpackage.xz;
import defpackage.z90;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends mjb implements iq3, tl9, CoordinatorLayout.b {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public final Rect E;
    public final Rect F;
    public final xz G;
    public final jq3 H;
    public d I;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public ColorStateList w;
    public PorterDuff.Mode x;
    public ColorStateList y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b {
        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c<T extends FloatingActionButton> implements d.c {
        @Override // com.google.android.material.floatingactionbutton.d.c
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.c
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        int resourceId;
        int resourceId2;
        super(uk6.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.t = getVisibility();
        this.E = new Rect();
        this.F = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = vka.d(context2, attributeSet, bh8.h, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.u = jk6.b(context2, typedArrayD, 1);
        this.v = wib.c(typedArrayD.getInt(2, -1), null);
        this.y = jk6.b(context2, typedArrayD, 12);
        this.z = typedArrayD.getInt(7, -1);
        this.A = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, 0.0f);
        float dimension2 = typedArrayD.getDimension(9, 0.0f);
        float dimension3 = typedArrayD.getDimension(11, 0.0f);
        this.D = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        xy6 xy6VarA = (!typedArrayD.hasValue(15) || (resourceId2 = typedArrayD.getResourceId(15, 0)) == 0) ? null : xy6.a(context2, resourceId2);
        xy6 xy6VarA2 = (!typedArrayD.hasValue(8) || (resourceId = typedArrayD.getResourceId(8, 0)) == 0) ? null : xy6.a(context2, resourceId);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bh8.t, i, R.style.Widget_Design_FloatingActionButton);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        xy6 xy6Var = xy6VarA2;
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId3);
        if (resourceId4 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId4, true);
        }
        ll9 ll9VarA = ll9.h(contextThemeWrapper.obtainStyledAttributes(bh8.B), ll9.m).a();
        boolean z = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        xz xzVar = new xz(this);
        this.G = xzVar;
        xzVar.b(attributeSet, i);
        this.H = new jq3(this);
        getImpl().g(ll9VarA);
        d impl = getImpl();
        ColorStateList colorStateList = this.u;
        PorterDuff.Mode mode = this.v;
        ColorStateList colorStateList2 = this.y;
        FloatingActionButton floatingActionButton = impl.v;
        ll9 ll9Var = impl.a;
        ll9Var.getClass();
        d.b bVar = new d.b(ll9Var);
        impl.b = bVar;
        bVar.setTintList(colorStateList);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.l(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            ll9 ll9Var2 = impl.a;
            ll9Var2.getClass();
            ks0 ks0Var = new ks0(ll9Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            ks0Var.i = color;
            ks0Var.j = color2;
            ks0Var.k = color3;
            ks0Var.l = color4;
            float f = dimensionPixelSize;
            if (ks0Var.h != f) {
                ks0Var.h = f;
                ks0Var.b.setStrokeWidth(f * 1.3333f);
                ks0Var.n = true;
                ks0Var.invalidateSelf();
            }
            if (colorStateList != null) {
                ks0Var.m = colorStateList.getColorForState(ks0Var.getState(), ks0Var.m);
            }
            ks0Var.p = colorStateList;
            ks0Var.n = true;
            ks0Var.invalidateSelf();
            impl.d = ks0Var;
            ks0 ks0Var2 = impl.d;
            ks0Var2.getClass();
            d.b bVar2 = impl.b;
            bVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{ks0Var2, bVar2});
            drawable = null;
        } else {
            drawable = null;
            impl.d = null;
            layerDrawable = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(dx8.c(colorStateList2), layerDrawable, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.e(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        d impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        d impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        d impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = xy6VarA;
        getImpl().o = xy6Var;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private d getImpl() {
        if (this.I == null) {
            this.I = new d(this, new b());
        }
        return this.I;
    }

    @Override // defpackage.iq3
    public final boolean a() {
        return this.H.b;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList<>();
        }
        impl.t.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(it0 it0Var) {
        d impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList<>();
        }
        impl.s.add(it0Var);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c();
        if (impl.u == null) {
            impl.u = new ArrayList<>();
        }
        impl.u.add(cVar);
    }

    public final void g(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i = rect.left;
        Rect rect2 = this.E;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.u;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.v;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.A;
    }

    public int getExpandedComponentIdHint() {
        return this.H.c;
    }

    public xy6 getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.y;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.y;
    }

    public ll9 getShapeAppearanceModel() {
        ll9 ll9Var = getImpl().a;
        ll9Var.getClass();
        return ll9Var;
    }

    public xy6 getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.z;
    }

    public int getSizeDimension() {
        return h(this.z);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.w;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.x;
    }

    public boolean getUseCompatPadding() {
        return this.D;
    }

    public final int h(int i) {
        int i2 = this.A;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    public final void i(ft0 ft0Var, boolean z) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar = ft0Var == null ? null : new com.google.android.material.floatingactionbutton.a(this, ft0Var);
        FloatingActionButton floatingActionButton = impl.v;
        FloatingActionButton floatingActionButton2 = impl.v;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.b(z ? 8 : 4, z);
            if (aVar != null) {
                aVar.a.a(aVar.b);
                return;
            }
            return;
        }
        xy6 xy6Var = impl.o;
        AnimatorSet animatorSetB = xy6Var != null ? impl.b(xy6Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, d.E, d.F);
        animatorSetB.addListener(new com.google.android.material.floatingactionbutton.b(impl, z, aVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i2);
                i2++;
                animatorSetB.addListener(animatorListener);
            }
        }
        animatorSetB.start();
    }

    public final boolean j() {
        d impl = getImpl();
        int visibility = impl.v.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        d impl = getImpl();
        int visibility = impl.v.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.w;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.x;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(tz.c(colorForState, mode));
    }

    public final void m(ft0.a aVar, boolean z) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        FloatingActionButton floatingActionButton = impl.v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.v;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        int i2 = 0;
        boolean z2 = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.b(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        xy6 xy6Var = impl.n;
        AnimatorSet animatorSetB = xy6Var != null ? impl.b(xy6Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, d.C, d.D);
        animatorSetB.addListener(new com.google.android.material.floatingactionbutton.c(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i2 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i2);
                i2++;
                animatorSetB.addListener(animatorListener);
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        d.b bVar = impl.b;
        if (bVar != null) {
            lk6.d(impl.v, bVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.B = (sizeDimension - this.C) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.E;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qr3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qr3 qr3Var = (qr3) parcelable;
        super.onRestoreInstanceState(qr3Var.t);
        Bundle bundle = qr3Var.v.get("expandableWidgetHelper");
        bundle.getClass();
        jq3 jq3Var = this.H;
        jq3Var.getClass();
        jq3Var.b = bundle.getBoolean("expanded", false);
        jq3Var.c = bundle.getInt("expandedComponentIdHint", 0);
        if (jq3Var.b) {
            FloatingActionButton floatingActionButton = jq3Var.a;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        qr3 qr3Var = new qr3(parcelableOnSaveInstanceState);
        jq3 jq3Var = this.H;
        jq3Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", jq3Var.b);
        bundle.putInt("expandedComponentIdHint", jq3Var.c);
        qr3Var.v.put("expandableWidgetHelper", bundle);
        return qr3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.F;
            g(rect);
            d dVar = this.I;
            int i = -(dVar.f ? Math.max((dVar.k - dVar.v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            d impl = getImpl();
            d.b bVar = impl.b;
            if (bVar != null) {
                bVar.setTintList(colorStateList);
            }
            ks0 ks0Var = impl.d;
            if (ks0Var != null) {
                if (colorStateList != null) {
                    ks0Var.m = colorStateList.getColorForState(ks0Var.getState(), ks0Var.m);
                }
                ks0Var.p = colorStateList;
                ks0Var.n = true;
                ks0Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.v != mode) {
            this.v = mode;
            d.b bVar = getImpl().b;
            if (bVar != null) {
                bVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            z90.a("Custom size must be non-negative");
        } else if (i != this.A) {
            this.A = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d.b bVar = getImpl().b;
        if (bVar != null) {
            bVar.o(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.H.c = i;
    }

    public void setHideMotionSpec(xy6 xy6Var) {
        getImpl().o = xy6Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(xy6.a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.w != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.G.c(i);
        l();
    }

    public void setMaxImageSize(int i) {
        this.C = i;
        d impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            d impl = getImpl();
            ColorStateList colorStateList2 = this.y;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(dx8.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(dx8.c(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<d.c> arrayList = getImpl().u;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).b();
        throw null;
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<d.c> arrayList = getImpl().u;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).b();
        throw null;
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // defpackage.tl9
    public void setShapeAppearanceModel(ll9 ll9Var) {
        getImpl().g(ll9Var);
    }

    public void setShowMotionSpec(xy6 xy6Var) {
        getImpl().n = xy6Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(xy6.a(getContext(), i));
    }

    public void setSize(int i) {
        this.A = 0;
        if (i != this.z) {
            this.z = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.x != mode) {
            this.x = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.D != z) {
            this.D = z;
            getImpl().h();
        }
    }

    @Override // defpackage.mjb, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect t;
        public final boolean u;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.i);
            this.u = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.E;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListE = coordinatorLayout.e(floatingActionButton);
            int size = arrayListE.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListE.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i, floatingActionButton);
            Rect rect = floatingActionButton.E;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap<View, fib> weakHashMap2 = egb.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.u || fVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.t == null) {
                this.t = new Rect();
            }
            Rect rect = this.t;
            py2.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.u || fVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public BaseBehavior() {
            this.u = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
