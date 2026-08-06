package io.ably.lib.push;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface Storage {
    void clear(String[] strArr);

    int get(String str, int i);

    String get(String str, String str2);

    void put(String str, int i);

    void put(String str, String str2);
}
