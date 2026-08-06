package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bj implements as6 {
    public final sp0.a a;
    public final sp0.a b;
    public final int c;

    public bj(sp0.a aVar, sp0.a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
    }

    @Override // defpackage.as6
    public final int a(gg5 gg5Var, long j, int i, tq5 tq5Var) {
        int iA = this.b.a(0, gg5Var.d(), tq5Var);
        int i2 = -this.a.a(0, i, tq5Var);
        tq5 tq5Var2 = tq5.t;
        int i3 = this.c;
        if (tq5Var != tq5Var2) {
            i3 = -i3;
        }
        return gg5Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.a.equals(bjVar.a) && this.b.equals(bjVar.b) && this.c == bjVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h44.a(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return e44.a(sb, this.c, ')');
    }
}
