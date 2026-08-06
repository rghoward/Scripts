package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n21 {
    public final g21 a;
    public final g21 b;
    public final g21 c;
    public final g21 d;
    public final g21 e;
    public final g21 f;
    public final g21 g;

    public n21(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(bj6.d(context, rj6.class.getCanonicalName(), R.attr.materialCalendarStyle).data, bh8.n);
        this.a = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListB = jk6.b(context, typedArrayObtainStyledAttributes, 7);
        this.d = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = g21.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
