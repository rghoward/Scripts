package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.b;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class pr implements rv9 {
    public static final or e = new or();
    public final Class<? super SSLSocket> a;
    public final Method b;
    public final Method c;
    public final Method d;

    public pr(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.rv9
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.rv9
    public final boolean b() {
        boolean z = b.e;
        return b.e;
    }

    @Override // defpackage.rv9
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, ua1.b);
                }
            } catch (IllegalAccessException e2) {
                sx0.a(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !xj5.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    sx0.a(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.rv9
    public final void f(SSLSocket sSLSocket, String str, List<? extends gf8> list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                c cVar = c.a;
                method.invoke(sSLSocket, c.a.b(list));
            } catch (IllegalAccessException e2) {
                sx0.a(e2);
            } catch (InvocationTargetException e3) {
                sx0.a(e3);
            }
        }
    }
}
