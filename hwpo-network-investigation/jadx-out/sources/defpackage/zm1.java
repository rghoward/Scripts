package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl", f = "CommentsRepositoryImpl.kt", l = {178, 183, 188, 190, 192, 194}, m = "resendCommentWithAttachments", v = 2)
public final class zm1 extends u02 {
    public final /* synthetic */ dn1 A;
    public int B;
    public pk1 t;
    public gk1 u;
    public m89 v;
    public long w;
    public long x;
    public long y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(dn1 dn1Var, u02 u02Var) {
        super(u02Var);
        this.A = dn1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(null, 0L, 0L, this);
    }
}
