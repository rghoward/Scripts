package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import defpackage.p21;
import defpackage.ru8;
import defpackage.u21;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.UsersResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class CallbackHolder {
    private static final Twig TWIG = LumberMill.getLogger();
    final IntercomDataLayer dataLayer;
    private final UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;

    public CallbackHolder(IntercomDataLayer intercomDataLayer, UserIdentity userIdentity, UnreadConversationsTracker unreadConversationsTracker) {
        this.dataLayer = intercomDataLayer;
        this.userIdentity = userIdentity;
        this.unreadConversationsTracker = unreadConversationsTracker;
    }

    public BaseCallback<LogEventResponse.Builder> logEventCallback() {
        return new BaseCallback<LogEventResponse.Builder>() { // from class: io.intercom.android.sdk.api.CallbackHolder.1
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(LogEventResponse.Builder builder) {
                LogEventResponse logEventResponseBuild = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(logEventResponseBuild));
                CallbackHolder.this.unreadConversationsTracker.track(logEventResponseBuild);
                CallbackHolder.this.userIdentity.update(logEventResponseBuild.getUser());
                CallbackHolder.this.dataLayer.updateConfig(logEventResponseBuild.getConfig());
                CallbackHolder.this.dataLayer.updateCarousel(logEventResponseBuild.getCarousel());
                CallbackHolder.this.dataLayer.updateOverlayConversations(logEventResponseBuild.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(logEventResponseBuild.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }

    public u21<Void> loggingCallback(final String str) {
        return new u21<Void>() { // from class: io.intercom.android.sdk.api.CallbackHolder.3
            @Override // defpackage.u21
            public void onFailure(p21<Void> p21Var, Throwable th) {
                CallbackHolder.TWIG.internal(str + " failure");
            }

            @Override // defpackage.u21
            public void onResponse(p21<Void> p21Var, ru8<Void> ru8Var) {
                CallbackHolder.TWIG.internal(str + " success");
            }
        };
    }

    public BaseCallback<UsersResponse.Builder> unreadCallback() {
        return new BaseCallback<UsersResponse.Builder>() { // from class: io.intercom.android.sdk.api.CallbackHolder.2
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(UsersResponse.Builder builder) {
                UsersResponse usersResponseBuild = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(usersResponseBuild));
                CallbackHolder.this.unreadConversationsTracker.track(usersResponseBuild);
                CallbackHolder.this.userIdentity.update(usersResponseBuild.getUser());
                CallbackHolder.this.dataLayer.updateConfig(usersResponseBuild.getConfig());
                CallbackHolder.this.dataLayer.updateOverlayConversations(usersResponseBuild.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(usersResponseBuild.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }
}
