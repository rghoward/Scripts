package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ao7 extends vx6<fo7> {
    public final float t;
    public final float u;
    public final float v;
    public final float w;
    public final boolean x = true;
    public final oh4<pe5, g2b> y;

    public ao7(float f, float f2, float f3, float f4, oh4 oh4Var) {
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.w = f4;
        boolean z = true;
        this.y = oh4Var;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            sc5.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        fo7 fo7Var = new fo7();
        fo7Var.H = this.t;
        fo7Var.I = this.u;
        fo7Var.J = this.v;
        fo7Var.K = this.w;
        fo7Var.L = this.x;
        return fo7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        fo7 fo7Var = (fo7) cVar;
        fo7Var.H = this.t;
        fo7Var.I = this.u;
        fo7Var.J = this.v;
        fo7Var.K = this.w;
        fo7Var.L = this.x;
    }

    public final boolean equals(Object obj) {
        ao7 ao7Var = obj instanceof ao7 ? (ao7) obj : null;
        return ao7Var != null && y43.e(this.t, ao7Var.t) && y43.e(this.u, ao7Var.u) && y43.e(this.v, ao7Var.v) && y43.e(this.w, ao7Var.w) && this.x == ao7Var.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + h44.a(h44.a(h44.a(Float.hashCode(this.t) * 31, this.u, 31), this.v, 31), this.w, 31);
    }
}
