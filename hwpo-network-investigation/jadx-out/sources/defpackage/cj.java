package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cj implements bs6 {
    public final sp0.b a;
    public final sp0.b b;
    public final int c;

    public cj(sp0.b bVar, sp0.b bVar2, int i) {
        this.a = bVar;
        this.b = bVar2;
        this.c = i;
    }

    @Override // defpackage.bs6
    public final int a(gg5 gg5Var, long j, int i) {
        int iA = this.b.a(0, gg5Var.b());
        return gg5Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return this.a.equals(cjVar.a) && this.b.equals(cjVar.b) && this.c == cjVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h44.a(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return e44.a(sb, this.c, ')');
    }
}
