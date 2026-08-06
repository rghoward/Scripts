package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kkc implements Runnable {
    public final /* synthetic */ obc t;
    public final /* synthetic */ AppMeasurementDynamiteService u;

    public kkc(AppMeasurementDynamiteService appMeasurementDynamiteService, obc obcVar) {
        this.t = obcVar;
        this.u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVarP = this.u.b.p();
        tvcVarP.g();
        tvcVarP.h();
        tvcVarP.u(new ltc(tvcVarP, tvcVarP.w(false), this.t));
    }
}
