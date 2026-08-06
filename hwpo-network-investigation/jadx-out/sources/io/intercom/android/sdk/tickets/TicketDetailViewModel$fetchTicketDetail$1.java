package io.intercom.android.sdk.tickets;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.mh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$fetchTicketDetail$1", f = "TicketDetailViewModel.kt", l = {111}, m = "invokeSuspend")
public final class TicketDetailViewModel$fetchTicketDetail$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ String $ticketId;
    Object L$0;
    int label;
    final /* synthetic */ TicketDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDetailViewModel$fetchTicketDetail$1(TicketDetailViewModel ticketDetailViewModel, String str, r02<? super TicketDetailViewModel$fetchTicketDetail$1> r02Var) {
        super(2, r02Var);
        this.this$0 = ticketDetailViewModel;
        this.$ticketId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invokeSuspend$lambda$0(TicketDetailViewModel ticketDetailViewModel, String str) {
        ticketDetailViewModel.fetchTicketDetail$intercom_sdk_base_release(str);
        return g2b.a;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new TicketDetailViewModel$fetchTicketDetail$1(this.this$0, this.$ticketId, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((TicketDetailViewModel$fetchTicketDetail$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        i37 i37Var;
        Object error;
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            i37Var = this.this$0._stateFlow;
            TicketRepository ticketRepository = this.this$0.repository;
            String str = this.$ticketId;
            this.L$0 = i37Var;
            this.label = 1;
            obj = ticketRepository.fetchTicketDetail(str, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i37Var = (i37) this.L$0;
            dv8.b(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            error = new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, new Integer(R.string.intercom_error_loading_ticket), 3, null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            Integer num = new Integer(R.string.intercom_error_loading_ticket);
            final TicketDetailViewModel ticketDetailViewModel = this.this$0;
            final String str2 = this.$ticketId;
            error = new TicketDetailState.Error(new ErrorState.WithCTA(0, 0, num, 0, new mh4() { // from class: io.intercom.android.sdk.tickets.f
                @Override // defpackage.mh4
                public final Object invoke() {
                    return TicketDetailViewModel$fetchTicketDetail$1.invokeSuspend$lambda$0(ticketDetailViewModel, str2);
                }
            }, 11, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                u.b();
                return null;
            }
            Ticket ticket = (Ticket) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.fireMetricIfNecessary(ticket);
            this.this$0.markAsReadIfNecessary(ticket);
            this.this$0.ticketId = ticket.getId();
            error = TicketDetailReducerKt.computeTicketViewState(ticket, this.this$0.user, this.this$0.getActiveAdminsAvatars(), this.this$0.launchedFrom);
        }
        i37Var.setValue(error);
        return g2b.a;
    }
}
