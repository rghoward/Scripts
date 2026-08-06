package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class hr9 extends vx6<jr9> {
    public final float t;
    public final float u;
    public final float v;
    public final float w;
    public final boolean x;

    public /* synthetic */ hr9(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        jr9 jr9Var = new jr9();
        jr9Var.H = this.t;
        jr9Var.I = this.u;
        jr9Var.J = this.v;
        jr9Var.K = this.w;
        jr9Var.L = this.x;
        return jr9Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        jr9 jr9Var = (jr9) cVar;
        jr9Var.H = this.t;
        jr9Var.I = this.u;
        jr9Var.J = this.v;
        jr9Var.K = this.w;
        jr9Var.L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr9)) {
            return false;
        }
        hr9 hr9Var = (hr9) obj;
        return y43.e(this.t, hr9Var.t) && y43.e(this.u, hr9Var.u) && y43.e(this.v, hr9Var.v) && y43.e(this.w, hr9Var.w) && this.x == hr9Var.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + h44.a(h44.a(h44.a(Float.hashCode(this.t) * 31, this.u, 31), this.v, 31), this.w, 31);
    }

    public hr9(float f, float f2, float f3, float f4, boolean z) {
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.w = f4;
        this.x = z;
    }
}
