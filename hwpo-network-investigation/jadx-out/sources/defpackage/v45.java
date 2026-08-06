package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.AttributeType;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v45 implements vg5 {
    public final b a;
    public volatile of3 b;
    public volatile of3 c;
    public volatile a d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final /* synthetic */ a[] w;

        static {
            a aVar = new a("NONE", 0);
            t = aVar;
            a aVar2 = new a("BASIC", 1);
            a aVar3 = new a("HEADERS", 2);
            u = aVar3;
            a aVar4 = new a("BODY", 3);
            v = aVar4;
            w = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        public static final w45 a = new w45();

        void a(String str);
    }

    public v45(int i) {
        this.a = b.a;
        of3 of3Var = of3.t;
        this.b = of3Var;
        this.c = of3Var;
        this.d = a.t;
    }

    public final void a(nu4 nu4Var, int i) {
        of3 of3Var = this.b;
        nu4Var.e(i);
        of3Var.getClass();
        String strJ = nu4Var.j(i);
        this.a.a(nu4Var.e(i) + ": " + strJ);
    }

    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) throws Exception {
        long j;
        Long l;
        Charset charsetA;
        Long lValueOf;
        Charset charsetA2;
        a aVar2 = this.d;
        aj8 aj8Var = (aj8) aVar;
        jp8 jp8Var = aj8Var.e;
        if (aVar2 == a.t) {
            return aj8Var.a(jp8Var);
        }
        boolean z = true;
        boolean z2 = aVar2 == a.v;
        if (!z2 && aVar2 != a.u) {
            z = false;
        }
        qp8 qp8Var = jp8Var.d;
        gn3 gn3Var = aj8Var.d;
        pi8 pi8VarC = gn3Var != null ? gn3Var.c() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(jp8Var.b);
        sb.append(' ');
        f55 f55Var = jp8Var.a;
        f55Var.getClass();
        this.c.getClass();
        sb.append(f55Var.i);
        sb.append(pi8VarC != null ? " " + pi8VarC.g : BuildConfig.FLAVOR);
        String string = sb.toString();
        if (!z && qp8Var != null) {
            StringBuilder sbB = tn2.b(string, " (");
            sbB.append(qp8Var.contentLength());
            sbB.append("-byte body)");
            string = sbB.toString();
        }
        this.a.a(string);
        if (z) {
            nu4 nu4Var = jp8Var.c;
            if (qp8Var != null) {
                wq6 wq6VarContentType = qp8Var.contentType();
                if (wq6VarContentType != null) {
                    j = -1;
                    if (nu4Var.d("Content-Type") == null) {
                        this.a.a("Content-Type: " + wq6VarContentType);
                    }
                } else {
                    j = -1;
                }
                if (qp8Var.contentLength() != j && nu4Var.d("Content-Length") == null) {
                    this.a.a("Content-Length: " + qp8Var.contentLength());
                }
            } else {
                z2 = z2;
                z = z;
                j = -1;
            }
            int size = nu4Var.size();
            for (int i = 0; i < size; i++) {
                a(nu4Var, i);
            }
            if (!z2 || qp8Var == null) {
                this.a.a("--> END " + jp8Var.b);
            } else {
                String strD = jp8Var.c.d("Content-Encoding");
                if (strD != null && !strD.equalsIgnoreCase("identity") && !strD.equalsIgnoreCase("gzip")) {
                    this.a.a("--> END " + jp8Var.b + " (encoded body omitted)");
                } else if (qp8Var.isDuplex()) {
                    this.a.a("--> END " + jp8Var.b + " (duplex request body omitted)");
                } else if (qp8Var.isOneShot()) {
                    this.a.a("--> END " + jp8Var.b + " (one-shot body omitted)");
                } else {
                    tx0 tx0Var = new tx0();
                    qp8Var.writeTo(tx0Var);
                    if ("gzip".equalsIgnoreCase(nu4Var.d("Content-Encoding"))) {
                        lValueOf = Long.valueOf(tx0Var.u);
                        rs4 rs4Var = new rs4(tx0Var);
                        try {
                            tx0Var = new tx0();
                            tx0Var.F(rs4Var);
                            rs4Var.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                fg1.a(rs4Var, th);
                                throw th2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    wq6 wq6VarContentType2 = qp8Var.contentType();
                    if (wq6VarContentType2 == null || (charsetA2 = wq6.a(wq6VarContentType2)) == null) {
                        charsetA2 = ua1.b;
                    }
                    this.a.a(BuildConfig.FLAVOR);
                    boolean zC = f41.c(tx0Var);
                    b bVar = this.a;
                    if (!zC) {
                        bVar.a("--> END " + jp8Var.b + " (binary " + qp8Var.contentLength() + "-byte body omitted)");
                    } else if (lValueOf != null) {
                        bVar.a("--> END " + jp8Var.b + " (" + tx0Var.u + "-byte, " + lValueOf.longValue() + "-gzipped-byte body)");
                    } else {
                        bVar.a(tx0Var.S(charsetA2));
                        this.a.a("--> END " + jp8Var.b + " (" + qp8Var.contentLength() + "-byte body)");
                    }
                }
            }
        } else {
            z2 = z2;
            z = z;
            j = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            qu8 qu8VarA = ((aj8) aVar).a(jp8Var);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            su8 su8Var = qu8VarA.z;
            su8Var.getClass();
            long jK = su8Var.k();
            String str = jK != j ? jK + "-byte" : "unknown-length";
            b bVar2 = this.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- " + qu8VarA.w);
            if (qu8VarA.v.length() > 0) {
                sb2.append(" " + qu8VarA.v);
            }
            StringBuilder sb3 = new StringBuilder(" ");
            f55 f55Var2 = qu8VarA.t.a;
            f55Var2.getClass();
            this.c.getClass();
            sb3.append(f55Var2.i);
            sb3.append(" (");
            sb3.append(jNanoTime2);
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z) {
                sb2.append(", " + str + " body");
            }
            sb2.append(")");
            bVar2.a(sb2.toString());
            if (z) {
                nu4 nu4Var2 = qu8VarA.y;
                int size2 = nu4Var2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a(nu4Var2, i2);
                }
                if (z2 && u45.a(qu8VarA)) {
                    String strD2 = qu8VarA.y.d("Content-Encoding");
                    if (strD2 != null && !strD2.equalsIgnoreCase("identity") && !strD2.equalsIgnoreCase("gzip")) {
                        this.a.a("<-- END HTTP (encoded body omitted)");
                        return qu8VarA;
                    }
                    wq6 wq6VarM = qu8VarA.z.m();
                    if (wq6VarM != null && wq6VarM.b.equals(AttributeType.TEXT) && wq6VarM.c.equals("event-stream")) {
                        this.a.a("<-- END HTTP (streaming)");
                        return qu8VarA;
                    }
                    hy0 hy0VarP = su8Var.p();
                    hy0VarP.request(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    tx0 tx0VarJ = hy0VarP.j();
                    if ("gzip".equalsIgnoreCase(nu4Var2.d("Content-Encoding"))) {
                        Long lValueOf2 = Long.valueOf(tx0VarJ.u);
                        rs4 rs4Var2 = new rs4(tx0VarJ.clone());
                        try {
                            tx0VarJ = new tx0();
                            tx0VarJ.F(rs4Var2);
                            rs4Var2.close();
                            l = lValueOf2;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                fg1.a(rs4Var2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        l = null;
                    }
                    wq6 wq6VarM2 = su8Var.m();
                    if (wq6VarM2 == null || (charsetA = wq6.a(wq6VarM2)) == null) {
                        charsetA = ua1.b;
                    }
                    if (!f41.c(tx0VarJ)) {
                        this.a.a(BuildConfig.FLAVOR);
                        b bVar3 = this.a;
                        StringBuilder sbB2 = ao3.b("<-- END HTTP (", jNanoTime3, "ms, binary ");
                        sbB2.append(tx0VarJ.u);
                        sbB2.append("-byte body omitted)");
                        bVar3.a(sbB2.toString());
                        return qu8VarA;
                    }
                    if (jK != 0) {
                        this.a.a(BuildConfig.FLAVOR);
                        this.a.a(tx0VarJ.clone().S(charsetA));
                    }
                    b bVar4 = this.a;
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sbB3 = ao3.b("<-- END HTTP (", jNanoTime3, "ms, ");
                    sbB3.append(tx0VarJ.u);
                    sbB3.append("-byte");
                    sb4.append(sbB3.toString());
                    if (l != null) {
                        sb4.append(", " + l.longValue() + "-gzipped-byte");
                    }
                    sb4.append(" body)");
                    bVar4.a(sb4.toString());
                    return qu8VarA;
                }
                this.a.a("<-- END HTTP");
            }
            return qu8VarA;
        } catch (Exception e) {
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            StringBuilder sb5 = new StringBuilder(" ");
            f55 f55Var3 = jp8Var.a;
            f55Var3.getClass();
            this.c.getClass();
            sb5.append(f55Var3.i);
            sb5.append(" (");
            sb5.append(jNanoTime4);
            sb5.append("ms)");
            this.a.a(("<-- HTTP FAILED: " + e + '.').concat(sb5.toString()));
            throw e;
        }
    }

    public v45() {
        this(0);
    }
}
