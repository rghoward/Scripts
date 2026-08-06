package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z17 extends lb2 {
    public z17(lb2 lb2Var) {
        lb2Var.getClass();
        LinkedHashMap linkedHashMap = lb2Var.a;
        linkedHashMap.getClass();
        this.a.putAll(linkedHashMap);
    }

    @Override // defpackage.lb2
    public final <T> T a(lb2.b<T> bVar) {
        return (T) this.a.get(bVar);
    }

    public /* synthetic */ z17(Object obj) {
        this((lb2) lb2.a.b);
    }
}
