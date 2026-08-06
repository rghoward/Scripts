package io.intercom.android.sdk.m5.navigation;

import defpackage.a06;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.zl9;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenEffects;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$2$1", f = "TicketsDestination.kt", l = {153}, m = "invokeSuspend")
public final class TicketsDestinationKt$ticketsDestination$7$2$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ a06<TicketRowData> $lazyPagingItems;
    final /* synthetic */ TicketsScreenViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketsDestinationKt$ticketsDestination$7$2$1(TicketsScreenViewModel ticketsScreenViewModel, a06<TicketRowData> a06Var, r02<? super TicketsDestinationKt$ticketsDestination$7$2$1> r02Var) {
        super(2, r02Var);
        this.$viewModel = ticketsScreenViewModel;
        this.$lazyPagingItems = a06Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new TicketsDestinationKt$ticketsDestination$7$2$1(this.$viewModel, this.$lazyPagingItems, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((TicketsDestinationKt$ticketsDestination$7$2$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            zl9<TicketsScreenEffects> effect = this.$viewModel.getEffect();
            final a06<TicketRowData> a06Var = this.$lazyPagingItems;
            s54<? super TicketsScreenEffects> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$2$1.1
                public final Object emit(TicketsScreenEffects ticketsScreenEffects, r02<? super g2b> r02Var) {
                    if (xj5.a(ticketsScreenEffects, TicketsScreenEffects.RefreshTickets.INSTANCE)) {
                        a06Var.c();
                        return g2b.a;
                    }
                    defpackage.u.b();
                    return null;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((TicketsScreenEffects) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = effect.collect(s54Var, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
