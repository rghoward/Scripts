package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class bjb extends ajb {
    public static boolean d = true;
    public static boolean e = true;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static void a(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    public void c(View view, Matrix matrix) {
        if (d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void d(View view, Matrix matrix) {
        if (e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
