package io.ably.lib.network;

import defpackage.g01;
import defpackage.jp8;
import defpackage.lg7;
import defpackage.pkb;
import defpackage.qu8;
import defpackage.rkb;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpWebSocketClient implements WebSocketClient {
    private final lg7 connection;
    private final WebSocketListener listener;
    private final jp8 request;
    private pkb webSocket;

    public OkHttpWebSocketClient(lg7 lg7Var, jp8 jp8Var, WebSocketListener webSocketListener) {
        this.connection = lg7Var;
        this.request = jp8Var;
        this.listener = webSocketListener;
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void cancel(int i, String str) {
        this.webSocket.cancel();
        this.listener.onClose(i, str);
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void close() {
        this.webSocket.close(1000, "Close");
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void connect() {
        this.webSocket = this.connection.c(this.request, new WebSocketHandler(this.listener));
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void send(byte[] bArr) {
        pkb pkbVar = this.webSocket;
        g01 g01Var = g01.w;
        bArr.getClass();
        pkbVar.send(new g01(Arrays.copyOf(bArr, bArr.length)));
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void close(int i, String str) {
        this.webSocket.close(i, str);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class WebSocketHandler extends rkb {
        private final WebSocketListener listener;

        private WebSocketHandler(WebSocketListener webSocketListener) {
            this.listener = webSocketListener;
        }

        @Override // defpackage.rkb
        public void onClosed(pkb pkbVar, int i, String str) {
            this.listener.onClose(i, str);
        }

        @Override // defpackage.rkb
        public void onFailure(pkb pkbVar, Throwable th, qu8 qu8Var) {
            this.listener.onError(th);
        }

        @Override // defpackage.rkb
        public void onMessage(pkb pkbVar, g01 g01Var) {
            this.listener.onMessage(ByteBuffer.wrap(g01Var.v()));
        }

        @Override // defpackage.rkb
        public void onOpen(pkb pkbVar, qu8 qu8Var) {
            this.listener.onOpen();
        }

        @Override // defpackage.rkb
        public void onMessage(pkb pkbVar, String str) {
            this.listener.onMessage(str);
        }
    }

    @Override // io.ably.lib.network.WebSocketClient
    public void send(String str) {
        this.webSocket.send(str);
    }
}
