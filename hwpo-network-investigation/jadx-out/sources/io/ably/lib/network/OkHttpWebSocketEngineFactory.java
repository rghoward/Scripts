package io.ably.lib.network;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpWebSocketEngineFactory implements WebSocketEngineFactory {
    @Override // io.ably.lib.network.WebSocketEngineFactory
    public WebSocketEngine create(WebSocketEngineConfig webSocketEngineConfig) {
        return new OkHttpWebSocketEngine(webSocketEngineConfig);
    }

    @Override // io.ably.lib.network.WebSocketEngineFactory
    public EngineType getEngineType() {
        return EngineType.OKHTTP;
    }
}
