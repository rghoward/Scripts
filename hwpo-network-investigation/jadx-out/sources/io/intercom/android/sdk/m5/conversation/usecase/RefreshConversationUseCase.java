package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.i37;
import defpackage.js7;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RefreshConversationUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase", f = "RefreshConversationUseCase.kt", l = {34, SurveyViewModel.ENTITY_TYPE}, m = "invoke")
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
            return RefreshConversationUseCase.this.invoke(null, null, this);
        }
    }

    public RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        conversationRepository.getClass();
        intercomDataLayer.getClass();
        trackLastReceivedPartsUseCase.getClass();
        recordOpenedInteractionUseCase.getClass();
        this.conversationRepository = conversationRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(i37<ConversationClientState> i37Var, GetConversationReason getConversationReason, r02<? super g2b> r02Var) {
        AnonymousClass1 anonymousClass1;
        i37<ConversationClientState> i37Var2;
        FinStreamingData finStreamingData;
        RefreshConversationUseCase refreshConversationUseCase;
        Conversation conversation;
        Part part;
        RefreshConversationUseCase refreshConversationUseCase2 = this;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = refreshConversationUseCase2.new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = refreshConversationUseCase2.new AnonymousClass1(r02Var);
        }
        Object conversation2 = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        List<Part> list = null;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(conversation2);
            String conversationId = i37Var.getValue().getConversationId();
            if (conversationId != null) {
                ConversationRepository conversationRepository = refreshConversationUseCase2.conversationRepository;
                anonymousClass1.L$0 = refreshConversationUseCase2;
                i37Var2 = i37Var;
                anonymousClass1.L$1 = i37Var2;
                anonymousClass1.label = 1;
                conversation2 = conversationRepository.getConversation(conversationId, getConversationReason, anonymousClass1);
                if (conversation2 != v72Var) {
                }
                return v72Var;
            }
            return g2b.a;
        }
        if (i2 == 1) {
            i37<ConversationClientState> i37Var3 = (i37) anonymousClass1.L$1;
            RefreshConversationUseCase refreshConversationUseCase3 = (RefreshConversationUseCase) anonymousClass1.L$0;
            dv8.b(conversation2);
            i37Var2 = i37Var3;
            refreshConversationUseCase2 = refreshConversationUseCase3;
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            conversation = (Conversation) anonymousClass1.L$1;
            refreshConversationUseCase = (RefreshConversationUseCase) anonymousClass1.L$0;
            dv8.b(conversation2);
        }
        refreshConversationUseCase.conversationRepository.nexusEventsRepository().markAsSeen(conversation.getId());
        refreshConversationUseCase.intercomDataLayer.markConversationAsRead(conversation.getId());
        return g2b.a;
        NetworkResponse networkResponse = (NetworkResponse) conversation2;
        ConversationClientState value = i37Var2.getValue();
        if (networkResponse instanceof NetworkResponse.Success) {
            Conversation conversation3 = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
            refreshConversationUseCase2.trackLastReceivedPartsUseCase.invoke(conversation3);
            Map<String, PendingMessage> pendingMessages = value.getPendingMessages();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                List<Part> listParts = conversation3.parts();
                if (listParts == null || !listParts.isEmpty()) {
                    Iterator<T> it = listParts.iterator();
                    do {
                        if (it.hasNext()) {
                            part = (Part) it.next();
                            if (xj5.a(part.getUuid(), entry.getValue().getPart().getUuid())) {
                                break;
                            }
                        }
                    } while (!xj5.a(part.getId(), entry.getValue().getPart().getId()));
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            List<Part> listParts2 = conversation3.parts();
            hf3 hf3Var = hf3.t;
            if (listParts2 != null && listParts2.isEmpty()) {
                finStreamingData = value.getFinStreamingData();
                break;
            }
            Iterator<T> it2 = listParts2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    finStreamingData = value.getFinStreamingData();
                    break;
                }
                Part part2 = (Part) it2.next();
                String uuid = part2.getUuid();
                uuid.getClass();
                if (!z2a.w(uuid) && xj5.a(part2.getUuid(), value.getFinStreamingData().getClientAssignedUUID())) {
                    finStreamingData = new FinStreamingData(false, hf3Var, BuildConfig.FLAVOR, 0);
                    break;
                }
            }
            FinStreamingData finStreamingData2 = finStreamingData;
            List<Part> listParts3 = conversation3.parts();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listParts3) {
                Part part3 = (Part) obj;
                if (!part3.isUser()) {
                    Conversation conversation4 = value.getConversation();
                    List<Part> listParts4 = conversation4 != null ? conversation4.parts() : list;
                    if (listParts4 == null) {
                        listParts4 = hf3Var;
                    }
                    if (listParts4.isEmpty()) {
                        arrayList.add(obj);
                        break;
                    }
                    Iterator<T> it3 = listParts4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            arrayList.add(obj);
                            break;
                            break;
                        }
                    } while (!xj5.a(((Part) it3.next()).getId(), part3.getId()));
                }
                list = null;
            }
            js7 js7VarCalculateJumpToBottomButtonState = RefreshConversationUseCaseKt.calculateJumpToBottomButtonState(value, conversation3, arrayList);
            while (true) {
                NetworkResponse networkResponse2 = networkResponse;
                if (i37Var2.c(i37Var2.getValue(), ConversationClientState.copy$default(value, linkedHashMap, conversation3, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, networkResponse2, null, null, null, null, finStreamingData2, null, 0, 0, (FloatingIndicatorState) js7VarCalculateJumpToBottomButtonState.t, (String) js7VarCalculateJumpToBottomButtonState.u, false, false, null, null, null, 8187764, null))) {
                    break;
                }
                networkResponse = networkResponse2;
            }
            IntercomDataLayer intercomDataLayer = refreshConversationUseCase2.intercomDataLayer;
            Ticket ticket = conversation3.getTicket();
            if (ticket == null) {
                ticket = Ticket.Companion.getNULL();
            }
            intercomDataLayer.updateTicket(ticket);
            refreshConversationUseCase2.intercomDataLayer.fetchConversationSuccess(conversation3);
            refreshConversationUseCase2.recordOpenedInteractionUseCase.invoke(conversation3);
            if (!conversation3.isRead()) {
                ConversationRepository conversationRepository2 = refreshConversationUseCase2.conversationRepository;
                String id = conversation3.getId();
                anonymousClass1.L$0 = refreshConversationUseCase2;
                anonymousClass1.L$1 = conversation3;
                anonymousClass1.label = 2;
                if (conversationRepository2.markAsRead(id, anonymousClass1) != v72Var) {
                    refreshConversationUseCase = refreshConversationUseCase2;
                    conversation = conversation3;
                    refreshConversationUseCase.conversationRepository.nexusEventsRepository().markAsSeen(conversation.getId());
                    refreshConversationUseCase.intercomDataLayer.markConversationAsRead(conversation.getId());
                }
                return v72Var;
            }
        } else {
            while (!i37Var2.c(i37Var2.getValue(), ConversationClientState.copy$default(value, null, null, null, null, null, null, null, networkResponse, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388479, null))) {
            }
        }
        return g2b.a;
    }

    public /* synthetic */ RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, int i, qq2 qq2Var) {
        this(conversationRepository, (i & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, trackLastReceivedPartsUseCase, recordOpenedInteractionUseCase);
    }
}
