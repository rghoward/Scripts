package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wrc extends dgc {
    public JobScheduler c;

    @Override // defpackage.dgc
    public final boolean j() {
        return true;
    }

    public final void k(long j) {
        h();
        g();
        JobScheduler jobScheduler = this.c;
        tkc tkcVar = this.a;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(tkcVar.a.getPackageName())).hashCode()) != null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iL = l();
        if (iL != 2) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.n.b(pk.e(iL), "[sgtm] Not eligible for Scion upload");
            return;
        }
        thc thcVar3 = tkcVar.f;
        tkc.m(thcVar3);
        thcVar3.n.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(tkcVar.a.getPackageName())).hashCode(), new ComponentName(tkcVar.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.c;
        a78.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        thc thcVar4 = tkcVar.f;
        tkc.m(thcVar4);
        thcVar4.n.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int l() {
        h();
        g();
        if (this.c == null) {
            return 7;
        }
        tkc tkcVar = this.a;
        Boolean boolT = tkcVar.d.t("google_analytics_sgtm_upload_enabled");
        if (!(boolT == null ? false : boolT.booleanValue())) {
            return 8;
        }
        if (tkcVar.r().j < 119000) {
            return 6;
        }
        if (yzc.B(tkcVar.a)) {
            return !tkcVar.p().n() ? 5 : 2;
        }
        return 3;
    }
}
