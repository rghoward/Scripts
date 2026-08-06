package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bj6 {
    public static TypedValue a(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        return c(context.getTheme(), i, z);
    }

    public static boolean c(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueA = a(theme, i);
        if (typedValueA == null || typedValueA.type != 18) {
            return z;
        }
        return typedValueA.data != 0;
    }

    public static TypedValue d(Context context, String str, int i) {
        TypedValue typedValueA = a(context.getTheme(), i);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
