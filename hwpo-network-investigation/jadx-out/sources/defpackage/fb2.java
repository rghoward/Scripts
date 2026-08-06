package defpackage;

import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fb2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ fb2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return CreateTicketViewModel.onAnswerUpdated$lambda$3$lambda$2$lambda$1((CreateTicketViewModel) obj2, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            default:
                ey7 ey7Var = (ey7) obj2;
                gm3 gm3Var = (gm3) obj;
                ey7.a aVar = ey7.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof jy7) {
                    ey7Var.t(((jy7) gm3Var).b);
                } else if (gm3Var instanceof iy7) {
                    ey7Var.getParentFragmentManager().e0(uy0.c(new js7("selected_country_code", ((iy7) gm3Var).b)), "REQUEST_KEY_PICK_COUNTRY_DIALOG");
                    ey7Var.i();
                }
                return g2b.a;
        }
    }
}
