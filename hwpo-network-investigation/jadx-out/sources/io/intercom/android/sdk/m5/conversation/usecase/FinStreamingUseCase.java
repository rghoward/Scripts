package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.bw2;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FinStreamingUseCase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase", f = "FinStreamingUseCase.kt", l = {17}, m = "invoke")
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
            return FinStreamingUseCase.this.invoke(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object invoke(i37<ConversationClientState> i37Var, ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming, r02<? super g2b> r02Var) {
        AnonymousClass1 anonymousClass1;
        i37<ConversationClientState> i37Var2;
        ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming2;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversation;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(obj);
            i37Var2 = i37Var;
            anonymousClass1.L$0 = i37Var2;
            finStreaming2 = finStreaming;
            anonymousClass1.L$1 = finStreaming2;
            anonymousClass1.label = 1;
            Object objB = bw2.b(100L, anonymousClass1);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            finStreaming2 = (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) anonymousClass1.L$1;
            i37<ConversationClientState> i37Var3 = (i37) anonymousClass1.L$0;
            dv8.b(obj);
            i37Var2 = i37Var3;
        }
        FinStreamingData finStreamingData = i37Var2.getValue().getFinStreamingData();
        if (xj5.a(finStreaming2.getClientAssignedUUID(), finStreamingData.getClientAssignedUUID()) && finStreaming2.getTokenSequenceIndex() < finStreamingData.getTokenSequenceIndex()) {
            return g2b.a;
        }
        do {
            value = i37Var2.getValue();
            conversationClientState = value;
            conversation = conversationClientState.getConversation();
        } while (!i37Var2.c(value, ConversationClientState.copy$default(conversationClientState, null, conversation != null ? Conversation.copy$default(conversation, null, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1966079, null) : null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, conversationClientState.getFinStreamingData().copy(true, finStreaming2.getBlocks(), finStreaming2.getClientAssignedUUID(), finStreaming2.getTokenSequenceIndex()), null, 0, 0, null, null, false, false, null, null, null, 8384501, null)));
        return g2b.a;
    }
}
