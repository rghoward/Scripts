package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends CheckedTextView {
    public final az t;
    public final wy u;
    public final k00 v;
    public vz w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        dpa.a(context);
        xka.a(this, getContext());
        k00 k00Var = new k00(this);
        this.v = k00Var;
        k00Var.f(attributeSet, R.attr.checkedTextViewStyle);
        k00Var.b();
        wy wyVar = new wy(this);
        this.u = wyVar;
        wyVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.t = new az(this);
        Context context2 = getContext();
        int[] iArr = ph8.l;
        gpa gpaVarE = gpa.e(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = gpaVarE.b;
        egb.n(this, getContext(), iArr, attributeSet, gpaVarE.b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(e00.b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(e00.b(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(e00.b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(gpaVarE.a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(d83.c(typedArray.getInt(3, -1), null));
            }
            gpaVarE.f();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            gpaVarE.f();
            throw th;
        }
    }

    private vz getEmojiTextViewHelper() {
        if (this.w == null) {
            this.w = new vz(this);
        }
        return this.w;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k00 k00Var = this.v;
        if (k00Var != null) {
            k00Var.b();
        }
        wy wyVar = this.u;
        if (wyVar != null) {
            wyVar.a();
        }
        az azVar = this.t;
        if (azVar != null) {
            azVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return eka.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        wy wyVar = this.u;
        if (wyVar != null) {
            return wyVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wy wyVar = this.u;
        if (wyVar != null) {
            return wyVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        az azVar = this.t;
        if (azVar != null) {
            return azVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        az azVar = this.t;
        if (azVar != null) {
            return azVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.v.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        wz.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wy wyVar = this.u;
        if (wyVar != null) {
            wyVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        wy wyVar = this.u;
        if (wyVar != null) {
            wyVar.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        az azVar = this.t;
        if (azVar != null) {
            if (azVar.f) {
                azVar.f = false;
            } else {
                azVar.f = true;
                azVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.v;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        k00 k00Var = this.v;
        if (k00Var != null) {
            k00Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(eka.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wy wyVar = this.u;
        if (wyVar != null) {
            wyVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wy wyVar = this.u;
        if (wyVar != null) {
            wyVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        az azVar = this.t;
        if (azVar != null) {
            azVar.b = colorStateList;
            azVar.d = true;
            azVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        az azVar = this.t;
        if (azVar != null) {
            azVar.c = mode;
            azVar.e = true;
            azVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        k00 k00Var = this.v;
        k00Var.k(colorStateList);
        k00Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        k00 k00Var = this.v;
        k00Var.l(mode);
        k00Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k00 k00Var = this.v;
        if (k00Var != null) {
            k00Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(e00.b(getContext(), i));
    }
}
