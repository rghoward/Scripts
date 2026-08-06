package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.qq2;
import defpackage.r02;
import defpackage.u02;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SendQuickReplyUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase", f = "SendQuickReplyUseCase.kt", l = {37, 54}, m = "invoke")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendQuickReplyUseCase.this.invoke(null, null, null, this);
        }
    }

    public SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity) {
        conversationRepository.getClass();
        refreshConversationUseCase.getClass();
        soundEffectsUseCase.getClass();
        userIdentity.getClass();
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r10.invoke(r11, r12, r6) == r9) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r11, io.intercom.android.sdk.models.ReplyOption r12, io.intercom.android.sdk.models.Part r13, defpackage.r02<? super defpackage.g2b> r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase.invoke(i37, io.intercom.android.sdk.models.ReplyOption, io.intercom.android.sdk.models.Part, r02):java.lang.Object");
    }

    public /* synthetic */ SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, int i, qq2 qq2Var) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity);
    }
}
