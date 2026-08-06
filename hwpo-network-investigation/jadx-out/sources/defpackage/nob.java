package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nob implements ServiceConnection {
    public final Context t;
    public final Intent u;
    public final ScheduledThreadPoolExecutor v;
    public final ArrayDeque w;
    public kob x;
    public boolean y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final Intent a;
        public final t9a<Void> b = new t9a<>();

        public a(Intent intent) {
            this.a = intent;
        }
    }

    public nob(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i47("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.w = new ArrayDeque();
        this.y = false;
        Context applicationContext = context.getApplicationContext();
        this.t = applicationContext;
        this.u = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.v = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.w.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                kob kobVar = this.x;
                if (kobVar == null || !kobVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.x.a((a) this.w.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized q6d b(Intent intent) {
        final a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.v;
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: lob
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                    nob.a aVar2 = aVar;
                    sb.append(aVar2.a.getAction());
                    sb.append(" finishing.");
                    Log.w("FirebaseMessaging", sb.toString());
                    aVar2.b.d(null);
                }
            }, 20L, TimeUnit.SECONDS);
            aVar.b.a.c(scheduledThreadPoolExecutor, new fh7() { // from class: mob
                @Override // defpackage.fh7
                public final void b(r9a r9aVar) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
            this.w.add(aVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.b.a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.y);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.y) {
            return;
        }
        this.y = true;
        try {
            if (fx1.b().a(this.t, this.u, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.w;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((a) arrayDeque.poll()).b.d(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.y = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.y = false;
            if (iBinder instanceof kob) {
                this.x = (kob) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.w;
            while (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.poll()).b.d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
