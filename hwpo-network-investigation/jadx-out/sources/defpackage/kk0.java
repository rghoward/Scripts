package defpackage;

import android.os.Bundle;
import androidx.fragment.app.l;
import com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.ResultsDialogFragment;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListEvents;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.m5.data.IntercomEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kk0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ kk0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                BaseLeaderboardsListFragment baseLeaderboardsListFragment = (BaseLeaderboardsListFragment) obj2;
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = BaseLeaderboardsListFragment.z;
                gm3Var.getClass();
                if (gm3Var.equals(BaseLeaderboardsListEvents.StopRefreshing.b)) {
                    baseLeaderboardsListFragment.o().b.setRefreshing(false);
                } else if (gm3Var instanceof BaseLeaderboardsListEvents.ShowResultsDialog) {
                    BaseLeaderboardsListEvents.ShowResultsDialog showResultsDialog = (BaseLeaderboardsListEvents.ShowResultsDialog) gm3Var;
                    ResultsDialogFragment.Params params = new ResultsDialogFragment.Params(showResultsDialog.b, showResultsDialog.c);
                    ResultsDialogFragment.Companion.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ARG_PARAMS", params);
                    ResultsDialogFragment resultsDialogFragment = new ResultsDialogFragment();
                    resultsDialogFragment.setArguments(bundle);
                    l childFragmentManager = baseLeaderboardsListFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    resultsDialogFragment.o(childFragmentManager, ResultsDialogFragment.class.getName());
                } else if (gm3Var instanceof BaseLeaderboardsListEvents.ShowError) {
                    baseLeaderboardsListFragment.m(((BaseLeaderboardsListEvents.ShowError) gm3Var).b);
                }
                return g2b.a;
            default:
                return ((CardWebView) obj2).lambda$setUp$0((IntercomEvent) obj);
        }
    }
}
