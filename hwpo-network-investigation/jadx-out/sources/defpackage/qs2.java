package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 {
    public final Context a;
    public final cd7 b;

    public qs2(Context context) {
        this.a = context;
        this.b = new cd7(context);
    }

    public final boolean a() {
        return this.b.b.areNotificationsEnabled();
    }

    public final void b() {
        this.b.b.cancelAll();
    }

    public final void c(dd7 dd7Var) {
        NotificationManager notificationManager;
        int i = dd7Var.a;
        if (a()) {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.a;
            if (i2 >= 26 && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null && notificationManager.getNotificationChannel("com.hwpo_training_app.HWPO_CLIENT_CHANNEL_ID") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.hwpo_training_app.HWPO_CLIENT_CHANNEL_ID", "HWPO Client", 3));
            }
            uc7 uc7Var = new uc7(context, "com.hwpo_training_app.HWPO_CLIENT_CHANNEL_ID");
            Notification notification = uc7Var.x;
            notification.icon = R.drawable.ic_hwpo_notification;
            uc7Var.e = uc7.b(dd7Var.b);
            uc7Var.f = uc7.b(dd7Var.c);
            uc7Var.g = dd7Var.d;
            uc7Var.c(true);
            uc7Var.j = 1;
            notification.defaults = 2;
            if (i2 < 33) {
                new cd7(context).b(i, uc7Var.a());
            } else if (context.getPackageManager().checkPermission("android.permission.POST_NOTIFICATIONS", context.getPackageName()) == 0) {
                new cd7(context).b(i, uc7Var.a());
            }
        }
    }
}
