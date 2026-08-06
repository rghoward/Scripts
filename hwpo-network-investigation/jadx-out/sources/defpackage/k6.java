package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.data.AccountRepositoryImpl", f = "AccountRepositoryImpl.kt", l = {29}, m = "deleteAvatar", v = 2)
public final class k6 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ i6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(i6 i6Var, u02 u02Var) {
        super(u02Var);
        this.u = i6Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(this);
    }
}
