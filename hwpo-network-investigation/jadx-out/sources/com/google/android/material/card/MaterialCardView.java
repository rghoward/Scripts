package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import defpackage.ak6;
import defpackage.az6;
import defpackage.bh8;
import defpackage.e00;
import defpackage.g53;
import defpackage.i0a;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.lk6;
import defpackage.ll9;
import defpackage.ry9;
import defpackage.tl9;
import defpackage.uk6;
import defpackage.vka;
import defpackage.vz1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, tl9 {
    public static final int[] D = {R.attr.state_checkable};
    public static final int[] E = {R.attr.state_checked};
    public static final int[] F = {com.hwpo_training_app.R.attr.state_dragged};
    public static final int[] G = {R.attr.state_hovered};
    public final boolean A;
    public boolean B;
    public boolean C;
    public final ak6 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        i0a i0aVarG;
        super(uk6.a(context, attributeSet, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.B = false;
        this.C = false;
        this.A = true;
        TypedArray typedArrayD = vka.d(getContext(), attributeSet, bh8.p, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ak6 ak6Var = new ak6(this, attributeSet, i);
        this.z = ak6Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        kk6 kk6Var = ak6Var.c;
        kk6Var.p(cardBackgroundColor);
        ak6Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        ak6Var.l();
        MaterialCardView materialCardView = ak6Var.a;
        ColorStateList colorStateListB = jk6.b(materialCardView.getContext(), typedArrayD, 11);
        ak6Var.o = colorStateListB;
        if (colorStateListB == null) {
            ak6Var.o = ColorStateList.valueOf(-1);
        }
        ak6Var.i = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z = typedArrayD.getBoolean(0, false);
        ak6Var.t = z;
        materialCardView.setLongClickable(z);
        ak6Var.m = jk6.b(materialCardView.getContext(), typedArrayD, 6);
        ak6Var.g(jk6.c(materialCardView.getContext(), typedArrayD, 2));
        ak6Var.g = typedArrayD.getDimensionPixelSize(5, 0);
        ak6Var.f = typedArrayD.getDimensionPixelSize(4, 0);
        ak6Var.h = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListB2 = jk6.b(materialCardView.getContext(), typedArrayD, 7);
        ak6Var.l = colorStateListB2;
        if (colorStateListB2 == null) {
            ak6Var.l = ColorStateList.valueOf(g53.a(com.hwpo_training_app.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListB3 = jk6.b(materialCardView.getContext(), typedArrayD, 1);
        colorStateListB3 = colorStateListB3 == null ? ColorStateList.valueOf(0) : colorStateListB3;
        kk6 kk6Var2 = ak6Var.d;
        kk6Var2.p(colorStateListB3);
        RippleDrawable rippleDrawable = ak6Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ak6Var.l);
        }
        kk6Var.o(materialCardView.getCardElevation());
        float f = ak6Var.i;
        ColorStateList colorStateList = ak6Var.o;
        kk6Var2.u.j = f;
        kk6Var2.invalidateSelf();
        kk6.c cVar = kk6Var2.u;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            kk6Var2.onStateChange(kk6Var2.getState());
        }
        materialCardView.setBackgroundInternal(ak6Var.d(kk6Var));
        Drawable drawableC = ak6Var.j() ? ak6Var.c() : kk6Var2;
        ak6Var.j = drawableC;
        materialCardView.setForeground(ak6Var.d(drawableC));
        if (ak6Var.e == -1.0f && (i0aVarG = i0a.g(materialCardView.getContext(), typedArrayD, 8)) != null) {
            ry9 ry9VarE = az6.e(materialCardView.getContext());
            kk6Var.n(ry9VarE);
            kk6Var2.n(ry9VarE);
            kk6 kk6Var3 = ak6Var.r;
            if (kk6Var3 != null) {
                kk6Var3.n(ry9VarE);
            }
            ak6Var.h(i0aVarG);
        }
        typedArrayD.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.z.c.getBounds());
        return rectF;
    }

    public final void e() {
        ak6 ak6Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (ak6Var = this.z).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        ak6Var.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        ak6Var.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.z.c.u.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.z.d.u.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.z.k;
    }

    public int getCheckedIconGravity() {
        return this.z.h;
    }

    public int getCheckedIconMargin() {
        return this.z.f;
    }

    public int getCheckedIconSize() {
        return this.z.g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.z.m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.z.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.z.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.z.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.z.b.top;
    }

    public float getProgress() {
        return this.z.c.u.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.z.c.i();
    }

    public ColorStateList getRippleColor() {
        return this.z.l;
    }

    public ll9 getShapeAppearanceModel() {
        return this.z.n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.z.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.z.o;
    }

    public int getStrokeWidth() {
        return this.z.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ak6 ak6Var = this.z;
        ak6Var.k();
        lk6.d(this, ak6Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        ak6 ak6Var = this.z;
        if (ak6Var != null && ak6Var.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (this.B) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        if (this.C) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, G);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.B);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        ak6 ak6Var = this.z;
        accessibilityNodeInfo.setCheckable(ak6Var != null && ak6Var.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.B);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.z.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A) {
            ak6 ak6Var = this.z;
            if (!ak6Var.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                ak6Var.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.z.c.p(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        ak6 ak6Var = this.z;
        ak6Var.c.o(ak6Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        kk6 kk6Var = this.z.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        kk6Var.p(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.z.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.B != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.z.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        ak6 ak6Var = this.z;
        if (ak6Var.h != i) {
            ak6Var.h = i;
            MaterialCardView materialCardView = ak6Var.a;
            ak6Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.z.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.z.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.z.g(e00.b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.z.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.z.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ak6 ak6Var = this.z;
        ak6Var.m = colorStateList;
        Drawable drawable = ak6Var.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        ak6 ak6Var = this.z;
        if (ak6Var != null) {
            ak6Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.C != z) {
            this.C = z;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.z.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        ak6 ak6Var = this.z;
        ak6Var.m();
        ak6Var.l();
    }

    public void setProgress(float f) {
        ak6 ak6Var = this.z;
        ak6Var.c.q(f);
        kk6 kk6Var = ak6Var.d;
        if (kk6Var != null) {
            kk6Var.q(f);
        }
        kk6 kk6Var2 = ak6Var.r;
        if (kk6Var2 != null) {
            kk6Var2.q(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        ak6 ak6Var = this.z;
        ak6Var.e = f;
        ak6Var.h(ak6Var.n.d().a(f));
        ak6Var.j.invalidateSelf();
        if (ak6Var.i() || (ak6Var.a.getPreventCornerOverlap() && !ak6Var.c.m())) {
            ak6Var.l();
        }
        if (ak6Var.i()) {
            ak6Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ak6 ak6Var = this.z;
        ak6Var.l = colorStateList;
        RippleDrawable rippleDrawable = ak6Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListB = vz1.b(getContext(), i);
        ak6 ak6Var = this.z;
        ak6Var.l = colorStateListB;
        RippleDrawable rippleDrawable = ak6Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListB);
        }
    }

    @Override // defpackage.tl9
    public void setShapeAppearanceModel(ll9 ll9Var) {
        setClipToOutline(ll9Var.j(getBoundsAsRectF()));
        this.z.h(ll9Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ak6 ak6Var = this.z;
        if (ak6Var.o != colorStateList) {
            ak6Var.o = colorStateList;
            kk6 kk6Var = ak6Var.d;
            kk6Var.u.j = ak6Var.i;
            kk6Var.invalidateSelf();
            kk6.c cVar = kk6Var.u;
            if (cVar.d != colorStateList) {
                cVar.d = colorStateList;
                kk6Var.onStateChange(kk6Var.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        ak6 ak6Var = this.z;
        if (i != ak6Var.i) {
            ak6Var.i = i;
            kk6 kk6Var = ak6Var.d;
            ColorStateList colorStateList = ak6Var.o;
            kk6Var.u.j = i;
            kk6Var.invalidateSelf();
            kk6.c cVar = kk6Var.u;
            if (cVar.d != colorStateList) {
                cVar.d = colorStateList;
                kk6Var.onStateChange(kk6Var.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        ak6 ak6Var = this.z;
        ak6Var.m();
        ak6Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ak6 ak6Var = this.z;
        if (ak6Var != null && ak6Var.t && isEnabled()) {
            this.B = !this.B;
            refreshDrawableState();
            e();
            ak6Var.f(this.B, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.z.c.p(colorStateList);
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
