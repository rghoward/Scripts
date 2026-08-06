package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$savePerformance$2", f = "EditPerformanceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class id3 extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
    public final /* synthetic */ pc3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id3(pc3 pc3Var, r02<? super id3> r02Var) {
        super(2, r02Var);
        this.t = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new id3(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
        return ((id3) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        pc3.a.c cVar = pc3.a.c.a;
        pc3.b bVar = pc3.Companion;
        pc3 pc3Var = this.t;
        pc3Var.e(cVar);
        pc3Var.f(new uc3(pc3Var.L.b(R.string.save_notes_success, new Object[0])));
        pc3Var.z.b();
        return g2b.a;
    }
}
