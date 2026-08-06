package com.hwpo_training_app.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import defpackage.ch8;
import defpackage.g2b;
import defpackage.qq2;
import defpackage.wk6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioCardView extends MaterialCardView {
    public final float H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ch8.a);
        typedArrayObtainStyledAttributes.getClass();
        this.H = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
        g2b g2bVar = g2b.a;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.material.card.MaterialCardView, androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(wk6.b(size * this.H), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioCardView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ AspectRatioCardView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
