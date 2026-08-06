package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s97 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ s97(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                Object systemService = ((t97) obj).a.getSystemService("connectivity");
                systemService.getClass();
                return (ConnectivityManager) systemService;
            default:
                f19 f19Var = (f19) obj;
                f19Var.getLifecycle().a(new rk8(f19Var));
                return g2b.a;
        }
    }
}
