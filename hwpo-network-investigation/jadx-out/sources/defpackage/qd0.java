package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 extends u92.e.d.a.b.AbstractC0260d.AbstractC0261a {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends u92.e.d.a.b.AbstractC0260d.AbstractC0261a.AbstractC0262a {
        public long a;
        public String b;
        public String c;
        public long d;
        public int e;
        public byte f;

        public final qd0 a() {
            String str;
            if (this.f == 7 && (str = this.b) != null) {
                return new qd0(this.a, str, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            aa0.c(v92.a("Missing required properties:", sb));
            return null;
        }
    }

    public qd0(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // u92.e.d.a.b.AbstractC0260d.AbstractC0261a
    public final String a() {
        return this.c;
    }

    @Override // u92.e.d.a.b.AbstractC0260d.AbstractC0261a
    public final int b() {
        return this.e;
    }

    @Override // u92.e.d.a.b.AbstractC0260d.AbstractC0261a
    public final long c() {
        return this.d;
    }

    @Override // u92.e.d.a.b.AbstractC0260d.AbstractC0261a
    public final long d() {
        return this.a;
    }

    @Override // u92.e.d.a.b.AbstractC0260d.AbstractC0261a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.a.b.AbstractC0260d.AbstractC0261a)) {
            return false;
        }
        u92.e.d.a.b.AbstractC0260d.AbstractC0261a abstractC0261a = (u92.e.d.a.b.AbstractC0260d.AbstractC0261a) obj;
        if (this.a != abstractC0261a.d() || !this.b.equals(abstractC0261a.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (abstractC0261a.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0261a.a())) {
            return false;
        }
        return this.d == abstractC0261a.c() && this.e == abstractC0261a.b();
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return i34.b(this.e, "}", sb);
    }
}
