package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a92 implements e5a<nk9, Void> {
    public final /* synthetic */ b92 t;

    public a92(b92 b92Var) {
        this.t = b92Var;
    }

    @Override // defpackage.e5a
    public final r9a<Void> b(nk9 nk9Var) {
        if (nk9Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return caa.e(null);
        }
        d92 d92Var = (d92) this.t.u;
        d92.a(d92Var);
        d92Var.m.g(null, d92Var.e.a);
        d92Var.q.d(null);
        return caa.e(null);
    }
}
