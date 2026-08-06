package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class omc implements Runnable {
    public final /* synthetic */ obc t;
    public final /* synthetic */ z9c u;
    public final /* synthetic */ String v;
    public final /* synthetic */ AppMeasurementDynamiteService w;

    public omc(AppMeasurementDynamiteService appMeasurementDynamiteService, obc obcVar, z9c z9cVar, String str) {
        this.t = obcVar;
        this.u = z9cVar;
        this.v = str;
        this.w = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVarP = this.w.b.p();
        tvcVarP.g();
        tvcVarP.h();
        tkc tkcVar = tvcVarP.a;
        yzc yzcVar = tkcVar.i;
        tkc.k(yzcVar);
        int iB = xn4.b.b(yzcVar.a.a, 12451000);
        obc obcVar = this.t;
        if (iB == 0) {
            tvcVarP.u(new wtc(tvcVarP, this.u, this.v, obcVar));
            return;
        }
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.i.a("Not bundling data. Service unavailable or out of date");
        yzc yzcVar2 = tkcVar.i;
        tkc.k(yzcVar2);
        yzcVar2.X(obcVar, new byte[0]);
    }
}
