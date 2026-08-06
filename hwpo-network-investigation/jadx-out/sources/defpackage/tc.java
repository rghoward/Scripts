package defpackage;

import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ tc(int i) {
        this.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ((ya) obj).getClass();
                return g2b.a;
            case 1:
                int i = LeaderboardDetailsHeaderViewModel.R;
                return Boolean.valueOf(((LeaderboardDetailsHeaderViewState) obj).e);
            default:
                c67 c67Var = ((r47) ((ru) obj).f()).u;
                c67Var.getClass();
                int i2 = c67.x;
                for (c67 c67Var2 : c67.a.b((js1.a) c67Var)) {
                }
                return null;
        }
    }
}
