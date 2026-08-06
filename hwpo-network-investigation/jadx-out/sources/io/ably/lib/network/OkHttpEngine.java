package io.ably.lib.network;

import defpackage.lg7;
import defpackage.ytb;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpEngine implements HttpEngine {
    private final lg7 client;
    private final HttpEngineConfig config;

    public OkHttpEngine(lg7 lg7Var, HttpEngineConfig httpEngineConfig) {
        this.client = lg7Var;
        this.config = httpEngineConfig;
    }

    @Override // io.ably.lib.network.HttpEngine
    public HttpCall call(HttpRequest httpRequest) {
        lg7.a aVarB = this.client.b();
        long httpOpenTimeout = httpRequest.getHttpOpenTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVarB.a(httpOpenTimeout, timeUnit);
        aVarB.z = ytb.b(httpRequest.getHttpReadTimeout(), timeUnit);
        return new OkHttpCall(new lg7(aVarB).a(OkHttpUtils.toOkhttpRequest(httpRequest)));
    }

    @Override // io.ably.lib.network.HttpEngine
    public boolean isUsingProxy() {
        return this.config.getProxy() != null;
    }
}
