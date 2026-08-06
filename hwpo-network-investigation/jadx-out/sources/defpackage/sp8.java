package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sp8 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final f55 b;
    public String c;
    public f55.a d;
    public final jp8.a e = new jp8.a();
    public final nu4.a f;
    public wq6 g;
    public final boolean h;
    public final n17.a i;
    public final fd4.a j;
    public qp8 k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends qp8 {
        public final qp8 a;
        public final wq6 b;

        public a(qp8 qp8Var, wq6 wq6Var) {
            this.a = qp8Var;
            this.b = wq6Var;
        }

        @Override // defpackage.qp8
        public final long contentLength() {
            return this.a.contentLength();
        }

        @Override // defpackage.qp8
        public final wq6 contentType() {
            return this.b;
        }

        @Override // defpackage.qp8
        public final void writeTo(fy0 fy0Var) {
            this.a.writeTo(fy0Var);
        }
    }

    public sp8(String str, f55 f55Var, String str2, nu4 nu4Var, wq6 wq6Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = f55Var;
        this.c = str2;
        this.g = wq6Var;
        this.h = z;
        if (nu4Var != null) {
            this.f = nu4Var.f();
        } else {
            this.f = new nu4.a();
        }
        if (z2) {
            this.j = new fd4.a();
        } else if (z3) {
            n17.a aVar = new n17.a(0);
            this.i = aVar;
            aVar.c(n17.f);
        }
    }

    public final void a(String str, String str2, boolean z) {
        fd4.a aVar = this.j;
        if (z) {
            aVar.getClass();
            str.getClass();
            aVar.a.add(utb.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            aVar.b.add(utb.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        aVar.getClass();
        str.getClass();
        aVar.a.add(utb.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        aVar.b.add(utb.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                ol8 ol8Var = wq6.e;
                this.g = wq6.a.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ct1.a("Malformed content type: ", str2), e);
            }
        }
        nu4.a aVar = this.f;
        if (z) {
            aVar.c(str, str2);
        } else {
            aVar.a(str, str2);
        }
    }

    public final void c(nu4 nu4Var, qp8 qp8Var) {
        n17.a aVar = this.i;
        aVar.getClass();
        qp8Var.getClass();
        if (nu4Var.d("Content-Type") != null) {
            z90.a("Unexpected header: Content-Type");
        } else if (nu4Var.d("Content-Length") != null) {
            z90.a("Unexpected header: Content-Length");
        } else {
            aVar.c.add(new n17.c(nu4Var, qp8Var));
        }
    }

    public final void d(String str, String str2, boolean z) {
        f55.a aVar;
        String str3 = this.c;
        if (str3 != null) {
            f55 f55Var = this.b;
            f55Var.getClass();
            try {
                aVar = new f55.a();
                aVar.d(f55Var, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.d = aVar;
            if (aVar == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(f55Var);
                vr0.d(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        f55.a aVar2 = this.d;
        if (z) {
            aVar2.getClass();
            str.getClass();
            if (aVar2.g == null) {
                aVar2.g = new ArrayList();
            }
            ArrayList arrayList = aVar2.g;
            arrayList.getClass();
            arrayList.add(utb.a(0, 0, 83, str, " \"'<>#&="));
            ArrayList arrayList2 = aVar2.g;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? utb.a(0, 0, 83, str2, " \"'<>#&=") : null);
            return;
        }
        aVar2.getClass();
        str.getClass();
        if (aVar2.g == null) {
            aVar2.g = new ArrayList();
        }
        ArrayList arrayList3 = aVar2.g;
        arrayList3.getClass();
        arrayList3.add(utb.a(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = aVar2.g;
        arrayList4.getClass();
        arrayList4.add(str2 != null ? utb.a(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
