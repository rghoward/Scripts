package io.intercom.android.sdk.m5.home.data;

import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepository {
    public static final int $stable = 8;
    private final MessengerApi messengerApi;
    private final NexusClient nexusClient;

    public /* synthetic */ HomeRepository(MessengerApi messengerApi, NexusClient nexusClient, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getNexusClient() : nexusClient);
    }

    public final Object getHomeCards(r02<? super NetworkResponse<HomeV2Response>> r02Var) {
        return MessengerApi.DefaultImpls.getHomeCardsV2Suspend$default(this.messengerApi, null, r02Var, 1, null);
    }

    public final r54<ParsedNexusEvent> realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public HomeRepository(MessengerApi messengerApi, NexusClient nexusClient) {
        messengerApi.getClass();
        nexusClient.getClass();
        this.messengerApi = messengerApi;
        this.nexusClient = nexusClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeRepository() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
