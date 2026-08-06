package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notification_permission.domain.usecase.SetNotificationPermissionAskedPreviouslyUseCase", f = "SetNotificationPermissionAskedPreviouslyUseCase.kt", l = {12}, m = "executeOnBackground", v = 2)
public final class bk9 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ck9 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk9(ck9 ck9Var, u02 u02Var) {
        super(u02Var);
        this.u = ck9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(this);
    }
}
