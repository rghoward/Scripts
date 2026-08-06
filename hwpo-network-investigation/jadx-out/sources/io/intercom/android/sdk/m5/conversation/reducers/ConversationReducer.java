package io.intercom.android.sdk.m5.conversation.reducers;

import com.intercom.twig.BuildConfig;
import defpackage.a60;
import defpackage.e96;
import defpackage.hf3;
import defpackage.mh4;
import defpackage.o22;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.th1;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.z;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.StreamingPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationReducer {
    public static final int $stable = 8;
    private final mh4<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;
    private final mh4<UserIdentity> userIdentity;

    public /* synthetic */ ConversationReducer(mh4 mh4Var, mh4 mh4Var2, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new a60(1) : mh4Var, (i & 2) != 0 ? new o22(0) : mh4Var2, (i & 4) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return (AppConfig) z.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$1() {
        return Injector.get().getUserIdentity();
    }

    private final boolean isBotIntroEmpty(ConversationClientState conversationClientState) {
        ComposerSuggestions composerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
        List<ComposerSuggestions.Suggestion> suggestions = null;
        List<Part.Builder> parts = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null) ? null : newConversationData.getParts();
        if (parts != null && !parts.isEmpty()) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        if (openMessengerResponse2 != null && (composerSuggestions = openMessengerResponse2.getComposerSuggestions()) != null) {
            suggestions = composerSuggestions.getSuggestions();
        }
        return suggestions == null || suggestions.isEmpty();
    }

    private final Part toArticlePart(ArticleMetadata articleMetadata) {
        Part partBuild = new Part.Builder().withIsInitialMessage(Boolean.TRUE).withBlocks(ws0.h(new Block.Builder().withArticleId(articleMetadata.getId()).withTitle(articleMetadata.getTitle()))).build();
        partBuild.getClass();
        return partBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [hf3] */
    public final ConversationUiState computeUiState$intercom_sdk_base_release(ConversationClientState conversationClientState) {
        ?? r3;
        FooterNotice footerNotice;
        List<Avatar.Builder> avatars;
        boolean z;
        ActiveBot activeBot;
        StreamingPart streamingPart;
        List<Part> listParts;
        List<Part> listParts2;
        OpenMessengerResponse openMessengerResponse;
        ComposerSuggestions composerSuggestions;
        ContentRow contentRowReduceComposerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        conversationClientState.getClass();
        Conversation conversation = conversationClientState.getConversation();
        String conversationId = conversationClientState.getConversationId();
        NetworkResponse<Object> lastNetworkCall = conversationClientState.getLastNetworkCall();
        boolean z2 = false;
        boolean z3 = conversation == null && conversationId != null;
        boolean z4 = conversation == null && conversationId == null;
        boolean z5 = z4 && (conversationClientState.getArticleMetadata() != null) && isBotIntroEmpty(conversationClientState);
        boolean z6 = z4 && conversationClientState.getOpenMessengerResponse() == null;
        TeamPresenceState teamPresenceStateReduceTeamPresenceState = TeamPresenceReducerKt.reduceTeamPresenceState(conversationClientState.getConversation(), conversationClientState.getOpenMessengerResponse());
        boolean z7 = !conversationClientState.getPendingMessages().isEmpty();
        Conversation conversation2 = conversationClientState.getConversation();
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        qq2 qq2Var = null;
        TopAppBarUiState topAppBarUiStateReduceTopAppBarUiState = HeaderReducerKt.reduceTopAppBarUiState(z4, z7, conversation2, (openMessengerResponse2 == null || (newConversationData = openMessengerResponse2.getNewConversationData()) == null) ? null : newConversationData.getHeader(), this.config.invoke(), conversationClientState.getUnreadConversationsCount(), conversationClientState.getUnreadTicketsCount(), conversationClientState.getLaunchMode(), conversationClientState.getPushNotificationsBannerState());
        if (lastNetworkCall != null && !(lastNetworkCall instanceof NetworkResponse.Success)) {
            return ErrorReducerKt.reduceError(lastNetworkCall, topAppBarUiStateReduceTopAppBarUiState);
        }
        if (z3 || z6) {
            return LoadingStateReducerKt.reduceLoadingState(topAppBarUiStateReduceTopAppBarUiState);
        }
        NetworkState networkState = conversationClientState.getNetworkState();
        BottomSheetState bottomSheetState = conversationClientState.getBottomSheetState();
        BottomBarUiState bottomBarUiStateReduceComposerState = ComposerStateReducerKt.reduceComposerState(conversationClientState, this.config.invoke(), z4);
        e96 e96VarF = ws0.f();
        if (!z2a.w(teamPresenceStateReduceTeamPresenceState.getTeamIntro())) {
            e96VarF.add(new ContentRow.TeamIntroRow(teamPresenceStateReduceTeamPresenceState.getTeamIntro()));
        }
        if (!z2a.w(teamPresenceStateReduceTeamPresenceState.getSpecialNotice())) {
            e96VarF.add(new ContentRow.SpecialNoticeRow(teamPresenceStateReduceTeamPresenceState.getSpecialNotice()));
        }
        if (z5 && conversationClientState.getArticleMetadata() != null) {
            e96VarF.add(new ContentRow.AskedAboutRow(toArticlePart(conversationClientState.getArticleMetadata())));
        }
        if (z4) {
            e96VarF.addAll(IntroPartsReducerKt.reduceIntroParts(conversationClientState));
        }
        e96VarF.addAll(ConversationPartsReducerKt.reduceMessages(conversationClientState, this.userIdentity.invoke(), this.config.invoke()));
        if (z4 && conversationClientState.getPendingMessages().isEmpty() && (openMessengerResponse = conversationClientState.getOpenMessengerResponse()) != null && (composerSuggestions = openMessengerResponse.getComposerSuggestions()) != null && (contentRowReduceComposerSuggestions = ComposerSuggestionsReducerKt.reduceComposerSuggestions(composerSuggestions)) != null) {
            e96VarF.add(contentRowReduceComposerSuggestions);
        }
        Conversation conversation3 = conversationClientState.getConversation();
        ?? arrayList = hf3.t;
        if (conversation3 == null || (listParts2 = conversation3.parts()) == null) {
            r3 = listParts2;
            r3 = arrayList;
        }
        r3 = listParts2;
        Collection<PendingMessage> collectionValues = conversationClientState.getPendingMessages().values();
        ArrayList arrayList2 = new ArrayList(ph1.n(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PendingMessage) it.next()).getPart());
        }
        ArrayList arrayListK = th1.K(r3, arrayList2);
        Conversation conversation4 = conversationClientState.getConversation();
        int size = (conversation4 == null || (listParts = conversation4.parts()) == null) ? 0 : listParts.size();
        int i = 0;
        for (Object obj : conversationClientState.getPendingMessages().values()) {
            int i2 = i + 1;
            if (i < 0) {
                ?? r18 = qq2Var;
                ws0.m();
                throw r18;
            }
            PendingMessage pendingMessage = (PendingMessage) obj;
            qq2 qq2Var2 = qq2Var;
            e96VarF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(pendingMessage.getPart(), i == conversationClientState.getPendingMessages().size() + (-1), ConversationPartsReducerKt.isAdminOrAltParticipant(pendingMessage.getPart(), this.userIdentity.invoke()), null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(arrayListK, size + i), pendingMessage.getFailedMediaUploadData(), pendingMessage.isFailed(), true));
            i = i2;
            qq2Var = qq2Var2;
        }
        qq2 qq2Var3 = qq2Var;
        if (conversation != null) {
            List<Part> listParts3 = conversation.parts();
            if (listParts3 != null && listParts3.isEmpty()) {
                z = false;
                break;
            }
            Iterator it2 = listParts3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                Part part = (Part) it2.next();
                String uuid = part.getUuid();
                uuid.getClass();
                if (!z2a.w(uuid) && xj5.a(part.getUuid(), conversationClientState.getFinStreamingData().getClientAssignedUUID())) {
                    z = true;
                    break;
                }
            }
            if (conversationClientState.getFinStreamingData().isFinStreaming() && !z && (activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot()) != null && (streamingPart = activeBot.getStreamingPart()) != null) {
                e96VarF.add(new ContentRow.FinStreamingRow(conversationClientState.getFinStreamingData().getBlocks(), streamingPart));
            }
        }
        if (conversationClientState.getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
            e96VarF.add(new ContentRow.TypingIndicatorRow(conversationClientState.getCurrentlyTypingState()));
        }
        if (conversation != null && (footerNotice = conversation.getFooterNotice()) != null) {
            String title = footerNotice.getTitle();
            String subtitle = footerNotice.getSubtitle();
            if (subtitle == null) {
                subtitle = BuildConfig.FLAVOR;
            }
            AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
            if (avatarDetails != null && (avatars = avatarDetails.getAvatars()) != null) {
                arrayList = new ArrayList(ph1.n(avatars, 10));
                Iterator it3 = avatars.iterator();
                while (it3.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it3.next()).build();
                    avatarBuild.getClass();
                    arrayList.add(new AvatarWrapper(avatarBuild, z2, 2, qq2Var3));
                }
            }
            e96VarF.add(new ContentRow.FooterNoticeRow(new FooterNoticeState(title, subtitle, arrayList)));
        }
        return new ConversationUiState.Content(topAppBarUiStateReduceTopAppBarUiState, ws0.e(e96VarF), bottomBarUiStateReduceComposerState, networkState, bottomSheetState, conversationClientState.getFloatingIndicatorState(), teamPresenceStateReduceTeamPresenceState, conversationClientState.getVoiceTranscriptionState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationReducer(mh4<AppConfig> mh4Var, mh4<? extends UserIdentity> mh4Var2, IntercomDataLayer intercomDataLayer) {
        mh4Var.getClass();
        mh4Var2.getClass();
        intercomDataLayer.getClass();
        this.config = mh4Var;
        this.userIdentity = mh4Var2;
        this.intercomDataLayer = intercomDataLayer;
    }

    public ConversationReducer() {
        this(null, null, null, 7, null);
    }
}
