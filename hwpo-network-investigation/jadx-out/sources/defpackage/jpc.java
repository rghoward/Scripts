package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jpc implements Runnable {
    public final /* synthetic */ AtomicReference t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ hrc w;

    public jpc(hrc hrcVar, AtomicReference atomicReference, String str, String str2) {
        this.t = atomicReference;
        this.u = str;
        this.v = str2;
        Objects.requireNonNull(hrcVar);
        this.w = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVarP = this.w.a.p();
        tvcVarP.g();
        tvcVarP.h();
        tvcVarP.u(new huc(tvcVarP, this.t, this.u, this.v, tvcVarP.w(false)));
    }
}
