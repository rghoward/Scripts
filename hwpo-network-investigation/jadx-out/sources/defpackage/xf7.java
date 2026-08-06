package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class xf7 extends vx6<bg7> {
    public final float t;
    public final float u;
    public final boolean v = true;

    public xf7(float f, float f2, yf7 yf7Var) {
        this.t = f;
        this.u = f2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        bg7 bg7Var = new bg7();
        bg7Var.H = this.t;
        bg7Var.I = this.u;
        bg7Var.J = this.v;
        return bg7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        bg7 bg7Var = (bg7) cVar;
        float f = bg7Var.H;
        float f2 = this.t;
        boolean zE = y43.e(f, f2);
        float f3 = this.u;
        boolean z = this.v;
        if (!zE || !y43.e(bg7Var.I, f3) || bg7Var.J != z) {
            ew2.f(bg7Var).f0(false);
        }
        bg7Var.H = f2;
        bg7Var.I = f3;
        bg7Var.J = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xf7 xf7Var = obj instanceof xf7 ? (xf7) obj : null;
        return xf7Var != null && y43.e(this.t, xf7Var.t) && y43.e(this.u, xf7Var.u) && this.v == xf7Var.v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v) + h44.a(Float.hashCode(this.t) * 31, this.u, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        sb.append((Object) y43.f(this.t));
        sb.append(", y=");
        sb.append((Object) y43.f(this.u));
        sb.append(", rtlAware=");
        return pi1.a(sb, this.v, ')');
    }
}
