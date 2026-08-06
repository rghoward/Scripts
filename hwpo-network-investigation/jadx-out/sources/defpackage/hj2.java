package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ hj2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((qk2) obj2).a(((n23) obj).a);
                return g2b.a;
            default:
                z72 z72Var = (z72) obj;
                z72Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", z72Var);
                return new ge9(((he9) obj2).a.a(null), null, null);
        }
    }
}
