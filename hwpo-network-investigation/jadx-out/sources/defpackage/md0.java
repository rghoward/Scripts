package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class md0 extends u92.e.d.a.b.AbstractC0258a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public md0(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // u92.e.d.a.b.AbstractC0258a
    public final long a() {
        return this.a;
    }

    @Override // u92.e.d.a.b.AbstractC0258a
    public final String b() {
        return this.c;
    }

    @Override // u92.e.d.a.b.AbstractC0258a
    public final long c() {
        return this.b;
    }

    @Override // u92.e.d.a.b.AbstractC0258a
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.a.b.AbstractC0258a)) {
            return false;
        }
        u92.e.d.a.b.AbstractC0258a abstractC0258a = (u92.e.d.a.b.AbstractC0258a) obj;
        if (this.a != abstractC0258a.a() || this.b != abstractC0258a.c() || !this.c.equals(abstractC0258a.b())) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            return abstractC0258a.d() == null;
        }
        return str.equals(abstractC0258a.d());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return av.a(sb, this.d, "}");
    }
}
