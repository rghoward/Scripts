package defpackage;

import android.app.job.JobParameters;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fwc implements Runnable {
    public final /* synthetic */ jwc t;
    public final /* synthetic */ JobParameters u;

    public /* synthetic */ fwc(jwc jwcVar, JobParameters jobParameters) {
        this.t = jwcVar;
        this.u = jobParameters;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((bwc) this.t.a).c(this.u);
    }
}
