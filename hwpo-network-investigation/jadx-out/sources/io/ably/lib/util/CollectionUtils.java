package io.ably.lib.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        HashMap map2 = new HashMap(map.size());
        map2.putAll(map);
        return map2;
    }
}
