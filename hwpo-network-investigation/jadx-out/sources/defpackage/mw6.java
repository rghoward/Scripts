package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mw6 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ox6 A;
    public final /* synthetic */ float B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ jl9 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ ci4<jt1, Integer, g2b> G;
    public final /* synthetic */ ci4<jt1, Integer, omb> H;
    public final /* synthetic */ fr1 I;
    public final /* synthetic */ long t;
    public final /* synthetic */ mh4<g2b> u;
    public final /* synthetic */ hn9 v;
    public final /* synthetic */ cx6 w;
    public final /* synthetic */ qt<Float, bw> x;
    public final /* synthetic */ t72 y;
    public final /* synthetic */ oh4<Float, g2b> z;

    public mw6(long j, mh4 mh4Var, hn9 hn9Var, cx6 cx6Var, qt qtVar, t72 t72Var, oh4 oh4Var, ox6 ox6Var, float f, boolean z, jl9 jl9Var, long j2, long j3, ci4 ci4Var, ci4 ci4Var2, fr1 fr1Var) {
        this.t = j;
        this.u = mh4Var;
        this.v = hn9Var;
        this.w = cx6Var;
        this.x = qtVar;
        this.y = t72Var;
        this.z = oh4Var;
        this.A = ox6Var;
        this.B = f;
        this.C = z;
        this.D = jl9Var;
        this.E = j2;
        this.F = j3;
        this.G = ci4Var;
        this.H = ci4Var2;
        this.I = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarC = w20.c(ir9.c, w20.e);
            Object objF = jt1Var2.f();
            if (objF == jt1.a.a) {
                objF = new lw6();
                jt1Var2.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6VarC, false, (oh4) objF);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarB);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar);
            } else {
                jt1Var2.z();
            }
            rd7.d(jt1Var2, bt1.a.f, fl6VarD);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
            hn9 hn9Var = this.v;
            boolean z = ((in9) hn9Var.d.h.getValue()) != in9.t;
            boolean z2 = this.w.c;
            long j = this.t;
            mh4<g2b> mh4Var = this.u;
            bx6.c(j, mh4Var, z, z2, jt1Var2, 0);
            bx6.b(this.x, this.y, mh4Var, this.z, this.A, hn9Var, this.B, this.C, this.D, this.E, this.F, 0.0f, this.G, this.H, this.I, jt1Var2, 70);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
