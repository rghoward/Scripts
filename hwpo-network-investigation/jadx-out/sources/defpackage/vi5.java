package defpackage;

import android.app.Application;
import android.content.Context;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.push.IntercomPushClient;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vi5 implements xg5 {
    public static final a Companion = new a();
    public final Context a;
    public final IntercomPushClient b = new IntercomPushClient();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public vi5(Context context, k55 k55Var) {
        this.a = context;
    }

    @Override // defpackage.xg5
    public final void a() {
        Intercom.Companion companion = Intercom.Companion;
        companion.initialize(g(), "android_sdk-c0409819879e23637aae6e48e64c2d5b7a331141", "jweygzii");
        companion.setLogLevel(8);
    }

    @Override // defpackage.xg5
    public final g2b b(String str) {
        this.b.sendTokenToIntercom(g(), str);
        return g2b.a;
    }

    @Override // defpackage.xg5
    public final void c(HashMap map) throws Throwable {
        this.b.handlePush(g(), map);
    }

    @Override // defpackage.xg5
    public final void d() {
        Intercom.Companion.client().logout();
    }

    @Override // defpackage.xg5
    public final Object e(h5b h5bVar, sb1 sb1Var) throws Throwable {
        nz8 nz8Var = new nz8(th0.e(sb1Var), v72.u);
        Registration registrationWithEmail = Registration.create().withUserId(String.valueOf(h5bVar.a)).withEmail(h5bVar.e);
        Intercom intercomClient = Intercom.Companion.client();
        registrationWithEmail.getClass();
        intercomClient.loginIdentifiedUser(registrationWithEmail, new wi5(nz8Var, this));
        Object objA = nz8Var.a();
        return objA == v72.t ? objA : g2b.a;
    }

    @Override // defpackage.xg5
    public final boolean f(HashMap map) {
        return this.b.isIntercomPush(map);
    }

    public final Application g() {
        Context context = this.a;
        Application application = context instanceof Application ? (Application) context : null;
        if (application != null) {
            return application;
        }
        z90.a("Only Application Context is acceptable.");
        return null;
    }
}
