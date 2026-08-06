package defpackage;

import j$.time.LocalDate;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$initWeeksView$1", f = "WorkoutsViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class ypb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wpb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypb(wpb wpbVar, r02<? super ypb> r02Var) {
        super(2, r02Var);
        this.u = wpbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ypb(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ypb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        LocalDate localDateB;
        int i = this.t;
        wpb wpbVar = this.u;
        if (i == 0) {
            dv8.b(obj);
            rl4 rl4Var = wpbVar.B;
            g2b g2bVar = g2b.a;
            this.t = 1;
            rl4Var.getClass();
            obj = g5b.b(rl4Var, g2bVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        eo4 eo4Var = (eo4) yd3.e((xd3) obj, null);
        wpbVar.K = eo4Var;
        if (eo4Var != null) {
            localDateB = eo4Var.b;
        } else {
            q09 q09Var = wpbVar.y;
            i7a i7aVar = wpbVar.C;
            LocalDate localDate = i7aVar.a;
            i7aVar.a = null;
            localDateB = mp0.b(q09Var, localDate);
        }
        localDateB.getClass();
        e96 e96VarA = es3.a(localDateB);
        Iterator<zl2> it = ((rlb) e96VarA.get(1)).b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().c) {
                wpbVar.e(new vpb.d(i2, e96VarA));
                bp1 bp1Var = wpbVar.J;
                g2b g2bVar2 = g2b.a;
                bp1Var.h0(g2bVar2);
                return g2bVar2;
            }
            i2++;
        }
        i2 = -1;
        wpbVar.e(new vpb.d(i2, e96VarA));
        bp1 bp1Var2 = wpbVar.J;
        g2b g2bVar3 = g2b.a;
        bp1Var2.h0(g2bVar3);
        return g2bVar3;
    }
}
