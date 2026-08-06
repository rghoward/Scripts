package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c3b extends su8 implements kw9 {
    public final wq6 v;
    public final long w;

    public c3b(wq6 wq6Var, long j) {
        this.v = wq6Var;
        this.w = j;
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) {
        tx0Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.su8
    public final long k() {
        return this.w;
    }

    @Override // defpackage.su8
    public final wq6 m() {
        return this.v;
    }

    @Override // defpackage.su8
    public final hy0 p() {
        return new ni8(this);
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return voa.d;
    }

    @Override // defpackage.su8, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
