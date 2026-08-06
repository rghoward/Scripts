package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.hwpo_training_app.R;
import defpackage.aw;
import defpackage.az6;
import defpackage.bh8;
import defpackage.du4;
import defpackage.e0;
import defpackage.e00;
import defpackage.egb;
import defpackage.f83;
import defpackage.fib;
import defpackage.fjb;
import defpackage.g53;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.l97;
import defpackage.lk6;
import defpackage.mu4;
import defpackage.pg7;
import defpackage.uk6;
import defpackage.umb;
import defpackage.vka;
import defpackage.yhb;
import defpackage.ym7;
import defpackage.z90;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final /* synthetic */ int T = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ColorStateList E;
    public int F;
    public WeakReference<View> G;
    public ValueAnimator H;
    public ValueAnimator.AnimatorUpdateListener I;
    public final ArrayList J;
    public final LinkedHashSet<f> K;
    public final long L;
    public final TimeInterpolator M;
    public int[] N;
    public int O;
    public Drawable P;
    public Integer Q;
    public final float R;
    public Behavior S;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public umb z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements pg7 {
        public a() {
        }

        @Override // defpackage.pg7
        public final umb b(View view, umb umbVar) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            umb umbVar2 = appBarLayout.getFitsSystemWindows() ? umbVar : null;
            if (!Objects.equals(appBarLayout.z, umbVar2)) {
                appBarLayout.z = umbVar2;
                appBarLayout.setWillNotDraw(!(appBarLayout.P != null && appBarLayout.getTopInset() > 0));
                appBarLayout.requestLayout();
            }
            return umbVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends b {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends LinearLayout.LayoutParams {
        public int a;
        public c b;
        public Interpolator c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Deprecated
    public interface e {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class f {
        public abstract void a();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(uk6.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.y = 0;
        this.J = new ArrayList();
        this.K = new LinkedHashSet<>();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = vka.d(context3, attributeSet, fjb.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = vka.d(context2, attributeSet, bh8.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.E = jk6.b(context2, typedArrayD2, 6);
            this.L = az6.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.M = az6.d(context2, R.attr.motionEasingStandardInterpolator, aw.a);
            if (typedArrayD2.hasValue(4)) {
                d(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                fjb.a(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayD2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayD2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
                }
                if (typedArrayD2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
                }
            }
            this.R = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.D = typedArrayD2.getBoolean(5, false);
            this.F = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            a aVar = new a();
            WeakHashMap<View, fib> weakHashMap = egb.a;
            egb.d.c(this, aVar);
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static d b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            d dVar = new d((LinearLayout.LayoutParams) layoutParams);
            dVar.a = 1;
            return dVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar2 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar2.a = 1;
            return dVar2;
        }
        d dVar3 = new d(layoutParams);
        dVar3.a = 1;
        return dVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.b);
        dVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        dVar.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new c();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            dVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public final void c() {
        Behavior behavior = this.S;
        BaseBehavior.a aVarJ = (behavior == null || this.u == -1 || this.y != 0) ? null : behavior.J(e0.u, this);
        this.u = -1;
        this.v = -1;
        this.w = -1;
        if (aVarJ != null) {
            Behavior behavior2 = this.S;
            if (behavior2.F != null) {
                return;
            }
            behavior2.F = aVarJ;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        this.y = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.P == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.t);
        this.P.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.P;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z) {
        if (this.A || this.C == z) {
            return false;
        }
        this.C = z;
        refreshDrawableState();
        if (!(getBackground() instanceof kk6)) {
            return true;
        }
        if (this.E != null) {
            g(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.D) {
            return true;
        }
        float f2 = this.R;
        g(z ? 0.0f : f2, z ? f2 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i;
        if (this.G == null && (i = this.F) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.F);
            }
            if (viewFindViewById != null) {
                this.G = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.G;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f2, float f3) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        this.H = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.L);
        this.H.setInterpolator(this.M);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.I;
        if (animatorUpdateListener != null) {
            this.H.addUpdateListener(animatorUpdateListener);
        }
        this.H.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -2);
        dVar.a = 1;
        return dVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.S = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = dVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.v = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.w;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = dVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.w = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.F;
    }

    public kk6 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof kk6) {
            return (kk6) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.y;
    }

    public Drawable getStatusBarForeground() {
        return this.P;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        umb umbVar = this.z;
        if (umbVar != null) {
            return umbVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = dVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + minimumHeight;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.u = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk6.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.N == null) {
            this.N = new int[4];
        }
        int[] iArr = this.N;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.B;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.C) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.C) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.G;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.G = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.x = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((d) getChildAt(i5).getLayoutParams()).c != null) {
                this.x = true;
                break;
            }
        }
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.A) {
            return;
        }
        if (!this.D) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((d) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.B != z2) {
            this.B = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = ym7.d(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final kk6 kk6Var;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof kk6) {
            kk6Var = (kk6) drawable;
        } else {
            ColorStateList colorStateListA = f83.a(drawable);
            if (colorStateListA == null) {
                kk6Var = null;
            } else {
                kk6 kk6Var2 = new kk6();
                kk6Var2.p(colorStateListA);
                kk6Var = kk6Var2;
            }
        }
        if (kk6Var != null && (colorStateList = kk6Var.u.c) != null) {
            this.O = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.E;
            if (colorStateList2 != null) {
                final Integer numB = g53.b(getContext(), R.attr.colorSurface);
                this.I = new ValueAnimator.AnimatorUpdateListener() { // from class: qy
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.a;
                        LinkedHashSet<AppBarLayout.f> linkedHashSet = appBarLayout.K;
                        ArrayList arrayList = appBarLayout.J;
                        int iD = g53.d(appBarLayout.O, ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
                        kk6 kk6Var3 = kk6Var;
                        kk6Var3.p(colorStateListValueOf);
                        if (appBarLayout.P != null && (num = appBarLayout.Q) != null && num.equals(numB)) {
                            appBarLayout.P.setTint(iD);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                AppBarLayout.e eVar = (AppBarLayout.e) obj;
                                if (kk6Var3.u.c != null) {
                                    eVar.a();
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator<AppBarLayout.f> it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                    }
                };
            } else {
                kk6Var.l(context);
                this.I = new ValueAnimator.AnimatorUpdateListener() { // from class: ry
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i = AppBarLayout.T;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kk6Var.o(fFloatValue);
                        AppBarLayout appBarLayout = this.a;
                        Drawable drawable2 = appBarLayout.P;
                        if (drawable2 instanceof kk6) {
                            ((kk6) drawable2).o(fFloatValue);
                        }
                        ArrayList arrayList = appBarLayout.J;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            ((AppBarLayout.e) obj).a();
                        }
                        Iterator<AppBarLayout.f> it = appBarLayout.K.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                    }
                };
            }
            drawable = kk6Var;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        lk6.c(this, f2);
    }

    public void setExpanded(boolean z) {
        d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.D = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.F = -1;
        if (view != null) {
            this.G = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.G;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.G = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.F = i;
        WeakReference<View> weakReference = this.G;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.G = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.A = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            z90.a("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.y = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.P = drawableMutate;
            if (drawableMutate instanceof kk6) {
                numValueOf = Integer.valueOf(((kk6) drawableMutate).O);
            } else {
                ColorStateList colorStateListA = f83.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.Q = numValueOf;
            Drawable drawable3 = this.P;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.P.setState(getDrawableState());
                }
                this.P.setLayoutDirection(getLayoutDirection());
                this.P.setVisible(getVisibility() == 0, false);
                this.P.setCallback(this);
            }
            if (this.P != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(e00.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        fjb.a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class BaseBehavior<T extends AppBarLayout> extends du4<T> {
        public int C;
        public int D;
        public ValueAnimator E;
        public a F;
        public WeakReference<View> G;

        public BaseBehavior() {
        }

        public static View F(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View H(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof l97) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        public static void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((d) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zF = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    }
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (appBarLayout.D) {
                zF = appBarLayout.f(H(coordinatorLayout));
            }
            boolean zE = appBarLayout.e(zF);
            if (!z) {
                if (zE) {
                    ArrayList<View> arrayList = coordinatorLayout.u.b.get(appBarLayout);
                    ArrayList arrayList2 = coordinatorLayout.w;
                    arrayList2.clear();
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                    }
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) arrayList2.get(i5)).getLayoutParams()).a;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).y == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // defpackage.du4
        public final int A(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // defpackage.du4
        public final int B(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // defpackage.du4
        public final void C(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            K(coordinatorLayout, appBarLayout);
            if (appBarLayout.D) {
                appBarLayout.e(appBarLayout.f(H(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:62:0x0153  */
        /* JADX WARN: Code duplicated, block: B:64:0x0158  */
        /* JADX WARN: Code duplicated, block: B:65:0x015a  */
        @Override // defpackage.du4
        public final int D(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean z;
            int i4;
            int i5;
            c cVar;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iX = x();
            int i6 = 0;
            if (i2 == 0 || iX < i2 || iX > i3) {
                this.C = 0;
            } else {
                int iD = ym7.d(i, i2, i3);
                if (iX != iD) {
                    if (!appBarLayout.x) {
                        top = iD;
                        break;
                    }
                    int iAbs = Math.abs(iD);
                    int childCount = appBarLayout.getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 < childCount) {
                            View childAt = appBarLayout.getChildAt(i7);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i8 = dVar.a;
                                    if ((i8 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                                        if ((i8 & 2) != 0) {
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iD);
                                        break;
                                    }
                                }
                            } else {
                                i7++;
                            }
                        }
                        top = iD;
                        break;
                    }
                    yhb yhbVar = this.t;
                    int i9 = 1;
                    if (yhbVar != null) {
                        if (yhbVar.d != top) {
                            yhbVar.d = top;
                            yhbVar.a();
                            z = true;
                        }
                        int i10 = iX - iD;
                        this.C = iD - top;
                        if (z) {
                            i5 = 0;
                            while (i5 < appBarLayout.getChildCount()) {
                                d dVar2 = (d) appBarLayout.getChildAt(i5).getLayoutParams();
                                cVar = dVar2.b;
                                if (cVar == null && (dVar2.a & i9) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i5);
                                    float fW = w();
                                    Rect rect = cVar.b;
                                    Rect rect2 = cVar.a;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect2.top - Math.abs(fW);
                                    if (fAbs <= 0.0f) {
                                        float fC = 1.0f - ym7.c(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fC * fC)));
                                        childAt2.setTranslationY(fHeight);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-fHeight));
                                        if (fHeight >= rect.height()) {
                                            childAt2.setAlpha(0.0f);
                                        } else {
                                            childAt2.setAlpha(1.0f);
                                        }
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setAlpha(1.0f);
                                    }
                                }
                                i5++;
                                i9 = 1;
                            }
                        }
                        if (!z && appBarLayout.x) {
                            coordinatorLayout.c(appBarLayout);
                        }
                        appBarLayout.t = w();
                        if (!appBarLayout.willNotDraw()) {
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        if (iD < iX) {
                            i4 = -1;
                        } else {
                            i4 = 1;
                        }
                        L(coordinatorLayout, appBarLayout, iD, i4, false);
                        i6 = i10;
                    } else {
                        this.u = top;
                    }
                    z = false;
                    int i11 = iX - iD;
                    this.C = iD - top;
                    if (z) {
                        i5 = 0;
                        while (i5 < appBarLayout.getChildCount()) {
                            d dVar3 = (d) appBarLayout.getChildAt(i5).getLayoutParams();
                            cVar = dVar3.b;
                            if (cVar == null) {
                            }
                            i5++;
                            i9 = 1;
                        }
                    }
                    if (!z) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.t = w();
                    if (!appBarLayout.willNotDraw()) {
                        appBarLayout.postInvalidateOnAnimation();
                    }
                    if (iD < iX) {
                        i4 = -1;
                    } else {
                        i4 = 1;
                    }
                    L(coordinatorLayout, appBarLayout, iD, i4, false);
                    i6 = i11;
                }
            }
            if (egb.e(coordinatorLayout) != null) {
                return i6;
            }
            egb.o(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(x() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iX = x();
            ValueAnimator valueAnimator = this.E;
            if (iX == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.E.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.E = valueAnimator2;
                valueAnimator2.setInterpolator(aw.e);
                this.E.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.E.setDuration(Math.min(iRound, 600));
            this.E.setIntValues(iX, i);
            this.E.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = D(coordinatorLayout, appBarLayout2, x() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.D) {
                appBarLayout2.e(appBarLayout2.f(view));
            }
        }

        public final a J(Parcelable parcelable, T t) {
            int iW = w();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = e0.u;
                    }
                    a aVar = new a(parcelable);
                    boolean z = iW == 0;
                    aVar.w = z;
                    aVar.v = !z && (-iW) >= t.getTotalScrollRange();
                    aVar.x = i;
                    aVar.z = bottom == t.getTopInset() + childAt.getMinimumHeight();
                    aVar.y = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return null;
        }

        public final void K(CoordinatorLayout coordinatorLayout, T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int iX = x() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if ((dVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i2 = -iX;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i3 = dVar2.a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && t.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= t.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iX < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (iX < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    G(coordinatorLayout, t, ym7.d(topInset + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.xhb, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            a aVar = this.F;
            if (aVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            G(coordinatorLayout, appBarLayout, i2);
                        } else {
                            E(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            G(coordinatorLayout, appBarLayout, 0);
                        } else {
                            E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.v) {
                E(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (aVar.w) {
                E(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(aVar.x);
                int i3 = -childAt.getBottom();
                if (this.F.z) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.F.y) + i3;
                }
                E(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.y = 0;
            this.F = null;
            int iD = ym7.d(w(), -appBarLayout.getTotalScrollRange(), 0);
            yhb yhbVar = this.t;
            if (yhbVar == null) {
                this.u = iD;
            } else if (yhbVar.d != iD) {
                yhbVar.d = iD;
                yhbVar.a();
            }
            L(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.t = w();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (egb.e(coordinatorLayout) != null) {
                return true;
            }
            egb.o(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            I(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.D(coordinatorLayout2, appBarLayout, x() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && egb.e(coordinatorLayout2) == null) {
                egb.o(coordinatorLayout2, new com.google.android.material.appbar.b(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof a) {
                this.F = (a) parcelable;
            } else {
                this.F = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            a aVarJ = J(absSavedState, (AppBarLayout) view);
            return aVarJ == null ? absSavedState : aVarJ;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.D || appBarLayout.C || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.E) != null) {
                valueAnimator.cancel();
            }
            this.G = null;
            this.D = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.D == 0 || i == 1) {
                K(coordinatorLayout, appBarLayout);
                if (appBarLayout.D) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.G = new WeakReference<>(view2);
        }

        @Override // defpackage.xhb
        public final int x() {
            return w() + this.C;
        }

        @Override // defpackage.du4
        public final boolean z(View view) {
            WeakReference<View> weakReference = this.G;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a extends e0 {
            public static final Parcelable.Creator<a> CREATOR = new C0050a();
            public boolean v;
            public boolean w;
            public int x;
            public float y;
            public boolean z;

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.v = parcel.readByte() != 0;
                this.w = parcel.readByte() != 0;
                this.x = parcel.readInt();
                this.y = parcel.readFloat();
                this.z = parcel.readByte() != 0;
            }

            @Override // defpackage.e0, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.x);
                parcel.writeFloat(this.y);
                parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
            }

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public class C0050a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new a[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -2);
        dVar.a = 1;
        return dVar;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ScrollingViewBehavior extends mu4 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.A);
            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // defpackage.mu4
        public final float A(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
                int iX = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).x() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iX > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iX / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.mu4
        public final int B(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iD;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).C + this.x;
                if (this.y == 0) {
                    iD = 0;
                } else {
                    float fA = A(view2);
                    int i = this.y;
                    iD = ym7.d((int) (fA * i), 0, i);
                }
                int i2 = bottom - iD;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.D) {
                    appBarLayout.e(appBarLayout.f(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                egb.o(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.v;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.mu4
        public final AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
