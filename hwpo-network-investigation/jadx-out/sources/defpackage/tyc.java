package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tyc implements Callable {
    public final /* synthetic */ q1d a;
    public final /* synthetic */ lzc b;

    public tyc(lzc lzcVar, q1d q1dVar) {
        this.a = q1dVar;
        Objects.requireNonNull(lzcVar);
        this.b = lzcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        q1d q1dVar = this.a;
        String str = q1dVar.t;
        a78.g(str);
        lzc lzcVar = this.b;
        nnc nncVarD = lzcVar.d(str);
        lnc lncVar = lnc.ANALYTICS_STORAGE;
        if (nncVarD.i(lncVar) && nnc.c(100, q1dVar.L).i(lncVar)) {
            return lzcVar.d0(q1dVar).F();
        }
        lzcVar.b().n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
