package defpackage;

import androidx.fragment.app.f;
import com.hwpo_training_app.host.presentation.HostActivity;
import com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q15 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ q15(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ho5<Object>[] ho5VarArr = HostActivity.K;
                return ((HostActivity) obj).getWindow().getDecorView();
            case 1:
                LeaderboardFiltersFlowFragment leaderboardFiltersFlowFragment = (LeaderboardFiltersFlowFragment) obj;
                LeaderboardFiltersFlowFragment.Companion companion = LeaderboardFiltersFlowFragment.Companion;
                if (leaderboardFiltersFlowFragment.getChildFragmentManager().H() > 1) {
                    f fVarD = leaderboardFiltersFlowFragment.getChildFragmentManager().D(leaderboardFiltersFlowFragment.Q);
                    hk0 hk0Var = fVarD instanceof hk0 ? (hk0) fVarD : null;
                    if (hk0Var != null) {
                        hk0Var.j();
                    } else {
                        leaderboardFiltersFlowFragment.i();
                    }
                } else {
                    leaderboardFiltersFlowFragment.i();
                }
                return g2b.a;
            default:
                am9 am9Var = ((ur7) obj).l;
                g2b g2bVar = g2b.a;
                am9Var.f(g2bVar);
                return g2bVar;
        }
    }
}
