package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fmb implements as6 {
    public final rp0.a a;

    public fmb(rp0.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.as6
    public final int a(gg5 gg5Var, long j, int i, tq5 tq5Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (tq5Var == tq5.t ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return uh8.g(this.a.a(i, i2, tq5Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmb) && this.a.equals(((fmb) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
