package defpackage;

import io.ably.lib.http.HttpConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jf5 {
    public static final dp f = dp.d();
    public final HttpURLConnection a;
    public final ba7 b;
    public long c = -1;
    public long d = -1;
    public final zoa e;

    public jf5(HttpURLConnection httpURLConnection, zoa zoaVar, ba7 ba7Var) {
        this.a = httpURLConnection;
        this.b = ba7Var;
        this.e = zoaVar;
        ba7Var.m(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        ba7 ba7Var = this.b;
        zoa zoaVar = this.e;
        if (j == -1) {
            zoaVar.c();
            long j2 = zoaVar.t;
            this.c = j2;
            ba7Var.g(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final Object b() throws IOException {
        zoa zoaVar = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        ba7 ba7Var = this.b;
        ba7Var.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                ba7Var.h(httpURLConnection.getContentType());
                return new ff5((InputStream) content, ba7Var, zoaVar);
            }
            ba7Var.h(httpURLConnection.getContentType());
            ba7Var.j(httpURLConnection.getContentLength());
            ba7Var.k(zoaVar.a());
            ba7Var.b();
            return content;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        zoa zoaVar = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        ba7 ba7Var = this.b;
        ba7Var.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                ba7Var.h(httpURLConnection.getContentType());
                return new ff5((InputStream) content, ba7Var, zoaVar);
            }
            ba7Var.h(httpURLConnection.getContentType());
            ba7Var.j(httpURLConnection.getContentLength());
            ba7Var.k(zoaVar.a());
            ba7Var.b();
            return content;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        ba7 ba7Var = this.b;
        i();
        try {
            ba7Var.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new ff5(errorStream, ba7Var, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        zoa zoaVar = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        ba7 ba7Var = this.b;
        ba7Var.d(responseCode);
        ba7Var.h(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new ff5(inputStream, ba7Var, zoaVar) : inputStream;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        zoa zoaVar = this.e;
        ba7 ba7Var = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new gf5(outputStream, ba7Var, zoaVar) : outputStream;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        zoa zoaVar = this.e;
        ba7 ba7Var = this.b;
        if (j == -1) {
            long jA = zoaVar.a();
            this.d = jA;
            z97.a aVar = ba7Var.w;
            aVar.n();
            z97.F((z97) aVar.u, jA);
        }
        try {
            int responseCode = this.a.getResponseCode();
            ba7Var.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        zoa zoaVar = this.e;
        ba7 ba7Var = this.b;
        if (j == -1) {
            long jA = zoaVar.a();
            this.d = jA;
            z97.a aVar = ba7Var.w;
            aVar.n();
            z97.F((z97) aVar.u, jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            ba7Var.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        ba7 ba7Var = this.b;
        if (j == -1) {
            zoa zoaVar = this.e;
            zoaVar.c();
            long j2 = zoaVar.t;
            this.c = j2;
            ba7Var.g(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            ba7Var.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            ba7Var.c(HttpConstants.Methods.POST);
        } else {
            ba7Var.c(HttpConstants.Methods.GET);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
