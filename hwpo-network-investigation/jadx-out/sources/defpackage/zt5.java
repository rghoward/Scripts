package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zt5 extends ju5 {
    public final /* synthetic */ nu5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt5(nu5 nu5Var, int i, int i2, yt5 yt5Var, qu5 qu5Var) {
        super(nu5Var, i, i2, yt5Var, qu5Var);
        this.f = nu5Var;
    }

    @Override // defpackage.ju5
    public final iu5 b(int i, hu5[] hu5VarArr, List<yo4> list, int i2) {
        return new iu5(i, hu5VarArr, this.f, list, i2);
    }
}
