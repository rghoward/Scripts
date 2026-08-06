package defpackage;

import android.app.Application;
import io.intercom.android.sdk.fcm.IntercomFcmMessengerService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hp3 implements gb6.a, fh7 {
    public final /* synthetic */ Object t;

    public /* synthetic */ hp3(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.fh7
    public void b(r9a r9aVar) {
        IntercomFcmMessengerService.lambda$initialize$0((Application) this.t, r9aVar);
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((s28.c) obj).m(((i28) this.t).n);
    }
}
