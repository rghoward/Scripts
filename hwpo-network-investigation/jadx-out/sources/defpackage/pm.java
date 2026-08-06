package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pm extends wp5 implements oh4<ub9, Boolean> {
    public final /* synthetic */ Resources u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(Resources resources) {
        super(1);
        this.u = resources;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(ub9 ub9Var) {
        return Boolean.valueOf(qm.b(ub9Var, this.u));
    }
}
