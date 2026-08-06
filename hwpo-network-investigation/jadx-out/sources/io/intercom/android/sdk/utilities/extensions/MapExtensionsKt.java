package io.intercom.android.sdk.utilities.extensions;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MapExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V safeGetOrDefault(Map<K, ? extends V> map, K k, V v) {
        map.getClass();
        return map.getOrDefault(k, v);
    }
}
