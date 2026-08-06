package defpackage;

import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ox4 implements ih7 {
    public final /* synthetic */ HostActivity a;

    public ox4(HostActivity hostActivity) {
        this.a = hostActivity;
    }

    @Override // defpackage.ih7
    public final void a(dq1 dq1Var) {
        HostActivity hostActivity = this.a;
        if (hostActivity.w) {
            return;
        }
        hostActivity.w = true;
        ((t25) hostActivity.a()).b(hostActivity);
    }
}
