package defpackage;

import android.os.Bundle;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u26 implements pf4, l43 {
    public final /* synthetic */ Object t;

    public /* synthetic */ u26(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.l43
    public double c(double d) {
        zua zuaVar = (zua) this.t;
        float[] fArr = si1.a;
        return si1.d(zuaVar, d);
    }

    @Override // defpackage.pf4
    public void d(Bundle bundle, String str) {
        String string;
        LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = (LeaderboardDetailsFiltersFragment) this.t;
        LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
        int i = bundle.getInt("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.SELECTED_GYM_ID_KEY");
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if (numValueOf == null || (string = bundle.getString("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.SELECTED_GYM_NAME_KEY")) == null) {
            return;
        }
        LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModelS = leaderboardDetailsFiltersFragment.s();
        leaderboardDetailsFiltersViewModelS.C = LeaderboardDetailsFiltersModel.d(leaderboardDetailsFiltersViewModelS.C, false, false, false, null, null, null, null, new js7(numValueOf, string), false, 127);
        leaderboardDetailsFiltersViewModelS.g();
    }
}
