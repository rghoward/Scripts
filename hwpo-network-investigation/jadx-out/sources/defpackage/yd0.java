package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends u92.e.f {
    public final String a;

    public yd0(String str) {
        this.a = str;
    }

    @Override // u92.e.f
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u92.e.f) {
            return this.a.equals(((u92.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return av.a(new StringBuilder("User{identifier="), this.a, "}");
    }
}
