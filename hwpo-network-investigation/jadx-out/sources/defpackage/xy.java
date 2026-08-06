package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class xy extends Button {
    public final wy t;
    public final k00 u;
    public vz v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dpa.a(context);
        xka.a(this, getContext());
        wy wyVar = new wy(this);
        this.t = wyVar;
        wyVar.d(attributeSet, i);
        k00 k00Var = new k00(this);
        this.u = k00Var;
        k00Var.f(attributeSet, i);
        k00Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private vz getEmojiTextViewHelper() {
        if (this.v == null) {
            this.v = new vz(this);
        }
        return this.v;
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
    public int getAutoSizeMaxTextSize() {
        if (yib.c) {
            return super.getAutoSizeMaxTextSize();
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            return Math.round(k00Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (yib.c) {
            return super.getAutoSizeMinTextSize();
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            return Math.round(k00Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (yib.c) {
            return super.getAutoSizeStepGranularity();
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            return Math.round(k00Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (yib.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        k00 k00Var = this.u;
        return k00Var != null ? k00Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (yib.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            return k00Var.i.a;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k00 k00Var = this.u;
        if (k00Var == null || yib.c) {
            return;
        }
        k00Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k00 k00Var = this.u;
        if (k00Var != null) {
            n00 n00Var = k00Var.i;
            if (yib.c || !n00Var.f()) {
                return;
            }
            n00Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (yib.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (yib.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (yib.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.j(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(eka.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.a.setAllCaps(z);
        }
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k00 k00Var = this.u;
        if (k00Var != null) {
            k00Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = yib.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        k00 k00Var = this.u;
        if (k00Var != null) {
            n00 n00Var = k00Var.i;
            if (z || n00Var.f()) {
                return;
            }
            n00Var.g(f, i);
        }
    }
}
