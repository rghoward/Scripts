package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ag3 {
    public final String a;

    public ag3(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ac4.c("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag3)) {
            return false;
        }
        return this.a.equals(((ag3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return av.a(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
