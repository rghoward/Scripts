package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.aa0;
import defpackage.az6;
import defpackage.bh8;
import defpackage.dx8;
import defpackage.e0;
import defpackage.e00;
import defpackage.i0a;
import defpackage.j0a;
import defpackage.jk6;
import defpackage.kj6;
import defpackage.kk6;
import defpackage.kl9;
import defpackage.lj6;
import defpackage.lk6;
import defpackage.ll9;
import defpackage.ln4;
import defpackage.mj6;
import defpackage.nj6;
import defpackage.ry9;
import defpackage.tl9;
import defpackage.uk6;
import defpackage.vka;
import defpackage.vz1;
import defpackage.wib;
import defpackage.xy;
import defpackage.z90;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends xy implements Checkable, tl9 {
    public static final int[] f0 = {R.attr.state_checkable};
    public static final int[] g0 = {R.attr.state_checked};
    public Drawable A;
    public PorterDuff.Mode B;
    public ColorStateList C;
    public Drawable D;
    public boolean E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public boolean W;
    public int a0;
    public int b0;
    public e c0;
    public float d0;
    public float e0;
    public final mj6 w;
    public final LinkedHashSet<b> x;
    public PorterDuff.Mode y;
    public ColorStateList z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ln4 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final float Q0(kk6 kk6Var) {
            return ((MaterialButton) kk6Var).getDisplayedWidthIncrease();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ln4
        public final void Z0(kk6 kk6Var, float f) {
            ((MaterialButton) kk6Var).setDisplayedWidthIncrease(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e t;
        public static final /* synthetic */ e[] u;

        /* JADX INFO: Fake field, exist only in values array */
        e EF0;

        static {
            e eVar = new e("NONE", 0);
            e eVar2 = new e("START", 1);
            e eVar3 = new e("END", 2);
            e eVar4 = new e("BOTH", 3);
            t = eVar4;
            u = new e[]{eVar, eVar2, eVar3, eVar4};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) u.clone();
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(uk6.b(context, attributeSet, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_Button, new int[]{com.hwpo_training_app.R.attr.materialSizeOverlay}), attributeSet, i);
        this.x = new LinkedHashSet<>();
        this.M = false;
        this.N = false;
        this.Q = Integer.MIN_VALUE;
        this.R = -2.1474836E9f;
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        this.a0 = Integer.MIN_VALUE;
        this.c0 = e.t;
        Context context2 = getContext();
        TypedArray typedArrayD = vka.d(context2, attributeSet, bh8.l, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.J = typedArrayD.getDimensionPixelSize(13, 0);
        int i2 = typedArrayD.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y = wib.c(i2, mode);
        this.z = jk6.b(getContext(), typedArrayD, 15);
        this.A = jk6.c(getContext(), typedArrayD, 11);
        this.O = typedArrayD.getInteger(12, 1);
        this.G = typedArrayD.getDimensionPixelSize(14, 0);
        this.B = wib.c(typedArrayD.getInt(22, -1), mode);
        this.C = typedArrayD.hasValue(21) ? jk6.b(getContext(), typedArrayD, 21) : this.z;
        this.P = typedArrayD.getInteger(20, 3);
        Drawable drawableC = jk6.c(getContext(), typedArrayD, 19);
        this.D = drawableC;
        this.E = drawableC == null;
        kl9 kl9VarG = i0a.g(context2, typedArrayD, 23);
        kl9VarG = kl9VarG == null ? ll9.g(context2, attributeSet, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_Button).a() : kl9VarG;
        boolean z = typedArrayD.getBoolean(17, false);
        mj6 mj6Var = new mj6(this, kl9VarG);
        this.w = mj6Var;
        mj6Var.e = typedArrayD.getDimensionPixelOffset(2, 0);
        mj6Var.f = typedArrayD.getDimensionPixelOffset(3, 0);
        mj6Var.g = typedArrayD.getDimensionPixelOffset(4, 0);
        mj6Var.h = typedArrayD.getDimensionPixelOffset(5, 0);
        if (typedArrayD.hasValue(9)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(9, -1);
            mj6Var.i = dimensionPixelSize;
            mj6Var.b = mj6Var.b.a(dimensionPixelSize);
            mj6Var.d();
            mj6Var.r = true;
        }
        mj6Var.j = typedArrayD.getDimensionPixelSize(26, 0);
        mj6Var.k = wib.c(typedArrayD.getInt(8, -1), mode);
        mj6Var.l = jk6.b(getContext(), typedArrayD, 7);
        mj6Var.m = jk6.b(getContext(), typedArrayD, 25);
        mj6Var.n = jk6.b(getContext(), typedArrayD, 18);
        mj6Var.s = typedArrayD.getBoolean(6, false);
        mj6Var.v = typedArrayD.getDimensionPixelSize(10, 0);
        mj6Var.t = typedArrayD.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            mj6Var.q = true;
            setSupportBackgroundTintList(mj6Var.l);
            setSupportBackgroundTintMode(mj6Var.k);
        } else {
            mj6Var.c();
        }
        setPaddingRelative(paddingStart + mj6Var.e, paddingTop + mj6Var.g, paddingEnd + mj6Var.f, paddingBottom + mj6Var.h);
        setCheckedInternal(typedArrayD.getBoolean(1, false));
        if (kl9VarG instanceof i0a) {
            mj6Var.c = az6.e(getContext());
            if (mj6Var.b instanceof i0a) {
                mj6Var.d();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.J);
        q(this.A != null);
        t(this.D != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.V = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.d0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        kk6 kk6VarA;
        if (this.U && this.W && (kk6VarA = this.w.a(false)) != null) {
            return (int) (kk6VarA.f() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        mj6 mj6Var = this.w;
        if (mj6Var == null || !mj6Var.s || this.M == z) {
            return;
        }
        this.M = z;
        refreshDrawableState();
        if (getParent() instanceof nj6) {
            nj6 nj6Var = (nj6) getParent();
            boolean z2 = this.M;
            if (!nj6Var.z) {
                nj6Var.g(getId(), z2);
            }
        }
        if (this.N) {
            return;
        }
        this.N = true;
        Iterator<b> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.N = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        com.google.android.material.button.a aVar;
        int iIndexOfChild;
        if (this.d0 != f) {
            this.d0 = f;
            s();
            invalidate();
            if (!(getParent() instanceof com.google.android.material.button.a) || (iIndexOfChild = (aVar = (com.google.android.material.button.a) getParent()).indexOfChild(this)) < 0) {
                return;
            }
            aVar.getChildCount();
            for (int i = iIndexOfChild - 1; i >= 0 && !aVar.d(i); i--) {
            }
            throw null;
        }
    }

    public final boolean d() {
        if (k() && n()) {
            return true;
        }
        if (j() && m()) {
            return true;
        }
        return l() && o();
    }

    public final boolean e(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final int f(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.A;
        if (drawable != null) {
            intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.D;
        if (drawable2 != null) {
            intrinsicWidth2 = this.G;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.J) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int g(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.J) - getPaddingBottom()) / 2);
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.F)) {
            return this.F;
        }
        mj6 mj6Var = this.w;
        return ((mj6Var == null || !mj6Var.s) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.a0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (p()) {
            return this.w.i;
        }
        return 0;
    }

    public ry9 getCornerSpringForce() {
        return this.w.c;
    }

    public Drawable getIcon() {
        return this.A;
    }

    public int getIconGravity() {
        return this.O;
    }

    public int getIconPadding() {
        return this.J;
    }

    public int getIconSize() {
        return this.G;
    }

    public ColorStateList getIconTint() {
        return this.z;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.y;
    }

    public int getInsetBottom() {
        return this.w.h;
    }

    public int getInsetLeft() {
        return this.w.e;
    }

    public int getInsetRight() {
        return this.w.f;
    }

    public int getInsetTop() {
        return this.w.g;
    }

    public ColorStateList getRippleColor() {
        if (p()) {
            return this.w.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.D;
    }

    public int getSecondaryIconGravity() {
        return this.P;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.C;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.B;
    }

    public kl9 getShapeAppearance() {
        if (p()) {
            return this.w.b;
        }
        aa0.c("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ll9 getShapeAppearanceModel() {
        if (p()) {
            return this.w.b.d();
        }
        aa0.c("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (p()) {
            return this.w.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (p()) {
            return this.w.j;
        }
        return 0;
    }

    @Override // defpackage.xy
    public ColorStateList getSupportBackgroundTintList() {
        return p() ? this.w.l : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.xy
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return p() ? this.w.k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.D == null || !n()) {
                return null;
            }
            return this.D;
        }
        if (i == 1) {
            if (this.D == null || !o()) {
                return null;
            }
            return this.D;
        }
        if (i == 2 && this.D != null && m()) {
            return this.D;
        }
        return null;
    }

    public final Drawable i(int i) {
        if (i == 0) {
            if (this.A == null || !k()) {
                return null;
            }
            return this.A;
        }
        if (i == 1) {
            if (this.A == null || !j()) {
                return null;
            }
            return this.A;
        }
        if (i == 2 && this.A != null && j()) {
            return this.A;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.M;
    }

    public final boolean j() {
        int i = this.O;
        return i == 3 || i == 4;
    }

    public final boolean k() {
        int i = this.O;
        return i == 1 || i == 2;
    }

    public final boolean l() {
        int i = this.O;
        return i == 16 || i == 32;
    }

    public final boolean m() {
        int i = this.P;
        return i == 3 || i == 4;
    }

    public final boolean n() {
        int i = this.P;
        return i == 1 || i == 2;
    }

    public final boolean o() {
        int i = this.P;
        return i == 16 || i == 32;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (p()) {
            lk6.d(this, this.w.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        mj6 mj6Var = this.w;
        if (mj6Var != null && mj6Var.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f0);
        }
        if (this.M) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, g0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.xy, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.M);
    }

    @Override // defpackage.xy, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        mj6 mj6Var = this.w;
        accessibilityNodeInfo.setCheckable(mj6Var != null && mj6Var.s);
        accessibilityNodeInfo.setChecked(this.M);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.xy, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        r(getMeasuredWidth(), getMeasuredHeight());
        u(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.Q != i6) {
            this.Q = i6;
            this.R = -2.1474836E9f;
        }
        if (this.R == -2.1474836E9f) {
            this.R = getMeasuredWidth();
            if (getParent() instanceof com.google.android.material.button.a) {
                ((com.google.android.material.button.a) getParent()).getButtonSizeChange();
            }
        }
        boolean z2 = false;
        if (this.a0 == Integer.MIN_VALUE) {
            if (this.A == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.G;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.A.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.a0 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.S == Integer.MIN_VALUE) {
            this.S = getPaddingStart();
        }
        if (this.T == Integer.MIN_VALUE) {
            this.T = getPaddingEnd();
        }
        if ((getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.W = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.t);
        setChecked(dVar.v);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.v = this.M;
        return dVar;
    }

    @Override // defpackage.xy, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        r(getMeasuredWidth(), getMeasuredHeight());
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        mj6 mj6Var = this.w;
        return (mj6Var == null || mj6Var.q) ? false : true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.w.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final void q(boolean z) {
        Drawable drawable = this.A;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.A = drawableMutate;
            drawableMutate.setTintList(this.z);
            PorterDuff.Mode mode = this.y;
            if (mode != null) {
                this.A.setTintMode(mode);
            }
            int intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.A.getIntrinsicWidth();
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.A.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A;
            int i = this.H;
            int i2 = this.I;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.A.setVisible(true, z);
        }
        if (this.A != null && this.D != null && d()) {
            z90.a("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.A == null && this.D != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (k() && compoundDrawablesRelative[0] != this.A) || (j() && compoundDrawablesRelative[2] != this.A) || (l() && compoundDrawablesRelative[1] != this.A);
        if (z || z2) {
            if (k()) {
                setCompoundDrawablesRelative(this.A, h(1), h(2), null);
            } else if (j()) {
                setCompoundDrawablesRelative(h(0), h(1), this.A, null);
            } else if (l()) {
                setCompoundDrawablesRelative(h(0), this.A, h(2), null);
            }
        }
    }

    public final void r(int i, int i2) {
        if (this.A == null || getLayout() == null) {
            return;
        }
        if (k() || j()) {
            this.I = 0;
            if (e(this.O)) {
                this.H = 0;
                q(false);
                return;
            }
            int iF = f(i, this.O);
            if (this.H != iF) {
                this.H = iF;
                q(false);
                return;
            }
            return;
        }
        if (l()) {
            this.H = 0;
            if (this.O == 16) {
                this.I = 0;
                q(false);
                return;
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.A.getIntrinsicHeight();
            }
            int iG = g(i2, intrinsicHeight);
            if (this.I != iG) {
                this.I = iG;
                q(false);
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A != null) {
            if (this.A.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s() {
        int i = (int) (this.d0 - this.e0);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.V;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.R + i);
        }
        setPaddingRelative(this.S + i3, getPaddingTop(), (this.T + i) - i3, getPaddingBottom());
    }

    public void setA11yClassName(String str) {
        this.F = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!p()) {
            super.setBackgroundColor(i);
            return;
        }
        mj6 mj6Var = this.w;
        if (mj6Var.a(false) != null) {
            mj6Var.a(false).setTint(i);
        }
    }

    @Override // defpackage.xy, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!p()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        mj6 mj6Var = this.w;
        mj6Var.q = true;
        MaterialButton materialButton = mj6Var.a;
        materialButton.setSupportBackgroundTintList(mj6Var.l);
        materialButton.setSupportBackgroundTintMode(mj6Var.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.xy, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? e00.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (p()) {
            this.w.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.R = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (p()) {
            mj6 mj6Var = this.w;
            if (mj6Var.r && mj6Var.i == i) {
                return;
            }
            mj6Var.i = i;
            mj6Var.r = true;
            mj6Var.b = mj6Var.b.a(i);
            mj6Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (p()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(ry9 ry9Var) {
        mj6 mj6Var = this.w;
        mj6Var.c = ry9Var;
        if (mj6Var.b instanceof i0a) {
            mj6Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.e0 = Math.min(i, this.a0);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (p()) {
            this.w.a(false).o(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A != drawable) {
            this.R = -2.1474836E9f;
            this.A = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.O != i) {
            if (this.A != null && this.D != null && d()) {
                z90.a("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.O = i;
                r(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.J != i) {
            this.J = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? e00.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            z90.a("iconSize cannot be less than 0");
        } else if (this.G != i) {
            this.R = -2.1474836E9f;
            this.G = i;
            q(true);
            t(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.y != mode) {
            this.y = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(vz1.b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        mj6 mj6Var = this.w;
        mj6Var.b(mj6Var.e, mj6Var.g, mj6Var.f, i);
    }

    public void setInsetLeft(int i) {
        mj6 mj6Var = this.w;
        mj6Var.b(i, mj6Var.g, mj6Var.f, mj6Var.h);
    }

    public void setInsetRight(int i) {
        mj6 mj6Var = this.w;
        mj6Var.b(mj6Var.e, mj6Var.g, i, mj6Var.h);
    }

    public void setInsetTop(int i) {
        mj6 mj6Var = this.w;
        mj6Var.b(mj6Var.e, i, mj6Var.f, mj6Var.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.U != z) {
            this.U = z;
            int i = 0;
            mj6 mj6Var = this.w;
            if (z) {
                kj6 kj6Var = new kj6(this);
                mj6Var.d = kj6Var;
                kk6 kk6VarA = mj6Var.a(false);
                if (kk6VarA != null) {
                    kk6VarA.X = kj6Var;
                }
            } else {
                mj6Var.d = null;
                kk6 kk6VarA2 = mj6Var.a(false);
                if (kk6VarA2 != null) {
                    kk6VarA2.X = null;
                }
            }
            post(new lj6(i, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (p()) {
            mj6 mj6Var = this.w;
            MaterialButton materialButton = mj6Var.a;
            if (mj6Var.n != colorStateList) {
                mj6Var.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(dx8.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (p()) {
            setRippleColor(vz1.b(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.D != drawable) {
            this.R = -2.1474836E9f;
            this.D = drawable;
            this.E = false;
            t(true);
            u(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconGravity(int i) {
        if (this.P != i) {
            if (this.D != null && this.A != null && d()) {
                z90.a("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.P = i;
                u(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? e00.b(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            t(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.B != mode) {
            this.B = mode;
            t(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(vz1.b(getContext(), i));
    }

    public void setShapeAppearance(kl9 kl9Var) {
        if (!p()) {
            aa0.c("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        mj6 mj6Var = this.w;
        if (mj6Var.c == null && kl9Var.e()) {
            mj6Var.c = az6.e(getContext());
            if (mj6Var.b instanceof i0a) {
                mj6Var.d();
            }
        }
        mj6Var.b = kl9Var;
        mj6Var.d();
    }

    @Override // defpackage.tl9
    public void setShapeAppearanceModel(ll9 ll9Var) {
        if (!p()) {
            aa0.c("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        mj6 mj6Var = this.w;
        mj6Var.b = ll9Var;
        mj6Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (p()) {
            mj6 mj6Var = this.w;
            mj6Var.p = z;
            mj6Var.e();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (p()) {
            mj6 mj6Var = this.w;
            if (mj6Var.m != colorStateList) {
                mj6Var.m = colorStateList;
                mj6Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (p()) {
            setStrokeColor(vz1.b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (p()) {
            mj6 mj6Var = this.w;
            if (mj6Var.j != i) {
                mj6Var.j = i;
                mj6Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (p()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.xy
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!p()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        mj6 mj6Var = this.w;
        if (mj6Var.l != colorStateList) {
            mj6Var.l = colorStateList;
            if (mj6Var.a(false) != null) {
                mj6Var.a(false).setTintList(mj6Var.l);
            }
        }
    }

    @Override // defpackage.xy
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!p()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        mj6 mj6Var = this.w;
        if (mj6Var.k != mode) {
            mj6Var.k = mode;
            if (mj6Var.a(false) == null || mj6Var.k == null) {
                return;
            }
            mj6Var.a(false).setTintMode(mj6Var.k);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.R = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        r(getMeasuredWidth(), getMeasuredHeight());
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.xy, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.R = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // defpackage.xy, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.R = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.w.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.R = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(e eVar) {
        if (this.c0 != eVar) {
            this.c0 = eVar;
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.b0 != i) {
            this.b0 = i;
        }
    }

    public final void t(boolean z) {
        Drawable drawable = this.D;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.D = drawableMutate;
            drawableMutate.setTintList(this.C);
            PorterDuff.Mode mode = this.B;
            if (mode != null) {
                this.D.setTintMode(mode);
            }
            int intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.D.getIntrinsicWidth();
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.D.getIntrinsicHeight();
            }
            Drawable drawable2 = this.D;
            int i = this.K;
            int i2 = this.L;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.D.setVisible(true, z);
        }
        if (this.D != null && this.A != null && d()) {
            z90.a("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.D == null) {
            if (this.E) {
                return;
            }
            if (this.A != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (n() && compoundDrawablesRelative[0] != this.D) || (m() && compoundDrawablesRelative[2] != this.D) || (o() && compoundDrawablesRelative[1] != this.D);
        if (z || z2) {
            if (n()) {
                setCompoundDrawablesRelative(this.D, i(1), i(2), null);
            } else if (m()) {
                setCompoundDrawablesRelative(i(0), i(1), this.D, null);
            } else if (o()) {
                setCompoundDrawablesRelative(i(0), this.D, i(2), null);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.M);
    }

    public final void u(int i, int i2) {
        if (this.D == null || getLayout() == null) {
            return;
        }
        if (n() || m()) {
            this.L = 0;
            if (e(this.P)) {
                this.K = 0;
                t(false);
                return;
            }
            int iF = f(i, this.P);
            if (this.K != iF) {
                this.K = iF;
                t(false);
                return;
            }
            return;
        }
        if (o()) {
            this.K = 0;
            if (this.P == 16) {
                this.L = 0;
                t(false);
                return;
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.D.getIntrinsicHeight();
            }
            int iG = g(i2, intrinsicHeight);
            if (this.L != iG) {
                this.L = iG;
                t(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends e0 {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public boolean v;

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                d.class.getClassLoader();
            }
            this.v = parcel.readInt() == 1;
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.v ? 1 : 0);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
    }

    public void setSizeChange(j0a j0aVar) {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
