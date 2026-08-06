package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$onValueDeleted$1", f = "ValuesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dcb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ ybb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(ybb ybbVar, r02<? super dcb> r02Var) {
        super(2, r02Var);
        this.t = ybbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new dcb(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dcb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        ybb ybbVar = this.t;
        ybbVar.G = null;
        ybbVar.g(BuildConfig.FLAVOR);
        ebb ebbVar = ybbVar.I;
        bu8 bu8Var = ybbVar.C;
        ybbVar.f(new lbb(ebbVar == ebb.BENCHMARK ? bu8Var.b(R.string.personal_records_value_deleted_success_message, new Object[0]) : bu8Var.b(R.string.body_metric_value_deleted_success_message, new Object[0])));
        return g2b.a;
    }
}
