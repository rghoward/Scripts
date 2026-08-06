package defpackage;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tkc implements enc {
    public static volatile tkc F;
    public int A;
    public int B;
    public final long D;
    public final long E;
    public final Context a;
    public final boolean b;
    public final pd7 c;
    public final t7c d;
    public final zic e;
    public final thc f;
    public final fkc g;
    public final cxc h;
    public final yzc i;
    public final fhc j;
    public final mq2 k;
    public final xsc l;
    public final hrc m;
    public final ecc n;
    public final src o;
    public final String p;
    public chc q;
    public tvc r;
    public n9c s;
    public wgc t;
    public wrc u;
    public Boolean w;
    public long x;
    public volatile Boolean y;
    public volatile boolean z;
    public boolean v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public tkc(xnc xncVar) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context context = xncVar.a;
        pd7 pd7Var = new pd7(3);
        this.c = pd7Var;
        cy.a = pd7Var;
        this.a = context;
        this.b = xncVar.e;
        this.y = xncVar.b;
        this.p = xncVar.h;
        this.z = true;
        if (hsc.b == null && context != null) {
            Object obj = hsc.a;
            synchronized (obj) {
                try {
                    if (hsc.b == null) {
                        synchronized (obj) {
                            try {
                                uqc uqcVar = hsc.b;
                                final Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (uqcVar == null || uqcVar.a != applicationContext2) {
                                    if (uqcVar != null) {
                                        Iterator it = wqc.a.values().iterator();
                                        if (it.hasNext()) {
                                            throw null;
                                        }
                                        wsc.a();
                                    }
                                    hsc.b = new uqc(applicationContext2, m5a.a(new l5a() { // from class: fsc
                                        @Override // defpackage.l5a
                                        public final /* synthetic */ Object get() {
                                            Object obj2 = hsc.a;
                                            return arc.a(applicationContext2);
                                        }
                                    }));
                                    hsc.c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.k = mq2.a;
        zw zwVar = ioc.a;
        kpc kpcVar = new kpc(context, ioc.a, zw.c.a, vn4.a.c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        s9a.a aVarA = s9a.a();
        aVarA.a = new r03(strConcat, new String[0]);
        kpcVar.b(0, aVarA.a());
        AtomicReference atomicReference = lrc.k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                lrc.b();
                nsc.a(Level.WARNING, (Executor) lrc.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = xncVar.f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.k.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.D = jCurrentTimeMillis;
        Long l2 = xncVar.g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.E = jElapsedRealtime;
        t7c t7cVar = new t7c(this);
        t7cVar.d = e18.b;
        this.d = t7cVar;
        zic zicVar = new zic(this);
        zicVar.j();
        this.e = zicVar;
        thc thcVar = new thc(this);
        thcVar.j();
        this.f = thcVar;
        yzc yzcVar = new yzc(this);
        yzcVar.j();
        this.i = yzcVar;
        this.j = new fhc(new vnc(this, xncVar));
        this.n = new ecc(this);
        xsc xscVar = new xsc(this);
        xscVar.i();
        this.l = xscVar;
        hrc hrcVar = new hrc(this);
        hrcVar.i();
        this.m = hrcVar;
        cxc cxcVar = new cxc(this);
        cxcVar.i();
        this.h = cxcVar;
        src srcVar = new src(this);
        srcVar.j();
        this.o = srcVar;
        fkc fkcVar = new fkc(this);
        fkcVar.j();
        this.g = fkcVar;
        jcc jccVar = xncVar.d;
        boolean z = jccVar == null || jccVar.u == 0;
        if (this.a.getApplicationContext() instanceof Application) {
            l(hrcVar);
            if (hrcVar.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) hrcVar.a.a.getApplicationContext();
                if (hrcVar.c == null) {
                    hrcVar.c = new fqc(hrcVar);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(hrcVar.c);
                    application.registerActivityLifecycleCallbacks(hrcVar.c);
                    thc thcVar2 = hrcVar.a.f;
                    m(thcVar2);
                    thcVar2.n.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(thcVar);
            thcVar.i.a("Application context is not an Application");
        }
        fkcVar.p(new pkc(this, xncVar));
    }

    public static final void j(tec tecVar) {
        if (tecVar != null) {
            return;
        }
        aa0.c("Component not created");
    }

    public static final void k(anc ancVar) {
        if (ancVar != null) {
            return;
        }
        aa0.c("Component not created");
    }

    public static final void l(dgc dgcVar) {
        if (dgcVar == null) {
            aa0.c("Component not created");
        } else {
            if (dgcVar.b) {
                return;
            }
            aa0.c("Component not initialized: ".concat(String.valueOf(dgcVar.getClass())));
        }
    }

    public static final void m(cnc cncVar) {
        if (cncVar == null) {
            aa0.c("Component not created");
        } else {
            if (cncVar.b) {
                return;
            }
            aa0.c("Component not initialized: ".concat(String.valueOf(cncVar.getClass())));
        }
    }

    public static tkc s(Context context, jcc jccVar, Long l, Long l2) {
        Bundle bundle;
        if (jccVar != null) {
            Bundle bundle2 = jccVar.w;
            jccVar = new jcc(jccVar.t, jccVar.u, jccVar.v, bundle2, null);
        }
        a78.g(context);
        a78.g(context.getApplicationContext());
        if (F == null) {
            synchronized (tkc.class) {
                try {
                    if (F == null) {
                        F = new tkc(new xnc(context, jccVar, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (jccVar != null && (bundle = jccVar.w) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            a78.g(F);
            F.y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        a78.g(F);
        return F;
    }

    @Override // defpackage.enc
    public final pd7 a() {
        return this.c;
    }

    @Override // defpackage.enc
    public final thc b() {
        thc thcVar = this.f;
        m(thcVar);
        return thcVar;
    }

    @Override // defpackage.enc
    public final mq2 c() {
        return this.k;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // defpackage.enc
    public final fkc e() {
        fkc fkcVar = this.g;
        m(fkcVar);
        return fkcVar;
    }

    @Override // defpackage.enc
    public final Context f() {
        return this.a;
    }

    public final int g() {
        fkc fkcVar = this.g;
        m(fkcVar);
        fkcVar.g();
        t7c t7cVar = this.d;
        if (t7cVar.u()) {
            return 1;
        }
        m(fkcVar);
        fkcVar.g();
        if (!this.z) {
            return 8;
        }
        zic zicVar = this.e;
        k(zicVar);
        zicVar.g();
        Boolean boolValueOf = zicVar.k().contains("measurement_enabled") ? Boolean.valueOf(zicVar.k().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        pd7 pd7Var = t7cVar.a.c;
        Boolean boolT = t7cVar.t("firebase_analytics_collection_enabled");
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 4;
        }
        return (this.y == null || this.y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        yzc yzcVar;
        Context context;
        boolean z = false;
        if (!this.v) {
            aa0.c("AppMeasurement is not initialized");
            return false;
        }
        fkc fkcVar = this.g;
        m(fkcVar);
        fkcVar.g();
        Boolean bool = this.w;
        mq2 mq2Var = this.k;
        if (bool == null || this.x == 0) {
            mq2Var.getClass();
            this.x = SystemClock.elapsedRealtime();
            yzcVar = this.i;
            k(yzcVar);
            if (yzcVar.K("android.permission.INTERNET") && yzcVar.K("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.a;
                if (wqb.a(context).c() || this.d.j() || (yzc.c0(context) && yzc.B(context))) {
                    z = true;
                }
            }
            this.w = Boolean.valueOf(z);
            if (z) {
                this.w = Boolean.valueOf(yzcVar.m(r().n()));
            }
        } else if (!bool.booleanValue()) {
            mq2Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.x) > 1000) {
                mq2Var.getClass();
                this.x = SystemClock.elapsedRealtime();
                yzcVar = this.i;
                k(yzcVar);
                if (yzcVar.K("android.permission.INTERNET")) {
                    context = this.a;
                    if (wqb.a(context).c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.w = Boolean.valueOf(z);
                if (z) {
                    this.w = Boolean.valueOf(yzcVar.m(r().n()));
                }
            }
        }
        return this.w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i(int i, Throwable th, byte[] bArr) {
        thc thcVar;
        thc thcVar2;
        int i2 = i;
        thc thcVar3 = this.f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                zic zicVar = this.e;
                k(zicVar);
                zicVar.t.b(true);
                if (bArr != null || bArr.length == 0) {
                    m(thcVar3);
                    thcVar3.m.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                    if (TextUtils.isEmpty(strOptString)) {
                        m(thcVar3);
                        thcVar3.m.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                    String strOptString3 = jSONObject.optString("gbraid", BuildConfig.FLAVOR);
                    String strOptString4 = jSONObject.optString("gad_source", BuildConfig.FLAVOR);
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    yzc yzcVar = this.i;
                    k(yzcVar);
                    tkc tkcVar = yzcVar.a;
                    if (TextUtils.isEmpty(strOptString)) {
                        thcVar2 = thcVar3;
                    } else {
                        Context context = tkcVar.a;
                        thcVar2 = thcVar3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.m.n("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = tkcVar.a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    thc thcVar4 = yzcVar.a.f;
                                    m(thcVar4);
                                    thcVar4.f.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                                m(thcVar);
                                thcVar.f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            thcVar = thcVar2;
                        }
                    }
                    m(thcVar2);
                    thcVar = thcVar2;
                    try {
                        thcVar.i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    thcVar = thcVar3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                zic zicVar2 = this.e;
                k(zicVar2);
                zicVar2.t.b(true);
                if (bArr != null) {
                }
                m(thcVar3);
                thcVar3.m.a("Deferred Deep Link response empty.");
                return;
            }
        }
        m(thcVar3);
        thcVar3.i.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final fhc n() {
        return this.j;
    }

    public final chc o() {
        l(this.q);
        return this.q;
    }

    public final tvc p() {
        l(this.r);
        return this.r;
    }

    public final n9c q() {
        m(this.s);
        return this.s;
    }

    public final wgc r() {
        l(this.t);
        return this.t;
    }
}
