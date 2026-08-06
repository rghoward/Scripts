package defpackage;

import com.hwpo_training_app.leaderboards.filter.di.FiltersFlowRouterQualifier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ks4 implements js4 {
    public final hy8 a;
    public final hy8 b;

    public ks4(hy8 hy8Var, @FiltersFlowRouterQualifier hy8 hy8Var2) {
        hy8Var.getClass();
        hy8Var2.getClass();
        this.a = hy8Var;
        this.b = hy8Var2;
    }

    @Override // defpackage.js4
    public final gs4 a(g31 g31Var) {
        g31Var.getClass();
        int iOrdinal = g31Var.ordinal();
        if (iOrdinal == 0) {
            return new gs4(this.a);
        }
        if (iOrdinal == 1) {
            return new gs4(this.b);
        }
        u.b();
        return null;
    }
}
