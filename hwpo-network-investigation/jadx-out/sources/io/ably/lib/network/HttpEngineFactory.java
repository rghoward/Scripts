package io.ably.lib.network;

import defpackage.aa0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface HttpEngineFactory {
    static HttpEngineFactory getFirstAvailable() {
        HttpEngineFactory httpEngineFactoryTryGetOkHttpFactory = tryGetOkHttpFactory();
        if (httpEngineFactoryTryGetOkHttpFactory != null) {
            return httpEngineFactoryTryGetOkHttpFactory;
        }
        HttpEngineFactory httpEngineFactoryTryGetDefaultFactory = tryGetDefaultFactory();
        if (httpEngineFactoryTryGetDefaultFactory != null) {
            return httpEngineFactoryTryGetDefaultFactory;
        }
        aa0.c("No engines are available");
        return null;
    }

    static HttpEngineFactory tryGetDefaultFactory() {
        try {
            return (HttpEngineFactory) Class.forName("io.ably.lib.network.DefaultHttpEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static HttpEngineFactory tryGetOkHttpFactory() {
        try {
            return (HttpEngineFactory) OkHttpEngineFactory.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    HttpEngine create(HttpEngineConfig httpEngineConfig);

    EngineType getEngineType();
}
