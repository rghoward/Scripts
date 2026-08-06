package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t35 implements in3 {
    public static final nu4 f;
    public final lg7 a;
    public final in3.a b;
    public final gy0 c;
    public int d;
    public final qu4 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class a implements kw9 {
        public final f55 t;
        public final vd4 u;
        public boolean v;
        public final /* synthetic */ t35 w;

        public a(t35 t35Var, f55 f55Var) {
            f55Var.getClass();
            this.w = t35Var;
            this.t = f55Var;
            this.u = new vd4(t35Var.c.d().timeout());
        }

        @Override // defpackage.kw9
        public long O(tx0 tx0Var, long j) throws IOException {
            t35 t35Var = this.w;
            tx0Var.getClass();
            try {
                return t35Var.c.d().O(tx0Var, j);
            } catch (IOException e) {
                t35Var.b.a();
                h(t35.f);
                throw e;
            }
        }

        public final void h(nu4 nu4Var) {
            lg7 lg7Var;
            i52 i52Var;
            nu4Var.getClass();
            t35 t35Var = this.w;
            int i = t35Var.d;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                j08.a(t35Var.d, "state: ");
                return;
            }
            t35.k(t35Var, this.u);
            t35Var.d = 6;
            if (nu4Var.size() <= 0 || (lg7Var = t35Var.a) == null || (i52Var = lg7Var.j) == null) {
                return;
            }
            u45.b(i52Var, this.t, nu4Var);
        }

        @Override // defpackage.kw9
        public final voa timeout() {
            return this.u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements yq9 {
        public final vd4 t;
        public boolean u;

        public b() {
            this.t = new vd4(t35.this.c.c().timeout());
        }

        @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.u) {
                return;
            }
            this.u = true;
            t35.this.c.c().R("0\r\n\r\n");
            t35.k(t35.this, this.t);
            t35.this.d = 3;
        }

        @Override // defpackage.yq9, java.io.Flushable
        public final synchronized void flush() {
            if (this.u) {
                return;
            }
            t35.this.c.c().flush();
        }

        @Override // defpackage.yq9
        public final void i0(tx0 tx0Var, long j) {
            tx0Var.getClass();
            if (this.u) {
                aa0.c(MetricTracker.Action.CLOSED);
                return;
            }
            if (j == 0) {
                return;
            }
            fy0 fy0VarC = t35.this.c.c();
            fy0VarC.U(j);
            fy0VarC.R("\r\n");
            fy0VarC.i0(tx0Var, j);
            fy0VarC.R("\r\n");
        }

        @Override // defpackage.yq9
        public final voa timeout() {
            return this.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends a {
        public long x;
        public boolean y;
        public final /* synthetic */ t35 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t35 t35Var, f55 f55Var) {
            super(t35Var, f55Var);
            f55Var.getClass();
            this.z = t35Var;
            this.x = -1L;
            this.y = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        
            if (r11.y == false) goto L31;
         */
        @Override // t35.a, defpackage.kw9
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long O(defpackage.tx0 r12, long r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t35.c.O(tx0, long):long");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zH;
            if (this.v) {
                return;
            }
            if (this.y) {
                TimeZone timeZone = ytb.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zH = ytb.h(this, 100);
                } catch (IOException unused) {
                    zH = false;
                }
                if (!zH) {
                    this.z.b.a();
                    h(t35.f);
                }
            }
            this.v = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d extends a {
        public long x;
        public final /* synthetic */ t35 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t35 t35Var, f55 f55Var, long j) {
            super(t35Var, f55Var);
            f55Var.getClass();
            this.y = t35Var;
            this.x = j;
            if (j == 0) {
                h(nu4.u);
            }
        }

        @Override // t35.a, defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            if (j < 0) {
                ca0.a(d43.b(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.v) {
                aa0.c(MetricTracker.Action.CLOSED);
                return 0L;
            }
            long j2 = this.x;
            if (j2 == 0) {
                return -1L;
            }
            long jO = super.O(tx0Var, Math.min(j2, j));
            if (jO == -1) {
                this.y.b.a();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                h(t35.f);
                throw protocolException;
            }
            long j3 = this.x - jO;
            this.x = j3;
            if (j3 == 0) {
                h(nu4.u);
            }
            return jO;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zH;
            if (this.v) {
                return;
            }
            if (this.x != 0) {
                TimeZone timeZone = ytb.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zH = ytb.h(this, 100);
                } catch (IOException unused) {
                    zH = false;
                }
                if (!zH) {
                    this.y.b.a();
                    h(t35.f);
                }
            }
            this.v = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e implements yq9 {
        public final vd4 t;
        public boolean u;

        public e() {
            this.t = new vd4(t35.this.c.c().timeout());
        }

        @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.u) {
                return;
            }
            this.u = true;
            vd4 vd4Var = this.t;
            t35 t35Var = t35.this;
            t35.k(t35Var, vd4Var);
            t35Var.d = 3;
        }

        @Override // defpackage.yq9, java.io.Flushable
        public final void flush() {
            if (this.u) {
                return;
            }
            t35.this.c.c().flush();
        }

        @Override // defpackage.yq9
        public final void i0(tx0 tx0Var, long j) {
            tx0Var.getClass();
            if (this.u) {
                aa0.c(MetricTracker.Action.CLOSED);
            } else {
                vtb.a(tx0Var.u, 0L, j);
                t35.this.c.c().i0(tx0Var, j);
            }
        }

        @Override // defpackage.yq9
        public final voa timeout() {
            return this.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class f extends a {
        public boolean x;

        @Override // t35.a, defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            if (j < 0) {
                ca0.a(d43.b(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.v) {
                aa0.c(MetricTracker.Action.CLOSED);
                return 0L;
            }
            if (this.x) {
                return -1L;
            }
            long jO = super.O(tx0Var, j);
            if (jO != -1) {
                return jO;
            }
            this.x = true;
            h(nu4.u);
            return -1L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.v) {
                return;
            }
            if (!this.x) {
                h(t35.f);
            }
            this.v = true;
        }
    }

    static {
        nu4 nu4Var = nu4.u;
        f = nu4.b.a("OkHttp-Response-Body", "Truncated");
    }

    public t35(lg7 lg7Var, in3.a aVar, gy0 gy0Var) {
        gy0Var.getClass();
        this.a = lg7Var;
        this.b = aVar;
        this.c = gy0Var;
        this.e = new qu4(gy0Var.d());
    }

    public static final void k(t35 t35Var, vd4 vd4Var) {
        voa voaVar = vd4Var.e;
        voa.a aVar = voa.d;
        aVar.getClass();
        vd4Var.e = aVar;
        voaVar.a();
        voaVar.b();
    }

    @Override // defpackage.in3
    public final kw9 a(qu8 qu8Var) {
        jp8 jp8Var = qu8Var.t;
        if (!u45.a(qu8Var)) {
            return l(jp8Var.a, 0L);
        }
        String strD = qu8Var.y.d("Transfer-Encoding");
        if (strD == null) {
            strD = null;
        }
        if ("chunked".equalsIgnoreCase(strD)) {
            f55 f55Var = jp8Var.a;
            if (this.d == 4) {
                this.d = 5;
                return new c(this, f55Var);
            }
            aa.b(this.d, "state: ");
            return null;
        }
        long jE = ytb.e(qu8Var);
        if (jE != -1) {
            return l(jp8Var.a, jE);
        }
        f55 f55Var2 = jp8Var.a;
        if (this.d != 4) {
            aa.b(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.a();
        f55Var2.getClass();
        return new f(this, f55Var2);
    }

    @Override // defpackage.in3
    public final void b(jp8 jp8Var) {
        jp8Var.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(jp8Var.b);
        sb.append(' ');
        f55 f55Var = jp8Var.a;
        if (f55Var.f() || type != Proxy.Type.HTTP) {
            String strB = f55Var.b();
            String strD = f55Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(f55Var);
        }
        sb.append(" HTTP/1.1");
        m(jp8Var.c, sb.toString());
    }

    @Override // defpackage.in3
    public final void c() {
        this.c.c().flush();
    }

    @Override // defpackage.in3
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.in3
    public final boolean d() {
        return this.d == 6;
    }

    @Override // defpackage.in3
    public final long e(qu8 qu8Var) {
        if (!u45.a(qu8Var)) {
            return 0L;
        }
        String strD = qu8Var.y.d("Transfer-Encoding");
        if (strD == null) {
            strD = null;
        }
        if ("chunked".equalsIgnoreCase(strD)) {
            return -1L;
        }
        return ytb.e(qu8Var);
    }

    @Override // defpackage.in3
    public final yq9 f(jp8 jp8Var, long j) throws ProtocolException {
        jp8Var.getClass();
        qp8 qp8Var = jp8Var.d;
        if (qp8Var != null && qp8Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(jp8Var.c.d("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new b();
            }
            aa.b(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            aa0.c("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new e();
        }
        aa.b(this.d, "state: ");
        return null;
    }

    @Override // defpackage.in3
    public final qu8.a g(boolean z) throws IOException {
        qu4 qu4Var = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            aa.b(this.d, "state: ");
            return null;
        }
        try {
            String strI = qu4Var.a.I(qu4Var.b);
            qu4Var.b -= (long) strI.length();
            d1a d1aVarA = d1a.a.a(strI);
            int i2 = d1aVarA.b;
            qu8.a aVar = new qu8.a();
            aVar.b = d1aVarA.a;
            aVar.c = i2;
            aVar.d = d1aVarA.c;
            nu4.a aVar2 = new nu4.a();
            while (true) {
                String strI2 = qu4Var.a.I(qu4Var.b);
                qu4Var.b -= (long) strI2.length();
                if (strI2.length() == 0) {
                    break;
                }
                aVar2.b(strI2);
            }
            aVar.f = aVar2.d().f();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return aVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return aVar;
            }
            this.d = 3;
            return aVar;
        } catch (EOFException e2) {
            throw new IOException(ct1.a("unexpected end of stream on ", this.b.h().a.i.h()), e2);
        }
    }

    @Override // defpackage.in3
    public final void h() {
        this.c.c().flush();
    }

    @Override // defpackage.in3
    public final qv9 i() {
        return this.c;
    }

    @Override // defpackage.in3
    public final in3.a j() {
        return this.b;
    }

    public final d l(f55 f55Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new d(this, f55Var, j);
        }
        aa.b(this.d, "state: ");
        return null;
    }

    public final void m(nu4 nu4Var, String str) {
        nu4Var.getClass();
        if (this.d != 0) {
            aa.b(this.d, "state: ");
            return;
        }
        gy0 gy0Var = this.c;
        gy0Var.c().R(str).R("\r\n");
        int size = nu4Var.size();
        for (int i = 0; i < size; i++) {
            gy0Var.c().R(nu4Var.e(i)).R(": ").R(nu4Var.j(i)).R("\r\n");
        }
        gy0Var.c().R("\r\n");
        this.d = 1;
    }
}
