package io.ably.lib.network;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface WebSocketListener {
    void onClose(int i, String str);

    void onError(Throwable th);

    void onMessage(String str);

    void onMessage(ByteBuffer byteBuffer);

    void onOldJavaVersionDetected(Throwable th);

    void onOpen();

    void onWebsocketPing();
}
