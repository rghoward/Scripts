package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ead {
    public final HashMap a;
    public final HashMap b;
    public final had c;
    public final iad d;

    public ead(dad dadVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(dadVar.a);
        map2.putAll(dadVar.b);
        this.c = dadVar.c;
        this.d = dadVar.d;
    }

    public final void a(d9d d9dVar, Object obj, y9d y9dVar) {
        gad gadVar = (gad) this.a.get(d9dVar);
        if (gadVar != null) {
            gadVar.a(d9dVar, obj, y9dVar);
        } else {
            this.c.a(d9dVar, obj, y9dVar);
        }
    }

    public final void b(d9d d9dVar, Iterator it, y9d y9dVar) {
        fad fadVar = (fad) this.b.get(d9dVar);
        if (fadVar != null) {
            fadVar.a(d9dVar, it, y9dVar);
            return;
        }
        iad iadVar = this.d;
        if (iadVar != null && !this.a.containsKey(d9dVar)) {
            iadVar.a(d9dVar, it, y9dVar);
        } else {
            while (it.hasNext()) {
                a(d9dVar, it.next(), y9dVar);
            }
        }
    }
}
