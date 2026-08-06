package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl", f = "CommentsRepositoryImpl.kt", l = {203, 206, 208, 210}, m = "stopSendingAttachment", v = 2)
public final class cn1 extends u02 {
    public pk1 t;
    public gk1 u;
    public long v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ dn1 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn1(dn1 dn1Var, u02 u02Var) {
        super(u02Var);
        this.y = dn1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(null, 0L, 0L, this);
    }
}
