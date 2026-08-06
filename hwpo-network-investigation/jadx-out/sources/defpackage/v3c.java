package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v3c extends z3c {
    public v3c() {
        Map map = Collections.EMPTY_MAP;
        this.v = map;
        this.y = map;
    }

    @Override // defpackage.z3c
    public final void a() {
        if (!this.w) {
            if (this.u > 0) {
                ((j1c) b(0).t).d();
                throw null;
            }
            Iterator it = c().iterator();
            if (it.hasNext()) {
                ((j1c) ((Map.Entry) it.next()).getKey()).d();
                throw null;
            }
        }
        super.a();
    }
}
