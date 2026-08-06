package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {971}, m = "invokeSuspend", v = 1)
public final class nga extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qga u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nga(qga qgaVar, r02<? super nga> r02Var) {
        super(2, r02Var);
        this.u = qgaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nga(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nga) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        iw iwVarA = null;
        if (i == 0) {
            dv8.b(obj);
            qga qgaVar = this.u;
            if (!lja.c(qgaVar.n().b) && qgaVar.j()) {
                iwVarA = lha.a(qgaVar.n());
                iw iwVarC = lha.c(qgaVar.n(), qgaVar.n().a.u.length());
                iw iwVarB = lha.b(qgaVar.n(), qgaVar.n().a.u.length());
                iw.b bVar = new iw.b(iwVarC);
                bVar.b(iwVarB);
                iw iwVarI = bVar.i();
                int iF = lja.f(qgaVar.n().b);
                qgaVar.c.invoke(qga.e(iwVarI, ay.c(iF, iF)));
                qgaVar.q(bt4.t);
                z1b z1bVar = qgaVar.a;
                if (z1bVar != null) {
                    z1bVar.f = true;
                }
            }
            if (iwVarA == null) {
                return g2b.a;
            }
            pf1 pf1Var = qgaVar.g;
            if (pf1Var != null) {
                of1 of1VarA = rf1.a(iwVarA);
                this.t = 1;
                g2b g2bVarA = pf1Var.a(of1VarA);
                v72 v72Var = v72.t;
                if (g2bVarA == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
