package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iad implements fad {
    @Override // defpackage.fad
    public final void a(d9d d9dVar, Iterator it, y9d y9dVar) {
        if (!d9dVar.c) {
            aa0.c("non repeating key");
            return;
        }
        if (!d9dVar.d || ((szb) szb.u.get()).t <= 20) {
            d9dVar.a(it, y9dVar);
            return;
        }
        while (it.hasNext()) {
            y9dVar.a(it.next(), d9dVar.a);
        }
    }
}
