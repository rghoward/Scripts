package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yz extends MultiAutoCompleteTextView {
    public static final int[] w = {R.attr.popupBackground};
    public final wy t;
    public final k00 u;
    public final uz v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.hwpo_training_app.R.attr.autoCompleteTextViewStyle);
        dpa.a(context);
        xka.a(this, getContext());
        gpa gpaVarE = gpa.e(getContext(), attributeSet, w, com.hwpo_training_app.R.attr.autoCompleteTextViewStyle);
        if (gpaVarE.b.hasValue(0)) {
            setDropDownBackgroundDrawable(gpaVarE.b(0));
        }
        gpaVarE.f();
        wy wyVar = new wy(this);
        this.t = wyVar;
        wyVar.d(attributeSet, com.hwpo_training_app.R.attr.autoCompleteTextViewStyle);
        k00 k00Var = new k00(this);
        this.u = k00Var;
        k00Var.f(attributeSet, com.hwpo_training_app.R.attr.autoCompleteTextViewStyle);
        k00Var.b();
        uz uzVar = new uz(this);
        this.v = uzVar;
        uzVar.b(attributeSet, com.hwpo_training_app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = uzVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.a();
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        wy wyVar = this.t;
        if (wyVar != null) {
            return wyVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wy wyVar = this.t;
        if (wyVar != null) {
            return wyVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        wz.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.v.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(e00.b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.v.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.v.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        k00 k00Var = this.u;
        k00Var.k(colorStateList);
        k00Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        k00 k00Var = this.u;
        k00Var.l(mode);
        k00Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.g(context, i);
        }
    }
}
