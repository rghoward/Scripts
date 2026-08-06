package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.domain.FetchLeaderboardTopValuesNextPageUseCase;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.pi4;
import defpackage.r02;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.xd3;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1", f = "AthletesListViewModel.kt", l = {222}, m = "invokeSuspend", v = 2)
final class AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ AthletesListViewModel u;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass2 extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            AthletesListViewModel.g((AthletesListViewModel) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1(AthletesListViewModel athletesListViewModel, r02<? super AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1> r02Var) {
        super(2, r02Var);
        this.u = athletesListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        AthletesListViewModel athletesListViewModel = this.u;
        if (i == 0) {
            dv8.b(obj);
            AthletesListViewModel.Action.StartPaginationLoading startPaginationLoading = AthletesListViewModel.Action.StartPaginationLoading.a;
            AthletesListViewModel.Companion companion = AthletesListViewModel.Companion;
            athletesListViewModel.e(startPaginationLoading);
            FetchLeaderboardTopValuesNextPageUseCase fetchLeaderboardTopValuesNextPageUseCase = athletesListViewModel.z;
            FetchLeaderboardTopValuesNextPageUseCase.Params params = new FetchLeaderboardTopValuesNextPageUseCase.Params(athletesListViewModel.E, athletesListViewModel.F);
            this.t = 1;
            fetchLeaderboardTopValuesNextPageUseCase.getClass();
            obj = g5b.b(fetchLeaderboardTopValuesNextPageUseCase, params, this);
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
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(1, athletesListViewModel, AthletesListViewModel.class, "onError", "onError(Ljava/lang/Exception;)V", 0);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            anonymousClass2.invoke(((xd3.a) xd3Var).a);
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            AthletesListViewModel.Action.FinishLoading finishLoading = AthletesListViewModel.Action.FinishLoading.a;
            AthletesListViewModel.Companion companion2 = AthletesListViewModel.Companion;
            athletesListViewModel.e(finishLoading);
            g2b g2bVar = g2b.a;
        }
        return g2b.a;
    }
}
