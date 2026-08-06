package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import defpackage.bp;
import defpackage.fz9;
import defpackage.gf8;
import defpackage.jya;
import defpackage.lg7;
import defpackage.ln4;
import defpackage.lx1;
import defpackage.ou0;
import defpackage.pr;
import defpackage.ql;
import defpackage.rv9;
import defpackage.u30;
import defpackage.uz1;
import defpackage.wv2;
import defpackage.xj5;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends c implements uz1 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements jya {
        public final X509TrustManager a;
        public final Method b;

        public a(X509TrustManager x509TrustManager, Method method) {
            x509TrustManager.getClass();
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // defpackage.jya
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object objInvoke = this.b.invoke(this.a, x509Certificate);
                objInvoke.getClass();
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public b() {
        fz9 fz9Var;
        try {
            fz9Var = new fz9(Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl")), Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl")), Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl")));
        } catch (Exception e2) {
            CopyOnWriteArraySet<Logger> copyOnWriteArraySet = bp.a;
            bp.a(5, lg7.class.getName(), "unable to load android socket classes", e2);
            fz9Var = null;
        }
        int i = 0;
        ArrayList arrayListV = u30.v(new rv9[]{fz9Var, new wv2(pr.e), new wv2(lx1.a), new wv2(ou0.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListV.size();
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            if (((rv9) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.uz1
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.uz1
    public final Context b() {
        return this.c;
    }

    @Override // okhttp3.internal.platform.c
    public final ln4 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x509TrustManager.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ql qlVar = x509TrustManagerExtensions != null ? new ql(x509TrustManager, x509TrustManagerExtensions) : null;
        return qlVar != null ? qlVar : super.c(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.c
    public final jya d(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.c
    public final void e(SSLSocket sSLSocket, String str, List<gf8> list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((rv9) obj).a(sSLSocket));
        rv9 rv9Var = (rv9) obj;
        if (rv9Var != null) {
            rv9Var.f(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.c
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // okhttp3.internal.platform.c
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((rv9) obj).a(sSLSocket));
        rv9 rv9Var = (rv9) obj;
        if (rv9Var != null) {
            return rv9Var.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.c
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.c
    public final void j(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // okhttp3.internal.platform.c
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }

    @Override // okhttp3.internal.platform.c
    public final X509TrustManager m(SSLSocketFactory sSLSocketFactory) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((rv9) obj).e(sSLSocketFactory));
        rv9 rv9Var = (rv9) obj;
        if (rv9Var != null) {
            return rv9Var.d(sSLSocketFactory);
        }
        return null;
    }
}
