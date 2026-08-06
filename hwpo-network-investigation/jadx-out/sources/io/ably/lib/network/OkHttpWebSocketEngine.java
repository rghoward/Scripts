package io.ably.lib.network;

import defpackage.jp8;
import defpackage.lg7;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpWebSocketEngine implements WebSocketEngine {
    private final WebSocketEngineConfig config;

    public OkHttpWebSocketEngine(WebSocketEngineConfig webSocketEngineConfig) {
        this.config = webSocketEngineConfig;
    }

    @Override // io.ably.lib.network.WebSocketEngine
    public WebSocketClient create(String str, WebSocketListener webSocketListener) {
        lg7.a aVar = new lg7.a();
        jp8.a aVar2 = new jp8.a();
        aVar2.d(str);
        OkHttpUtils.injectProxySetting(this.config.getProxy(), aVar);
        if (this.config.getSslSocketFactory() != null) {
            SSLSocketFactory sslSocketFactory = this.config.getSslSocketFactory();
            sslSocketFactory.getClass();
            if (!sslSocketFactory.equals(aVar.r)) {
                aVar.D = null;
            }
            aVar.r = sslSocketFactory;
            c cVar = c.a;
            X509TrustManager x509TrustManagerM = c.a.m(sslSocketFactory);
            if (x509TrustManagerM == null) {
                StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
                sb.append(c.a);
                Class<?> cls = sslSocketFactory.getClass();
                sb.append(", sslSocketFactory is ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
            aVar.s = x509TrustManagerM;
            c cVar2 = c.a;
            X509TrustManager x509TrustManager = aVar.s;
            x509TrustManager.getClass();
            aVar.x = cVar2.c(x509TrustManager);
        }
        return new OkHttpWebSocketClient(new lg7(aVar), new jp8(aVar2), webSocketListener);
    }

    @Override // io.ably.lib.network.WebSocketEngine
    public boolean isPingListenerSupported() {
        return false;
    }
}
