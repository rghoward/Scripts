package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zvc implements Runnable {
    public final /* synthetic */ lzc t;
    public final /* synthetic */ Runnable u;

    public zvc(jwc jwcVar, lzc lzcVar, Runnable runnable) {
        this.t = lzcVar;
        this.u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lzc lzcVar = this.t;
        lzcVar.W();
        lzcVar.e().g();
        if (lzcVar.p == null) {
            lzcVar.p = new ArrayList();
        }
        lzcVar.p.add(this.u);
        lzcVar.q();
    }
}
