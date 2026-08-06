package defpackage;

import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class in0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ in0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                hc9 hc9Var = (hc9) obj;
                ec9.c(hc9Var, 1);
                ec9.d((String) obj2, hc9Var);
                return g2b.a;
            case 1:
                return CreateTicketViewModel.updateCtaState$lambda$14((CreateTicketViewModel) obj2, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            default:
                Long l = (Long) obj;
                l.getClass();
                return ((oh4) obj2).invoke(l);
        }
    }
}
