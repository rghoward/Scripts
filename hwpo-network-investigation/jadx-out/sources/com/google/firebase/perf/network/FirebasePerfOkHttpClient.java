package com.google.firebase.perf.network;

import defpackage.ba7;
import defpackage.ca7;
import defpackage.f55;
import defpackage.jp8;
import defpackage.lf5;
import defpackage.o21;
import defpackage.oxa;
import defpackage.qp8;
import defpackage.qu8;
import defpackage.su8;
import defpackage.v21;
import defpackage.wq6;
import defpackage.zoa;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    public static void a(qu8 qu8Var, ba7 ba7Var, long j, long j2) {
        jp8 jp8Var = qu8Var.t;
        if (jp8Var == null) {
            return;
        }
        ba7Var.m(jp8Var.a.j().toString());
        ba7Var.c(jp8Var.b);
        qp8 qp8Var = jp8Var.d;
        if (qp8Var != null) {
            long jContentLength = qp8Var.contentLength();
            if (jContentLength != -1) {
                ba7Var.f(jContentLength);
            }
        }
        su8 su8Var = qu8Var.z;
        if (su8Var != null) {
            long jK = su8Var.k();
            if (jK != -1) {
                ba7Var.j(jK);
            }
            wq6 wq6VarM = su8Var.m();
            if (wq6VarM != null) {
                ba7Var.h(wq6VarM.a);
            }
        }
        ba7Var.d(qu8Var.w);
        ba7Var.g(j);
        ba7Var.k(j2);
        ba7Var.b();
    }

    public static void enqueue(o21 o21Var, v21 v21Var) {
        zoa zoaVar = new zoa();
        o21Var.k(new lf5(v21Var, oxa.L, zoaVar, zoaVar.t));
    }

    public static qu8 execute(o21 o21Var) throws IOException {
        ba7 ba7Var = new ba7(oxa.L);
        zoa zoaVar = new zoa();
        long j = zoaVar.t;
        try {
            qu8 qu8VarExecute = o21Var.execute();
            a(qu8VarExecute, ba7Var, j, zoaVar.a());
            return qu8VarExecute;
        } catch (IOException e) {
            jp8 jp8VarRequest = o21Var.request();
            if (jp8VarRequest != null) {
                f55 f55Var = jp8VarRequest.a;
                if (f55Var != null) {
                    ba7Var.m(f55Var.j().toString());
                }
                String str = jp8VarRequest.b;
                if (str != null) {
                    ba7Var.c(str);
                }
            }
            ba7Var.g(j);
            ba7Var.k(zoaVar.a());
            ca7.c(ba7Var);
            throw e;
        }
    }
}
