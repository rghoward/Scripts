package defpackage;

import androidx.fragment.app.i;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class we9 implements mf9, tp6 {
    public final hy8 a;
    public final hy8 b;
    public final qn6 c;

    public we9(hy8 hy8Var, hy8 hy8Var2, qn6 qn6Var) {
        hy8Var.getClass();
        this.a = hy8Var;
        this.b = hy8Var2;
        this.c = qn6Var;
    }

    @Override // defpackage.mf9
    public final void a() {
        hy8 hy8Var = this.b;
        if (hy8Var == null) {
            hy8Var = this.a;
        }
        hy8Var.b();
    }

    @Override // defpackage.mf9
    public final void b(final int i, final int i2, final List<vn0> list) {
        list.getClass();
        this.a.c(new rf4(oo0.class.getName(), new mb2() { // from class: ue9
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                oo0.Companion.getClass();
                List list2 = list;
                list2.getClass();
                oo0 oo0Var = new oo0();
                oo0Var.setArguments(uy0.c(new js7("PROGRAM_ID_KEY", Integer.valueOf(i)), new js7("SESSION_ID_KEY", Integer.valueOf(i2)), new js7("BENCHMARKS_KEY", list2)));
                return oo0Var;
            }
        }, true));
    }

    @Override // defpackage.tp6
    public final void f(String[] strArr, int i) {
        strArr.getClass();
        this.c.f(strArr, i);
    }

    @Override // defpackage.mf9
    public final void p(final int i, final int i2, final boolean z, final tc8 tc8Var, final zc8 zc8Var) {
        tc8Var.getClass();
        zc8Var.getClass();
        this.a.c(new rf4(rb3.class.getName(), new mb2() { // from class: se9
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                rb3.Companion.getClass();
                return rb3.a.a(i, i2, z, tc8Var, zc8Var, false, null);
            }
        }, true));
    }

    @Override // defpackage.mf9
    public final void q(final int i, final xn0 xn0Var, final m2b m2bVar, final String str) {
        xn0Var.getClass();
        m2bVar.getClass();
        str.getClass();
        this.a.c(new rf4(o8b.class.getName(), new mb2() { // from class: te9
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                o8b.Companion.getClass();
                return o8b.a.a(i, ebb.BENCHMARK, xn0Var, m2bVar, str, false);
            }
        }, true));
    }

    @Override // defpackage.mf9
    public final void t(final int i, final String str, final String str2) {
        str.getClass();
        this.a.c(new rf4(LeaderboardDetailsHeaderFragment.class.getName(), new mb2() { // from class: ve9
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                LeaderboardDetailsHeaderFragment.Companion.getClass();
                return LeaderboardDetailsHeaderFragment.Companion.a(i, str, str2, null, true);
            }
        }, true));
    }

    @Override // defpackage.tp6
    public final void u(String str) {
        str.getClass();
        this.c.u(str);
    }
}
