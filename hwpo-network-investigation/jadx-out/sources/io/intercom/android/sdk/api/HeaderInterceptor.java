package io.intercom.android.sdk.api;

import android.content.Context;
import android.util.Base64;
import com.intercom.twig.BuildConfig;
import defpackage.jp8;
import defpackage.qp8;
import defpackage.qu8;
import defpackage.vg5;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class HeaderInterceptor implements vg5 {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HOST_APP_VERSION_KEY = "X-INTERCOM-HOST-APP-VERSION";
    private static final String IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final String INTERCOM_AGENT = "X-INTERCOM-AGENT";
    private static final String INTERCOM_AGENT_WRAPPER = "X-INTERCOM-AGENT-WRAPPER";
    private static final String SUPPORTED_LANGUAGES_KEY = "X-INTERCOM-SUPPORTED-LANGUAGES";
    private static final String SUPPORTED_LANGUAGE_LIST = "ar,bg,bn,bs,ca,cs,da,de,de-form,el,en,es,et,fa-IR,fi,fr,hi,he,hr,hu,id,it,ja,ko,lt,lv,mn,ms,nb,nl,pl,pt-PT,pt-BR,ro,ru,sl,sr,sv,sw,th,tr,uk,vi,zh-Hant,zh-Hans";
    private final AppIdentity appIdentity;
    private final String appVersion;
    private final String cordovaVersion;
    private final String flutterVersion;
    private final Random random;
    private final String reactNativeVersion;
    private final String userLocale;
    private final String versionName;

    public HeaderInterceptor(String str, String str2, String str3, String str4, AppIdentity appIdentity, String str5, String str6, Random random) {
        this.cordovaVersion = str;
        this.reactNativeVersion = str2;
        this.flutterVersion = str3;
        this.versionName = str4;
        this.appIdentity = appIdentity;
        this.userLocale = str5;
        this.appVersion = str6;
        this.random = random;
    }

    public static void clearPersistedWrapperVersions(Context context) {
        WrapperPrefsStore.create(context).clear();
    }

    public static HeaderInterceptor create(Context context, AppIdentity appIdentity) {
        WrapperPrefsStore wrapperPrefsStoreCreate = WrapperPrefsStore.create(context);
        return new HeaderInterceptor(wrapperPrefsStoreCreate.getCordovaVersion(), wrapperPrefsStoreCreate.getReactNativeVersion(), BuildConfig.FLAVOR, io.intercom.android.sdk.BuildConfig.VERSION_NAME, appIdentity, UserLocaleUtilKt.getUserLocaleString(context), DeviceUtils.getAppVersion(context), new Random());
    }

    private String getBasicAuth() {
        return "Basic " + Base64.encodeToString((this.appIdentity.appId() + ":" + this.appIdentity.apiKey()).getBytes(), 2);
    }

    public static void setCordovaVersion(Context context, String str) {
        WrapperPrefsStore.create(context).setCordovaVersion(str);
    }

    public static void setReactNativeVersion(Context context, String str) {
        WrapperPrefsStore.create(context).setReactNativeVersion(str);
    }

    @Override // defpackage.vg5
    public qu8 intercept(vg5.a aVar) {
        jp8 jp8VarRequest = aVar.request();
        jp8.a aVarB = jp8VarRequest.b();
        aVarB.b("Authorization", getBasicAuth());
        aVarB.b(IDEMPOTENCY_KEY, Long.toHexString(this.random.nextLong()));
        aVarB.b(INTERCOM_AGENT, "intercom-android-sdk/" + this.versionName);
        aVarB.b(ACCEPT_LANGUAGE, this.userLocale);
        aVarB.b(SUPPORTED_LANGUAGES_KEY, SUPPORTED_LANGUAGE_LIST);
        aVarB.b(HOST_APP_VERSION_KEY, this.appVersion);
        qp8 qp8Var = jp8VarRequest.d;
        if (qp8Var == null || !qp8Var.contentType().a.startsWith("multipart/")) {
            aVarB.b("Content-Type", "application/json");
        }
        if (!this.cordovaVersion.isEmpty()) {
            aVarB.b(INTERCOM_AGENT_WRAPPER, "intercom-sdk-cordova/" + this.cordovaVersion);
        }
        if (!this.reactNativeVersion.isEmpty()) {
            aVarB.b(INTERCOM_AGENT_WRAPPER, "intercom-sdk-react-native/" + this.reactNativeVersion);
        }
        if (!this.flutterVersion.isEmpty()) {
            aVarB.b(INTERCOM_AGENT_WRAPPER, "intercom-sdk-flutter/" + this.flutterVersion);
        }
        return aVar.a(new jp8(aVarB));
    }
}
