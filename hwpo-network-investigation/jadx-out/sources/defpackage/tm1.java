package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl", f = "CommentsRepositoryImpl.kt", l = {269, 277}, m = "changeAttachmentStateTo", v = 2)
public final class tm1 extends u02 {
    public long t;
    public long u;
    public xc9 v;
    public gk1 w;
    public /* synthetic */ Object x;
    public final /* synthetic */ dn1 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm1(dn1 dn1Var, u02 u02Var) {
        super(u02Var);
        this.y = dn1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.m(0L, null, 0L, this);
    }
}
