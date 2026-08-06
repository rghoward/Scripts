package io.intercom.android.sdk.m5.home.reducers;

import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.u;
import defpackage.y05;
import defpackage.z;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeReducer {
    public static final int $stable = 8;
    private final mh4<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;

    public /* synthetic */ HomeReducer(mh4 mh4Var, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new y05() : mh4Var, (i & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return (AppConfig) z.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<HomeCards> reduceHomeCards(List<? extends HomeCards> list, OpenMessengerResponse.NewConversationData newConversationData) {
        if (newConversationData == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        for (HomeCards homeNewConversationData : list) {
            if (homeNewConversationData instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData2 = (HomeCards.HomeNewConversationData) homeNewConversationData;
                homeNewConversationData = new HomeCards.HomeNewConversationData(BuildConfig.FLAVOR, HomeCardType.NEW_CONVERSATION, homeNewConversationData2.getAction(), homeNewConversationData2.getPreventMultipleInboundConversationsEnabled(), homeNewConversationData2.getOpenInboundConversationsIds(), homeNewConversationData2.getShowFinAvatar(), homeNewConversationData2.getShowTeammateExpectations(), newConversationData.getHomeCard());
            }
            arrayList.add(homeNewConversationData);
        }
        return arrayList;
    }

    public final HomeUiState computeUiState$intercom_sdk_base_release(HomeClientState homeClientState, mh4<g2b> mh4Var) {
        Participant.Builder participant;
        Participant participantBuild;
        homeClientState.getClass();
        mh4Var.getClass();
        NetworkResponse<OpenMessengerResponse> openMessengerResponse = homeClientState.getOpenMessengerResponse();
        NetworkResponse<HomeV2Response> homeResponse = homeClientState.getHomeResponse();
        AvatarWrapper avatarWrapper = null;
        if (openMessengerResponse == null || homeResponse == null) {
            return new HomeUiState.Loading(null);
        }
        if ((openMessengerResponse instanceof NetworkResponse.ClientError) || (openMessengerResponse instanceof NetworkResponse.ServerError) || (openMessengerResponse instanceof NetworkResponse.NetworkError)) {
            return new HomeUiState.Error(null, NetworkResponseKt.isRetryable(openMessengerResponse) ? new ErrorState.WithCTA(0, 0, null, 0, mh4Var, 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (!(openMessengerResponse instanceof NetworkResponse.Success)) {
            u.b();
            return null;
        }
        OpenMessengerResponse openMessengerResponse2 = (OpenMessengerResponse) ((NetworkResponse.Success) openMessengerResponse).getBody();
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse2.getNewConversationData();
        if ((homeResponse instanceof NetworkResponse.ClientError) || (homeResponse instanceof NetworkResponse.ServerError)) {
            return new HomeUiState.Error(null, new ErrorState.WithoutCTA(0, 0, null, 7, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (homeResponse instanceof NetworkResponse.NetworkError) {
            return new HomeUiState.Error(null, new ErrorState.WithCTA(0, 0, null, 0, mh4Var, 15, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (!(homeResponse instanceof NetworkResponse.Success)) {
            u.b();
            return null;
        }
        PoweredBy poweredBy = openMessengerResponse2.getPoweredBy();
        List<HomeCards> listReduceHomeCards = reduceHomeCards(((HomeV2Response) ((NetworkResponse.Success) homeResponse).getBody()).getCards(), newConversationData);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listReduceHomeCards) {
            HomeCards homeCards = (HomeCards) obj;
            if (homeCards instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData = (HomeCards.HomeNewConversationData) homeCards;
                if (!homeNewConversationData.getPreventMultipleInboundConversationsEnabled() || homeNewConversationData.getOpenInboundConversationsIds().isEmpty()) {
                }
            }
            arrayList.add(obj);
        }
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList2 = new ArrayList(ph1.n(builtActiveAdmins, 10));
        for (Participant participant2 : builtActiveAdmins) {
            Avatar avatar = participant2.getAvatar();
            avatar.getClass();
            Boolean boolIsBot = participant2.isBot();
            boolIsBot.getClass();
            arrayList2.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        ActiveBot activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot();
        if (activeBot != null && (participant = activeBot.getParticipant()) != null && (participantBuild = participant.build()) != null) {
            Avatar avatar2 = participantBuild.getAvatar();
            avatar2.getClass();
            Boolean boolIsBot2 = participantBuild.isBot();
            boolIsBot2.getClass();
            avatarWrapper = new AvatarWrapper(avatar2, boolIsBot2.booleanValue());
        }
        return new HomeUiState.Content(poweredBy, arrayList, arrayList2, avatarWrapper, this.config.invoke().isAccessToTeammateEnabled(), HomeHeaderStateReducerKt.computeContentHeader(this.config.invoke().getConfigModules(), this.intercomDataLayer.getTeamPresence().getValue(), homeClientState.isHeaderImageLoaded()));
    }

    public HomeReducer(mh4<AppConfig> mh4Var, IntercomDataLayer intercomDataLayer) {
        mh4Var.getClass();
        intercomDataLayer.getClass();
        this.config = mh4Var;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeReducer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
