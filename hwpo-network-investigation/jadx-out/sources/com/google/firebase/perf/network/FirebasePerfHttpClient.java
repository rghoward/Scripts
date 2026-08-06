package com.google.firebase.perf.network;

import defpackage.b4;
import defpackage.ba7;
import defpackage.ca7;
import defpackage.kf5;
import defpackage.oxa;
import defpackage.zoa;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfHttpClient {
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ba7Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = ca7.a(httpRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            ba7Var.k(zoaVar.a());
            ba7Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = ca7.a(httpResponseExecute);
            if (lA2 != null) {
                ba7Var.j(lA2.longValue());
            }
            String strB = ca7.b(httpResponseExecute);
            if (strB != null) {
                ba7Var.h(strB);
            }
            ba7Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpUriRequest.getURI().toString());
            ba7Var.c(httpUriRequest.getMethod());
            Long lA = ca7.a(httpUriRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            ba7Var.k(zoaVar.a());
            ba7Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = ca7.a(httpResponseExecute);
            if (lA2 != null) {
                ba7Var.j(lA2.longValue());
            }
            String strB = ca7.b(httpResponseExecute);
            if (strB != null) {
                ba7Var.h(strB);
            }
            ba7Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpUriRequest.getURI().toString());
            ba7Var.c(httpUriRequest.getMethod());
            Long lA = ca7.a(httpUriRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            return (T) httpClient.execute(httpUriRequest, new kf5(responseHandler, zoaVar, ba7Var));
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpUriRequest.getURI().toString());
            ba7Var.c(httpUriRequest.getMethod());
            Long lA = ca7.a(httpUriRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            return (T) httpClient.execute(httpUriRequest, new kf5(responseHandler, zoaVar, ba7Var), httpContext);
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpUriRequest.getURI().toString());
            ba7Var.c(httpUriRequest.getMethod());
            Long lA = ca7.a(httpUriRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            ba7Var.k(zoaVar.a());
            ba7Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = ca7.a(httpResponseExecute);
            if (lA2 != null) {
                ba7Var.j(lA2.longValue());
            }
            String strB = ca7.b(httpResponseExecute);
            if (strB != null) {
                ba7Var.h(strB);
            }
            ba7Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ba7Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = ca7.a(httpRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            ba7Var.k(zoaVar.a());
            ba7Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = ca7.a(httpResponseExecute);
            if (lA2 != null) {
                ba7Var.j(lA2.longValue());
            }
            String strB = ca7.b(httpResponseExecute);
            if (strB != null) {
                ba7Var.h(strB);
            }
            ba7Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ba7Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = ca7.a(httpRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            return (T) httpClient.execute(httpHost, httpRequest, new kf5(responseHandler, zoaVar, ba7Var));
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        zoa zoaVar = new zoa();
        ba7 ba7Var = new ba7(oxa.L);
        try {
            ba7Var.m(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ba7Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = ca7.a(httpRequest);
            if (lA != null) {
                ba7Var.f(lA.longValue());
            }
            zoaVar.c();
            ba7Var.g(zoaVar.t);
            return (T) httpClient.execute(httpHost, httpRequest, new kf5(responseHandler, zoaVar, ba7Var), httpContext);
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }
}
