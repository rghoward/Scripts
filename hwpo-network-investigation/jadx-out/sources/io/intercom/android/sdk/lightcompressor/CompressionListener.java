package io.intercom.android.sdk.lightcompressor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface CompressionListener {
    void onCancelled(int i);

    void onFailure(int i, String str);

    void onProgress(int i, float f);

    void onStart(int i);

    void onSuccess(int i, long j, String str);
}
