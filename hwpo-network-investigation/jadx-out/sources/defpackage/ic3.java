package defpackage;

import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic3 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                pc3.b bVar = pc3.Companion;
                return Boolean.valueOf(((pc3.c) obj).h);
            case 1:
                int i = LeaderboardFiltersViewModel.O;
                return Boolean.valueOf(((LeaderboardFiltersViewState) obj).j);
            default:
                return g2b.a;
        }
    }
}
