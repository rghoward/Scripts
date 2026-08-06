package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import defpackage.gf8;
import defpackage.jya;
import defpackage.ln4;
import defpackage.lx1;
import defpackage.ou0;
import defpackage.pr;
import defpackage.ql;
import defpackage.rv9;
import defpackage.u30;
import defpackage.uz1;
import defpackage.wv2;
import defpackage.zj;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c implements uz1 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i = 0;
        ArrayList arrayListV = u30.v(new rv9[]{Build.VERSION.SDK_INT >= 29 ? new zj() : null, new wv2(pr.e), new wv2(lx1.a), new wv2(ou0.a)});
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.c
    public final void e(SSLSocket sSLSocket, String str, List<? extends gf8> list) {
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.c
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.c
    public final void j(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = b.e;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = b.e;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // okhttp3.internal.platform.c
    public final void k(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            obj.getClass();
            ((CloseGuard) obj).warnIfOpen();
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
