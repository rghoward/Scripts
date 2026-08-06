package io.intercom.android.sdk.m5.navigation;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5$1", f = "TicketsDestination.kt", l = {}, m = "invokeSuspend")
public final class TicketsDestinationKt$ticketsDestination$7$5$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    int label;

    public TicketsDestinationKt$ticketsDestination$7$5$1(r02<? super TicketsDestinationKt$ticketsDestination$7$5$1> r02Var) {
        super(2, r02Var);
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new TicketsDestinationKt$ticketsDestination$7$5$1(r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((TicketsDestinationKt$ticketsDestination$7$5$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        Injector.get().getMetricTracker().viewedSpace("tickets");
        return g2b.a;
    }
}
