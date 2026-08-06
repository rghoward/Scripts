package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.hwpo_training_app.R;
import defpackage.bh8;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.uk6;
import defpackage.vka;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public final kk6 t;
    public int u;
    public int v;
    public int w;
    public int x;

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(uk6.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.t = new kk6();
        TypedArray typedArrayD = vka.d(context2, attributeSet, bh8.r, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.u = typedArrayD.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.w = typedArrayD.getDimensionPixelOffset(2, 0);
        this.x = typedArrayD.getDimensionPixelOffset(1, 0);
        setDividerColor(jk6.b(context2, typedArrayD, 0).getDefaultColor());
        typedArrayD.recycle();
    }

    public int getDividerColor() {
        return this.v;
    }

    public int getDividerInsetEnd() {
        return this.x;
    }

    public int getDividerInsetStart() {
        return this.w;
    }

    public int getDividerThickness() {
        return this.u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.x : this.w;
        if (z) {
            width = getWidth();
            i = this.w;
        } else {
            width = getWidth();
            i = this.x;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        kk6 kk6Var = this.t;
        kk6Var.setBounds(i2, 0, i3, bottom);
        kk6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.u;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.v != i) {
            this.v = i;
            this.t.p(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.x = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.w = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.u != i) {
            this.u = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
