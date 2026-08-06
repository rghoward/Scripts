package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.i37;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u02;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenConversationUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase", f = "OpenConversationUseCase.kt", l = {24, 42, 46}, m = "invoke")
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
            return OpenConversationUseCase.this.invoke(null, null, this);
        }
    }

    public /* synthetic */ OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository, int i, qq2 qq2Var) {
        if ((i & 4) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            messengerApi.getClass();
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            dataLayer.getClass();
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
        this(refreshConversationUseCase, refreshUnreadConversationsCountUseCase, commonRepository);
    }

    public static /* synthetic */ Object invoke$default(OpenConversationUseCase openConversationUseCase, i37 i37Var, GetConversationReason getConversationReason, r02 r02Var, int i, Object obj) {
        if ((i & 2) != 0) {
            getConversationReason = GetConversationReason.OPEN_CONVERSATION;
        }
        return openConversationUseCase.invoke(i37Var, getConversationReason, r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r1.invoke(r0, r2) == r8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r38, io.intercom.android.sdk.m5.conversation.data.GetConversationReason r39, defpackage.r02<? super defpackage.g2b> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase.invoke(i37, io.intercom.android.sdk.m5.conversation.data.GetConversationReason, r02):java.lang.Object");
    }

    public OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository) {
        refreshConversationUseCase.getClass();
        refreshUnreadConversationsCountUseCase.getClass();
        commonRepository.getClass();
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.commonRepository = commonRepository;
    }
}
