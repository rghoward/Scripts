package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uj2 implements fi4<fv5, Integer, jt1, Integer, g2b> {
    public final /* synthetic */ lh2 A;
    public final /* synthetic */ i21 t;
    public final /* synthetic */ l21 u;
    public final /* synthetic */ oh4<Long, g2b> v;
    public final /* synthetic */ b21 w;
    public final /* synthetic */ Long x;
    public final /* synthetic */ yh2 y;
    public final /* synthetic */ s99 z;

    /* JADX WARN: Multi-variable type inference failed */
    public uj2(i21 i21Var, l21 l21Var, oh4<? super Long, g2b> oh4Var, b21 b21Var, Long l, yh2 yh2Var, s99 s99Var, lh2 lh2Var) {
        this.t = i21Var;
        this.u = l21Var;
        this.v = oh4Var;
        this.w = b21Var;
        this.x = l;
        this.y = yh2Var;
        this.z = s99Var;
        this.A = lh2Var;
    }

    @Override // defpackage.fi4
    public final g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
        int i;
        fv5 fv5Var2 = fv5Var;
        int iIntValue = num.intValue();
        jt1 jt1Var2 = jt1Var;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (jt1Var2.J(fv5Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= jt1Var2.h(iIntValue) ? 32 : 16;
        }
        if (jt1Var2.A(i & 1, (i & 147) != 146)) {
            l21 l21Var = this.u;
            i21 i21Var = this.t;
            l21 l21VarK = i21Var.k(l21Var, iIntValue);
            ox6 ox6VarB = fv5Var2.b();
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarB);
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
            lj2.i(l21VarK, this.v, this.w.w, this.x, this.y, this.z, this.A, i21Var.a, jt1Var2, 221184);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
