package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ekb {
    public final a a;
    public final kt4 b;
    public final kt4 c;
    public boolean d;
    public boolean e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Context a;
        public PowerManager.WakeLock b;

        public a(Context context) {
            this.a = context;
        }

        public static void a(a aVar, boolean z, boolean z2) {
            synchronized (aVar) {
                boolean z3 = false;
                if (z) {
                    if (aVar.b == null) {
                        if (aVar.a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                            md6.g("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                            return;
                        }
                        PowerManager powerManager = (PowerManager) aVar.a.getSystemService("power");
                        if (powerManager == null) {
                            md6.g("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                            return;
                        } else {
                            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                            aVar.b = wakeLockNewWakeLock;
                            wakeLockNewWakeLock.setReferenceCounted(false);
                        }
                    }
                }
                PowerManager.WakeLock wakeLock = aVar.b;
                if (wakeLock == null) {
                    return;
                }
                if (z && z2) {
                    z3 = true;
                }
                if (z3) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release();
                }
            }
        }
    }

    public ekb(Context context, Looper looper, z7a z7aVar) {
        this.a = new a(context.getApplicationContext());
        this.b = z7aVar.b(looper, null);
        this.c = z7aVar.b(Looper.getMainLooper(), null);
    }

    public final void a(final boolean z, final boolean z2) {
        kt4 kt4Var = this.b;
        if (z && z2) {
            kt4Var.e(new Runnable() { // from class: akb
                @Override // java.lang.Runnable
                public final void run() {
                    ekb.a.a(this.t.a, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.j(new Runnable() { // from class: bkb
            @Override // java.lang.Runnable
            public final void run() {
                final ekb.a aVar = this.t.a;
                aVar.getClass();
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                if (atomicBoolean2.get()) {
                    new Thread(new Runnable() { // from class: dkb
                        @Override // java.lang.Runnable
                        public final void run() {
                            PowerManager.WakeLock wakeLock;
                            ekb.a aVar2 = aVar;
                            AtomicBoolean atomicBoolean3 = atomicBoolean2;
                            synchronized (aVar2) {
                                if (atomicBoolean3.get() && (wakeLock = aVar2.b) != null) {
                                    wakeLock.release();
                                }
                            }
                        }
                    }, "ExoPlayer:WakeLockManager").start();
                }
            }
        });
        kt4Var.e(new Runnable() { // from class: ckb
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                ekb.a.a(this.t.a, z, z2);
            }
        });
    }

    public final void b(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (this.d) {
            a(true, z);
        }
    }
}
