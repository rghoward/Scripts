package defpackage;

import androidx.fragment.app.i;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements SwipeRefreshLayout.f, mb2 {
    public final /* synthetic */ Object t;

    public /* synthetic */ lk0(Object obj) {
        this.t = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void a() {
        BaseLeaderboardsListFragment baseLeaderboardsListFragment = (BaseLeaderboardsListFragment) this.t;
        ho5<Object>[] ho5VarArr = BaseLeaderboardsListFragment.z;
        baseLeaderboardsListFragment.p().g(ec6.v);
    }

    @Override // defpackage.mb2
    public Object c(i iVar) {
        ipa ipaVar = (ipa) this.t;
        iVar.getClass();
        opa.Companion.getClass();
        opa opaVar = new opa();
        opaVar.setArguments(uy0.c(new js7("tips_arguments", ipaVar)));
        return opaVar;
    }
}
