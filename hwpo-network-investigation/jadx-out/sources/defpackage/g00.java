package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g00 extends a00 {
    public final f00 d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public g00(f00 f00Var) {
        super(f00Var);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = f00Var;
    }

    @Override // defpackage.a00
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        f00 f00Var = this.d;
        Context context = f00Var.getContext();
        int[] iArr = ph8.g;
        gpa gpaVarE = gpa.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = gpaVarE.b;
        egb.n(f00Var, f00Var.getContext(), iArr, attributeSet, gpaVarE.b, R.attr.seekBarStyle);
        Drawable drawableC = gpaVarE.c(0);
        if (drawableC != null) {
            f00Var.setThumb(drawableC);
        }
        Drawable drawableB = gpaVarE.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(f00Var);
            drawableB.setLayoutDirection(f00Var.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(f00Var.getDrawableState());
            }
            c();
        }
        f00Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = d83.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = gpaVarE.a(2);
            this.h = true;
        }
        gpaVarE.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            f00 f00Var = this.d;
            int max = f00Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((f00Var.getWidth() - f00Var.getPaddingLeft()) - f00Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(f00Var.getPaddingLeft(), f00Var.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
