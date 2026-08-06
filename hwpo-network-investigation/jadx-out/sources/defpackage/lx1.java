package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.c;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lx1 implements rv9 {
    public static final a a = new a();
    public static final boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements wv2.a {
        @Override // wv2.a
        public final boolean a(SSLSocket sSLSocket) {
            return lx1.b && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // wv2.a
        public final rv9 b(SSLSocket sSLSocket) {
            return new lx1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, b.class.getClassLoader());
            if (Conscrypt.isAvailable() && b.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.rv9
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.rv9
    public final boolean b() {
        return b;
    }

    @Override // defpackage.rv9
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.rv9
    public final void f(SSLSocket sSLSocket, String str, List<? extends gf8> list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            c cVar = c.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) c.a.a(list).toArray(new String[0]));
        }
    }
}
