package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ka8 {
    public final int a;

    public ka8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ka8) {
            return this.a == ((ka8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
