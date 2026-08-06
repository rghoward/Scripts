package defpackage;

import android.view.View;
import androidx.fragment.app.f;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersEvents;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m36 implements View.OnClickListener {
    public final /* synthetic */ int t;
    public final /* synthetic */ f u;

    public /* synthetic */ m36(f fVar, int i) {
        this.t = i;
        this.u = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.t;
        f fVar = this.u;
        switch (i) {
            case 0:
                LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
                ((LeaderboardFiltersFragment) fVar).r().f(LeaderboardFiltersEvents.CloseDialog.b);
                break;
            default:
                vo6.a aVar = vo6.Companion;
                ((vo6) fVar).w().f(bp6.a.b);
                break;
        }
    }
}
