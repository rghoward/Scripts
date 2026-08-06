package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.bwc;
import defpackage.fkb;
import defpackage.jwc;
import defpackage.lzc;
import defpackage.thc;
import defpackage.tkc;
import defpackage.zmc;
import defpackage.zvc;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements bwc {
    public jwc t;

    @Override // defpackage.bwc
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.bwc
    public final void b(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = fkb.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = fkb.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bwc
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final jwc d() {
        if (this.t == null) {
            this.t = new jwc(this);
        }
        return this.t;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        jwc jwcVarD = d();
        jwcVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zmc(lzc.C(jwcVarD.a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", d().a.getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", d().a.getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final jwc jwcVarD = d();
        if (intent == null) {
            jwcVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = jwcVarD.a;
        final thc thcVar = tkc.s(service, null, null, null).f;
        tkc.m(thcVar);
        String action = intent.getAction();
        thcVar.n.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: hwc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = jwcVarD.a;
                bwc bwcVar = (bwc) service2;
                int i3 = i2;
                if (bwcVar.a(i3)) {
                    thcVar.n.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    thc thcVar2 = tkc.s(service2, null, null, null).f;
                    tkc.m(thcVar2);
                    thcVar2.n.a("Completed wakeful intent.");
                    bwcVar.b(intent);
                }
            }
        };
        lzc lzcVarC = lzc.C(service);
        lzcVarC.e().p(new zvc(jwcVarD, lzcVarC, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
