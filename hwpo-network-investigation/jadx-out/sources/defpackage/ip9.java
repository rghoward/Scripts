package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ip9 extends ox6.c implements lr5, qb9 {
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public long N;
    public jl9 O;
    public boolean P;
    public long Q;
    public long R;
    public int S;
    public hp9 T;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;
        public final /* synthetic */ ip9 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7 jz7Var, ip9 ip9Var) {
            super(1);
            this.u = jz7Var;
            this.v = ip9Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a.z(aVar, this.u, 0, 0, this.v.T);
            return g2b.a;
        }
    }

    @Override // defpackage.qb9
    public final boolean A() {
        return false;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        if (this.P) {
            ec9.g(hc9Var, this.O);
        }
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(j);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new a(jz7VarE, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.H);
        sb.append(", scaleY=");
        sb.append(this.I);
        sb.append(", alpha = ");
        sb.append(this.J);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.K);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.L);
        sb.append(", cameraDistance=");
        sb.append(this.M);
        sb.append(", transformOrigin=");
        sb.append((Object) ava.b(this.N));
        sb.append(", shape=");
        sb.append(this.O);
        sb.append(", clip=");
        sb.append(this.P);
        sb.append(", renderEffect=null, ambientShadowColor=");
        a83.b(this.Q, ", spotShadowColor=", sb);
        a83.b(this.R, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) g28.d(this.S));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
