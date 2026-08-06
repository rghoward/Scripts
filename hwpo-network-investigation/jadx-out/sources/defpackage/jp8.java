package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jp8 {
    public final f55 a;
    public final String b;
    public final nu4 c;
    public final qp8 d;
    public final ln4 e;
    public n01 f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public f55 a;
        public qp8 d;
        public ln4 e = sf3.x;
        public String b = HttpConstants.Methods.GET;
        public nu4.a c = new nu4.a();

        public final void a(n01 n01Var) {
            n01Var.getClass();
            String string = n01Var.toString();
            if (string.length() == 0) {
                this.c.f("Cache-Control");
            } else {
                b("Cache-Control", string);
            }
        }

        public final void b(String str, String str2) {
            str2.getClass();
            nu4.a aVar = this.c;
            aVar.getClass();
            rtb.b(str);
            rtb.c(str2, str);
            aVar.f(str);
            rtb.a(aVar, str, str2);
        }

        public final void c(String str, qp8 qp8Var) {
            str.getClass();
            if (str.length() <= 0) {
                z90.a("method.isEmpty() == true");
                return;
            }
            if (qp8Var == null) {
                if (str.equals(HttpConstants.Methods.POST) || str.equals(HttpConstants.Methods.PUT) || str.equals(HttpConstants.Methods.PATCH) || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    ca0.a(sk0.c("method ", str, " must have a request body."));
                    return;
                }
            } else if (!db7.d(str)) {
                ca0.a(sk0.c("method ", str, " must not have a request body."));
                return;
            }
            this.b = str;
            this.d = qp8Var;
        }

        public final void d(String str) {
            str.getClass();
            if (w2a.n(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (w2a.n(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            f55.a aVar = new f55.a();
            aVar.d(null, str);
            this.a = aVar.a();
        }
    }

    public jp8(a aVar) {
        aVar.getClass();
        f55 f55Var = aVar.a;
        if (f55Var == null) {
            aa0.c("url == null");
            throw null;
        }
        this.a = f55Var;
        this.b = aVar.b;
        this.c = aVar.c.d();
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public final n01 a() {
        n01 n01Var = this.f;
        if (n01Var != null) {
            return n01Var;
        }
        n01 n01Var2 = n01.n;
        n01 n01VarA = n01.b.a(this.c);
        this.f = n01VarA;
        return n01VarA;
    }

    public final a b() {
        a aVar = new a();
        sf3 sf3Var = sf3.x;
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.c = this.c.f();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        nu4 nu4Var = this.c;
        if (nu4Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (js7<? extends String, ? extends String> js7Var : nu4Var) {
                int i2 = i + 1;
                if (i < 0) {
                    ws0.m();
                    throw null;
                }
                js7<? extends String, ? extends String> js7Var2 = js7Var;
                String str = (String) js7Var2.t;
                String str2 = (String) js7Var2.u;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (vtb.m(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        sf3 sf3Var = sf3.x;
        ln4 ln4Var = this.e;
        if (!xj5.a(ln4Var, sf3Var)) {
            sb.append(", tags=");
            sb.append(ln4Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
