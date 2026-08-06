package defpackage;

import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel;
import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewState;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ hg(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                pg.b bVar = pg.Companion;
                return ((eh) obj).a;
            case 1:
                int i = LeaderboardTabContainerViewModel.C;
                return Boolean.valueOf(((LeaderboardTabContainerViewState) obj).b);
            default:
                return SurveyComponentKt.SurveyErrorState$lambda$18$lambda$17((t72) obj);
        }
    }
}
