package defpackage;

import android.media.metrics.NetworkEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class op6 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ op6(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((sp6) obj2).d.reportNetworkEvent((NetworkEvent) obj);
                break;
            default:
                oxa oxaVar = (oxa) obj2;
                bv7 bv7Var = (bv7) obj;
                oxaVar.getClass();
                oxaVar.d(bv7Var.a, bv7Var.b);
                break;
        }
    }
}
