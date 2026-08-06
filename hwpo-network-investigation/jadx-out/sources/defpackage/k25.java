package defpackage;

import com.hwpo_training_app.notifications.domain.entity.LeaderboardScoreModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel", f = "HostActivityViewModel.kt", l = {200}, m = "navigateToLeaderboardValueComments", v = 2)
public final class k25 extends u02 {
    public LeaderboardScoreModel t;
    public Integer u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ e25 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k25(e25 e25Var, u02 u02Var) {
        super(u02Var);
        this.x = e25Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return e25.g(this.x, null, false, this);
    }
}
