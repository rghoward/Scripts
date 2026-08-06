package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
public final class sib extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ tib t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sib(tib tibVar, r02<? super sib> r02Var) {
        super(2, r02Var);
        this.t = tibVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new sib(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((sib) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        tib tibVar = this.t;
        rib ribVar = tibVar.w;
        if (ribVar != null) {
            s66 s66Var = ribVar.w;
            ribVar.x.k(null);
            pib<?> pibVar = ribVar.v;
            if (pibVar instanceof l76) {
                s66Var.c((l76) pibVar);
            }
            s66Var.c(ribVar);
        }
        tibVar.w = null;
        return g2b.a;
    }
}
