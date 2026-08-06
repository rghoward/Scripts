package io.intercom.android.sdk.tickets.create.model;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1", f = "CreateTicketViewModel.kt", l = {160, 167}, m = "invokeSuspend")
public final class CreateTicketViewModel$createTicket$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ t72 $compositionAwareScope;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketViewModel$createTicket$1$1(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, t72 t72Var, r02<? super CreateTicketViewModel$createTicket$1$1> r02Var) {
        super(2, r02Var);
        this.$content = content;
        this.this$0 = createTicketViewModel;
        this.$compositionAwareScope = t72Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invokeSuspend$lambda$5(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, true, false, 11, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invokeSuspend$lambda$6(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 11, null));
        return g2b.a;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new CreateTicketViewModel$createTicket$1$1(this.$content, this.this$0, this.$compositionAwareScope, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((CreateTicketViewModel$createTicket$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r11.emit(r12, r10) == r4) goto L43;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
