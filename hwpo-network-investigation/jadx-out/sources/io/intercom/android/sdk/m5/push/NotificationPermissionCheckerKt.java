package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import com.intercom.twig.Twig;
import defpackage.cd7;
import defpackage.vz1;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(Context context, int i, Notification notification, Twig twig) {
        context.getClass();
        notification.getClass();
        twig.getClass();
        Map mapSingletonMap = Collections.singletonMap(Integer.valueOf(i), notification);
        mapSingletonMap.getClass();
        showNotifications(context, mapSingletonMap, twig);
    }

    public static final void showNotifications(Context context, Map<Integer, ? extends Notification> map, Twig twig) {
        context.getClass();
        map.getClass();
        twig.getClass();
        try {
            cd7 cd7Var = new cd7(context);
            if (Build.VERSION.SDK_INT >= 33 && vz1.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            for (Map.Entry<Integer, ? extends Notification> entry : map.entrySet()) {
                cd7Var.b(entry.getKey().intValue(), entry.getValue());
            }
        } catch (NullPointerException e) {
            twig.w("Failed to show notifications due to unavailable NotificationManager service.", e);
        } catch (Exception e2) {
            twig.w("Failed to show notifications due to unexpected error.", e2);
        }
    }
}
