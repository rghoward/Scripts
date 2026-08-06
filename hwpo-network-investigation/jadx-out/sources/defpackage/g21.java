package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g21 {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final ll9 f;

    public g21(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ll9 ll9Var, Rect rect) {
        b78.c(rect.left);
        b78.c(rect.top);
        b78.c(rect.right);
        b78.c(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = ll9Var;
    }

    public static g21 a(Context context, int i) {
        b78.b("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bh8.o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListB = jk6.b(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListB2 = jk6.b(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListB3 = jk6.b(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ll9 ll9VarA = ll9.f(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new g21(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, ll9VarA, rect);
    }

    public final void b(TextView textView) {
        kk6 kk6Var = new kk6();
        kk6 kk6Var2 = new kk6();
        ll9 ll9Var = this.f;
        kk6Var.setShapeAppearanceModel(ll9Var);
        kk6Var2.setShapeAppearanceModel(ll9Var);
        kk6Var.p(this.c);
        kk6Var.u.j = this.e;
        kk6Var.invalidateSelf();
        kk6.c cVar = kk6Var.u;
        ColorStateList colorStateList = cVar.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            cVar.d = colorStateList2;
            kk6Var.onStateChange(kk6Var.getState());
        }
        ColorStateList colorStateList3 = this.b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), kk6Var, kk6Var2);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
