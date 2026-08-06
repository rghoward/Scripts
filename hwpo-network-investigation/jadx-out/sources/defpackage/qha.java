package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qha {
    public static final qha c = new qha(3, 0L);
    public final long a;
    public final long b;

    public /* synthetic */ qha(int i, long j) {
        this(cka.b(0), (i & 2) != 0 ? cka.b(0) : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qha)) {
            return false;
        }
        qha qhaVar = (qha) obj;
        return bka.a(this.a, qhaVar.a) && bka.a(this.b, qhaVar.b);
    }

    public final int hashCode() {
        dka[] dkaVarArr = bka.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) bka.d(this.a)) + ", restLine=" + ((Object) bka.d(this.b)) + ')';
    }

    public qha(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
