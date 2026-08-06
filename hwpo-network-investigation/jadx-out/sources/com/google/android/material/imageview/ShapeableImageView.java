package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.hwpo_training_app.R;
import defpackage.bh8;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.ll9;
import defpackage.ml9;
import defpackage.tl9;
import defpackage.uk6;
import defpackage.vz1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements tl9 {
    public kk6 A;
    public ll9 B;
    public float C;
    public final Path D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public boolean K;
    public final ml9 t;
    public final RectF u;
    public final RectF v;
    public final Paint w;
    public final Paint x;
    public final Path y;
    public ColorStateList z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ViewOutlineProvider {
        public final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.B == null) {
                return;
            }
            if (shapeableImageView.A == null) {
                shapeableImageView.A = new kk6(shapeableImageView.B);
            }
            RectF rectF = shapeableImageView.u;
            Rect rect = this.a;
            rectF.round(rect);
            shapeableImageView.A.setBounds(rect);
            shapeableImageView.A.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(uk6.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.t = ml9.a.a;
        this.y = new Path();
        this.K = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.x = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.u = new RectF();
        this.v = new RectF();
        this.D = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bh8.C, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.z = jk6.b(context2, typedArrayObtainStyledAttributes, 9);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.E = dimensionPixelSize;
        this.F = dimensionPixelSize;
        this.G = dimensionPixelSize;
        this.H = dimensionPixelSize;
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.w = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.B = ll9.g(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new a());
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.u;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        ll9 ll9Var = this.B;
        ml9 ml9Var = this.t;
        Path path = this.y;
        ml9Var.a(ll9Var, null, 1.0f, rectF, null, path);
        Path path2 = this.D;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.v;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.H;
    }

    public final int getContentPaddingEnd() {
        int i = this.J;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.E : this.G;
    }

    public int getContentPaddingLeft() {
        int i = this.J;
        int i2 = this.I;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.E;
    }

    public int getContentPaddingRight() {
        int i = this.J;
        int i2 = this.I;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.G;
    }

    public final int getContentPaddingStart() {
        int i = this.I;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.G : this.E;
    }

    public int getContentPaddingTop() {
        return this.F;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public ll9 getShapeAppearanceModel() {
        return this.B;
    }

    public ColorStateList getStrokeColor() {
        return this.z;
    }

    public float getStrokeWidth() {
        return this.C;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.D, this.x);
        if (this.z == null) {
            return;
        }
        float f = this.C;
        Paint paint = this.w;
        paint.setStrokeWidth(f);
        int colorForState = this.z.getColorForState(getDrawableState(), this.z.getDefaultColor());
        if (this.C <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.y, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.K && isLayoutDirectionResolved()) {
            this.K = true;
            if (!isPaddingRelative() && this.I == Integer.MIN_VALUE && this.J == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.tl9
    public void setShapeAppearanceModel(ll9 ll9Var) {
        this.B = ll9Var;
        kk6 kk6Var = this.A;
        if (kk6Var != null) {
            kk6Var.setShapeAppearanceModel(ll9Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(vz1.b(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.C != f) {
            this.C = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
