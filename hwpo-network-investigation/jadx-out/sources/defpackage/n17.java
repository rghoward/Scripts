package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n17 extends qp8 {
    public static final wq6 e;
    public static final wq6 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final g01 a;
    public final List<c> b;
    public final wq6 c;
    public long d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public final g01 a;
        public wq6 b;
        public final ArrayList c;

        public a(int i) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            g01 g01Var = g01.w;
            this.a = g01.a.c(string);
            this.b = n17.e;
            this.c = new ArrayList();
        }

        public final void a(String str, String str2) {
            str2.getClass();
            this.c.add(c.a.a(str, str2));
        }

        public final n17 b() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                aa0.c("Multipart body must have at least one part.");
                return null;
            }
            return new n17(this.a, this.b, ytb.k(arrayList));
        }

        public final void c(wq6 wq6Var) {
            wq6Var.getClass();
            if (wq6Var.b.equals("multipart")) {
                this.b = wq6Var;
            } else {
                r.a(wq6Var, "multipart != ");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static void a(String str, StringBuilder sb) {
            str.getClass();
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt != '\"') {
                    sb.append(cCharAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final nu4 a;
        public final qp8 b;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public static c a(String str, String str2) {
                str2.getClass();
                qp8.Companion.getClass();
                return b(str, null, qp8.a.b(str2, null));
            }

            public static c b(String str, String str2, qp8 qp8Var) {
                StringBuilder sbA = bl2.a("form-data; name=");
                wq6 wq6Var = n17.e;
                b.a(str, sbA);
                if (str2 != null) {
                    sbA.append("; filename=");
                    b.a(str2, sbA);
                }
                String string = sbA.toString();
                nu4.a aVar = new nu4.a();
                aVar.c("Content-Disposition", string);
                nu4 nu4VarD = aVar.d();
                if (nu4VarD.d("Content-Type") != null) {
                    z90.a("Unexpected header: Content-Type");
                    return null;
                }
                if (nu4VarD.d("Content-Length") == null) {
                    return new c(nu4VarD, qp8Var);
                }
                z90.a("Unexpected header: Content-Length");
                return null;
            }
        }

        public c(nu4 nu4Var, qp8 qp8Var) {
            this.a = nu4Var;
            this.b = qp8Var;
        }
    }

    static {
        ol8 ol8Var = wq6.e;
        e = wq6.a.a("multipart/mixed");
        wq6.a.a("multipart/alternative");
        wq6.a.a("multipart/digest");
        wq6.a.a("multipart/parallel");
        f = wq6.a.a("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public n17(g01 g01Var, wq6 wq6Var, List<c> list) {
        g01Var.getClass();
        wq6Var.getClass();
        this.a = g01Var;
        this.b = list;
        ol8 ol8Var = wq6.e;
        this.c = wq6.a.a(wq6Var + "; boundary=" + g01Var.w());
        this.d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(fy0 fy0Var, boolean z) throws EOFException {
        tx0 tx0Var;
        fy0 tx0Var2;
        if (z) {
            tx0Var2 = new tx0();
            tx0Var = tx0Var2;
        } else {
            tx0Var = 0;
            tx0Var2 = fy0Var;
        }
        List<c> list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            g01 g01Var = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                tx0Var2.getClass();
                tx0Var2.write(bArr);
                tx0Var2.k0(g01Var);
                tx0Var2.write(bArr);
                tx0Var2.write(bArr2);
                if (!z) {
                    return j;
                }
                tx0Var.getClass();
                long j2 = j + tx0Var.u;
                tx0Var.h();
                return j2;
            }
            c cVar = list.get(i2);
            nu4 nu4Var = cVar.a;
            qp8 qp8Var = cVar.b;
            tx0Var2.getClass();
            tx0Var2.write(bArr);
            tx0Var2.k0(g01Var);
            tx0Var2.write(bArr2);
            int size2 = nu4Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tx0Var2.R(nu4Var.e(i3)).write(g).R(nu4Var.j(i3)).write(bArr2);
            }
            wq6 wq6VarContentType = qp8Var.contentType();
            if (wq6VarContentType != null) {
                tx0Var2.R("Content-Type: ").R(wq6VarContentType.a).write(bArr2);
            }
            long jContentLength = qp8Var.contentLength();
            if (jContentLength == -1 && z) {
                tx0Var.getClass();
                tx0Var.h();
                return -1L;
            }
            tx0Var2.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                qp8Var.writeTo(tx0Var2);
            }
            tx0Var2.write(bArr2);
            i2++;
        }
    }

    @Override // defpackage.qp8
    public final long contentLength() throws EOFException {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jA = a(null, true);
        this.d = jA;
        return jA;
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return this.c;
    }

    @Override // defpackage.qp8
    public final boolean isOneShot() {
        List<c> list = this.b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) throws EOFException {
        fy0Var.getClass();
        a(fy0Var, false);
    }
}
