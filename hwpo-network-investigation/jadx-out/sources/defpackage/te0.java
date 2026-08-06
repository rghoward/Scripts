package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 extends gx8 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public te0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            ac4.c("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            ac4.c("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            ac4.c("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    @Override // defpackage.gx8
    public final String a() {
        return this.c;
    }

    @Override // defpackage.gx8
    public final String b() {
        return this.d;
    }

    @Override // defpackage.gx8
    public final String c() {
        return this.b;
    }

    @Override // defpackage.gx8
    public final long d() {
        return this.f;
    }

    @Override // defpackage.gx8
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gx8)) {
            return false;
        }
        gx8 gx8Var = (gx8) obj;
        return this.b.equals(gx8Var.c()) && this.c.equals(gx8Var.a()) && this.d.equals(gx8Var.b()) && this.e.equals(gx8Var.e()) && this.f == gx8Var.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return jp2.a(this.f, "}", sb);
    }
}
