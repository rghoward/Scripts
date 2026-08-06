package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p13 extends td4 {
    public boolean u;
    public final /* synthetic */ u13 v;
    public final /* synthetic */ u13.b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p13(kw9 kw9Var, u13 u13Var, u13.b bVar) {
        super(kw9Var);
        this.v = u13Var;
        this.w = bVar;
    }

    @Override // defpackage.td4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.u) {
            return;
        }
        this.u = true;
        u13 u13Var = this.v;
        u13.b bVar = this.w;
        synchronized (u13Var) {
            try {
                int i = bVar.h - 1;
                bVar.h = i;
                if (i == 0 && bVar.f) {
                    u13Var.H(bVar);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
