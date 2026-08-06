package defpackage;

import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y15 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ y15(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ho5<Object>[] ho5VarArr = HostActivity.K;
                ((HostActivity) obj).A();
                break;
            default:
                ((yfb) obj).b = null;
                break;
        }
    }
}
