package io.intercom.android.sdk.identity;

import android.content.Context;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.r54;
import defpackage.t72;
import defpackage.t78;
import defpackage.v72;
import defpackage.xm2;
import defpackage.yk2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.identity.AppIdentityStore$Companion$loadCachedCredentials$1", f = "AppIdentityStore.kt", l = {107}, m = "invokeSuspend")
public final class AppIdentityStore$Companion$loadCachedCredentials$1 extends p6a implements ci4<t72, r02<? super AppIdentityStore.AppCredentials>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIdentityStore$Companion$loadCachedCredentials$1(Context context, r02<? super AppIdentityStore$Companion$loadCachedCredentials$1> r02Var) {
        super(2, r02Var);
        this.$context = context;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AppIdentityStore$Companion$loadCachedCredentials$1(this.$context, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super AppIdentityStore.AppCredentials> r02Var) {
        return ((AppIdentityStore$Companion$loadCachedCredentials$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            r54 data = AppIdentityStore.Companion.getAppDataStore(this.$context).getData();
            this.label = 1;
            obj = yk2.k(data, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        t78 t78Var = (t78) obj;
        AppIdentityStore.Companion companion = AppIdentityStore.Companion;
        return new AppIdentityStore.AppCredentials(companion.decryptField(t78Var, AppIdentityStore.KEY_API_KEY), companion.decryptField(t78Var, AppIdentityStore.KEY_APP_ID));
    }
}
