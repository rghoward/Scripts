package defpackage;

import com.hwpo_training_app.core.data.service.account.AccountAuthenticatorService;
import com.hwpo_training_app.host.fcm.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ee2 implements e5, f14, zj4 {
    public final fe2 a;

    public ee2(fe2 fe2Var) {
        this.a = fe2Var;
    }

    @Override // defpackage.f14
    public final void a(FirebaseMessagingService firebaseMessagingService) {
        fe2 fe2Var = this.a;
        firebaseMessagingService.x = fe2Var.g();
        firebaseMessagingService.y = fe2Var.n0.get();
        firebaseMessagingService.z = fe2Var.m.get();
    }

    @Override // defpackage.e5
    public final void b(AccountAuthenticatorService accountAuthenticatorService) {
        accountAuthenticatorService.w = new d5(this.a.c.a);
    }
}
