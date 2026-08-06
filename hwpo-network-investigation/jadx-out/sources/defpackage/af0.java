package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class af0 extends z0a.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final wy2 f;

    public af0(String str, String str2, String str3, String str4, int i, wy2 wy2Var) {
        if (str == null) {
            ac4.c("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ac4.c("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            ac4.c("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            ac4.c("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = wy2Var;
    }

    @Override // z0a.a
    public final String a() {
        return this.a;
    }

    @Override // z0a.a
    public final int b() {
        return this.e;
    }

    @Override // z0a.a
    public final wy2 c() {
        return this.f;
    }

    @Override // z0a.a
    public final String d() {
        return this.d;
    }

    @Override // z0a.a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0a.a)) {
            return false;
        }
        z0a.a aVar = (z0a.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.d.equals(aVar.d()) && this.e == aVar.b() && this.f.equals(aVar.c());
    }

    @Override // z0a.a
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
