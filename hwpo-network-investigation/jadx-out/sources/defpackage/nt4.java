package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nt4 {
    public final jpa a;
    public final zc1 b;
    public final List<Certificate> c;
    public final o7a d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static nt4 a(SSLSession sSLSession) throws IOException {
            List listL;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                aa0.c("cipherSuite == null");
                return null;
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                o03.a("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            zc1 zc1VarB = zc1.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                aa0.c("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(protocol)) {
                o03.a("tlsVersion == NONE");
                return null;
            }
            jpa.u.getClass();
            jpa jpaVarA = jpa.a.a(protocol);
            try {
                listL = ytb.l(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listL = hf3.t;
            }
            return new nt4(jpaVarA, zc1VarB, ytb.l(sSLSession.getLocalCertificates()), new mt4(listL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nt4(jpa jpaVar, zc1 zc1Var, List<? extends Certificate> list, mh4<? extends List<? extends Certificate>> mh4Var) {
        this.a = jpaVar;
        this.b = zc1Var;
        this.c = list;
        this.d = new o7a(new lt4(0, mh4Var));
    }

    public final List<Certificate> a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nt4)) {
            return false;
        }
        nt4 nt4Var = (nt4) obj;
        return nt4Var.a == this.a && nt4Var.b == this.b && xj5.a(nt4Var.a(), a()) && nt4Var.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(ph1.n(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(ph1.n(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
