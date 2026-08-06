package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q5d {
    public static q5d e;
    public final Context a;
    public final ScheduledExecutorService b;
    public bzc c = new bzc(this);
    public int d = 1;

    public q5d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized q5d a(Context context) {
        try {
            if (e == null) {
                e = new q5d(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new i47("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final synchronized q6d b(u2d u2dVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(u2dVar.toString()));
            }
            if (!this.c.d(u2dVar)) {
                bzc bzcVar = new bzc(this);
                this.c = bzcVar;
                bzcVar.d(u2dVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return u2dVar.b.a;
    }
}
