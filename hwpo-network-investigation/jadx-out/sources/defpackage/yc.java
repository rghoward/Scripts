package defpackage;

import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewState;
import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ yc(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                gd.a aVar = gd.Companion;
                return ((ud) obj).e;
            case 1:
                return Answer.MultipleAnswer.getLength$lambda$1((String) obj);
            case 2:
                int i = cd4.B;
                return Boolean.valueOf(((dd4) obj).b);
            case 3:
                int i2 = LeaderboardDetailsHeaderViewModel.R;
                return Boolean.valueOf(((LeaderboardDetailsHeaderViewState) obj).b);
            default:
                return zg3.d(xv.c(700, 0, null, 6), 2);
        }
    }
}
