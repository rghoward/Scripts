package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nm extends wp5 implements mh4<g2b> {
    public final /* synthetic */ s69 u;
    public final /* synthetic */ lm v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(s69 s69Var, lm lmVar) {
        super(0);
        this.u = s69Var;
        this.v = lmVar;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        ub9 ub9Var;
        qr5 qr5Var;
        s69 s69Var = this.u;
        c69 c69Var = s69Var.x;
        c69 c69Var2 = s69Var.y;
        Float f = s69Var.v;
        Float f2 = s69Var.w;
        float fFloatValue = (c69Var == null || f == null) ? 0.0f : c69Var.a.invoke().floatValue() - f.floatValue();
        float fFloatValue2 = (c69Var2 == null || f2 == null) ? 0.0f : c69Var2.a.invoke().floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int i = s69Var.t;
            lm lmVar = this.v;
            int iR = lmVar.r(i);
            xb9 xb9VarB = lmVar.j().b(lmVar.A);
            if (xb9VarB != null) {
                try {
                    j4 j4Var = lmVar.C;
                    if (j4Var != null) {
                        j4Var.a.setBoundsInScreen(lmVar.b(xb9VarB));
                        g2b g2bVar = g2b.a;
                    }
                } catch (IllegalStateException unused) {
                    g2b g2bVar2 = g2b.a;
                }
            }
            xb9 xb9VarB2 = lmVar.j().b(lmVar.B);
            if (xb9VarB2 != null) {
                try {
                    j4 j4Var2 = lmVar.D;
                    if (j4Var2 != null) {
                        j4Var2.a.setBoundsInScreen(lmVar.b(xb9VarB2));
                        g2b g2bVar3 = g2b.a;
                    }
                } catch (IllegalStateException unused2) {
                    g2b g2bVar4 = g2b.a;
                }
            }
            lmVar.t.invalidate();
            xb9 xb9VarB3 = lmVar.j().b(iR);
            if (xb9VarB3 != null && (ub9Var = xb9VarB3.a) != null && (qr5Var = ub9Var.c) != null) {
                if (c69Var != null) {
                    lmVar.F.i(iR, c69Var);
                }
                if (c69Var2 != null) {
                    lmVar.G.i(iR, c69Var2);
                }
                lmVar.n(qr5Var);
            }
        }
        if (c69Var != null) {
            s69Var.v = c69Var.a.invoke();
        }
        if (c69Var2 != null) {
            s69Var.w = c69Var2.a.invoke();
        }
        return g2b.a;
    }
}
