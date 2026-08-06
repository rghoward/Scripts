package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wlc implements Runnable {
    public final /* synthetic */ z9c t;
    public final /* synthetic */ String u;
    public final /* synthetic */ zmc v;

    public wlc(zmc zmcVar, z9c z9cVar, String str) {
        this.t = z9cVar;
        this.u = str;
        Objects.requireNonNull(zmcVar);
        this.v = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zmc zmcVar = this.v;
        zmcVar.b.W();
        zmcVar.b.h(this.u, this.t);
    }
}
