package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rsc implements Runnable {
    public final /* synthetic */ obc t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ AppMeasurementDynamiteService w;

    public rsc(AppMeasurementDynamiteService appMeasurementDynamiteService, obc obcVar, String str, String str2) {
        this.t = obcVar;
        this.u = str;
        this.v = str2;
        this.w = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVarP = this.w.b.p();
        tvcVarP.g();
        tvcVarP.h();
        tvcVarP.u(new juc(tvcVarP, this.u, this.v, tvcVarP.w(false), this.t));
    }
}
