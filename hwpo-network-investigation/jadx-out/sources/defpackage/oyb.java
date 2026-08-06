package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oyb extends l4c {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f;
    public static final AtomicLong g;
    public static final ConcurrentLinkedQueue h;
    public volatile l4c b;

    static {
        String str = Build.FINGERPRINT;
        c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        e = "eng".equals(str3) || "userdebug".equals(str3);
        f = new AtomicReference();
        g = new AtomicLong();
        h = new ConcurrentLinkedQueue();
    }

    public static void u() {
        while (true) {
            nyb nybVar = (nyb) h.poll();
            if (nybVar == null) {
                return;
            }
            g.getAndDecrement();
            oyb oybVar = nybVar.a;
            p8d p8dVar = nybVar.b;
            o8d o8dVar = p8dVar.c;
            if ((o8dVar != null && Boolean.TRUE.equals(o8dVar.g1(n8d.g))) || oybVar.m(p8dVar.a)) {
                oybVar.o(p8dVar);
            }
        }
    }

    @Override // defpackage.l4c
    public final boolean m(Level level) {
        return this.b == null || this.b.m(level);
    }

    @Override // defpackage.l4c
    public final void o(p8d p8dVar) {
        if (this.b != null) {
            this.b.o(p8dVar);
            return;
        }
        if (g.incrementAndGet() > 20) {
            h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        h.offer(new nyb(this, p8dVar));
        if (this.b != null) {
            u();
        }
    }

    @Override // defpackage.l4c
    public final void q(RuntimeException runtimeException, p8d p8dVar) {
        if (this.b != null) {
            this.b.q(runtimeException, p8dVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
