package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class vy extends AutoCompleteTextView {
    public static final int[] w = {R.attr.popupBackground};
    public final wy t;
    public final k00 u;
    public final uz v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dpa.a(context);
        xka.a(this, getContext());
        gpa gpaVarE = gpa.e(getContext(), attributeSet, w, i);
        if (gpaVarE.b.hasValue(0)) {
            setDropDownBackgroundDrawable(gpaVarE.b(0));
        }
        gpaVarE.f();
        wy wyVar = new wy(this);
        this.t = wyVar;
        wyVar.d(attributeSet, i);
        k00 k00Var = new k00(this);
        this.u = k00Var;
        k00Var.f(attributeSet, i);
        k00Var.b();
        uz uzVar = new uz(this);
        this.v = uzVar;
        uzVar.b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = uzVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return eka.e(super.getCustomSelectionActionModeCallback());
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
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(eka.f(callback, this));
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
