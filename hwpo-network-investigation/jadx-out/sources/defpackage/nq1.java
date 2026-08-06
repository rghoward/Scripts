package defpackage;

import com.hwpo_training_app.leaderboards.databinding.FragmentLeaderboardsDetailsHeaderBinding;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nq1 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ nq1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                oq1.a((oq1) obj);
                break;
            default:
                FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBinding = (FragmentLeaderboardsDetailsHeaderBinding) obj;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                fragmentLeaderboardsDetailsHeaderBinding.k.setVisibility(0);
                fragmentLeaderboardsDetailsHeaderBinding.m.setVisibility(0);
                fragmentLeaderboardsDetailsHeaderBinding.i.setVisibility(0);
                break;
        }
    }
}
