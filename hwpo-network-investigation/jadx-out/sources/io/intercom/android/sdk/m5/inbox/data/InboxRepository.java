package io.intercom.android.sdk.m5.inbox.data;

import defpackage.js7;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.ConversationsResponse;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final MessengerApi api;
    private final NexusClient nexusClient;

    public /* synthetic */ InboxRepository(MessengerApi messengerApi, NexusClient nexusClient, AblyManager ablyManager, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 4) != 0 ? Injector.get().getAblyManager() : ablyManager);
    }

    public static /* synthetic */ Object getConversations$default(InboxRepository inboxRepository, Long l, int i, r02 r02Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return inboxRepository.getConversations(l, i, r02Var);
    }

    public final Object getConversations(Long l, int i, r02<? super NetworkResponse<ConversationsResponse.Builder>> r02Var) {
        Map<String, ? extends Object> mapI;
        MessengerApi messengerApi = this.api;
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        if (l == null) {
            mapI = Collections.singletonMap("per_page", new Integer(i));
            mapI.getClass();
        } else {
            mapI = qi6.i(new js7("per_page", new Integer(i)), new js7("before", l));
        }
        return messengerApi.getConversationsSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapI), r02Var);
    }

    public final r54<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    public InboxRepository(MessengerApi messengerApi, NexusClient nexusClient, AblyManager ablyManager) {
        messengerApi.getClass();
        nexusClient.getClass();
        ablyManager.getClass();
        this.api = messengerApi;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
    }

    public InboxRepository() {
        this(null, null, null, 7, null);
    }
}
