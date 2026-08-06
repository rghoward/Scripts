package defpackage;

import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wv5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ wv5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                vv5.b bVar = ((vv5) obj).j;
                if (bVar != null) {
                    b73.a(bVar);
                }
                return g2b.a;
            default:
                return TicketsScreenViewModel._init_$lambda$0((TicketRepository) obj);
        }
    }
}
