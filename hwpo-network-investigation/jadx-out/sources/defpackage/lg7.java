package defpackage;

import io.intercom.android.sdk.api.TaggingSocketFactory;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lg7 implements o21.a {
    public static final List<gf8> F = ytb.l(new gf8[]{gf8.HTTP_2, gf8.HTTP_1_1});
    public static final List<cx1> G = ytb.l(new cx1[]{cx1.g, cx1.h});
    public final int A;
    public final long B;
    public final ey8 C;
    public final z9a D;
    public final zw1 E;
    public final g23 a;
    public final List<vg5> b;
    public final List<vg5> c;
    public final wtb d;
    public final boolean e;
    public final boolean f;
    public final ia0 g;
    public final boolean h;
    public final boolean i;
    public final i52 j;
    public final l01 k;
    public final fk2 l;
    public final Proxy m;
    public final ProxySelector n;
    public final ja0 o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List<cx1> s;
    public final List<gf8> t;
    public final jg7 u;
    public final c61 v;
    public final ln4 w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public int A;
        public int B;
        public long C;
        public ey8 D;
        public z9a E;
        public zw1 b;
        public wtb e;
        public boolean f;
        public boolean g;
        public ia0 h;
        public boolean i;
        public boolean j;
        public i52 k;
        public l01 l;
        public fk2 m;
        public Proxy n;
        public ProxySelector o;
        public ja0 p;
        public SocketFactory q;
        public SSLSocketFactory r;
        public X509TrustManager s;
        public List<cx1> t;
        public List<? extends gf8> u;
        public jg7 v;
        public c61 w;
        public ln4 x;
        public int y;
        public int z;
        public g23 a = new g23();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public a() {
            om3.a aVar = om3.a;
            TimeZone timeZone = ytb.a;
            aVar.getClass();
            this.e = new wtb(aVar);
            this.f = true;
            this.g = true;
            ia0 ia0Var = ja0.a;
            this.h = ia0Var;
            this.i = true;
            this.j = true;
            this.k = i52.a;
            this.m = fk2.F;
            this.p = ia0Var;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.q = socketFactory;
            this.t = lg7.G;
            this.u = lg7.F;
            this.v = jg7.a;
            this.w = c61.c;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 60000;
            this.C = 1024L;
        }

        public final void a(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.y = ytb.b(j, timeUnit);
        }

        public final void b(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.z = ytb.b(j, timeUnit);
        }

        public final void c(TaggingSocketFactory taggingSocketFactory) {
            if (taggingSocketFactory != this.q) {
                this.D = null;
            }
            this.q = taggingSocketFactory;
        }
    }

    public lg7(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.a = aVar.a;
        this.b = ytb.k(aVar.c);
        this.c = ytb.k(aVar.d);
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.i = aVar.j;
        this.j = aVar.k;
        this.k = aVar.l;
        this.l = aVar.m;
        Proxy proxy = aVar.n;
        this.m = proxy;
        if (proxy != null) {
            proxySelector = od7.a;
        } else {
            proxySelector = aVar.o;
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = od7.a;
            }
        }
        this.n = proxySelector;
        this.o = aVar.p;
        this.p = aVar.q;
        List<cx1> list = aVar.t;
        this.s = list;
        this.t = aVar.u;
        this.u = aVar.v;
        this.x = aVar.y;
        this.y = aVar.z;
        this.z = aVar.A;
        this.A = aVar.B;
        this.B = aVar.C;
        ey8 ey8Var = aVar.D;
        this.C = ey8Var == null ? new ey8() : ey8Var;
        z9a z9aVar = aVar.E;
        this.D = z9aVar == null ? z9a.l : z9aVar;
        zw1 zw1Var = aVar.b;
        if (zw1Var == null) {
            zw1Var = new zw1();
            aVar.b = zw1Var;
        }
        this.E = zw1Var;
        if (list != null && list.isEmpty()) {
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = c61.c;
            break;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.q = null;
                this.w = null;
                this.r = null;
                this.v = c61.c;
                break;
            }
            if (((cx1) it.next()).a) {
                SSLSocketFactory sSLSocketFactory = aVar.r;
                if (sSLSocketFactory != null) {
                    this.q = sSLSocketFactory;
                    ln4 ln4Var = aVar.x;
                    ln4Var.getClass();
                    this.w = ln4Var;
                    X509TrustManager x509TrustManager = aVar.s;
                    x509TrustManager.getClass();
                    this.r = x509TrustManager;
                    c61 c61Var = aVar.w;
                    c61Var.getClass();
                    this.v = xj5.a(c61Var.b, ln4Var) ? c61Var : new c61(c61Var.a, ln4Var);
                    break;
                }
                c cVar = c.a;
                c.a.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                trustManagers.getClass();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                        this.r = x509TrustManager2;
                        c cVar2 = c.a;
                        cVar2.getClass();
                        try {
                            SSLContext sSLContextL = cVar2.l();
                            sSLContextL.init(null, new TrustManager[]{x509TrustManager2}, null);
                            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                            socketFactory.getClass();
                            this.q = socketFactory;
                            ln4 ln4VarC = c.a.c(x509TrustManager2);
                            this.w = ln4VarC;
                            c61 c61Var2 = aVar.w;
                            c61Var2.getClass();
                            this.v = xj5.a(c61Var2.b, ln4VarC) ? c61Var2 : new c61(c61Var2.a, ln4VarC);
                            break;
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS: " + e, e);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                string.getClass();
                p.a("Unexpected default trust managers: ".concat(string));
                throw null;
            }
        }
        X509TrustManager x509TrustManager3 = this.r;
        ln4 ln4Var2 = this.w;
        SSLSocketFactory sSLSocketFactory2 = this.q;
        List<vg5> list2 = this.c;
        List<vg5> list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            p.b(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            p.b(list2, "Null network interceptor: ");
            throw null;
        }
        List<cx1> list4 = this.s;
        if (list4 == null || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((cx1) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        aa0.c("sslSocketFactory == null");
                        throw null;
                    }
                    if (ln4Var2 == null) {
                        aa0.c("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    aa0.c("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            aa0.c("Check failed.");
            throw null;
        }
        if (ln4Var2 != null) {
            aa0.c("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            aa0.c("Check failed.");
            throw null;
        }
        if (xj5.a(this.v, c61.c)) {
            g2b g2bVar = g2b.a;
        } else {
            aa0.c("Check failed.");
            throw null;
        }
    }

    @Override // o21.a
    public final oi8 a(jp8 jp8Var) {
        jp8Var.getClass();
        return new oi8(this, jp8Var, false);
    }

    public final a b() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.E;
        rh1.o(this.b, aVar.c);
        rh1.o(this.c, aVar.d);
        aVar.e = this.d;
        aVar.f = this.e;
        aVar.g = this.f;
        aVar.h = this.g;
        aVar.i = this.h;
        aVar.j = this.i;
        aVar.k = this.j;
        aVar.l = this.k;
        aVar.m = this.l;
        aVar.n = this.m;
        aVar.o = this.n;
        aVar.p = this.o;
        aVar.q = this.p;
        aVar.r = this.q;
        aVar.s = this.r;
        aVar.t = this.s;
        aVar.u = this.t;
        aVar.v = this.u;
        aVar.w = this.v;
        aVar.x = this.w;
        aVar.y = this.x;
        aVar.z = this.y;
        aVar.A = this.z;
        aVar.B = this.A;
        aVar.C = this.B;
        aVar.D = this.C;
        aVar.E = this.D;
        return aVar;
    }

    public final qj8 c(jp8 jp8Var, rkb rkbVar) {
        jp8Var.getClass();
        rkbVar.getClass();
        qj8 qj8Var = new qj8(this.D, jp8Var, rkbVar, new Random(), 0L, this.B, this.A);
        if (jp8Var.c.d("Sec-WebSocket-Extensions") != null) {
            qj8.g(qj8Var, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return qj8Var;
        }
        a aVarB = b();
        om3.a aVar = om3.a;
        aVar.getClass();
        TimeZone timeZone = ytb.a;
        aVarB.e = new wtb(aVar);
        List<gf8> list = qj8.x;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        gf8 gf8Var = gf8.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(gf8Var) && !arrayList.contains(gf8.HTTP_1_1)) {
            r.a(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return null;
        }
        if (arrayList.contains(gf8Var) && arrayList.size() > 1) {
            r.a(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return null;
        }
        if (arrayList.contains(gf8.HTTP_1_0)) {
            r.a(arrayList, "protocols must not contain http/1.0: ");
            return null;
        }
        if (arrayList.contains(null)) {
            z90.a("protocols must not contain null");
            return null;
        }
        arrayList.remove(gf8.SPDY_3);
        if (!arrayList.equals(aVarB.u)) {
            aVarB.D = null;
        }
        List<? extends gf8> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        aVarB.u = listUnmodifiableList;
        lg7 lg7Var = new lg7(aVarB);
        jp8.a aVarB2 = jp8Var.b();
        aVarB2.b("Upgrade", "websocket");
        aVarB2.b("Connection", "Upgrade");
        aVarB2.b("Sec-WebSocket-Key", qj8Var.g);
        aVarB2.b("Sec-WebSocket-Version", "13");
        aVarB2.b("Sec-WebSocket-Extensions", "permessage-deflate");
        jp8 jp8Var2 = new jp8(aVarB2);
        oi8 oi8Var = new oi8(lg7Var, jp8Var2, true);
        qj8Var.h = oi8Var;
        oi8Var.k(new rj8(qj8Var, jp8Var2));
        return qj8Var;
    }

    public lg7() {
        this(new a());
    }
}
