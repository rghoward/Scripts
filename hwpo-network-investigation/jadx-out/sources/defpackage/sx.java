package defpackage;

import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewState;
import io.intercom.android.sdk.api.ApiFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sx implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ sx(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ApiFactory.createLegacyRetrofit$lambda$0((Throwable) obj);
            default:
                int i = LeaderboardFiltersViewModel.O;
                return ((LeaderboardFiltersViewState) obj).d;
        }
    }
}
