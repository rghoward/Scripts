package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.intercom.twig.BuildConfig;
import defpackage.a41;
import defpackage.aw;
import defpackage.az6;
import defpackage.bh8;
import defpackage.bj6;
import defpackage.by8;
import defpackage.c93;
import defpackage.d43;
import defpackage.d72;
import defpackage.d83;
import defpackage.dba;
import defpackage.dj6;
import defpackage.dt3;
import defpackage.e0;
import defpackage.e00;
import defpackage.e36;
import defpackage.egb;
import defpackage.f41;
import defpackage.g53;
import defpackage.gpa;
import defpackage.h0;
import defpackage.hb5;
import defpackage.i34;
import defpackage.i65;
import defpackage.j4;
import defpackage.jk6;
import defpackage.jz9;
import defpackage.kda;
import defpackage.kk6;
import defpackage.lk6;
import defpackage.ll9;
import defpackage.m00;
import defpackage.m3;
import defpackage.py2;
import defpackage.qa3;
import defpackage.qwa;
import defpackage.r0a;
import defpackage.sha;
import defpackage.tp0;
import defpackage.tz;
import defpackage.ud2;
import defpackage.uk6;
import defpackage.vi1;
import defpackage.vka;
import defpackage.vz1;
import defpackage.xa8;
import defpackage.xg1;
import defpackage.yg1;
import defpackage.z90;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] W0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public int A0;
    public int B;
    public Drawable B0;
    public int C;
    public ColorStateList C0;
    public final hb5 D;
    public ColorStateList D0;
    public boolean E;
    public int E0;
    public int F;
    public int F0;
    public boolean G;
    public int G0;
    public f H;
    public ColorStateList H0;
    public m00 I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public CharSequence L;
    public int L0;
    public boolean M;
    public int M0;
    public m00 N;
    public int N0;
    public ColorStateList O;
    public boolean O0;
    public int P;
    public final yg1 P0;
    public dt3 Q;
    public boolean Q0;
    public dt3 R;
    public boolean R0;
    public ColorStateList S;
    public ValueAnimator S0;
    public ColorStateList T;
    public boolean T0;
    public ColorStateList U;
    public boolean U0;
    public ColorStateList V;
    public boolean V0;
    public boolean W;
    public CharSequence a0;
    public boolean b0;
    public kk6 c0;
    public kk6 d0;
    public StateListDrawable e0;
    public boolean f0;
    public kk6 g0;
    public kk6 h0;
    public ll9 i0;
    public boolean j0;
    public final int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public final Rect s0;
    public final FrameLayout t;
    public final Rect t0;
    public final jz9 u;
    public final RectF u0;
    public final com.google.android.material.textfield.a v;
    public Typeface v0;
    public final int w;
    public ColorDrawable w0;
    public EditText x;
    public int x0;
    public CharSequence y;
    public final LinkedHashSet<g> y0;
    public int z;
    public ColorDrawable z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends m3 {
        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            super.onInitializeAccessibilityNodeInfo(view, j4Var);
            j4Var.a.setVisibleToUser(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.v.z;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.P0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends m3 {
        public final TextInputLayout t;

        public e(TextInputLayout textInputLayout) {
            this.t = textInputLayout;
        }

        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            CharSequence charSequence;
            super.onInitializeAccessibilityNodeInfo(view, j4Var);
            TextInputLayout textInputLayout = this.t;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence helperText = textInputLayout.getHelperText();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.O0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : BuildConfig.FLAVOR;
            if (TextUtils.isEmpty(helperText)) {
                charSequence = error;
            } else {
                hb5 hb5Var = textInputLayout.D;
                charSequence = error;
                if (hb5Var.o == 2 && hb5Var.y != null && !TextUtils.isEmpty(hb5Var.w)) {
                    if (TextUtils.isEmpty(string)) {
                        string = helperText.toString();
                    } else {
                        string = string + ", " + ((Object) helperText);
                    }
                }
            }
            jz9 jz9Var = textInputLayout.u;
            m00 m00Var = jz9Var.u;
            if (m00Var.getVisibility() == 0) {
                j4Var.a.setLabelFor(m00Var);
                j4Var.a.setTraversalAfter(m00Var);
            } else {
                j4Var.a.setTraversalAfter(jz9Var.w);
            }
            AccessibilityNodeInfo accessibilityNodeInfo = j4Var.a;
            if (!zIsEmpty) {
                j4Var.s(text);
            } else if (!TextUtils.isEmpty(string)) {
                j4Var.s(string);
                if (!z && placeholderText != null) {
                    j4Var.s(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                j4Var.s(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    j4Var.n(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    j4Var.s(string);
                }
                j4Var.r(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : counterOverflowDescription);
            }
            textInputLayout.v.a().m(j4Var);
        }

        @Override // defpackage.m3
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.t.v.a().n(accessibilityEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface h {
        void a();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(uk6.a(context, attributeSet, i2, com.hwpo_training_app.R.style.Widget_Design_TextInputLayout), attributeSet, i2);
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = new hb5(this);
        this.H = new xa8();
        this.s0 = new Rect();
        this.t0 = new Rect();
        this.u0 = new RectF();
        this.y0 = new LinkedHashSet<>();
        yg1 yg1Var = new yg1(this);
        this.P0 = yg1Var;
        this.V0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.t = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = aw.a;
        yg1Var.R = linearInterpolator;
        yg1Var.j(false);
        yg1Var.Q = linearInterpolator;
        yg1Var.j(false);
        if (yg1Var.g != 8388659) {
            yg1Var.g = 8388659;
            yg1Var.j(false);
        }
        gpa gpaVarE = vka.e(context2, attributeSet, bh8.I, i2, com.hwpo_training_app.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        jz9 jz9Var = new jz9(this, gpaVarE);
        this.u = jz9Var;
        TypedArray typedArray = gpaVarE.b;
        this.W = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.R0 = typedArray.getBoolean(47, true);
        this.Q0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.i0 = ll9.g(context2, attributeSet, i2, com.hwpo_training_app.R.style.Widget_Design_TextInputLayout).a();
        this.k0 = context2.getResources().getDimensionPixelOffset(com.hwpo_training_app.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.m0 = typedArray.getDimensionPixelOffset(9, 0);
        this.w = getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.o0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.p0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.n0 = this.o0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        ll9.a aVarK = this.i0.k();
        if (dimension >= 0.0f) {
            aVarK.e = new h0(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarK.f = new h0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarK.g = new h0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarK.h = new h0(dimension4);
        }
        this.i0 = aVarK.a();
        ColorStateList colorStateListA = jk6.a(context2, gpaVarE, 7);
        if (colorStateListA != null) {
            int defaultColor = colorStateListA.getDefaultColor();
            this.I0 = defaultColor;
            this.r0 = defaultColor;
            if (colorStateListA.isStateful()) {
                this.J0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.K0 = colorStateListA.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.L0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.K0 = this.I0;
                ColorStateList colorStateListB = vz1.b(context2, com.hwpo_training_app.R.color.mtrl_filled_background_color);
                this.J0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.L0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.r0 = 0;
            this.I0 = 0;
            this.J0 = 0;
            this.K0 = 0;
            this.L0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListA2 = gpaVarE.a(1);
            this.D0 = colorStateListA2;
            this.C0 = colorStateListA2;
        }
        ColorStateList colorStateListA3 = jk6.a(context2, gpaVarE, 14);
        this.G0 = typedArray.getColor(14, 0);
        this.E0 = context2.getColor(com.hwpo_training_app.R.color.mtrl_textinput_default_box_stroke_color);
        this.M0 = context2.getColor(com.hwpo_training_app.R.color.mtrl_textinput_disabled_color);
        this.F0 = context2.getColor(com.hwpo_training_app.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListA3 != null) {
            setBoxStrokeColorStateList(colorStateListA3);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(jk6.a(context2, gpaVarE, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.U = gpaVarE.a(24);
        this.V = gpaVarE.a(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i3 = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.K = typedArray.getResourceId(22, 0);
        this.J = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.J);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.K);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(gpaVarE.a(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(gpaVarE.a(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(gpaVarE.a(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(gpaVarE.a(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(gpaVarE.a(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(gpaVarE.a(59));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, gpaVarE);
        this.v = aVar;
        boolean z4 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        gpaVarE.f();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(jz9Var);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.x;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.c0;
        }
        int iA = g53.a(com.hwpo_training_app.R.attr.colorControlHighlight, this.x);
        int i2 = this.l0;
        int[][] iArr = W0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            kk6 kk6Var = this.c0;
            int i3 = this.r0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{g53.d(iA, 0.1f, i3), i3}), kk6Var, kk6Var);
        }
        Context context = getContext();
        kk6 kk6Var2 = this.c0;
        TypedValue typedValueD = bj6.d(context, "TextInputLayout", com.hwpo_training_app.R.attr.colorSurface);
        int i4 = typedValueD.resourceId;
        int color = i4 != 0 ? context.getColor(i4) : typedValueD.data;
        kk6 kk6Var3 = new kk6(kk6Var2.g());
        int iD = g53.d(iA, 0.1f, color);
        kk6Var3.p(new ColorStateList(iArr, new int[]{iD, 0}));
        kk6Var3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iD, color});
        kk6 kk6Var4 = new kk6(kk6Var2.g());
        kk6Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kk6Var3, kk6Var4), kk6Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.e0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.e0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.e0.addState(new int[0], h(false));
        }
        return this.e0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.d0 == null) {
            this.d0 = h(true);
        }
        return this.d0;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.x != null) {
            z90.a("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.x = editText;
        int i2 = this.z;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.B);
        }
        int i3 = this.A;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.C);
        }
        this.f0 = false;
        k();
        setTextInputAccessibilityDelegate(new e(this));
        Typeface typeface = this.x.getTypeface();
        yg1 yg1Var = this.P0;
        yg1Var.n(typeface);
        float textSize = this.x.getTextSize();
        if (yg1Var.h != textSize) {
            yg1Var.h = textSize;
            yg1Var.j(false);
        }
        float letterSpacing = this.x.getLetterSpacing();
        if (yg1Var.X != letterSpacing) {
            yg1Var.X = letterSpacing;
            yg1Var.j(false);
        }
        int gravity = this.x.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (yg1Var.g != i4) {
            yg1Var.g = i4;
            yg1Var.j(false);
        }
        if (yg1Var.f != gravity) {
            yg1Var.f = gravity;
            yg1Var.j(false);
        }
        this.N0 = editText.getMinimumHeight();
        this.x.addTextChangedListener(new a(editText));
        if (this.C0 == null) {
            this.C0 = this.x.getHintTextColors();
        }
        if (this.W) {
            if (TextUtils.isEmpty(this.a0)) {
                CharSequence hint = this.x.getHint();
                this.y = hint;
                setHint(hint);
                this.x.setHint((CharSequence) null);
            }
            this.b0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.I != null) {
            p(this.x.getText());
        }
        t();
        this.D.b();
        this.u.bringToFront();
        com.google.android.material.textfield.a aVar = this.v;
        aVar.bringToFront();
        Iterator<g> it = this.y0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.a0)) {
            return;
        }
        this.a0 = charSequence;
        yg1 yg1Var = this.P0;
        if (charSequence == null || !TextUtils.equals(yg1Var.B, charSequence)) {
            yg1Var.B = charSequence;
            yg1Var.C = null;
            yg1Var.j(false);
        }
        if (this.O0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.M == z) {
            return;
        }
        m00 m00Var = this.N;
        if (!z) {
            if (m00Var != null) {
                m00Var.setVisibility(8);
            }
            this.N = null;
        } else if (m00Var != null) {
            this.t.addView(m00Var);
            this.N.setVisibility(0);
        }
        this.M = z;
    }

    public final void a() {
        if (this.x == null || this.l0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.x;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.P0.f() + this.w), this.x.getPaddingEnd(), getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.x;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_filled_edittext_font_2_0_padding_top), this.x.getPaddingEnd(), getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (jk6.e(getContext())) {
            EditText editText3 = this.x;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_filled_edittext_font_1_3_padding_top), this.x.getPaddingEnd(), getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.t;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f2) {
        yg1 yg1Var = this.P0;
        if (yg1Var.b == f2) {
            return;
        }
        if (this.S0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.S0 = valueAnimator;
            valueAnimator.setInterpolator(az6.d(getContext(), com.hwpo_training_app.R.attr.motionEasingEmphasizedInterpolator, aw.b));
            this.S0.setDuration(az6.c(getContext(), com.hwpo_training_app.R.attr.motionDurationMedium4, 167));
            this.S0.addUpdateListener(new d());
        }
        this.S0.setFloatValues(yg1Var.b, f2);
        this.S0.start();
    }

    public final void c() {
        int i2;
        int i3;
        kk6 kk6Var = this.c0;
        if (kk6Var == null) {
            return;
        }
        ll9 ll9VarG = kk6Var.g();
        ll9 ll9Var = this.i0;
        if (ll9VarG != ll9Var) {
            this.c0.setShapeAppearanceModel(ll9Var);
        }
        if (this.l0 == 2 && (i2 = this.n0) > -1 && (i3 = this.q0) != 0) {
            kk6 kk6Var2 = this.c0;
            kk6Var2.u.j = i2;
            kk6Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            kk6.c cVar = kk6Var2.u;
            if (cVar.d != colorStateListValueOf) {
                cVar.d = colorStateListValueOf;
                kk6Var2.onStateChange(kk6Var2.getState());
            }
        }
        int iE = this.r0;
        if (this.l0 == 1) {
            Integer numB = g53.b(getContext(), com.hwpo_training_app.R.attr.colorSurface);
            iE = vi1.e(this.r0, numB != null ? numB.intValue() : 0);
        }
        this.r0 = iE;
        this.c0.p(ColorStateList.valueOf(iE));
        kk6 kk6Var3 = this.g0;
        if (kk6Var3 != null && this.h0 != null) {
            if (this.n0 > -1 && this.q0 != 0) {
                kk6Var3.p(this.x.isFocused() ? ColorStateList.valueOf(this.E0) : ColorStateList.valueOf(this.q0));
                this.h0.p(ColorStateList.valueOf(this.q0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.x == null) {
            d43.c();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i2 = rect.bottom;
        Rect rect2 = this.t0;
        rect2.bottom = i2;
        int i3 = this.l0;
        if (i3 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.m0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i4 = rect.left;
        if (i3 != 2) {
            rect2.left = i(i4, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.x.getPaddingLeft() + i4;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.x.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.x;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.y != null) {
            boolean z = this.b0;
            this.b0 = false;
            CharSequence hint = editText.getHint();
            this.x.setHint(this.y);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.x.setHint(hint);
                this.b0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.t;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.x) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.U0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.U0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        kk6 kk6Var;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.W;
        yg1 yg1Var = this.P0;
        if (z) {
            TextPaint textPaint = yg1Var.O;
            RectF rectF = yg1Var.e;
            int iSave = canvas2.save();
            if (yg1Var.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(yg1Var.G);
                float f2 = yg1Var.q;
                float f3 = yg1Var.r;
                float f4 = yg1Var.F;
                if (f4 != 1.0f) {
                    canvas2.scale(f4, f4, f2, f3);
                }
                if ((yg1Var.e0 > 1 || yg1Var.f0 > 1) && !yg1Var.D && yg1Var.o()) {
                    float lineStart = yg1Var.q - yg1Var.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f3);
                    float f5 = alpha;
                    textPaint.setAlpha((int) (yg1Var.c0 * f5));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        float f6 = yg1Var.H;
                        float f7 = yg1Var.I;
                        float f8 = yg1Var.J;
                        int i3 = yg1Var.K;
                        textPaint.setShadowLayer(f6, f7, f8, vi1.h(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                    }
                    yg1Var.Z.draw(canvas2);
                    textPaint.setAlpha((int) (yg1Var.b0 * f5));
                    if (i2 >= 31) {
                        float f9 = yg1Var.H;
                        float f10 = yg1Var.I;
                        float f11 = yg1Var.J;
                        int i4 = yg1Var.K;
                        textPaint.setShadowLayer(f9, f10, f11, vi1.h(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = yg1Var.Z.getLineBaseline(0);
                    CharSequence charSequence = yg1Var.d0;
                    float f12 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i2 >= 31) {
                        textPaint.setShadowLayer(yg1Var.H, yg1Var.I, yg1Var.J, yg1Var.K);
                    }
                    String strTrim = yg1Var.d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(yg1Var.Z.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                } else {
                    canvas2.translate(f2, f3);
                    yg1Var.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.h0 == null || (kk6Var = this.g0) == null) {
            return;
        }
        kk6Var.draw(canvas2);
        if (this.x.isFocused()) {
            Rect bounds = this.h0.getBounds();
            Rect bounds2 = this.g0.getBounds();
            float f13 = yg1Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = aw.c(iCenterX, f13, bounds2.left);
            bounds.right = aw.c(iCenterX, f13, bounds2.right);
            this.h0.draw(canvas2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.T0) {
            return;
        }
        this.T0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        yg1 yg1Var = this.P0;
        if (yg1Var != null) {
            yg1Var.M = drawableState;
            ColorStateList colorStateList2 = yg1Var.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = yg1Var.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                yg1Var.j(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.x != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z) {
            invalidate();
        }
        this.T0 = false;
    }

    public final int e() {
        if (this.W) {
            int i2 = this.l0;
            yg1 yg1Var = this.P0;
            if (i2 == 0) {
                return (int) yg1Var.f();
            }
            if (i2 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (yg1Var.f() / 2.0f);
                }
                float f2 = yg1Var.f();
                TextPaint textPaint = yg1Var.P;
                textPaint.setTextSize(yg1Var.i);
                textPaint.setTypeface(yg1Var.s);
                textPaint.setLetterSpacing(yg1Var.W);
                return Math.max(0, (int) (f2 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final dt3 f() {
        dt3 dt3Var = new dt3();
        dt3Var.v = az6.c(getContext(), com.hwpo_training_app.R.attr.motionDurationShort2, 87);
        dt3Var.w = az6.d(getContext(), com.hwpo_training_app.R.attr.motionEasingLinearInterpolator, aw.a);
        return dt3Var;
    }

    public final boolean g() {
        return this.W && !TextUtils.isEmpty(this.a0) && (this.c0 instanceof ud2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.x;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public kk6 getBoxBackground() {
        int i2 = this.l0;
        if (i2 == 1 || i2 == 2) {
            return this.c0;
        }
        d43.c();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.r0;
    }

    public int getBoxBackgroundMode() {
        return this.l0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.m0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        ll9 ll9Var = this.i0;
        RectF rectF = this.u0;
        return layoutDirection == 1 ? ll9Var.h.a(rectF) : ll9Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        ll9 ll9Var = this.i0;
        RectF rectF = this.u0;
        return layoutDirection == 1 ? ll9Var.g.a(rectF) : ll9Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        ll9 ll9Var = this.i0;
        RectF rectF = this.u0;
        return layoutDirection == 1 ? ll9Var.e.a(rectF) : ll9Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        ll9 ll9Var = this.i0;
        RectF rectF = this.u0;
        return layoutDirection == 1 ? ll9Var.f.a(rectF) : ll9Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.o0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.p0;
    }

    public int getCounterMaxLength() {
        return this.F;
    }

    public CharSequence getCounterOverflowDescription() {
        m00 m00Var;
        if (this.E && this.G && (m00Var = this.I) != null) {
            return m00Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.T;
    }

    public ColorStateList getCounterTextColor() {
        return this.S;
    }

    public ColorStateList getCursorColor() {
        return this.U;
    }

    public ColorStateList getCursorErrorColor() {
        return this.V;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.x;
    }

    public CharSequence getEndIconContentDescription() {
        return this.v.z.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.v.z.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.v.F;
    }

    public int getEndIconMode() {
        return this.v.B;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.v.G;
    }

    public CheckableImageButton getEndIconView() {
        return this.v.z;
    }

    public CharSequence getError() {
        hb5 hb5Var = this.D;
        if (hb5Var.q) {
            return hb5Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.D.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.D.s;
    }

    public int getErrorCurrentTextColors() {
        m00 m00Var = this.D.r;
        if (m00Var != null) {
            return m00Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.v.v.getDrawable();
    }

    public CharSequence getHelperText() {
        hb5 hb5Var = this.D;
        if (hb5Var.x) {
            return hb5Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        m00 m00Var = this.D.y;
        if (m00Var != null) {
            return m00Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.W) {
            return this.a0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.P0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        yg1 yg1Var = this.P0;
        return yg1Var.g(yg1Var.k);
    }

    public int getHintMaxLines() {
        return this.P0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public f getLengthCounter() {
        return this.H;
    }

    public int getMaxEms() {
        return this.A;
    }

    public int getMaxWidth() {
        return this.C;
    }

    public int getMinEms() {
        return this.z;
    }

    public int getMinWidth() {
        return this.B;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.v.z.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.v.z.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.M) {
            return this.L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.P;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.O;
    }

    public CharSequence getPrefixText() {
        return this.u.v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.u.u.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.u.u;
    }

    public ll9 getShapeAppearanceModel() {
        return this.i0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.u.w.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.u.w.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.u.z;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.u.A;
    }

    public CharSequence getSuffixText() {
        return this.v.I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.v.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.v.J;
    }

    public Typeface getTypeface() {
        return this.v0;
    }

    public final kk6 h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.hwpo_training_app.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.x;
        float popupElevation = editText instanceof dj6 ? ((dj6) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.hwpo_training_app.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.hwpo_training_app.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        by8 by8Var = new by8();
        by8 by8Var2 = new by8();
        by8 by8Var3 = new by8();
        by8 by8Var4 = new by8();
        qa3 qa3Var = new qa3();
        qa3 qa3Var2 = new qa3();
        qa3 qa3Var3 = new qa3();
        qa3 qa3Var4 = new qa3();
        h0 h0Var = new h0(f2);
        h0 h0Var2 = new h0(f2);
        h0 h0Var3 = new h0(dimensionPixelOffset);
        h0 h0Var4 = new h0(dimensionPixelOffset);
        ll9 ll9Var = new ll9();
        ll9Var.a = by8Var;
        ll9Var.b = by8Var2;
        ll9Var.c = by8Var3;
        ll9Var.d = by8Var4;
        ll9Var.e = h0Var;
        ll9Var.f = h0Var2;
        ll9Var.g = h0Var4;
        ll9Var.h = h0Var3;
        ll9Var.i = qa3Var;
        ll9Var.j = qa3Var2;
        ll9Var.k = qa3Var3;
        ll9Var.l = qa3Var4;
        EditText editText2 = this.x;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof dj6 ? ((dj6) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = kk6.Y;
            TypedValue typedValueD = bj6.d(context, kk6.class.getSimpleName(), com.hwpo_training_app.R.attr.colorSurface);
            int i2 = typedValueD.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueD.data);
        }
        kk6 kk6Var = new kk6();
        kk6Var.l(context);
        kk6Var.p(dropDownBackgroundTintList);
        kk6Var.o(popupElevation);
        kk6Var.setShapeAppearanceModel(ll9Var);
        kk6.c cVar = kk6Var.u;
        if (cVar.g == null) {
            cVar.g = new Rect();
        }
        kk6Var.u.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        kk6Var.invalidateSelf();
        return kk6Var;
    }

    public final int i(int i2, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.x.getCompoundPaddingLeft() : this.v.b();
        } else {
            compoundPaddingLeft = this.u.a();
        }
        return compoundPaddingLeft + i2;
    }

    public final int j(int i2, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.x.getCompoundPaddingRight() : this.u.a();
        } else {
            compoundPaddingRight = this.v.b();
        }
        return i2 - compoundPaddingRight;
    }

    public final void k() {
        int i2 = this.l0;
        if (i2 == 0) {
            this.c0 = null;
            this.g0 = null;
            this.h0 = null;
        } else if (i2 == 1) {
            this.c0 = new kk6(this.i0);
            this.g0 = new kk6();
            this.h0 = new kk6();
        } else {
            if (i2 != 2) {
                z90.a(i34.b(this.l0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.W || (this.c0 instanceof ud2)) {
                this.c0 = new kk6(this.i0);
            } else {
                ll9 ll9Var = this.i0;
                int i3 = ud2.b0;
                if (ll9Var == null) {
                    ll9Var = new ll9();
                }
                ud2.a aVar = new ud2.a(ll9Var, new RectF());
                ud2.b bVar = new ud2.b(aVar);
                bVar.a0 = aVar;
                this.c0 = bVar;
            }
            this.g0 = null;
            this.h0 = null;
        }
        u();
        z();
        if (this.l0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.m0 = getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (jk6.e(getContext())) {
                this.m0 = getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.l0 != 0) {
            v();
        }
        EditText editText = this.x;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.l0;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        float lineWidth;
        int i2;
        float f6;
        int i3;
        if (g()) {
            int width = this.x.getWidth();
            int gravity = this.x.getGravity();
            yg1 yg1Var = this.P0;
            boolean zC = yg1Var.c(yg1Var.B);
            yg1Var.D = zC;
            Rect rect = yg1Var.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i3 = rect.left;
                        f4 = i3;
                    } else {
                        f2 = rect.right;
                        f3 = yg1Var.a0;
                    }
                } else if (zC) {
                    f2 = rect.right;
                    f3 = yg1Var.a0;
                } else {
                    i3 = rect.left;
                    f4 = i3;
                }
                float fMax = Math.max(f4, rect.left);
                rectF = this.u0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (yg1Var.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (yg1Var.D) {
                        f6 = yg1Var.a0;
                        f5 = f6 + fMax;
                    } else {
                        i2 = rect.right;
                        f5 = i2;
                    }
                } else if (yg1Var.D) {
                    i2 = rect.right;
                    f5 = i2;
                } else {
                    f6 = yg1Var.a0;
                    f5 = f6 + fMax;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = yg1Var.f() + rect.top;
                if (yg1Var.Z != null && !yg1Var.o()) {
                    StaticLayout staticLayout = yg1Var.Z;
                    lineWidth = (yg1Var.i / yg1Var.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (yg1Var.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.k0;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.n0);
                rectF.top = 0.0f;
                ud2 ud2Var = (ud2) this.c0;
                ud2Var.getClass();
                ud2Var.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = yg1Var.a0 / 2.0f;
            f4 = f2 - f3;
            float fMax2 = Math.max(f4, rect.left);
            rectF = this.u0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f5 = (width / 2.0f) + (yg1Var.a0 / 2.0f);
            } else {
                f5 = (width / 2.0f) + (yg1Var.a0 / 2.0f);
            }
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = yg1Var.f() + rect.top;
            if (yg1Var.Z != null) {
                StaticLayout staticLayout2 = yg1Var.Z;
                lineWidth = (yg1Var.i / yg1Var.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (yg1Var.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(m00 m00Var, int i2) {
        try {
            m00Var.setTextAppearance(i2);
            if (m00Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        m00Var.setTextAppearance(com.hwpo_training_app.R.style.TextAppearance_AppCompat_Caption);
        m00Var.setTextColor(getContext().getColor(com.hwpo_training_app.R.color.design_error));
    }

    public final boolean o() {
        hb5 hb5Var = this.D;
        return (hb5Var.o != 1 || hb5Var.r == null || TextUtils.isEmpty(hb5Var.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.P0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        com.google.android.material.textfield.a aVar = this.v;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.V0 = false;
        int i2 = 1;
        if (this.x != null && this.x.getMeasuredHeight() < (iMax = Math.max(aVar.getMeasuredHeight(), this.u.getMeasuredHeight()))) {
            this.x.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.x.post(new e36(i2, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float fDescent;
        int i6;
        int compoundPaddingTop;
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.x;
        if (editText != null) {
            Rect rect = this.s0;
            py2.a(this, editText, rect);
            kk6 kk6Var = this.g0;
            if (kk6Var != null) {
                int i7 = rect.bottom;
                kk6Var.setBounds(rect.left, i7 - this.o0, rect.right, i7);
            }
            kk6 kk6Var2 = this.h0;
            if (kk6Var2 != null) {
                int i8 = rect.bottom;
                kk6Var2.setBounds(rect.left, i8 - this.p0, rect.right, i8);
            }
            if (this.W) {
                float textSize = this.x.getTextSize();
                yg1 yg1Var = this.P0;
                float f2 = yg1Var.h;
                TextPaint textPaint = yg1Var.P;
                if (f2 != textSize) {
                    yg1Var.h = textSize;
                    yg1Var.j(false);
                }
                int gravity = this.x.getGravity();
                int i9 = (gravity & (-113)) | 48;
                if (yg1Var.g != i9) {
                    yg1Var.g = i9;
                    yg1Var.j(false);
                }
                if (yg1Var.f != gravity) {
                    yg1Var.f = gravity;
                    yg1Var.j(false);
                }
                Rect rectD = d(rect);
                int i10 = rectD.left;
                int i11 = rectD.top;
                int i12 = rectD.right;
                int i13 = rectD.bottom;
                Rect rect2 = yg1Var.d;
                if (rect2.left != i10 || rect2.top != i11 || rect2.right != i12 || rect2.bottom != i13) {
                    rect2.set(i10, i11, i12, i13);
                    yg1Var.N = true;
                }
                if (this.x == null) {
                    d43.c();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(yg1Var.h);
                    textPaint.setTypeface(yg1Var.v);
                    textPaint.setLetterSpacing(yg1Var.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(yg1Var.h);
                    textPaint.setTypeface(yg1Var.v);
                    textPaint.setLetterSpacing(yg1Var.X);
                    fDescent = yg1Var.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.x.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.t0;
                rect3.left = compoundPaddingLeft;
                if (this.l0 != 1 || this.x.getMinLines() > 1) {
                    if (this.l0 != 0 || getHintMaxLines() == 1) {
                        i6 = 0;
                    } else {
                        textPaint.setTextSize(yg1Var.h);
                        textPaint.setTypeface(yg1Var.v);
                        textPaint.setLetterSpacing(yg1Var.X);
                        i6 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.x.getCompoundPaddingTop() + rect.top) - i6;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.x.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.l0 != 1 || this.x.getMinLines() > 1) ? rect.bottom - this.x.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i14 = rect3.left;
                int i15 = rect3.top;
                int i16 = rect3.right;
                Rect rect4 = yg1Var.c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom || true != yg1Var.k0) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    yg1Var.N = true;
                    yg1Var.k0 = true;
                }
                yg1Var.j(false);
                if (!g() || this.O0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        float f2;
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z = this.V0;
        com.google.android.material.textfield.a aVar = this.v;
        if (!z) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.V0 = true;
        }
        if (this.N != null && (editText = this.x) != null) {
            this.N.setGravity(editText.getGravity());
            this.N.setPadding(this.x.getCompoundPaddingLeft(), this.x.getCompoundPaddingTop(), this.x.getCompoundPaddingRight(), this.x.getCompoundPaddingBottom());
        }
        aVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.x.getMeasuredWidth() - this.x.getCompoundPaddingLeft()) - this.x.getCompoundPaddingRight();
        yg1 yg1Var = this.P0;
        TextPaint textPaint = yg1Var.P;
        textPaint.setTextSize(yg1Var.i);
        textPaint.setTypeface(yg1Var.s);
        textPaint.setLetterSpacing(yg1Var.W);
        float f3 = measuredWidth;
        yg1Var.i0 = yg1Var.e(yg1Var.f0, textPaint, yg1Var.B, (yg1Var.i / yg1Var.h) * f3, yg1Var.D).getHeight();
        textPaint.setTextSize(yg1Var.h);
        textPaint.setTypeface(yg1Var.v);
        textPaint.setLetterSpacing(yg1Var.X);
        yg1Var.j0 = yg1Var.e(yg1Var.e0, textPaint, yg1Var.B, f3, yg1Var.D).getHeight();
        EditText editText2 = this.x;
        Rect rect = this.s0;
        py2.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i4 = rectD.left;
        int i5 = rectD.top;
        int i6 = rectD.right;
        int i7 = rectD.bottom;
        Rect rect2 = yg1Var.d;
        if (rect2.left != i4 || rect2.top != i5 || rect2.right != i6 || rect2.bottom != i7) {
            rect2.set(i4, i5, i6, i7);
            yg1Var.N = true;
        }
        v();
        a();
        if (this.x == null) {
            return;
        }
        int i8 = yg1Var.j0;
        if (i8 != -1) {
            f2 = i8;
        } else {
            TextPaint textPaint2 = yg1Var.P;
            textPaint2.setTextSize(yg1Var.h);
            textPaint2.setTypeface(yg1Var.v);
            textPaint2.setLetterSpacing(yg1Var.X);
            f2 = -textPaint2.ascent();
        }
        float f4 = 0.0f;
        if (this.L != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.N.getPaint());
            textPaint3.setTextSize(this.N.getTextSize());
            textPaint3.setTypeface(this.N.getTypeface());
            textPaint3.setLetterSpacing(this.N.getLetterSpacing());
            r0a r0aVar = new r0a(this.L, textPaint3, measuredWidth);
            r0aVar.k = getLayoutDirection() == 1;
            r0aVar.j = true;
            float lineSpacingExtra = this.N.getLineSpacingExtra();
            float lineSpacingMultiplier = this.N.getLineSpacingMultiplier();
            r0aVar.g = lineSpacingExtra;
            r0aVar.h = lineSpacingMultiplier;
            r0aVar.m = new sha(this);
            f4 = (this.l0 == 1 ? yg1Var.f() + this.m0 + this.w : 0.0f) + r0aVar.a().getHeight();
        }
        float fMax = Math.max(f2, f4);
        if (this.x.getMeasuredHeight() < fMax) {
            this.x.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.t);
        setError(iVar.v);
        if (iVar.w) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 1;
        if (z != this.j0) {
            d72 d72Var = this.i0.e;
            RectF rectF = this.u0;
            float fA = d72Var.a(rectF);
            float fA2 = this.i0.f.a(rectF);
            float fA3 = this.i0.h.a(rectF);
            float fA4 = this.i0.g.a(rectF);
            ll9 ll9Var = this.i0;
            f41 f41Var = ll9Var.a;
            f41 f41Var2 = ll9Var.b;
            f41 f41Var3 = ll9Var.d;
            f41 f41Var4 = ll9Var.c;
            new by8();
            new by8();
            new by8();
            new by8();
            qa3 qa3Var = new qa3();
            qa3 qa3Var2 = new qa3();
            qa3 qa3Var3 = new qa3();
            qa3 qa3Var4 = new qa3();
            h0 h0Var = new h0(fA2);
            h0 h0Var2 = new h0(fA);
            h0 h0Var3 = new h0(fA4);
            h0 h0Var4 = new h0(fA3);
            ll9 ll9Var2 = new ll9();
            ll9Var2.a = f41Var2;
            ll9Var2.b = f41Var;
            ll9Var2.c = f41Var3;
            ll9Var2.d = f41Var4;
            ll9Var2.e = h0Var;
            ll9Var2.f = h0Var2;
            ll9Var2.g = h0Var4;
            ll9Var2.h = h0Var3;
            ll9Var2.i = qa3Var;
            ll9Var2.j = qa3Var2;
            ll9Var2.k = qa3Var3;
            ll9Var2.l = qa3Var4;
            this.j0 = z;
            setShapeAppearanceModel(ll9Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        if (o()) {
            iVar.v = getError();
        }
        com.google.android.material.textfield.a aVar = this.v;
        iVar.w = aVar.B != 0 && aVar.z.w;
        return iVar;
    }

    public final void p(Editable editable) {
        String str;
        ((xa8) this.H).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.G;
        int i2 = this.F;
        String string = null;
        if (i2 == -1) {
            this.I.setText(String.valueOf(length));
            this.I.setContentDescription(null);
            this.G = false;
        } else {
            this.G = length > i2;
            Context context = getContext();
            this.I.setContentDescription(context.getString(this.G ? com.hwpo_training_app.R.string.character_counter_overflowed_content_description : com.hwpo_training_app.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.F)));
            if (z != this.G) {
                q();
            }
            String str2 = tp0.b;
            tp0 tp0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? tp0.e : tp0.d;
            m00 m00Var = this.I;
            String string2 = getContext().getString(com.hwpo_training_app.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.F));
            tp0Var.getClass();
            kda.d dVar = kda.c;
            if (string2 != null) {
                String str3 = tp0.c;
                String str4 = tp0.b;
                boolean z2 = tp0Var.a;
                boolean zB = dVar.b(string2, string2.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean zB2 = (zB ? kda.b : kda.a).b(string2, string2.length());
                if (z2 || !(zB2 || tp0.a(string2) == 1)) {
                    str = (!z2 || (zB2 && tp0.a(string2) != -1)) ? BuildConfig.FLAVOR : str3;
                } else {
                    str = str4;
                }
                spannableStringBuilder.append((CharSequence) str);
                if (zB != z2) {
                    spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
                    spannableStringBuilder.append((CharSequence) string2);
                    spannableStringBuilder.append((char) 8236);
                } else {
                    spannableStringBuilder.append((CharSequence) string2);
                }
                boolean zB3 = (zB ? kda.b : kda.a).b(string2, string2.length());
                if (!z2 && (zB3 || tp0.b(string2) == 1)) {
                    str3 = str4;
                } else if (!z2 || (zB3 && tp0.b(string2) != -1)) {
                    str3 = BuildConfig.FLAVOR;
                }
                spannableStringBuilder.append((CharSequence) str3);
                string = spannableStringBuilder.toString();
            }
            m00Var.setText(string);
        }
        if (this.x == null || z == this.G) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m00 m00Var = this.I;
        if (m00Var != null) {
            n(m00Var, this.G ? this.J : this.K);
            if (!this.G && (colorStateList2 = this.S) != null) {
                this.I.setTextColor(colorStateList2);
            }
            if (!this.G || (colorStateList = this.T) == null) {
                return;
            }
            this.I.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.U;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueA = bj6.a(context.getTheme(), com.hwpo_training_app.R.attr.colorControlActivated);
            if (typedValueA != null) {
                int i2 = typedValueA.resourceId;
                if (i2 != 0) {
                    colorStateListValueOf = vz1.b(context, i2);
                } else {
                    int i3 = typedValueA.data;
                    if (i3 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i3);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.x;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.x.getTextCursorDrawable().mutate();
        if ((o() || (this.I != null && this.G)) && (colorStateList = this.V) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public final boolean s() {
        boolean z;
        if (this.x == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            jz9 jz9Var = this.u;
            if (jz9Var.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, jz9Var.getMeasuredWidth() - this.x.getPaddingLeft());
                if (this.w0 == null || this.x0 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.w0 = colorDrawable;
                    this.x0 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.x.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.w0;
                if (drawable != colorDrawable2) {
                    this.x.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.w0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.x.getCompoundDrawablesRelative();
                this.x.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.w0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.w0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.x.getCompoundDrawablesRelative();
            this.x.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.w0 = null;
            z = true;
        } else {
            z = false;
        }
        com.google.android.material.textfield.a aVar = this.v;
        if ((aVar.d() || ((aVar.B != 0 && aVar.c()) || aVar.I != null)) && aVar.getMeasuredWidth() > 0) {
            int measuredWidth = aVar.J.getMeasuredWidth() - this.x.getPaddingRight();
            if (aVar.d()) {
                checkableImageButton = aVar.v;
            } else if (aVar.B != 0 && aVar.c()) {
                checkableImageButton = aVar.z;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative4 = this.x.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.z0;
            if (colorDrawable3 != null && this.A0 != iMax2) {
                this.A0 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.x.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.z0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.z0 = colorDrawable4;
                this.A0 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.z0;
            if (drawable2 != colorDrawable5) {
                this.B0 = drawable2;
                this.x.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.z0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.x.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.z0) {
                this.x.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.B0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.z0 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.r0 != i2) {
            this.r0 = i2;
            this.I0 = i2;
            this.K0 = i2;
            this.L0 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(getContext().getColor(i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.r0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.l0) {
            return;
        }
        this.l0 = i2;
        if (this.x != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.m0 = i2;
    }

    public void setBoxCornerFamily(int i2) {
        ll9.a aVarK = this.i0.k();
        d72 d72Var = this.i0.e;
        aVarK.a = lk6.b(i2);
        aVarK.e = d72Var;
        d72 d72Var2 = this.i0.f;
        aVarK.b = lk6.b(i2);
        aVarK.f = d72Var2;
        d72 d72Var3 = this.i0.h;
        aVarK.d = lk6.b(i2);
        aVarK.h = d72Var3;
        d72 d72Var4 = this.i0.g;
        aVarK.c = lk6.b(i2);
        aVarK.g = d72Var4;
        this.i0 = aVarK.a();
        c();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.G0 != i2) {
            this.G0 = i2;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.E0 = colorStateList.getDefaultColor();
            this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.G0 != colorStateList.getDefaultColor()) {
            this.G0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.o0 = i2;
        z();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.p0 = i2;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.E != z) {
            hb5 hb5Var = this.D;
            if (z) {
                m00 m00Var = new m00(getContext());
                this.I = m00Var;
                m00Var.setId(com.hwpo_training_app.R.id.textinput_counter);
                Typeface typeface = this.v0;
                if (typeface != null) {
                    this.I.setTypeface(typeface);
                }
                this.I.setMaxLines(1);
                hb5Var.a(this.I, 2);
                ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.hwpo_training_app.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.I != null) {
                    EditText editText = this.x;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                hb5Var.g(this.I, 2);
                this.I = null;
            }
            this.E = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.F != i2) {
            if (i2 > 0) {
                this.F = i2;
            } else {
                this.F = -1;
            }
            if (!this.E || this.I == null) {
                return;
            }
            EditText editText = this.x;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.J != i2) {
            this.J = i2;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.K != i2) {
            this.K = i2;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (o() || (this.I != null && this.G)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.x != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.v.z.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.v.z.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.f(i2 != 0 ? aVar.getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        com.google.android.material.textfield.a aVar = this.v;
        Drawable drawableB = i2 != 0 ? e00.b(aVar.getContext(), i2) : null;
        TextInputLayout textInputLayout = aVar.t;
        CheckableImageButton checkableImageButton = aVar.z;
        checkableImageButton.setImageDrawable(drawableB);
        if (drawableB != null) {
            i65.a(textInputLayout, checkableImageButton, aVar.D, aVar.E);
            i65.c(textInputLayout, checkableImageButton, aVar.D);
        }
    }

    public void setEndIconMinSize(int i2) {
        com.google.android.material.textfield.a aVar = this.v;
        if (i2 < 0) {
            aVar.getClass();
            z90.a("endIconSize cannot be less than 0");
        } else if (i2 != aVar.F) {
            aVar.F = i2;
            CheckableImageButton checkableImageButton = aVar.z;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = aVar.v;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.v.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.v;
        CheckableImageButton checkableImageButton = aVar.z;
        View.OnLongClickListener onLongClickListener = aVar.H;
        checkableImageButton.setOnClickListener(onClickListener);
        i65.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.H = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        i65.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.G = scaleType;
        aVar.z.setScaleType(scaleType);
        aVar.v.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.v;
        if (aVar.D != colorStateList) {
            aVar.D = colorStateList;
            i65.a(aVar.t, aVar.z, colorStateList, aVar.E);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.v;
        if (aVar.E != mode) {
            aVar.E = mode;
            i65.a(aVar.t, aVar.z, aVar.D, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.v.h(z);
    }

    public void setError(CharSequence charSequence) {
        hb5 hb5Var = this.D;
        if (!hb5Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            hb5Var.f();
            return;
        }
        hb5Var.c();
        hb5Var.p = charSequence;
        hb5Var.r.setText(charSequence);
        int i2 = hb5Var.n;
        if (i2 != 1) {
            hb5Var.o = 1;
        }
        hb5Var.i(i2, hb5Var.h(hb5Var.r, charSequence), hb5Var.o);
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        hb5 hb5Var = this.D;
        hb5Var.t = i2;
        m00 m00Var = hb5Var.r;
        if (m00Var != null) {
            m00Var.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        hb5 hb5Var = this.D;
        hb5Var.s = charSequence;
        m00 m00Var = hb5Var.r;
        if (m00Var != null) {
            m00Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        hb5 hb5Var = this.D;
        TextInputLayout textInputLayout = hb5Var.h;
        if (hb5Var.q == z) {
            return;
        }
        hb5Var.c();
        if (z) {
            m00 m00Var = new m00(hb5Var.g);
            hb5Var.r = m00Var;
            m00Var.setId(com.hwpo_training_app.R.id.textinput_error);
            hb5Var.r.setTextAlignment(5);
            Typeface typeface = hb5Var.B;
            if (typeface != null) {
                hb5Var.r.setTypeface(typeface);
            }
            int i2 = hb5Var.u;
            hb5Var.u = i2;
            m00 m00Var2 = hb5Var.r;
            if (m00Var2 != null) {
                hb5Var.h.n(m00Var2, i2);
            }
            ColorStateList colorStateList = hb5Var.v;
            hb5Var.v = colorStateList;
            m00 m00Var3 = hb5Var.r;
            if (m00Var3 != null && colorStateList != null) {
                m00Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = hb5Var.s;
            hb5Var.s = charSequence;
            m00 m00Var4 = hb5Var.r;
            if (m00Var4 != null) {
                m00Var4.setContentDescription(charSequence);
            }
            int i3 = hb5Var.t;
            hb5Var.t = i3;
            m00 m00Var5 = hb5Var.r;
            if (m00Var5 != null) {
                m00Var5.setAccessibilityLiveRegion(i3);
            }
            hb5Var.r.setVisibility(4);
            hb5Var.a(hb5Var.r, 0);
        } else {
            hb5Var.f();
            hb5Var.g(hb5Var.r, 0);
            hb5Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        hb5Var.q = z;
    }

    public void setErrorIconDrawable(int i2) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.i(i2 != 0 ? e00.b(aVar.getContext(), i2) : null);
        i65.c(aVar.t, aVar.v, aVar.w);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.v;
        CheckableImageButton checkableImageButton = aVar.v;
        View.OnLongClickListener onLongClickListener = aVar.y;
        checkableImageButton.setOnClickListener(onClickListener);
        i65.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.y = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        i65.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.v;
        if (aVar.w != colorStateList) {
            aVar.w = colorStateList;
            i65.a(aVar.t, aVar.v, colorStateList, aVar.x);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.v;
        if (aVar.x != mode) {
            aVar.x = mode;
            i65.a(aVar.t, aVar.v, aVar.w, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        hb5 hb5Var = this.D;
        hb5Var.u = i2;
        m00 m00Var = hb5Var.r;
        if (m00Var != null) {
            hb5Var.h.n(m00Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        hb5 hb5Var = this.D;
        hb5Var.v = colorStateList;
        m00 m00Var = hb5Var.r;
        if (m00Var == null || colorStateList == null) {
            return;
        }
        m00Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        hb5 hb5Var = this.D;
        if (zIsEmpty) {
            if (hb5Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!hb5Var.x) {
            setHelperTextEnabled(true);
        }
        hb5Var.c();
        hb5Var.w = charSequence;
        hb5Var.y.setText(charSequence);
        int i2 = hb5Var.n;
        if (i2 != 2) {
            hb5Var.o = 2;
        }
        hb5Var.i(i2, hb5Var.h(hb5Var.y, charSequence), hb5Var.o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        hb5 hb5Var = this.D;
        hb5Var.A = colorStateList;
        m00 m00Var = hb5Var.y;
        if (m00Var == null || colorStateList == null) {
            return;
        }
        m00Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        hb5 hb5Var = this.D;
        TextInputLayout textInputLayout = hb5Var.h;
        if (hb5Var.x == z) {
            return;
        }
        hb5Var.c();
        if (z) {
            m00 m00Var = new m00(hb5Var.g);
            hb5Var.y = m00Var;
            m00Var.setId(com.hwpo_training_app.R.id.textinput_helper_text);
            hb5Var.y.setTextAlignment(5);
            Typeface typeface = hb5Var.B;
            if (typeface != null) {
                hb5Var.y.setTypeface(typeface);
            }
            hb5Var.y.setVisibility(4);
            hb5Var.y.setImportantForAccessibility(2);
            int i2 = hb5Var.z;
            hb5Var.z = i2;
            m00 m00Var2 = hb5Var.y;
            if (m00Var2 != null) {
                m00Var2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = hb5Var.A;
            hb5Var.A = colorStateList;
            m00 m00Var3 = hb5Var.y;
            if (m00Var3 != null && colorStateList != null) {
                m00Var3.setTextColor(colorStateList);
            }
            hb5Var.a(hb5Var.y, 1);
        } else {
            hb5Var.c();
            int i3 = hb5Var.n;
            if (i3 == 2) {
                hb5Var.o = 0;
            }
            hb5Var.i(i3, hb5Var.h(hb5Var.y, BuildConfig.FLAVOR), hb5Var.o);
            hb5Var.g(hb5Var.y, 1);
            hb5Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        hb5Var.x = z;
    }

    public void setHelperTextTextAppearance(int i2) {
        hb5 hb5Var = this.D;
        hb5Var.z = i2;
        m00 m00Var = hb5Var.y;
        if (m00Var != null) {
            m00Var.setTextAppearance(i2);
        }
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.R0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.W) {
            this.W = z;
            if (z) {
                CharSequence hint = this.x.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.a0)) {
                        setHint(hint);
                    }
                    this.x.setHint((CharSequence) null);
                }
                this.b0 = true;
            } else {
                this.b0 = false;
                if (!TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(this.x.getHint())) {
                    this.x.setHint(this.a0);
                }
                setHintInternal(null);
            }
            if (this.x != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i2) {
        yg1 yg1Var = this.P0;
        if (i2 != yg1Var.f0) {
            yg1Var.f0 = i2;
            yg1Var.j(false);
        }
        if (i2 != yg1Var.e0) {
            yg1Var.e0 = i2;
            yg1Var.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i2) {
        yg1 yg1Var = this.P0;
        TextInputLayout textInputLayout = yg1Var.a;
        dba dbaVar = new dba(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = dbaVar.k;
        if (colorStateList != null) {
            yg1Var.k = colorStateList;
        }
        float f2 = dbaVar.l;
        if (f2 != 0.0f) {
            yg1Var.i = f2;
        }
        ColorStateList colorStateList2 = dbaVar.a;
        if (colorStateList2 != null) {
            yg1Var.V = colorStateList2;
        }
        yg1Var.T = dbaVar.f;
        yg1Var.U = dbaVar.g;
        yg1Var.S = dbaVar.h;
        yg1Var.W = dbaVar.j;
        a41 a41Var = yg1Var.z;
        if (a41Var != null) {
            a41Var.z = true;
        }
        xg1 xg1Var = new xg1(yg1Var);
        dbaVar.a();
        yg1Var.z = new a41(xg1Var, dbaVar.p);
        dbaVar.b(textInputLayout.getContext(), yg1Var.z);
        yg1Var.j(false);
        this.D0 = yg1Var.k;
        if (this.x != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                yg1 yg1Var = this.P0;
                if (yg1Var.k != colorStateList) {
                    yg1Var.k = colorStateList;
                    yg1Var.j(false);
                }
            }
            this.D0 = colorStateList;
            if (this.x != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.H = fVar;
    }

    public void setMaxEms(int i2) {
        this.A = i2;
        EditText editText = this.x;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.C = i2;
        EditText editText = this.x;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.z = i2;
        EditText editText = this.x;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.B = i2;
        EditText editText = this.x;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.z.setContentDescription(i2 != 0 ? aVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.z.setImageDrawable(i2 != 0 ? e00.b(aVar.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        com.google.android.material.textfield.a aVar = this.v;
        if (z && aVar.B != 1) {
            aVar.g(1);
        } else if (z) {
            aVar.getClass();
        } else {
            aVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.D = colorStateList;
        i65.a(aVar.t, aVar.z, colorStateList, aVar.E);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.E = mode;
        i65.a(aVar.t, aVar.z, aVar.D, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.N == null) {
            m00 m00Var = new m00(getContext());
            this.N = m00Var;
            m00Var.setId(com.hwpo_training_app.R.id.textinput_placeholder);
            this.N.setImportantForAccessibility(1);
            this.N.setAccessibilityLiveRegion(1);
            dt3 dt3VarF = f();
            this.Q = dt3VarF;
            dt3VarF.u = 67L;
            this.R = f();
            setPlaceholderTextAppearance(this.P);
            setPlaceholderTextColor(this.O);
            egb.o(this.N, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M) {
                setPlaceholderTextEnabled(true);
            }
            this.L = charSequence;
        }
        EditText editText = this.x;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.P = i2;
        m00 m00Var = this.N;
        if (m00Var != null) {
            m00Var.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            m00 m00Var = this.N;
            if (m00Var == null || colorStateList == null) {
                return;
            }
            m00Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        jz9 jz9Var = this.u;
        jz9Var.getClass();
        jz9Var.v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        jz9Var.u.setText(charSequence);
        jz9Var.f();
    }

    public void setPrefixTextAppearance(int i2) {
        this.u.u.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.u.u.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ll9 ll9Var) {
        kk6 kk6Var = this.c0;
        if (kk6Var == null || kk6Var.g() == ll9Var) {
            return;
        }
        this.i0 = ll9Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.u.w.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? e00.b(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        jz9 jz9Var = this.u;
        if (i2 < 0) {
            jz9Var.getClass();
            z90.a("startIconSize cannot be less than 0");
        } else if (i2 != jz9Var.z) {
            jz9Var.z = i2;
            CheckableImageButton checkableImageButton = jz9Var.w;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        jz9 jz9Var = this.u;
        CheckableImageButton checkableImageButton = jz9Var.w;
        View.OnLongClickListener onLongClickListener = jz9Var.B;
        checkableImageButton.setOnClickListener(onClickListener);
        i65.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        jz9 jz9Var = this.u;
        jz9Var.B = onLongClickListener;
        CheckableImageButton checkableImageButton = jz9Var.w;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        i65.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        jz9 jz9Var = this.u;
        jz9Var.A = scaleType;
        jz9Var.w.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        jz9 jz9Var = this.u;
        if (jz9Var.x != colorStateList) {
            jz9Var.x = colorStateList;
            i65.a(jz9Var.t, jz9Var.w, colorStateList, jz9Var.y);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        jz9 jz9Var = this.u;
        if (jz9Var.y != mode) {
            jz9Var.y = mode;
            i65.a(jz9Var.t, jz9Var.w, jz9Var.x, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.u.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.v;
        aVar.getClass();
        aVar.I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.J.setText(charSequence);
        aVar.n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.v.J.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.v.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.x;
        if (editText != null) {
            egb.o(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.v0) {
            this.v0 = typeface;
            this.P0.n(typeface);
            hb5 hb5Var = this.D;
            if (typeface != hb5Var.B) {
                hb5Var.B = typeface;
                m00 m00Var = hb5Var.r;
                if (m00Var != null) {
                    m00Var.setTypeface(typeface);
                }
                m00 m00Var2 = hb5Var.y;
                if (m00Var2 != null) {
                    m00Var2.setTypeface(typeface);
                }
            }
            m00 m00Var3 = this.I;
            if (m00Var3 != null) {
                m00Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        m00 m00Var;
        EditText editText = this.x;
        if (editText == null || this.l0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = d83.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(tz.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.G && (m00Var = this.I) != null) {
            drawableMutate.setColorFilter(tz.c(m00Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.x.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.x;
        if (editText == null || this.c0 == null) {
            return;
        }
        if ((this.f0 || editText.getBackground() == null) && this.l0 != 0) {
            this.x.setBackground(getEditTextBoxBackground());
            this.f0 = true;
        }
    }

    public final void v() {
        if (this.l0 != 1) {
            FrameLayout frameLayout = this.t;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        m00 m00Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.x;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.x;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.C0;
        yg1 yg1Var = this.P0;
        if (colorStateList2 != null) {
            yg1Var.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.C0;
            int colorForState = this.M0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            yg1Var.k(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            m00 m00Var2 = this.D.r;
            yg1Var.k(m00Var2 != null ? m00Var2.getTextColors() : null);
        } else if (this.G && (m00Var = this.I) != null) {
            yg1Var.k(m00Var.getTextColors());
        } else if (z4 && (colorStateList = this.D0) != null && yg1Var.k != colorStateList) {
            yg1Var.k = colorStateList;
            yg1Var.j(false);
        }
        com.google.android.material.textfield.a aVar = this.v;
        jz9 jz9Var = this.u;
        if (z3 || !this.Q0 || (isEnabled() && z4)) {
            if (z2 || this.O0) {
                ValueAnimator valueAnimator = this.S0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.S0.cancel();
                }
                if (z && this.R0) {
                    b(1.0f);
                } else {
                    yg1Var.m(1.0f);
                }
                this.O0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.x;
                x(editText3 != null ? editText3.getText() : null);
                jz9Var.C = false;
                jz9Var.f();
                aVar.K = false;
                aVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.O0) {
            ValueAnimator valueAnimator2 = this.S0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.S0.cancel();
            }
            if (z && this.R0) {
                b(0.0f);
            } else {
                yg1Var.m(0.0f);
            }
            if (g() && !((ud2) this.c0).a0.q.isEmpty() && g()) {
                ((ud2) this.c0).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.O0 = true;
            m00 m00Var3 = this.N;
            if (m00Var3 != null && this.M) {
                m00Var3.setText((CharSequence) null);
                qwa.a(this.t, this.R);
                this.N.setVisibility(4);
            }
            jz9Var.C = true;
            jz9Var.f();
            aVar.K = true;
            aVar.n();
        }
    }

    public final void x(Editable editable) {
        ((xa8) this.H).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.t;
        if (length != 0 || this.O0) {
            m00 m00Var = this.N;
            if (m00Var == null || !this.M) {
                return;
            }
            m00Var.setText((CharSequence) null);
            qwa.a(frameLayout, this.R);
            this.N.setVisibility(4);
            return;
        }
        if (this.N == null || !this.M || TextUtils.isEmpty(this.L)) {
            return;
        }
        this.N.setText(this.L);
        qwa.a(frameLayout, this.Q);
        this.N.setVisibility(0);
        this.N.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.q0 = colorForState2;
        } else if (z2) {
            this.q0 = colorForState;
        } else {
            this.q0 = defaultColor;
        }
    }

    public final void z() {
        m00 m00Var;
        EditText editText;
        EditText editText2;
        if (this.c0 == null || this.l0 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.x) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.x) != null && editText.isHovered());
        if (!isEnabled()) {
            this.q0 = this.M0;
        } else if (o()) {
            if (this.H0 != null) {
                y(z, z2);
            } else {
                this.q0 = getErrorCurrentTextColors();
            }
        } else if (!this.G || (m00Var = this.I) == null) {
            if (z) {
                this.q0 = this.G0;
            } else if (z2) {
                this.q0 = this.F0;
            } else {
                this.q0 = this.E0;
            }
        } else if (this.H0 != null) {
            y(z, z2);
        } else {
            this.q0 = m00Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        com.google.android.material.textfield.a aVar = this.v;
        TextInputLayout textInputLayout = aVar.t;
        CheckableImageButton checkableImageButton = aVar.z;
        TextInputLayout textInputLayout2 = aVar.t;
        aVar.l();
        i65.c(textInputLayout2, aVar.v, aVar.w);
        i65.c(textInputLayout2, checkableImageButton, aVar.D);
        if (aVar.a() instanceof c93) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                i65.a(textInputLayout, checkableImageButton, aVar.D, aVar.E);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        jz9 jz9Var = this.u;
        i65.c(jz9Var.t, jz9Var.w, jz9Var.x);
        if (this.l0 == 2) {
            int i2 = this.n0;
            if (z && isEnabled()) {
                this.n0 = this.p0;
            } else {
                this.n0 = this.o0;
            }
            if (this.n0 != i2 && g() && !this.O0) {
                if (g()) {
                    ((ud2) this.c0).x(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.l0 == 1) {
            if (!isEnabled()) {
                this.r0 = this.J0;
            } else if (z2 && !z) {
                this.r0 = this.L0;
            } else if (z) {
                this.r0 = this.K0;
            } else {
                this.r0 = this.I0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.x;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class i extends e0 {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public CharSequence v;
        public boolean w;

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.w = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.v) + "}";
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.v, parcel, i);
            parcel.writeInt(this.w ? 1 : 0);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new i[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.W) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(AudioConstants.AUDIO_FILE_BUFFER_SIZE);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.u.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.u.c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.v.f(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.v.z.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.v.z.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.v.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.v;
        TextInputLayout textInputLayout = aVar.t;
        CheckableImageButton checkableImageButton = aVar.z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            i65.a(textInputLayout, checkableImageButton, aVar.D, aVar.E);
            i65.c(textInputLayout, checkableImageButton, aVar.D);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements TextWatcher {
        public int t;
        public final /* synthetic */ EditText u;

        public a(EditText editText) {
            this.u = editText;
            this.t = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w(!textInputLayout.U0, false);
            if (textInputLayout.E) {
                textInputLayout.p(editable);
            }
            if (textInputLayout.M) {
                textInputLayout.x(editable);
            }
            EditText editText = this.u;
            int lineCount = editText.getLineCount();
            int i = this.t;
            if (lineCount != i) {
                if (lineCount < i) {
                    int minimumHeight = editText.getMinimumHeight();
                    int i2 = textInputLayout.N0;
                    if (minimumHeight != i2) {
                        editText.setMinimumHeight(i2);
                    }
                }
                this.t = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
