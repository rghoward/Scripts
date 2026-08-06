package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z50 implements SwipeRefreshLayout.f, lh7 {
    public final /* synthetic */ Object t;

    public /* synthetic */ z50(Object obj) {
        this.t = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void a() {
        ((AthletesListViewModel) this.t).i(ec6.v);
    }

    @Override // defpackage.lh7
    public void d(Exception exc) {
        ((RemoteConfigManager) this.t).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
