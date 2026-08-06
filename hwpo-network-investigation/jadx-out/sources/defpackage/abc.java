package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class abc implements Runnable {
    public final /* synthetic */ long t;
    public final /* synthetic */ ecc u;

    public abc(ecc eccVar, long j) {
        this.t = j;
        Objects.requireNonNull(eccVar);
        this.u = eccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.u.m(this.t);
    }
}
