package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class km7 implements ei4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ km7(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ei4
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.t;
        Object obj4 = this.u;
        switch (i) {
            case 0:
                jt1 jt1Var = (jt1) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (jt1Var.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ((ci4) obj4).invoke(jt1Var, 0);
                } else {
                    jt1Var.u();
                }
                return g2b.a;
            default:
                ox6 ox6Var = (ox6) obj;
                jt1 jt1Var2 = (jt1) obj2;
                ((Number) obj3).intValue();
                jt1Var2.K(-1498516085);
                a04 a04VarE = zs4.e(wy6.u, jt1Var2);
                a04 a04VarE2 = zs4.e(wy6.w, jt1Var2);
                tva tvaVar = (tva) obj4;
                dza dzaVar = b0a.v;
                l4c l4cVar = tvaVar.a;
                dt7 dt7Var = tvaVar.d;
                boolean zBooleanValue = ((Boolean) l4cVar.b()).booleanValue();
                jt1Var2.K(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                jt1Var2.B();
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) dt7Var.getValue()).booleanValue();
                jt1Var2.K(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                jt1Var2.B();
                Float fValueOf2 = Float.valueOf(f2);
                tvaVar.f();
                jt1Var2.K(386845748);
                jt1Var2.B();
                tva.d dVarC = owa.c(tvaVar, fValueOf, fValueOf2, a04VarE, dzaVar, jt1Var2, 196608);
                boolean zBooleanValue3 = ((Boolean) tvaVar.a.b()).booleanValue();
                jt1Var2.K(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                jt1Var2.B();
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) dt7Var.getValue()).booleanValue();
                jt1Var2.K(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                jt1Var2.B();
                Float fValueOf4 = Float.valueOf(f4);
                tvaVar.f();
                jt1Var2.K(-281714272);
                jt1Var2.B();
                ox6 ox6VarB = po4.b(ox6Var, ((Number) dVarC.C.getValue()).floatValue(), ((Number) dVarC.C.getValue()).floatValue(), ((Number) owa.c(tvaVar, fValueOf3, fValueOf4, a04VarE2, dzaVar, jt1Var2, 196608).C.getValue()).floatValue(), 0.0f, null, 131064);
                jt1Var2.B();
                return ox6VarB;
        }
    }
}
