package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gm extends wp5 implements oh4<ba4, Boolean> {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(int i) {
        super(1);
        this.u = i;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(ba4 ba4Var) {
        return Boolean.valueOf(ba4Var.y(this.u));
    }
}
