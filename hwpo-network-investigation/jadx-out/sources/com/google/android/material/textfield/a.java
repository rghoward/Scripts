package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;
import com.hwpo_training_app.R;
import defpackage.bu7;
import defpackage.c93;
import defpackage.cb7;
import defpackage.e00;
import defpackage.fg3;
import defpackage.gka;
import defpackage.gpa;
import defpackage.hd2;
import defpackage.i65;
import defpackage.jk6;
import defpackage.m00;
import defpackage.pe1;
import defpackage.pp2;
import defpackage.wib;
import defpackage.z90;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends LinearLayout {
    public final d A;
    public int B;
    public final LinkedHashSet<TextInputLayout.h> C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public int F;
    public ImageView.ScaleType G;
    public View.OnLongClickListener H;
    public CharSequence I;
    public final m00 J;
    public boolean K;
    public EditText L;
    public final AccessibilityManager M;
    public AccessibilityManager.TouchExplorationStateChangeListener N;
    public final C0058a O;
    public final TextInputLayout t;
    public final FrameLayout u;
    public final CheckableImageButton v;
    public ColorStateList w;
    public PorterDuff.Mode x;
    public View.OnLongClickListener y;
    public final CheckableImageButton z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class C0058a extends gka {
        public C0058a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.a().a();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.a().b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            C0058a c0058a = aVar.O;
            if (aVar.L == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.L;
            if (editText != null) {
                editText.removeTextChangedListener(c0058a);
                if (aVar.L.getOnFocusChangeListener() == aVar.a().e()) {
                    aVar.L.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.L = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0058a);
            }
            aVar.a().l(aVar.L);
            aVar.j(aVar.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            a aVar = a.this;
            AccessibilityManager accessibilityManager = aVar.M;
            if (aVar.N == null || accessibilityManager == null || !aVar.isAttachedToWindow()) {
                return;
            }
            accessibilityManager.addTouchExplorationStateChangeListener(aVar.N);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = aVar.N;
            if (touchExplorationStateChangeListener == null || (accessibilityManager = aVar.M) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public final SparseArray<fg3> a = new SparseArray<>();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, gpa gpaVar) {
            this.b = aVar;
            TypedArray typedArray = gpaVar.b;
            this.c = typedArray.getResourceId(28, 0);
            this.d = typedArray.getResourceId(53, 0);
        }
    }

    public a(TextInputLayout textInputLayout, gpa gpaVar) {
        super(textInputLayout.getContext());
        this.B = 0;
        this.C = new LinkedHashSet<>();
        this.O = new C0058a();
        b bVar = new b();
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.t = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.u = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (jk6.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.v = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (jk6.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.z = checkableImageButton2;
        this.A = new d(this, gpaVar);
        m00 m00Var = new m00(getContext());
        this.J = m00Var;
        TypedArray typedArray = gpaVar.b;
        if (typedArray.hasValue(38)) {
            this.w = jk6.a(getContext(), gpaVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.x = wib.c(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(gpaVar.b(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setCheckable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.D = jk6.a(getContext(), gpaVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.E = wib.c(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                f(typedArray.getText(27));
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.D = jk6.a(getContext(), gpaVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.E = wib.c(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            f(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            z90.a("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.F) {
            this.F = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = i65.b(typedArray.getInt(31, -1));
            this.G = scaleTypeB;
            checkableImageButton2.setScaleType(scaleTypeB);
            checkableImageButton.setScaleType(scaleTypeB);
        }
        m00Var.setVisibility(8);
        m00Var.setId(R.id.textinput_suffix_text);
        m00Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        m00Var.setAccessibilityLiveRegion(1);
        m00Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            m00Var.setTextColor(gpaVar.a(74));
        }
        CharSequence text = typedArray.getText(72);
        this.I = TextUtils.isEmpty(text) ? null : text;
        m00Var.setText(text);
        n();
        frameLayout.addView(checkableImageButton2);
        addView(m00Var);
        addView(frameLayout);
        addView(checkableImageButton);
        checkableImageButton.setOnFocusableChangedListener(new CheckableImageButton.b() { // from class: dg3
            @Override // com.google.android.material.internal.CheckableImageButton.b
            public final void a() {
                a aVar = this.t;
                CheckableImageButton checkableImageButton3 = aVar.v;
                i65.e(checkableImageButton3, aVar.y, checkableImageButton3.getContentDescription());
            }
        });
        checkableImageButton2.setOnFocusableChangedListener(new CheckableImageButton.b() { // from class: eg3
            @Override // com.google.android.material.internal.CheckableImageButton.b
            public final void a() {
                a aVar = this.t;
                CheckableImageButton checkableImageButton3 = aVar.z;
                i65.e(checkableImageButton3, aVar.H, checkableImageButton3.getContentDescription());
            }
        });
        textInputLayout.y0.add(bVar);
        if (textInputLayout.x != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final fg3 a() {
        fg3 hd2Var;
        int i = this.B;
        d dVar = this.A;
        SparseArray<fg3> sparseArray = dVar.a;
        fg3 fg3Var = sparseArray.get(i);
        if (fg3Var != null) {
            return fg3Var;
        }
        a aVar = dVar.b;
        if (i == -1) {
            hd2Var = new hd2(aVar);
        } else if (i == 0) {
            hd2Var = new cb7(aVar);
        } else if (i == 1) {
            hd2Var = new bu7(aVar, dVar.d);
        } else if (i == 2) {
            hd2Var = new pe1(aVar);
        } else {
            if (i != 3) {
                z90.a(pp2.a(i, "Invalid end icon mode: "));
                return null;
            }
            hd2Var = new c93(aVar);
        }
        sparseArray.append(i, hd2Var);
        return hd2Var;
    }

    public final int b() {
        int marginStart;
        if (c() || d()) {
            CheckableImageButton checkableImageButton = this.z;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.J.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean c() {
        return this.u.getVisibility() == 0 && this.z.getVisibility() == 0;
    }

    public final boolean d() {
        return this.v.getVisibility() == 0;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        fg3 fg3VarA = a();
        boolean zJ = fg3VarA.j();
        CheckableImageButton checkableImageButton = this.z;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.w) == fg3VarA.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(fg3VarA instanceof c93) || (zIsActivated = checkableImageButton.isActivated()) == ((c93) fg3VarA).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            i65.c(this.t, checkableImageButton, this.D);
        }
    }

    public final void f(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            i65.e(checkableImageButton, this.H, charSequence);
        }
    }

    public final void g(int i) {
        if (this.B == i) {
            return;
        }
        fg3 fg3VarA = a();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.N;
        AccessibilityManager accessibilityManager = this.M;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.N = null;
        fg3VarA.r();
        this.B = i;
        Iterator<TextInputLayout.h> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i != 0);
        fg3 fg3VarA2 = a();
        int iD = this.A.c;
        if (iD == 0) {
            iD = fg3VarA2.d();
        }
        Drawable drawableB = iD != 0 ? e00.b(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.z;
        checkableImageButton.setImageDrawable(drawableB);
        TextInputLayout textInputLayout = this.t;
        if (drawableB != null) {
            i65.a(textInputLayout, checkableImageButton, this.D, this.E);
            i65.c(textInputLayout, checkableImageButton, this.D);
        }
        checkableImageButton.setCheckable(fg3VarA2.j());
        if (!fg3VarA2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        fg3VarA2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = fg3VarA2.h();
        this.N = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.N);
        }
        View.OnClickListener onClickListenerF = fg3VarA2.f();
        View.OnLongClickListener onLongClickListener = this.H;
        checkableImageButton.setOnClickListener(onClickListenerF);
        i65.d(checkableImageButton, onLongClickListener);
        int iC = fg3VarA2.c();
        f(iC != 0 ? getResources().getText(iC) : null);
        EditText editText = this.L;
        if (editText != null) {
            fg3VarA2.l(editText);
            j(fg3VarA2);
        }
        i65.a(textInputLayout, checkableImageButton, this.D, this.E);
        e(true);
    }

    public final void h(boolean z) {
        EditText editText;
        if (c() != z) {
            CheckableImageButton checkableImageButton = this.z;
            if (!z && checkableImageButton.hasFocus() && (editText = this.L) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            k();
            m();
            this.t.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.v;
        checkableImageButton.setImageDrawable(drawable);
        l();
        i65.a(this.t, checkableImageButton, this.w, this.x);
    }

    public final void j(fg3 fg3Var) {
        if (this.L == null) {
            return;
        }
        if (fg3Var.e() != null) {
            this.L.setOnFocusChangeListener(fg3Var.e());
        }
        if (fg3Var.g() != null) {
            this.z.setOnFocusChangeListener(fg3Var.g());
        }
    }

    public final void k() {
        this.u.setVisibility((this.z.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.I == null || this.K) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.v;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.t;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.D.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.B != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.t;
        if (textInputLayout.x == null) {
            return;
        }
        this.J.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.x.getPaddingTop(), (c() || d()) ? 0 : textInputLayout.x.getPaddingEnd(), textInputLayout.x.getPaddingBottom());
    }

    public final void n() {
        m00 m00Var = this.J;
        int visibility = m00Var.getVisibility();
        int i = (this.I == null || this.K) ? 8 : 0;
        if (visibility != i) {
            a().o(i == 0);
        }
        k();
        m00Var.setVisibility(i);
        this.t.s();
    }
}
