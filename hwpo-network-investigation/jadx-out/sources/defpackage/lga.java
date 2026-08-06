package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {891}, m = "invokeSuspend", v = 1)
public final class lga extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qga u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga(qga qgaVar, boolean z, r02<? super lga> r02Var) {
        super(2, r02Var);
        this.u = qgaVar;
        this.v = z;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new lga(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((lga) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        iw iwVarA = null;
        if (i == 0) {
            dv8.b(obj);
            qga qgaVar = this.u;
            if (!lja.c(qgaVar.n().b)) {
                iwVarA = lha.a(qgaVar.n());
                if (this.v) {
                    int iE = lja.e(qgaVar.n().b);
                    qgaVar.c.invoke(qga.e(qgaVar.n().a, ay.c(iE, iE)));
                    qgaVar.q(bt4.t);
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
