package defpackage;

import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nv8 implements vg5 {
    public final lg7 a;

    public nv8(lg7 lg7Var) {
        lg7Var.getClass();
        this.a = lg7Var;
    }

    public static int c(qu8 qu8Var, int i) {
        String strD = qu8Var.y.d("Retry-After");
        if (strD == null) {
            strD = null;
        }
        if (strD == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strD).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strD);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    public final jp8 a(qu8 qu8Var, gn3 gn3Var) throws ProtocolException {
        lg7 lg7Var;
        String strD;
        jp8 jp8Var;
        f55.a aVar;
        f55 f55VarA;
        jp8.a aVarB;
        boolean z;
        qp8 qp8Var;
        qu8 qu8Var2;
        dy8 dy8Var = gn3Var != null ? gn3Var.c().c : null;
        int i = qu8Var.w;
        jp8 jp8Var2 = qu8Var.t;
        String str = jp8Var2.b;
        if (i == 307 || i == 308) {
            lg7Var = this.a;
            if (lg7Var.h) {
                strD = qu8Var.y.d("Location");
                if (strD == null) {
                    strD = null;
                }
                jp8Var = qu8Var.t;
                if (strD != null) {
                    f55 f55Var = jp8Var.a;
                    f55Var.getClass();
                    try {
                        aVar = new f55.a();
                        aVar.d(f55Var, strD);
                    } catch (IllegalArgumentException unused) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        f55VarA = aVar.a();
                    } else {
                        f55VarA = null;
                    }
                    if (f55VarA != null && (xj5.a(f55VarA.a, jp8Var.a.a) || lg7Var.i)) {
                        aVarB = jp8Var.b();
                        if (db7.d(str)) {
                            int i2 = qu8Var.w;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                aVarB.c(str, z ? jp8Var.d : null);
                            } else {
                                aVarB.c(HttpConstants.Methods.GET, null);
                            }
                            if (!z) {
                                aVarB.c.f("Transfer-Encoding");
                                aVarB.c.f("Content-Length");
                                aVarB.c.f("Content-Type");
                            }
                        }
                        if (!ytb.a(jp8Var.a, f55VarA)) {
                            aVarB.c.f(HttpConstants.Headers.AUTHORIZATION);
                        }
                        aVarB.a = f55VarA;
                        return new jp8(aVarB);
                    }
                }
            }
        } else {
            if (i == 401) {
                this.a.g.getClass();
                return null;
            }
            if (i == 421) {
                qp8 qp8Var2 = jp8Var2.d;
                if ((qp8Var2 == null || !qp8Var2.isOneShot()) && gn3Var != null && !xj5.a(gn3Var.c.b().c().i.d, gn3Var.d.j().h().a.i.d)) {
                    pi8 pi8VarC = gn3Var.c();
                    synchronized (pi8VarC) {
                        pi8VarC.l = true;
                        g2b g2bVar = g2b.a;
                    }
                    return qu8Var.t;
                }
            } else if (i == 503) {
                qu8 qu8Var3 = qu8Var.D;
                if ((qu8Var3 == null || qu8Var3.w != 503) && c(qu8Var, Integer.MAX_VALUE) == 0) {
                    return qu8Var.t;
                }
            } else {
                if (i == 407) {
                    dy8Var.getClass();
                    if (dy8Var.b.type() == Proxy.Type.HTTP) {
                        return this.a.o.a(dy8Var, qu8Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i != 408) {
                    switch (i) {
                        case CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS /* 300 */:
                        case 301:
                        case 302:
                        case 303:
                            lg7Var = this.a;
                            if (lg7Var.h) {
                                strD = qu8Var.y.d("Location");
                                if (strD == null) {
                                    strD = null;
                                }
                                jp8Var = qu8Var.t;
                                if (strD != null) {
                                    f55 f55Var2 = jp8Var.a;
                                    f55Var2.getClass();
                                    aVar = new f55.a();
                                    aVar.d(f55Var2, strD);
                                    if (aVar != null) {
                                        f55VarA = aVar.a();
                                    } else {
                                        f55VarA = null;
                                    }
                                    if (f55VarA != null) {
                                        aVarB = jp8Var.b();
                                        if (db7.d(str)) {
                                            int i3 = qu8Var.w;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                aVarB.c(str, z ? jp8Var.d : null);
                                            } else {
                                                aVarB.c(str, z ? jp8Var.d : null);
                                            }
                                            if (!z) {
                                                aVarB.c.f("Transfer-Encoding");
                                                aVarB.c.f("Content-Length");
                                                aVarB.c.f("Content-Type");
                                            }
                                        }
                                        if (!ytb.a(jp8Var.a, f55VarA)) {
                                            aVarB.c.f(HttpConstants.Headers.AUTHORIZATION);
                                        }
                                        aVarB.a = f55VarA;
                                        return new jp8(aVarB);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (this.a.e && (((qp8Var = jp8Var2.d) == null || !qp8Var.isOneShot()) && (((qu8Var2 = qu8Var.D) == null || qu8Var2.w != 408) && c(qu8Var, 0) <= 0))) {
                    return qu8Var.t;
                }
            }
        }
        return null;
    }

    public final boolean b(IOException iOException, oi8 oi8Var, jp8 jp8Var) {
        qp8 qp8Var;
        boolean z = iOException instanceof bx1;
        if (!this.a.e) {
            return false;
        }
        if ((!z && (((qp8Var = jp8Var.d) != null && qp8Var.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        gn3 gn3Var = oi8Var.L;
        if (gn3Var == null || !gn3Var.f) {
            return false;
        }
        jn3 jn3Var = oi8Var.B;
        jn3Var.getClass();
        fy8 fy8VarB = jn3Var.b();
        gn3 gn3Var2 = oi8Var.L;
        return fy8VarB.b(gn3Var2 != null ? gn3Var2.c() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) throws Throwable {
        List list;
        int i;
        boolean z;
        qu8 qu8VarA;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        jg7 jg7Var;
        c61 c61Var;
        aj8 aj8Var = (aj8) aVar;
        jp8 jp8Var = aj8Var.e;
        oi8 oi8Var = aj8Var.a;
        List listL = hf3.t;
        boolean z3 = false;
        boolean z4 = true;
        jp8 jp8VarA = jp8Var;
        int i2 = 0;
        boolean z5 = true;
        qu8 qu8Var = null;
        while (true) {
            jp8VarA.getClass();
            if (oi8Var.E != null) {
                aa0.c("Check failed.");
                return null;
            }
            synchronized (oi8Var) {
                if (oi8Var.G) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (oi8Var.F || oi8Var.I || oi8Var.H) {
                    throw new IllegalStateException("Check failed.");
                }
                g2b g2bVar = g2b.a;
            }
            if (z5) {
                List list2 = listL;
                lg7 lg7Var = oi8Var.t;
                z9a z9aVar = lg7Var.D;
                ri8 ri8Var = oi8Var.w;
                int i3 = lg7Var.y;
                int i4 = lg7Var.z;
                i = aj8Var.f;
                int i5 = aj8Var.g;
                boolean z6 = lg7Var.e;
                boolean z7 = lg7Var.f;
                f55 f55Var = jp8VarA.a;
                f55Var.getClass();
                if (f55Var.f()) {
                    SSLSocketFactory sSLSocketFactory2 = lg7Var.q;
                    if (sSLSocketFactory2 == null) {
                        aa0.c("CLEARTEXT-only client");
                        return null;
                    }
                    jg7 jg7Var2 = lg7Var.u;
                    c61Var = lg7Var.v;
                    sSLSocketFactory = sSLSocketFactory2;
                    jg7Var = jg7Var2;
                } else {
                    sSLSocketFactory = null;
                    jg7Var = null;
                    c61Var = null;
                }
                list = list2;
                gj8 gj8Var = new gj8(z9aVar, ri8Var, i3, i4, i, i5, z6, z7, new wd(f55Var.d, f55Var.e, lg7Var.l, lg7Var.p, sSLSocketFactory, jg7Var, c61Var, lg7Var.o, lg7Var.m, lg7Var.t, lg7Var.s, lg7Var.n), oi8Var.t.C, oi8Var, jp8VarA);
                lg7 lg7Var2 = oi8Var.t;
                oi8Var.B = lg7Var2.f ? new mt3(gj8Var, lg7Var2.D) : new gd9(gj8Var);
            } else {
                list = listL;
            }
            try {
                if (oi8Var.K) {
                    throw new IOException("Canceled");
                }
                try {
                    qu8.a aVarK = aj8Var.a(jp8VarA).k();
                    aVarK.a = jp8VarA;
                    if (qu8Var != null) {
                        try {
                            qu8VarA = d3b.a(qu8Var);
                        } catch (Throwable th) {
                            th = th;
                            z = 1;
                        }
                    } else {
                        qu8VarA = null;
                    }
                    aVarK.k = qu8VarA;
                    qu8 qu8VarA2 = aVarK.a();
                    gn3 gn3Var = oi8Var.E;
                    jp8VarA = a(qu8VarA2, gn3Var);
                    if (jp8VarA == null) {
                        if (gn3Var != null && gn3Var.e) {
                            if (oi8Var.D) {
                                throw new IllegalStateException("Check failed.");
                            }
                            oi8Var.D = true;
                            oi8Var.y.j();
                        }
                        try {
                            oi8Var.x.getClass();
                            oi8Var.d(false);
                            return qu8VarA2;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                        i = 1;
                        try {
                            qp8 qp8Var = jp8VarA.d;
                            if (qp8Var == null || !qp8Var.isOneShot()) {
                                vtb.b(qu8VarA2.z);
                                int i6 = i2 + 1;
                                om3 om3Var = oi8Var.x;
                                if (i6 > 20) {
                                    om3Var.getClass();
                                    throw new ProtocolException("Too many follow-up requests: " + i6);
                                }
                                om3Var.getClass();
                                oi8Var.d(true);
                                qu8Var = qu8VarA2;
                                i2 = i6;
                                z3 = false;
                                z5 = true;
                                z4 = true;
                                listL = list;
                            } else {
                                try {
                                    oi8Var.x.getClass();
                                    oi8Var.d(false);
                                    return qu8VarA2;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z = i;
                        }
                    }
                    z = z2;
                } catch (IOException e) {
                    i = 1;
                    boolean zB = b(e, oi8Var, jp8VarA);
                    oi8Var.x.getClass();
                    if (!zB) {
                        byte[] bArr = vtb.a;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fn3.b(e, (Exception) it.next());
                        }
                        throw e;
                    }
                    listL = th1.L(list, e);
                    oi8Var.d(true);
                    z5 = false;
                    z3 = false;
                    z4 = true;
                }
                oi8Var.d(z);
                throw th;
            } catch (Throwable th5) {
                th = th5;
                i = 1;
            }
            z = i;
            oi8Var.d(z);
            throw th;
        }
    }
}
