package com.google.firebase.perf.network;

import defpackage.ba7;
import defpackage.ca7;
import defpackage.hf5;
import defpackage.if5;
import defpackage.oxa;
import defpackage.zoa;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    public static Object getContent(URL url) throws IOException {
        oxa oxaVar = oxa.L;
        zoa zoaVar = new zoa();
        zoaVar.c();
        long j = zoaVar.t;
        ba7 ba7Var = new ba7(oxaVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new if5((HttpsURLConnection) uRLConnectionOpenConnection, zoaVar, ba7Var).a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new hf5((HttpURLConnection) uRLConnectionOpenConnection, zoaVar, ba7Var).a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            ba7Var.g(j);
            ba7Var.k(zoaVar.a());
            ba7Var.m(url.toString());
            ca7.c(ba7Var);
            throw e;
        }
    }

    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new if5((HttpsURLConnection) obj, new zoa(), new ba7(oxa.L));
        }
        return obj instanceof HttpURLConnection ? new hf5((HttpURLConnection) obj, new zoa(), new ba7(oxa.L)) : obj;
    }

    public static InputStream openStream(URL url) throws IOException {
        oxa oxaVar = oxa.L;
        zoa zoaVar = new zoa();
        if (!oxaVar.v.get()) {
            return url.openConnection().getInputStream();
        }
        zoaVar.c();
        long j = zoaVar.t;
        ba7 ba7Var = new ba7(oxaVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new if5((HttpsURLConnection) uRLConnectionOpenConnection, zoaVar, ba7Var).a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new hf5((HttpURLConnection) uRLConnectionOpenConnection, zoaVar, ba7Var).a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            ba7Var.g(j);
            ba7Var.k(zoaVar.a());
            ba7Var.m(url.toString());
            ca7.c(ba7Var);
            throw e;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        oxa oxaVar = oxa.L;
        zoa zoaVar = new zoa();
        zoaVar.c();
        long j = zoaVar.t;
        ba7 ba7Var = new ba7(oxaVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new if5((HttpsURLConnection) uRLConnectionOpenConnection, zoaVar, ba7Var).a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new hf5((HttpURLConnection) uRLConnectionOpenConnection, zoaVar, ba7Var).a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            ba7Var.g(j);
            ba7Var.k(zoaVar.a());
            ba7Var.m(url.toString());
            ca7.c(ba7Var);
            throw e;
        }
    }
}
