package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iy7 extends gm3<g2b> {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy7(String str) {
        super(g2b.a);
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy7) && xj5.a(this.b, ((iy7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return sk0.c("SetResultAndClose(selectedCountryCode=", this.b, ")");
    }
}
