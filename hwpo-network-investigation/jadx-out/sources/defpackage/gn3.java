package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn3 {
    public final oi8 a;
    public final om3 b;
    public final jn3 c;
    public final in3 d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends sd4 {
        public final /* synthetic */ gn3 A;
        public final long u;
        public final boolean v;
        public boolean w;
        public long x;
        public boolean y;
        public boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gn3 gn3Var, yq9 yq9Var, long j, boolean z) {
            super(yq9Var);
            yq9Var.getClass();
            this.A = gn3Var;
            this.u = j;
            this.v = z;
            this.y = z;
        }

        @Override // defpackage.sd4, defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.z) {
                return;
            }
            this.z = true;
            long j = this.u;
            if (j != -1 && this.x != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                h(null);
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                iOExceptionH.getClass();
                throw iOExceptionH;
            }
        }

        @Override // defpackage.sd4, defpackage.yq9, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                iOExceptionH.getClass();
                throw iOExceptionH;
            }
        }

        public final IOException h(IOException iOException) {
            if (this.w) {
                return iOException;
            }
            this.w = true;
            return gn3.a(this.A, this.v, iOException, 4);
        }

        @Override // defpackage.sd4, defpackage.yq9
        public final void i0(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            if (this.z) {
                aa0.c(MetricTracker.Action.CLOSED);
                return;
            }
            long j2 = this.u;
            if (j2 != -1 && this.x + j > j2) {
                StringBuilder sbB = ao3.b("expected ", j2, " bytes but received ");
                sbB.append(this.x + j);
                throw new ProtocolException(sbB.toString());
            }
            try {
                if (this.y) {
                    this.y = false;
                    this.A.b.getClass();
                }
                this.t.i0(tx0Var, j);
                this.x += j;
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                iOExceptionH.getClass();
                throw iOExceptionH;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends td4 {
        public final /* synthetic */ gn3 A;
        public final long u;
        public final boolean v;
        public long w;
        public boolean x;
        public boolean y;
        public boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gn3 gn3Var, kw9 kw9Var, long j, boolean z) {
            super(kw9Var);
            kw9Var.getClass();
            this.A = gn3Var;
            this.u = j;
            this.v = z;
            this.x = true;
            if (j == 0) {
                h(null);
            }
        }

        @Override // defpackage.td4, defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            if (this.z) {
                aa0.c(MetricTracker.Action.CLOSED);
                return 0L;
            }
            try {
                long jO = this.t.O(tx0Var, j);
                boolean z = this.x;
                gn3 gn3Var = this.A;
                if (z) {
                    this.x = false;
                    gn3Var.b.getClass();
                }
                if (jO == -1) {
                    h(null);
                    return -1L;
                }
                long j2 = this.w + jO;
                long j3 = this.u;
                if (j3 == -1 || j2 <= j3) {
                    this.w = j2;
                    if (gn3Var.d.d()) {
                        h(null);
                    }
                    return jO;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                iOExceptionH.getClass();
                throw iOExceptionH;
            }
        }

        @Override // defpackage.td4, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.z) {
                return;
            }
            this.z = true;
            try {
                super.close();
                h(null);
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                iOExceptionH.getClass();
                throw iOExceptionH;
            }
        }

        public final IOException h(IOException iOException) {
            if (this.y) {
                return iOException;
            }
            this.y = true;
            gn3 gn3Var = this.A;
            if (iOException == null && this.x) {
                this.x = false;
                gn3Var.b.getClass();
            }
            return gn3.a(gn3Var, this.v, iOException, 8);
        }
    }

    public gn3(oi8 oi8Var, om3 om3Var, jn3 jn3Var, in3 in3Var) {
        om3Var.getClass();
        jn3Var.getClass();
        this.a = oi8Var;
        this.b = om3Var;
        this.c = jn3Var;
        this.d = in3Var;
    }

    public static IOException a(gn3 gn3Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        om3 om3Var = gn3Var.b;
        if (iOException != null) {
            gn3Var.f(iOException);
        }
        if (z3) {
            if (iOException != null) {
                om3Var.getClass();
                om3.a aVar = om3.a;
            } else {
                om3Var.getClass();
            }
        }
        if (z2) {
            if (iOException != null) {
                om3Var.getClass();
                om3.a aVar2 = om3.a;
            } else {
                om3Var.getClass();
            }
        }
        return gn3Var.a.f(gn3Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public final a b(jp8 jp8Var, boolean z) {
        jp8Var.getClass();
        this.e = z;
        qp8 qp8Var = jp8Var.d;
        qp8Var.getClass();
        long jContentLength = qp8Var.contentLength();
        this.b.getClass();
        return new a(this, this.d.f(jp8Var, jContentLength), jContentLength, false);
    }

    public final pi8 c() {
        in3.a aVarJ = this.d.j();
        pi8 pi8Var = aVarJ instanceof pi8 ? (pi8) aVarJ : null;
        if (pi8Var != null) {
            return pi8Var;
        }
        aa0.c("no connection for CONNECT tunnels");
        return null;
    }

    public final fj8 d(qu8 qu8Var) throws IOException {
        gn3 gn3Var;
        in3 in3Var = this.d;
        try {
            String strD = qu8Var.y.d("Content-Type");
            if (strD == null) {
                strD = null;
            }
            long jE = in3Var.e(qu8Var);
            gn3Var = this;
            try {
                return new fj8(strD, jE, new ni8(new b(gn3Var, in3Var.a(qu8Var), jE, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                gn3Var.b.getClass();
                om3.a aVar = om3.a;
                gn3Var.f(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            gn3Var = this;
        }
    }

    public final qu8.a e(boolean z) throws IOException {
        try {
            qu8.a aVarG = this.d.g(z);
            if (aVarG == null) {
                return aVarG;
            }
            aVarG.n = this;
            return aVarG;
        } catch (IOException e) {
            this.b.getClass();
            om3.a aVar = om3.a;
            f(e);
            throw e;
        }
    }

    public final void f(IOException iOException) {
        this.f = true;
        this.d.j().f(this.a, iOException);
    }

    public final hn3 g() throws SocketException {
        oi8 oi8Var = this.a;
        if (oi8Var.D) {
            aa0.c("Check failed.");
            return null;
        }
        oi8Var.D = true;
        oi8Var.y.j();
        synchronized (oi8Var) {
            if (oi8Var.L == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (oi8Var.H || oi8Var.I) {
                throw new IllegalStateException("Check failed.");
            }
            if (oi8Var.F) {
                throw new IllegalStateException("Check failed.");
            }
            if (!oi8Var.G) {
                throw new IllegalStateException("Check failed.");
            }
            oi8Var.G = false;
            oi8Var.H = true;
            oi8Var.I = true;
            g2b g2bVar = g2b.a;
        }
        in3.a aVarJ = this.d.j();
        aVarJ.getClass();
        pi8 pi8Var = (pi8) aVarJ;
        pi8Var.e.setSoTimeout(0);
        pi8Var.a();
        return new hn3(this);
    }
}
