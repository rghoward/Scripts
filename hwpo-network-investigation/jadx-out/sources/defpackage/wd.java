package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wd {
    public final fk2 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final c61 e;
    public final ja0 f;
    public final Proxy g;
    public final ProxySelector h;
    public final f55 i;
    public final List<gf8> j;
    public final List<cx1> k;

    public wd(String str, int i, fk2 fk2Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, c61 c61Var, ja0 ja0Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        fk2Var.getClass();
        socketFactory.getClass();
        ja0Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = fk2Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = c61Var;
        this.f = ja0Var;
        this.g = proxy;
        this.h = proxySelector;
        f55.a aVar = new f55.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                z90.a("unexpected scheme: ".concat(str2));
                throw null;
            }
            aVar.a = "https";
        }
        aVar.c(str);
        aVar.e(i);
        this.i = aVar.a();
        this.j = ytb.k(list);
        this.k = ytb.k(list2);
    }

    public final boolean a(wd wdVar) {
        wdVar.getClass();
        return xj5.a(this.a, wdVar.a) && xj5.a(this.f, wdVar.f) && xj5.a(this.j, wdVar.j) && xj5.a(this.k, wdVar.k) && xj5.a(this.h, wdVar.h) && xj5.a(this.g, wdVar.g) && xj5.a(this.c, wdVar.c) && xj5.a(this.d, wdVar.d) && xj5.a(this.e, wdVar.e) && this.i.e == wdVar.i.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return xj5.a(this.i, wdVar.i) && a(wdVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + ho2.a(ho2.a((this.f.hashCode() + ((this.a.hashCode() + ru3.c(527, 31, this.i.i)) * 31)) * 31, 31, this.j), 31, this.k)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        f55 f55Var = this.i;
        sb.append(f55Var.d);
        sb.append(':');
        sb.append(f55Var.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        return wu0.a(sb, str, '}');
    }
}
