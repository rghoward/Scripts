package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends u92.e.d.AbstractC0265e {
    public final u92.e.d.AbstractC0265e.b a;
    public final String b;
    public final String c;
    public final long d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.e.d.AbstractC0265e.a {
        public vd0 a;
        public String b;
        public String c;
        public long d;
        public byte e;

        public final ud0 a() {
            vd0 vd0Var;
            String str;
            String str2;
            if (this.e == 1 && (vd0Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new ud0(vd0Var, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.b == null) {
                sb.append(" parameterKey");
            }
            if (this.c == null) {
                sb.append(" parameterValue");
            }
            if ((this.e & 1) == 0) {
                sb.append(" templateVersion");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public ud0(vd0 vd0Var, String str, String str2, long j) {
        this.a = vd0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // u92.e.d.AbstractC0265e
    public final String a() {
        return this.b;
    }

    @Override // u92.e.d.AbstractC0265e
    public final String b() {
        return this.c;
    }

    @Override // u92.e.d.AbstractC0265e
    public final u92.e.d.AbstractC0265e.b c() {
        return this.a;
    }

    @Override // u92.e.d.AbstractC0265e
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.AbstractC0265e)) {
            return false;
        }
        u92.e.d.AbstractC0265e abstractC0265e = (u92.e.d.AbstractC0265e) obj;
        return this.a.equals(abstractC0265e.c()) && this.b.equals(abstractC0265e.a()) && this.c.equals(abstractC0265e.b()) && this.d == abstractC0265e.d();
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return jp2.a(this.d, "}", sb);
    }
}
