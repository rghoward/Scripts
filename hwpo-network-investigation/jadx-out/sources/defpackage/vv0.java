package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vv0 implements vg5 {
    public final i52 a;

    public vv0(i52 i52Var) {
        i52Var.getClass();
        this.a = i52Var;
    }

    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) {
        su8 su8Var;
        aj8 aj8Var = (aj8) aVar;
        jp8 jp8Var = aj8Var.e;
        jp8.a aVarB = jp8Var.b();
        f55 f55Var = jp8Var.a;
        nu4 nu4Var = jp8Var.c;
        qp8 qp8Var = jp8Var.d;
        if (qp8Var != null) {
            wq6 wq6VarContentType = qp8Var.contentType();
            if (wq6VarContentType != null) {
                aVarB.b("Content-Type", wq6VarContentType.a);
            }
            long jContentLength = qp8Var.contentLength();
            if (jContentLength != -1) {
                aVarB.b("Content-Length", String.valueOf(jContentLength));
                aVarB.c.f("Transfer-Encoding");
            } else {
                aVarB.b("Transfer-Encoding", "chunked");
                aVarB.c.f("Content-Length");
            }
        }
        boolean z = false;
        if (nu4Var.d("Host") == null) {
            aVarB.b("Host", ytb.j(f55Var, false));
        }
        if (nu4Var.d("Connection") == null) {
            aVarB.b("Connection", "Keep-Alive");
        }
        if (nu4Var.d("Accept-Encoding") == null && nu4Var.d("Range") == null) {
            aVarB.b("Accept-Encoding", "gzip");
            z = true;
        }
        i52 i52Var = this.a;
        i52Var.getClass();
        f55Var.getClass();
        if (nu4Var.d("User-Agent") == null) {
            aVarB.b("User-Agent", "okhttp/5.3.2");
        }
        jp8 jp8Var2 = new jp8(aVarB);
        qu8 qu8VarA = aj8Var.a(jp8Var2);
        nu4 nu4Var2 = qu8VarA.y;
        u45.b(i52Var, jp8Var2.a, nu4Var2);
        qu8.a aVarK = qu8VarA.k();
        aVarK.a = jp8Var2;
        if (z) {
            String strD = nu4Var2.d("Content-Encoding");
            if (strD == null) {
                strD = null;
            }
            if ("gzip".equalsIgnoreCase(strD) && u45.a(qu8VarA) && (su8Var = qu8VarA.z) != null) {
                rs4 rs4Var = new rs4(su8Var.p());
                nu4.a aVarF = nu4Var2.f();
                aVarF.f("Content-Encoding");
                aVarF.f("Content-Length");
                aVarK.f = aVarF.d().f();
                String strD2 = nu4Var2.d("Content-Type");
                aVarK.g = new fj8(strD2 != null ? strD2 : null, -1L, new ni8(rs4Var));
            }
        }
        return aVarK.a();
    }
}
