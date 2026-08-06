package io.intercom.android.sdk.api;

import defpackage.eu7;
import defpackage.m17;
import defpackage.n17;
import defpackage.p21;
import defpackage.pr0;
import defpackage.qp8;
import defpackage.r02;
import defpackage.ru3;
import defpackage.wn7;
import defpackage.wt7;
import defpackage.xn7;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.AblyAuthResponse;
import io.intercom.android.sdk.models.AblyConnectResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface MessengerApi {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAblyAuthTokenSuspend$default(MessengerApi messengerApi, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: getAblyAuthTokenSuspend");
                return null;
            }
            if ((i & 1) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getAblyAuthTokenSuspend(qp8Var, r02Var);
        }

        public static /* synthetic */ Object getAblyConnectConfigSuspend$default(MessengerApi messengerApi, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: getAblyConnectConfigSuspend");
                return null;
            }
            if ((i & 1) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getAblyConnectConfigSuspend(qp8Var, r02Var);
        }

        public static /* synthetic */ Object getConversationSuspend$default(MessengerApi messengerApi, String str, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: getConversationSuspend");
                return null;
            }
            if ((i & 2) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationSuspend(str, qp8Var, r02Var);
        }

        public static /* synthetic */ Object getConversationsSuspend$default(MessengerApi messengerApi, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: getConversationsSuspend");
                return null;
            }
            if ((i & 1) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationsSuspend(qp8Var, r02Var);
        }

        public static /* synthetic */ Object getHomeCardsV2Suspend$default(MessengerApi messengerApi, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: getHomeCardsV2Suspend");
                return null;
            }
            if ((i & 1) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getHomeCardsV2Suspend(qp8Var, r02Var);
        }

        public static /* synthetic */ Object getUnreadConversationsSuspended$default(MessengerApi messengerApi, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: getUnreadConversationsSuspended");
                return null;
            }
            if ((i & 1) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getUnreadConversationsSuspended(qp8Var, r02Var);
        }

        public static /* synthetic */ Object openMessengerSuspended$default(MessengerApi messengerApi, qp8 qp8Var, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: openMessengerSuspended");
                return null;
            }
            if ((i & 1) != 0) {
                qp8Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.openMessengerSuspended(qp8Var, r02Var);
        }
    }

    @wn7("conversations/{conversationId}/quick_reply")
    Object addConversationQuickReplySuspend(@eu7("conversationId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<Part.Builder>> r02Var);

    @wn7("conversations/{conversationId}/remark")
    p21<Void> addConversationRatingRemark(@eu7("conversationId") String str, @pr0 qp8 qp8Var);

    @xn7("device_tokens")
    p21<Void> deleteDeviceToken(@pr0 qp8 qp8Var);

    @wn7("realtime/authorize")
    Object getAblyAuthTokenSuspend(@pr0 qp8 qp8Var, r02<? super NetworkResponse<AblyAuthResponse>> r02Var);

    @wn7("realtime/connect")
    Object getAblyConnectConfigSuspend(@pr0 qp8 qp8Var, r02<? super NetworkResponse<AblyConnectResponse>> r02Var);

    @wn7("content/fetch_carousel")
    p21<CarouselResponse.Builder> getCarousel(@pr0 qp8 qp8Var);

    @wn7("conversations/{conversationId}")
    Object getConversationSuspend(@eu7("conversationId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<Conversation>> r02Var);

    @wn7("conversations/inbox")
    Object getConversationsSuspend(@pr0 qp8 qp8Var, r02<? super NetworkResponse<ConversationsResponse.Builder>> r02Var);

    @wn7("gifs")
    Object getGifsSuspended(@pr0 qp8 qp8Var, r02<? super NetworkResponse<? extends GifResponse>> r02Var);

    @wn7("home")
    Object getHomeCardsV2Suspend(@pr0 qp8 qp8Var, r02<? super NetworkResponse<HomeV2Response>> r02Var);

    @wn7("articles/{articleId}")
    p21<LinkResponse.Builder> getLink(@eu7("articleId") String str, @pr0 qp8 qp8Var);

    @wn7("carousels/{carouselId}/fetch")
    p21<CarouselResponse.Builder> getProgrammaticCarousel(@eu7("carouselId") String str, @pr0 qp8 qp8Var);

    @wn7("sheets/open")
    p21<Sheet.Builder> getSheet(@pr0 qp8 qp8Var);

    @wn7("content/fetch_survey")
    p21<FetchSurveyRequest> getSurvey(@pr0 qp8 qp8Var);

    @wn7("conversations/unread")
    p21<UsersResponse.Builder> getUnreadConversations(@pr0 qp8 qp8Var);

    @wn7("conversations/unread")
    Object getUnreadConversationsSuspended(@pr0 qp8 qp8Var, r02<? super NetworkResponse<? extends UsersResponse.Builder>> r02Var);

    @wn7("uploads")
    Object getUploadFileUrlSuspended(@pr0 qp8 qp8Var, r02<? super NetworkResponse<Upload.Builder>> r02Var);

    @wn7("events")
    p21<LogEventResponse.Builder> logEvent(@pr0 qp8 qp8Var);

    @wn7("conversations/dismiss")
    p21<Void> markAsDismissed(@pr0 qp8 qp8Var);

    @wn7("conversations/{conversationId}/read")
    p21<Void> markAsRead(@eu7("conversationId") String str, @pr0 qp8 qp8Var);

    @wn7("conversations/{conversationId}/read")
    Object markAsReadSuspend(@eu7("conversationId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<Void>> r02Var);

    @wn7("stats_system/carousel_button_action_tapped")
    p21<Void> markCarouselActionButtonTapped(@pr0 qp8 qp8Var);

    @wn7("stats_system/carousel_completed")
    p21<Void> markCarouselAsCompleted(@pr0 qp8 qp8Var);

    @wn7("stats_system/carousel_dismissed")
    p21<Void> markCarouselAsDismissed(@pr0 qp8 qp8Var);

    @wn7("stats_system/carousel_screen_viewed")
    p21<Void> markCarouselScreenViewed(@pr0 qp8 qp8Var);

    @wn7("stats_system/carousel_permission_granted")
    p21<Void> markPermissionGranted(@pr0 qp8 qp8Var);

    @wn7("stats_system/push_opened")
    p21<Void> markPushAsOpened(@pr0 qp8 qp8Var);

    @wn7("open")
    Object openMessengerSuspended(@pr0 qp8 qp8Var, r02<? super NetworkResponse<OpenMessengerResponse>> r02Var);

    @wn7("conversations/{conversationId}/rate")
    p21<Void> rateConversation(@eu7("conversationId") String str, @pr0 qp8 qp8Var);

    @wn7("conversations/{conversationId}/react")
    p21<Void> reactToConversation(@eu7("conversationId") String str, @pr0 qp8 qp8Var);

    @wn7("articles/{articleId}/react")
    p21<Void> reactToLink(@eu7("articleId") String str, @pr0 qp8 qp8Var);

    @wn7("conversations/{conversationId}/record_interactions")
    p21<Void> recordInteractions(@eu7("conversationId") String str, @pr0 qp8 qp8Var);

    @wn7("conversations/{conversationId}/reply")
    Object replyToConversationSuspend(@eu7("conversationId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<Part.Builder>> r02Var);

    @wn7("error_reports")
    p21<Void> reportError(@pr0 qp8 qp8Var);

    @wn7("metrics")
    p21<Void> sendMetrics(@pr0 qp8 qp8Var);

    @wn7("user_auth_tokens")
    p21<Void> setAuthToken(@pr0 qp8 qp8Var);

    @wn7("device_tokens")
    p21<Void> setDeviceToken(@pr0 qp8 qp8Var);

    @wn7("conversations")
    Object startNewConversationSuspend(@pr0 qp8 qp8Var, r02<? super NetworkResponse<ConversationResponse.Builder>> r02Var);

    @wn7("conversations/{conversationId}/form")
    Object submitFormSuspend(@eu7("conversationId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<Conversation>> r02Var);

    @wn7("sheets/submit")
    p21<Void> submitSheet(@pr0 qp8 qp8Var);

    @m17
    @wn7("conversations/transcribe")
    Object transcribeSuspend(@wt7 n17.c cVar, @wt7 n17.c cVar2, @wt7 n17.c cVar3, @wt7 List<n17.c> list, r02<? super NetworkResponse<TranscribedText>> r02Var);

    @wn7("custom_bots/trigger_inbound_conversation")
    Object triggerInboundConversationSuspend(@pr0 qp8 qp8Var, r02<? super NetworkResponse<Conversation>> r02Var);

    @wn7("users")
    p21<UpdateUserResponse.Builder> updateUser(@pr0 qp8 qp8Var);
}
