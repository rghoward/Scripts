package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aw9 extends fx0 {
    public final long a;

    public aw9(long j) {
        this.a = j;
    }

    @Override // defpackage.fx0
    public final void a(float f, long j, cs7 cs7Var) {
        cs7Var.b(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = uh1.b(uh1.d(jB) * f, jB);
        }
        cs7Var.f(jB);
        if (cs7Var.e() != null) {
            cs7Var.d(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aw9) {
            return uh1.c(this.a, ((aw9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) uh1.i(this.a)) + ')';
    }
}
