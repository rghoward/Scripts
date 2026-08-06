package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oi8 implements o21, Cloneable {
    public Object A;
    public jn3 B;
    public pi8 C;
    public boolean D;
    public gn3 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public volatile boolean K;
    public volatile gn3 L;
    public final CopyOnWriteArrayList<fy8.b> M;
    public final lg7 t;
    public final jp8 u;
    public final boolean v;
    public final ri8 w;
    public final om3 x;
    public final c y;
    public final AtomicBoolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements Runnable {
        public final v21 t;
        public volatile AtomicInteger u = new AtomicInteger(0);

        public a(v21 v21Var) {
            this.t = v21Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g23 g23Var;
            String str = "OkHttp " + oi8.this.u.a.h();
            oi8 oi8Var = oi8.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                oi8Var.y.i();
                boolean z = false;
                try {
                    try {
                        try {
                            this.t.onResponse(oi8Var, oi8Var.e());
                            g23Var = oi8Var.t.a;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                okhttp3.internal.platform.c cVar = okhttp3.internal.platform.c.a;
                                okhttp3.internal.platform.c.a.j("Callback failure for ".concat(oi8.a(oi8Var)), 4, e);
                            } else {
                                this.t.onFailure(oi8Var, e);
                            }
                            g23Var = oi8Var.t.a;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            oi8Var.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.t.onFailure(oi8Var, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            g23Var = oi8Var.t.a;
                        }
                    } catch (Throwable th2) {
                        g23 g23Var2 = oi8Var.t.a;
                        g23Var2.getClass();
                        g23.c(g23Var2, null, null, this, 3);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                g23Var.getClass();
                g23.c(g23Var, null, null, this, 3);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends WeakReference<oi8> {
        public final Object a;

        public b(oi8 oi8Var, Object obj) {
            super(oi8Var);
            this.a = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends o50 {
        public c() {
        }

        @Override // defpackage.o50
        public final void l() {
            oi8.this.cancel();
        }
    }

    public oi8(lg7 lg7Var, jp8 jp8Var, boolean z) {
        lg7Var.getClass();
        jp8Var.getClass();
        this.t = lg7Var;
        this.u = jp8Var;
        this.v = z;
        this.w = lg7Var.E.a;
        this.x = lg7Var.d.a;
        c cVar = new c();
        cVar.g(0L, TimeUnit.MILLISECONDS);
        this.y = cVar;
        this.z = new AtomicBoolean();
        this.J = true;
        this.M = new CopyOnWriteArrayList<>();
        new AtomicReference(jp8Var.e);
    }

    public static final String a(oi8 oi8Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(oi8Var.K ? "canceled " : BuildConfig.FLAVOR);
        sb.append(oi8Var.v ? "web socket" : "call");
        sb.append(" to ");
        sb.append(oi8Var.u.a.h());
        return sb.toString();
    }

    public final void b(pi8 pi8Var) {
        pi8Var.getClass();
        TimeZone timeZone = ytb.a;
        if (this.C != null) {
            aa0.c("Check failed.");
        } else {
            this.C = pi8Var;
            pi8Var.q.add(new b(this, this.A));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketH;
        TimeZone timeZone = ytb.a;
        pi8 pi8Var = this.C;
        if (pi8Var != null) {
            synchronized (pi8Var) {
                socketH = h();
            }
            if (this.C == null) {
                if (socketH != null) {
                    ytb.c(socketH);
                }
                this.x.getClass();
                pi8Var.i.getClass();
                if (socketH != null) {
                    pi8Var.i.getClass();
                }
            } else if (socketH != null) {
                aa0.c("Check failed.");
                return null;
            }
        }
        if (!this.D && this.y.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        om3 om3Var = this.x;
        if (iOException == null) {
            om3Var.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        om3Var.getClass();
        return interruptedIOException;
    }

    @Override // defpackage.o21
    public final void cancel() {
        if (this.K) {
            return;
        }
        this.K = true;
        gn3 gn3Var = this.L;
        if (gn3Var != null) {
            gn3Var.d.cancel();
        }
        Iterator<fy8.b> it = this.M.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.x.getClass();
    }

    public final Object clone() {
        return new oi8(this.t, this.u, this.v);
    }

    public final void d(boolean z) {
        gn3 gn3Var;
        synchronized (this) {
            if (!this.J) {
                throw new IllegalStateException("released");
            }
            g2b g2bVar = g2b.a;
        }
        if (z && (gn3Var = this.L) != null) {
            gn3Var.d.cancel();
            gn3Var.a.f(gn3Var, true, true, true, true, null);
        }
        this.E = null;
    }

    public final qu8 e() {
        ArrayList arrayList = new ArrayList();
        rh1.o(this.t.b, arrayList);
        arrayList.add(new nv8(this.t));
        arrayList.add(new vv0(this.t.j));
        arrayList.add(new t01(this.t.k));
        arrayList.add(tw1.a);
        if (!this.v) {
            rh1.o(this.t.c, arrayList);
        }
        arrayList.add(r21.a);
        jp8 jp8Var = this.u;
        lg7 lg7Var = this.t;
        try {
            try {
                qu8 qu8VarA = new aj8(this, arrayList, 0, null, jp8Var, lg7Var.x, lg7Var.y, lg7Var.z).a(this.u);
                if (this.K) {
                    vtb.b(qu8VarA);
                    throw new IOException("Canceled");
                }
                g(null);
                return qu8VarA;
            } catch (IOException e) {
                IOException iOExceptionG = g(e);
                iOExceptionG.getClass();
                throw iOExceptionG;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                g(null);
            }
            throw th;
        }
    }

    @Override // defpackage.o21
    public final qu8 execute() {
        if (!this.z.compareAndSet(false, true)) {
            aa0.c("Already Executed");
            return null;
        }
        this.y.i();
        okhttp3.internal.platform.c cVar = okhttp3.internal.platform.c.a;
        this.A = okhttp3.internal.platform.c.a.h();
        this.x.getClass();
        try {
            g23 g23Var = this.t.a;
            synchronized (g23Var) {
                g23Var.f.add(this);
            }
            qu8 qu8VarE = e();
            g23 g23Var2 = this.t.a;
            g23Var2.getClass();
            g23.c(g23Var2, null, this, null, 5);
            return qu8VarE;
        } catch (Throwable th) {
            g23 g23Var3 = this.t.a;
            g23Var3.getClass();
            g23.c(g23Var3, null, this, null, 5);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002e A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002e, B:25:0x0032, B:27:0x0036, B:29:0x003a, B:30:0x003c, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001c, B:17:0x0022, B:20:0x0028), top: B:64:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002e, B:25:0x0032, B:27:0x0036, B:29:0x003a, B:30:0x003c, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001c, B:17:0x0022, B:20:0x0028), top: B:64:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002e, B:25:0x0032, B:27:0x0036, B:29:0x003a, B:30:0x003c, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001c, B:17:0x0022, B:20:0x0028), top: B:64:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x003a A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002e, B:25:0x0032, B:27:0x0036, B:29:0x003a, B:30:0x003c, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001c, B:17:0x0022, B:20:0x0028), top: B:64:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004e  */
    public final IOException f(gn3 gn3Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        gn3Var.getClass();
        if (gn3Var.equals(this.L)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.F) {
                            if (z) {
                                this.F = false;
                            }
                            if (z2) {
                                this.G = false;
                            }
                            if (z4) {
                                this.H = false;
                            }
                            if (z3) {
                                this.I = false;
                            }
                            if (this.F) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.G) || ((z4 && this.H) || (z3 && this.I))) {
                            if (z) {
                                this.F = false;
                            }
                            if (z2) {
                                this.G = false;
                            }
                            if (z4) {
                                this.H = false;
                            }
                            if (z3) {
                                this.I = false;
                            }
                            if (this.F || this.G || this.H || this.I) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.J) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                    g2b g2bVar2 = g2b.a;
                }
            }
            if (z5) {
                this.L = null;
                pi8 pi8Var = this.C;
                if (pi8Var != null) {
                    synchronized (pi8Var) {
                        pi8Var.n++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.J) {
                    this.J = false;
                    if (!this.F && !this.G && !this.H && !this.I) {
                        z = true;
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket h() {
        pi8 pi8Var = this.C;
        pi8Var.getClass();
        TimeZone timeZone = ytb.a;
        ArrayList arrayList = pi8Var.q;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (xj5.a(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            aa0.c("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.C = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        pi8Var.r = System.nanoTime();
        ri8 ri8Var = this.w;
        ConcurrentLinkedQueue<pi8> concurrentLinkedQueue = ri8Var.e;
        y9a y9aVar = ri8Var.c;
        TimeZone timeZone2 = ytb.a;
        if (!pi8Var.k) {
            y9aVar.d(ri8Var.d, 0L);
            return null;
        }
        pi8Var.k = true;
        concurrentLinkedQueue.remove(pi8Var);
        if (concurrentLinkedQueue.isEmpty()) {
            y9aVar.a();
        }
        return pi8Var.e;
    }

    @Override // defpackage.o21
    public final boolean isCanceled() {
        return this.K;
    }

    @Override // defpackage.o21
    public final boolean isExecuted() {
        return this.z.get();
    }

    @Override // defpackage.o21
    public final void k(v21 v21Var) {
        if (!this.z.compareAndSet(false, true)) {
            aa0.c("Already Executed");
            return;
        }
        okhttp3.internal.platform.c cVar = okhttp3.internal.platform.c.a;
        this.A = okhttp3.internal.platform.c.a.h();
        this.x.getClass();
        g23 g23Var = this.t.a;
        a aVar = new a(v21Var);
        g23Var.getClass();
        g23.c(g23Var, aVar, null, null, 6);
    }

    @Override // defpackage.o21
    public final jp8 request() {
        return this.u;
    }

    @Override // defpackage.o21
    public final c timeout() {
        return this.y;
    }
}
