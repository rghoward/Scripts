package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class djb extends cjb {
    public static boolean g = true;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static void a(int i, View view) {
            view.setTransitionVisibility(i);
        }
    }

    public void f(int i, View view) {
        if (Build.VERSION.SDK_INT != 28) {
            if (g) {
                try {
                    a.a(i, view);
                    return;
                } catch (NoSuchMethodError unused) {
                    g = false;
                    return;
                }
            }
            return;
        }
        if (!ajb.c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                ajb.b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            ajb.c = true;
        }
        Field field = ajb.b;
        if (field != null) {
            try {
                ajb.b.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }
}
