package defpackage;

import io.ably.lib.http.HttpConstants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qj8 implements pkb, tkb.a {
    public static final List<gf8> x = ws0.h(gf8.HTTP_1_1);
    public final rkb a;
    public final Random b;
    public final long c;
    public qkb d;
    public final long e;
    public final long f;
    public final String g;
    public oi8 h;
    public c i;
    public tkb j;
    public ukb k;
    public final y9a l;
    public String m;
    public gy0 n;
    public final ArrayDeque<g01> o;
    public final ArrayDeque<Object> p;
    public long q;
    public boolean r;
    public int s;
    public String t;
    public boolean u;
    public int v;
    public boolean w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final g01 b;
        public final long c;

        public a(int i, long j, g01 g01Var) {
            this.a = i;
            this.b = g01Var;
            this.c = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final g01 b;

        public b(int i, g01 g01Var) {
            this.a = i;
            this.b = g01Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends q9a {
        public c() {
            super(av.a(new StringBuilder(), qj8.this.m, " writer"), true);
        }

        @Override // defpackage.q9a
        public final long a() {
            qj8 qj8Var = qj8.this;
            try {
                return qj8Var.k() ? 0L : -1L;
            } catch (IOException e) {
                qj8.g(qj8Var, e, null, 2);
                return -1L;
            }
        }
    }

    public qj8(z9a z9aVar, jp8 jp8Var, rkb rkbVar, Random random, long j, long j2, long j3) {
        z9aVar.getClass();
        jp8Var.getClass();
        rkbVar.getClass();
        this.a = rkbVar;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.f = j3;
        this.l = z9aVar.d();
        this.o = new ArrayDeque<>();
        this.p = new ArrayDeque<>();
        this.s = -1;
        String str = jp8Var.b;
        if (!HttpConstants.Methods.GET.equals(str)) {
            ca0.a(ct1.a("Request must be GET: ", str));
            throw null;
        }
        g01 g01Var = g01.w;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        g2b g2bVar = g2b.a;
        this.g = g01.a.d(bArr).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, ukb] */
    public static void g(qj8 qj8Var, Exception exc, qu8 qu8Var, int i) {
        ukb ukbVar;
        if ((i & 2) != 0) {
            qu8Var = null;
        }
        boolean z = (i & 4) == 0;
        qj8Var.getClass();
        gl8 gl8Var = new gl8();
        synchronized (qj8Var) {
            try {
                if (qj8Var.u) {
                    return;
                }
                qj8Var.u = true;
                gy0 gy0Var = qj8Var.n;
                ?? r4 = qj8Var.k;
                gl8Var.t = r4;
                qj8Var.k = null;
                if (!z && r4 != 0) {
                    y9a.c(qj8Var.l, qj8Var.m + " writer close", 0L, new oj8(0, gl8Var), 2);
                }
                qj8Var.l.g();
                g2b g2bVar = g2b.a;
                try {
                    qj8Var.a.onFailure(qj8Var, exc, qu8Var);
                } finally {
                    if (gy0Var != null) {
                        gy0Var.cancel();
                    }
                    if (z && (ukbVar = (ukb) gl8Var.t) != null) {
                        vtb.b(ukbVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tkb.a
    public final void a(String str) {
        this.a.onMessage(this, str);
    }

    @Override // tkb.a
    public final void b(g01 g01Var) {
        g01Var.getClass();
        this.a.onMessage(this, g01Var);
    }

    @Override // tkb.a
    public final synchronized void c(g01 g01Var) {
        try {
            g01Var.getClass();
            if (!this.u && (!this.r || !this.p.isEmpty())) {
                this.o.add(g01Var);
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pkb
    public final void cancel() {
        oi8 oi8Var = this.h;
        oi8Var.getClass();
        oi8Var.cancel();
    }

    @Override // defpackage.pkb
    public final boolean close(int i, String str) {
        String str2;
        long j = this.f;
        synchronized (this) {
            g01 g01VarC = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    g01 g01Var = g01.w;
                    g01VarC = g01.a.c(str);
                    if (g01VarC.t.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.p.add(new a(i, j, g01VarC));
                    i();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tkb.a
    public final synchronized void d(g01 g01Var) {
        g01Var.getClass();
        this.w = false;
    }

    @Override // tkb.a
    public final void e(int i, String str) {
        if (i == -1) {
            z90.a("Failed requirement.");
            return;
        }
        synchronized (this) {
            if (this.s != -1) {
                throw new IllegalStateException("already closed");
            }
            this.s = i;
            this.t = str;
            g2b g2bVar = g2b.a;
        }
        this.a.onClosing(this, i, str);
    }

    public final qv9 f(qu8 qu8Var) throws ProtocolException {
        nu4 nu4Var = qu8Var.y;
        int i = qu8Var.w;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(wu0.a(sb, qu8Var.v, '\''));
        }
        String strD = nu4Var.d("Connection");
        if (strD == null) {
            strD = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strD)) {
            throw new ProtocolException(eca.a('\'', "Expected 'Connection' header value 'Upgrade' but was '", strD));
        }
        String strD2 = nu4Var.d("Upgrade");
        if (strD2 == null) {
            strD2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strD2)) {
            throw new ProtocolException(eca.a('\'', "Expected 'Upgrade' header value 'websocket' but was '", strD2));
        }
        String strD3 = nu4Var.d("Sec-WebSocket-Accept");
        String str = strD3 != null ? strD3 : null;
        g01 g01Var = g01.w;
        String strA = g01.a.c(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").f("SHA-1").a();
        if (xj5.a(strA, str)) {
            qv9 qv9Var = qu8Var.A;
            if (qv9Var != null) {
                return qv9Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + str + '\'');
    }

    public final void h() {
        int i;
        String str;
        tkb tkbVar;
        boolean z;
        synchronized (this) {
            try {
                i = this.s;
                str = this.t;
                tkbVar = this.j;
                this.j = null;
                if (this.r && this.p.isEmpty()) {
                    final ukb ukbVar = this.k;
                    if (ukbVar != null) {
                        this.k = null;
                        y9a.c(this.l, this.m + " writer close", 0L, new mh4() { // from class: mj8
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                vtb.b(ukbVar);
                                return g2b.a;
                            }
                        }, 2);
                    }
                    this.l.g();
                }
                z = (this.u || this.k != null || this.s == -1) ? false : true;
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            rkb rkbVar = this.a;
            str.getClass();
            rkbVar.onClosed(this, i, str);
        }
        if (tkbVar != null) {
            vtb.b(tkbVar);
        }
    }

    public final void i() {
        TimeZone timeZone = ytb.a;
        c cVar = this.i;
        if (cVar != null) {
            this.l.d(cVar, 0L);
        }
    }

    public final synchronized boolean j(int i, g01 g01Var) {
        if (!this.u && !this.r) {
            long j = this.q;
            byte[] bArr = g01Var.t;
            if (((long) bArr.length) + j > 16777216) {
                close(1001, null);
                return false;
            }
            this.q = j + ((long) bArr.length);
            this.p.add(new b(i, g01Var));
            i();
            return true;
        }
        return false;
    }

    public final boolean k() {
        ukb ukbVar;
        Object obj;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.u) {
                    return false;
                }
                ukb ukbVar2 = this.k;
                g01 g01VarPoll = this.o.poll();
                String str2 = null;
                int i = -1;
                if (g01VarPoll == null) {
                    Object objPoll = this.p.poll();
                    if (objPoll instanceof a) {
                        int i2 = this.s;
                        str = this.t;
                        if (i2 != -1) {
                            ukb ukbVar3 = this.k;
                            this.k = null;
                            if (ukbVar3 != null && this.j == null) {
                                z = true;
                            }
                            this.l.g();
                            ukbVar = ukbVar3;
                            i = i2;
                            obj = objPoll;
                        } else {
                            long j = ((a) objPoll).c;
                            y9a.c(this.l, this.m + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new mh4() { // from class: pj8
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    this.t.cancel();
                                    return g2b.a;
                                }
                            }, 4);
                            i = i2;
                            obj = objPoll;
                            ukbVar = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        obj = objPoll;
                        ukbVar = null;
                    }
                } else {
                    ukbVar = null;
                    obj = null;
                    str = null;
                }
                g2b g2bVar = g2b.a;
                try {
                    if (g01VarPoll != null) {
                        ukbVar2.getClass();
                        ukbVar2.h(10, g01VarPoll);
                    } else if (obj instanceof b) {
                        ukbVar2.getClass();
                        ukbVar2.k(((b) obj).a, ((b) obj).b);
                        synchronized (this) {
                            this.q -= (long) ((b) obj).b.t.length;
                        }
                    } else {
                        if (!(obj instanceof a)) {
                            throw new AssertionError();
                        }
                        ukbVar2.getClass();
                        int i3 = ((a) obj).a;
                        g01 g01Var = ((a) obj).b;
                        g01 g01VarR = g01.w;
                        if (i3 != 0 || g01Var != null) {
                            if (i3 != 0) {
                                if (i3 < 1000 || i3 >= 5000) {
                                    str2 = "Code must be in range [1000,5000): " + i3;
                                } else if ((1004 <= i3 && i3 < 1007) || (1015 <= i3 && i3 < 3000)) {
                                    str2 = "Code " + i3 + " is reserved and may not be used.";
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            tx0 tx0Var = new tx0();
                            tx0Var.e0(i3);
                            if (g01Var != null) {
                                tx0Var.Y(g01Var);
                            }
                            g01VarR = tx0Var.r(tx0Var.u);
                        }
                        try {
                            ukbVar2.h(8, g01VarR);
                            ukbVar2.A = true;
                            if (z) {
                                rkb rkbVar = this.a;
                                str.getClass();
                                rkbVar.onClosed(this, i, str);
                            }
                        } catch (Throwable th) {
                            ukbVar2.A = true;
                            throw th;
                        }
                    }
                    if (ukbVar != null) {
                        vtb.b(ukbVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (ukbVar != null) {
                        vtb.b(ukbVar);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // defpackage.pkb
    public final boolean send(String str) {
        str.getClass();
        g01 g01Var = g01.w;
        return j(1, g01.a.c(str));
    }

    @Override // defpackage.pkb
    public final boolean send(g01 g01Var) {
        return j(2, g01Var);
    }
}
