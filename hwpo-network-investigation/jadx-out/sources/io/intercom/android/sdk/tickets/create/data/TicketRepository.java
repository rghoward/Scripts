package io.intercom.android.sdk.tickets.create.data;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.js7;
import defpackage.kh6;
import defpackage.pi6;
import defpackage.qi6;
import defpackage.qp8;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.z2a;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final TicketApi api;
    private final IntercomDataLayer intercomDataLayer;
    private final NexusClient nexusClient;
    private final UploadRepository uploadRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.create.data.TicketRepository", f = "TicketRepository.kt", l = {36}, m = "createTicket")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TicketRepository.this.createTicket(null, 0L, null, this);
        }
    }

    public /* synthetic */ TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getTicketApi() : ticketApi, (i & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i & 4) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 8) != 0 ? Injector.get().getAblyManager() : ablyManager, (i & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fetchTicketType$default(TicketRepository ticketRepository, long j, List list, r02 r02Var, int i, Object obj) {
        if ((i & 2) != 0) {
            list = hf3.t;
        }
        return ticketRepository.fetchTicketType(j, list, r02Var);
    }

    public static /* synthetic */ Object fetchTickets$default(TicketRepository ticketRepository, long j, int i, r02 r02Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return ticketRepository.fetchTickets(j, i, r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createTicket(String str, long j, List<TicketAttributeRequest> list, r02<? super NetworkResponse<Ticket>> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
        Object objCreateTicket = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(objCreateTicket);
            TicketApi ticketApi = this.api;
            MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
            kh6 kh6Var = new kh6();
            if (str != null && !z2a.w(str)) {
                kh6Var.put(CreateTicketDestinationKt.CONVERSATION_ID, str);
            }
            kh6Var.put("type_id", new Long(j));
            kh6Var.put("attributes", list);
            g2b g2bVar = g2b.a;
            qp8 defaultRequestBody$intercom_sdk_base_release = messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(pi6.f(kh6Var));
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objCreateTicket = ticketApi.createTicket(defaultRequestBody$intercom_sdk_base_release, anonymousClass1);
            v72 v72Var = v72.t;
            if (objCreateTicket == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (TicketRepository) anonymousClass1.L$0;
            dv8.b(objCreateTicket);
        }
        NetworkResponse networkResponse = (NetworkResponse) objCreateTicket;
        if (networkResponse instanceof NetworkResponse.Success) {
            this.intercomDataLayer.updateTicket((Ticket) ((NetworkResponse.Success) networkResponse).getBody());
        }
        return networkResponse;
    }

    public final Object fetchTicketDetail(String str, r02<? super NetworkResponse<Ticket>> r02Var) {
        return this.api.fetchTicketDetail(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), r02Var);
    }

    public final Object fetchTicketType(long j, List<TicketAttributeRequest> list, r02<? super NetworkResponse<TicketTypeV2>> r02Var) {
        return this.api.fetchTicketType(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(qi6.i(new js7(CreateTicketDestinationKt.TICKET_TYPE_ID, new Long(j)), new js7("attributes", list))), r02Var);
    }

    public final Object fetchTickets(long j, int i, r02<? super NetworkResponse<TicketsResponse>> r02Var) {
        return this.api.fetchTickets(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(qi6.i(new js7("page", new Long(j)), new js7("per_page", new Integer(i)))), r02Var);
    }

    public final Object markAsRead(String str, r02<? super NetworkResponse<g2b>> r02Var) {
        return this.api.markAsRead(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), r02Var);
    }

    public final r54<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    public final Object uploadFile(MediaData.Media media, r02<? super NetworkResponse<Upload.Builder>> r02Var) {
        return this.uploadRepository.uploadFile(media, r02Var);
    }

    public TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer) {
        ticketApi.getClass();
        uploadRepository.getClass();
        nexusClient.getClass();
        ablyManager.getClass();
        intercomDataLayer.getClass();
        this.api = ticketApi;
        this.uploadRepository = uploadRepository;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
        this.intercomDataLayer = intercomDataLayer;
    }

    public TicketRepository() {
        this(null, null, null, null, null, 31, null);
    }
}
