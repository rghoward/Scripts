package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface rv9 {
    boolean a(SSLSocket sSLSocket);

    boolean b();

    String c(SSLSocket sSLSocket);

    default X509TrustManager d(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    default boolean e(SSLSocketFactory sSLSocketFactory) {
        return false;
    }

    void f(SSLSocket sSLSocket, String str, List<? extends gf8> list);
}
