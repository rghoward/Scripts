package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.DayViewModel$listenProgramsUpdates$2", f = "DayViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gm2 extends p6a implements ci4<id8, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ cm2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm2(cm2 cm2Var, r02<? super gm2> r02Var) {
        super(2, r02Var);
        this.u = cm2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        gm2 gm2Var = new gm2(this.u, r02Var);
        gm2Var.t = obj;
        return gm2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(id8 id8Var, r02<? super g2b> r02Var) {
        return ((gm2) create(id8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        id8 id8Var = (id8) this.t;
        dv8.b(obj);
        cm2.b.C0044b c0044b = cm2.b.C0044b.a;
        int i = cm2.I;
        cm2 cm2Var = this.u;
        cm2Var.e(c0044b);
        Exception exc = id8Var.b;
        jd8 jd8Var = id8Var.c;
        if (exc != null) {
            return g2b.a;
        }
        ArrayList arrayListC = rc8.c(jd8Var.a, cm2Var.D);
        ArrayList arrayListA = b43.a(jd8Var.b);
        if (arrayListC.isEmpty() && arrayListA.isEmpty()) {
            cm2Var.e(cm2.b.a.a);
        } else {
            cm2Var.e(new cm2.b.c(th1.K(arrayListC, arrayListA)));
            bc8 bc8Var = (bc8) th1.A(arrayListC);
            if (bc8Var != null) {
                cm2Var.e(new cm2.b.d(bc8Var.A));
            }
        }
        return g2b.a;
    }
}
