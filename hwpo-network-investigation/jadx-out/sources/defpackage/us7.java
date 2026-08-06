package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class us7 extends ws7<Iterable<Object>> {
    public final /* synthetic */ ws7 a;

    public us7(ws7 ws7Var) {
        this.a = ws7Var;
    }

    @Override // defpackage.ws7
    public final void a(sp8 sp8Var, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.a.a(sp8Var, it.next());
        }
    }
}
