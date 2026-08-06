package io.intercom.android.sdk.fcm;

import android.app.Application;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.intercom.twig.Twig;
import defpackage.hp3;
import defpackage.r9a;
import defpackage.zm8;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.push.IntercomPushClient;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomFcmMessengerService extends FirebaseMessagingService {
    public static final /* synthetic */ int t = 0;
    private static final IntercomPushClient pushClient = new IntercomPushClient();
    private static final Twig twig = LumberMill.getLogger();

    public static void initialize(Application application) {
        FirebaseMessaging.d().g().b(new hp3(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Application application, r9a r9aVar) {
        if (!r9aVar.n()) {
            twig.w("Fetching FCM registration token failed", r9aVar.i());
            return;
        }
        String str = (String) r9aVar.j();
        twig.internal("FCM registration token fetched: " + str);
        pushClient.sendTokenToIntercom(application, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(zm8 zm8Var) throws Throwable {
        twig.d("Intercom push received: " + zm8Var.j(), new Object[0]);
        pushClient.handlePush(getApplication(), zm8Var.j());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            twig.e("Intercom push registration failed. Please make sure you have added a google-services.json file", new Object[0]);
        } else {
            pushClient.sendTokenToIntercom(getApplication(), str);
        }
    }
}
