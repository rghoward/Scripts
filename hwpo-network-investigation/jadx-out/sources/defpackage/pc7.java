package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pc7 {
    public final String a;
    public String b;
    public final int c;
    public String d;
    public final Uri e = Settings.System.DEFAULT_NOTIFICATION_URI;
    public final AudioAttributes f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static NotificationChannel a(int i, CharSequence charSequence, String str) {
            return new NotificationChannel(str, charSequence, i);
        }

        public static void b(NotificationChannel notificationChannel) {
            notificationChannel.enableLights(false);
        }

        public static void c(NotificationChannel notificationChannel) {
            notificationChannel.enableVibration(false);
        }

        public static void d(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void e(NotificationChannel notificationChannel) {
            notificationChannel.setGroup(null);
        }

        public static void f(NotificationChannel notificationChannel) {
            notificationChannel.setLightColor(0);
        }

        public static void g(NotificationChannel notificationChannel) {
            notificationChannel.setShowBadge(true);
        }

        public static void h(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void i(NotificationChannel notificationChannel) {
            notificationChannel.setVibrationPattern(null);
        }
    }

    public pc7(String str) {
        str.getClass();
        this.a = str;
        this.c = 4;
        this.f = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
