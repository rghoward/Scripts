package defpackage;

import androidx.fragment.app.i;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p26 implements a46, tp6 {
    public final rr3 a;
    public final qn6 b;

    public p26(rr3 rr3Var, qn6 qn6Var) {
        rr3Var.getClass();
        this.a = rr3Var;
        this.b = qn6Var;
    }

    @Override // defpackage.a46
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.a46
    public final void d(final int i) {
        this.a.c(new rf4(LeaderboardValueAttachmentsFragment.class.getName(), new mb2() { // from class: o26
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                LeaderboardValueAttachmentsFragment.Companion.getClass();
                LeaderboardValueAttachmentsFragment leaderboardValueAttachmentsFragment = new LeaderboardValueAttachmentsFragment();
                leaderboardValueAttachmentsFragment.setArguments(uy0.c(new js7("arg_value_id", Integer.valueOf(i))));
                return leaderboardValueAttachmentsFragment;
            }
        }, true));
    }

    @Override // defpackage.tp6
    public final void f(String[] strArr, int i) {
        strArr.getClass();
        this.b.f(strArr, i);
    }

    @Override // defpackage.a46
    public final void j(final int i, final xn0 xn0Var, final m2b m2bVar, final String str) {
        xn0Var.getClass();
        m2bVar.getClass();
        this.a.c(new rf4(o8b.class.getName(), new mb2() { // from class: n26
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                o8b.Companion.getClass();
                return o8b.a.a(i, ebb.CHALLENGES, xn0Var, m2bVar, str, true);
            }
        }, true));
    }

    @Override // defpackage.a46
    public final void o(final String str, final String str2, final String str3, final int i) {
        str.getClass();
        rf4 rf4Var = new rf4(LeaderboardDetailsHeaderFragment.class.getName(), new mb2() { // from class: m26
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                LeaderboardDetailsHeaderFragment.Companion.getClass();
                return LeaderboardDetailsHeaderFragment.Companion.a(i, str, str2, str3, true);
            }
        }, false);
        rr3 rr3Var = this.a;
        rr3Var.getClass();
        rr3Var.a(new yh0(rf4Var));
    }

    @Override // defpackage.tp6
    public final void u(String str) {
        str.getClass();
        this.b.u(str);
    }
}
