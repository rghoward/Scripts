package defpackage;

import androidx.fragment.app.g;
import androidx.fragment.app.l;
import com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x01 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ x01(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                String strD = ((y01) obj).f.d("Content-Type");
                if (strD == null) {
                    return null;
                }
                ol8 ol8Var = wq6.e;
                try {
                    return wq6.a.a(strD);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            case 1:
                LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment = (LeaderboardDetailsFiltersFlowFragment) obj;
                LeaderboardDetailsFiltersFlowFragment.Companion companion = LeaderboardDetailsFiltersFlowFragment.Companion;
                g gVarRequireActivity = leaderboardDetailsFiltersFlowFragment.requireActivity();
                gVarRequireActivity.getClass();
                int i2 = leaderboardDetailsFiltersFlowFragment.Q;
                l childFragmentManager = leaderboardDetailsFiltersFlowFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                return new y10(gVarRequireActivity, i2, childFragmentManager);
            default:
                return Boolean.valueOf(x57.r.c(((x57) obj).a));
        }
    }
}
