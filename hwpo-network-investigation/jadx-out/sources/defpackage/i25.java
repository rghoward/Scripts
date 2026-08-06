package defpackage;

import com.hwpo_training_app.leaderboards.valuedetails.domain.GetLeaderboardValueDetailsUseCase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$goToLeaderboardValueComments$1", f = "HostActivityViewModel.kt", l = {278}, m = "invokeSuspend", v = 2)
public final class i25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e25 u;
    public final /* synthetic */ a87.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i25(e25 e25Var, a87.e eVar, r02<? super i25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
        this.v = eVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new i25(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((i25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        a87.e eVar = this.v;
        e25 e25Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            e25.b.C0075b c0075b = e25.b.C0075b.a;
            int i2 = e25.T;
            e25Var.e(c0075b);
            GetLeaderboardValueDetailsUseCase getLeaderboardValueDetailsUseCase = e25Var.K;
            Integer num = new Integer(eVar.b);
            this.t = 1;
            getLeaderboardValueDetailsUseCase.getClass();
            obj = g5b.b(getLeaderboardValueDetailsUseCase, num, this);
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
        xd3 xd3Var = (xd3) obj;
        h25 h25Var = new h25(0, e25Var, eVar);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            e25.b.a aVar = e25.b.a.a;
            int i3 = e25.T;
            e25Var.e(aVar);
            e25Var.f(new b25(e25Var.P.a(exc)));
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            h25Var.invoke(((xd3.b) xd3Var).a);
        }
        return g2b.a;
    }
}
