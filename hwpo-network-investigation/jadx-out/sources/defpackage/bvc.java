package defpackage;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bvc implements Runnable {
    public final /* synthetic */ hvc t;

    public bvc(hvc hvcVar) {
        this.t = hvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVar = this.t.v;
        tvcVar.r(new ComponentName(tvcVar.a.a, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
