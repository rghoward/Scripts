package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class isc implements Runnable {
    public final /* synthetic */ xsc t;

    public isc(xsc xscVar) {
        Objects.requireNonNull(xscVar);
        this.t = xscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xsc xscVar = this.t;
        xscVar.e = xscVar.j;
    }
}
