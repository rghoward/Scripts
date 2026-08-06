package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 implements ak4<Object> {
    public volatile fe2 t;
    public final Object u = new Object();
    public final dx4.a v;

    public i20(dx4.a aVar) {
        this.v = aVar;
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = this.v.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t;
    }
}
