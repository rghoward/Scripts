package defpackage;

import androidx.core.widget.NestedScrollView;
import com.hwpo_training_app.leaderboards.databinding.DialogLeaderboardDetailsFiltersBinding;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t26 implements ExpandableLayout.b, l43 {
    public final /* synthetic */ Object t;

    public /* synthetic */ t26(Object obj) {
        this.t = obj;
    }

    @Override // net.cachapa.expandablelayout.ExpandableLayout.b
    public void a(int i) {
        final DialogLeaderboardDetailsFiltersBinding dialogLeaderboardDetailsFiltersBinding = (DialogLeaderboardDetailsFiltersBinding) this.t;
        LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
        if (i == 3) {
            dialogLeaderboardDetailsFiltersBinding.i.post(new Runnable() { // from class: v26
                @Override // java.lang.Runnable
                public final void run() {
                    LeaderboardDetailsFiltersFragment.Companion companion2 = LeaderboardDetailsFiltersFragment.Companion;
                    NestedScrollView nestedScrollView = dialogLeaderboardDetailsFiltersBinding.i;
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), false, nestedScrollView.getHeight() - nestedScrollView.getScrollY());
                }
            });
        }
    }

    @Override // defpackage.l43
    public double c(double d) {
        zua zuaVar = (zua) this.t;
        float[] fArr = si1.a;
        return si1.b(zuaVar, d);
    }
}
