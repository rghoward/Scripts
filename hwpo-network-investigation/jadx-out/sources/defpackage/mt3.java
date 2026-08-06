package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mt3 implements jn3 {
    public final gj8 a;
    public final z9a b;
    public long c;
    public final CopyOnWriteArrayList<fy8.b> d;
    public final BlockingQueue<fy8.a> e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends q9a {
        public final /* synthetic */ fy8.b e;
        public final /* synthetic */ mt3 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, fy8.b bVar, mt3 mt3Var) {
            super(str, true);
            this.e = bVar;
            this.f = mt3Var;
        }

        @Override // defpackage.q9a
        public final long a() throws InterruptedException {
            fy8.a aVar;
            fy8.b bVar = this.e;
            try {
                aVar = bVar.e();
            } catch (Throwable th) {
                aVar = new fy8.a(bVar, null, th, 2);
            }
            mt3 mt3Var = this.f;
            if (!mt3Var.d.contains(bVar)) {
                return -1L;
            }
            mt3Var.e.put(aVar);
            return -1L;
        }
    }

    public mt3(gj8 gj8Var, z9a z9aVar) {
        z9aVar.getClass();
        this.a = gj8Var;
        this.b = z9aVar;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList<>();
        this.e = new LinkedBlockingDeque();
    }

    @Override // defpackage.jn3
    public final pi8 a() throws IOException {
        fy8.a aVarD;
        long j;
        fy8.a aVarPoll;
        gj8 gj8Var = this.a;
        CopyOnWriteArrayList<fy8.b> copyOnWriteArrayList = this.d;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !gj8Var.b(null)) {
                    c();
                    iOException.getClass();
                    throw iOException;
                }
                if (gj8Var.k.K) {
                    throw new IOException("Canceled");
                }
                z9a.a aVar = this.b.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.c - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j2 <= 0) {
                    aVarD = d();
                    j = 250000000;
                    this.c = jNanoTime + 250000000;
                } else {
                    j = j2;
                    aVarD = null;
                }
                if (aVarD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (aVarPoll = this.e.poll(j, timeUnit)) == null) {
                        aVarD = null;
                    } else {
                        copyOnWriteArrayList.remove(aVarPoll.a);
                        aVarD = aVarPoll;
                    }
                    if (aVarD == null) {
                    }
                }
                fy8.b bVar = aVarD.a;
                boolean z = false;
                if (aVarD.b == null && aVarD.c == null) {
                    c();
                    if (!bVar.b()) {
                        aVarD = bVar.g();
                    }
                    if (aVarD.b == null && aVarD.c == null) {
                        z = true;
                    }
                    if (z) {
                        pi8 pi8VarD = aVarD.a.d();
                        c();
                        return pi8VarD;
                    }
                }
                Throwable th = aVarD.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        fn3.b(iOException, th);
                    }
                }
                fy8.b bVar2 = aVarD.b;
                if (bVar2 != null) {
                    gj8Var.p.addFirst(bVar2);
                }
            } catch (Throwable th2) {
                c();
                throw th2;
            }
        }
    }

    @Override // defpackage.jn3
    public final fy8 b() {
        return this.a;
    }

    public final void c() {
        CopyOnWriteArrayList<fy8.b> copyOnWriteArrayList = this.d;
        Iterator<fy8.b> it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            fy8.b next = it.next();
            next.cancel();
            fy8.b bVarC = next.c();
            if (bVarC != null) {
                this.a.p.addLast(bVarC);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final fy8.a d() {
        fy8.b it3Var;
        gj8 gj8Var = this.a;
        if (gj8Var.b(null)) {
            try {
                it3Var = gj8Var.d();
            } catch (Throwable th) {
                it3Var = new it3(th);
            }
            if (it3Var.b()) {
                return new fy8.a(it3Var, null, null, 6);
            }
            if (it3Var instanceof it3) {
                return ((it3) it3Var).a;
            }
            this.d.add(it3Var);
            this.b.d().d(new a(ytb.b + " connect " + gj8Var.i.i.h(), it3Var, this), 0L);
        }
        return null;
    }
}
