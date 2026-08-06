package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v8c {
    public static volatile hbc d;
    public final enc a;
    public final t8c b;
    public volatile long c;

    public v8c(enc encVar) {
        a78.g(encVar);
        this.a = encVar;
        this.b = new t8c(this, encVar);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            enc encVar = this.a;
            encVar.c().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            encVar.b().f.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        hbc hbcVar;
        if (d != null) {
            return d;
        }
        synchronized (v8c.class) {
            try {
                if (d == null) {
                    d = new hbc(this.a.f().getMainLooper());
                }
                hbcVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hbcVar;
    }
}
