package defpackage;

import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.overlay.OverlayPresenter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ fs(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                zr zrVar = (zr) obj2;
                zrVar.e.e();
                return new js(zrVar);
            default:
                return ((OverlayPresenter) obj2).lambda$new$2((OverlayState) obj);
        }
    }
}
