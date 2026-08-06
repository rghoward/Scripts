package defpackage;

import io.ably.lib.push.ActivationContext;
import io.ably.lib.types.Callback;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w8 implements fh7, gb6.a {
    public final /* synthetic */ Object t;

    public /* synthetic */ w8(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.fh7
    public void b(r9a r9aVar) {
        ActivationContext.lambda$getRegistrationToken$0((Callback) this.t, r9aVar);
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        i28 i28Var = (i28) this.t;
        ((s28.c) obj).u(i28Var.m, i28Var.l);
    }
}
