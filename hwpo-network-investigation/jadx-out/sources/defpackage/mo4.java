package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class mo4 extends vx6<ip9> {
    public final jl9 A;
    public final boolean B;
    public final long C;
    public final long D;
    public final float t;
    public final float u;
    public final float v;
    public final float w;
    public final float x;
    public final long z;
    public final float y = 8.0f;
    public final int E = 3;

    public mo4(float f, float f2, float f3, float f4, float f5, long j, jl9 jl9Var, boolean z, long j2, long j3) {
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.w = f4;
        this.x = f5;
        this.z = j;
        this.A = jl9Var;
        this.B = z;
        this.C = j2;
        this.D = j3;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        ip9 ip9Var = new ip9();
        ip9Var.H = this.t;
        ip9Var.I = this.u;
        ip9Var.J = this.v;
        ip9Var.K = this.w;
        ip9Var.L = this.x;
        ip9Var.M = this.y;
        ip9Var.N = this.z;
        ip9Var.O = this.A;
        ip9Var.P = this.B;
        ip9Var.Q = this.C;
        ip9Var.R = this.D;
        ip9Var.S = this.E;
        ip9Var.T = new hp9(ip9Var);
        return ip9Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        mb7 mb7Var;
        ip9 ip9Var = (ip9) cVar;
        ip9Var.H = this.t;
        ip9Var.I = this.u;
        ip9Var.J = this.v;
        ip9Var.K = this.w;
        ip9Var.L = this.x;
        ip9Var.M = this.y;
        ip9Var.N = this.z;
        ip9Var.O = this.A;
        ip9Var.P = this.B;
        ip9Var.Q = this.C;
        ip9Var.R = this.D;
        ip9Var.S = this.E;
        hp9 hp9Var = ip9Var.T;
        if (ip9Var.t.G && (mb7Var = ew2.d(ip9Var, 2).K) != null) {
            mb7Var.c2(hp9Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo4)) {
            return false;
        }
        mo4 mo4Var = (mo4) obj;
        return Float.compare(this.t, mo4Var.t) == 0 && Float.compare(this.u, mo4Var.u) == 0 && Float.compare(this.v, mo4Var.v) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.w, mo4Var.w) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.x, mo4Var.x) == 0 && Float.compare(this.y, mo4Var.y) == 0 && ava.a(this.z, mo4Var.z) && xj5.a(this.A, mo4Var.A) && this.B == mo4Var.B && uh1.c(this.C, mo4Var.C) && uh1.c(this.D, mo4Var.D) && this.E == mo4Var.E;
    }

    public final int hashCode() {
        int iA = h44.a(h44.a(h44.a(h44.a(h44.a(h44.a(h44.a(h44.a(h44.a(Float.hashCode(this.t) * 31, this.u, 31), this.v, 31), 0.0f, 31), 0.0f, 31), this.w, 31), 0.0f, 31), 0.0f, 31), this.x, 31), this.y, 31);
        int i = ava.c;
        int iA2 = uo2.a((this.A.hashCode() + al.c(this.z, iA, 31)) * 31, this.B, 961);
        int i2 = uh1.l;
        return os2.a(this.E, os2.a(0, al.c(this.D, al.c(this.C, iA2, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.t);
        sb.append(", scaleY=");
        sb.append(this.u);
        sb.append(", alpha=");
        sb.append(this.v);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.w);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.x);
        sb.append(", cameraDistance=");
        sb.append(this.y);
        sb.append(", transformOrigin=");
        sb.append((Object) ava.b(this.z));
        sb.append(", shape=");
        sb.append(this.A);
        sb.append(", clip=");
        sb.append(this.B);
        sb.append(", renderEffect=null, ambientShadowColor=");
        a83.b(this.C, ", spotShadowColor=", sb);
        a83.b(this.D, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) g28.d(this.E));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
