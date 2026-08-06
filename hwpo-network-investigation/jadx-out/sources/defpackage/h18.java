package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h18 {
    public static final h18 c = new h18();
    public final boolean a;
    public final int b;

    public h18(int i) {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h18)) {
            return false;
        }
        h18 h18Var = (h18) obj;
        return this.a == h18Var.a && this.b == h18Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) we3.a(this.b)) + ')';
    }

    public h18(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public h18() {
        this(0, false);
    }
}
