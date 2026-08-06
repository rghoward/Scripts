package defpackage;

import com.hwpo_training_app.notifications.domain.SubscribeToNotificationsUseCase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lf7 extends g5b<g2b, g2b> {
    public final kd7 a;
    public final SubscribeToNotificationsUseCase b;

    public lf7(kd7 kd7Var, SubscribeToNotificationsUseCase subscribeToNotificationsUseCase) {
        kd7Var.getClass();
        this.a = kd7Var;
        this.b = subscribeToNotificationsUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(lf7 lf7Var, u02 u02Var) throws Throwable {
        hf7 hf7Var;
        if (u02Var instanceof hf7) {
            hf7Var = (hf7) u02Var;
            int i = hf7Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf7Var.v = i - Integer.MIN_VALUE;
            } else {
                hf7Var = new hf7(lf7Var, u02Var);
            }
        } else {
            hf7Var = new hf7(lf7Var, u02Var);
        }
        Object obj = hf7Var.t;
        int i2 = hf7Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            if7 if7Var = new if7(lf7Var, null);
            hf7Var.v = 1;
            Object objD = u72.d(if7Var, hf7Var);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        return c(this, bVar);
    }
}
