package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g45 implements in3 {
    public static final List<String> g = ytb.l(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List<String> h = ytb.l(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final pi8 a;
    public final aj8 b;
    public final c45 c;
    public volatile i45 d;
    public final gf8 e;
    public volatile boolean f;

    public g45(lg7 lg7Var, pi8 pi8Var, aj8 aj8Var, c45 c45Var) {
        lg7Var.getClass();
        c45Var.getClass();
        this.a = pi8Var;
        this.b = aj8Var;
        this.c = c45Var;
        List<gf8> list = lg7Var.t;
        gf8 gf8Var = gf8.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(gf8Var) ? gf8Var : gf8.HTTP_2;
    }

    @Override // defpackage.in3
    public final kw9 a(qu8 qu8Var) {
        i45 i45Var = this.d;
        i45Var.getClass();
        return i45Var.h;
    }

    @Override // defpackage.in3
    public final void b(jp8 jp8Var) throws IOException {
        int i;
        i45 i45Var;
        boolean z;
        jp8Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = jp8Var.d != null;
        nu4 nu4Var = jp8Var.c;
        ArrayList arrayList = new ArrayList(nu4Var.size() + 4);
        arrayList.add(new cu4(cu4.f, jp8Var.b));
        g01 g01Var = cu4.g;
        f55 f55Var = jp8Var.a;
        f55Var.getClass();
        String strB = f55Var.b();
        String strD = f55Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new cu4(g01Var, strB));
        String strD2 = nu4Var.d("Host");
        if (strD2 != null) {
            arrayList.add(new cu4(cu4.i, strD2));
        }
        arrayList.add(new cu4(cu4.h, f55Var.a));
        int size = nu4Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strE = nu4Var.e(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strE.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && nu4Var.j(i2).equals("trailers"))) {
                arrayList.add(new cu4(lowerCase, nu4Var.j(i2)));
            }
        }
        c45 c45Var = this.c;
        c45Var.getClass();
        boolean z3 = !z2;
        synchronized (c45Var.P) {
            synchronized (c45Var) {
                try {
                    if (c45Var.x > 1073741823) {
                        c45Var.p(ul3.REFUSED_STREAM);
                    }
                    if (c45Var.y) {
                        throw new bx1();
                    }
                    i = c45Var.x;
                    c45Var.x = i + 2;
                    i45Var = new i45(i, c45Var, z3, false, null);
                    z = !z2 || c45Var.M >= c45Var.N || i45Var.d >= i45Var.e;
                    if (i45Var.j()) {
                        c45Var.u.put(Integer.valueOf(i), i45Var);
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c45Var.P.t(z3, i, arrayList);
        }
        if (z) {
            c45Var.P.flush();
        }
        this.d = i45Var;
        boolean z4 = this.f;
        i45 i45Var2 = this.d;
        if (z4) {
            i45Var2.getClass();
            i45Var2.g(ul3.CANCEL);
            o03.a("Canceled");
            return;
        }
        i45Var2.getClass();
        i45.c cVar = i45Var2.j;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g(j, timeUnit);
        i45 i45Var3 = this.d;
        i45Var3.getClass();
        i45Var3.k.g(this.b.h, timeUnit);
    }

    @Override // defpackage.in3
    public final void c() throws IOException {
        i45 i45Var = this.d;
        i45Var.getClass();
        i45Var.i.close();
    }

    @Override // defpackage.in3
    public final void cancel() {
        this.f = true;
        i45 i45Var = this.d;
        if (i45Var != null) {
            i45Var.g(ul3.CANCEL);
        }
    }

    @Override // defpackage.in3
    public final boolean d() {
        boolean z;
        i45 i45Var = this.d;
        if (i45Var == null) {
            return false;
        }
        synchronized (i45Var) {
            i45.b bVar = i45Var.h;
            z = bVar.u && bVar.w.z();
        }
        return z;
    }

    @Override // defpackage.in3
    public final long e(qu8 qu8Var) {
        if (u45.a(qu8Var)) {
            return ytb.e(qu8Var);
        }
        return 0L;
    }

    @Override // defpackage.in3
    public final yq9 f(jp8 jp8Var, long j) {
        jp8Var.getClass();
        i45 i45Var = this.d;
        i45Var.getClass();
        return i45Var.i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // defpackage.in3
    public final qu8.a g(boolean z) throws IOException {
        int i;
        nu4 nu4Var;
        i45 i45Var = this.d;
        if (i45Var == null) {
            o03.a("stream wasn't created");
            return null;
        }
        synchronized (i45Var) {
            while (true) {
                if (!i45Var.f.isEmpty() || i45Var.h() != null) {
                    break;
                }
                if (!z) {
                    i45Var.b.getClass();
                    i45.a aVar = i45Var.i;
                    i = aVar.v || aVar.t ? 1 : 0;
                }
                if (i != 0) {
                    i45Var.j.i();
                }
                try {
                    try {
                        i45Var.wait();
                        if (i != 0) {
                            i45Var.j.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        i45Var.j.m();
                    }
                    throw th;
                }
            }
            if (i45Var.f.isEmpty()) {
                IOException iOException = i45Var.m;
                if (iOException != null) {
                    throw iOException;
                }
                ul3 ul3VarH = i45Var.h();
                ul3VarH.getClass();
                throw new v1a(ul3VarH);
            }
            nu4 nu4VarRemoveFirst = i45Var.f.removeFirst();
            nu4VarRemoveFirst.getClass();
            nu4Var = nu4VarRemoveFirst;
        }
        gf8 gf8Var = this.e;
        gf8Var.getClass();
        nu4.a aVar2 = new nu4.a();
        int size = nu4Var.size();
        d1a d1aVarA = null;
        for (i = 0; i < size; i++) {
            String strE = nu4Var.e(i);
            String strJ = nu4Var.j(i);
            if (strE.equals(":status")) {
                d1aVarA = d1a.a.a("HTTP/1.1 ".concat(strJ));
            } else if (!h.contains(strE)) {
                rtb.a(aVar2, strE, strJ);
            }
        }
        if (d1aVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        qu8.a aVar3 = new qu8.a();
        aVar3.b = gf8Var;
        aVar3.c = d1aVarA.b;
        aVar3.d = d1aVarA.c;
        aVar3.f = aVar2.d().f();
        if (z && aVar3.c == 100) {
            return null;
        }
        return aVar3;
    }

    @Override // defpackage.in3
    public final void h() {
        this.c.flush();
    }

    @Override // defpackage.in3
    public final qv9 i() {
        i45 i45Var = this.d;
        i45Var.getClass();
        return i45Var;
    }

    @Override // defpackage.in3
    public final in3.a j() {
        return this.a;
    }
}
