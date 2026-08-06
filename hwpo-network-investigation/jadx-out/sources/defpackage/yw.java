package defpackage;

import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.DialogLeaderboardFiltersFlowBinding;
import com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowFragment;
import io.intercom.android.sdk.IntercomStatusCallback;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yw implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yw(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((IntercomStatusCallback) obj).onSuccess();
                break;
            default:
                LeaderboardFiltersFlowFragment leaderboardFiltersFlowFragment = (LeaderboardFiltersFlowFragment) obj;
                LeaderboardFiltersFlowFragment.Companion companion = LeaderboardFiltersFlowFragment.Companion;
                int dimension = (int) leaderboardFiltersFlowFragment.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                BottomSheetBehavior<FrameLayout> bottomSheetBehaviorP = leaderboardFiltersFlowFragment.p();
                T tA = leaderboardFiltersFlowFragment.S.a(leaderboardFiltersFlowFragment, LeaderboardFiltersFlowFragment.W[0]);
                tA.getClass();
                bottomSheetBehaviorP.K(((DialogLeaderboardFiltersFlowBinding) tA).a.getHeight() + dimension);
                break;
        }
    }
}
