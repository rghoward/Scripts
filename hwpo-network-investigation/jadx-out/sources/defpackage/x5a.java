package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x5a implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ mh4<g2b> B;
    public final /* synthetic */ fr1 C;
    public final /* synthetic */ ox6 t;
    public final /* synthetic */ jl9 u;
    public final /* synthetic */ long v;
    public final /* synthetic */ float w;
    public final /* synthetic */ vs0 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ h27 z;

    public x5a(ox6 ox6Var, jl9 jl9Var, long j, float f, vs0 vs0Var, boolean z, h27 h27Var, boolean z2, mh4 mh4Var, fr1 fr1Var) {
        this.t = ox6Var;
        this.u = jl9Var;
        this.v = j;
        this.w = f;
        this.x = vs0Var;
        this.y = z;
        this.z = h27Var;
        this.A = z2;
        this.B = mh4Var;
        this.C = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        ox6 ox6VarA;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            e15 e15Var = tg5.a;
            ox6 ox6VarD = v5a.d(this.t.H(iv6.t), this.u, v5a.e(this.v, this.w, jt1Var2), this.x, ((tx2) jt1Var2.F(qu1.h)).U0(0.0f));
            cx8 cx8VarA = zw8.a(7);
            boolean z = this.y;
            h27 h27Var = this.z;
            boolean z2 = this.A;
            mh4<g2b> mh4Var = this.B;
            if (cx8VarA != null) {
                ox6VarA = new t99(z, h27Var, cx8VarA, z2, mh4Var);
            } else if (cx8VarA == null) {
                ox6VarA = new t99(z, h27Var, null, z2, mh4Var);
            } else if (h27Var != null) {
                ox6VarA = xa5.a(cx8VarA, h27Var).H(new t99(z, h27Var, null, z2, mh4Var));
            } else {
                ox6VarA = it1.a(ox6.a.t, new v99(cx8VarA, z, z2, mh4Var));
            }
            ox6 ox6VarA2 = ec1.a(ox6VarD.H(ox6VarA));
            fl6 fl6VarD = dv0.d(di.a.a, true);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarA2);
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
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            this.C.invoke(jt1Var2, 0);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
