package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class flc implements Runnable {
    public final /* synthetic */ e5c t;
    public final /* synthetic */ zmc u;

    public flc(zmc zmcVar, e5c e5cVar) {
        this.t = e5cVar;
        Objects.requireNonNull(zmcVar);
        this.u = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zmc zmcVar = this.u;
        zmcVar.b.W();
        e5c e5cVar = this.t;
        Object objJ = e5cVar.v.j();
        lzc lzcVar = zmcVar.b;
        if (objJ == null) {
            lzcVar.getClass();
            String str = e5cVar.t;
            a78.g(str);
            q1d q1dVarQ = lzcVar.Q(str);
            if (q1dVarQ != null) {
                lzcVar.b0(e5cVar, q1dVarQ);
                return;
            }
            return;
        }
        lzcVar.getClass();
        String str2 = e5cVar.t;
        a78.g(str2);
        q1d q1dVarQ2 = lzcVar.Q(str2);
        if (q1dVarQ2 != null) {
            lzcVar.a0(e5cVar, q1dVarQ2);
        }
    }
}
