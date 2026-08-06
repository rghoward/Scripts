package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tc7 {
    public PendingIntent a;
    public IconCompat b;
    public int c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static Notification.BubbleMetadata a(tc7 tc7Var) {
            if (tc7Var == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(tc7Var.b.h(null)).setIntent(tc7Var.a).setDeleteIntent(null).setAutoExpandBubble((tc7Var.d & 1) != 0).setSuppressNotification((tc7Var.d & 2) != 0);
            int i = tc7Var.c;
            if (i != 0) {
                suppressNotification.setDesiredHeight(i);
            }
            return suppressNotification.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static Notification.BubbleMetadata a(tc7 tc7Var) {
            if (tc7Var == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(tc7Var.a, tc7Var.b.h(null));
            builder.setDeleteIntent(null).setAutoExpandBubble((tc7Var.d & 1) != 0).setSuppressNotification((tc7Var.d & 2) != 0);
            int i = tc7Var.c;
            if (i != 0) {
                builder.setDesiredHeight(i);
            }
            return builder.build();
        }
    }
}
