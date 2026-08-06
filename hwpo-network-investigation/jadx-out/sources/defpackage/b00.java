package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class b00 extends RadioButton implements hpa {
    public final bz t;
    public final wy u;
    public final k00 v;
    public vz w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dpa.a(context);
        xka.a(this, getContext());
        bz bzVar = new bz(this);
        this.t = bzVar;
        bzVar.b(attributeSet, i);
        wy wyVar = new wy(this);
        this.u = wyVar;
        wyVar.d(attributeSet, i);
        k00 k00Var = new k00(this);
        this.v = k00Var;
        k00Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private vz getEmojiTextViewHelper() {
        if (this.w == null) {
            this.w = new vz(this);
        }
        return this.w;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wy wyVar = this.u;
        if (wyVar != null) {
            wyVar.a();
        }
        k00 k00Var = this.v;
        if (k00Var != null) {
            k00Var.b();
        }
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

    @Override // defpackage.hpa
    public ColorStateList getSupportButtonTintList() {
        bz bzVar = this.t;
        if (bzVar != null) {
            return bzVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        bz bzVar = this.t;
        if (bzVar != null) {
            return bzVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.v.e();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        bz bzVar = this.t;
        if (bzVar != null) {
            if (bzVar.f) {
                bzVar.f = false;
            } else {
                bzVar.f = true;
                bzVar.a();
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override // defpackage.hpa
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        bz bzVar = this.t;
        if (bzVar != null) {
            bzVar.b = colorStateList;
            bzVar.d = true;
            bzVar.a();
        }
    }

    @Override // defpackage.hpa
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        bz bzVar = this.t;
        if (bzVar != null) {
            bzVar.c = mode;
            bzVar.e = true;
            bzVar.a();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(e00.b(getContext(), i));
    }
}
