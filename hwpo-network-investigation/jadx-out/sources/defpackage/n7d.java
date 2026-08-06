package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n7d implements Runnable {
    public final /* synthetic */ gl8 t;
    public final /* synthetic */ i7d u;
    public final /* synthetic */ lsc v;

    public n7d(gl8 gl8Var, i7d i7dVar, lsc lscVar) {
        this.t = gl8Var;
        this.u = i7dVar;
        this.v = lscVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (((w7d) this.t.t) != null) {
            throw null;
        }
        lsc lscVar = this.v;
        h7d h7dVarC = m6d.c();
        i7d i7dVarB = m6d.b(h7dVarC, this.u);
        try {
            lscVar.run();
            g2b g2bVar = g2b.a;
            m6d.b(h7dVarC, i7dVarB);
        } catch (Throwable th) {
            try {
                i6d.a(th);
                throw th;
            } catch (Throwable th2) {
                m6d.b(h7dVarC, i7dVarB);
                throw th2;
            }
        }
    }

    public final String toString() {
        lsc lscVar = this.v;
        StringBuilder sb = new StringBuilder(lscVar.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(lscVar);
        sb.append("]");
        return sb.toString();
    }
}
