package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ScreenUtils {
    public static int dpToPx(float f, Context context) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static Point getScreenDimensions(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }
}
