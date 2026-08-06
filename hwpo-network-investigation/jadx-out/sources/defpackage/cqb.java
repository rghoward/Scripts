package defpackage;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$pagerPositionChanged$1", f = "WorkoutsViewModel.kt", l = {239}, m = "invokeSuspend", v = 2)
public final class cqb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wpb u;
    public final /* synthetic */ LocalDate v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqb(wpb wpbVar, LocalDate localDate, r02<? super cqb> r02Var) {
        super(2, r02Var);
        this.u = wpbVar;
        this.v = localDate;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new cqb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((cqb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        LocalDate localDate = this.v;
        wpb wpbVar = this.u;
        if (i == 0) {
            dv8.b(obj);
            wpb.a aVar = wpb.Companion;
            dz9 dz9VarD = oy0.d(rhb.b(wpbVar), null, null, new dqb(wpbVar, localDate, null), 3);
            this.t = 1;
            Object objP0 = dz9VarD.p0(this);
            v72 v72Var = v72.t;
            if (objP0 == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        wpb.a aVar2 = wpb.Companion;
        LocalDate localDate2 = wpbVar.b().d;
        LocalDate localDate3 = wpbVar.b().f;
        localDate2.getClass();
        localDate3.getClass();
        if (localDate.compareTo((ChronoLocalDate) localDate2) < 0 || localDate.compareTo((ChronoLocalDate) localDate3) > 0) {
            oy0.d(rhb.b(wpbVar), null, null, new bqb(null, wpbVar, localDate, true), 3);
        }
        wpbVar.e(new vpb.b(localDate));
        return g2b.a;
    }
}
