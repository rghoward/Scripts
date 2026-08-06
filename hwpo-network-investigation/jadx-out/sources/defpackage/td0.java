package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class td0 extends u92.e.d.AbstractC0264d {
    public final String a;

    public td0(String str) {
        this.a = str;
    }

    @Override // u92.e.d.AbstractC0264d
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u92.e.d.AbstractC0264d) {
            return this.a.equals(((u92.e.d.AbstractC0264d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return av.a(new StringBuilder("Log{content="), this.a, "}");
    }
}
