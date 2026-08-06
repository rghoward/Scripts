package defpackage;

import androidx.fragment.app.e;
import androidx.fragment.app.f;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersEvents;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bg0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ bg0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18((String) obj2, (hc9) obj);
            default:
                LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment = (LeaderboardDetailsFiltersFragment) obj2;
                gm3 gm3Var = (gm3) obj;
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof LeaderboardDetailsFiltersEvents.CloseDialog) {
                    f parentFragment = leaderboardDetailsFiltersFragment.getParentFragment();
                    e eVar = parentFragment instanceof e ? (e) parentFragment : null;
                    if (eVar != null) {
                        eVar.i();
                    }
                }
                return g2b.a;
        }
    }
}
