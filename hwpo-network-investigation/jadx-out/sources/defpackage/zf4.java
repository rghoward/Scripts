package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zf4 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ zf4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                xf4 xf4Var = (xf4) obj;
                xf4Var.k = false;
                xf4Var.x();
                break;
            default:
                ((rub) obj).b();
                break;
        }
    }
}
