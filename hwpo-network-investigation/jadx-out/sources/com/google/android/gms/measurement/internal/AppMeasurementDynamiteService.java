package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.a78;
import defpackage.aa0;
import defpackage.bpc;
import defpackage.byc;
import defpackage.dsc;
import defpackage.ecc;
import defpackage.fkc;
import defpackage.fpc;
import defpackage.fqc;
import defpackage.hrc;
import defpackage.icc;
import defpackage.jcc;
import defpackage.joc;
import defpackage.kbc;
import defpackage.kkc;
import defpackage.lcc;
import defpackage.m0d;
import defpackage.mqc;
import defpackage.mrc;
import defpackage.n30;
import defpackage.npc;
import defpackage.obc;
import defpackage.omc;
import defpackage.pd7;
import defpackage.phc;
import defpackage.poc;
import defpackage.ppc;
import defpackage.qbc;
import defpackage.qpc;
import defpackage.qrc;
import defpackage.rsc;
import defpackage.se7;
import defpackage.spc;
import defpackage.src;
import defpackage.tbc;
import defpackage.thc;
import defpackage.tkc;
import defpackage.tnc;
import defpackage.toc;
import defpackage.tpc;
import defpackage.uxc;
import defpackage.v9c;
import defpackage.vpc;
import defpackage.vuc;
import defpackage.wfc;
import defpackage.wgc;
import defpackage.xsc;
import defpackage.y55;
import defpackage.yrc;
import defpackage.yyc;
import defpackage.yzc;
import defpackage.z9c;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends kbc {
    public tkc b = null;
    public final n30 c = new n30();

    @Override // defpackage.lbc
    public void beginAdUnitExposure(String str, long j) {
        g();
        ecc eccVar = this.b.n;
        tkc.j(eccVar);
        eccVar.h(j, str);
    }

    @Override // defpackage.lbc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.u(str, str2, bundle);
    }

    @Override // defpackage.lbc
    public void clearMeasurementEnabled(long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.h();
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new vpc(hrcVar, null));
    }

    @Override // defpackage.lbc
    public void endAdUnitExposure(String str, long j) {
        g();
        ecc eccVar = this.b.n;
        tkc.j(eccVar);
        eccVar.i(j, str);
    }

    public final void g() {
        if (this.b != null) {
            return;
        }
        aa0.c("Attempting to perform action before initialize.");
    }

    @Override // defpackage.lbc
    public void generateEventId(obc obcVar) {
        g();
        yzc yzcVar = this.b.i;
        tkc.k(yzcVar);
        long jF0 = yzcVar.f0();
        g();
        yzc yzcVar2 = this.b.i;
        tkc.k(yzcVar2);
        yzcVar2.V(obcVar, jF0);
    }

    @Override // defpackage.lbc
    public void getAppInstanceId(obc obcVar) {
        g();
        fkc fkcVar = this.b.g;
        tkc.m(fkcVar);
        fkcVar.p(new kkc(this, obcVar));
    }

    @Override // defpackage.lbc
    public void getCachedAppInstanceId(obc obcVar) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        i((String) hrcVar.g.get(), obcVar);
    }

    @Override // defpackage.lbc
    public void getConditionalUserProperties(String str, String str2, obc obcVar) {
        g();
        fkc fkcVar = this.b.g;
        tkc.m(fkcVar);
        fkcVar.p(new rsc(this, obcVar, str, str2));
    }

    @Override // defpackage.lbc
    public void getCurrentScreenClass(obc obcVar) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        xsc xscVar = hrcVar.a.l;
        tkc.l(xscVar);
        dsc dscVar = xscVar.c;
        i(dscVar != null ? dscVar.b : null, obcVar);
    }

    @Override // defpackage.lbc
    public void getCurrentScreenName(obc obcVar) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        xsc xscVar = hrcVar.a.l;
        tkc.l(xscVar);
        dsc dscVar = xscVar.c;
        i(dscVar != null ? dscVar.a : null, obcVar);
    }

    @Override // defpackage.lbc
    public void getGmpAppId(obc obcVar) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        i(hrcVar.v(), obcVar);
    }

    @Override // defpackage.lbc
    public void getMaxUserProperties(String str, obc obcVar) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        a78.d(str);
        hrcVar.a.getClass();
        g();
        yzc yzcVar = this.b.i;
        tkc.k(yzcVar);
        yzcVar.W(obcVar, 25);
    }

    @Override // defpackage.lbc
    public void getSessionId(obc obcVar) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new npc(hrcVar, obcVar));
    }

    @Override // defpackage.lbc
    public void getTestFlag(obc obcVar, int i) {
        g();
        if (i == 0) {
            yzc yzcVar = this.b.i;
            tkc.k(yzcVar);
            hrc hrcVar = this.b.m;
            tkc.l(hrcVar);
            AtomicReference atomicReference = new AtomicReference();
            fkc fkcVar = hrcVar.a.g;
            tkc.m(fkcVar);
            yzcVar.U((String) fkcVar.q(atomicReference, 15000L, "String test flag value", new ppc(hrcVar, atomicReference)), obcVar);
            return;
        }
        if (i == 1) {
            yzc yzcVar2 = this.b.i;
            tkc.k(yzcVar2);
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            fkc fkcVar2 = hrcVar2.a.g;
            tkc.m(fkcVar2);
            yzcVar2.V(obcVar, ((Long) fkcVar2.q(atomicReference2, 15000L, "long test flag value", new qpc(hrcVar2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            yzc yzcVar3 = this.b.i;
            tkc.k(yzcVar3);
            hrc hrcVar3 = this.b.m;
            tkc.l(hrcVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            fkc fkcVar3 = hrcVar3.a.g;
            tkc.m(fkcVar3);
            double dDoubleValue = ((Double) fkcVar3.q(atomicReference3, 15000L, "double test flag value", new tpc(hrcVar3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                obcVar.D(bundle);
                return;
            } catch (RemoteException e) {
                thc thcVar = yzcVar3.a.f;
                tkc.m(thcVar);
                thcVar.i.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            yzc yzcVar4 = this.b.i;
            tkc.k(yzcVar4);
            hrc hrcVar4 = this.b.m;
            tkc.l(hrcVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            fkc fkcVar4 = hrcVar4.a.g;
            tkc.m(fkcVar4);
            yzcVar4.W(obcVar, ((Integer) fkcVar4.q(atomicReference4, 15000L, "int test flag value", new spc(hrcVar4, atomicReference4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        yzc yzcVar5 = this.b.i;
        tkc.k(yzcVar5);
        hrc hrcVar5 = this.b.m;
        tkc.l(hrcVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        fkc fkcVar5 = hrcVar5.a.g;
        tkc.m(fkcVar5);
        yzcVar5.Y(obcVar, ((Boolean) fkcVar5.q(atomicReference5, 15000L, "boolean test flag value", new bpc(hrcVar5, atomicReference5))).booleanValue());
    }

    @Override // defpackage.lbc
    public void getUserProperties(String str, String str2, boolean z, obc obcVar) {
        g();
        fkc fkcVar = this.b.g;
        tkc.m(fkcVar);
        fkcVar.p(new poc(this, obcVar, str, str2, z));
    }

    public final void i(String str, obc obcVar) {
        g();
        yzc yzcVar = this.b.i;
        tkc.k(yzcVar);
        yzcVar.U(str, obcVar);
    }

    @Override // defpackage.lbc
    public void initForTests(Map map) {
        g();
    }

    @Override // defpackage.lbc
    public void initialize(y55 y55Var, jcc jccVar, long j) {
        tkc tkcVar = this.b;
        if (tkcVar == null) {
            Context context = (Context) se7.i(y55Var);
            a78.g(context);
            this.b = tkc.s(context, jccVar, Long.valueOf(j), null);
        } else {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.lbc
    public void initializeWithElapsedTime(y55 y55Var, jcc jccVar, long j, long j2) {
        tkc tkcVar = this.b;
        if (tkcVar == null) {
            Context context = (Context) se7.i(y55Var);
            a78.g(context);
            this.b = tkc.s(context, jccVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.lbc
    public void isDataCollectionEnabled(obc obcVar) {
        g();
        fkc fkcVar = this.b.g;
        tkc.m(fkcVar);
        fkcVar.p(new vuc(this, obcVar));
    }

    @Override // defpackage.lbc
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.l(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.lbc
    public void logEventAndBundle(String str, String str2, Bundle bundle, obc obcVar, long j) {
        g();
        a78.d(str2);
        String str3 = true != this.b.d.r(null, wfc.f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        z9c z9cVar = new z9c(str2, new v9c(bundle), str3, j, 0L);
        fkc fkcVar = this.b.g;
        tkc.m(fkcVar);
        fkcVar.p(new omc(this, obcVar, z9cVar, str));
    }

    @Override // defpackage.lbc
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.l(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.lbc
    public void logHealthData(int i, String str, y55 y55Var, y55 y55Var2, y55 y55Var3) {
        g();
        Object objI = y55Var == null ? null : se7.i(y55Var);
        Object objI2 = y55Var2 == null ? null : se7.i(y55Var2);
        Object objI3 = y55Var3 != null ? se7.i(y55Var3) : null;
        thc thcVar = this.b.f;
        tkc.m(thcVar);
        thcVar.p(i, true, false, str, objI, objI2, objI3);
    }

    @Override // defpackage.lbc
    public void onActivityCreated(y55 y55Var, Bundle bundle, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivityCreatedByScionActivityInfo(lcc.j(activity), bundle, j);
    }

    @Override // defpackage.lbc
    public void onActivityCreatedByScionActivityInfo(lcc lccVar, Bundle bundle, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fqc fqcVar = hrcVar.c;
        if (fqcVar != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
            fqcVar.a(lccVar, bundle);
        }
    }

    @Override // defpackage.lbc
    public void onActivityDestroyed(y55 y55Var, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivityDestroyedByScionActivityInfo(lcc.j(activity), j);
    }

    @Override // defpackage.lbc
    public void onActivityDestroyedByScionActivityInfo(lcc lccVar, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fqc fqcVar = hrcVar.c;
        if (fqcVar != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
            fqcVar.b(lccVar);
        }
    }

    @Override // defpackage.lbc
    public void onActivityPaused(y55 y55Var, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivityPausedByScionActivityInfo(lcc.j(activity), j);
    }

    @Override // defpackage.lbc
    public void onActivityPausedByScionActivityInfo(lcc lccVar, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fqc fqcVar = hrcVar.c;
        if (fqcVar != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
            fqcVar.c(lccVar);
        }
    }

    @Override // defpackage.lbc
    public void onActivityResumed(y55 y55Var, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivityResumedByScionActivityInfo(lcc.j(activity), j);
    }

    @Override // defpackage.lbc
    public void onActivityResumedByScionActivityInfo(lcc lccVar, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fqc fqcVar = hrcVar.c;
        if (fqcVar != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
            fqcVar.d(lccVar);
        }
    }

    @Override // defpackage.lbc
    public void onActivitySaveInstanceState(y55 y55Var, obc obcVar, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(lcc.j(activity), obcVar, j);
    }

    @Override // defpackage.lbc
    public void onActivitySaveInstanceStateByScionActivityInfo(lcc lccVar, obc obcVar, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fqc fqcVar = hrcVar.c;
        Bundle bundle = new Bundle();
        if (fqcVar != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
            fqcVar.e(lccVar, bundle);
        }
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.b.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.lbc
    public void onActivityStarted(y55 y55Var, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivityStartedByScionActivityInfo(lcc.j(activity), j);
    }

    @Override // defpackage.lbc
    public void onActivityStartedByScionActivityInfo(lcc lccVar, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        if (hrcVar.c != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
        }
    }

    @Override // defpackage.lbc
    public void onActivityStopped(y55 y55Var, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        onActivityStoppedByScionActivityInfo(lcc.j(activity), j);
    }

    @Override // defpackage.lbc
    public void onActivityStoppedByScionActivityInfo(lcc lccVar, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        if (hrcVar.c != null) {
            hrc hrcVar2 = this.b.m;
            tkc.l(hrcVar2);
            hrcVar2.z();
        }
    }

    @Override // defpackage.lbc
    public void performAction(Bundle bundle, obc obcVar, long j) {
        g();
        obcVar.D(null);
    }

    @Override // defpackage.lbc
    public void registerOnMeasurementEventListener(tbc tbcVar) {
        Object m0dVar;
        g();
        n30 n30Var = this.c;
        synchronized (n30Var) {
            try {
                m0dVar = (tnc) n30Var.get(Integer.valueOf(tbcVar.f()));
                if (m0dVar == null) {
                    m0dVar = new m0d(this, tbcVar);
                    n30Var.put(Integer.valueOf(tbcVar.f()), m0dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.h();
        if (hrcVar.e.add(m0dVar)) {
            return;
        }
        thc thcVar = hrcVar.a.f;
        tkc.m(thcVar);
        thcVar.i.a("OnEventListener already registered");
    }

    @Override // defpackage.lbc
    @Deprecated
    public void resetAnalyticsData(long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.g.set(null);
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new fpc(hrcVar, j));
    }

    @Override // defpackage.lbc
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.g.set(null);
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new fpc(hrcVar, j));
    }

    @Override // defpackage.lbc
    public void retrieveAndUploadBatches(qbc qbcVar) {
        yrc yrcVar;
        g();
        final hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.h();
        tkc tkcVar = hrcVar.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        if (fkcVar.m()) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        if (Thread.currentThread() == fkcVar2.d) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zB = pd7.b();
        thc thcVar3 = tkcVar.f;
        if (zB) {
            tkc.m(thcVar3);
            thcVar3.f.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        tkc.m(thcVar3);
        thcVar3.n.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            thc thcVar4 = tkcVar.f;
            tkc.m(thcVar4);
            thcVar4.n.a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            fkc fkcVar3 = tkcVar.g;
            tkc.m(fkcVar3);
            fkcVar3.q(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: frc
                @Override // java.lang.Runnable
                public final void run() {
                    final tvc tvcVarP = hrcVar.a.p();
                    final yxc yxcVarJ = yxc.j(asc.SGTM_CLIENT);
                    tvcVarP.g();
                    tvcVarP.h();
                    final q1d q1dVarW = tvcVarP.w(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    tvcVarP.u(new Runnable() { // from class: nvc
                        @Override // java.lang.Runnable
                        public final void run() {
                            tvc tvcVar = tvcVarP;
                            AtomicReference atomicReference3 = atomicReference2;
                            q1d q1dVar = q1dVarW;
                            yxc yxcVar = yxcVarJ;
                            synchronized (atomicReference3) {
                                try {
                                    jgc jgcVar = tvcVar.d;
                                    if (jgcVar != null) {
                                        jgcVar.s(q1dVar, yxcVar, new etc(tvcVar, atomicReference3));
                                        tvcVar.t();
                                    } else {
                                        thc thcVar5 = tvcVar.a.f;
                                        tkc.m(thcVar5);
                                        thcVar5.f.a("[sgtm] Failed to get upload batches; not connected to service");
                                    }
                                } catch (RemoteException e) {
                                    thc thcVar6 = tvcVar.a.f;
                                    tkc.m(thcVar6);
                                    thcVar6.f.b(e, "[sgtm] Failed to get upload batches; remote exception");
                                    atomicReference3.notifyAll();
                                }
                            }
                        }
                    });
                }
            });
            byc bycVar = (byc) atomicReference.get();
            if (bycVar == null) {
                break;
            }
            List list = bycVar.t;
            if (list.isEmpty()) {
                break;
            }
            thc thcVar5 = tkcVar.f;
            tkc.m(thcVar5);
            thcVar5.n.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                final uxc uxcVar = (uxc) it.next();
                try {
                    URL url = new URI(uxcVar.v).toURL();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    wgc wgcVarR = hrcVar.a.r();
                    wgcVarR.h();
                    a78.g(wgcVarR.g);
                    String str = wgcVarR.g;
                    tkc tkcVar2 = hrcVar.a;
                    thc thcVar6 = tkcVar2.f;
                    tkc.m(thcVar6);
                    phc phcVar = thcVar6.n;
                    Long lValueOf = Long.valueOf(uxcVar.t);
                    phcVar.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, uxcVar.v, Integer.valueOf(uxcVar.u.length));
                    if (!TextUtils.isEmpty(uxcVar.z)) {
                        thc thcVar7 = tkcVar2.f;
                        tkc.m(thcVar7);
                        thcVar7.n.c(lValueOf, uxcVar.z, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = uxcVar.w;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    src srcVar = tkcVar2.o;
                    tkc.m(srcVar);
                    byte[] bArr = uxcVar.u;
                    mrc mrcVar = new mrc() { // from class: hqc
                        /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                        /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r8
                          0x002d: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:13:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0065  */
                        @Override // defpackage.mrc
                        public final void a(String str3, int i2, Throwable th, byte[] bArr2, Map map2) {
                            yrc yrcVar2;
                            hrc hrcVar2 = hrcVar;
                            hrcVar2.g();
                            uxc uxcVar2 = uxcVar;
                            if (i2 == 200 || i2 == 204) {
                                if (th == null) {
                                    thc thcVar8 = hrcVar2.a.f;
                                    tkc.m(thcVar8);
                                    thcVar8.n.b(Long.valueOf(uxcVar2.t), "[sgtm] Upload succeeded for row_id");
                                    yrcVar2 = yrc.SUCCESS;
                                } else {
                                    thc thcVar9 = hrcVar2.a.f;
                                    tkc.m(thcVar9);
                                    thcVar9.i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(uxcVar2.t), Integer.valueOf(i2), th);
                                    if (Arrays.asList(((String) wfc.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                                        yrcVar2 = yrc.BACKOFF;
                                    } else {
                                        yrcVar2 = yrc.FAILURE;
                                    }
                                }
                            } else if (i2 == 304) {
                                i2 = 304;
                                if (th == null) {
                                    thc thcVar10 = hrcVar2.a.f;
                                    tkc.m(thcVar10);
                                    thcVar10.n.b(Long.valueOf(uxcVar2.t), "[sgtm] Upload succeeded for row_id");
                                    yrcVar2 = yrc.SUCCESS;
                                } else {
                                    thc thcVar11 = hrcVar2.a.f;
                                    tkc.m(thcVar11);
                                    thcVar11.i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(uxcVar2.t), Integer.valueOf(i2), th);
                                    if (Arrays.asList(((String) wfc.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                                        yrcVar2 = yrc.BACKOFF;
                                    } else {
                                        yrcVar2 = yrc.FAILURE;
                                    }
                                }
                            } else {
                                thc thcVar12 = hrcVar2.a.f;
                                tkc.m(thcVar12);
                                thcVar12.i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(uxcVar2.t), Integer.valueOf(i2), th);
                                if (Arrays.asList(((String) wfc.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                                    yrcVar2 = yrc.BACKOFF;
                                } else {
                                    yrcVar2 = yrc.FAILURE;
                                }
                            }
                            AtomicReference atomicReference3 = atomicReference2;
                            final tvc tvcVarP = hrcVar2.a.p();
                            long j = uxcVar2.t;
                            final c3c c3cVar = new c3c(j, yrcVar2.t, uxcVar2.y);
                            tvcVarP.g();
                            tvcVarP.h();
                            final q1d q1dVarW = tvcVarP.w(true);
                            tvcVarP.u(new Runnable() { // from class: pvc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q1d q1dVar = q1dVarW;
                                    c3c c3cVar2 = c3cVar;
                                    tvc tvcVar = tvcVarP;
                                    tkc tkcVar3 = tvcVar.a;
                                    jgc jgcVar = tvcVar.d;
                                    if (jgcVar == null) {
                                        thc thcVar13 = tkcVar3.f;
                                        tkc.m(thcVar13);
                                        thcVar13.f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                                        return;
                                    }
                                    try {
                                        jgcVar.F(q1dVar, c3cVar2);
                                        tvcVar.t();
                                    } catch (RemoteException e) {
                                        thc thcVar14 = tkcVar3.f;
                                        tkc.m(thcVar14);
                                        thcVar14.f.c(Long.valueOf(c3cVar2.t), e, "[sgtm] Failed to update batch upload status, rowId, exception");
                                    }
                                }
                            });
                            thc thcVar13 = hrcVar2.a.f;
                            tkc.m(thcVar13);
                            thcVar13.n.c(Long.valueOf(j), yrcVar2, "[sgtm] Updated status for row_id");
                            synchronized (atomicReference3) {
                                atomicReference3.set(yrcVar2);
                                atomicReference3.notifyAll();
                            }
                        }
                    };
                    srcVar.i();
                    a78.g(url);
                    a78.g(bArr);
                    fkc fkcVar4 = srcVar.a.g;
                    tkc.m(fkcVar4);
                    fkcVar4.s(new qrc(srcVar, str, url, bArr, map, mrcVar));
                    try {
                        yzc yzcVar = tkcVar2.i;
                        tkc.k(yzcVar);
                        tkc tkcVar3 = yzcVar.a;
                        tkcVar3.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    tkcVar3.k.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        thc thcVar8 = hrcVar.a.f;
                        tkc.m(thcVar8);
                        thcVar8.i.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    yrcVar = atomicReference2.get() == null ? yrc.UNKNOWN : (yrc) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    thc thcVar9 = hrcVar.a.f;
                    tkc.m(thcVar9);
                    thcVar9.f.d("[sgtm] Bad upload url for row_id", uxcVar.v, Long.valueOf(uxcVar.t), e);
                    yrcVar = yrc.FAILURE;
                }
                if (yrcVar != yrc.SUCCESS) {
                    if (yrcVar == yrc.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        thc thcVar10 = tkcVar.f;
        tkc.m(thcVar10);
        thcVar10.n.c(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            qbcVar.e();
        } catch (RemoteException e2) {
            tkc tkcVar4 = this.b;
            a78.g(tkcVar4);
            thc thcVar11 = tkcVar4.f;
            tkc.m(thcVar11);
            thcVar11.i.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // defpackage.lbc
    public void setConditionalUserProperty(Bundle bundle, long j) {
        g();
        tkc tkcVar = this.b;
        if (bundle == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Conditional user property must not be null");
        } else {
            hrc hrcVar = tkcVar.m;
            tkc.l(hrcVar);
            hrcVar.t(bundle, j);
        }
    }

    @Override // defpackage.lbc
    public void setConsentThirdParty(Bundle bundle, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.A(bundle, -20, j);
    }

    @Override // defpackage.lbc
    public void setCurrentScreen(y55 y55Var, String str, String str2, long j) {
        g();
        Activity activity = (Activity) se7.i(y55Var);
        a78.g(activity);
        setCurrentScreenByScionActivityInfo(lcc.j(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // defpackage.lbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(defpackage.lcc r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(lcc, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.lbc
    public void setDataCollectionEnabled(boolean z) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.h();
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new joc(hrcVar, z));
    }

    @Override // defpackage.lbc
    public void setDefaultEventParameters(Bundle bundle) {
        g();
        final hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new Runnable() { // from class: zqc
            @Override // java.lang.Runnable
            public final void run() {
                hrc hrcVar2 = hrcVar;
                opc opcVar = hrcVar2.v;
                tkc tkcVar = hrcVar2.a;
                Bundle bundle3 = bundle2;
                if (!bundle3.isEmpty()) {
                    zic zicVar = tkcVar.e;
                    yzc yzcVar = tkcVar.i;
                    t7c t7cVar = tkcVar.d;
                    thc thcVar = tkcVar.f;
                    tkc.k(zicVar);
                    Bundle bundle4 = new Bundle(zicVar.y.a());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            tkc.k(yzcVar);
                            if (yzc.t0(obj)) {
                                yzc.y(opcVar, null, 27, null, null, 0);
                            }
                            tkc.m(thcVar);
                            thcVar.k.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (yzc.L(str)) {
                            tkc.m(thcVar);
                            thcVar.k.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            tkc.k(yzcVar);
                            t7cVar.getClass();
                            if (yzcVar.k("param", str, 500, obj)) {
                                yzcVar.x(bundle4, str, obj);
                            }
                        }
                    }
                    tkc.k(yzcVar);
                    yzc yzcVar2 = t7cVar.a.i;
                    tkc.k(yzcVar2);
                    int i = yzcVar2.R(201500000) ? 100 : 25;
                    if (bundle4.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle4.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle4.remove(str2);
                            }
                        }
                        tkc.k(yzcVar);
                        yzc.y(opcVar, null, 26, null, null, 0);
                        tkc.m(thcVar);
                        thcVar.k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                zic zicVar2 = tkcVar.e;
                tkc.k(zicVar2);
                zicVar2.y.b(bundle3);
                tkcVar.p().l(bundle3);
            }
        });
    }

    @Override // defpackage.lbc
    public void setEventInterceptor(tbc tbcVar) {
        g();
        yyc yycVar = new yyc(this, tbcVar);
        fkc fkcVar = this.b.g;
        tkc.m(fkcVar);
        boolean zM = fkcVar.m();
        tkc tkcVar = this.b;
        if (!zM) {
            fkc fkcVar2 = tkcVar.g;
            tkc.m(fkcVar2);
            fkcVar2.p(new mqc(this, yycVar));
            return;
        }
        hrc hrcVar = tkcVar.m;
        tkc.l(hrcVar);
        hrcVar.g();
        hrcVar.h();
        yyc yycVar2 = hrcVar.d;
        if (yycVar != yycVar2) {
            a78.i("EventInterceptor already set.", yycVar2 == null);
        }
        hrcVar.d = yycVar;
    }

    @Override // defpackage.lbc
    public void setInstanceIdProvider(icc iccVar) {
        g();
    }

    @Override // defpackage.lbc
    public void setMeasurementEnabled(boolean z, long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        Boolean boolValueOf = Boolean.valueOf(z);
        hrcVar.h();
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new vpc(hrcVar, boolValueOf));
    }

    @Override // defpackage.lbc
    public void setMinimumSessionDuration(long j) {
        g();
    }

    @Override // defpackage.lbc
    public void setSessionTimeoutDuration(long j) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        fkc fkcVar = hrcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new toc(hrcVar, j));
    }

    @Override // defpackage.lbc
    public void setSgtmDebugInfo(Intent intent) {
        g();
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        tkc tkcVar = hrcVar.a;
        Uri data = intent.getData();
        if (data == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.l.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.l.a("[sgtm] Preview Mode was not enabled.");
            tkcVar.d.c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        thc thcVar3 = tkcVar.f;
        tkc.m(thcVar3);
        thcVar3.l.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        tkcVar.d.c = queryParameter2;
    }

    @Override // defpackage.lbc
    public void setUserId(final String str, long j) {
        g();
        final hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        tkc tkcVar = hrcVar.a;
        if (str != null && TextUtils.isEmpty(str)) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.a("User ID must be non-empty or null");
        } else {
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new Runnable() { // from class: brc
                @Override // java.lang.Runnable
                public final void run() {
                    tkc tkcVar2 = hrcVar.a;
                    wgc wgcVarR = tkcVar2.r();
                    String str2 = wgcVarR.r;
                    String str3 = str;
                    boolean z = false;
                    if (str2 != null && !str2.equals(str3)) {
                        z = true;
                    }
                    wgcVarR.r = str3;
                    if (z) {
                        tkcVar2.r().l();
                    }
                }
            });
            hrcVar.q(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.lbc
    public void setUserProperty(String str, String str2, y55 y55Var, boolean z, long j) {
        g();
        Object objI = se7.i(y55Var);
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.q(str, str2, objI, z, j);
    }

    @Override // defpackage.lbc
    public void unregisterOnMeasurementEventListener(tbc tbcVar) {
        Object m0dVar;
        g();
        n30 n30Var = this.c;
        synchronized (n30Var) {
            m0dVar = (tnc) n30Var.remove(Integer.valueOf(tbcVar.f()));
        }
        if (m0dVar == null) {
            m0dVar = new m0d(this, tbcVar);
        }
        hrc hrcVar = this.b.m;
        tkc.l(hrcVar);
        hrcVar.h();
        if (hrcVar.e.remove(m0dVar)) {
            return;
        }
        thc thcVar = hrcVar.a.f;
        tkc.m(thcVar);
        thcVar.i.a("OnEventListener had not been registered");
    }

    @Override // defpackage.lbc
    public void setConsent(Bundle bundle, long j) {
    }
}
