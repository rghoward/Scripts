package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 extends gm3<g2b> {
    public final l55.b b;

    public zk1(l55.b bVar) {
        super(g2b.a);
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk1) && xj5.a(this.b, ((zk1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ConfirmDeletionDialog(params=" + this.b + ")";
    }
}
