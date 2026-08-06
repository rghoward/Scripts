package com.hwpo_training_app.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.hwpo_training_app.R;
import defpackage.ch8;
import defpackage.g2b;
import defpackage.i89;
import defpackage.j89;
import defpackage.ll8;
import defpackage.os5;
import defpackage.qq2;
import defpackage.r54;
import defpackage.sd1;
import defpackage.xfb;
import defpackage.xgb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class SearchEditText extends FrameLayout {
    public final os5 t;
    public final AppCompatEditText u;
    public final r54<String> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Context context2 = getContext();
        context2.getClass();
        sd1 sd1VarA = ll8.a(os5.class);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        layoutInflaterFrom.getClass();
        os5 os5Var = (os5) xfb.a(sd1VarA, layoutInflaterFrom, this, true);
        this.t = os5Var;
        AppCompatEditText appCompatEditText = os5Var.c;
        this.u = appCompatEditText;
        this.v = xgb.d(appCompatEditText);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ch8.f);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(2);
        if (string != null) {
            appCompatEditText.setHint(string);
        }
        appCompatEditText.setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(1, R.drawable.bg_search_edit_text));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        g2b g2bVar = g2b.a;
        typedArrayObtainStyledAttributes.recycle();
        xgb.a(os5Var.b, new i89(os5Var, null));
        if (z) {
            appCompatEditText.addTextChangedListener(new j89(os5Var));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        Object systemService = getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final AppCompatEditText getEditText() {
        return this.u;
    }

    public final String getHint() {
        return this.t.c.getHint().toString();
    }

    public final Editable getText() {
        return this.t.c.getText();
    }

    public final r54<String> getTextChangesFlow() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        super.requestFocus(i, rect);
        AppCompatEditText appCompatEditText = this.t.c;
        appCompatEditText.requestFocus();
        Object systemService = appCompatEditText.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).showSoftInput(appCompatEditText, 1);
        return true;
    }

    public final void setHint(String str) {
        str.getClass();
        this.t.c.setHint(str);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.t.c.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setText(Editable editable) {
        this.t.c.setText(editable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SearchEditText(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
