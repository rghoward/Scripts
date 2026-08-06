package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pxc extends fyc {
    public final AlarmManager d;
    public nxc e;
    public Integer f;

    public pxc(lzc lzcVar) {
        super(lzcVar);
        this.d = (AlarmManager) this.a.a.getSystemService("alarm");
    }

    @Override // defpackage.fyc
    public final void j() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = this.a.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), fbc.a));
        }
        m();
    }

    public final v8c k() {
        if (this.e == null) {
            this.e = new nxc(this, this.b.l);
        }
        return this.e;
    }

    public final void l() {
        h();
        tkc tkcVar = this.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.n.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = tkcVar.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), fbc.a));
        }
        k().c();
        m();
    }

    public final void m() {
        JobScheduler jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
    }

    public final int n() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(this.a.a.getPackageName())).hashCode());
        }
        return this.f.intValue();
    }
}
