package defpackage;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hpc implements Runnable {
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ hrc u;

    public hpc(hrc hrcVar, Bundle bundle) {
        this.t = bundle;
        this.u = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.u;
        hrcVar.g();
        hrcVar.h();
        Bundle bundle = this.t;
        String string = bundle.getString("name");
        a78.d(string);
        tkc tkcVar = hrcVar.a;
        if (!tkcVar.d()) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        szc szcVar = new szc(0L, null, string, BuildConfig.FLAVOR);
        try {
            yzc yzcVar = tkcVar.i;
            tkc.k(yzcVar);
            bundle.getString("app_id");
            tkcVar.p().z(new e5c(bundle.getString("app_id"), BuildConfig.FLAVOR, szcVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), yzcVar.O(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
