package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a26 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ a26(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        q16 q16Var;
        int i = this.t;
        float f = 0.0f;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                c26 c26Var = (c26) obj2;
                float f2 = -((Float) obj).floatValue();
                dt7 dt7Var = c26Var.d;
                if ((f2 >= 0.0f || c26Var.d()) && (f2 <= 0.0f || c26Var.b())) {
                    if (Math.abs(c26Var.o) > 0.5f) {
                        xc5.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = c26Var.o + f2;
                    c26Var.o = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = c26Var.o;
                        int iB = wk6.b(f4);
                        q16 q16VarI = ((q16) dt7Var.getValue()).i(iB, !c26Var.a);
                        if (q16VarI != null && (q16Var = c26Var.b) != null) {
                            q16 q16VarI2 = q16Var.i(iB, true);
                            if (q16VarI2 != null) {
                                c26Var.b = q16VarI2;
                            } else {
                                q16VarI = null;
                            }
                        }
                        if (q16VarI != null) {
                            c26Var.f(q16VarI, c26Var.a, true);
                            f18.b(c26Var.u);
                            c26Var.h(f4 - c26Var.o, q16VarI);
                        } else {
                            fm8 fm8Var = c26Var.h;
                            if (fm8Var != null) {
                                fm8Var.i();
                            }
                            c26Var.h(f4 - c26Var.o, (q16) dt7Var.getValue());
                        }
                    }
                    if (Math.abs(c26Var.o) > 0.5f) {
                        f2 -= c26Var.o;
                        c26Var.o = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            default:
                gga ggaVar = (gga) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                at7 at7Var = ggaVar.a;
                float fH = at7Var.h() + fFloatValue;
                at7 at7Var2 = ggaVar.b;
                if (fH > at7Var2.h()) {
                    fFloatValue = at7Var2.h() - at7Var.h();
                } else if (fH < 0.0f) {
                    fFloatValue = -at7Var.h();
                }
                at7Var.g(at7Var.h() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
