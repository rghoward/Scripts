package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pi8 extends c45.b implements in3.a {
    public final z9a b;
    public final dy8 c;
    public final Socket d;
    public final Socket e;
    public final nt4 f;
    public final gf8 g;
    public final gy0 h;
    public final yw1 i;
    public c45 j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final ArrayList q;
    public long r;

    public pi8(z9a z9aVar, ri8 ri8Var, dy8 dy8Var, Socket socket, Socket socket2, nt4 nt4Var, gf8 gf8Var, gy0 gy0Var, yw1 yw1Var) {
        z9aVar.getClass();
        ri8Var.getClass();
        dy8Var.getClass();
        socket.getClass();
        socket2.getClass();
        gf8Var.getClass();
        gy0Var.getClass();
        yw1Var.getClass();
        this.b = z9aVar;
        this.c = dy8Var;
        this.d = socket;
        this.e = socket2;
        this.f = nt4Var;
        this.g = gf8Var;
        this.h = gy0Var;
        this.i = yw1Var;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void d(lg7 lg7Var, dy8 dy8Var, IOException iOException) {
        lg7Var.getClass();
        dy8Var.getClass();
        iOException.getClass();
        if (dy8Var.b.type() != Proxy.Type.DIRECT) {
            wd wdVar = dy8Var.a;
            wdVar.h.connectFailed(wdVar.i.i(), dy8Var.b.address(), iOException);
        }
        ey8 ey8Var = lg7Var.C;
        synchronized (ey8Var) {
            ey8Var.a.add(dy8Var);
        }
    }

    @Override // in3.a
    public final void a() {
        synchronized (this) {
            this.k = true;
            g2b g2bVar = g2b.a;
        }
        this.i.getClass();
    }

    @Override // c45.b
    public final void b(c45 c45Var, ok9 ok9Var) {
        ok9Var.getClass();
        synchronized (this) {
            this.p = (ok9Var.a & 8) != 0 ? ok9Var.b[3] : Integer.MAX_VALUE;
            g2b g2bVar = g2b.a;
        }
    }

    @Override // c45.b
    public final void c(i45 i45Var) {
        i45Var.e(ul3.REFUSED_STREAM, null);
    }

    @Override // in3.a
    public final void cancel() {
        ytb.c(this.d);
    }

    public final boolean e(wd wdVar, List<dy8> list) {
        f55 f55Var = wdVar.i;
        TimeZone timeZone = ytb.a;
        if (this.q.size() < this.p && !this.k) {
            dy8 dy8Var = this.c;
            wd wdVar2 = dy8Var.a;
            wd wdVar3 = dy8Var.a;
            if (wdVar2.a(wdVar)) {
                String str = f55Var.d;
                String str2 = f55Var.d;
                if (xj5.a(str, wdVar3.i.d)) {
                    return true;
                }
                if (this.j != null && list != null && !list.isEmpty()) {
                    for (dy8 dy8Var2 : list) {
                        Proxy.Type type = dy8Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && dy8Var.b.type() == type2 && xj5.a(dy8Var.c, dy8Var2.c)) {
                            if (wdVar.d != jg7.a) {
                                break;
                            }
                            TimeZone timeZone2 = ytb.a;
                            f55 f55Var2 = wdVar3.i;
                            if (f55Var.e != f55Var2.e) {
                                break;
                            }
                            boolean zA = xj5.a(str2, f55Var2.d);
                            nt4 nt4Var = this.f;
                            if (!zA) {
                                if (!this.l && nt4Var != null) {
                                    List<Certificate> listA = nt4Var.a();
                                    if (listA.isEmpty()) {
                                        break;
                                    }
                                    Certificate certificate = listA.get(0);
                                    certificate.getClass();
                                    if (!jg7.c(str2, (X509Certificate) certificate)) {
                                        break;
                                    }
                                } else {
                                    break;
                                    break;
                                }
                            }
                            try {
                                c61 c61Var = wdVar.e;
                                c61Var.getClass();
                                nt4Var.getClass();
                                List<Certificate> listA2 = nt4Var.a();
                                str2.getClass();
                                listA2.getClass();
                                Iterator<T> it = c61Var.a.iterator();
                                if (!it.hasNext()) {
                                    return true;
                                }
                                ((c61.a) it.next()).getClass();
                                w2a.n(null, "**.", false);
                                throw null;
                            } catch (SSLPeerUnverifiedException unused) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // in3.a
    public final void f(oi8 oi8Var, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (!(iOException instanceof v1a)) {
                    if (!(this.j != null) || (iOException instanceof bx1)) {
                        z = !this.k;
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                d(oi8Var.t, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((v1a) iOException).t == ul3.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        z = !this.k;
                        this.k = true;
                        this.m++;
                    }
                } else if (((v1a) iOException).t != ul3.CANCEL || !oi8Var.K) {
                    z = !this.k;
                    this.k = true;
                    this.m++;
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.i.getClass();
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = ytb.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        c45 c45Var = this.j;
        if (c45Var != null) {
            synchronized (c45Var) {
                if (c45Var.y) {
                    return false;
                }
                return c45Var.G >= c45Var.F || jNanoTime < c45Var.H;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        hy0 hy0VarD = this.h.d();
        socket.getClass();
        hy0VarD.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !hy0VarD.z();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // in3.a
    public final dy8 h() {
        return this.c;
    }

    public final void i() throws SocketException {
        this.r = System.nanoTime();
        gf8 gf8Var = this.g;
        if (gf8Var == gf8.HTTP_2 || gf8Var == gf8.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            Object obj = this.i;
            t54 t54Var = obj instanceof t54 ? (t54) obj : null;
            if (t54Var == null) {
                t54Var = t54.a.a;
            }
            c45.a aVar = new c45.a(this.b);
            gy0 gy0Var = this.h;
            String str = this.c.a.i.d;
            gy0Var.getClass();
            str.getClass();
            aVar.b = gy0Var;
            aVar.c = ytb.b + ' ' + str;
            aVar.d = this;
            aVar.f = t54Var;
            c45 c45Var = new c45(aVar);
            this.j = c45Var;
            ok9 ok9Var = c45.S;
            this.p = (ok9Var.a & 8) != 0 ? ok9Var.b[3] : Integer.MAX_VALUE;
            j45 j45Var = c45Var.P;
            synchronized (j45Var) {
                try {
                    if (j45Var.w) {
                        throw new IOException(MetricTracker.Action.CLOSED);
                    }
                    Logger logger = j45.y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ytb.d(">> CONNECTION " + u35.b.h(), new Object[0]));
                    }
                    j45Var.t.k0(u35.b);
                    j45Var.t.flush();
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            j45 j45Var2 = c45Var.P;
            ok9 ok9Var2 = c45Var.J;
            j45Var2.getClass();
            ok9Var2.getClass();
            synchronized (j45Var2) {
                try {
                    if (j45Var2.w) {
                        throw new IOException(MetricTracker.Action.CLOSED);
                    }
                    j45Var2.m(0, Integer.bitCount(ok9Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & ok9Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            j45Var2.t.writeShort(i);
                            j45Var2.t.writeInt(ok9Var2.b[i]);
                        }
                    }
                    j45Var2.t.flush();
                    g2b g2bVar2 = g2b.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = c45Var.J.a();
            if (iA != 65535) {
                c45Var.P.y(0, iA - 65535);
            }
            y9a.c(c45Var.z.d(), c45Var.v, 0L, c45Var.Q, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        dy8 dy8Var = this.c;
        sb.append(dy8Var.a.i.d);
        sb.append(':');
        sb.append(dy8Var.a.i.e);
        sb.append(", proxy=");
        sb.append(dy8Var.b);
        sb.append(" hostAddress=");
        sb.append(dy8Var.c);
        sb.append(" cipherSuite=");
        nt4 nt4Var = this.f;
        sb.append(nt4Var != null ? nt4Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
