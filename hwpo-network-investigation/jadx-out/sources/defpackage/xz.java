package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xz {
    public final ImageView a;
    public epa b;
    public int c = 0;

    public xz(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        epa epaVar;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            d83.a(drawable);
        }
        if (drawable == null || (epaVar = this.b) == null) {
            return;
        }
        tz.e(drawable, epaVar, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = ph8.f;
        gpa gpaVarE = gpa.e(context, attributeSet, iArr, i);
        TypedArray typedArray = gpaVarE.b;
        egb.n(imageView, imageView.getContext(), iArr, attributeSet, gpaVarE.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = e00.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                d83.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(gpaVarE.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(d83.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            gpaVarE.f();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable drawableB = e00.b(imageView.getContext(), i);
            if (drawableB != null) {
                d83.a(drawableB);
            }
            imageView.setImageDrawable(drawableB);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
