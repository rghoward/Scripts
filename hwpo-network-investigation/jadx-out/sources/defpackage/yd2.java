package defpackage;

import android.app.Activity;
import androidx.fragment.app.l;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yd2 extends ff1 {
    public final Activity a;
    public final fe2 b;
    public final ae2 c;
    public final yd2 d = this;

    public yd2(fe2 fe2Var, ae2 ae2Var, un2 un2Var, Activity activity) {
        this.b = fe2Var;
        this.c = ae2Var;
        this.a = activity;
    }

    @Override // rv2.a
    public final rv2.c a() {
        zg1.b(48, "expectedSize");
        m95.a aVar = new m95.a(48);
        Boolean bool = Boolean.TRUE;
        aVar.b("r7", bool);
        aVar.b("e8", bool);
        aVar.b("gd", bool);
        aVar.b("ue", bool);
        aVar.b("pg", bool);
        aVar.b("com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel", bool);
        aVar.b("cx0", bool);
        aVar.b("w71", bool);
        aVar.b("com.hwpo_training_app.leaderboards.list.challenge.presentation.ChallengesLeaderboardsViewModel", bool);
        aVar.b("m91", bool);
        aVar.b("qn1", bool);
        aVar.b("com.hwpo_training_app.leaderboards.list.daily.presentation.DailyLeaderboardsViewModel", bool);
        aVar.b("a43", bool);
        aVar.b("fj3", bool);
        int i = i03.E;
        aVar.b("gl3", bool);
        int i2 = nr1.d;
        aVar.b("cd4", bool);
        aVar.b("bd4", bool);
        aVar.b("rr4", bool);
        aVar.b("e25", bool);
        aVar.b("com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowViewModel", bool);
        aVar.b("com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel", bool);
        aVar.b("com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel", bool);
        aVar.b("com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowViewModel", bool);
        aVar.b("com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel", bool);
        aVar.b("com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel", bool);
        aVar.b("com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel", bool);
        aVar.b("qg6", bool);
        int i3 = kt7.u;
        aVar.b("ip6", bool);
        aVar.b("com.hwpo_training_app.notifications.presentation.NotificationsViewModel", bool);
        aVar.b("fj7", bool);
        aVar.b("rj7", bool);
        int i4 = pt9.I;
        aVar.b("yj7", bool);
        aVar.b("wl7", bool);
        aVar.b("vx7", bool);
        aVar.b("ny7", bool);
        aVar.b("k48", bool);
        int i5 = us3.u;
        aVar.b("zb8", bool);
        aVar.b("gp8", bool);
        aVar.b("jr8", bool);
        aVar.b("ct8", bool);
        aVar.b("ij9", bool);
        aVar.b("qo9", bool);
        aVar.b("tka", bool);
        int i6 = utb.d;
        aVar.b("wpa", bool);
        aVar.b("nua", bool);
        aVar.b("o9b", bool);
        aVar.b("ybb", bool);
        aVar.b("tsb", bool);
        return new rv2.c(new vs5(aVar.a(true)), new ie2(this.b, this.c));
    }

    @Override // defpackage.t25
    public final void b(HostActivity hostActivity) {
        fe2 fe2Var = this.b;
        hostActivity.x = fe2Var.s.get();
        hy8 hy8Var = fe2Var.t.get();
        Activity activity = this.a;
        activity.getClass();
        hy8Var.getClass();
        l supportFragmentManager = ((uy) activity).getSupportFragmentManager();
        supportFragmentManager.getClass();
        hostActivity.y = new vn2(hy8Var, supportFragmentManager, new eb(1));
    }

    @Override // ggb.b
    public final ge2 c() {
        return new ge2(this.b, this.c, this.d);
    }

    @Override // ke4.a
    public final be2 d() {
        return new be2(this.b, this.c, this.d);
    }
}
