package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.if3;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SendSuggestionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase", f = "SendSuggestionUseCase.kt", l = {56}, m = "invoke")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendSuggestionUseCase.this.invoke(null, null, this);
        }
    }

    public SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity) {
        conversationRepository.getClass();
        soundEffectsUseCase.getClass();
        userIdentity.getClass();
        this.conversationRepository = conversationRepository;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object invoke(i37<ConversationClientState> i37Var, ReplySuggestion replySuggestion, r02<? super g2b> r02Var) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMap;
        ConversationClientState value2;
        SendSuggestionUseCase sendSuggestionUseCase = this;
        i37<ConversationClientState> i37Var2 = i37Var;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = sendSuggestionUseCase.new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = sendSuggestionUseCase.new AnonymousClass1(r02Var);
        }
        Object objCreateConversationFromSuggestion = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(objCreateConversationFromSuggestion);
            BlockFactory blockFactory = new BlockFactory(new TextSplittingStrategy());
            String string = UUID.randomUUID().toString();
            string.getClass();
            do {
                value = i37Var2.getValue();
                conversationClientState = value;
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                Part partBuild = new Part.Builder().withBlocks(blockFactory.getBlocksForText(replySuggestion.getText())).withClientAssignedUuid(string).build();
                partBuild.setParticipant(new Participant.Builder().withId(sendSuggestionUseCase.userIdentity.getIntercomId()).build());
                partBuild.setMessageState(Part.MessageState.SENDING);
                g2b g2bVar = g2b.a;
                linkedHashMap.put(string, new PendingMessage(partBuild, false, null, 4, null));
            } while (!i37Var2.c(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388606, null)));
            if (i37Var2.getValue().getConversation() == null) {
                ConversationRepository conversationRepository = sendSuggestionUseCase.conversationRepository;
                String id = replySuggestion.getId();
                OpenMessengerResponse openMessengerResponse = i37Var2.getValue().getOpenMessengerResponse();
                String requestId = openMessengerResponse != null ? openMessengerResponse.getRequestId() : null;
                anonymousClass1.L$0 = sendSuggestionUseCase;
                anonymousClass1.L$1 = i37Var2;
                anonymousClass1.label = 1;
                objCreateConversationFromSuggestion = conversationRepository.createConversationFromSuggestion(id, requestId, anonymousClass1);
                v72 v72Var = v72.t;
                if (objCreateConversationFromSuggestion == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i37<ConversationClientState> i37Var3 = (i37) anonymousClass1.L$1;
        SendSuggestionUseCase sendSuggestionUseCase2 = (SendSuggestionUseCase) anonymousClass1.L$0;
        dv8.b(objCreateConversationFromSuggestion);
        i37Var2 = i37Var3;
        sendSuggestionUseCase = sendSuggestionUseCase2;
        NetworkResponse networkResponse = (NetworkResponse) objCreateConversationFromSuggestion;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                u.b();
                return null;
            }
            sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
            Conversation conversation = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
            do {
                value2 = i37Var2.getValue();
            } while (!i37Var2.c(value2, ConversationClientState.copy$default(value2, if3.t, conversation, conversation.getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388600, null)));
        }
        return g2b.a;
    }

    public /* synthetic */ SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, int i, qq2 qq2Var) {
        this(conversationRepository, soundEffectsUseCase, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity);
    }
}
