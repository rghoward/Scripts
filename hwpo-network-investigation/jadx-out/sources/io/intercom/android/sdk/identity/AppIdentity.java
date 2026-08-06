package io.intercom.android.sdk.identity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AppIdentity {
    public static AppIdentity create(String str, String str2) {
        return new AutoValue_AppIdentity(str, str2);
    }

    public abstract String apiKey();

    public abstract String appId();
}
