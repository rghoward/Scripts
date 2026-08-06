package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wv2 implements rv9 {
    public final a a;
    public rv9 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        rv9 b(SSLSocket sSLSocket);
    }

    public wv2(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.rv9
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.rv9
    public final boolean b() {
        return true;
    }

    @Override // defpackage.rv9
    public final String c(SSLSocket sSLSocket) {
        rv9 rv9VarG = g(sSLSocket);
        if (rv9VarG != null) {
            return rv9VarG.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.rv9
    public final void f(SSLSocket sSLSocket, String str, List<? extends gf8> list) {
        list.getClass();
        rv9 rv9VarG = g(sSLSocket);
        if (rv9VarG != null) {
            rv9VarG.f(sSLSocket, str, list);
        }
    }

    public final synchronized rv9 g(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
