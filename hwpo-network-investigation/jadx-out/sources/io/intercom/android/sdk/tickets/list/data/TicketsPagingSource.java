package io.intercom.android.sdk.tickets.list.data;

import defpackage.aa0;
import defpackage.as7;
import defpackage.dv8;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.zr7;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsPagingSource extends zr7<Long, Ticket> {
    public static final int PAGE_SIZE = 10;
    private final TicketRepository repository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.list.data.TicketsPagingSource", f = "TicketsPagingSource.kt", l = {14}, m = "load")
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
            return TicketsPagingSource.this.load(null, this);
        }
    }

    public /* synthetic */ TicketsPagingSource(TicketRepository ticketRepository, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.zr7
    public Long getRefreshKey(as7<Long, Ticket> as7Var) {
        as7Var.getClass();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zr7
    public Object load(zr7.a<Long> aVar, r02<? super zr7.b<Long, Ticket>> r02Var) throws Throwable {
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
        Object objFetchTickets = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(objFetchTickets);
            TicketRepository ticketRepository = this.repository;
            Long lA = aVar.a();
            long jLongValue = lA != null ? lA.longValue() : 1L;
            anonymousClass1.L$0 = aVar;
            anonymousClass1.label = 1;
            objFetchTickets = ticketRepository.fetchTickets(jLongValue, 10, anonymousClass1);
            v72 v72Var = v72.t;
            if (objFetchTickets == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (zr7.a) anonymousClass1.L$0;
            dv8.b(objFetchTickets);
        }
        NetworkResponse networkResponse = (NetworkResponse) objFetchTickets;
        if (networkResponse instanceof NetworkResponse.Success) {
            NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
            List<Ticket> tickets = ((TicketsResponse) success.getBody()).getTickets();
            Long lA2 = aVar.a();
            Long l = lA2 != null ? new Long(lA2.longValue() - 1) : null;
            Long nextPage = ((TicketsResponse) success.getBody()).getNextPage();
            tickets.getClass();
            return new zr7.b.C0297b(tickets, l, nextPage, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsPagingSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TicketsPagingSource(TicketRepository ticketRepository) {
        ticketRepository.getClass();
        this.repository = ticketRepository;
    }
}
