package defpackage;

import android.os.Bundle;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ f19 u;

    public /* synthetic */ jk0(f19 f19Var, int i) {
        this.t = i;
        this.u = f19Var;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        f19 f19Var = this.u;
        switch (i) {
            case 0:
                ho5<Object>[] ho5VarArr = BaseLeaderboardsListFragment.z;
                ((BaseLeaderboardsListFragment) f19Var).p().g(ec6.u);
                return g2b.a;
            default:
                c19 c19Var = ((p09) f19Var).v;
                if (c19Var != null) {
                    Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                    c19Var.c(bundleC);
                    if (!bundleC.isEmpty()) {
                        return bundleC;
                    }
                }
                return null;
        }
    }
}
