package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.c;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ou0 implements rv9 {
    public static final a a = new a();
    public static final boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements wv2.a {
        @Override // wv2.a
        public final boolean a(SSLSocket sSLSocket) {
            boolean z = ou0.b;
            return false;
        }

        @Override // wv2.a
        public final rv9 b(SSLSocket sSLSocket) {
            return new ou0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, b.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.rv9
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.rv9
    public final boolean b() {
        return b;
    }

    @Override // defpackage.rv9
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals(BuildConfig.FLAVOR)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.rv9
    public final void f(SSLSocket sSLSocket, String str, List<? extends gf8> list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            c cVar = c.a;
            parameters.setApplicationProtocols((String[]) c.a.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
