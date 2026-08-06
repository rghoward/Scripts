package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gs9 extends hs9<su3.a<Object>, Object> {
    @Override // defpackage.hs9
    public final void f() {
        if (!this.v) {
            for (int i = 0; i < this.t.size(); i++) {
                c(i).getKey().getClass();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((su3.a) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return g((Comparable) obj, obj2);
    }
}
