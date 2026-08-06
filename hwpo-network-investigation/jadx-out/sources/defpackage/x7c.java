package defpackage;

import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x7c {
    public final EnumMap a;

    public x7c(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(lnc.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void a(lnc lncVar, int i) {
        v7c v7cVar;
        if (i == -30) {
            v7cVar = v7c.TCF;
        } else if (i == -20) {
            v7cVar = v7c.API;
        } else if (i == -10) {
            v7cVar = v7c.MANIFEST;
        } else if (i != 0) {
            v7cVar = i != 30 ? v7c.UNSET : v7c.INITIALIZATION;
        } else {
            v7cVar = v7c.API;
        }
        this.a.put(lncVar, v7cVar);
    }

    public final void b(lnc lncVar, v7c v7cVar) {
        this.a.put(lncVar, v7cVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (lnc lncVar : lnc.values()) {
            v7c v7cVar = (v7c) this.a.get(lncVar);
            if (v7cVar == null) {
                v7cVar = v7c.UNSET;
            }
            sb.append(v7cVar.t);
        }
        return sb.toString();
    }

    public x7c() {
        this.a = new EnumMap(lnc.class);
    }
}
