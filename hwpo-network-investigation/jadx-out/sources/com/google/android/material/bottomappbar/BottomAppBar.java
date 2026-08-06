package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hwpo_training_app.R;
import defpackage.aw;
import defpackage.az6;
import defpackage.e0;
import defpackage.et0;
import defpackage.ft0;
import defpackage.gt0;
import defpackage.ht0;
import defpackage.it0;
import defpackage.jt0;
import defpackage.lk6;
import defpackage.z90;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int D = 0;
    public int A;
    public boolean B;
    public boolean C;
    public Integer t;
    public AnimatorSet u;
    public AnimatorSet v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ ActionMenuView t;
        public final /* synthetic */ int u;
        public final /* synthetic */ boolean v;

        public a(ActionMenuView actionMenuView, int i, boolean z) {
            this.t = actionMenuView;
            this.u = i;
            this.v = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.u;
            boolean z = this.v;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.t;
            actionMenuView.setTranslationX(bottomAppBar.e(actionMenuView, i, z));
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return az6.c(getContext(), R.attr.motionDurationLong2, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
    }

    private float getFabTranslationX() {
        return f(this.w);
    }

    private float getFabTranslationY() {
        if (this.y == 1) {
            return -getTopEdgeTreatment().w;
        }
        View viewD = d();
        return viewD != null ? (-((getMeasuredHeight() + getBottomInset()) - viewD.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private jt0 getTopEdgeTreatment() {
        throw null;
    }

    public final View d() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        ArrayList<View> arrayList = coordinatorLayout.u.b.get(this);
        ArrayList arrayList2 = coordinatorLayout.w;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            View view = (View) obj;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int e(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.A != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z2) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - (right + i2);
    }

    public final float f(int i) {
        int measuredWidth = 0;
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return 0.0f;
        }
        View viewD = d();
        if (this.z != -1 && viewD != null) {
            measuredWidth = this.z + (viewD.getMeasuredWidth() / 2);
        }
        return ((getMeasuredWidth() / 2) - measuredWidth) * (z ? -1 : 1);
    }

    public final boolean g() {
        View viewD = d();
        FloatingActionButton floatingActionButton = viewD instanceof FloatingActionButton ? (FloatingActionButton) viewD : null;
        return floatingActionButton != null && floatingActionButton.k();
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().w;
    }

    public int getFabAlignmentMode() {
        return this.w;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.z;
    }

    public int getFabAnchorMode() {
        return this.y;
    }

    public int getFabAnimationMode() {
        return this.x;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().u;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().t;
    }

    public boolean getHideOnScroll() {
        return this.B;
    }

    public int getMenuAlignmentMode() {
        return this.A;
    }

    public final void h() {
        jt0 topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.C && g()) {
            int i = this.y;
        }
        throw null;
    }

    public final void i(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().v) {
            return;
        }
        getTopEdgeTreatment().v = f;
        throw null;
    }

    public final void j(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        a aVar = new a(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk6.d(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.v;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.u;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            h();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.v != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (g()) {
            j(actionMenuView, this.w, this.C, false);
        } else {
            j(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.t);
        this.w = bVar.v;
        this.C = bVar.w;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.v = this.w;
        bVar.w = this.C;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f == getCradleVerticalOffset()) {
            return;
        }
        jt0 topEdgeTreatment = getTopEdgeTreatment();
        if (f >= 0.0f) {
            topEdgeTreatment.w = f;
            throw null;
        }
        topEdgeTreatment.getClass();
        z90.a("cradleVerticalOffset must be positive.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        boolean z = this.C;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.v;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (g()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - e(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new ht0(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.v = animatorSet3;
            animatorSet3.addListener(new gt0(this));
            this.v.start();
        }
        if (this.w != i && isLaidOut()) {
            AnimatorSet animatorSet4 = this.u;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.x == 1) {
                View viewD = d();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewD instanceof FloatingActionButton ? (FloatingActionButton) viewD : null, "translationX", f(i));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewD2 = d();
                FloatingActionButton floatingActionButton = viewD2 instanceof FloatingActionButton ? (FloatingActionButton) viewD2 : null;
                if (floatingActionButton != null && !floatingActionButton.j()) {
                    floatingActionButton.i(new ft0(this, i), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(az6.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, aw.a));
            this.u = animatorSet5;
            animatorSet5.addListener(new et0(this));
            this.u.start();
        }
        this.w = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.z == i) {
            return;
        }
        this.z = i;
        h();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.y = i;
        h();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.x = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().x) {
            return;
        }
        getTopEdgeTreatment().x = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().u = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().t = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.B = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.A != i) {
            this.A = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                j(actionMenuView, this.w, g(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.t.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.t = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends e0 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int v;
        public boolean w;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.v = parcel.readInt();
            this.w = parcel.readInt() != 0;
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.v);
            parcel.writeInt(this.w ? 1 : 0);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new b[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect G;
        public WeakReference<BottomAppBar> H;
        public int I;
        public final a J;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                Rect rect = behavior.G;
                BottomAppBar bottomAppBar = behavior.H.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.g(rect);
                    int iHeight = rect.height();
                    bottomAppBar.i(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.I == 0) {
                    if (bottomAppBar.y == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (view.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i9 = BottomAppBar.D;
                bottomAppBar.h();
                throw null;
            }
        }

        public Behavior() {
            this.J = new a();
            this.G = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.H = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.D;
            View viewD = bottomAppBar.d();
            if (viewD == null || viewD.isLaidOut()) {
                coordinatorLayout.r(i, bottomAppBar);
                super.l(coordinatorLayout, bottomAppBar, i);
                return false;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewD.getLayoutParams();
            fVar.d = 17;
            int i3 = bottomAppBar.y;
            if (i3 == 1) {
                fVar.d = 49;
            }
            if (i3 == 0) {
                fVar.d |= 80;
            }
            this.I = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewD.getLayoutParams())).bottomMargin;
            if (viewD instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) viewD;
                if (floatingActionButton.getShowMotionSpec() == null) {
                    floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                }
                if (floatingActionButton.getHideMotionSpec() == null) {
                    floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                }
                floatingActionButton.d();
                floatingActionButton.e(new it0());
                floatingActionButton.f();
            }
            viewD.addOnLayoutChangeListener(this.J);
            bottomAppBar.h();
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.J = new a();
            this.G = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
