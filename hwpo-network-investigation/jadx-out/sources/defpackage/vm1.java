package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl", f = "CommentsRepositoryImpl.kt", l = {59, 61, 74}, m = "fetchComments", v = 2)
public final class vm1 extends u02 {
    public pk1 t;
    public rk1 u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ dn1 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm1(dn1 dn1Var, u02 u02Var) {
        super(u02Var);
        this.x = dn1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.f(null, this);
    }
}
