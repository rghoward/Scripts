package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tlc implements Callable {
    public final /* synthetic */ q1d a;
    public final /* synthetic */ zmc b;

    public tlc(zmc zmcVar, q1d q1dVar) {
        this.a = q1dVar;
        this.b = zmcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        zmc zmcVar = this.b;
        zmcVar.b.W();
        return new z7c(zmcVar.b.q0(this.a.t));
    }
}
