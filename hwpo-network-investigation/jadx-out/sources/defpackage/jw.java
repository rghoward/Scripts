package defpackage;

import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jw implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ jw(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return Boolean.valueOf(!(((iw.a) obj) instanceof ss7));
            case 1:
                int i = LeaderboardDetailsHeaderViewModel.R;
                return ((LeaderboardDetailsHeaderViewState) obj).d;
            default:
                return zg3.c(xv.c(700, 0, null, 6), 2);
        }
    }
}
