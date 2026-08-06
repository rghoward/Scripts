package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g53 {
    public static final g53 a = new g53();

    public static int a(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueD = bj6.d(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = typedValueD.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueD.data;
    }

    public static Integer b(Context context, int i) {
        TypedValue typedValueA = bj6.a(context.getTheme(), i);
        if (typedValueA == null) {
            return null;
        }
        int i2 = typedValueA.resourceId;
        return Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValueA.data);
    }

    public static boolean c(int i) {
        return i != 0 && vi1.c(i) > 0.5d;
    }

    public static int d(int i, float f, int i2) {
        return vi1.e(vi1.h(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
