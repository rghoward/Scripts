package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 implements ei4<ox6, jt1, Integer, ox6> {
    public final /* synthetic */ va5 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ ex8 v;
    public final /* synthetic */ mh4 w;

    public ve1(va5 va5Var, boolean z, ex8 ex8Var, mh4 mh4Var) {
        this.t = va5Var;
        this.u = z;
        this.v = ex8Var;
        this.w = mh4Var;
    }

    @Override // defpackage.ei4
    public final ox6 invoke(ox6 ox6Var, jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        num.intValue();
        jt1Var2.K(-1525724089);
        Object objF = jt1Var2.f();
        if (objF == jt1.a.a) {
            objF = new i27();
            jt1Var2.C(objF);
        }
        h27 h27Var = (h27) objF;
        ox6 ox6VarH = xa5.a(this.t, h27Var).H(new re1(h27Var, null, false, this.u, null, this.v, this.w));
        jt1Var2.B();
        return ox6VarH;
    }
}
