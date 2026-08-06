package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zhc implements Runnable {
    public final xhc t;
    public final int u;
    public final Throwable v;
    public final byte[] w;
    public final String x;
    public final Map y;

    public /* synthetic */ zhc(String str, xhc xhcVar, int i, IOException iOException, byte[] bArr, Map map) {
        a78.g(xhcVar);
        this.t = xhcVar;
        this.u = i;
        this.v = iOException;
        this.w = bArr;
        this.x = str;
        this.y = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.a(this.x, this.u, this.v, this.w, this.y);
    }
}
