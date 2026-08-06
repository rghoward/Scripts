package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo2 implements gb6.a, c.b {
    public final /* synthetic */ Object t;

    public /* synthetic */ lo2(aj.a aVar, List list) {
        this.t = list;
    }

    @Override // com.google.android.material.tabs.c.b
    public void a(TabLayout.g gVar, int i) {
        int i2;
        LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment = (LeaderboardDetailsHeaderFragment) this.t;
        LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
        Context contextRequireContext = leaderboardDetailsHeaderFragment.requireContext();
        contextRequireContext.getClass();
        Resources resources = leaderboardDetailsHeaderFragment.getResources();
        if (i == 0) {
            i2 = R.string.rx;
        } else {
            if (i != 1) {
                z90.a("Invalid leaderboard top value type");
                return;
            }
            i2 = R.string.scaled;
        }
        String string = resources.getString(i2);
        string.getClass();
        gVar.e = new nd2(contextRequireContext, string, i);
        gVar.a();
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((aj) obj).getClass();
    }

    public /* synthetic */ lo2(LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment) {
        this.t = leaderboardDetailsHeaderFragment;
    }
}
