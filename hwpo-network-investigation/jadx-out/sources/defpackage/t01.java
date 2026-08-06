package defpackage;

import io.ably.lib.http.HttpConstants;
import io.ably.lib.rest.Auth;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l01.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t01 implements vg5 {
    public final l01 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static boolean a(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || HttpConstants.Headers.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpConstants.Headers.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public t01(l01 l01Var) {
        this.a = l01Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x027b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0283  */
    /* JADX WARN: Code duplicated, block: B:109:0x0291  */
    /* JADX WARN: Code duplicated, block: B:110:0x0297  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:123:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x0322  */
    /* JADX WARN: Code duplicated, block: B:235:0x050e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0552  */
    /* JADX WARN: Code duplicated, block: B:256:0x056d  */
    /* JADX WARN: Code duplicated, block: B:259:0x058a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [jp8, qu8] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) throws Throwable {
        qu8 qu8Var;
        int iP;
        long j;
        long time;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        ?? r7;
        a11 a11Var;
        long j2;
        long time2;
        String string;
        int i;
        int i2;
        long millis;
        long millis2;
        String str4;
        String str5;
        long j3;
        qu8.a aVarK;
        int i3;
        l01.b bVar;
        String strD;
        String str6;
        u13.a aVarM;
        u13.a aVarM2;
        qu8 qu8VarA;
        aj8 aj8Var = (aj8) aVar;
        oi8 oi8Var = aj8Var.a;
        l01 l01Var = this.a;
        if (l01Var != null) {
            jp8 jp8Var = aj8Var.e;
            jp8Var.getClass();
            f55 f55Var = jp8Var.a;
            try {
                u13.c cVarP = l01Var.t.p(l01.c.a(f55Var));
                if (cVarP == null) {
                    qu8VarA = null;
                } else {
                    try {
                        l01.d dVar = new l01.d((kw9) cVarP.v.get(0));
                        String str7 = dVar.c;
                        nu4 nu4Var = dVar.b;
                        f55 f55Var2 = dVar.a;
                        nu4 nu4Var2 = dVar.g;
                        String strD2 = nu4Var2.d("Content-Type");
                        String strD3 = nu4Var2.d("Content-Length");
                        f55Var2.getClass();
                        nu4Var.getClass();
                        str7.getClass();
                        jp8.a aVar2 = new jp8.a();
                        aVar2.a = f55Var2;
                        aVar2.c = nu4Var.f();
                        aVar2.c(!str7.equals("\u0000") ? str7 : HttpConstants.Methods.GET, null);
                        jp8 jp8Var2 = new jp8(aVar2);
                        qu8.a aVar3 = new qu8.a();
                        aVar3.a = jp8Var2;
                        gf8 gf8Var = dVar.d;
                        gf8Var.getClass();
                        aVar3.b = gf8Var;
                        aVar3.c = dVar.e;
                        String str8 = dVar.f;
                        str8.getClass();
                        aVar3.d = str8;
                        aVar3.f = nu4Var2.f();
                        aVar3.g = new l01.a(cVarP, strD2, strD3);
                        aVar3.e = dVar.h;
                        aVar3.l = dVar.i;
                        aVar3.m = dVar.j;
                        qu8VarA = aVar3.a();
                        if (f55Var2.equals(f55Var) && str7.equals(jp8Var.b)) {
                            Set setC = l01.c.c(qu8VarA.y);
                            if (!(setC instanceof Collection) || !setC.isEmpty()) {
                                Iterator it = setC.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str9 = (String) it.next();
                                        if (!nu4Var.k(str9).equals(jp8Var.c.k(str9))) {
                                        }
                                    }
                                }
                            }
                        }
                        vtb.b(qu8VarA.z);
                    } catch (IOException unused) {
                        vtb.b(cVarP);
                    }
                    qu8VarA = null;
                }
            } catch (IOException unused2) {
            }
            qu8Var = qu8VarA;
        } else {
            qu8Var = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        jp8 jp8Var3 = aj8Var.e;
        jp8Var3.getClass();
        if (qu8Var != null) {
            j = qu8Var.E;
            time = qu8Var.F;
            nu4 nu4Var3 = qu8Var.y;
            int size = nu4Var3.size();
            int i4 = 0;
            iP = -1;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            while (i4 < size) {
                String strE = nu4Var3.e(i4);
                long j4 = jCurrentTimeMillis;
                String strJ = nu4Var3.j(i4);
                if (strE.equalsIgnoreCase("Date")) {
                    str3 = strJ;
                    dateA3 = xg2.a(strJ);
                } else if (strE.equalsIgnoreCase("Expires")) {
                    dateA = xg2.a(strJ);
                } else if (strE.equalsIgnoreCase("Last-Modified")) {
                    str2 = strJ;
                    dateA2 = xg2.a(strJ);
                } else if (strE.equalsIgnoreCase("ETag")) {
                    str = strJ;
                } else if (strE.equalsIgnoreCase("Age")) {
                    iP = vtb.p(-1, strJ);
                }
                i4++;
                jCurrentTimeMillis = j4;
            }
        } else {
            iP = -1;
            j = 0;
            time = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        long j5 = jCurrentTimeMillis;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (qu8Var == null) {
            r7 = 0;
            a11Var = new a11(jp8Var3, null);
        } else {
            r7 = 0;
            r7 = 0;
            f55 f55Var3 = jp8Var3.a;
            nu4 nu4Var4 = jp8Var3.c;
            if (!(f55Var3.f() && qu8Var.x == null) && a11.a.a(jp8Var3, qu8Var)) {
                n01 n01VarA = jp8Var3.a();
                if (!n01VarA.a && nu4Var4.d("If-Modified-Since") == null && nu4Var4.d("If-None-Match") == null) {
                    n01 n01VarH = qu8Var.h();
                    long jMax = dateA3 != null ? Math.max(0L, time - dateA3.getTime()) : 0L;
                    if (iP != -1) {
                        jMax = Math.max(jMax, timeUnit.toMillis(iP));
                    }
                    long jMax2 = jMax + Math.max(0L, time - j) + Math.max(0L, j5 - time);
                    int i5 = qu8Var.h().c;
                    if (i5 != -1) {
                        time2 = timeUnit.toMillis(i5);
                    } else {
                        if (dateA != null) {
                            if (dateA3 != null) {
                                time = dateA3.getTime();
                            }
                            time2 = dateA.getTime() - time;
                            if (time2 <= 0) {
                                time2 = 0;
                            }
                        } else if (dateA2 == null) {
                            j2 = 0;
                            time2 = j2;
                        } else {
                            List<String> list = qu8Var.t.a.g;
                            if (list == null) {
                                string = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                f55.b.a(list, sb);
                                string = sb.toString();
                            }
                            if (string == null) {
                                long time3 = (dateA3 != null ? dateA3.getTime() : j) - dateA2.getTime();
                                j2 = 0;
                                if (time3 > 0) {
                                    time2 = time3 / 10;
                                }
                            } else {
                                j2 = 0;
                            }
                            time2 = j2;
                        }
                        i = n01VarA.c;
                        if (i != -1) {
                            time2 = Math.min(time2, timeUnit.toMillis(i));
                        }
                        i2 = n01VarA.i;
                        if (i2 != -1) {
                            millis = timeUnit.toMillis(i2);
                        } else {
                            millis = j2;
                        }
                        if (!n01VarH.g || (i3 = n01VarA.h) == -1) {
                            millis2 = j2;
                        } else {
                            millis2 = timeUnit.toMillis(i3);
                        }
                        if (n01VarH.a) {
                            if (str != null) {
                                str4 = str;
                                str5 = "If-None-Match";
                            } else {
                                if (dateA2 != null) {
                                    str4 = str2;
                                } else if (dateA3 != null) {
                                    str4 = str3;
                                } else {
                                    r7 = 0;
                                    a11Var = new a11(jp8Var3, null);
                                }
                                str5 = "If-Modified-Since";
                            }
                            nu4.a aVarF = nu4Var4.f();
                            str4.getClass();
                            rtb.a(aVarF, str5, str4);
                            jp8.a aVarB = jp8Var3.b();
                            aVarB.c = aVarF.d().f();
                            a11Var = new a11(new jp8(aVarB), qu8Var);
                            r7 = 0;
                        } else {
                            j3 = millis + jMax2;
                            if (j3 < millis2 + time2) {
                                aVarK = qu8Var.k();
                                if (j3 >= time2) {
                                    aVarK.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (jMax2 > 86400000 && qu8Var.h().c == -1 && dateA == null) {
                                    aVarK.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                r7 = 0;
                                a11Var = new a11(null, aVarK.a());
                            } else {
                                if (str != null) {
                                    str4 = str;
                                    str5 = "If-None-Match";
                                } else {
                                    if (dateA2 != null) {
                                        str4 = str2;
                                    } else if (dateA3 != null) {
                                        str4 = str3;
                                    } else {
                                        r7 = 0;
                                        a11Var = new a11(jp8Var3, null);
                                    }
                                    str5 = "If-Modified-Since";
                                }
                                nu4.a aVarF2 = nu4Var4.f();
                                str4.getClass();
                                rtb.a(aVarF2, str5, str4);
                                jp8.a aVarB2 = jp8Var3.b();
                                aVarB2.c = aVarF2.d().f();
                                a11Var = new a11(new jp8(aVarB2), qu8Var);
                                r7 = 0;
                            }
                        }
                    }
                    j2 = 0;
                    i = n01VarA.c;
                    if (i != -1) {
                        time2 = Math.min(time2, timeUnit.toMillis(i));
                    }
                    i2 = n01VarA.i;
                    if (i2 != -1) {
                        millis = timeUnit.toMillis(i2);
                    } else {
                        millis = j2;
                    }
                    if (n01VarH.g) {
                        millis2 = j2;
                    } else {
                        millis2 = j2;
                    }
                    if (n01VarH.a) {
                        j3 = millis + jMax2;
                        if (j3 < millis2 + time2) {
                            aVarK = qu8Var.k();
                            if (j3 >= time2) {
                                aVarK.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (jMax2 > 86400000) {
                                aVarK.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            r7 = 0;
                            a11Var = new a11(null, aVarK.a());
                        } else {
                            if (str != null) {
                                str4 = str;
                                str5 = "If-None-Match";
                            } else {
                                if (dateA2 != null) {
                                    str4 = str2;
                                } else if (dateA3 != null) {
                                    str4 = str3;
                                } else {
                                    r7 = 0;
                                    a11Var = new a11(jp8Var3, null);
                                }
                                str5 = "If-Modified-Since";
                            }
                            nu4.a aVarF3 = nu4Var4.f();
                            str4.getClass();
                            rtb.a(aVarF3, str5, str4);
                            jp8.a aVarB3 = jp8Var3.b();
                            aVarB3.c = aVarF3.d().f();
                            a11Var = new a11(new jp8(aVarB3), qu8Var);
                            r7 = 0;
                        }
                    } else {
                        if (str != null) {
                            str4 = str;
                            str5 = "If-None-Match";
                        } else {
                            if (dateA2 != null) {
                                str4 = str2;
                            } else if (dateA3 != null) {
                                str4 = str3;
                            } else {
                                r7 = 0;
                                a11Var = new a11(jp8Var3, null);
                            }
                            str5 = "If-Modified-Since";
                        }
                        nu4.a aVarF4 = nu4Var4.f();
                        str4.getClass();
                        rtb.a(aVarF4, str5, str4);
                        jp8.a aVarB4 = jp8Var3.b();
                        aVarB4.c = aVarF4.d().f();
                        a11Var = new a11(new jp8(aVarB4), qu8Var);
                        r7 = 0;
                    }
                } else {
                    r7 = 0;
                    a11Var = new a11(jp8Var3, null);
                }
            } else {
                a11Var = new a11(jp8Var3, null);
            }
        }
        if (a11Var.a != null && jp8Var3.a().j) {
            a11Var = new a11(r7, r7);
        }
        jp8 jp8Var4 = a11Var.a;
        qu8 qu8Var2 = a11Var.b;
        l01 l01Var2 = this.a;
        if (l01Var2 != null) {
            synchronized (l01Var2) {
            }
        }
        Object obj = oi8Var.x;
        if (obj == null) {
            obj = om3.a;
        }
        if (qu8Var != null && qu8Var2 == null) {
            vtb.b(qu8Var.z);
        }
        if (jp8Var4 == null && qu8Var2 == null) {
            qu8.a aVar4 = new qu8.a();
            jp8 jp8Var5 = aj8Var.e;
            jp8Var5.getClass();
            aVar4.a = jp8Var5;
            aVar4.b = gf8.HTTP_1_1;
            aVar4.c = 504;
            aVar4.d = "Unsatisfiable Request (only-if-cached)";
            aVar4.l = -1L;
            aVar4.m = System.currentTimeMillis();
            qu8 qu8VarA2 = aVar4.a();
            obj.getClass();
            return qu8VarA2;
        }
        if (jp8Var4 == null) {
            qu8Var2.getClass();
            qu8.a aVarK2 = qu8Var2.k();
            qu8 qu8VarA3 = d3b.a(qu8Var2);
            qu8.a.b("cacheResponse", qu8VarA3);
            aVarK2.j = qu8VarA3;
            qu8 qu8VarA4 = aVarK2.a();
            obj.getClass();
            om3.a aVar5 = om3.a;
            return qu8VarA4;
        }
        if (qu8Var2 != null || this.a != null) {
            obj.getClass();
        }
        try {
            qu8 qu8VarA5 = ((aj8) aVar).a(jp8Var4);
            if (qu8Var2 != null) {
                if (qu8VarA5.w == 304) {
                    qu8.a aVarK3 = qu8Var2.k();
                    nu4 nu4Var5 = qu8Var2.y;
                    nu4 nu4Var6 = qu8VarA5.y;
                    nu4.a aVar6 = new nu4.a();
                    int size2 = nu4Var5.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        String strE2 = nu4Var5.e(i6);
                        String strJ2 = nu4Var5.j(i6);
                        if (!"Warning".equalsIgnoreCase(strE2) || !w2a.n(strJ2, "1", false)) {
                            if ("Content-Length".equalsIgnoreCase(strE2) || "Content-Encoding".equalsIgnoreCase(strE2) || "Content-Type".equalsIgnoreCase(strE2) || !a.a(strE2) || nu4Var6.d(strE2) == null) {
                                rtb.a(aVar6, strE2, strJ2);
                            }
                        }
                    }
                    int size3 = nu4Var6.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        String strE3 = nu4Var6.e(i7);
                        if (!"Content-Length".equalsIgnoreCase(strE3) && !"Content-Encoding".equalsIgnoreCase(strE3) && !"Content-Type".equalsIgnoreCase(strE3) && a.a(strE3)) {
                            rtb.a(aVar6, strE3, nu4Var6.j(i7));
                        }
                    }
                    aVarK3.f = aVar6.d().f();
                    aVarK3.l = qu8VarA5.E;
                    aVarK3.m = qu8VarA5.F;
                    qu8 qu8VarA6 = d3b.a(qu8Var2);
                    qu8.a.b("cacheResponse", qu8VarA6);
                    aVarK3.j = qu8VarA6;
                    qu8 qu8VarA7 = d3b.a(qu8VarA5);
                    qu8.a.b("networkResponse", qu8VarA7);
                    aVarK3.i = qu8VarA7;
                    qu8 qu8VarA8 = aVarK3.a();
                    qu8VarA5.z.close();
                    l01 l01Var3 = this.a;
                    l01Var3.getClass();
                    synchronized (l01Var3) {
                    }
                    this.a.getClass();
                    l01.d dVar2 = new l01.d(qu8VarA8);
                    su8 su8Var = qu8Var2.z;
                    su8Var.getClass();
                    u13.c cVar = ((l01.a) su8Var).v;
                    try {
                        aVarM2 = cVar.w.m(cVar.u, cVar.t);
                        if (aVarM2 != 0) {
                            try {
                                dVar2.c(aVarM2);
                                aVarM2.b();
                            } catch (IOException unused3) {
                                if (aVarM2 != 0) {
                                    try {
                                        aVarM2.a();
                                    } catch (IOException unused4) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused5) {
                        aVarM2 = r7;
                    }
                    obj.getClass();
                    om3.a aVar7 = om3.a;
                    return qu8VarA8;
                }
                vtb.b(qu8Var2.z);
            }
            qu8.a aVarK4 = qu8VarA5.k();
            qu8 qu8VarA9 = qu8Var2 != null ? d3b.a(qu8Var2) : r7;
            qu8.a.b("cacheResponse", qu8VarA9);
            aVarK4.j = qu8VarA9;
            qu8 qu8VarA10 = d3b.a(qu8VarA5);
            qu8.a.b("networkResponse", qu8VarA10);
            aVarK4.i = qu8VarA10;
            qu8 qu8VarA11 = aVarK4.a();
            if (this.a != null) {
                if (u45.a(qu8VarA11) && a11.a.a(jp8Var4, qu8VarA11)) {
                    l01 l01Var4 = this.a;
                    qu8.a aVarK5 = qu8VarA11.k();
                    aVarK5.a = jp8Var4;
                    qu8 qu8VarA12 = aVarK5.a();
                    l01Var4.getClass();
                    jp8 jp8Var6 = qu8VarA12.t;
                    String str10 = jp8Var6.b;
                    try {
                        if (!db7.c(str10)) {
                            if (str10.equals(HttpConstants.Methods.GET) && !l01.c.c(qu8VarA12.y).contains(Auth.WILDCARD_CLIENTID)) {
                                l01.d dVar3 = new l01.d(qu8VarA12);
                                try {
                                    u13 u13Var = l01Var4.t;
                                    String strA = l01.c.a(jp8Var6.a);
                                    ol8 ol8Var = u13.M;
                                    aVarM = u13Var.m(-1L, strA);
                                    if (aVarM == 0) {
                                        bVar = r7;
                                    } else {
                                        try {
                                            dVar3.c(aVarM);
                                            bVar = l01Var4.new b(aVarM);
                                        } catch (IOException unused6) {
                                            if (aVarM != 0) {
                                                aVarM.a();
                                            }
                                            bVar = r7;
                                        }
                                    }
                                } catch (IOException unused7) {
                                    aVarM = r7;
                                }
                            } else {
                                bVar = r7;
                            }
                            if (bVar != 0) {
                                u01 u01Var = new u01(qu8VarA11.z.p(), bVar, ev6.b(bVar.c));
                                strD = qu8VarA11.y.d("Content-Type");
                                if (strD == null) {
                                    str6 = strD;
                                    str6 = r7;
                                }
                                str6 = strD;
                                long jK = qu8VarA11.z.k();
                                qu8.a aVarK6 = qu8VarA11.k();
                                aVarK6.g = new fj8(str6, jK, new ni8(u01Var));
                                qu8VarA11 = aVarK6.a();
                            }
                            if (qu8Var2 != null) {
                                obj.getClass();
                            }
                            return qu8VarA11;
                        }
                        l01Var4.h(jp8Var6);
                    } catch (IOException unused8) {
                    }
                    bVar = r7;
                    if (bVar != 0) {
                        u01 u01Var2 = new u01(qu8VarA11.z.p(), bVar, ev6.b(bVar.c));
                        strD = qu8VarA11.y.d("Content-Type");
                        if (strD == null) {
                            str6 = strD;
                            str6 = r7;
                        }
                        str6 = strD;
                        long jK2 = qu8VarA11.z.k();
                        qu8.a aVarK7 = qu8VarA11.k();
                        aVarK7.g = new fj8(str6, jK2, new ni8(u01Var2));
                        qu8VarA11 = aVarK7.a();
                    }
                    if (qu8Var2 != null) {
                        obj.getClass();
                    }
                    return qu8VarA11;
                }
                if (db7.c(jp8Var4.b)) {
                    try {
                        this.a.h(jp8Var4);
                    } catch (IOException unused9) {
                    }
                }
            }
            return qu8VarA11;
        } catch (Throwable th) {
            if (qu8Var != null) {
                vtb.b(qu8Var.z);
            }
            throw th;
        }
    }
}
