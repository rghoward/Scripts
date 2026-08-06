package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y13 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ y13(int i, Object obj, Object obj2) {
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
                z13 z13Var = (z13) obj2;
                if (!z13Var.d.offer((Runnable) obj)) {
                    aa0.c("cannot enqueue any more runnables");
                } else {
                    z13Var.a();
                }
                break;
            default:
                ((lm3) ((Map.Entry) obj2).getKey()).a((fm3) obj);
                break;
        }
    }
}
