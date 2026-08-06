package defpackage;

import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel;
import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q46 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ q46(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        uh1 uh1Var;
        switch (this.t) {
            case 0:
                int i = LeaderboardTabContainerViewModel.C;
                return Boolean.valueOf(((LeaderboardTabContainerViewState) obj).a);
            default:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i2 = uh1.l;
                au3 au3Var = t29.a;
                Boolean bool = Boolean.FALSE;
                xj5.a(obj2, bool);
                if (obj2 != null) {
                    uh1Var = xj5.a(obj2, Boolean.FALSE) ? new uh1(uh1.k) : new uh1(u7d.c(((Integer) obj2).intValue()));
                } else {
                    uh1Var = null;
                }
                uh1Var.getClass();
                long j = uh1Var.a;
                Object obj3 = list.get(1);
                u29 u29Var = t29.z;
                xj5.a(obj3, bool);
                vf7 vf7Var = obj3 != null ? (vf7) u29Var.u.invoke(obj3) : null;
                vf7Var.getClass();
                long j2 = vf7Var.a;
                Object obj4 = list.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new el9(f.floatValue(), j, j2);
        }
    }
}
