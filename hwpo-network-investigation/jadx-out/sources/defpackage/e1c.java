package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e1c {
    public final Object a;
    public final int b;

    public e1c(int i, g3c g3cVar) {
        this.a = g3cVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1c)) {
            return false;
        }
        e1c e1cVar = (e1c) obj;
        return this.a == e1cVar.a && this.b == e1cVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
