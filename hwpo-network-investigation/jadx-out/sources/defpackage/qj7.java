package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.presentation.OnboardingSettingsSecondPageViewModel$observeRequiredBenchmarks$1", f = "OnboardingSettingsSecondPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qj7 extends p6a implements ci4<xd3<? extends Exception, ? extends List<? extends ao0>>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ rj7 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<List<? extends ao0>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends ao0> list) {
            List<? extends ao0> list2 = list;
            list2.getClass();
            rj7 rj7Var = (rj7) this.receiver;
            int i = rj7.F;
            rj7Var.getClass();
            ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
            for (ao0 ao0Var : list2) {
                arrayList.add(new pr8(ao0Var.d != null, uo0.c(ao0Var)));
            }
            rj7Var.e(new ij7.a(arrayList));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj7(rj7 rj7Var, r02<? super qj7> r02Var) {
        super(2, r02Var);
        this.u = rj7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        qj7 qj7Var = new qj7(this.u, r02Var);
        qj7Var.t = obj;
        return qj7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends List<? extends ao0>> xd3Var, r02<? super g2b> r02Var) {
        return ((qj7) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new a(1, this.u, rj7.class, "onBenchmarksLoaded", "onBenchmarksLoaded(Ljava/util/List;)V", 0));
        return g2b.a;
    }
}
