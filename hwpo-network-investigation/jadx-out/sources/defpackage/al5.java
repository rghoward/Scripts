package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class al5 {
    public static final /* synthetic */ ho5<Object>[] d;
    public final String a;
    public final ThreadLocal<Boolean> b;
    public final pf2<t78> c;

    static {
        oe8 oe8Var = new oe8(al5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        ll8.a.getClass();
        d = new ho5[]{oe8Var};
    }

    public al5(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal<>();
        this.c = s7.c(str, new un8(new oh4() { // from class: vk5
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                z72 z72Var = (z72) obj;
                z72Var.getClass();
                Log.w(ll8.a(al5.class).c(), "CorruptionException in " + this.t.a + " DataStore running in process " + Process.myPid(), z72Var);
                return new x27(1, true);
            }
        }), new p15(1, this), 8).a(context, d[0]);
    }

    public final void a(oh4 oh4Var) {
    }
}
