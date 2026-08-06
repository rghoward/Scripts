package io.intercom.android.sdk.api;

import android.util.Log;
import defpackage.f55;
import defpackage.jp8;
import defpackage.qu8;
import defpackage.vg5;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class S3HostRedirectInterceptor implements vg5 {
    public static final int $stable = 0;

    @Override // defpackage.vg5
    public qu8 intercept(vg5.a aVar) {
        aVar.getClass();
        jp8 jp8VarRequest = aVar.request();
        f55 f55Var = jp8VarRequest.a;
        if (!xj5.a(f55Var.d, "uploads-development.s3.test")) {
            return aVar.a(jp8VarRequest);
        }
        Log.d("IntercomUpload", "Intercepting S3 request: " + f55Var);
        f55.a aVarG = f55Var.g();
        aVarG.c("10.0.2.2");
        aVarG.e(80);
        f55 f55VarA = aVarG.a();
        jp8.a aVarB = jp8VarRequest.b();
        aVarB.a = f55VarA;
        aVarB.b("Host", "uploads-development.s3.test");
        jp8 jp8Var = new jp8(aVarB);
        Log.d("IntercomUpload", "Redirected to: " + f55VarA + " with Host: uploads-development.s3.test");
        return aVar.a(jp8Var);
    }
}
