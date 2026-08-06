package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import defpackage.o03;
import defpackage.qu8;
import defpackage.vg5;
import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class UserIdentityInterceptor implements vg5 {
    private static final String NO_USER_IDENTITY = "A network request was made with no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).";
    private static final String USER_IDENTITY_CHANGED = "registered user changed while this request was in flight";
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;

    public UserIdentityInterceptor(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Override // defpackage.vg5
    public qu8 intercept(vg5.a aVar) throws IOException {
        boolean zIdentityExists = this.userIdentity.identityExists();
        UserIdentity userIdentity = this.userIdentity;
        if (!zIdentityExists) {
            if (userIdentity.isSoftReset() && aVar.request().a.i.contains("device_tokens") && aVar.request().b.equals(HttpConstants.Methods.PUT)) {
                this.twig.internal("interceptor", "removing device token - proceeding");
                return aVar.a(aVar.request());
            }
            o03.a(NO_USER_IDENTITY);
            return null;
        }
        String fingerprint = userIdentity.getFingerprint();
        qu8 qu8VarA = aVar.a(aVar.request());
        boolean zEquals = fingerprint.equals(this.userIdentity.getFingerprint());
        Twig twig = this.twig;
        if (zEquals) {
            twig.internal("interceptor", "proceeding");
            return qu8VarA;
        }
        twig.internal("interceptor", "halting: user identity changed");
        qu8VarA.z.close();
        o03.a(USER_IDENTITY_CHANGED);
        return null;
    }
}
