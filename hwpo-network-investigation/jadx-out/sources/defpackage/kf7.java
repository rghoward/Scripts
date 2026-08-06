package defpackage;

import com.hwpo_training_app.notifications.domain.SubscribeToNotificationsUseCase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.domain.usecase.ObserveSocketConnectionStatesUseCase$observeNotificationsSocketConnectionState$3", f = "ObserveSocketConnectionStatesUseCase.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class kf7 extends p6a implements ci4<dx1, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ lf7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf7(lf7 lf7Var, r02<? super kf7> r02Var) {
        super(2, r02Var);
        this.u = lf7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new kf7(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(dx1 dx1Var, r02<? super g2b> r02Var) {
        return ((kf7) create(dx1Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            SubscribeToNotificationsUseCase subscribeToNotificationsUseCase = this.u.b;
            g2b g2bVar = g2b.a;
            this.t = 1;
            subscribeToNotificationsUseCase.getClass();
            Object objB = g5b.b(subscribeToNotificationsUseCase, g2bVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
