package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wn4 extends xn4 {
    public static final Object d = new Object();
    public static final wn4 e = new wn4();
    public vwb c;

    public static AlertDialog d(Activity activity, int i, hwb hwbVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(uvb.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.hwpo_training_app.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.hwpo_training_app.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.hwpo_training_app.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, hwbVar);
        }
        String strA = uvb.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", pp2.a(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof g) {
                l supportFragmentManager = ((g) activity).getSupportFragmentManager();
                p5a p5aVar = new p5a();
                a78.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                p5aVar.J = alertDialog;
                if (onCancelListener != null) {
                    p5aVar.K = onCancelListener;
                }
                p5aVar.o(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        xl3 xl3Var = new xl3();
        a78.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        xl3Var.t = alertDialog;
        if (onCancelListener != null) {
            xl3Var.u = onCancelListener;
        }
        xl3Var.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new xvb(super.a(googleApiActivity, "d", i), googleApiActivity), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        g(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, h76 h76Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new cwb(super.a(activity, "d", i), h76Var), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", pk.d(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new rvb(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? uvb.e(context, "common_google_play_services_resolution_required_title") : uvb.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.hwpo_training_app.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? uvb.d(context, "common_google_play_services_resolution_required_text", uvb.c(context)) : uvb.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        a78.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        uc7 uc7Var = new uc7(context, null);
        uc7Var.o = true;
        uc7Var.c(true);
        uc7Var.e = uc7.b(strE);
        sc7 sc7Var = new sc7();
        sc7Var.e = uc7.b(strD);
        uc7Var.e(sc7Var);
        PackageManager packageManager = context.getPackageManager();
        if (zd6.x == null) {
            zd6.x = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = zd6.x.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            uc7Var.x.icon = i3;
            uc7Var.j = 2;
            if (zd6.d(context)) {
                uc7Var.b.add(new qc7(IconCompat.c(null, BuildConfig.FLAVOR, 2131230912), resources.getString(com.hwpo_training_app.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, true, true, false));
            } else {
                uc7Var.g = pendingIntent;
            }
        } else {
            uc7Var.x.icon = R.drawable.stat_sys_warning;
            uc7Var.x.tickerText = uc7.b(resources.getString(com.hwpo_training_app.R.string.common_google_play_services_notification_ticker));
            uc7Var.x.when = System.currentTimeMillis();
            uc7Var.g = pendingIntent;
            uc7Var.f = uc7.b(strD);
        }
        if (f28.a()) {
            if (!f28.a()) {
                d43.c();
                return;
            }
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.hwpo_training_app.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            uc7Var.s = "com.google.android.gms.availability";
        }
        Notification notificationA = uc7Var.a();
        if (i == 1 || i == 2 || i == 3) {
            co4.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }
}
