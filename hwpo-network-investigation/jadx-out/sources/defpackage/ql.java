package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ql extends ln4 {
    public final X509TrustManager x;
    public final X509TrustManagerExtensions y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        super(5);
        x509TrustManager.getClass();
        this.x = x509TrustManager;
        this.y = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ql) && ((ql) obj).x == this.x;
    }

    public final int hashCode() {
        return System.identityHashCode(this.x);
    }

    @Override // defpackage.ln4
    public final List z0(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.y.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
