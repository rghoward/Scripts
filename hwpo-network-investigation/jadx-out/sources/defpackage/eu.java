package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eu extends wp5 implements ci4<wg3, wg3, Boolean> {
    public final /* synthetic */ jo3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(jo3 jo3Var) {
        super(2);
        this.u = jo3Var;
    }

    @Override // defpackage.ci4
    public final Boolean invoke(wg3 wg3Var, wg3 wg3Var2) {
        wg3 wg3Var3 = wg3Var;
        wg3 wg3Var4 = wg3Var2;
        wg3 wg3Var5 = wg3.v;
        return Boolean.valueOf(wg3Var3 == wg3Var5 && wg3Var4 == wg3Var5 && !this.u.a().e);
    }
}
