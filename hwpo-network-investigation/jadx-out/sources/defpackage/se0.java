package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends fx8 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fx8.a {
        public String a;
        public String b;
        public String c;
        public String d;
        public long e;
        public byte f;

        public final se0 a() {
            if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
                return new se0(this.a, this.b, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            if (this.c == null) {
                sb.append(" parameterKey");
            }
            if (this.d == null) {
                sb.append(" parameterValue");
            }
            if ((this.f & 1) == 0) {
                sb.append(" templateVersion");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public se0(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    @Override // defpackage.fx8
    public final String a() {
        return this.d;
    }

    @Override // defpackage.fx8
    public final String b() {
        return this.e;
    }

    @Override // defpackage.fx8
    public final String c() {
        return this.b;
    }

    @Override // defpackage.fx8
    public final long d() {
        return this.f;
    }

    @Override // defpackage.fx8
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fx8)) {
            return false;
        }
        fx8 fx8Var = (fx8) obj;
        return this.b.equals(fx8Var.c()) && this.c.equals(fx8Var.e()) && this.d.equals(fx8Var.a()) && this.e.equals(fx8Var.b()) && this.f == fx8Var.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return jp2.a(this.f, "}", sb);
    }
}
