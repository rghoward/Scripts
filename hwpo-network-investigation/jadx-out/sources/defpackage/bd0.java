package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bd0 extends u92.a.AbstractC0255a {
    public final String a;
    public final String b;
    public final String c;

    public bd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // u92.a.AbstractC0255a
    public final String a() {
        return this.a;
    }

    @Override // u92.a.AbstractC0255a
    public final String b() {
        return this.c;
    }

    @Override // u92.a.AbstractC0255a
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.a.AbstractC0255a)) {
            return false;
        }
        u92.a.AbstractC0255a abstractC0255a = (u92.a.AbstractC0255a) obj;
        return this.a.equals(abstractC0255a.a()) && this.b.equals(abstractC0255a.c()) && this.c.equals(abstractC0255a.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return av.a(sb, this.c, "}");
    }
}
