package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ pt5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return new jt5((oh4) ((h37) obj).getValue());
            case 1:
                qq5 qq5Var = (qq5) ((h37) obj).getValue();
                if (qq5Var != null) {
                    return qq5Var;
                }
                xc5.d("Required value was null.");
                fl.a();
                return null;
            default:
                return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$3$lambda$2((mh4) obj);
        }
    }
}
