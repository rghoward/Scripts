package defpackage;

import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tc4 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.t) {
            case 0:
                int i = bd4.C;
                z = ((bd4.b) obj).a;
                break;
            default:
                int i2 = LeaderboardDetailsHeaderViewModel.R;
                z = ((LeaderboardDetailsHeaderViewState) obj).g;
                break;
        }
        return Boolean.valueOf(z);
    }
}
