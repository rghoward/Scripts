package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iu extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ tva<Object> u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ oh4<ru<Object>, oz1> w;
    public final /* synthetic */ su<Object> x;
    public final /* synthetic */ fv9<Object> y;
    public final /* synthetic */ fr1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(tva tvaVar, Object obj, oh4 oh4Var, su suVar, fv9 fv9Var, fr1 fr1Var) {
        super(2);
        this.u = tvaVar;
        this.v = obj;
        this.w = oh4Var;
        this.x = suVar;
        this.y = fv9Var;
        this.z = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) throws Throwable {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            oz1 oz1VarF = jt1Var2.f();
            oh4<ru<Object>, oz1> oh4Var = this.w;
            su<Object> suVar = this.x;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (oz1VarF == c0187a) {
                oz1VarF = oh4Var.invoke(suVar);
                jt1Var2.C(oz1VarF);
            }
            oz1 oz1Var = (oz1) oz1VarF;
            tva<Object> tvaVar = this.u;
            tva.b<Object> bVarF = tvaVar.f();
            dt7 dt7Var = tvaVar.d;
            Object objF = bVarF.f();
            Object obj = this.v;
            boolean zC = jt1Var2.c(xj5.a(objF, obj));
            Object objF2 = jt1Var2.f();
            if (zC || objF2 == c0187a) {
                objF2 = xj5.a(tvaVar.f().f(), obj) ? jo3.a : oh4Var.invoke(suVar).b;
                jt1Var2.C(objF2);
            }
            jo3 jo3Var = (jo3) objF2;
            Object objF3 = jt1Var2.f();
            if (objF3 == c0187a) {
                objF3 = new su.a(xj5.a(obj, dt7Var.getValue()));
                jt1Var2.C(objF3);
            }
            su.a aVar = (su.a) objF3;
            th3 th3Var = oz1Var.a;
            boolean zJ = jt1Var2.j(oz1Var);
            Object objF4 = jt1Var2.f();
            if (zJ || objF4 == c0187a) {
                objF4 = new cu(oz1Var);
                jt1Var2.C(objF4);
            }
            ox6 ox6VarA = kr5.a(ox6.a.t, (ei4) objF4);
            aVar.t.setValue(Boolean.valueOf(xj5.a(obj, dt7Var.getValue())));
            ox6 ox6VarH = ox6VarA.H(aVar);
            boolean zJ2 = jt1Var2.j(obj);
            Object objF5 = jt1Var2.f();
            if (zJ2 || objF5 == c0187a) {
                objF5 = new du(obj);
                jt1Var2.C(objF5);
            }
            oh4 oh4Var2 = (oh4) objF5;
            boolean zJ3 = jt1Var2.J(jo3Var);
            Object objF6 = jt1Var2.f();
            if (zJ3 || objF6 == c0187a) {
                objF6 = new eu(jo3Var);
                jt1Var2.C(objF6);
            }
            dv.a(this.u, oh4Var2, ox6VarH, th3Var, jo3Var, (ci4) objF6, gr1.b(-143346359, new hu(this.y, obj, suVar, this.z), jt1Var2), jt1Var2, 12582912);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
