package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y9a {
    public final z9a a;
    public final String b;
    public boolean c;
    public q9a d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public y9a(z9a z9aVar, String str) {
        this.a = z9aVar;
        this.b = str;
    }

    public static void c(y9a y9aVar, String str, long j, mh4 mh4Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        y9aVar.getClass();
        str.getClass();
        mh4Var.getClass();
        y9aVar.d(new w9a(str, z, mh4Var), j);
    }

    public final void a() {
        z9a z9aVar = this.a;
        TimeZone timeZone = ytb.a;
        synchronized (z9aVar) {
            try {
                if (b()) {
                    this.a.c(this);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        q9a q9aVar = this.d;
        if (q9aVar != null && q9aVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((q9a) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                q9a q9aVar2 = (q9a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    d18.a(logger, q9aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(q9a q9aVar, long j) {
        q9aVar.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (f(q9aVar, j, false)) {
                    this.a.c(this);
                }
                g2b g2bVar = g2b.a;
                return;
            }
            boolean z = q9aVar.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    d18.a(logger, q9aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    d18.a(logger, q9aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[LOOP:0: B:23:0x0063->B:27:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[EDGE_INSN: B:39:0x0079->B:29:0x0079 BREAK  A[LOOP:0: B:23:0x0063->B:27:0x0075], SYNTHETIC] */
    public final boolean f(q9a q9aVar, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        Logger logger = this.a.b;
        q9aVar.getClass();
        y9a y9aVar = q9aVar.c;
        if (y9aVar != this) {
            if (y9aVar != null) {
                aa0.c("task is in multiple queues");
                return false;
            }
            q9aVar.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(q9aVar);
        if (iIndexOf == -1) {
            q9aVar.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(d18.b(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(d18.b(j2 - jNanoTime));
                }
                d18.a(logger, q9aVar, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((q9a) obj).d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, q9aVar);
            if (size2 == 0) {
                return true;
            }
        } else if (q9aVar.d > j2) {
            arrayList.remove(iIndexOf);
            q9aVar.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(d18.b(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(d18.b(j2 - jNanoTime));
                }
                d18.a(logger, q9aVar, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((q9a) obj).d - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, q9aVar);
            if (size2 == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            d18.a(logger, q9aVar, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void g() {
        z9a z9aVar = this.a;
        TimeZone timeZone = ytb.a;
        synchronized (z9aVar) {
            try {
                this.c = true;
                if (b()) {
                    this.a.c(this);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
