package defpackage;

import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewState;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ mk0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                BaseLeaderboardsListViewModel.Companion companion = BaseLeaderboardsListViewModel.Companion;
                return Boolean.valueOf(((BaseLeaderboardsListViewState) obj).c);
            case 1:
                pc3.b bVar = pc3.Companion;
                return ((pc3.c) obj).b;
            case 2:
                td1 td1Var = (td1) obj;
                td1Var.getClass();
                td1.a(td1Var, "JsonPrimitive", new om5(new jm5()));
                td1.a(td1Var, "JsonNull", new om5(new km5(0)));
                td1.a(td1Var, "JsonLiteral", new om5(new w25(1)));
                td1.a(td1Var, "JsonObject", new om5(new lm5(0)));
                td1.a(td1Var, "JsonArray", new om5(new mm5()));
                return g2b.a;
            default:
                int i = LeaderboardFiltersViewModel.O;
                return ((LeaderboardFiltersViewState) obj).h;
        }
    }
}
