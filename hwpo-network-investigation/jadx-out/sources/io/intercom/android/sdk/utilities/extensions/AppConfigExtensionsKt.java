package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.identity.AppConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfigExtensionsKt {
    public static final boolean canStartNewConversation(AppConfig appConfig) {
        appConfig.getClass();
        boolean zIsInboundMessages = appConfig.isInboundMessages();
        if (appConfig.isPreventMultipleInboundConversationsEnabled()) {
            return zIsInboundMessages && !appConfig.getHasOpenConversations();
        }
        return zIsInboundMessages;
    }
}
