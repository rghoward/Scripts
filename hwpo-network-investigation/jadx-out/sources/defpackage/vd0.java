package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 extends u92.e.d.AbstractC0265e.b {
    public final String a;
    public final String b;

    public vd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // u92.e.d.AbstractC0265e.b
    public final String a() {
        return this.a;
    }

    @Override // u92.e.d.AbstractC0265e.b
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.e.d.AbstractC0265e.b)) {
            return false;
        }
        u92.e.d.AbstractC0265e.b bVar = (u92.e.d.AbstractC0265e.b) obj;
        return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return av.a(sb, this.b, "}");
    }
}
