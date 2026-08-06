package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gmb implements bs6 {
    public final sp0.b a;
    public final int b;

    public gmb(sp0.b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    @Override // defpackage.bs6
    public final int a(gg5 gg5Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : uh8.g(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmb)) {
            return false;
        }
        gmb gmbVar = (gmb) obj;
        return this.a.equals(gmbVar.a) && this.b == gmbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return e44.a(sb, this.b, ')');
    }
}
