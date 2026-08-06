package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o23 {
    public final ExecutorService a;
    public final FirebaseMessagingService b;
    public final fd7 c;

    public o23(FirebaseMessagingService firebaseMessagingService, fd7 fd7Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = firebaseMessagingService;
        this.c = fd7Var;
    }

    public final boolean a() {
        final v75 v75Var;
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strE = this.c.e("gcm.n.image");
        if (TextUtils.isEmpty(strE)) {
            v75Var = null;
        } else {
            try {
                v75Var = new v75(new URL(strE));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strE);
                v75Var = null;
            }
        }
        if (v75Var != null) {
            ExecutorService executorService = this.a;
            final t9a t9aVar = new t9a();
            v75Var.u = executorService.submit(new Runnable() { // from class: u75
                @Override // java.lang.Runnable
                public final void run() {
                    v75 v75Var2 = v75Var;
                    t9a t9aVar2 = t9aVar;
                    try {
                        t9aVar2.b(v75Var2.h());
                    } catch (Exception e) {
                        t9aVar2.a(e);
                    }
                }
            });
            v75Var.v = t9aVar.a;
        }
        oo1.a aVarA = oo1.a(this.b, this.c);
        uc7 uc7Var = aVarA.a;
        if (v75Var != null) {
            try {
                q6d q6dVar = v75Var.v;
                a78.g(q6dVar);
                Bitmap bitmap = (Bitmap) caa.b(q6dVar, 5L, TimeUnit.SECONDS);
                uc7Var.d(bitmap);
                rc7 rc7Var = new rc7();
                rc7Var.e = bitmap == null ? null : IconCompat.b(bitmap);
                rc7Var.f = null;
                rc7Var.g = true;
                uc7Var.e(rc7Var);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                v75Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                v75Var.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVarA.b, 0, aVarA.a.a());
        return true;
    }
}
