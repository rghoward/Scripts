package defpackage;

import io.ably.lib.http.HttpConstants;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gj8 implements fy8 {
    public final z9a a;
    public final ri8 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final wd i;
    public final ey8 j;
    public final oi8 k;
    public final boolean l;
    public gy8.a m;
    public gy8 n;
    public dy8 o;
    public final h30<fy8.b> p;

    public gj8(z9a z9aVar, ri8 ri8Var, int i, int i2, int i3, int i4, boolean z, boolean z2, wd wdVar, ey8 ey8Var, oi8 oi8Var, jp8 jp8Var) {
        z9aVar.getClass();
        ri8Var.getClass();
        ey8Var.getClass();
        this.a = z9aVar;
        this.b = ri8Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = wdVar;
        this.j = ey8Var;
        this.k = oi8Var;
        this.l = !xj5.a(jp8Var.b, HttpConstants.Methods.GET);
        this.p = new h30<>();
    }

    @Override // defpackage.fy8
    public final boolean a(f55 f55Var) {
        f55Var.getClass();
        f55 f55Var2 = this.i.i;
        return f55Var.e == f55Var2.e && xj5.a(f55Var.d, f55Var2.d);
    }

    @Override // defpackage.fy8
    public final boolean b(pi8 pi8Var) {
        gy8 gy8Var;
        dy8 dy8Var;
        if (this.p.isEmpty() && this.o == null) {
            if (pi8Var != null) {
                synchronized (pi8Var) {
                    dy8Var = null;
                    if (pi8Var.m == 0 && pi8Var.k && ytb.a(pi8Var.c.a.i, this.i.i)) {
                        dy8Var = pi8Var.c;
                    }
                }
                if (dy8Var != null) {
                    this.o = dy8Var;
                    return true;
                }
            }
            gy8.a aVar = this.m;
            if ((aVar == null || aVar.b >= aVar.a.size()) && (gy8Var = this.n) != null) {
                return gy8Var.a();
            }
        }
        return true;
    }

    @Override // defpackage.fy8
    public final wd c() {
        return this.i;
    }

    public final fy8.b d() throws IOException {
        boolean z;
        Socket socketH;
        tv8 tv8Var;
        vw1 vw1VarE;
        String hostAddress;
        int port;
        List listE;
        boolean zContains;
        pi8 pi8Var = this.k.C;
        if (pi8Var == null) {
            tv8Var = null;
        } else {
            boolean zG = pi8Var.g(this.l);
            synchronized (pi8Var) {
                boolean z2 = pi8Var.k;
                try {
                    if (zG) {
                        z = false;
                        socketH = (z2 || !a(pi8Var.c.a.i)) ? this.k.h() : null;
                    } else {
                        z = !z2;
                        pi8Var.k = true;
                        socketH = this.k.h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.C == null) {
                if (socketH != null) {
                    ytb.c(socketH);
                }
                this.k.x.getClass();
                om3.a aVar = om3.a;
                pi8Var.i.getClass();
                if (socketH != null || z) {
                    pi8Var.i.getClass();
                }
                tv8Var = null;
            } else {
                if (socketH != null) {
                    aa0.c("Check failed.");
                    return null;
                }
                tv8Var = new tv8(pi8Var);
            }
        }
        if (tv8Var != null) {
            return tv8Var;
        }
        tv8 tv8VarF = f(null, null);
        if (tv8VarF != null) {
            return tv8VarF;
        }
        if (!this.p.isEmpty()) {
            return this.p.removeFirst();
        }
        dy8 dy8Var = this.o;
        if (dy8Var != null) {
            this.o = null;
            vw1VarE = e(dy8Var, null);
        } else {
            gy8.a aVar2 = this.m;
            if (aVar2 == null || aVar2.b >= aVar2.a.size()) {
                gy8 gy8Var = this.n;
                if (gy8Var == null) {
                    gy8Var = new gy8(this.i, this.j, this.k, this.h);
                    this.n = gy8Var;
                }
                if (!gy8Var.a()) {
                    o03.a("exhausted all routes");
                    return null;
                }
                if (!gy8Var.a()) {
                    vl.b();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (gy8Var.f < gy8Var.e.size()) {
                    wd wdVar = gy8Var.a;
                    if (gy8Var.f >= gy8Var.e.size()) {
                        throw new SocketException("No route to " + wdVar.i.d + "; exhausted proxy configurations: " + gy8Var.e);
                    }
                    List<? extends Proxy> list = gy8Var.e;
                    int i = gy8Var.f;
                    gy8Var.f = i + 1;
                    Proxy proxy = list.get(i);
                    oi8 oi8Var = gy8Var.c;
                    ArrayList arrayList2 = new ArrayList();
                    gy8Var.g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        f55 f55Var = wdVar.i;
                        hostAddress = f55Var.d;
                        port = f55Var.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            r.a(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        ol8 ol8Var = stb.a;
                        hostAddress.getClass();
                        if (stb.a.c(hostAddress)) {
                            listE = ws0.h(InetAddress.getByName(hostAddress));
                        } else {
                            oi8Var.x.getClass();
                            wdVar.a.getClass();
                            hostAddress.getClass();
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                allByName.getClass();
                                List listE2 = u30.E(allByName);
                                if (listE2.isEmpty()) {
                                    throw new UnknownHostException(wdVar.a + " returned no addresses for " + hostAddress);
                                }
                                oi8Var.x.getClass();
                                listE = listE2;
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (gy8Var.d && listE.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listE) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = vtb.a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                e96 e96VarF = ws0.f();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        e96VarF.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        e96VarF.add(it2.next());
                                    }
                                }
                                listE = ws0.e(e96VarF);
                            }
                        }
                        Iterator it3 = listE.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator<? extends InetSocketAddress> it4 = gy8Var.g.iterator();
                    while (it4.hasNext()) {
                        dy8 dy8Var2 = new dy8(gy8Var.a, proxy, it4.next());
                        ey8 ey8Var = gy8Var.b;
                        synchronized (ey8Var) {
                            zContains = ey8Var.a.contains(dy8Var2);
                        }
                        if (zContains) {
                            gy8Var.h.add(dy8Var2);
                        } else {
                            arrayList.add(dy8Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    rh1.o(gy8Var.h, arrayList);
                    gy8Var.h.clear();
                }
                gy8.a aVar3 = new gy8.a(arrayList);
                this.m = aVar3;
                if (this.k.K) {
                    o03.a("Canceled");
                    return null;
                }
                if (aVar3.b >= arrayList.size()) {
                    vl.b();
                    return null;
                }
                int i2 = aVar3.b;
                aVar3.b = i2 + 1;
                vw1VarE = e((dy8) arrayList.get(i2), arrayList);
            } else {
                int i3 = aVar2.b;
                ArrayList arrayList5 = aVar2.a;
                if (i3 >= arrayList5.size()) {
                    vl.b();
                    return null;
                }
                int i4 = aVar2.b;
                aVar2.b = i4 + 1;
                vw1VarE = e((dy8) arrayList5.get(i4), null);
            }
        }
        tv8 tv8VarF2 = f(vw1VarE, vw1VarE.k);
        return tv8VarF2 != null ? tv8VarF2 : vw1VarE;
    }

    public final vw1 e(dy8 dy8Var, ArrayList arrayList) throws UnknownServiceException {
        gf8 gf8Var = gf8.H2_PRIOR_KNOWLEDGE;
        dy8Var.getClass();
        wd wdVar = dy8Var.a;
        if (wdVar.c == null) {
            if (!wdVar.k.contains(cx1.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = dy8Var.a.i.d;
            c cVar = c.a;
            if (!c.a.i(str)) {
                throw new UnknownServiceException(sk0.c("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (wdVar.j.contains(gf8Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        jp8 jp8Var = null;
        if (dy8Var.b.type() == Proxy.Type.HTTP) {
            wd wdVar2 = dy8Var.a;
            if (wdVar2.c != null || wdVar2.j.contains(gf8Var)) {
                jp8.a aVar = new jp8.a();
                f55 f55Var = dy8Var.a.i;
                f55Var.getClass();
                aVar.a = f55Var;
                aVar.c("CONNECT", null);
                wd wdVar3 = dy8Var.a;
                aVar.b("Host", ytb.j(wdVar3.i, true));
                aVar.b("Proxy-Connection", "Keep-Alive");
                aVar.b("User-Agent", "okhttp/5.3.2");
                jp8 jp8Var2 = new jp8(aVar);
                qu8.a aVar2 = new qu8.a();
                aVar2.a = jp8Var2;
                aVar2.b = gf8.HTTP_1_1;
                aVar2.c = 407;
                aVar2.d = "Preemptive Authenticate";
                aVar2.l = -1L;
                aVar2.m = -1L;
                nu4.a aVar3 = aVar2.f;
                aVar3.getClass();
                rtb.b(HttpConstants.Headers.PROXY_AUTHENTICATE);
                rtb.c("OkHttp-Preemptive", HttpConstants.Headers.PROXY_AUTHENTICATE);
                aVar3.f(HttpConstants.Headers.PROXY_AUTHENTICATE);
                rtb.a(aVar3, HttpConstants.Headers.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
                jp8 jp8VarA = wdVar3.f.a(dy8Var, aVar2.a());
                jp8Var = jp8VarA == null ? jp8Var2 : jp8VarA;
            }
        }
        return new vw1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, dy8Var, arrayList, 0, jp8Var, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:55:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:55:0x0034 }] */
    public final tv8 f(vw1 vw1Var, List<dy8> list) {
        pi8 next;
        boolean z;
        boolean z2;
        Socket socketH;
        ri8 ri8Var = this.b;
        boolean z3 = this.l;
        wd wdVar = this.i;
        oi8 oi8Var = this.k;
        boolean z4 = vw1Var != null && vw1Var.b();
        ri8Var.getClass();
        Iterator<pi8> it = ri8Var.e.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            next.getClass();
            synchronized (next) {
                if (z4) {
                    try {
                        if (!(next.j != null)) {
                            z = false;
                        } else if (next.e(wdVar, list)) {
                            oi8Var.b(next);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (next.e(wdVar, list)) {
                    z = false;
                } else {
                    oi8Var.b(next);
                    z = true;
                }
            }
            if (z) {
                if (next.g(z3)) {
                    break;
                }
                synchronized (next) {
                    z2 = next.k;
                    next.k = true;
                    socketH = oi8Var.h();
                }
                if (socketH != null) {
                    ytb.c(socketH);
                    ri8Var.a.getClass();
                } else if (!z2) {
                    ri8Var.a.getClass();
                }
            }
        }
        if (next == null) {
            return null;
        }
        if (vw1Var != null) {
            this.o = vw1Var.j;
            Socket socket = vw1Var.r;
            if (socket != null) {
                ytb.c(socket);
            }
        }
        this.k.x.getClass();
        om3.a aVar = om3.a;
        next.i.getClass();
        return new tv8(next);
    }
}
