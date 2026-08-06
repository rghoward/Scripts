package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jz9 extends LinearLayout {
    public ImageView.ScaleType A;
    public View.OnLongClickListener B;
    public boolean C;
    public final TextInputLayout t;
    public final m00 u;
    public CharSequence v;
    public final CheckableImageButton w;
    public ColorStateList x;
    public PorterDuff.Mode y;
    public int z;

    public jz9(TextInputLayout textInputLayout, gpa gpaVar) {
        super(textInputLayout.getContext());
        this.t = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.w = checkableImageButton;
        m00 m00Var = new m00(getContext());
        this.u = m00Var;
        if (jk6.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(null);
        i65.d(checkableImageButton, onLongClickListener);
        this.B = null;
        checkableImageButton.setOnLongClickListener(null);
        i65.d(checkableImageButton, null);
        TypedArray typedArray = gpaVar.b;
        if (typedArray.hasValue(70)) {
            this.x = jk6.a(getContext(), gpaVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.y = wib.c(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(gpaVar.b(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            z90.a("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.z) {
            this.z = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeB = i65.b(typedArray.getInt(69, -1));
            this.A = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        m00Var.setVisibility(8);
        m00Var.setId(R.id.textinput_prefix_text);
        m00Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        m00Var.setAccessibilityLiveRegion(1);
        m00Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            m00Var.setTextColor(gpaVar.a(62));
        }
        CharSequence text = typedArray.getText(60);
        this.v = TextUtils.isEmpty(text) ? null : text;
        m00Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(m00Var);
        checkableImageButton.setOnFocusableChangedListener(new iw8(this));
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.w;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.u.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.w;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            i65.e(checkableImageButton, this.B, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.w;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.x;
            PorterDuff.Mode mode = this.y;
            TextInputLayout textInputLayout = this.t;
            i65.a(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            i65.c(textInputLayout, checkableImageButton, this.x);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(null);
        i65.d(checkableImageButton, onLongClickListener);
        this.B = null;
        checkableImageButton.setOnLongClickListener(null);
        i65.d(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.w;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.t.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.t.x;
        if (editText == null) {
            return;
        }
        this.u.setPaddingRelative(this.w.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i = (this.v == null || this.C) ? 8 : 0;
        setVisibility((this.w.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.u.setVisibility(i);
        this.t.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        e();
    }
}
