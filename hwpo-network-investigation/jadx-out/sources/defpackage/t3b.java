package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.domain.UpdateAccountAvatarUseCase", f = "UpdateAccountAvatarUseCase.kt", l = {12}, m = "executeOnBackground", v = 2)
public final class t3b extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ s3b u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3b(s3b s3bVar, u02 u02Var) {
        super(u02Var);
        this.u = s3bVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
