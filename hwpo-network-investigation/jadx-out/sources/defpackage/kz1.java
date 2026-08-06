package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends vx6<mz1> {
    public final es7 t;
    public final di u;
    public final nz1 v;
    public final float w;
    public final wh1 x;

    public kz1(es7 es7Var, di diVar, nz1 nz1Var, float f, wh1 wh1Var) {
        this.t = es7Var;
        this.u = diVar;
        this.v = nz1Var;
        this.w = f;
        this.x = wh1Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        mz1 mz1Var = new mz1();
        mz1Var.H = this.t;
        mz1Var.I = this.u;
        mz1Var.J = this.v;
        mz1Var.K = this.w;
        mz1Var.L = this.x;
        return mz1Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        mz1 mz1Var = (mz1) cVar;
        long jH = mz1Var.H.h();
        es7 es7Var = this.t;
        boolean zA = cr9.a(jH, es7Var.h());
        mz1Var.H = es7Var;
        mz1Var.I = this.u;
        mz1Var.J = this.v;
        mz1Var.K = this.w;
        mz1Var.L = this.x;
        if (!zA) {
            ew2.f(mz1Var).Q();
        }
        b73.a(mz1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz1)) {
            return false;
        }
        kz1 kz1Var = (kz1) obj;
        return xj5.a(this.t, kz1Var.t) && xj5.a(this.u, kz1Var.u) && xj5.a(this.v, kz1Var.v) && Float.compare(this.w, kz1Var.w) == 0 && xj5.a(this.x, kz1Var.x);
    }

    public final int hashCode() {
        int iA = h44.a((this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31)) * 31, this.w, 31);
        wh1 wh1Var = this.x;
        return iA + (wh1Var == null ? 0 : wh1Var.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.t + ", alignment=" + this.u + ", contentScale=" + this.v + ", alpha=" + this.w + ", colorFilter=" + this.x + ')';
    }
}
