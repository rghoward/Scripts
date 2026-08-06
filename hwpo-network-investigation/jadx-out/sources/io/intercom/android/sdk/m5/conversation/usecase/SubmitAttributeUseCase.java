package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.r02;
import defpackage.th1;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Conversation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitAttributeUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase", f = "SubmitAttributeUseCase.kt", l = {27}, m = "invoke")
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
            return SubmitAttributeUseCase.this.invoke(null, null, null, this);
        }
    }

    public SubmitAttributeUseCase(ConversationRepository conversationRepository) {
        conversationRepository.getClass();
        this.conversationRepository = conversationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object invoke(i37<ConversationClientState> i37Var, Attribute attribute, String str, r02<? super g2b> r02Var) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        ArrayList arrayListL;
        ArrayList arrayList;
        Attribute attribute2;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        ArrayList arrayListL2;
        ArrayList arrayList2;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        i37<ConversationClientState> i37Var2 = i37Var;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objSubmitForm = anonymousClass2.result;
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            dv8.b(objSubmitForm);
            Conversation conversation = i37Var2.getValue().getConversation();
            if (conversation == null) {
                return g2b.a;
            }
            do {
                value = i37Var2.getValue();
                conversationClientState = value;
                arrayListL = th1.L(conversationClientState.getLoadingAttributeIdentifiers(), attribute.getIdentifier());
                List<String> failedAttributeIdentifiers = conversationClientState.getFailedAttributeIdentifiers();
                arrayList = new ArrayList();
                for (Object obj : failedAttributeIdentifiers) {
                    if (!xj5.a((String) obj, attribute.getIdentifier())) {
                        arrayList.add(obj);
                    }
                }
            } while (!i37Var2.c(value, ConversationClientState.copy$default(conversationClientState, null, null, null, null, null, null, null, null, null, null, arrayList, arrayListL, null, null, 0, 0, null, null, false, false, null, null, null, 8385535, null)));
            ConversationRepository conversationRepository = this.conversationRepository;
            String id = conversation.getId();
            String identifier = attribute.getIdentifier();
            String value4 = attribute.getValue();
            if (value4 == null) {
                value4 = BuildConfig.FLAVOR;
            }
            String type = attribute.getType();
            anonymousClass2.L$0 = i37Var2;
            anonymousClass2.L$1 = attribute;
            anonymousClass2.label = 1;
            objSubmitForm = conversationRepository.submitForm(id, str, identifier, value4, type, anonymousClass2);
            v72 v72Var = v72.t;
            if (objSubmitForm == v72Var) {
                return v72Var;
            }
            attribute2 = attribute;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Attribute attribute3 = (Attribute) anonymousClass2.L$1;
            i37Var2 = (i37) anonymousClass2.L$0;
            dv8.b(objSubmitForm);
            attribute2 = attribute3;
        }
        i37<ConversationClientState> i37Var3 = i37Var2;
        NetworkResponse networkResponse = (NetworkResponse) objSubmitForm;
        if (networkResponse instanceof NetworkResponse.Success) {
            do {
                value3 = i37Var3.getValue();
                conversationClientState3 = value3;
                List<String> failedAttributeIdentifiers2 = conversationClientState3.getFailedAttributeIdentifiers();
                arrayList3 = new ArrayList();
                for (Object obj2 : failedAttributeIdentifiers2) {
                    if (!xj5.a((String) obj2, attribute2.getIdentifier())) {
                        arrayList3.add(obj2);
                    }
                }
                List<String> loadingAttributeIdentifiers = conversationClientState3.getLoadingAttributeIdentifiers();
                arrayList4 = new ArrayList();
                for (Object obj3 : loadingAttributeIdentifiers) {
                    if (!xj5.a((String) obj3, attribute2.getIdentifier())) {
                        arrayList4.add(obj3);
                    }
                }
            } while (!i37Var3.c(value3, ConversationClientState.copy$default(conversationClientState3, null, (Conversation) ((NetworkResponse.Success) networkResponse).getBody(), null, null, null, null, null, null, null, null, arrayList3, arrayList4, null, null, 0, 0, null, null, false, false, null, null, null, 8385533, null)));
        } else {
            if (!(networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                u.b();
                return null;
            }
            do {
                value2 = i37Var3.getValue();
                conversationClientState2 = value2;
                arrayListL2 = th1.L(conversationClientState2.getFailedAttributeIdentifiers(), attribute2.getIdentifier());
                List<String> loadingAttributeIdentifiers2 = conversationClientState2.getLoadingAttributeIdentifiers();
                arrayList2 = new ArrayList();
                for (Object obj4 : loadingAttributeIdentifiers2) {
                    if (!xj5.a((String) obj4, attribute2.getIdentifier())) {
                        arrayList2.add(obj4);
                    }
                }
            } while (!i37Var3.c(value2, ConversationClientState.copy$default(conversationClientState2, null, null, null, null, null, null, null, null, null, null, arrayListL2, arrayList2, null, null, 0, 0, null, null, false, false, null, null, null, 8385535, null)));
        }
        return g2b.a;
    }
}
