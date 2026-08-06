package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$onSaveBenchmarkBtnClick$1", f = "EditPerformanceViewModel.kt", l = {262}, m = "invokeSuspend", v = 2)
public final class fd3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ pc3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd3(pc3 pc3Var, r02<? super fd3> r02Var) {
        super(2, r02Var);
        this.u = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new fd3(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((fd3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            pc3.a.k kVar = pc3.a.k.a;
            pc3.b bVar = pc3.Companion;
            pc3 pc3Var = this.u;
            pc3Var.e(kVar);
            pc3.c cVarB = pc3Var.b();
            List<l89> list = cVarB.a.v;
            List<l89> list2 = cVarB.c.v;
            boolean zIsEmpty = list2.isEmpty();
            hf3 hf3Var = hf3.t;
            if ((zIsEmpty && list.isEmpty()) || list2.isEmpty() || list2.equals(list)) {
                list2 = hf3Var;
            }
            pc3.c cVarB2 = pc3Var.b();
            List<l89> list3 = cVarB2.a.v;
            List<l89> list4 = cVarB2.c.v;
            boolean z = false;
            boolean z2 = !(list4.isEmpty() && list3.isEmpty()) && (list4.isEmpty() || !list4.equals(list3));
            boolean zIsEmpty2 = pc3Var.b().c.v.isEmpty();
            pc3.c cVarB3 = pc3Var.b();
            if (z2a.w(cVarB3.c.u) && zIsEmpty2 && !cy.a(cVarB3.d)) {
                z = true;
            }
            if (z) {
                oy0.d(rhb.b(pc3Var), null, null, new yc3(pc3Var, null), 3);
            } else {
                if (z) {
                    u.b();
                    return null;
                }
                this.t = 1;
                Object objG = pc3.g(pc3Var, list2, z2, this);
                v72 v72Var = v72.t;
                if (objG == v72Var) {
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
