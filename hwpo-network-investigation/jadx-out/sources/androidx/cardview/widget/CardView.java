package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.gh8;
import defpackage.h51;
import defpackage.nt3;
import defpackage.wx8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] y = {R.attr.colorBackground};
    public boolean t;
    public boolean u;
    public final Rect v;
    public final Rect w;
    public final a x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements h51 {
        public wx8 a;

        public a() {
        }

        public final void a(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.w.set(i, i2, i3, i4);
            Rect rect = cardView.v;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.v = rect;
        this.w = new Rect();
        a aVar = new a();
        this.x = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gh8.a, i, com.hwpo_training_app.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(y);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.hwpo_training_app.R.color.cardview_light_background) : getResources().getColor(com.hwpo_training_app.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.t = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        wx8 wx8Var = new wx8(colorStateListValueOf, dimension);
        aVar.a = wx8Var;
        setBackgroundDrawable(wx8Var);
        setClipToOutline(true);
        setElevation(dimension2);
        nt3.d(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.x.a.h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.v.bottom;
    }

    public int getContentPaddingLeft() {
        return this.v.left;
    }

    public int getContentPaddingRight() {
        return this.v.right;
    }

    public int getContentPaddingTop() {
        return this.v.top;
    }

    public float getMaxCardElevation() {
        return this.x.a.e;
    }

    public boolean getPreventCornerOverlap() {
        return this.u;
    }

    public float getRadius() {
        return this.x.a.a;
    }

    public boolean getUseCompatPadding() {
        return this.t;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        wx8 wx8Var = this.x.a;
        if (colorStateListValueOf == null) {
            wx8Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        wx8Var.h = colorStateListValueOf;
        wx8Var.b.setColor(colorStateListValueOf.getColorForState(wx8Var.getState(), wx8Var.h.getDefaultColor()));
        wx8Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        nt3.d(this.x, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.u) {
            this.u = z;
            a aVar = this.x;
            nt3.d(aVar, aVar.a.e);
        }
    }

    public void setRadius(float f) {
        wx8 wx8Var = this.x.a;
        if (f == wx8Var.a) {
            return;
        }
        wx8Var.a = f;
        wx8Var.b(null);
        wx8Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.t != z) {
            this.t = z;
            a aVar = this.x;
            nt3.d(aVar, aVar.a.e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        wx8 wx8Var = this.x.a;
        if (colorStateList == null) {
            wx8Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        wx8Var.h = colorStateList;
        wx8Var.b.setColor(colorStateList.getColorForState(wx8Var.getState(), wx8Var.h.getDefaultColor()));
        wx8Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
