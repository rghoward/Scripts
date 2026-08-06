package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class j7a extends CompoundButton {
    public static final a n0 = new a(Float.class, "thumbPos");
    public static final int[] o0 = {R.attr.state_checked};
    public PorterDuff.Mode A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public CharSequence H;
    public CharSequence I;
    public CharSequence J;
    public CharSequence K;
    public boolean L;
    public int M;
    public final int N;
    public float O;
    public float P;
    public final VelocityTracker Q;
    public final int R;
    public float S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public final TextPaint e0;
    public final ColorStateList f0;
    public StaticLayout g0;
    public StaticLayout h0;
    public final ii i0;
    public ObjectAnimator j0;
    public vz k0;
    public b l0;
    public final Rect m0;
    public Drawable t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public boolean w;
    public boolean x;
    public Drawable y;
    public ColorStateList z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends Property<j7a, Float> {
        @Override // android.util.Property
        public final Float get(j7a j7aVar) {
            return Float.valueOf(j7aVar.S);
        }

        @Override // android.util.Property
        public final void set(j7a j7aVar, Float f) {
            j7aVar.setThumbPosition(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends d.f {
        public final WeakReference t;

        public b(j7a j7aVar) {
            this.t = new WeakReference(j7aVar);
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            j7a j7aVar = (j7a) this.t.get();
            if (j7aVar != null) {
                j7aVar.c();
            }
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            j7a j7aVar = (j7a) this.t.get();
            if (j7aVar != null) {
                j7aVar.c();
            }
        }
    }

    public j7a(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.u = null;
        this.v = null;
        this.w = false;
        this.x = false;
        this.z = null;
        this.A = null;
        this.B = false;
        this.C = false;
        this.Q = VelocityTracker.obtain();
        this.d0 = true;
        this.m0 = new Rect();
        xka.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.e0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = ph8.v;
        gpa gpaVarE = gpa.e(context, attributeSet, iArr, i);
        TypedArray typedArray = gpaVarE.b;
        egb.n(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableB = gpaVarE.b(2);
        this.t = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = gpaVarE.b(11);
        this.y = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.L = typedArray.getBoolean(3, true);
        this.D = typedArray.getDimensionPixelSize(8, 0);
        this.E = typedArray.getDimensionPixelSize(5, 0);
        this.F = typedArray.getDimensionPixelSize(6, 0);
        this.G = typedArray.getBoolean(4, false);
        ColorStateList colorStateListA = gpaVarE.a(9);
        if (colorStateListA != null) {
            this.u = colorStateListA;
            this.w = true;
        }
        PorterDuff.Mode modeC = d83.c(typedArray.getInt(10, -1), null);
        if (this.v != modeC) {
            this.v = modeC;
            this.x = true;
        }
        if (this.w || this.x) {
            a();
        }
        ColorStateList colorStateListA2 = gpaVarE.a(12);
        if (colorStateListA2 != null) {
            this.z = colorStateListA2;
            this.B = true;
        }
        PorterDuff.Mode modeC2 = d83.c(typedArray.getInt(13, -1), null);
        if (this.A != modeC2) {
            this.A = modeC2;
            this.C = true;
        }
        if (this.B || this.C) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, ph8.w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = vz1.b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f0 = colorStateList;
            } else {
                this.f0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ii iiVar = new ii();
                iiVar.t = context2.getResources().getConfiguration().locale;
                this.i0 = iiVar;
            } else {
                this.i0 = null;
            }
            setTextOnInternal(this.H);
            setTextOffInternal(this.J);
            typedArrayObtainStyledAttributes.recycle();
        }
        new k00(this).f(attributeSet, i);
        gpaVarE.f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.N = viewConfiguration.getScaledTouchSlop();
        this.R = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private vz getEmojiTextViewHelper() {
        if (this.k0 == null) {
            this.k0 = new vz(this);
        }
        return this.k0;
    }

    private boolean getTargetCheckedState() {
        return this.S > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = yib.a;
        int layoutDirection = getLayoutDirection();
        float f = this.S;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.y;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.m0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.t;
        Rect rectB = drawable2 != null ? d83.b(drawable2) : d83.c;
        return ((((this.T - this.V) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.J = charSequence;
        TransformationMethod transformationMethodE = getEmojiTextViewHelper().b.a.e(this.i0);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.K = charSequence;
        this.h0 = null;
        if (this.L) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.H = charSequence;
        TransformationMethod transformationMethodE = getEmojiTextViewHelper().b.a.e(this.i0);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.I = charSequence;
        this.g0 = null;
        if (this.L) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.t;
        if (drawable != null) {
            if (this.w || this.x) {
                Drawable drawableMutate = drawable.mutate();
                this.t = drawableMutate;
                if (this.w) {
                    drawableMutate.setTintList(this.u);
                }
                if (this.x) {
                    this.t.setTintMode(this.v);
                }
                if (this.t.isStateful()) {
                    this.t.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.y;
        if (drawable != null) {
            if (this.B || this.C) {
                Drawable drawableMutate = drawable.mutate();
                this.y = drawableMutate;
                if (this.B) {
                    drawableMutate.setTintList(this.z);
                }
                if (this.C) {
                    this.y.setTintMode(this.A);
                }
                if (this.y.isStateful()) {
                    this.y.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.H);
        setTextOffInternal(this.J);
        requestLayout();
    }

    public final void d() {
        if (this.l0 == null && this.k0.b.a.b() && d.d()) {
            d dVarA = d.a();
            int iC = dVarA.c();
            if (iC == 3 || iC == 0) {
                b bVar = new b(this);
                this.l0 = bVar;
                dVarA.h(bVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.W;
        int i4 = this.a0;
        int i5 = this.b0;
        int i6 = this.c0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.t;
        Rect rectB = drawable != null ? d83.b(drawable) : d83.c;
        Drawable drawable2 = this.y;
        Rect rect = this.m0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.y.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.y.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.t;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.V + rect.right;
            this.t.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.t;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.y;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = yib.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.T;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.F : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = yib.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.T;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.F : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return eka.e(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.L;
    }

    public boolean getSplitTrack() {
        return this.G;
    }

    public int getSwitchMinWidth() {
        return this.E;
    }

    public int getSwitchPadding() {
        return this.F;
    }

    public CharSequence getTextOff() {
        return this.J;
    }

    public CharSequence getTextOn() {
        return this.H;
    }

    public Drawable getThumbDrawable() {
        return this.t;
    }

    public final float getThumbPosition() {
        return this.S;
    }

    public int getThumbTextPadding() {
        return this.D;
    }

    public ColorStateList getThumbTintList() {
        return this.u;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.v;
    }

    public Drawable getTrackDrawable() {
        return this.y;
    }

    public ColorStateList getTrackTintList() {
        return this.z;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.j0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.j0.end();
        this.j0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, o0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.y;
        Rect rect = this.m0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.a0;
        int i2 = this.c0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.t;
        if (drawable != null) {
            if (!this.G || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = d83.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.g0 : this.h0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.e0;
            ColorStateList colorStateList = this.f0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.H : this.J;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.t != null) {
            Drawable drawable = this.y;
            Rect rect = this.m0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = d83.b(this.t);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = yib.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.T + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.T) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.U;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.U + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.U;
        }
        this.W = paddingLeft;
        this.a0 = paddingTop;
        this.c0 = height;
        this.b0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.L) {
            StaticLayout staticLayout = this.g0;
            TextPaint textPaint = this.e0;
            if (staticLayout == null) {
                CharSequence charSequence = this.I;
                this.g0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.h0 == null) {
                CharSequence charSequence2 = this.K;
                this.h0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.t;
        Rect rect = this.m0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.t.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.t.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.L) {
            iMax = (this.D * 2) + Math.max(this.g0.getWidth(), this.h0.getWidth());
        } else {
            iMax = 0;
        }
        this.V = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.y.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.t;
        if (drawable3 != null) {
            Rect rectB = d83.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.d0;
        int iMax4 = this.E;
        if (z) {
            iMax4 = Math.max(iMax4, (this.V * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.T = iMax4;
        this.U = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.H : this.J;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.Q;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.M == 2) {
                    this.M = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.R) {
                            boolean z2 = yib.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.M = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.M;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.O) > f3 || Math.abs(y - this.P) > f3) {
                        this.M = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.O = x;
                        this.P = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.O;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = yib.a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.S;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.O = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.M == 2) {
                    this.M = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.R) {
                            boolean z4 = yib.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.M = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.t != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.t;
                Rect rect = this.m0;
                drawable.getPadding(rect);
                int i3 = this.a0 - i;
                int i4 = (this.W + thumbOffset) - i;
                int i5 = this.V + i4 + rect.left + rect.right + i;
                int i6 = this.c0 + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.M = 1;
                    this.O = x3;
                    this.P = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.H;
                if (string == null) {
                    string = getResources().getString(com.hwpo_training_app.R.string.abc_capital_on);
                }
                WeakHashMap<View, fib> weakHashMap = egb.a;
                new cgb(com.hwpo_training_app.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.J;
            if (string2 == null) {
                string2 = getResources().getString(com.hwpo_training_app.R.string.abc_capital_off);
            }
            WeakHashMap<View, fib> weakHashMap2 = egb.a;
            new cgb(com.hwpo_training_app.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.j0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n0, zIsChecked ? 1.0f : 0.0f);
        this.j0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.j0.setAutoCancel(true);
        this.j0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(eka.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.H);
        setTextOffInternal(this.J);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.d0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.L != z) {
            this.L = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.G = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.E = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.F = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.e0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.J;
        if (string == null) {
            string = getResources().getString(com.hwpo_training_app.R.string.abc_capital_off);
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        new cgb(com.hwpo_training_app.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.H;
        if (string == null) {
            string = getResources().getString(com.hwpo_training_app.R.string.abc_capital_on);
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        new cgb(com.hwpo_training_app.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.S = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(e00.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.D = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        this.w = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.v = mode;
        this.x = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(e00.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.z = colorStateList;
        this.B = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A = mode;
        this.C = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t || drawable == this.y;
    }
}
