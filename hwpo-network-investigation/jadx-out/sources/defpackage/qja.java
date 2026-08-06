package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qja {
    public final long a;
    public final long b;

    public qja(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qja)) {
            return false;
        }
        qja qjaVar = (qja) obj;
        return uh1.c(this.a, qjaVar.a) && uh1.c(this.b, qjaVar.b);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        a83.b(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) uh1.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
