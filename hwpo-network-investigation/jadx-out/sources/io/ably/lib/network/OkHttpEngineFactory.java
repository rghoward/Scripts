package io.ably.lib.network;

import defpackage.lg7;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpEngineFactory implements HttpEngineFactory {
    @Override // io.ably.lib.network.HttpEngineFactory
    public HttpEngine create(HttpEngineConfig httpEngineConfig) {
        lg7.a aVar = new lg7.a();
        OkHttpUtils.injectProxySetting(httpEngineConfig.getProxy(), aVar);
        return new OkHttpEngine(new lg7(aVar), httpEngineConfig);
    }

    @Override // io.ably.lib.network.HttpEngineFactory
    public EngineType getEngineType() {
        return EngineType.OKHTTP;
    }
}
