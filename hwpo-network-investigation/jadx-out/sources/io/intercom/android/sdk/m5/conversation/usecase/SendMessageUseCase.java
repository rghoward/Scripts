package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.r02;
import defpackage.th1;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SendMessageUseCase {
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final AtomicBoolean newConversationRequestPending;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {76, 103, 127, 132, 149}, m = "invoke")
    public static final class AnonymousClass2 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageUseCase.this.invoke(null, null, null, this);
        }
    }

    public SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer) {
        conversationRepository.getClass();
        refreshConversationUseCase.getClass();
        soundEffectsUseCase.getClass();
        userIdentity.getClass();
        intercomDataLayer.getClass();
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.newConversationRequestPending = new AtomicBoolean(false);
    }

    public static /* synthetic */ Object invoke$default(SendMessageUseCase sendMessageUseCase, i37 i37Var, String str, List list, String str2, r02 r02Var, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        return sendMessageUseCase.invoke(i37Var, str, list, str2, r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0273  */
    /* JADX WARN: Code duplicated, block: B:103:0x027b  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0220  */
    /* JADX WARN: Code duplicated, block: B:84:0x022c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:96:0x025d  */
    public final Object invoke(i37<ConversationClientState> i37Var, List<Block.Builder> list, String str, r02<? super g2b> r02Var) throws Throwable {
        AnonymousClass2 anonymousClass2;
        v72 v72Var;
        String conversationId;
        Object objL;
        v72 v72Var2;
        ComposerSuggestions composerSuggestions;
        ComposerSuggestions composerSuggestions2;
        NetworkResponse networkResponse;
        SendMessageUseCase sendMessageUseCase;
        i37<ConversationClientState> i37Var2;
        ConversationResponse conversationResponse;
        String str2;
        ConversationClientState value;
        LinkedHashMap linkedHashMapM;
        List<Block.Builder> list2;
        String str3;
        String str4;
        Conversation conversation;
        Long l;
        Object objReplyToConversation;
        SendMessageUseCase sendMessageUseCase2;
        String str5;
        List<Part> listParts;
        Part partPrevious;
        NetworkResponse networkResponse2;
        SendMessageUseCase sendMessageUseCase3 = this;
        i37<ConversationClientState> i37Var3 = i37Var;
        List<Block.Builder> list3 = list;
        String str6 = str;
        if (r02Var instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) r02Var;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = sendMessageUseCase3.new AnonymousClass2(r02Var);
            }
        } else {
            anonymousClass2 = sendMessageUseCase3.new AnonymousClass2(r02Var);
        }
        AnonymousClass2 anonymousClass3 = anonymousClass2;
        Object objCreateNewConversation = anonymousClass3.result;
        int i2 = anonymousClass3.label;
        v72 v72Var3 = v72.t;
        if (i2 == 0) {
            dv8.b(objCreateNewConversation);
            Companion.addBlocksToPendingMessages(i37Var3, list3, str6, sendMessageUseCase3.userIdentity);
            if (i37Var3.getValue().getConversationId() == null && sendMessageUseCase3.newConversationRequestPending.compareAndSet(false, true)) {
                OpenMessengerResponse openMessengerResponse = i37Var3.getValue().getOpenMessengerResponse();
                ConversationRepository conversationRepository = sendMessageUseCase3.conversationRepository;
                String botIntroId = openMessengerResponse != null ? openMessengerResponse.getBotIntroId() : null;
                ArticleMetadata articleMetadata = i37Var3.getValue().getArticleMetadata();
                String id = articleMetadata != null ? articleMetadata.getId() : null;
                String resolutionBotBehaviorVersionId = openMessengerResponse != null ? openMessengerResponse.getResolutionBotBehaviorVersionId() : null;
                List<ComposerSuggestions.Suggestion> suggestions = (openMessengerResponse == null || (composerSuggestions2 = openMessengerResponse.getComposerSuggestions()) == null) ? null : composerSuggestions2.getSuggestions();
                Long snapshotId = (openMessengerResponse == null || (composerSuggestions = openMessengerResponse.getComposerSuggestions()) == null) ? null : composerSuggestions.getSnapshotId();
                String requestId = openMessengerResponse != null ? openMessengerResponse.getRequestId() : null;
                anonymousClass3.L$0 = sendMessageUseCase3;
                anonymousClass3.L$1 = i37Var3;
                anonymousClass3.L$2 = str6;
                anonymousClass3.label = 1;
                List<ComposerSuggestions.Suggestion> list4 = suggestions;
                v72Var2 = v72Var3;
                objCreateNewConversation = conversationRepository.createNewConversation(list3, botIntroId, id, resolutionBotBehaviorVersionId, list4, snapshotId, requestId, str6, anonymousClass3);
                if (objCreateNewConversation != v72Var2) {
                    networkResponse = (NetworkResponse) objCreateNewConversation;
                    if (networkResponse instanceof NetworkResponse.ClientError) {
                    }
                    sendMessageUseCase3.newConversationRequestPending.set(false);
                    sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                    Companion.updateFailedPendingMessages(i37Var3, str6);
                }
                return v72Var2;
            }
            v72Var = v72Var3;
            conversationId = i37Var3.getValue().getConversationId();
            if (conversationId == null) {
                SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(null);
                anonymousClass3.L$0 = sendMessageUseCase3;
                anonymousClass3.L$1 = i37Var3;
                anonymousClass3.L$2 = list3;
                anonymousClass3.L$3 = str6;
                anonymousClass3.label = 3;
                objL = yk2.l(i37Var3, sendMessageUseCase$invoke$conversationId$1, anonymousClass3);
                if (objL == v72Var) {
                    return v72Var;
                }
                conversationId = ((ConversationClientState) objL).getConversationId();
                list2 = list3;
                str3 = conversationId;
                str4 = str6;
                if (str3 != null) {
                    conversation = i37Var3.getValue().getConversation();
                    if (conversation != null) {
                        l = null;
                    } else {
                        l = null;
                    }
                    ConversationRepository conversationRepository2 = sendMessageUseCase3.conversationRepository;
                    anonymousClass3.L$0 = sendMessageUseCase3;
                    anonymousClass3.L$1 = i37Var3;
                    anonymousClass3.L$2 = str4;
                    anonymousClass3.L$3 = null;
                    anonymousClass3.label = 4;
                    objReplyToConversation = conversationRepository2.replyToConversation(str3, str4, list2, l, anonymousClass3);
                    if (objReplyToConversation == v72Var) {
                        return v72Var;
                    }
                    sendMessageUseCase2 = sendMessageUseCase3;
                    str5 = str4;
                    networkResponse2 = (NetworkResponse) objReplyToConversation;
                    if (networkResponse2 instanceof NetworkResponse.ClientError) {
                        sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        Companion.updateFailedPendingMessages(i37Var3, str5);
                    } else {
                        sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        Companion.updateFailedPendingMessages(i37Var3, str5);
                    }
                }
            } else {
                list2 = list3;
                str3 = conversationId;
                str4 = str6;
                if (str3 != null) {
                    conversation = i37Var3.getValue().getConversation();
                    if (conversation != null) {
                        l = null;
                    } else {
                        l = null;
                    }
                    ConversationRepository conversationRepository3 = sendMessageUseCase3.conversationRepository;
                    anonymousClass3.L$0 = sendMessageUseCase3;
                    anonymousClass3.L$1 = i37Var3;
                    anonymousClass3.L$2 = str4;
                    anonymousClass3.L$3 = null;
                    anonymousClass3.label = 4;
                    objReplyToConversation = conversationRepository3.replyToConversation(str3, str4, list2, l, anonymousClass3);
                    if (objReplyToConversation == v72Var) {
                        return v72Var;
                    }
                    sendMessageUseCase2 = sendMessageUseCase3;
                    str5 = str4;
                    networkResponse2 = (NetworkResponse) objReplyToConversation;
                    if (networkResponse2 instanceof NetworkResponse.ClientError) {
                        sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        Companion.updateFailedPendingMessages(i37Var3, str5);
                    } else {
                        sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        Companion.updateFailedPendingMessages(i37Var3, str5);
                    }
                }
            }
        } else if (i2 == 1) {
            String str7 = (String) anonymousClass3.L$2;
            i37Var3 = (i37) anonymousClass3.L$1;
            SendMessageUseCase sendMessageUseCase4 = (SendMessageUseCase) anonymousClass3.L$0;
            dv8.b(objCreateNewConversation);
            str6 = str7;
            sendMessageUseCase3 = sendMessageUseCase4;
            v72Var2 = v72Var3;
            networkResponse = (NetworkResponse) objCreateNewConversation;
            if ((networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    u.b();
                    return null;
                }
                sendMessageUseCase3.newConversationRequestPending.set(false);
                sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                ConversationResponse conversationResponseBuild = ((ConversationResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                IntercomDataLayer intercomDataLayer = sendMessageUseCase3.intercomDataLayer;
                IntercomEvent.NewConversation newConversation = new IntercomEvent.NewConversation(conversationResponseBuild.getConversation());
                anonymousClass3.L$0 = sendMessageUseCase3;
                anonymousClass3.L$1 = i37Var3;
                anonymousClass3.L$2 = str6;
                anonymousClass3.L$3 = conversationResponseBuild;
                anonymousClass3.label = 2;
                if (intercomDataLayer.emitEvent(newConversation, anonymousClass3) != v72Var2) {
                    sendMessageUseCase = sendMessageUseCase3;
                    i37Var2 = i37Var3;
                    conversationResponse = conversationResponseBuild;
                    str2 = str6;
                    IntercomDataLayer intercomDataLayer2 = sendMessageUseCase.intercomDataLayer;
                    Config config = conversationResponse.getConfig();
                    config.getClass();
                    intercomDataLayer2.updateConfig(config);
                    do {
                        value = i37Var2.getValue();
                        linkedHashMapM = qi6.m(i37Var2.getValue().getPendingMessages());
                        linkedHashMapM.remove(str2);
                    } while (!i37Var2.c(value, ConversationClientState.copy$default(value, linkedHashMapM, conversationResponse.getConversation(), conversationResponse.getConversation().getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388600, null)));
                }
                return v72Var2;
            }
            sendMessageUseCase3.newConversationRequestPending.set(false);
            sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
            Companion.updateFailedPendingMessages(i37Var3, str6);
        } else if (i2 == 2) {
            conversationResponse = (ConversationResponse) anonymousClass3.L$3;
            str2 = (String) anonymousClass3.L$2;
            i37Var2 = (i37) anonymousClass3.L$1;
            sendMessageUseCase = (SendMessageUseCase) anonymousClass3.L$0;
            dv8.b(objCreateNewConversation);
            IntercomDataLayer intercomDataLayer3 = sendMessageUseCase.intercomDataLayer;
            Config config2 = conversationResponse.getConfig();
            config2.getClass();
            intercomDataLayer3.updateConfig(config2);
            do {
                value = i37Var2.getValue();
                linkedHashMapM = qi6.m(i37Var2.getValue().getPendingMessages());
                linkedHashMapM.remove(str2);
            } while (!i37Var2.c(value, ConversationClientState.copy$default(value, linkedHashMapM, conversationResponse.getConversation(), conversationResponse.getConversation().getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388600, null)));
        } else if (i2 == 3) {
            String str8 = (String) anonymousClass3.L$3;
            List<Block.Builder> list5 = (List) anonymousClass3.L$2;
            i37<ConversationClientState> i37Var4 = (i37) anonymousClass3.L$1;
            SendMessageUseCase sendMessageUseCase5 = (SendMessageUseCase) anonymousClass3.L$0;
            dv8.b(objCreateNewConversation);
            list3 = list5;
            i37Var3 = i37Var4;
            str6 = str8;
            sendMessageUseCase3 = sendMessageUseCase5;
            objL = objCreateNewConversation;
            v72Var = v72Var3;
            conversationId = ((ConversationClientState) objL).getConversationId();
            list2 = list3;
            str3 = conversationId;
            str4 = str6;
            if (str3 != null) {
                conversation = i37Var3.getValue().getConversation();
                if (conversation != null || (listParts = conversation.parts()) == null) {
                    l = null;
                } else {
                    ListIterator<Part> listIterator = listParts.listIterator(listParts.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            partPrevious = null;
                            break;
                        }
                        partPrevious = listIterator.previous();
                    } while (!partPrevious.isAdmin());
                    Part part = partPrevious;
                    if (part != null) {
                        l = new Long(part.getCreatedAt());
                    } else {
                        l = null;
                    }
                }
                ConversationRepository conversationRepository4 = sendMessageUseCase3.conversationRepository;
                anonymousClass3.L$0 = sendMessageUseCase3;
                anonymousClass3.L$1 = i37Var3;
                anonymousClass3.L$2 = str4;
                anonymousClass3.L$3 = null;
                anonymousClass3.label = 4;
                objReplyToConversation = conversationRepository4.replyToConversation(str3, str4, list2, l, anonymousClass3);
                if (objReplyToConversation == v72Var) {
                    return v72Var;
                }
                sendMessageUseCase2 = sendMessageUseCase3;
                str5 = str4;
                networkResponse2 = (NetworkResponse) objReplyToConversation;
                if (networkResponse2 instanceof NetworkResponse.ClientError) {
                    sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                    Companion.updateFailedPendingMessages(i37Var3, str5);
                } else {
                    sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                    Companion.updateFailedPendingMessages(i37Var3, str5);
                }
            }
        } else if (i2 == 4) {
            str5 = (String) anonymousClass3.L$2;
            i37Var3 = (i37) anonymousClass3.L$1;
            SendMessageUseCase sendMessageUseCase6 = (SendMessageUseCase) anonymousClass3.L$0;
            dv8.b(objCreateNewConversation);
            sendMessageUseCase2 = sendMessageUseCase6;
            objReplyToConversation = objCreateNewConversation;
            v72Var = v72Var3;
            networkResponse2 = (NetworkResponse) objReplyToConversation;
            if ((networkResponse2 instanceof NetworkResponse.ClientError) || (networkResponse2 instanceof NetworkResponse.NetworkError) || (networkResponse2 instanceof NetworkResponse.ServerError)) {
                sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                Companion.updateFailedPendingMessages(i37Var3, str5);
            } else {
                if (!(networkResponse2 instanceof NetworkResponse.Success)) {
                    u.b();
                    return null;
                }
                sendMessageUseCase2.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                RefreshConversationUseCase refreshConversationUseCase = sendMessageUseCase2.refreshConversationUseCase;
                GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                anonymousClass3.L$0 = null;
                anonymousClass3.L$1 = null;
                anonymousClass3.L$2 = null;
                anonymousClass3.label = 5;
                if (refreshConversationUseCase.invoke(i37Var3, getConversationReason, anonymousClass3) == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i2 != 5) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objCreateNewConversation);
        }
        return g2b.a;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final void addBlocksToPendingMessages(i37<ConversationClientState> i37Var, List<Block.Builder> list, String str, UserIdentity userIdentity) {
            ConversationClientState value;
            ConversationClientState conversationClientState;
            LinkedHashMap linkedHashMap;
            i37Var.getClass();
            list.getClass();
            str.getClass();
            userIdentity.getClass();
            Part partBuild = new Part.Builder().withBlocks(list).withCreatedAt(TimeProvider.SYSTEM.currentTimeMillis() / 1000).withParticipantIsAdmin(false).withClientAssignedUuid(str).build();
            partBuild.setParticipant(new Participant.Builder().withId(userIdentity.getIntercomId()).build());
            partBuild.setMessageState(Part.MessageState.SENDING);
            do {
                value = i37Var.getValue();
                conversationClientState = value;
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                linkedHashMap.put(str, new PendingMessage(partBuild, false, null, 4, null));
            } while (!i37Var.c(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388606, null)));
        }

        public final void updateFailedPendingMessages(i37<ConversationClientState> i37Var, String str) {
            ConversationClientState value;
            ConversationClientState conversationClientState;
            LinkedHashMap linkedHashMapM;
            i37Var.getClass();
            str.getClass();
            do {
                value = i37Var.getValue();
                conversationClientState = value;
                linkedHashMapM = qi6.m(i37Var.getValue().getPendingMessages());
                PendingMessage pendingMessage = (PendingMessage) linkedHashMapM.get(str);
                if (pendingMessage != null) {
                    linkedHashMapM.put(str, PendingMessage.copy$default(pendingMessage, null, true, null, 5, null));
                }
            } while (!i37Var.c(value, ConversationClientState.copy$default(conversationClientState, linkedHashMapM, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388606, null)));
        }

        private Companion() {
        }
    }

    public static /* synthetic */ Object invoke$default(SendMessageUseCase sendMessageUseCase, i37 i37Var, List list, String str, r02 r02Var, int i, Object obj) {
        if ((i & 4) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMessageUseCase.invoke(i37Var, list, str, r02Var);
    }

    public /* synthetic */ SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    public final Object invoke(i37<ConversationClientState> i37Var, String str, List<MediaUploadItem> list, String str2, r02<? super g2b> r02Var) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Block.Builder uploadedBlock = ((MediaUploadItem) it.next()).getUploadedBlock();
            if (uploadedBlock != null) {
                arrayList.add(uploadedBlock);
            }
        }
        List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(z2a.R(str).toString());
        if (str.length() > 0 || !arrayList.isEmpty()) {
            blocksForText.getClass();
            Object objInvoke = invoke(i37Var, th1.K(arrayList, blocksForText), str2, r02Var);
            return objInvoke == v72.t ? objInvoke : g2b.a;
        }
        return g2b.a;
    }
}
