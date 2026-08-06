package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fs9 extends is9<Object, Object> {
    @Override // defpackage.is9
    public final void f() {
        if (!this.w) {
            for (int i = 0; i < this.u.size(); i++) {
                ((tu3.a) c(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = d().iterator();
            while (it.hasNext()) {
                ((tu3.a) it.next().getKey()).getClass();
            }
        }
        super.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return g((Comparable) obj, obj2);
    }
}
