package defpackage;

import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewState;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d21 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ d21(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                e21.a aVar = e21.Companion;
                ((LocalDate) obj).getClass();
                return g2b.a;
            case 1:
                int i = LeaderboardDetailsFiltersViewModel.J;
                return ((LeaderboardDetailsFiltersViewState) obj).a;
            default:
                return Float.valueOf(((bw) obj).a);
        }
    }
}
