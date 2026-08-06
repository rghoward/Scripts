package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import defpackage.b00;
import defpackage.bh8;
import defpackage.g53;
import defpackage.jk6;
import defpackage.uk6;
import defpackage.vka;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends b00 {
    public static final int[][] z = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList x;
    public boolean y;

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(uk6.a(context, attributeSet, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = vka.d(context2, attributeSet, bh8.s, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setButtonTintList(jk6.b(context2, typedArrayD, 0));
        }
        if (typedArrayD.hasValue(1)) {
            setRippleColor(jk6.b(context2, typedArrayD, 1));
        }
        this.y = typedArrayD.getBoolean(2, false);
        typedArrayD.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.x == null) {
            int iA = g53.a(com.hwpo_training_app.R.attr.colorControlActivated, this);
            int iA2 = g53.a(com.hwpo_training_app.R.attr.colorOnSurface, this);
            int iA3 = g53.a(com.hwpo_training_app.R.attr.colorSurface, this);
            this.x = new ColorStateList(z, new int[]{g53.d(iA3, 1.0f, iA), g53.d(iA3, 0.54f, iA2), g53.d(iA3, 0.38f, iA2), g53.d(iA3, 0.38f, iA2)});
        }
        return this.x;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.y = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context) {
        this(context, null);
    }
}
