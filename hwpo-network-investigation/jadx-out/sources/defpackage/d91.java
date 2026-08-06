package defpackage;

import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewState;
import io.intercom.android.sdk.api.KotlinXConvertorFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d91 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ d91(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = m91.I;
                return ((n91) obj).c;
            case 1:
                return KotlinXConvertorFactory.getConvertorFactory$lambda$0((vl5) obj);
            case 2:
                int i2 = LeaderboardValueAttachmentsViewModel.J;
                return ((LeaderboardValueAttachmentsViewState) obj).b;
            default:
                if (xj5.a(obj, 0)) {
                    return new dka(8589934592L);
                }
                return xj5.a(obj, 1) ? new dka(4294967296L) : new dka(0L);
        }
    }
}
