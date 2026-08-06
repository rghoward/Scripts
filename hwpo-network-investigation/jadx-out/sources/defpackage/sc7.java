package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sc7 extends yc7 {
    public CharSequence e;

    @Override // defpackage.yc7
    public final void b(zc7 zc7Var) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(zc7Var.b).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
            bigTextStyleBigText.setSummaryText(this.c);
        }
    }

    @Override // defpackage.yc7
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
