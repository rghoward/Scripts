package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class z9a {
    public static final Logger k;
    public static final z9a l;
    public final a a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final aaa j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ThreadPoolExecutor a;

        public a(xtb xtbVar) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), xtbVar);
        }
    }

    static {
        Logger logger = Logger.getLogger(z9a.class.getName());
        logger.getClass();
        k = logger;
        l = new z9a(new a(new xtb(av.a(new StringBuilder(), ytb.b, " TaskRunner"), true)));
    }

    public z9a(a aVar) {
        Logger logger = k;
        logger.getClass();
        this.a = aVar;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new aaa(this);
    }

    public static final void a(z9a z9aVar, q9a q9aVar, long j, boolean z) {
        TimeZone timeZone = ytb.a;
        y9a y9aVar = q9aVar.c;
        y9aVar.getClass();
        if (y9aVar.d != q9aVar) {
            aa0.c("Check failed.");
            return;
        }
        boolean z2 = y9aVar.f;
        y9aVar.f = false;
        y9aVar.d = null;
        z9aVar.h.remove(y9aVar);
        if (j != -1 && !z2 && !y9aVar.c) {
            y9aVar.f(q9aVar, j, true);
        }
        if (y9aVar.e.isEmpty()) {
            return;
        }
        z9aVar.i.add(y9aVar);
        if (z) {
            return;
        }
        z9aVar.e();
    }

    public final q9a b() {
        long j;
        q9a q9aVar;
        boolean z;
        TimeZone timeZone = ytb.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            q9a q9aVar2 = null;
            while (true) {
                if (i >= size) {
                    j = jNanoTime;
                    q9aVar = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                q9a q9aVar3 = (q9a) ((y9a) obj).e.get(0);
                j = jNanoTime;
                q9aVar = null;
                long jMax = Math.max(0L, q9aVar3.d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (q9aVar2 != null) {
                        z = true;
                        break;
                    }
                    q9aVar2 = q9aVar3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.h;
            if (q9aVar2 != null) {
                TimeZone timeZone2 = ytb.a;
                q9aVar2.d = -1L;
                y9a y9aVar = q9aVar2.c;
                y9aVar.getClass();
                y9aVar.e.remove(q9aVar2);
                arrayList.remove(y9aVar);
                y9aVar.d = q9aVar2;
                arrayList2.add(y9aVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return q9aVar2;
            }
            if (this.d) {
                if (jMin >= this.e - j) {
                    return q9aVar;
                }
                notify();
                return q9aVar;
            }
            this.d = true;
            this.e = j + jMin;
            try {
                try {
                    TimeZone timeZone3 = ytb.a;
                    if (jMin > 0) {
                        long j2 = jMin / 1000000;
                        long j3 = jMin - (1000000 * j2);
                        if (j2 > 0 || jMin > 0) {
                            wait(j2, (int) j3);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = ytb.a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((y9a) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        y9a y9aVar2 = (y9a) arrayList.get(size3);
                        y9aVar2.b();
                        if (y9aVar2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.d = false;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    public final void c(y9a y9aVar) {
        y9aVar.getClass();
        TimeZone timeZone = ytb.a;
        if (y9aVar.d == null) {
            boolean zIsEmpty = y9aVar.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(y9aVar);
            } else {
                byte[] bArr = vtb.a;
                arrayList.getClass();
                if (!arrayList.contains(y9aVar)) {
                    arrayList.add(y9aVar);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final y9a d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new y9a(this, pp2.a(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = ytb.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        aaa aaaVar = this.j;
        aaaVar.getClass();
        this.a.a.execute(aaaVar);
    }
}
