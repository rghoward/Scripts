package io.intercom.android.sdk.m5.conversation.reducers;

import com.intercom.twig.BuildConfig;
import defpackage.e96;
import defpackage.th1;
import defpackage.ws0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.PrivacyNotice;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerStateReducerKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationEndedButton.Reason.values().length];
            try {
                iArr[ConversationEndedButton.Reason.MERGED_INTO_CONVERSATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final BottomBarUiState.BottomBadgeState reduceBottomBadge(ConversationClientState conversationClientState) {
        PoweredBy poweredBy;
        if (conversationClientState.getConversation() == null) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            poweredBy = openMessengerResponse != null ? openMessengerResponse.getPoweredBy() : null;
        } else {
            poweredBy = conversationClientState.getConversation().getPoweredBy();
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        PrivacyNotice privacyNotice = openMessengerResponse2 != null ? openMessengerResponse2.getPrivacyNotice() : null;
        if (privacyNotice == null || privacyNotice.isDismissed() || conversationClientState.hasUserSentAMessage$intercom_sdk_base_release() || conversationClientState.getDismissedPrivacyNotice()) {
            return poweredBy != null ? new BottomBarUiState.BottomBadgeState.PoweredByBadgeState(poweredBy) : BottomBarUiState.BottomBadgeState.None.INSTANCE;
        }
        return new BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState(privacyNotice.getText());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v13, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions] */
    /* JADX WARN: Type inference failed for: r14v17, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded] */
    /* JADX WARN: Type inference failed for: r14v28, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r14v29, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r14v30, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden] */
    public static final BottomBarUiState reduceComposerState(ConversationClientState conversationClientState, AppConfig appConfig, boolean z) {
        ComposerState.ConversationEnded.ConversationEndedCta conversationEndedCta;
        boolean z2;
        ComposerState hidden;
        ?? reactions;
        ComposerState composerStateCopy$default;
        OpenMessengerResponse.NewConversationData newConversationData;
        io.intercom.android.sdk.models.ComposerState composerState;
        ComposerSuggestions composerSuggestions;
        conversationClientState.getClass();
        appConfig.getClass();
        Conversation conversation = conversationClientState.getConversation();
        placeholder = null;
        String placeholder = null;
        if (conversation == null) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            if (openMessengerResponse == null || (composerSuggestions = openMessengerResponse.getComposerSuggestions()) == null || !composerSuggestions.isComposerDisabled()) {
                ComposerState composerState2 = conversationClientState.getComposerState();
                OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
                if (openMessengerResponse2 != null && (composerState = openMessengerResponse2.getComposerState()) != null) {
                    placeholder = composerState.getPlaceholder();
                }
                reactions = reduceTextInput(composerState2, z, placeholder, false, reduceTextInputButtons(appConfig), conversationClientState.getMediaUploadItems());
            } else {
                reactions = new ComposerState.Hidden(false, 1, null);
            }
        } else {
            boolean z3 = AppConfigExtensionsKt.canStartNewConversation(appConfig) && !conversation.getInboundConversationsDisabled();
            OpenMessengerResponse openMessengerResponse3 = conversationClientState.getOpenMessengerResponse();
            OpenMessengerResponse.NewConversationData.Cta cta = (openMessengerResponse3 == null || (newConversationData = openMessengerResponse3.getNewConversationData()) == null) ? null : newConversationData.getCta();
            if (!z3 || cta == null) {
                conversationEndedCta = null;
            } else {
                StringProvider.ActualString actualString = new StringProvider.ActualString(cta.getText());
                Integer icon = cta.getIcon().getIcon();
                conversationEndedCta = new ComposerState.ConversationEnded.ConversationEndedCta(actualString, icon != null ? icon.intValue() : R.drawable.intercom_send_message_icon, null, 4, null);
            }
            boolean zIsNull = ReactionReply.isNull(conversation.lastPart().getReactionReply());
            if (conversation.getPreventEndUserReplies()) {
                reactions = new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), conversationEndedCta);
                ConversationEndedButton conversationEndedButton = conversation.getConversationEndedButton();
                if (conversationEndedButton != null) {
                    if (WhenMappings.$EnumSwitchMapping$0[conversationEndedButton.getReason().ordinal()] == 1) {
                        hidden = reactions.copy(new StringProvider.ActualString(conversationEndedButton.getMessage()), conversationEndedButton.getMetadata() != null ? new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString(conversationEndedButton.getCtaTitle()), R.drawable.intercom_send_message_icon, conversationEndedButton.getMetadata().getMergedIntoConversationId()) : null);
                    } else {
                        composerStateCopy$default = ComposerState.ConversationEnded.copy$default(reactions, new StringProvider.ActualString(conversationEndedButton.getMessage()), null, 2, null);
                    }
                    if (hidden != null) {
                        hidden = composerStateCopy$default;
                        reactions = hidden;
                    }
                }
            } else if (conversation.getComposerState().isVisible() && zIsNull) {
                reactions = reduceTextInput(conversationClientState.getComposerState(), z, conversation.getComposerState().getPlaceholder(), conversation.getComposerState().isDisabled(), reduceTextInputButtons(appConfig), conversationClientState.getMediaUploadItems());
            } else if (zIsNull) {
                List<Part> listParts = conversation.parts();
                if (listParts != null && listParts.isEmpty()) {
                    z2 = false;
                    break;
                }
                Iterator it = listParts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((Part) it.next()).getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR) {
                        z2 = true;
                        break;
                    }
                }
                hidden = new ComposerState.Hidden(!z2);
                hidden = composerStateCopy$default;
                reactions = hidden;
            } else {
                ReactionReply reactionReply = conversation.lastPart().getReactionReply();
                reactionReply.getClass();
                String id = conversation.lastPart().getId();
                id.getClass();
                reactions = new ComposerState.Reactions(reactionReply, id, conversation.getId());
            }
        }
        hidden = composerStateCopy$default;
        CurrentlyTypingState currentlyTypingState = conversationClientState.getCurrentlyTypingState();
        boolean mediaEnabled = appConfig.getAttachmentSettings().getMediaEnabled();
        boolean gifsEnabled = appConfig.getAttachmentSettings().getGifsEnabled();
        boolean cameraEnabled = appConfig.getAttachmentSettings().getCameraEnabled();
        boolean filesEnabled = appConfig.getAttachmentSettings().getFilesEnabled();
        Set<String> trustedFileExtensions = appConfig.getAttachmentSettings().getTrustedFileExtensions();
        int i = 10;
        if (reactions instanceof ComposerState.TextInput) {
            int size = 10 - ((ComposerState.TextInput) reactions).getMediaUploadItems().size();
            i = size >= 0 ? size : 0;
        }
        return new BottomBarUiState(reactions, currentlyTypingState, new InputTypeState(mediaEnabled, gifsEnabled, cameraEnabled, filesEnabled, trustedFileExtensions, i), reduceBottomBadge(conversationClientState));
    }

    private static final ComposerState reduceTextInput(ComposerState composerState, boolean z, String str, boolean z2, List<? extends BottomBarUiState.BottomBarButton> list, List<MediaUploadItem> list2) {
        if (!(composerState instanceof ComposerState.TextInput)) {
            return composerState;
        }
        List<MediaUploadItem> listSortMediaItemsWithFailedFirst = sortMediaItemsWithFailedFirst(list2);
        ComposerState.TextInput textInput = (ComposerState.TextInput) composerState;
        return ComposerState.TextInput.copy$default(textInput, z ? textInput.getInitialMessage() : BuildConfig.FLAVOR, str != null ? new StringProvider.ActualString(str) : new StringProvider.StringRes(R.string.intercom_message_placeholder, null, 2, null), z2, list, listSortMediaItemsWithFailedFirst, null, 32, null);
    }

    private static final List<BottomBarUiState.BottomBarButton> reduceTextInputButtons(AppConfig appConfig) {
        e96 e96VarF = ws0.f();
        if (appConfig.getAttachmentSettings().getMediaEnabled() || appConfig.getAttachmentSettings().getCameraEnabled() || appConfig.getAttachmentSettings().getFilesEnabled()) {
            e96VarF.add(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE);
        }
        if (appConfig.getAttachmentSettings().getGifsEnabled()) {
            e96VarF.add(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE);
        }
        if (appConfig.getAttachmentSettings().getVoiceNotesEnabled()) {
            e96VarF.add(BottomBarUiState.BottomBarButton.VoiceNotesInsert.INSTANCE);
        }
        return ws0.e(e96VarF);
    }

    private static final List<MediaUploadItem> sortMediaItemsWithFailedFirst(List<MediaUploadItem> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((MediaUploadItem) obj).isError()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return th1.K(arrayList, arrayList2);
    }
}
