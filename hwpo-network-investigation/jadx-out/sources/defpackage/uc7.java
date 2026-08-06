package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uc7 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public yc7 l;
    public String m;
    public boolean n;
    public Bundle p;
    public String s;
    public String t;
    public ld6 u;
    public final boolean v;
    public tc7 w;
    public final Notification x;
    public boolean y;

    @Deprecated
    public final ArrayList<String> z;
    public final ArrayList<qc7> b = new ArrayList<>();
    public final ArrayList<ox7> c = new ArrayList<>();
    public final ArrayList<qc7> d = new ArrayList<>();
    public boolean k = true;
    public boolean o = false;
    public int q = 0;
    public int r = 0;

    public uc7(Context context, String str) {
        Notification notification = new Notification();
        this.x = notification;
        this.a = context;
        this.s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.z = new ArrayList<>();
        this.v = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        zc7 zc7Var = new zc7(this);
        uc7 uc7Var = zc7Var.c;
        yc7 yc7Var = uc7Var.l;
        if (yc7Var != null) {
            yc7Var.b(zc7Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = zc7Var.b;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            int i2 = zc7Var.e;
            if (i2 != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && i2 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && i2 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (yc7Var != null) {
            uc7Var.l.getClass();
        }
        if (yc7Var != null && (bundle = notificationBuild.extras) != null) {
            yc7Var.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(boolean z) {
        Notification notification = this.x;
        if (z) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompatB;
        if (bitmap == null) {
            iconCompatB = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatB = IconCompat.b(bitmap);
        }
        this.h = iconCompatB;
    }

    public final void e(yc7 yc7Var) {
        if (this.l != yc7Var) {
            this.l = yc7Var;
            if (yc7Var == null || yc7Var.a == this) {
                return;
            }
            yc7Var.a = this;
            e(yc7Var);
        }
    }
}
