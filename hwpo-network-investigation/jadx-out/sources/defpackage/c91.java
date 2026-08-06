package defpackage;

import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewState;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c91 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ c91(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = m91.I;
                return ((n91) obj).b;
            case 1:
                int i2 = LeaderboardValueAttachmentsViewModel.J;
                return Boolean.valueOf(((LeaderboardValueAttachmentsViewState) obj).a);
            default:
                return SurveyTopBarComponentKt.SurveyTopBar$lambda$8$lambda$7$lambda$6$lambda$5((d73) obj);
        }
    }
}
