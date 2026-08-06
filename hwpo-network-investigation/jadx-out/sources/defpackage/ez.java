package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ez implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ ez(int i, Object obj, Object obj2) {
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
                dz.c cVar = (dz.c) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    cVar.a();
                }
            default:
                pr2.b bVar = (pr2.b) obj2;
                bVar.C = false;
                bVar.c((Uri) obj);
                return;
        }
    }
}
