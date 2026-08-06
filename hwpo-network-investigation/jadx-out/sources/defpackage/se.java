package defpackage;

import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewState;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ se(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = ue.B;
                oq4.b bVar = ((xe) obj).a;
                if (bVar != null) {
                    return bVar.t;
                }
                return null;
            case 1:
                BaseLeaderboardsListViewModel.Companion companion = BaseLeaderboardsListViewModel.Companion;
                return ((BaseLeaderboardsListViewState) obj).a;
            case 2:
                pc3.b bVar2 = pc3.Companion;
                return Boolean.valueOf(cy.a(((pc3.c) obj).d));
            default:
                int i2 = LeaderboardFiltersViewModel.O;
                return ((LeaderboardFiltersViewState) obj).f;
        }
    }
}
