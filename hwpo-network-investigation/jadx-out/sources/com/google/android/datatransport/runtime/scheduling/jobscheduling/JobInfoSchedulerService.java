package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import defpackage.ac4;
import defpackage.ef0;
import defpackage.l4b;
import defpackage.o98;
import defpackage.pxa;
import defpackage.r98;
import defpackage.v4b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int t = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        pxa.b(getApplicationContext());
        if (string == null) {
            ac4.c("Null backendName");
            return false;
        }
        o98 o98VarB = r98.b(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        v4b v4bVar = pxa.a().d;
        v4bVar.e.execute(new l4b(v4bVar, new ef0(string, bArrDecode, o98VarB), i2, new Runnable() { // from class: il5
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = JobInfoSchedulerService.t;
                this.t.jobFinished(jobParameters, false);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
