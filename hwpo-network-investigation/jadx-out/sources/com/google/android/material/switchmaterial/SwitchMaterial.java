package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import defpackage.bh8;
import defpackage.ee3;
import defpackage.g53;
import defpackage.j7a;
import defpackage.uk6;
import defpackage.vka;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends j7a {
    public static final int[][] t0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final ee3 p0;
    public ColorStateList q0;
    public ColorStateList r0;
    public boolean s0;

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(uk6.a(context, attributeSet, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.p0 = new ee3(context2);
        vka.a(context2, attributeSet, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = bh8.E;
        vka.b(context2, attributeSet, iArr, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.hwpo_training_app.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.s0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.q0 == null) {
            int iA = g53.a(com.hwpo_training_app.R.attr.colorSurface, this);
            int iA2 = g53.a(com.hwpo_training_app.R.attr.colorControlActivated, this);
            float dimension = getResources().getDimension(com.hwpo_training_app.R.dimen.mtrl_switch_thumb_elevation);
            ee3 ee3Var = this.p0;
            if (ee3Var.a) {
                float elevation = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    elevation += ((View) parent).getElevation();
                }
                dimension += elevation;
            }
            int iA3 = ee3Var.a(dimension, iA);
            this.q0 = new ColorStateList(t0, new int[]{g53.d(iA, 1.0f, iA2), iA3, g53.d(iA, 0.38f, iA2), iA3});
        }
        return this.q0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.r0 == null) {
            int iA = g53.a(com.hwpo_training_app.R.attr.colorSurface, this);
            int iA2 = g53.a(com.hwpo_training_app.R.attr.colorControlActivated, this);
            int iA3 = g53.a(com.hwpo_training_app.R.attr.colorOnSurface, this);
            this.r0 = new ColorStateList(t0, new int[]{g53.d(iA, 0.54f, iA2), g53.d(iA, 0.32f, iA3), g53.d(iA, 0.12f, iA2), g53.d(iA, 0.12f, iA3)});
        }
        return this.r0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.s0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.s0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.switchStyle);
    }

    public SwitchMaterial(Context context) {
        this(context, null);
    }
}
