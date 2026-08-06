package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {566}, m = "invokeSuspend", v = 1)
public final class gq7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ dr7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq7(dr7 dr7Var, r02<? super gq7> r02Var) {
        super(2, r02Var);
        this.u = dr7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gq7(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gq7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            hr7.b bVar = hr7.a;
            dr7 dr7Var = this.u;
            int iK = dr7Var.k() + 1;
            int iO = dr7Var.o();
            Object obj2 = v72.t;
            if (iK >= iO || (objF = dr7Var.f(dr7Var.k() + 1, xv.b(0.0f, 0.0f, null, 7), this)) != obj2) {
                objF = g2b.a;
            }
            if (objF == obj2) {
                return obj2;
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
