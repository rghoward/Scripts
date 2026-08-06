package io.ably.lib.network;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.d55;
import defpackage.o21;
import defpackage.qu8;
import defpackage.su8;
import defpackage.wq6;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpCall implements HttpCall {
    private final o21 call;

    public OkHttpCall(o21 o21Var) {
        this.call = o21Var;
    }

    private HttpBody buildHttpBody(qu8 qu8Var) {
        wq6 wq6VarM;
        su8 su8Var = qu8Var.z;
        if (su8Var != null) {
            try {
                wq6VarM = su8Var.m();
            } catch (Throwable th) {
                if (su8Var != null) {
                    try {
                        su8Var.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            wq6VarM = null;
        }
        HttpBody httpBody = wq6VarM != null ? new HttpBody(wq6VarM.a, su8Var.h()) : null;
        if (su8Var != null) {
            su8Var.close();
        }
        return httpBody;
    }

    @Override // io.ably.lib.network.HttpCall
    public void cancel() {
        this.call.cancel();
    }

    @Override // io.ably.lib.network.HttpCall
    public HttpResponse execute() {
        try {
            try {
                qu8 qu8VarExecute = FirebasePerfOkHttpClient.execute(this.call);
                try {
                    HttpResponse httpResponseBuild = HttpResponse.builder().headers(qu8VarExecute.y.i()).code(qu8VarExecute.w).message(qu8VarExecute.v).body(buildHttpBody(qu8VarExecute)).build();
                    qu8VarExecute.close();
                    return httpResponseBuild;
                } catch (Throwable th) {
                    if (qu8VarExecute != null) {
                        try {
                            qu8VarExecute.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (ConnectException | NoRouteToHostException | SocketTimeoutException | UnknownHostException e) {
                throw new FailedConnectionException(e);
            }
        } catch (IOException e2) {
            d55.a(e2);
            return null;
        }
    }
}
