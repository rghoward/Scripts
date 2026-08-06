package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oq2 implements gx1 {
    public final Context t;
    public final lq8.b u;

    public oq2(Context context, lq8.b bVar) {
        this.t = context.getApplicationContext();
        this.u = bVar;
    }

    @Override // defpackage.k76
    public final void a() {
        uq9 uq9VarA = uq9.a(this.t);
        lq8.b bVar = this.u;
        synchronized (uq9VarA) {
            uq9VarA.b.remove(bVar);
            if (uq9VarA.c && uq9VarA.b.isEmpty()) {
                uq9.c cVar = uq9VarA.a;
                ((ConnectivityManager) cVar.c.get()).unregisterNetworkCallback(cVar.d);
                uq9VarA.c = false;
            }
        }
    }

    @Override // defpackage.k76
    public final void k() {
        uq9 uq9VarA = uq9.a(this.t);
        lq8.b bVar = this.u;
        synchronized (uq9VarA) {
            uq9VarA.b.add(bVar);
            uq9VarA.b();
        }
    }

    @Override // defpackage.k76
    public final void f() {
    }
}
