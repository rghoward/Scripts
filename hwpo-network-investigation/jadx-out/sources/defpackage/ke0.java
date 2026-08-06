package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke0 extends p66 {
    public final String a;
    public final String b;

    public ke0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            ac4.c("Null version");
            throw null;
        }
    }

    @Override // defpackage.p66
    public final String a() {
        return this.a;
    }

    @Override // defpackage.p66
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p66)) {
            return false;
        }
        p66 p66Var = (p66) obj;
        return this.a.equals(p66Var.a()) && this.b.equals(p66Var.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return av.a(sb, this.b, "}");
    }
}
