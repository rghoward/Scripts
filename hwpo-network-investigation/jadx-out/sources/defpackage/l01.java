package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import tx0.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l01 implements Closeable, Flushable {
    public final u13 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends su8 {
        public final u13.c v;
        public final String w;
        public final String x;
        public final ni8 y;

        /* JADX INFO: renamed from: l01$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0192a extends td4 {
            public final /* synthetic */ a u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0192a(kw9 kw9Var, a aVar) {
                super(kw9Var);
                this.u = aVar;
            }

            @Override // defpackage.td4, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.u.v.close();
                super.close();
            }
        }

        public a(u13.c cVar, String str, String str2) {
            this.v = cVar;
            this.w = str;
            this.x = str2;
            this.y = new ni8(new C0192a((kw9) cVar.v.get(1), this));
        }

        @Override // defpackage.su8
        public final long k() {
            String str = this.x;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = vtb.a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // defpackage.su8
        public final wq6 m() {
            String str = this.w;
            if (str != null) {
                ol8 ol8Var = wq6.e;
                try {
                    return wq6.a.a(str);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }

        @Override // defpackage.su8
        public final hy0 p() {
            return this.y;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b {
        public final u13.a a;
        public final yq9 b;
        public final a c;
        public boolean d;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends sd4 {
            public final /* synthetic */ l01 u;
            public final /* synthetic */ b v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l01 l01Var, b bVar, yq9 yq9Var) {
                super(yq9Var);
                this.u = l01Var;
                this.v = bVar;
            }

            @Override // defpackage.sd4, defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                l01 l01Var = this.u;
                b bVar = this.v;
                synchronized (l01Var) {
                    if (bVar.d) {
                        return;
                    }
                    bVar.d = true;
                    super.close();
                    this.v.a.b();
                }
            }
        }

        public b(u13.a aVar) {
            this.a = aVar;
            yq9 yq9VarD = aVar.d(1);
            this.b = yq9VarD;
            this.c = new a(l01.this, this, yq9VarD);
        }

        public final void a() {
            synchronized (l01.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                vtb.b(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public static String a(f55 f55Var) {
            f55Var.getClass();
            g01 g01Var = g01.w;
            return g01.a.c(f55Var.i).f("MD5").h();
        }

        public static int b(ni8 ni8Var) throws IOException {
            try {
                tx0 tx0Var = ni8Var.u;
                ni8Var.n0(1L);
                long j = 0;
                while (true) {
                    long j2 = j + 1;
                    if (!ni8Var.request(j2)) {
                        break;
                    }
                    byte bU = tx0Var.u(j);
                    if ((bU >= 48 && bU <= 57) || (j == 0 && bU == 45)) {
                        j = j2;
                    }
                    if (j != 0) {
                        break;
                    }
                    ta1.a(16);
                    String string = Integer.toString(bU, 16);
                    string.getClass();
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long J = tx0Var.J();
                String strI = ni8Var.I(Long.MAX_VALUE);
                if (J >= 0 && J <= 2147483647L && strI.length() <= 0) {
                    return (int) J;
                }
                throw new IOException("expected an int but was \"" + J + strI + '\"');
            } catch (NumberFormatException e) {
                o03.a(e.getMessage());
                return 0;
            }
        }

        public static Set c(nu4 nu4Var) {
            int size = nu4Var.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(nu4Var.e(i))) {
                    String strJ = nu4Var.j(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        comparator.getClass();
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = z2a.J(strJ, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(z2a.R((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? of3.t : treeSet;
        }
    }

    public l01(File file) {
        tn5 tn5Var = fy3.t;
        String str = du7.u;
        du7 du7VarB = du7.a.b(file);
        tn5Var.getClass();
        z9a z9aVar = z9a.l;
        z9aVar.getClass();
        this.t = new u13(tn5Var, du7VarB, z9aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.t.flush();
    }

    public final void h(jp8 jp8Var) {
        jp8Var.getClass();
        u13 u13Var = this.t;
        String strA = c.a(jp8Var.a);
        synchronized (u13Var) {
            strA.getClass();
            u13Var.t();
            u13Var.h();
            u13.K(strA);
            u13.b bVar = u13Var.B.get(strA);
            if (bVar == null) {
                return;
            }
            u13Var.H(bVar);
            if (u13Var.z <= u13Var.v) {
                u13Var.H = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final String k;
        public static final String l;
        public final f55 a;
        public final nu4 b;
        public final String c;
        public final gf8 d;
        public final int e;
        public final String f;
        public final nu4 g;
        public final nt4 h;
        public final long i;
        public final long j;

        static {
            okhttp3.internal.platform.c cVar = okhttp3.internal.platform.c.a;
            okhttp3.internal.platform.c.a.getClass();
            k = "OkHttp-Sent-Millis";
            okhttp3.internal.platform.c.a.getClass();
            l = "OkHttp-Received-Millis";
        }

        public d(kw9 kw9Var) throws IOException {
            f55 f55VarA;
            jpa jpaVarA;
            kw9Var.getClass();
            try {
                ni8 ni8Var = new ni8(kw9Var);
                String strI = ni8Var.I(Long.MAX_VALUE);
                try {
                    f55.a aVar = new f55.a();
                    aVar.d(null, strI);
                    f55VarA = aVar.a();
                } catch (IllegalArgumentException unused) {
                    f55VarA = null;
                }
                if (f55VarA == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strI));
                    okhttp3.internal.platform.c cVar = okhttp3.internal.platform.c.a;
                    okhttp3.internal.platform.c.a.j("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.a = f55VarA;
                this.c = ni8Var.I(Long.MAX_VALUE);
                nu4.a aVar2 = new nu4.a();
                int iB = c.b(ni8Var);
                for (int i = 0; i < iB; i++) {
                    aVar2.b(ni8Var.I(Long.MAX_VALUE));
                }
                this.b = aVar2.d();
                d1a d1aVarA = d1a.a.a(ni8Var.I(Long.MAX_VALUE));
                this.d = d1aVarA.a;
                this.e = d1aVarA.b;
                this.f = d1aVarA.c;
                nu4.a aVar3 = new nu4.a();
                int iB2 = c.b(ni8Var);
                for (int i2 = 0; i2 < iB2; i2++) {
                    aVar3.b(ni8Var.I(Long.MAX_VALUE));
                }
                String str = k;
                String strE = aVar3.e(str);
                String str2 = l;
                String strE2 = aVar3.e(str2);
                aVar3.f(str);
                aVar3.f(str2);
                this.i = strE != null ? Long.parseLong(strE) : 0L;
                this.j = strE2 != null ? Long.parseLong(strE2) : 0L;
                this.g = aVar3.d();
                if (this.a.f()) {
                    String strI2 = ni8Var.I(Long.MAX_VALUE);
                    if (strI2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strI2 + '\"');
                    }
                    zc1 zc1VarB = zc1.b.b(ni8Var.I(Long.MAX_VALUE));
                    List listA = a(ni8Var);
                    List listA2 = a(ni8Var);
                    if (ni8Var.z()) {
                        jpaVarA = jpa.SSL_3_0;
                    } else {
                        jpa.a aVar4 = jpa.u;
                        String strI3 = ni8Var.I(Long.MAX_VALUE);
                        aVar4.getClass();
                        jpaVarA = jpa.a.a(strI3);
                    }
                    this.h = new nt4(jpaVarA, zc1VarB, ytb.k(listA2), new mt4(ytb.k(listA)));
                } else {
                    this.h = null;
                }
                g2b g2bVar = g2b.a;
                kw9Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(kw9Var, th);
                    throw th2;
                }
            }
        }

        public static List a(ni8 ni8Var) throws IOException {
            int iB = c.b(ni8Var);
            if (iB == -1) {
                return hf3.t;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iB);
                for (int i = 0; i < iB; i++) {
                    String strI = ni8Var.I(Long.MAX_VALUE);
                    tx0 tx0Var = new tx0();
                    g01 g01Var = g01.w;
                    g01 g01VarA = g01.a.a(strI);
                    if (g01VarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    tx0Var.Y(g01VarA);
                    arrayList.add(certificateFactory.generateCertificate(tx0Var.new a()));
                }
                return arrayList;
            } catch (CertificateException e) {
                o03.a(e.getMessage());
                return null;
            }
        }

        public static void b(mi8 mi8Var, List list) throws IOException {
            try {
                mi8Var.o0(list.size());
                mi8Var.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    g01 g01Var = g01.w;
                    encoded.getClass();
                    mi8Var.R(g01.a.d(encoded).a());
                    mi8Var.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                o03.a(e.getMessage());
            }
        }

        public final void c(u13.a aVar) throws Throwable {
            f55 f55Var = this.a;
            nt4 nt4Var = this.h;
            nu4 nu4Var = this.g;
            nu4 nu4Var2 = this.b;
            mi8 mi8Var = new mi8(aVar.d(0));
            try {
                mi8Var.R(f55Var.i);
                mi8Var.writeByte(10);
                mi8Var.R(this.c);
                mi8Var.writeByte(10);
                mi8Var.o0(nu4Var2.size());
                mi8Var.writeByte(10);
                int size = nu4Var2.size();
                for (int i = 0; i < size; i++) {
                    mi8Var.R(nu4Var2.e(i));
                    mi8Var.R(": ");
                    mi8Var.R(nu4Var2.j(i));
                    mi8Var.writeByte(10);
                }
                gf8 gf8Var = this.d;
                int i2 = this.e;
                String str = this.f;
                gf8Var.getClass();
                str.getClass();
                StringBuilder sb = new StringBuilder();
                if (gf8Var == gf8.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i2);
                sb.append(' ');
                sb.append(str);
                mi8Var.R(sb.toString());
                mi8Var.writeByte(10);
                mi8Var.o0(nu4Var.size() + 2);
                mi8Var.writeByte(10);
                int size2 = nu4Var.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    mi8Var.R(nu4Var.e(i3));
                    mi8Var.R(": ");
                    mi8Var.R(nu4Var.j(i3));
                    mi8Var.writeByte(10);
                }
                mi8Var.R(k);
                mi8Var.R(": ");
                mi8Var.o0(this.i);
                mi8Var.writeByte(10);
                mi8Var.R(l);
                mi8Var.R(": ");
                mi8Var.o0(this.j);
                mi8Var.writeByte(10);
                if (f55Var.f()) {
                    mi8Var.writeByte(10);
                    nt4Var.getClass();
                    mi8Var.R(nt4Var.b.a);
                    mi8Var.writeByte(10);
                    b(mi8Var, nt4Var.a());
                    b(mi8Var, nt4Var.c);
                    mi8Var.R(nt4Var.a.t);
                    mi8Var.writeByte(10);
                }
                g2b g2bVar = g2b.a;
                mi8Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(mi8Var, th);
                    throw th2;
                }
            }
        }

        public d(qu8 qu8Var) {
            nu4 nu4VarD;
            jp8 jp8Var = qu8Var.t;
            this.a = jp8Var.a;
            qu8 qu8Var2 = qu8Var.B;
            qu8Var2.getClass();
            nu4 nu4Var = qu8Var2.t.c;
            nu4 nu4Var2 = qu8Var.y;
            Set setC = c.c(nu4Var2);
            if (setC.isEmpty()) {
                nu4VarD = nu4.u;
            } else {
                nu4.a aVar = new nu4.a();
                int size = nu4Var.size();
                for (int i = 0; i < size; i++) {
                    String strE = nu4Var.e(i);
                    if (setC.contains(strE)) {
                        aVar.a(strE, nu4Var.j(i));
                    }
                }
                nu4VarD = aVar.d();
            }
            this.b = nu4VarD;
            this.c = jp8Var.b;
            this.d = qu8Var.u;
            this.e = qu8Var.w;
            this.f = qu8Var.v;
            this.g = nu4Var2;
            this.h = qu8Var.x;
            this.i = qu8Var.E;
            this.j = qu8Var.F;
        }
    }
}
