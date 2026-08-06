package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import defpackage.a78;
import defpackage.bwc;
import defpackage.fwc;
import defpackage.jwc;
import defpackage.lzc;
import defpackage.mec;
import defpackage.pd7;
import defpackage.thc;
import defpackage.ycc;
import defpackage.zvc;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements bwc {
    public jwc t;

    @Override // defpackage.bwc
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bwc
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final jwc d() {
        if (this.t == null) {
            this.t = new jwc(this);
        }
        return this.t;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final jwc jwcVarD = d();
        Service service = jwcVarD.a;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            a78.g(string);
            lzc lzcVarC = lzc.C(service);
            final thc thcVarB = lzcVarC.b();
            pd7 pd7Var = lzcVarC.l.c;
            thcVarB.n.b(string, "Local AppMeasurementJobService called. action");
            lzcVarC.e().p(new zvc(jwcVarD, lzcVarC, new Runnable() { // from class: dwc
                @Override // java.lang.Runnable
                public final void run() {
                    thcVarB.n.a("AppMeasurementJobService processed last upload request.");
                    ((bwc) jwcVarD.a).c(jobParameters);
                }
            }));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        a78.g(string);
        mec mecVarE = mec.e(service, null);
        fwc fwcVar = new fwc(jwcVarD, jobParameters);
        mecVarE.getClass();
        mecVarE.c(new ycc(mecVarE, fwcVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // defpackage.bwc
    public final void b(Intent intent) {
    }
}
