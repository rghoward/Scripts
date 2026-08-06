package io.intercom.android.sdk.m5.inbox.data;

import defpackage.aa0;
import defpackage.as7;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.qq2;
import defpackage.r02;
import defpackage.th1;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.zr7;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationList;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxPagingSource extends zr7<Long, Conversation> {
    public static final int PAGE_SIZE = 20;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final ci4<EmptyState, r02<? super g2b>, Object> onEmptyState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.inbox.data.InboxPagingSource", f = "InboxPagingSource.kt", l = {18, 32}, m = "load")
    public static final class AnonymousClass1 extends u02 {
        int I$0;
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
            return InboxPagingSource.this.load(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxPagingSource(InboxRepository inboxRepository, IntercomDataLayer intercomDataLayer, ci4<? super EmptyState, ? super r02<? super g2b>, ? extends Object> ci4Var) {
        inboxRepository.getClass();
        intercomDataLayer.getClass();
        ci4Var.getClass();
        this.inboxRepository = inboxRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.onEmptyState = ci4Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.zr7
    public Long getRefreshKey(as7<Long, Conversation> as7Var) {
        as7Var.getClass();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zr7
    public Object load(zr7.a<Long> aVar, r02<? super zr7.b<Long, Conversation>> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        InboxPagingSource inboxPagingSource;
        ConversationList conversationList;
        int i;
        List<Conversation> conversations;
        Conversation conversation;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object conversations2 = anonymousClass1.result;
        int i3 = anonymousClass1.label;
        Long l = null;
        v72 v72Var = v72.t;
        if (i3 == 0) {
            dv8.b(conversations2);
            InboxRepository inboxRepository = this.inboxRepository;
            Long lA = aVar.a();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = aVar;
            anonymousClass1.label = 1;
            conversations2 = inboxRepository.getConversations(lA, 20, anonymousClass1);
            if (conversations2 != v72Var) {
            }
            return v72Var;
        }
        if (i3 == 1) {
            aVar = (zr7.a) anonymousClass1.L$1;
            this = (InboxPagingSource) anonymousClass1.L$0;
            dv8.b(conversations2);
        } else {
            if (i3 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = anonymousClass1.I$0;
            conversationList = (ConversationList) anonymousClass1.L$1;
            inboxPagingSource = (InboxPagingSource) anonymousClass1.L$0;
            dv8.b(conversations2);
        }
        if (i != 0) {
            conversations = th1.T(inboxPagingSource.intercomDataLayer.getConversations().getValue());
        } else {
            conversations = conversationList.getConversations();
        }
        List<Conversation> list = conversations;
        list.getClass();
        if (conversationList.hasMorePages() && (conversation = (Conversation) th1.H(list)) != null) {
            l = new Long(ConversationExtensionsKt.lastActionCreatedAt(conversation));
        }
        return new zr7.b.C0297b(list, null, l, Integer.MIN_VALUE, Integer.MIN_VALUE);
        NetworkResponse networkResponse = (NetworkResponse) conversations2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            if (networkResponse instanceof NetworkResponse.NetworkError) {
                return new zr7.b.a(((NetworkResponse.NetworkError) networkResponse).getError());
            }
            if (networkResponse instanceof NetworkResponse.ClientError) {
                return new zr7.b.a(((NetworkResponse.ClientError) networkResponse).getError());
            }
            if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                u.b();
                return null;
            }
            return new zr7.b.a(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
        }
        int i4 = aVar.a() != null ? 0 : 1;
        ConversationsResponse conversationsResponseBuild = ((ConversationsResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
        ConversationList conversationPage = conversationsResponseBuild.getConversationPage();
        IntercomDataLayer intercomDataLayer = this.intercomDataLayer;
        Config config = conversationsResponseBuild.getConfig();
        config.getClass();
        intercomDataLayer.updateConfig(config);
        IntercomDataLayer intercomDataLayer2 = this.intercomDataLayer;
        List<Conversation> conversations3 = conversationPage.getConversations();
        conversations3.getClass();
        intercomDataLayer2.addConversations(conversations3);
        ci4<EmptyState, r02<? super g2b>, Object> ci4Var = this.onEmptyState;
        EmptyState emptyState = conversationPage.getEmptyState();
        emptyState.getClass();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = conversationPage;
        anonymousClass1.I$0 = i4;
        anonymousClass1.label = 2;
        if (ci4Var.invoke(emptyState, anonymousClass1) != v72Var) {
            inboxPagingSource = this;
            conversationList = conversationPage;
            i = i4;
            if (i != 0) {
                conversations = th1.T(inboxPagingSource.intercomDataLayer.getConversations().getValue());
            } else {
                conversations = conversationList.getConversations();
            }
            List<Conversation> list2 = conversations;
            list2.getClass();
            if (conversationList.hasMorePages()) {
                l = new Long(ConversationExtensionsKt.lastActionCreatedAt(conversation));
            }
            return new zr7.b.C0297b(list2, null, l, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return v72Var;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }
}
