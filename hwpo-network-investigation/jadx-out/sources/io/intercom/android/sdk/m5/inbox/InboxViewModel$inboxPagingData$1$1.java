package io.intercom.android.sdk.m5.inbox;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.OpenMessengerResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$inboxPagingData$1$1", f = "InboxViewModel.kt", l = {76}, m = "invokeSuspend")
public final class InboxViewModel$inboxPagingData$1$1 extends p6a implements ci4<EmptyState, r02<? super g2b>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$inboxPagingData$1$1(InboxViewModel inboxViewModel, r02<? super InboxViewModel$inboxPagingData$1$1> r02Var) {
        super(2, r02Var);
        this.this$0 = inboxViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        InboxViewModel$inboxPagingData$1$1 inboxViewModel$inboxPagingData$1$1 = new InboxViewModel$inboxPagingData$1$1(this.this$0, r02Var);
        inboxViewModel$inboxPagingData$1$1.L$0 = obj;
        return inboxViewModel$inboxPagingData$1$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(EmptyState emptyState, r02<? super g2b> r02Var) {
        return ((InboxViewModel$inboxPagingData$1$1) create(emptyState, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        EmptyState emptyStateCopy$default;
        InboxViewModel inboxViewModel;
        EmptyState emptyState;
        OpenMessengerResponse.NewConversationData newConversationData;
        OpenMessengerResponse.NewConversationData.Cta cta;
        int i = this.label;
        String text = null;
        if (i == 0) {
            dv8.b(obj);
            emptyStateCopy$default = (EmptyState) this.L$0;
            inboxViewModel = this.this$0;
            if (!xj5.a(emptyStateCopy$default, EmptyState.Companion.getNULL())) {
                CommonRepository commonRepository = this.this$0.commonRepository;
                this.L$0 = emptyStateCopy$default;
                this.L$1 = inboxViewModel;
                this.label = 1;
                Object objOpenMessenger = commonRepository.openMessenger(this);
                v72 v72Var = v72.t;
                if (objOpenMessenger == v72Var) {
                    return v72Var;
                }
                emptyState = emptyStateCopy$default;
                obj = objOpenMessenger;
            }
            inboxViewModel.emptyState = emptyStateCopy$default;
            return g2b.a;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        inboxViewModel = (InboxViewModel) this.L$1;
        EmptyState emptyState2 = (EmptyState) this.L$0;
        dv8.b(obj);
        emptyState = emptyState2;
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.Success) && (newConversationData = ((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody()).getNewConversationData()) != null && (cta = newConversationData.getCta()) != null) {
            text = cta.getText();
        }
        String str = text;
        if (str == null || (emptyStateCopy$default = EmptyState.copy$default(emptyState, null, null, EmptyState.Action.copy$default(emptyState.getAction(), null, str, null, 5, null), 3, null)) == null) {
            emptyStateCopy$default = emptyState;
        }
        inboxViewModel.emptyState = emptyStateCopy$default;
        return g2b.a;
    }
}
