package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jf extends gm3<String> {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(String str) {
        super(str);
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf) && xj5.a(this.b, ((jf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return sk0.c("ShowError(error=", this.b, ")");
    }
}
