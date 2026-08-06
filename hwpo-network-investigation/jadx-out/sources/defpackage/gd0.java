package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends u92.e.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public gd0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // u92.e.a
    public final String a() {
        return this.e;
    }

    @Override // u92.e.a
    public final String b() {
        return this.f;
    }

    @Override // u92.e.a
    public final String c() {
        return this.c;
    }

    @Override // u92.e.a
    public final String d() {
        return this.a;
    }

    @Override // u92.e.a
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.a)) {
            return false;
        }
        u92.e.a aVar = (u92.e.a) obj;
        if (!this.a.equals(aVar.d()) || !this.b.equals(aVar.g())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!str.equals(aVar.c())) {
            return false;
        }
        if (aVar.f() != null) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (aVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(aVar.e())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!str3.equals(aVar.a())) {
            return false;
        }
        String str4 = this.f;
        if (str4 == null) {
            return aVar.b() == null;
        }
        return str4.equals(aVar.b());
    }

    @Override // u92.e.a
    public final u92.e.a.AbstractC0256a f() {
        return null;
    }

    @Override // u92.e.a
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        return av.a(sb, this.f, "}");
    }
}
