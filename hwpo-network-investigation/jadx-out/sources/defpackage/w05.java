package defpackage;

import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewState;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w05 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ w05(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return HomeItemKt.HomeItem$lambda$11$lambda$10$lambda$9((d73) obj);
            case 1:
                int i = LeaderboardDetailsHeaderViewModel.R;
                return Boolean.valueOf(((LeaderboardDetailsHeaderViewState) obj).f);
            default:
                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$1$lambda$0((ap5) obj);
        }
    }
}
