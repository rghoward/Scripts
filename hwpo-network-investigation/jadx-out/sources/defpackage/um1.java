package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl", f = "CommentsRepositoryImpl.kt", l = {135, 141}, m = "deleteComment", v = 2)
public final class um1 extends u02 {
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dn1 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um1(dn1 dn1Var, u02 u02Var) {
        super(u02Var);
        this.v = dn1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.k(null, 0L, this);
    }
}
