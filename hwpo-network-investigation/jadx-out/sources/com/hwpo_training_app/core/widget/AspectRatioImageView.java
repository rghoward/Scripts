package com.hwpo_training_app.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import defpackage.ch8;
import defpackage.g2b;
import defpackage.qq2;
import defpackage.wk6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AspectRatioImageView extends ShapeableImageView {
    public float L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ch8.c);
        typedArrayObtainStyledAttributes.getClass();
        this.L = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
        g2b g2bVar = g2b.a;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getRatio() {
        return this.L;
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(wk6.b(size * this.L), 1073741824));
    }

    public final void setRatio(float f) {
        this.L = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioImageView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ AspectRatioImageView(Context context, AttributeSet attributeSet, int i, qq2 qq2Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
