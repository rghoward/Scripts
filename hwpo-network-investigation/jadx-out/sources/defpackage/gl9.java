package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gl9 extends vx6<br0> {
    public final float t;
    public final jl9 u;
    public final boolean v;
    public final long w;
    public final long x;

    public gl9(float f, jl9 jl9Var, boolean z, long j, long j2) {
        this.t = f;
        this.u = jl9Var;
        this.v = z;
        this.w = j;
        this.x = j2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new br0(new fl9(this));
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        mb7 mb7Var;
        br0 br0Var = (br0) cVar;
        fl9 fl9Var = new fl9(this);
        br0Var.H = fl9Var;
        if (br0Var.t.G && (mb7Var = ew2.d(br0Var, 2).K) != null) {
            mb7Var.c2(fl9Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl9)) {
            return false;
        }
        gl9 gl9Var = (gl9) obj;
        return y43.e(this.t, gl9Var.t) && xj5.a(this.u, gl9Var.u) && this.v == gl9Var.v && uh1.c(this.w, gl9Var.w) && uh1.c(this.x, gl9Var.x);
    }

    public final int hashCode() {
        int iA = uo2.a((this.u.hashCode() + (Float.hashCode(this.t) * 31)) * 31, this.v, 31);
        int i = uh1.l;
        return Long.hashCode(this.x) + al.c(this.w, iA, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) y43.f(this.t));
        sb.append(", shape=");
        sb.append(this.u);
        sb.append(", clip=");
        sb.append(this.v);
        sb.append(", ambientColor=");
        a83.b(this.w, ", spotColor=", sb);
        sb.append((Object) uh1.i(this.x));
        sb.append(')');
        return sb.toString();
    }
}
