package defpackage;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ oj(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return ((wj) obj).e();
            case 1:
                fi3 fi3Var = (fi3) obj;
                kx3.b bVar = fi3Var.A;
                if (bVar == null) {
                    xj5.e("filePickerFactory");
                    throw null;
                }
                ba activityResultRegistry = fi3Var.requireActivity().getActivityResultRegistry();
                activityResultRegistry.getClass();
                s66 lifecycle = fi3Var.getLifecycle();
                lifecycle.getClass();
                return bVar.a(activityResultRegistry, lifecycle);
            case 2:
                return ((Context) obj).getSharedPreferences("com.hwpo_training_app.client.data.repository.SHARED_PREF_KEY", 0);
            default:
                return UploadErrorDialogKt.UploadErrorDialog$lambda$7$lambda$6((mh4) obj);
        }
    }
}
