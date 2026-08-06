package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 extends u92.e.AbstractC0266e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.e.AbstractC0266e.a {
        public int a;
        public String b;
        public String c;
        public boolean d;
        public byte e;

        public final xd0 a() {
            String str;
            String str2;
            if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
                return new xd0(str, str2, this.a, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            if (this.c == null) {
                sb.append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                sb.append(" jailbroken");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public xd0(String str, String str2, int i, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // u92.e.AbstractC0266e
    public final String a() {
        return this.c;
    }

    @Override // u92.e.AbstractC0266e
    public final int b() {
        return this.a;
    }

    @Override // u92.e.AbstractC0266e
    public final String c() {
        return this.b;
    }

    @Override // u92.e.AbstractC0266e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.AbstractC0266e)) {
            return false;
        }
        u92.e.AbstractC0266e abstractC0266e = (u92.e.AbstractC0266e) obj;
        return this.a == abstractC0266e.b() && this.b.equals(abstractC0266e.c()) && this.c.equals(abstractC0266e.a()) && this.d == abstractC0266e.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return fz.c(sb, this.d, "}");
    }
}
