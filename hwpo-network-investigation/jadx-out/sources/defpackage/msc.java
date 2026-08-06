package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class msc implements Runnable {
    public final /* synthetic */ dsc t;
    public final /* synthetic */ long u;
    public final /* synthetic */ xsc v;

    public msc(xsc xscVar, dsc dscVar, long j) {
        this.t = dscVar;
        this.u = j;
        Objects.requireNonNull(xscVar);
        this.v = xscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.u;
        xsc xscVar = this.v;
        xscVar.p(this.t, false, j);
        xscVar.e = null;
        tvc tvcVarP = xscVar.a.p();
        tvcVarP.g();
        tvcVarP.h();
        tvcVarP.u(new stc(tvcVarP, null));
    }
}
