package io.intercom.android.sdk;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.AblyAuthResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.AblyManager$createAuthCallback$1$authResponse$1", f = "AblyManager.kt", l = {258}, m = "invokeSuspend")
public final class AblyManager$createAuthCallback$1$authResponse$1 extends p6a implements ci4<t72, r02<? super NetworkResponse<? extends AblyAuthResponse>>, Object> {
    int label;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AblyManager$createAuthCallback$1$authResponse$1(AblyManager ablyManager, r02<? super AblyManager$createAuthCallback$1$authResponse$1> r02Var) {
        super(2, r02Var);
        this.this$0 = ablyManager;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AblyManager$createAuthCallback$1$authResponse$1(this.this$0, r02Var);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t72 t72Var, r02<? super NetworkResponse<AblyAuthResponse>> r02Var) {
        return ((AblyManager$createAuthCallback$1$authResponse$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        MessengerApi messengerApi = this.this$0.messengerApi;
        this.label = 1;
        Object ablyAuthTokenSuspend$default = MessengerApi.DefaultImpls.getAblyAuthTokenSuspend$default(messengerApi, null, this, 1, null);
        v72 v72Var = v72.t;
        return ablyAuthTokenSuspend$default == v72Var ? v72Var : ablyAuthTokenSuspend$default;
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ Object invoke(t72 t72Var, r02<? super NetworkResponse<? extends AblyAuthResponse>> r02Var) {
        return invoke2(t72Var, (r02<? super NetworkResponse<AblyAuthResponse>>) r02Var);
    }
}
