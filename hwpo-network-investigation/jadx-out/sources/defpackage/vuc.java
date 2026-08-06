package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vuc implements Runnable {
    public final /* synthetic */ obc t;
    public final /* synthetic */ AppMeasurementDynamiteService u;

    public vuc(AppMeasurementDynamiteService appMeasurementDynamiteService, obc obcVar) {
        this.t = obcVar;
        this.u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.u;
        yzc yzcVar = appMeasurementDynamiteService.b.i;
        tkc.k(yzcVar);
        tkc tkcVar = appMeasurementDynamiteService.b;
        yzcVar.Y(this.t, tkcVar.y != null && tkcVar.y.booleanValue());
    }
}
