package io.ably.lib.network;

import defpackage.aa0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface WebSocketEngineFactory {
    static WebSocketEngineFactory getFirstAvailable() {
        WebSocketEngineFactory webSocketEngineFactoryTryGetOkWebSocketFactory = tryGetOkWebSocketFactory();
        if (webSocketEngineFactoryTryGetOkWebSocketFactory != null) {
            return webSocketEngineFactoryTryGetOkWebSocketFactory;
        }
        WebSocketEngineFactory webSocketEngineFactoryTryGetDefaultFactory = tryGetDefaultFactory();
        if (webSocketEngineFactoryTryGetDefaultFactory != null) {
            return webSocketEngineFactoryTryGetDefaultFactory;
        }
        aa0.c("No engines are available");
        return null;
    }

    static WebSocketEngineFactory tryGetDefaultFactory() {
        try {
            return (WebSocketEngineFactory) Class.forName("io.ably.lib.network.DefaultWebSocketEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static WebSocketEngineFactory tryGetOkWebSocketFactory() {
        try {
            return (WebSocketEngineFactory) OkHttpWebSocketEngineFactory.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    WebSocketEngine create(WebSocketEngineConfig webSocketEngineConfig);

    EngineType getEngineType();
}
