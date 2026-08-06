package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 extends wp5 implements mh4<sk8> {
    public final /* synthetic */ mh4<sk8> u;
    public final /* synthetic */ mb7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(mh4 mh4Var, mb7 mb7Var) {
        super(0);
        this.u = mh4Var;
        this.v = mb7Var;
    }

    @Override // defpackage.mh4
    public final sk8 invoke() {
        sk8 sk8VarInvoke;
        mh4<sk8> mh4Var = this.u;
        if (mh4Var != null && (sk8VarInvoke = mh4Var.invoke()) != null) {
            return sk8VarInvoke;
        }
        mb7 mb7Var = this.v;
        if (!mb7Var.g1().G) {
            mb7Var = null;
        }
        if (mb7Var != null) {
            return tk8.a(0L, c43.c(mb7Var.v));
        }
        return null;
    }
}
