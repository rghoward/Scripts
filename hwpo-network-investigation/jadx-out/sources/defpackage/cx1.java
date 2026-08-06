package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cx1 {
    public static final List<zc1> e;
    public static final List<zc1> f;
    public static final cx1 g;
    public static final cx1 h;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final boolean a = true;
        public String[] b;
        public String[] c;
        public boolean d;

        public final cx1 a() {
            return new cx1(this.a, this.d, this.b, this.c);
        }

        public final void b(zc1... zc1VarArr) {
            boolean z = this.a;
            if (!z) {
                z90.a("no cipher suites for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(zc1VarArr.length);
            for (zc1 zc1Var : zc1VarArr) {
                arrayList.add(zc1Var.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!z) {
                z90.a("no cipher suites for cleartext connections");
            } else if (strArr2.length != 0) {
                this.b = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                z90.a("At least one cipher suite is required");
            }
        }

        public final void c(jpa... jpaVarArr) {
            boolean z = this.a;
            if (!z) {
                z90.a("no TLS versions for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(jpaVarArr.length);
            for (jpa jpaVar : jpaVarArr) {
                arrayList.add(jpaVar.t);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!z) {
                z90.a("no TLS versions for cleartext connections");
            } else if (strArr2.length != 0) {
                this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                z90.a("At least one TLS version is required");
            }
        }
    }

    static {
        zc1 zc1Var = zc1.r;
        zc1 zc1Var2 = zc1.s;
        zc1 zc1Var3 = zc1.t;
        zc1 zc1Var4 = zc1.l;
        zc1 zc1Var5 = zc1.n;
        zc1 zc1Var6 = zc1.m;
        zc1 zc1Var7 = zc1.o;
        zc1 zc1Var8 = zc1.q;
        zc1 zc1Var9 = zc1.p;
        List<zc1> listI = ws0.i(zc1Var, zc1Var2, zc1Var3, zc1Var4, zc1Var5, zc1Var6, zc1Var7, zc1Var8, zc1Var9);
        e = listI;
        List<zc1> listI2 = ws0.i(zc1Var, zc1Var2, zc1Var3, zc1Var4, zc1Var5, zc1Var6, zc1Var7, zc1Var8, zc1Var9, zc1.j, zc1.k, zc1.h, zc1.i, zc1.f, zc1.g, zc1.e);
        f = listI2;
        a aVar = new a();
        zc1[] zc1VarArr = (zc1[]) listI.toArray(new zc1[0]);
        aVar.b((zc1[]) Arrays.copyOf(zc1VarArr, zc1VarArr.length));
        jpa jpaVar = jpa.TLS_1_3;
        jpa jpaVar2 = jpa.TLS_1_2;
        aVar.c(jpaVar, jpaVar2);
        aVar.d = true;
        aVar.a();
        a aVar2 = new a();
        zc1[] zc1VarArr2 = (zc1[]) listI2.toArray(new zc1[0]);
        aVar2.b((zc1[]) Arrays.copyOf(zc1VarArr2, zc1VarArr2.length));
        aVar2.c(jpaVar, jpaVar2);
        aVar2.d = true;
        g = aVar2.a();
        a aVar3 = new a();
        zc1[] zc1VarArr3 = (zc1[]) listI2.toArray(new zc1[0]);
        aVar3.b((zc1[]) Arrays.copyOf(zc1VarArr3, zc1VarArr3.length));
        aVar3.c(jpaVar, jpaVar2, jpa.TLS_1_1, jpa.TLS_1_0);
        aVar3.d = true;
        aVar3.a();
        h = new cx1(false, false, null, null);
    }

    public cx1(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = vtb.l(strArr, enabledCipherSuites, zc1.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = vtb.l(enabledProtocols2, strArr2, m47.t);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        zc1.a aVar = zc1.c;
        byte[] bArr = vtb.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (aVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            z90.a("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            z90.a("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            z90.a("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            z90.a("At least one TLS version is required");
            return;
        }
        cx1 cx1Var = new cx1(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (cx1Var.c() != null) {
            sSLSocket.setEnabledProtocols(cx1Var.d);
        }
        if (cx1Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(cx1Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(zc1.b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            jpa.u.getClass();
            arrayList.add(jpa.a.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cx1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        cx1 cx1Var = (cx1) obj;
        boolean z = cx1Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, cx1Var.c) && Arrays.equals(this.d, cx1Var.d) && this.b == cx1Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return pi1.a(sb, this.b, ')');
    }
}
