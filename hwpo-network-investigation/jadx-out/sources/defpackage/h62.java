package defpackage;

import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewState;
import io.intercom.android.sdk.m5.navigation.IntercomTransitionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h62 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ h62(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                return IntercomTransitionsKt.slideUpEnterTransition$lambda$0((ru) obj);
            default:
                int i = LeaderboardDetailsFiltersViewModel.J;
                return ((LeaderboardDetailsFiltersViewState) obj).d;
        }
    }
}
