package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qs5 extends vx6<rs5> {
    public final float t;
    public final boolean u;

    public qs5(boolean z, float f) {
        this.t = f;
        this.u = z;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        rs5 rs5Var = new rs5();
        rs5Var.H = this.t;
        rs5Var.I = this.u;
        return rs5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        rs5 rs5Var = (rs5) cVar;
        rs5Var.H = this.t;
        rs5Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        qs5 qs5Var = obj instanceof qs5 ? (qs5) obj : null;
        return qs5Var != null && this.t == qs5Var.t && this.u == qs5Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + (Float.hashCode(this.t) * 31);
    }
}
