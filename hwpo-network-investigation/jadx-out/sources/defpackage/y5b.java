package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.repository.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {43, 59}, m = "signIn", v = 2)
public final class y5b extends u02 {
    public h5b t;
    public /* synthetic */ Object u;
    public final /* synthetic */ d6b v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5b(d6b d6bVar, u02 u02Var) {
        super(u02Var);
        this.v = d6bVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.j(null, null, this);
    }
}
