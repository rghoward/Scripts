package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.Gson;
import defpackage.g2b;
import defpackage.if3;
import defpackage.js7;
import defpackage.kh6;
import defpackage.mh4;
import defpackage.n17;
import defpackage.o7a;
import defpackage.pi6;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.ss5;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.z2a;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRequestBody;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final Api api;
    private final MessengerApi messengerApi;
    private final NexusClient nexusClient;
    private final r54<ParsedNexusEvent> nexusEventFlow;
    private final ss5 nexusEventsRepository$delegate;
    private final UploadRepository uploadRepository;
    private final UserIdentity userIdentity;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetConversationReason.values().length];
            try {
                iArr[GetConversationReason.NEW_COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetConversationReason.NEXUS_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetConversationReason.NETWORK_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetConversationReason.OPEN_CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GetConversationReason.POLLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, AblyManager ablyManager, NexusClient nexusClient, t72 t72Var, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i & 4) != 0 ? Injector.get().getApi() : api, (i & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 16) != 0 ? Injector.get().getAblyManager() : ablyManager, (i & 32) != 0 ? Injector.get().getNexusClient() : nexusClient, t72Var);
    }

    private final NexusEventsRepository getNexusEventsRepository() {
        return (NexusEventsRepository) this.nexusEventsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusEventsRepository nexusEventsRepository_delegate$lambda$0(ConversationRepository conversationRepository, t72 t72Var) {
        return new NexusEventsRepository(conversationRepository.nexusClient, conversationRepository.userIdentity, t72Var);
    }

    public final Object addQuickReplyToConversation(String str, String str2, String str3, String str4, r02<? super NetworkResponse<Part.Builder>> r02Var) {
        js7[] js7VarArr = {new js7("reply_option_uuid", str), new js7("client_assigned_uuid", str4)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(pi6.g(2));
        qi6.j(linkedHashMap, js7VarArr);
        if (str3.length() > 0) {
            linkedHashMap.put("quick_reply_part_id", str3);
        }
        return this.messengerApi.addConversationQuickReplySuspend(str2, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(linkedHashMap), r02Var);
    }

    public final Object createConversationFromSuggestion(String str, String str2, r02<? super NetworkResponse<Conversation>> r02Var) {
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        kh6 kh6Var = new kh6();
        kh6Var.put("id", str);
        if (str2 != null) {
            kh6Var.put("messenger_open_request_id", str2);
        }
        return this.messengerApi.triggerInboundConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(pi6.f(kh6Var)), r02Var);
    }

    public final Object createNewConversation(List<Block.Builder> list, String str, String str2, String str3, List<ComposerSuggestions.Suggestion> list2, Long l, String str4, String str5, r02<? super NetworkResponse<ConversationResponse.Builder>> r02Var) {
        Map<String, ? extends Object> mapBaseNewConversationParams = this.api.baseNewConversationParams();
        mapBaseNewConversationParams.put("blocks", list);
        mapBaseNewConversationParams.put("client_assigned_uuid", str5);
        if (str != null) {
            mapBaseNewConversationParams.put("bot_intro", str);
        }
        if (str2 != null) {
            mapBaseNewConversationParams.put("article_id", str2);
        }
        if (str3 != null) {
            mapBaseNewConversationParams.put("resolution_bot_behavior_version_id", str3);
        }
        if (list2 != null) {
            mapBaseNewConversationParams.put(MetricTracker.Object.COMPOSER_SUGGESTIONS, new Gson().toJson(list2));
        }
        if (l != null) {
            mapBaseNewConversationParams.put("snapshot_id", l);
        }
        if (str4 != null) {
            mapBaseNewConversationParams.put("messenger_open_request_id", str4);
        }
        return this.messengerApi.startNewConversationSuspend(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapBaseNewConversationParams), r02Var);
    }

    public final void dismissPrivacyPolicy() {
        Map mapSingletonMap = Collections.singletonMap("dismissed_privacy_policy_notice_at", Long.valueOf(System.currentTimeMillis() / 1000));
        mapSingletonMap.getClass();
        this.api.updateUser(UserUpdateRequest.create(false, false, mapSingletonMap, true), new IntercomStatusCallback() { // from class: io.intercom.android.sdk.m5.conversation.data.ConversationRepository.dismissPrivacyPolicy.1
            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onFailure(IntercomError intercomError) {
                intercomError.getClass();
            }

            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onSuccess() {
            }
        });
    }

    public final AblyManager getAblyManager() {
        return this.ablyManager;
    }

    public final Api getApi() {
        return this.api;
    }

    public final Object getConversation(String str, GetConversationReason getConversationReason, r02<? super NetworkResponse<Conversation>> r02Var) {
        String str2;
        int i = WhenMappings.$EnumSwitchMapping$0[getConversationReason.ordinal()];
        if (i == 1) {
            str2 = "Nexus New Comment";
        } else if (i == 2) {
            str2 = "Nexus Reconnected";
        } else if (i == 3) {
            str2 = "Internet Reconnected";
        } else if (i == 4) {
            str2 = "Click Conversation";
        } else {
            if (i != 5) {
                u.b();
                return null;
            }
            str2 = "State Sync";
        }
        js7[] js7VarArr = {new js7("request_origin", str2)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(pi6.g(1));
        qi6.j(linkedHashMap, js7VarArr);
        if (getConversationReason == GetConversationReason.POLLING) {
            linkedHashMap.put("sync", "true");
        }
        return this.messengerApi.getConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(linkedHashMap), r02Var);
    }

    public final MessengerApi getMessengerApi() {
        return this.messengerApi;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public final Object loadGifs(String str, r02<? super NetworkResponse<? extends GifResponse>> r02Var) {
        Map<String, ? extends Object> mapSingletonMap;
        if (z2a.w(str)) {
            mapSingletonMap = if3.t;
        } else {
            mapSingletonMap = Collections.singletonMap("query", str);
            mapSingletonMap.getClass();
        }
        return this.messengerApi.getGifsSuspended(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapSingletonMap), r02Var);
    }

    public final Object markAsRead(String str, r02<? super g2b> r02Var) {
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map<String, ? extends Object> mapSingletonMap = Collections.singletonMap("app_id", Injector.get().getAppIdentity().appId());
        mapSingletonMap.getClass();
        Object objMarkAsReadSuspend = this.messengerApi.markAsReadSuspend(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapSingletonMap), r02Var);
        return objMarkAsReadSuspend == v72.t ? objMarkAsReadSuspend : g2b.a;
    }

    public final NexusEventsRepository nexusEventsRepository() {
        return getNexusEventsRepository();
    }

    public final r54<ParsedNexusEvent> realTimeEvents() {
        return this.nexusEventFlow;
    }

    public final void recordInteractions(String str, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.api.recordInteractions(str, strArr);
    }

    public final Object replyToConversation(String str, String str2, List<Block.Builder> list, Long l, r02<? super NetworkResponse<Part.Builder>> r02Var) {
        Map<String, ? extends Object> mapCreateBaseReplyParams = this.api.createBaseReplyParams();
        mapCreateBaseReplyParams.put("blocks", list);
        mapCreateBaseReplyParams.put("client_assigned_uuid", str2);
        if (l != null) {
            mapCreateBaseReplyParams.put("last_admin_part_created_at", TimeFormatterExtKt.toISOFormat(l.longValue()));
        }
        return this.messengerApi.replyToConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapCreateBaseReplyParams), r02Var);
    }

    public final Object submitForm(String str, String str2, String str3, String str4, String str5, r02<? super NetworkResponse<Conversation>> r02Var) {
        Map mapI = qi6.i(new js7("conversation_part_id", str2), new js7("identifier", str3), new js7("value", str4), new js7("type", str5));
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map<String, ? extends Object> mapSingletonMap = Collections.singletonMap("form_params", mapI);
        mapSingletonMap.getClass();
        return this.messengerApi.submitFormSuspend(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapSingletonMap), r02Var);
    }

    public final Object transcribe(File file, r02<? super NetworkResponse<TranscribedText>> r02Var) {
        String json;
        String email = this.userIdentity.getEmail();
        email.getClass();
        if (email.length() == 0) {
            Map mapSingletonMap = Collections.singletonMap(UserIdentity.ANONYMOUS_ID, this.userIdentity.getAnonymousId());
            mapSingletonMap.getClass();
            json = new Gson().toJson(mapSingletonMap);
        } else {
            kh6 kh6Var = new kh6();
            String email2 = this.userIdentity.getEmail();
            email2.getClass();
            kh6Var.put("email", email2);
            String userId = this.userIdentity.getUserId();
            userId.getClass();
            if (userId.length() != 0) {
                String userId2 = this.userIdentity.getUserId();
                userId2.getClass();
                kh6Var.put("user_id", userId2);
            }
            json = new Gson().toJson(pi6.f(kh6Var));
        }
        n17.c cVarB = n17.c.a.b("audio", file.getName(), new AudioRequestBody(file));
        json.getClass();
        n17.c cVarA = n17.c.a.a("user_data", json);
        String strAppId = Injector.get().getAppIdentity().appId();
        strAppId.getClass();
        return this.messengerApi.transcribeSuspend(cVarB, cVarA, n17.c.a.a("app_id", strAppId), MessengerApiHelper.INSTANCE.getDefaultMultipartFields$intercom_sdk_base_release(), r02Var);
    }

    public final Object uploadMedia(MediaData.Media media, r02<? super NetworkResponse<Upload.Builder>> r02Var) {
        return this.uploadRepository.uploadFile(media, r02Var);
    }

    public ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, AblyManager ablyManager, NexusClient nexusClient, final t72 t72Var) {
        messengerApi.getClass();
        uploadRepository.getClass();
        api.getClass();
        userIdentity.getClass();
        ablyManager.getClass();
        nexusClient.getClass();
        t72Var.getClass();
        this.messengerApi = messengerApi;
        this.uploadRepository = uploadRepository;
        this.api = api;
        this.userIdentity = userIdentity;
        this.ablyManager = ablyManager;
        this.nexusClient = nexusClient;
        this.nexusEventsRepository$delegate = new o7a(new mh4() { // from class: p22
            @Override // defpackage.mh4
            public final Object invoke() {
                return ConversationRepository.nexusEventsRepository_delegate$lambda$0(this.t, t72Var);
            }
        });
        this.nexusEventFlow = CombinedEventAsFlowKt.combinedEventAsFlow(nexusClient, ablyManager);
    }
}
