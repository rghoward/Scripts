package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.UsersResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RefreshUnreadConversationsCountUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final IntercomDataLayer intercomDataLayer;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase", f = "RefreshUnreadConversationsCountUseCase.kt", l = {21}, m = "invoke")
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
            return RefreshUnreadConversationsCountUseCase.this.invoke(null, this);
        }
    }

    public /* synthetic */ RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        if ((i & 1) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            messengerApi.getClass();
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            dataLayer.getClass();
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
        this(commonRepository, (i & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(i37<ConversationClientState> i37Var, r02<? super g2b> r02Var) {
        AnonymousClass1 anonymousClass1;
        i37<ConversationClientState> i37Var2;
        ConversationClientState value;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase = this;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = refreshUnreadConversationsCountUseCase.new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = refreshUnreadConversationsCountUseCase.new AnonymousClass1(r02Var);
        }
        Object objFetchUnreadCounts = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(objFetchUnreadCounts);
            if (i37Var.getValue().getLaunchMode() == LaunchMode.PROGRAMMATIC) {
                CommonRepository commonRepository = refreshUnreadConversationsCountUseCase.commonRepository;
                anonymousClass1.L$0 = refreshUnreadConversationsCountUseCase;
                i37Var2 = i37Var;
                anonymousClass1.L$1 = i37Var2;
                anonymousClass1.label = 1;
                objFetchUnreadCounts = commonRepository.fetchUnreadCounts(anonymousClass1);
                v72 v72Var = v72.t;
                if (objFetchUnreadCounts == v72Var) {
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
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = (RefreshUnreadConversationsCountUseCase) anonymousClass1.L$0;
        dv8.b(objFetchUnreadCounts);
        i37Var2 = i37Var3;
        refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase2;
        UsersResponse usersResponse = (UsersResponse) objFetchUnreadCounts;
        if (usersResponse == null) {
            return g2b.a;
        }
        IntercomDataLayer intercomDataLayer = refreshUnreadConversationsCountUseCase.intercomDataLayer;
        Config config = usersResponse.getConfig();
        config.getClass();
        intercomDataLayer.updateConfig(config);
        do {
            value = i37Var2.getValue();
        } while (!i37Var2.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, usersResponse.getUnreadConversations().getUnreadConversationsCount(), usersResponse.getUnreadTickets().getTotalCount(), null, null, false, false, null, null, null, 8339455, null)));
        return g2b.a;
    }

    public RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer) {
        commonRepository.getClass();
        intercomDataLayer.getClass();
        this.commonRepository = commonRepository;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshUnreadConversationsCountUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
