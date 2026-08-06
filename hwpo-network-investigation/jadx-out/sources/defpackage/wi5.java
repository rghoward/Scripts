package defpackage;

import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wi5 implements IntercomStatusCallback {
    public final /* synthetic */ nz8 a;
    public final /* synthetic */ vi5 b;

    public wi5(nz8 nz8Var, vi5 vi5Var) {
        this.a = nz8Var;
        this.b = vi5Var;
    }

    @Override // io.intercom.android.sdk.IntercomStatusCallback
    public final void onFailure(IntercomError intercomError) {
        intercomError.getClass();
        int errorCode = intercomError.getErrorCode();
        nz8 nz8Var = this.a;
        if (errorCode == 3002) {
            nz8Var.resumeWith(g2b.a);
        } else {
            this.b.d();
            nz8Var.resumeWith(new av8.a(new RuntimeException(intercomError.getErrorMessage())));
        }
    }

    @Override // io.intercom.android.sdk.IntercomStatusCallback
    public final void onSuccess() {
        this.a.resumeWith(g2b.a);
    }
}
