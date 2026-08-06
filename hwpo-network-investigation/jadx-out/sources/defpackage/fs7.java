package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class fs7 extends vx6<hs7> {
    public final es7 t;
    public final boolean u = true;
    public final di v;
    public final nz1 w;
    public final float x;
    public final wh1 y;

    public fs7(es7 es7Var, di diVar, nz1 nz1Var, float f, wh1 wh1Var) {
        this.t = es7Var;
        this.v = diVar;
        this.w = nz1Var;
        this.x = f;
        this.y = wh1Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        hs7 hs7Var = new hs7();
        hs7Var.H = this.t;
        hs7Var.I = this.u;
        hs7Var.J = this.v;
        hs7Var.K = this.w;
        hs7Var.L = this.x;
        hs7Var.M = this.y;
        return hs7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        hs7 hs7Var = (hs7) cVar;
        boolean z = hs7Var.I;
        es7 es7Var = this.t;
        boolean z2 = this.u;
        boolean z3 = z != z2 || (z2 && !cr9.a(hs7Var.H.h(), es7Var.h()));
        hs7Var.H = es7Var;
        hs7Var.I = z2;
        hs7Var.J = this.v;
        hs7Var.K = this.w;
        hs7Var.L = this.x;
        hs7Var.M = this.y;
        if (z3) {
            ew2.f(hs7Var).Q();
        }
        b73.a(hs7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs7)) {
            return false;
        }
        fs7 fs7Var = (fs7) obj;
        return xj5.a(this.t, fs7Var.t) && this.u == fs7Var.u && xj5.a(this.v, fs7Var.v) && xj5.a(this.w, fs7Var.w) && Float.compare(this.x, fs7Var.x) == 0 && xj5.a(this.y, fs7Var.y);
    }

    public final int hashCode() {
        int iA = h44.a((this.w.hashCode() + ((this.v.hashCode() + uo2.a(this.t.hashCode() * 31, this.u, 31)) * 31)) * 31, this.x, 31);
        wh1 wh1Var = this.y;
        return iA + (wh1Var == null ? 0 : wh1Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.t + ", sizeToIntrinsics=" + this.u + ", alignment=" + this.v + ", contentScale=" + this.w + ", alpha=" + this.x + ", colorFilter=" + this.y + ')';
    }
}
