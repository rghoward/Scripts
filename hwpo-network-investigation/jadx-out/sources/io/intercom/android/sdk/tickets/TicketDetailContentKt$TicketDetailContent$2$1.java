package io.intercom.android.sdk.tickets;

import defpackage.aa0;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.h37;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.y43;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1", f = "TicketDetailContent.kt", l = {81}, m = "invokeSuspend")
public final class TicketDetailContentKt$TicketDetailContent$2$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ h37<CardState> $cardState$delegate;
    final /* synthetic */ h37<Float> $submissionCardAlpha$delegate;
    final /* synthetic */ h37<y43> $submissionCardOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDetailContentKt$TicketDetailContent$2$1(h37<y43> h37Var, h37<Float> h37Var2, h37<CardState> h37Var3, r02<? super TicketDetailContentKt$TicketDetailContent$2$1> r02Var) {
        super(2, r02Var);
        this.$submissionCardOffset$delegate = h37Var;
        this.$submissionCardAlpha$delegate = h37Var2;
        this.$cardState$delegate = h37Var3;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new TicketDetailContentKt$TicketDetailContent$2$1(this.$submissionCardOffset$delegate, this.$submissionCardAlpha$delegate, this.$cardState$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((TicketDetailContentKt$TicketDetailContent$2$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            TicketDetailContentKt.TicketDetailContent$lambda$8(this.$submissionCardOffset$delegate, 0.0f);
            TicketDetailContentKt.TicketDetailContent$lambda$11(this.$submissionCardAlpha$delegate, 1.0f);
            this.label = 1;
            Object objB = bw2.b(5000L, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        this.$cardState$delegate.setValue(CardState.TimelineCard);
        return g2b.a;
    }
}
