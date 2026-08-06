package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gpa {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public gpa(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static gpa e(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new gpa(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = vz1.b(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : e00.b(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableE;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        tz tzVarA = tz.a();
        Context context = this.a;
        synchronized (tzVarA) {
            drawableE = tzVarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public final Typeface d(int i, int i2, k00.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = iu8.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return iu8.b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    public final void f() {
        this.b.recycle();
    }
}
