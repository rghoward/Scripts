package okhttp3.internal.platform;

import android.os.Build;
import defpackage.bp;
import defpackage.gf8;
import defpackage.j08;
import defpackage.jya;
import defpackage.kl0;
import defpackage.lg7;
import defpackage.ln4;
import defpackage.ph1;
import defpackage.qn0;
import defpackage.tx0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static volatile c a;
    public static final Logger b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static ArrayList a(List list) {
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((gf8) obj) != gf8.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((gf8) obj2).t);
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            list.getClass();
            tx0 tx0Var = new tx0();
            ArrayList arrayListA = a(list);
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                String str = (String) obj;
                tx0Var.Z(str.length());
                tx0Var.g0(str);
            }
            return tx0Var.H(tx0Var.u);
        }
    }

    static {
        try {
            for (Map.Entry<String, String> entry : bp.b.entrySet()) {
                bp.b(entry.getKey(), entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        c aVar = okhttp3.internal.platform.a.e ? new okhttp3.internal.platform.a() : null;
        if (aVar == null) {
            aVar = b.e ? new b() : null;
        }
        if (aVar == null) {
            j08.a(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            a = aVar;
            b = Logger.getLogger(lg7.class.getName());
        }
    }

    public ln4 c(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        return new kl0(d(x509TrustManager));
    }

    public jya d(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new qn0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<gf8> list) {
        throw null;
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public String g(SSLSocket sSLSocket) {
        throw null;
    }

    public Object h() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean i(String str) {
        throw null;
    }

    public void j(String str, int i, Throwable th) {
        throw null;
    }

    public void k(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    public X509TrustManager m(SSLSocketFactory sSLSocketFactory) {
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
