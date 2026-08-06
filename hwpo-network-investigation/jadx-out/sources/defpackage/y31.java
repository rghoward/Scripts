package defpackage;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y31 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ y31(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((np9) obj2).g(null);
                return g2b.a;
            case 1:
                rb3 rb3Var = (rb3) obj2;
                kx3.c cVar = (kx3.c) obj;
                rb3.a aVar = rb3.Companion;
                cVar.getClass();
                if (cVar instanceof kx3.c.b) {
                    pc3 pc3VarS = rb3Var.s();
                    List<rc9> list = ((kx3.c.b) cVar).a;
                    list.getClass();
                    for (rc9 rc9Var : list) {
                        int iOrdinal = rc9Var.a.ordinal();
                        oy0.d(rhb.b(pc3VarS), null, null, new xc3(pc3VarS, rc9Var, iOrdinal != 0 ? iOrdinal != 1 ? u60.w : u60.u : u60.v, null), 3);
                    }
                } else {
                    if (!(cVar instanceof kx3.c.a)) {
                        u.b();
                        return null;
                    }
                    rb3Var.m(((kx3.c.a) cVar).a);
                }
                return g2b.a;
            default:
                LeaderboardTopValueModel leaderboardTopValueModel = (LeaderboardTopValueModel) obj;
                leaderboardTopValueModel.getClass();
                return Boolean.valueOf(leaderboardTopValueModel.a == ((LeaderboardTopValueModel) obj2).a);
        }
    }
}
