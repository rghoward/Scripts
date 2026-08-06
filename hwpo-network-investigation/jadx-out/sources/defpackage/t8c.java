package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t8c implements Runnable {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ t8c(zmc zmcVar, q1d q1dVar) {
        this.u = zmcVar;
        this.v = q1dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.t) {
            case 0:
                enc encVar = (enc) this.u;
                encVar.a();
                if (!pd7.b()) {
                    v8c v8cVar = (v8c) this.v;
                    boolean z = v8cVar.c != 0;
                    v8cVar.c = 0L;
                    if (z) {
                        v8cVar.a();
                    }
                } else {
                    encVar.e().p(this);
                }
                break;
            default:
                zmc zmcVar = (zmc) this.u;
                q1d q1dVar = (q1d) this.v;
                lzc lzcVar = zmcVar.b;
                lzcVar.W();
                lzcVar.o0(q1dVar);
                break;
        }
    }

    public t8c(v8c v8cVar, enc encVar) {
        this.u = encVar;
        this.v = v8cVar;
    }
}
