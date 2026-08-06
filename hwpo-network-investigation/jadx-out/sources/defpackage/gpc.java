package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gpc implements Runnable {
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ hrc u;

    public gpc(hrc hrcVar, Bundle bundle) {
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
        String string2 = bundle.getString("origin");
        a78.d(string);
        a78.d(string2);
        a78.g(bundle.get("value"));
        tkc tkcVar = hrcVar.a;
        if (!tkcVar.d()) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        szc szcVar = new szc(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
        try {
            yzc yzcVar = tkcVar.i;
            tkc.k(yzcVar);
            bundle.getString("app_id");
            z9c z9cVarO = yzcVar.O(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
            tkc.k(yzcVar);
            bundle.getString("app_id");
            z9c z9cVarO2 = yzcVar.O(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
            bundle.getString("app_id");
            tkcVar.p().z(new e5c(bundle.getString("app_id"), string2, szcVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), z9cVarO2, bundle.getLong("trigger_timeout"), z9cVarO, bundle.getLong("time_to_live"), yzcVar.O(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
