package defpackage;

import com.hwpo_training_app.client.ClientApplication;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class df1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ df1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                int i2 = ClientApplication.y;
                return ((a02) kl3.b(a02.class, o9a.a(((ClientApplication) obj).getApplicationContext()))).b();
            default:
                return InboxViewModel.inboxPagingData$lambda$0((InboxViewModel) obj);
        }
    }
}
