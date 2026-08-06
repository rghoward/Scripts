package defpackage;

import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment;
import com.hwpo_training_app.leaderboards.filter.di.FiltersFlowRouterQualifier;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l36 implements s36 {
    public final hy8 a;

    public l36(@FiltersFlowRouterQualifier hy8 hy8Var) {
        hy8Var.getClass();
        this.a = hy8Var;
    }

    @Override // defpackage.s36
    public final void a() {
        this.a.c(new rf4(LeaderboardFiltersFragment.class.getName(), new ep2(), true));
    }

    @Override // defpackage.s36
    public final void b() {
        this.a.c(new rf4(qf.class.getName(), new cp2(), true));
    }

    @Override // defpackage.s36
    public final void c() {
        this.a.c(new rf4(LeaderboardDetailsFiltersFragment.class.getName(), new h41(), true));
    }
}
