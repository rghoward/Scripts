package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bb {
    public final int a;
    public final Number b;
    public final String c;

    public bb(int i, Number number, String str) {
        this.a = i;
        this.b = number;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && this.b.equals(bbVar.b) && this.c.equals(bbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddBenchmarkModel(id=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", units=");
        return av.a(sb, this.c, ")");
    }
}
