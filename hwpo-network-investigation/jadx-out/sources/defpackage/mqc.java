package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mqc implements Runnable {
    public final /* synthetic */ yyc t;
    public final /* synthetic */ AppMeasurementDynamiteService u;

    public mqc(AppMeasurementDynamiteService appMeasurementDynamiteService, yyc yycVar) {
        this.t = yycVar;
        this.u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.u.b.m;
        tkc.l(hrcVar);
        hrcVar.g();
        hrcVar.h();
        yyc yycVar = hrcVar.d;
        yyc yycVar2 = this.t;
        if (yycVar2 != yycVar) {
            a78.i("EventInterceptor already set.", yycVar == null);
        }
        hrcVar.d = yycVar2;
    }
}
