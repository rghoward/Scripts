package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vw1 implements fy8.b, in3.a {
    public final z9a a;
    public final ri8 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final oi8 h;
    public final gj8 i;
    public final dy8 j;
    public final List<dy8> k;
    public final int l;
    public final jp8 m;
    public final int n;
    public final boolean o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public nt4 s;
    public gf8 t;
    public gy0 u;
    public pi8 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public vw1(z9a z9aVar, ri8 ri8Var, int i, int i2, int i3, int i4, boolean z, oi8 oi8Var, gj8 gj8Var, dy8 dy8Var, List list, int i5, jp8 jp8Var, int i6, boolean z2) {
        z9aVar.getClass();
        ri8Var.getClass();
        dy8Var.getClass();
        this.a = z9aVar;
        this.b = ri8Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = oi8Var;
        this.i = gj8Var;
        this.j = dy8Var;
        this.k = list;
        this.l = i5;
        this.m = jp8Var;
        this.n = i6;
        this.o = z2;
    }

    public static vw1 l(vw1 vw1Var, int i, jp8 jp8Var, int i2, boolean z, int i3) {
        return new vw1(vw1Var.a, vw1Var.b, vw1Var.c, vw1Var.d, vw1Var.e, vw1Var.f, vw1Var.g, vw1Var.h, vw1Var.i, vw1Var.j, vw1Var.k, (i3 & 1) != 0 ? vw1Var.l : i, (i3 & 2) != 0 ? vw1Var.m : jp8Var, (i3 & 4) != 0 ? vw1Var.n : i2, (i3 & 8) != 0 ? vw1Var.o : z);
    }

    @Override // fy8.b
    public final boolean b() {
        return this.t != null;
    }

    @Override // fy8.b
    public final fy8.b c() {
        return new vw1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // fy8.b
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            ytb.c(socket);
        }
    }

    @Override // fy8.b
    public final pi8 d() {
        ey8 ey8Var = this.h.t.C;
        dy8 dy8Var = this.j;
        synchronized (ey8Var) {
            dy8Var.getClass();
            ey8Var.a.remove(dy8Var);
        }
        pi8 pi8Var = this.v;
        pi8Var.getClass();
        yw1 yw1Var = pi8Var.i;
        dy8 dy8Var2 = this.j;
        yw1Var.getClass();
        dy8Var2.getClass();
        tv8 tv8VarF = this.i.f(this, this.k);
        if (tv8VarF != null) {
            return tv8VarF.a;
        }
        synchronized (pi8Var) {
            ri8 ri8Var = this.b;
            ri8Var.getClass();
            TimeZone timeZone = ytb.a;
            ri8Var.e.add(pi8Var);
            ri8Var.c.d(ri8Var.d, 0L);
            this.h.b(pi8Var);
            g2b g2bVar = g2b.a;
        }
        this.h.x.getClass();
        om3.a aVar = om3.a;
        pi8Var.i.getClass();
        return pi8Var;
    }

    @Override // fy8.b
    public final fy8.a e() {
        Socket socket;
        Socket socket2;
        ri8 ri8Var = this.b;
        dy8 dy8Var = this.j;
        oi8 oi8Var = this.h;
        CopyOnWriteArrayList<fy8.b> copyOnWriteArrayList = oi8Var.M;
        if (this.q != null) {
            aa0.c("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                om3 om3Var = oi8Var.x;
                InetSocketAddress inetSocketAddress = dy8Var.c;
                om3Var.getClass();
                inetSocketAddress.getClass();
                ri8Var.a.getClass();
                i();
                z = true;
                fy8.a aVar = new fy8.a(this, null, null, 6);
                copyOnWriteArrayList.remove(this);
                return aVar;
            } catch (IOException e) {
                if (dy8Var.a.g == null && dy8Var.b.type() != Proxy.Type.DIRECT) {
                    wd wdVar = dy8Var.a;
                    wdVar.h.connectFailed(wdVar.i.i(), dy8Var.b.address(), e);
                }
                om3 om3Var2 = oi8Var.x;
                InetSocketAddress inetSocketAddress2 = dy8Var.c;
                om3Var2.getClass();
                inetSocketAddress2.getClass();
                ri8Var.a.getClass();
                yw1.a aVar2 = yw1.a;
                fy8.a aVar3 = new fy8.a(this, null, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.q) != null) {
                    ytb.c(socket2);
                }
                return aVar3;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.q) != null) {
                ytb.c(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:102:0x0165  */
    /* JADX WARN: Code duplicated, block: B:80:0x0136 A[Catch: all -> 0x0035, TryCatch #4 {all -> 0x0035, blocks: (B:7:0x0024, B:9:0x0028, B:11:0x0030, B:23:0x004c, B:26:0x0053, B:28:0x0057, B:30:0x0061, B:32:0x0065, B:34:0x006f, B:35:0x0093, B:51:0x00c9, B:53:0x00ce, B:55:0x00d1, B:57:0x00de, B:59:0x00e9, B:78:0x0123, B:80:0x0136, B:83:0x013b, B:86:0x0140, B:88:0x0144, B:91:0x014d, B:94:0x0152, B:97:0x0157, B:70:0x0113, B:71:0x0116, B:39:0x00a6, B:40:0x00a9, B:41:0x00aa, B:42:0x00b1, B:43:0x00b2, B:44:0x00b5, B:45:0x00b6, B:49:0x00c5, B:48:0x00c3), top: B:118:0x0024 }] */
    @Override // fy8.b
    public final fy8.a g() throws Throwable {
        InetSocketAddress inetSocketAddress;
        vw1 vw1VarM;
        Socket socket;
        vw1 vw1Var;
        ri8 ri8Var = this.b;
        oi8 oi8Var = this.h;
        om3 om3Var = oi8Var.x;
        CopyOnWriteArrayList<fy8.b> copyOnWriteArrayList = oi8Var.M;
        Socket socket2 = this.q;
        vw1 vw1Var2 = null;
        if (socket2 == null) {
            z90.a("TCP not connected");
            return null;
        }
        if (b()) {
            aa0.c("already connected");
            return null;
        }
        dy8 dy8Var = this.j;
        wd wdVar = dy8Var.a;
        InetSocketAddress inetSocketAddress2 = dy8Var.c;
        wd wdVar2 = dy8Var.a;
        List<cx1> list = wdVar.k;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                if (this.m != null) {
                    fy8.a aVarK = k();
                    if (aVarK.b != null || aVarK.c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket3 = this.r;
                        if (socket3 != null) {
                            ytb.c(socket3);
                        }
                        ytb.c(socket2);
                        return aVarK;
                    }
                }
                if (wdVar2.c != null) {
                    gy0 gy0Var = this.u;
                    if (gy0Var == null) {
                        xj5.e("socket");
                        throw null;
                    }
                    if (gy0Var.b.u.z()) {
                        gy0 gy0Var2 = this.u;
                        if (gy0Var2 == null) {
                            xj5.e("socket");
                            throw null;
                        }
                        if (gy0Var2.c.u.z()) {
                            om3Var.getClass();
                            SSLSocketFactory sSLSocketFactory = wdVar2.c;
                            f55 f55Var = wdVar2.i;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, f55Var.d, f55Var.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            vw1 vw1VarN = n(list, sSLSocket);
                            cx1 cx1Var = list.get(vw1VarN.n);
                            vw1VarM = vw1VarN.m(list, sSLSocket);
                            try {
                                cx1Var.a(sSLSocket, vw1VarN.o);
                                j(sSLSocket, cx1Var);
                                om3Var.getClass();
                                vw1Var = vw1VarM;
                            } catch (IOException e) {
                                e = e;
                                inetSocketAddress = inetSocketAddress2;
                                oi8Var.x.getClass();
                                inetSocketAddress.getClass();
                                ri8Var.a.getClass();
                                yw1.a aVar = yw1.a;
                                if (this.g) {
                                    vw1Var2 = vw1VarM;
                                }
                                fy8.a aVar2 = new fy8.a(this, vw1Var2, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    socket = this.r;
                                    if (socket != null) {
                                        ytb.c(socket);
                                    }
                                    ytb.c(socket2);
                                }
                                return aVar2;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket2;
                List<gf8> list2 = wdVar2.j;
                gf8 gf8Var = gf8.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(gf8Var)) {
                    gf8Var = gf8.HTTP_1_1;
                }
                this.t = gf8Var;
                vw1Var = null;
                try {
                    z9a z9aVar = this.a;
                    try {
                        ri8 ri8Var2 = this.b;
                        try {
                            dy8 dy8Var2 = this.j;
                            Socket socket4 = this.r;
                            socket4.getClass();
                            nt4 nt4Var = this.s;
                            inetSocketAddress = inetSocketAddress2;
                            try {
                                gf8 gf8Var2 = this.t;
                                gf8Var2.getClass();
                                gy0 gy0Var3 = this.u;
                                if (gy0Var3 == null) {
                                    xj5.e("socket");
                                    throw null;
                                }
                                pi8 pi8Var = new pi8(z9aVar, ri8Var2, dy8Var2, socket2, socket4, nt4Var, gf8Var2, gy0Var3, ri8Var.a);
                                this.v = pi8Var;
                                pi8Var.i();
                                om3Var.getClass();
                                inetSocketAddress.getClass();
                                try {
                                    fy8.a aVar3 = new fy8.a(this, null, null, 6);
                                    copyOnWriteArrayList.remove(this);
                                    return aVar3;
                                } catch (IOException e2) {
                                    e = e2;
                                    vw1VarM = vw1Var;
                                    z = true;
                                    oi8Var.x.getClass();
                                    inetSocketAddress.getClass();
                                    ri8Var.a.getClass();
                                    yw1.a aVar4 = yw1.a;
                                    if (this.g) {
                                        vw1Var2 = vw1VarM;
                                    }
                                    fy8.a aVar5 = new fy8.a(this, vw1Var2, e);
                                    copyOnWriteArrayList.remove(this);
                                    if (!z) {
                                        socket = this.r;
                                        if (socket != null) {
                                            ytb.c(socket);
                                        }
                                        ytb.c(socket2);
                                    }
                                    return aVar5;
                                } catch (Throwable th) {
                                    th = th;
                                    z = true;
                                    copyOnWriteArrayList.remove(this);
                                    if (!z) {
                                        Socket socket5 = this.r;
                                        if (socket5 != null) {
                                            ytb.c(socket5);
                                        }
                                        ytb.c(socket2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                vw1VarM = vw1Var;
                                oi8Var.x.getClass();
                                inetSocketAddress.getClass();
                                ri8Var.a.getClass();
                                yw1.a aVar6 = yw1.a;
                                if (this.g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    vw1Var2 = vw1VarM;
                                }
                                fy8.a aVar7 = new fy8.a(this, vw1Var2, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    socket = this.r;
                                    if (socket != null) {
                                        ytb.c(socket);
                                    }
                                    ytb.c(socket2);
                                }
                                return aVar7;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            inetSocketAddress = inetSocketAddress2;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        inetSocketAddress = inetSocketAddress2;
                    }
                } catch (IOException e6) {
                    e = e6;
                    inetSocketAddress = inetSocketAddress2;
                }
            } catch (IOException e7) {
                e = e7;
                inetSocketAddress = inetSocketAddress2;
                vw1VarM = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // in3.a
    public final dy8 h() {
        return this.j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : a.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            o03.a("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            c cVar = c.a;
            c.a.f(socketCreateSocket, this.j.c, this.e);
            try {
                this.u = new gy0(new ot2(socketCreateSocket));
            } catch (NullPointerException e) {
                if (xj5.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, cx1 cx1Var) {
        gf8 gf8VarA;
        final wd wdVar = this.j.a;
        try {
            if (cx1Var.b) {
                c cVar = c.a;
                c.a.e(sSLSocket, wdVar.i.d, wdVar.j);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            final nt4 nt4VarA = nt4.a.a(session);
            HostnameVerifier hostnameVerifier = wdVar.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(wdVar.i.d, session)) {
                final c61 c61Var = wdVar.e;
                c61Var.getClass();
                this.s = new nt4(nt4VarA.a, nt4VarA.b, nt4VarA.c, new mh4() { // from class: uw1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ln4 ln4Var = c61Var.b;
                        ln4Var.getClass();
                        return ln4Var.z0(wdVar.i.d, nt4VarA.a());
                    }
                });
                wdVar.i.d.getClass();
                Iterator<T> it = c61Var.a.iterator();
                String strG = null;
                if (it.hasNext()) {
                    ((c61.a) it.next()).getClass();
                    w2a.n(null, "**.", false);
                    throw null;
                }
                if (cx1Var.b) {
                    c cVar2 = c.a;
                    strG = c.a.g(sSLSocket);
                }
                this.r = sSLSocket;
                this.u = new gy0(new ot2(sSLSocket));
                if (strG != null) {
                    gf8.u.getClass();
                    gf8VarA = gf8.a.a(strG);
                } else {
                    gf8VarA = gf8.HTTP_1_1;
                }
                this.t = gf8VarA;
                c cVar3 = c.a;
                c.a.getClass();
                return;
            }
            List<Certificate> listA = nt4VarA.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + wdVar.i.d + " not verified (no certificates)");
            }
            Certificate certificate = listA.get(0);
            certificate.getClass();
            X509Certificate x509Certificate = (X509Certificate) certificate;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(wdVar.i.d);
            sb.append(" not verified:\n            |    certificate: ");
            c61 c61Var2 = c61.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            g01 g01Var = g01.w;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(g01.a.d(encoded).f("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(th1.K(jg7.a(x509Certificate, 7), jg7.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(s2a.c(sb.toString()));
        } catch (Throwable th) {
            c cVar4 = c.a;
            c.a.getClass();
            ytb.c(sSLSocket);
            throw th;
        }
    }

    public final fy8.a k() throws IOException {
        jp8 jp8Var;
        jp8 jp8Var2 = this.m;
        jp8Var2.getClass();
        dy8 dy8Var = this.j;
        wd wdVar = dy8Var.a;
        InetSocketAddress inetSocketAddress = dy8Var.c;
        String str = "CONNECT " + ytb.j(wdVar.i, true) + " HTTP/1.1";
        while (true) {
            gy0 gy0Var = this.u;
            if (gy0Var == null) {
                xj5.e("socket");
                throw null;
            }
            t35 t35Var = new t35(null, this, gy0Var);
            gy0 gy0Var2 = this.u;
            if (gy0Var2 == null) {
                xj5.e("socket");
                throw null;
            }
            voa voaVarTimeout = gy0Var2.b.t.timeout();
            long j = this.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            voaVarTimeout.g(j, timeUnit);
            gy0 gy0Var3 = this.u;
            if (gy0Var3 == null) {
                xj5.e("socket");
                throw null;
            }
            gy0Var3.c.t.timeout().g(this.d, timeUnit);
            t35Var.m(jp8Var2.c, str);
            t35Var.c();
            qu8.a aVarG = t35Var.g(false);
            aVarG.getClass();
            aVarG.a = jp8Var2;
            qu8 qu8VarA = aVarG.a();
            int i = qu8VarA.w;
            long jE = ytb.e(qu8VarA);
            if (jE != -1) {
                t35.d dVarL = t35Var.l(qu8VarA.t.a, jE);
                ytb.h(dVarL, Integer.MAX_VALUE);
                dVarL.close();
            }
            if (i == 200) {
                jp8Var = null;
                break;
            }
            if (i != 407) {
                o03.a(pp2.a(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            jp8 jp8VarA = dy8Var.a.f.a(dy8Var, qu8VarA);
            if (jp8VarA == null) {
                o03.a("Failed to authenticate with proxy");
                return null;
            }
            String strD = qu8VarA.y.d("Connection");
            if (strD == null) {
                strD = null;
            }
            if ("close".equalsIgnoreCase(strD)) {
                jp8Var = jp8VarA;
                break;
            }
            jp8Var2 = jp8VarA;
        }
        if (jp8Var == null) {
            return new fy8.a(this, null, null, 6);
        }
        Socket socket = this.q;
        if (socket != null) {
            ytb.c(socket);
        }
        int i2 = this.l + 1;
        oi8 oi8Var = this.h;
        if (i2 < 21) {
            oi8Var.x.getClass();
            inetSocketAddress.getClass();
            return new fy8.a(this, l(this, i2, jp8Var, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        oi8Var.x.getClass();
        inetSocketAddress.getClass();
        this.b.a.getClass();
        yw1.a aVar = yw1.a;
        return new fy8.a(this, null, protocolException, 2);
    }

    public final vw1 m(List<cx1> list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            cx1 cx1Var = list.get(i2);
            cx1Var.getClass();
            if (cx1Var.a && (((strArr = cx1Var.d) == null || vtb.h(strArr, sSLSocket.getEnabledProtocols(), m47.t)) && ((strArr2 = cx1Var.c) == null || vtb.h(strArr2, sSLSocket.getEnabledCipherSuites(), zc1.c)))) {
                return l(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final vw1 n(List<cx1> list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.n != -1) {
            return this;
        }
        vw1 vw1VarM = m(list, sSLSocket);
        if (vw1VarM != null) {
            return vw1VarM;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // in3.a
    public final void a() {
    }

    @Override // in3.a
    public final void f(oi8 oi8Var, IOException iOException) {
    }
}
