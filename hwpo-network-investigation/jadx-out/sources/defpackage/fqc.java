package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fqc implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ hrc t;

    public fqc(hrc hrcVar) {
        this.t = hrcVar;
    }

    public final void a(lcc lccVar, Bundle bundle) {
        xsc xscVar;
        tkc tkcVar;
        Uri uri;
        hrc hrcVar = this.t;
        try {
            try {
                tkc tkcVar2 = hrcVar.a;
                thc thcVar = tkcVar2.f;
                tkc.m(thcVar);
                thcVar.n.a("onActivityCreated");
                Intent intent = lccVar.v;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        tkc.k(tkcVar2.i);
                        String str = yzc.j0(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        fkc fkcVar = tkcVar2.g;
                        tkc.m(fkcVar);
                        fkcVar.p(new dqc(this, z, uri, str, queryParameter));
                        tkcVar = hrcVar.a;
                    }
                    xscVar = tkcVar.l;
                }
                tkcVar = hrcVar.a;
            } catch (RuntimeException e) {
                thc thcVar2 = hrcVar.a.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Throwable caught in onActivityCreated");
            }
            xscVar = tkcVar.l;
        } finally {
            xscVar = hrcVar.a.l;
            tkc.l(xscVar);
            xscVar.n(lccVar, bundle);
        }
    }

    public final void b(lcc lccVar) {
        xsc xscVar = this.t.a.l;
        tkc.l(xscVar);
        synchronized (xscVar.l) {
            try {
                if (Objects.equals(xscVar.g, lccVar)) {
                    xscVar.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xscVar.a.d.v()) {
            xscVar.f.remove(Integer.valueOf(lccVar.t));
        }
    }

    public final void c(lcc lccVar) {
        tkc tkcVar = this.t.a;
        xsc xscVar = tkcVar.l;
        tkc.l(xscVar);
        synchronized (xscVar.l) {
            xscVar.k = false;
            xscVar.h = true;
        }
        tkc tkcVar2 = xscVar.a;
        tkcVar2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (tkcVar2.d.v()) {
            dsc dscVarQ = xscVar.q(lccVar);
            xscVar.d = xscVar.c;
            xscVar.c = null;
            fkc fkcVar = tkcVar2.g;
            tkc.m(fkcVar);
            fkcVar.p(new msc(xscVar, dscVarQ, jElapsedRealtime));
        } else {
            xscVar.c = null;
            fkc fkcVar2 = tkcVar2.g;
            tkc.m(fkcVar2);
            fkcVar2.p(new ksc(xscVar, jElapsedRealtime));
        }
        cxc cxcVar = tkcVar.h;
        tkc.l(cxcVar);
        tkc tkcVar3 = cxcVar.a;
        tkcVar3.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        fkc fkcVar3 = tkcVar3.g;
        tkc.m(fkcVar3);
        fkcVar3.p(new nwc(cxcVar, jElapsedRealtime2));
    }

    public final void d(lcc lccVar) {
        tkc tkcVar = this.t.a;
        cxc cxcVar = tkcVar.h;
        tkc.l(cxcVar);
        tkc tkcVar2 = cxcVar.a;
        tkcVar2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        fkc fkcVar = tkcVar2.g;
        tkc.m(fkcVar);
        fkcVar.p(new lwc(cxcVar, jElapsedRealtime));
        xsc xscVar = tkcVar.l;
        tkc.l(xscVar);
        Object obj = xscVar.l;
        synchronized (obj) {
            try {
                xscVar.k = true;
                if (!Objects.equals(lccVar, xscVar.g)) {
                    synchronized (obj) {
                        xscVar.g = lccVar;
                        xscVar.h = false;
                        tkc tkcVar3 = xscVar.a;
                        if (tkcVar3.d.v()) {
                            xscVar.i = null;
                            fkc fkcVar2 = tkcVar3.g;
                            tkc.m(fkcVar2);
                            fkcVar2.p(new vsc(xscVar));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tkc tkcVar4 = xscVar.a;
        if (!tkcVar4.d.v()) {
            xscVar.c = xscVar.i;
            fkc fkcVar3 = tkcVar4.g;
            tkc.m(fkcVar3);
            fkcVar3.p(new isc(xscVar));
            return;
        }
        xscVar.o(lccVar.u, xscVar.q(lccVar), false);
        ecc eccVar = xscVar.a.n;
        tkc.j(eccVar);
        tkc tkcVar5 = eccVar.a;
        tkcVar5.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        fkc fkcVar4 = tkcVar5.g;
        tkc.m(fkcVar4);
        fkcVar4.p(new abc(eccVar, jElapsedRealtime2));
    }

    public final void e(lcc lccVar, Bundle bundle) {
        dsc dscVar;
        xsc xscVar = this.t.a.l;
        tkc.l(xscVar);
        if (!xscVar.a.d.v() || bundle == null || (dscVar = (dsc) xscVar.f.get(Integer.valueOf(lccVar.t))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", dscVar.c);
        bundle2.putString("name", dscVar.a);
        bundle2.putString("referrer_name", dscVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(lcc.j(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(lcc.j(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(lcc.j(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(lcc.j(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(lcc.j(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
