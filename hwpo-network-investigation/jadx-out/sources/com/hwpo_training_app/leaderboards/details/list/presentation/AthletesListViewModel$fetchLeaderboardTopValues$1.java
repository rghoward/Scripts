package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.domain.FetchLeaderboardTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListEvents;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ec6;
import defpackage.f60;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xd3;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$fetchLeaderboardTopValues$1", f = "AthletesListViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
final class AthletesListViewModel$fetchLeaderboardTopValues$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ec6 u;
    public final /* synthetic */ AthletesListViewModel v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ec6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel$fetchLeaderboardTopValues$1(ec6 ec6Var, AthletesListViewModel athletesListViewModel, r02<? super AthletesListViewModel$fetchLeaderboardTopValues$1> r02Var) {
        super(2, r02Var);
        this.u = ec6Var;
        this.v = athletesListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AthletesListViewModel$fetchLeaderboardTopValues$1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((AthletesListViewModel$fetchLeaderboardTopValues$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        final AthletesListViewModel athletesListViewModel = this.v;
        final ec6 ec6Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            if (ec6Var.compareTo(ec6.u) <= 0 && ec6Var.compareTo(ec6.t) >= 0) {
                AthletesListViewModel.Action.StartLoading startLoading = AthletesListViewModel.Action.StartLoading.a;
                AthletesListViewModel.Companion companion = AthletesListViewModel.Companion;
                athletesListViewModel.e(startLoading);
            }
            FetchLeaderboardTopValuesUseCase fetchLeaderboardTopValuesUseCase = athletesListViewModel.y;
            FetchLeaderboardTopValuesUseCase.Params params = new FetchLeaderboardTopValuesUseCase.Params(athletesListViewModel.E, athletesListViewModel.F);
            this.t = 1;
            fetchLeaderboardTopValuesUseCase.getClass();
            obj = g5b.b(fetchLeaderboardTopValuesUseCase, params, this);
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
        ((xd3) obj).a(new oh4() { // from class: e60
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                int iOrdinal = ec6Var.ordinal();
                AthletesListViewModel athletesListViewModel2 = athletesListViewModel;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    AthletesListViewModel.Action.FinishLoading finishLoading = AthletesListViewModel.Action.FinishLoading.a;
                    AthletesListViewModel.Companion companion2 = AthletesListViewModel.Companion;
                    athletesListViewModel2.e(finishLoading);
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    AthletesListEvents.StopRefreshing stopRefreshing = AthletesListEvents.StopRefreshing.b;
                    AthletesListViewModel.Companion companion3 = AthletesListViewModel.Companion;
                    athletesListViewModel2.f(stopRefreshing);
                }
                return g2b.a;
            }
        }, new f60(0, ec6Var, athletesListViewModel));
        return g2b.a;
    }
}
