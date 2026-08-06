package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class i45 implements qv9 {
    public final int a;
    public final c45 b;
    public final kmb c;
    public long d;
    public long e;
    public final ArrayDeque<nu4> f;
    public boolean g;
    public final b h;
    public final a i;
    public final c j;
    public final c k;
    public ul3 l;
    public IOException m;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements yq9 {
        public final boolean t;
        public final tx0 u = new tx0();
        public boolean v;

        public a(boolean z) {
            this.t = z;
        }

        @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            i45 i45Var = i45.this;
            TimeZone timeZone = ytb.a;
            synchronized (i45Var) {
                if (this.v) {
                    return;
                }
                boolean z = i45Var.h() == null;
                g2b g2bVar = g2b.a;
                i45 i45Var2 = i45.this;
                if (!i45Var2.i.t) {
                    if (this.u.u > 0) {
                        while (this.u.u > 0) {
                            h(true);
                        }
                    } else if (z) {
                        i45Var2.b.u(i45Var2.a, true, null, 0L);
                    }
                }
                i45 i45Var3 = i45.this;
                synchronized (i45Var3) {
                    this.v = true;
                    i45Var3.notifyAll();
                    g2b g2bVar2 = g2b.a;
                }
                i45.this.b.flush();
                i45.this.c();
            }
        }

        @Override // defpackage.yq9, java.io.Flushable
        public final void flush() throws IOException {
            i45 i45Var = i45.this;
            TimeZone timeZone = ytb.a;
            synchronized (i45Var) {
                i45Var.d();
                g2b g2bVar = g2b.a;
            }
            while (this.u.u > 0) {
                h(false);
                i45.this.b.flush();
            }
        }

        public final void h(boolean z) throws IOException {
            long jMin;
            boolean z2;
            i45 i45Var = i45.this;
            synchronized (i45Var) {
                try {
                    i45Var.k.i();
                    while (i45Var.d >= i45Var.e && !this.t && !this.v && i45Var.h() == null) {
                        try {
                            try {
                                i45Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        } catch (Throwable th) {
                            i45Var.k.m();
                            throw th;
                        }
                    }
                    i45Var.k.m();
                    i45Var.d();
                    jMin = Math.min(i45Var.e - i45Var.d, this.u.u);
                    i45Var.d += jMin;
                    z2 = z && jMin == this.u.u;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i45.this.k.i();
            try {
                i45 i45Var2 = i45.this;
                i45Var2.b.u(i45Var2.a, z2, this.u, jMin);
            } finally {
                i45.this.k.m();
            }
        }

        @Override // defpackage.yq9
        public final void i0(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            TimeZone timeZone = ytb.a;
            tx0 tx0Var2 = this.u;
            tx0Var2.i0(tx0Var, j);
            while (tx0Var2.u >= 16384) {
                h(false);
            }
        }

        @Override // defpackage.yq9
        public final voa timeout() {
            return i45.this.k;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements kw9 {
        public final long t;
        public boolean u;
        public final tx0 v = new tx0();
        public final tx0 w = new tx0();
        public boolean x;

        public b(long j, boolean z) {
            this.t = j;
            this.u = z;
        }

        @Override // defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws Throwable {
            boolean z;
            Throwable v1aVar;
            long j2;
            long jO;
            tx0Var.getClass();
            long j3 = 0;
            if (j < 0) {
                ca0.a(d43.b(j, "byteCount < 0: "));
                return 0L;
            }
            while (true) {
                i45 i45Var = i45.this;
                synchronized (i45Var) {
                    i45Var.b.getClass();
                    a aVar = i45Var.i;
                    z = true;
                    boolean z2 = aVar.v || aVar.t;
                    if (z2) {
                        i45Var.j.i();
                    }
                    try {
                        if (i45Var.h() == null || this.u) {
                            v1aVar = null;
                        } else {
                            v1aVar = i45Var.m;
                            if (v1aVar == null) {
                                ul3 ul3VarH = i45Var.h();
                                ul3VarH.getClass();
                                v1aVar = new v1a(ul3VarH);
                            }
                        }
                        if (this.x) {
                            throw new IOException("stream closed");
                        }
                        tx0 tx0Var2 = this.w;
                        long j4 = tx0Var2.u;
                        if (j4 > j3) {
                            jO = tx0Var2.O(tx0Var, Math.min(j, j4));
                            kmb.b(i45Var.c, jO, 0L, 2);
                            long jA = i45Var.c.a();
                            if (v1aVar == null) {
                                j2 = j3;
                                if (jA >= i45Var.b.J.a() / 2) {
                                    i45Var.b.y(i45Var.a, jA);
                                    kmb.b(i45Var.c, 0L, jA, 1);
                                }
                            } else {
                                j2 = j3;
                            }
                            z = false;
                        } else {
                            j2 = j3;
                            if (this.u || v1aVar != null) {
                                z = false;
                            } else {
                                try {
                                    i45Var.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            jO = -1;
                        }
                        if (z2) {
                            i45Var.j.m();
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        if (z2) {
                            i45Var.j.m();
                        }
                        throw th;
                    }
                }
                i45 i45Var2 = i45.this;
                t54 t54Var = i45Var2.b.I;
                kmb kmbVar = i45Var2.c;
                long j5 = this.w.u;
                t54Var.b(kmbVar);
                if (!z) {
                    if (jO != -1) {
                        return jO;
                    }
                    if (v1aVar == null) {
                        return -1L;
                    }
                    throw v1aVar;
                }
                j3 = j2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            i45 i45Var = i45.this;
            synchronized (i45Var) {
                this.x = true;
                tx0 tx0Var = this.w;
                j = tx0Var.u;
                tx0Var.h();
                i45Var.notifyAll();
                g2b g2bVar = g2b.a;
            }
            if (j > 0) {
                i45 i45Var2 = i45.this;
                TimeZone timeZone = ytb.a;
                i45Var2.b.t(j);
            }
            i45.this.c();
        }

        @Override // defpackage.kw9
        public final voa timeout() {
            return i45.this.j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends o50 {
        public c() {
        }

        @Override // defpackage.o50
        public final IOException k(IOException iOException) {
            return new SocketTimeoutException("timeout");
        }

        @Override // defpackage.o50
        public final void l() {
            i45.this.g(ul3.CANCEL);
            final c45 c45Var = i45.this.b;
            synchronized (c45Var) {
                long j = c45Var.G;
                long j2 = c45Var.F;
                if (j < j2) {
                    return;
                }
                c45Var.F = j2 + 1;
                c45Var.H = System.nanoTime() + 1000000000;
                g2b g2bVar = g2b.a;
                y9a.c(c45Var.A, av.a(new StringBuilder(), c45Var.v, " ping"), 0L, new mh4() { // from class: w35
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        c45 c45Var2 = c45Var;
                        c45Var2.getClass();
                        try {
                            c45Var2.P.u(2, false, 0);
                        } catch (IOException e) {
                            ul3 ul3Var = ul3.PROTOCOL_ERROR;
                            c45Var2.h(ul3Var, ul3Var, e);
                        }
                        return g2b.a;
                    }
                }, 6);
            }
        }

        public final void m() throws IOException {
            if (j()) {
                throw k(null);
            }
        }
    }

    public i45(int i, c45 c45Var, boolean z, boolean z2, nu4 nu4Var) {
        c45Var.getClass();
        this.a = i;
        this.b = c45Var;
        this.c = new kmb(i);
        this.e = c45Var.K.a();
        ArrayDeque<nu4> arrayDeque = new ArrayDeque<>();
        this.f = arrayDeque;
        this.h = new b(c45Var.J.a(), z2);
        this.i = new a(z);
        this.j = new c();
        this.k = new c();
        if (nu4Var == null) {
            if (i()) {
                return;
            }
            aa0.c("remotely-initiated streams should have headers");
            throw null;
        }
        if (i()) {
            aa0.c("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(nu4Var);
    }

    @Override // defpackage.qv9
    public final kw9 a() {
        return this.h;
    }

    @Override // defpackage.qv9
    public final yq9 b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void c() {
        boolean z;
        boolean zJ;
        TimeZone timeZone = ytb.a;
        synchronized (this) {
            try {
                b bVar = this.h;
                if (bVar.u || !bVar.x) {
                    z = false;
                } else {
                    a aVar = this.i;
                    if (aVar.t || aVar.v) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zJ = j();
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(ul3.CANCEL, null);
        } else {
            if (zJ) {
                return;
            }
            this.b.m(this.a);
        }
    }

    @Override // defpackage.qv9
    public final void cancel() {
        g(ul3.CANCEL);
    }

    public final void d() throws IOException {
        a aVar = this.i;
        if (aVar.v) {
            o03.a("stream closed");
            return;
        }
        if (aVar.t) {
            o03.a("stream finished");
            return;
        }
        if (h() != null) {
            IOException iOException = this.m;
            if (iOException != null) {
                throw iOException;
            }
            ul3 ul3VarH = h();
            ul3VarH.getClass();
            throw new v1a(ul3VarH);
        }
    }

    public final void e(ul3 ul3Var, IOException iOException) {
        if (f(ul3Var, iOException)) {
            c45 c45Var = this.b;
            c45Var.getClass();
            c45Var.P.v(this.a, ul3Var);
        }
    }

    public final boolean f(ul3 ul3Var, IOException iOException) {
        TimeZone timeZone = ytb.a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.l = ul3Var;
            this.m = iOException;
            notifyAll();
            if (this.h.u && this.i.t) {
                return false;
            }
            g2b g2bVar = g2b.a;
            this.b.m(this.a);
            return true;
        }
    }

    public final void g(ul3 ul3Var) {
        if (f(ul3Var, null)) {
            this.b.v(this.a, ul3Var);
        }
    }

    public final ul3 h() {
        ul3 ul3Var;
        synchronized (this) {
            ul3Var = this.l;
        }
        return ul3Var;
    }

    public final boolean i() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                b bVar = this.h;
                if (bVar.u || bVar.x) {
                    a aVar = this.i;
                    if ((aVar.t || aVar.v) && this.g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(nu4 nu4Var, boolean z) {
        boolean zJ;
        nu4Var.getClass();
        TimeZone timeZone = ytb.a;
        synchronized (this) {
            try {
                if (this.g && nu4Var.d(":status") == null && nu4Var.d(":method") == null) {
                    this.h.getClass();
                } else {
                    this.g = true;
                    this.f.add(nu4Var);
                }
                if (z) {
                    this.h.u = true;
                }
                zJ = j();
                notifyAll();
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zJ) {
            return;
        }
        this.b.m(this.a);
    }
}
