package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w8c implements Comparator {
    public final /* synthetic */ g6c t;
    public final /* synthetic */ cgc u;

    public w8c(g6c g6cVar, cgc cgcVar) {
        this.t = g6cVar;
        this.u = cgcVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        a8c a8cVar = (a8c) obj;
        a8c a8cVar2 = (a8c) obj2;
        if (a8cVar instanceof k8c) {
            return !(a8cVar2 instanceof k8c) ? 1 : 0;
        }
        if (a8cVar2 instanceof k8c) {
            return -1;
        }
        g6c g6cVar = this.t;
        return g6cVar == null ? a8cVar.c().compareTo(a8cVar2.c()) : (int) gic.h(g6cVar.a(this.u, Arrays.asList(a8cVar, a8cVar2)).d().doubleValue());
    }
}
