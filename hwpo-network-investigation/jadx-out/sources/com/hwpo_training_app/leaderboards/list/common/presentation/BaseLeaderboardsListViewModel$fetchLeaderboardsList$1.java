package com.hwpo_training_app.leaderboards.list.common.presentation;

import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsUseCase;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListEvents;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ec6;
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
@xm2(c = "com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel$fetchLeaderboardsList$1", f = "BaseLeaderboardsListViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
final class BaseLeaderboardsListViewModel$fetchLeaderboardsList$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ec6 u;
    public final /* synthetic */ BaseLeaderboardsListViewModel v;

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
    public BaseLeaderboardsListViewModel$fetchLeaderboardsList$1(ec6 ec6Var, BaseLeaderboardsListViewModel baseLeaderboardsListViewModel, r02<? super BaseLeaderboardsListViewModel$fetchLeaderboardsList$1> r02Var) {
        super(2, r02Var);
        this.u = ec6Var;
        this.v = baseLeaderboardsListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new BaseLeaderboardsListViewModel$fetchLeaderboardsList$1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((BaseLeaderboardsListViewModel$fetchLeaderboardsList$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        final BaseLeaderboardsListViewModel baseLeaderboardsListViewModel = this.v;
        final ec6 ec6Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            if (ec6Var.compareTo(ec6.u) <= 0 && ec6Var.compareTo(ec6.t) >= 0) {
                BaseLeaderboardsListViewModel.Action.StartLoading startLoading = BaseLeaderboardsListViewModel.Action.StartLoading.a;
                BaseLeaderboardsListViewModel.Companion companion = BaseLeaderboardsListViewModel.Companion;
                baseLeaderboardsListViewModel.e(startLoading);
            }
            FetchLeaderboardsUseCase fetchLeaderboardsUseCase = baseLeaderboardsListViewModel.z;
            FetchLeaderboardsUseCase.Params params = new FetchLeaderboardsUseCase.Params(baseLeaderboardsListViewModel.y);
            this.t = 1;
            fetchLeaderboardsUseCase.getClass();
            obj = g5b.b(fetchLeaderboardsUseCase, params, this);
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
        ((xd3) obj).a(new oh4() { // from class: nk0
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                int iOrdinal = ec6Var.ordinal();
                BaseLeaderboardsListViewModel baseLeaderboardsListViewModel2 = baseLeaderboardsListViewModel;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    BaseLeaderboardsListViewModel.Action.FinishLoading finishLoading = BaseLeaderboardsListViewModel.Action.FinishLoading.a;
                    BaseLeaderboardsListViewModel.Companion companion2 = BaseLeaderboardsListViewModel.Companion;
                    baseLeaderboardsListViewModel2.e(finishLoading);
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    BaseLeaderboardsListEvents.StopRefreshing stopRefreshing = BaseLeaderboardsListEvents.StopRefreshing.b;
                    BaseLeaderboardsListViewModel.Companion companion3 = BaseLeaderboardsListViewModel.Companion;
                    baseLeaderboardsListViewModel2.f(stopRefreshing);
                }
                return g2b.a;
            }
        }, new oh4() { // from class: ok0
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                BaseLeaderboardsListViewModel baseLeaderboardsListViewModel2 = baseLeaderboardsListViewModel;
                cm3 cm3Var = baseLeaderboardsListViewModel2.C;
                Exception exc = (Exception) obj2;
                rma.a.b(exc);
                int iOrdinal = ec6Var.ordinal();
                if (iOrdinal == 0) {
                    BaseLeaderboardsListViewModel.Action.FinishLoading finishLoading = BaseLeaderboardsListViewModel.Action.FinishLoading.a;
                    BaseLeaderboardsListViewModel.Companion companion2 = BaseLeaderboardsListViewModel.Companion;
                    baseLeaderboardsListViewModel2.e(finishLoading);
                    baseLeaderboardsListViewModel2.e(BaseLeaderboardsListViewModel.Action.ShowErrorPlaceHolder.a);
                } else if (iOrdinal == 1) {
                    BaseLeaderboardsListViewModel.Action.FinishLoading finishLoading2 = BaseLeaderboardsListViewModel.Action.FinishLoading.a;
                    BaseLeaderboardsListViewModel.Companion companion3 = BaseLeaderboardsListViewModel.Companion;
                    baseLeaderboardsListViewModel2.e(finishLoading2);
                    baseLeaderboardsListViewModel2.f(new BaseLeaderboardsListEvents.ShowError(cm3Var.a(exc)));
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    BaseLeaderboardsListEvents.StopRefreshing stopRefreshing = BaseLeaderboardsListEvents.StopRefreshing.b;
                    BaseLeaderboardsListViewModel.Companion companion4 = BaseLeaderboardsListViewModel.Companion;
                    baseLeaderboardsListViewModel2.f(stopRefreshing);
                    baseLeaderboardsListViewModel2.f(new BaseLeaderboardsListEvents.ShowError(cm3Var.a(exc)));
                }
                return g2b.a;
            }
        });
        return g2b.a;
    }
}
