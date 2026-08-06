package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.xm2;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1", f = "SendMessageUseCase.kt", l = {}, m = "invokeSuspend")
public final class SendMessageUseCase$invoke$conversationId$1 extends p6a implements ci4<ConversationClientState, r02<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public SendMessageUseCase$invoke$conversationId$1(r02<? super SendMessageUseCase$invoke$conversationId$1> r02Var) {
        super(2, r02Var);
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(r02Var);
        sendMessageUseCase$invoke$conversationId$1.L$0 = obj;
        return sendMessageUseCase$invoke$conversationId$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(ConversationClientState conversationClientState, r02<? super Boolean> r02Var) {
        return ((SendMessageUseCase$invoke$conversationId$1) create(conversationClientState, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label == 0) {
            dv8.b(obj);
            return Boolean.valueOf(((ConversationClientState) this.L$0).getConversationId() != null);
        }
        aa0.c("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
