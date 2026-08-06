package defpackage;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fz9 extends pr {
    public final Class<? super SSLSocketFactory> f;
    public final Class<?> g;

    public fz9(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        this.f = cls2;
        this.g = cls3;
    }

    @Override // defpackage.rv9
    public final X509TrustManager d(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException {
        Object objG = ytb.g(sSLSocketFactory, this.g, "sslParameters");
        objG.getClass();
        X509TrustManager x509TrustManager = (X509TrustManager) ytb.g(objG, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) ytb.g(objG, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // defpackage.rv9
    public final boolean e(SSLSocketFactory sSLSocketFactory) {
        return this.f.isInstance(sSLSocketFactory);
    }
}
