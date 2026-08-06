package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 extends pd4 {
    public final /* synthetic */ i00.e C;
    public final /* synthetic */ i00 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(i00 i00Var, i00 i00Var2, i00.e eVar) {
        super(i00Var2);
        this.D = i00Var;
        this.C = eVar;
    }

    @Override // defpackage.pd4
    public final ao9 b() {
        return this.C;
    }

    @Override // defpackage.pd4
    public final boolean c() {
        i00 i00Var = this.D;
        if (i00Var.getInternalPopup().a()) {
            return true;
        }
        i00Var.y.n(i00Var.getTextDirection(), i00Var.getTextAlignment());
        return true;
    }
}
