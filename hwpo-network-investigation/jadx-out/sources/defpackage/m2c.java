package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m2c implements Map.Entry {
    public final Map.Entry t;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.t.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        o2c o2cVar = (o2c) this.t.getValue();
        if (o2cVar == null) {
            return null;
        }
        if (o2cVar.a == null) {
            synchronized (o2cVar) {
                if (o2cVar.a == null) {
                    try {
                        o2cVar.a = null;
                        o2cVar.b = p0c.u;
                    } catch (k2c unused) {
                        o2cVar.a = null;
                        o2cVar.b = p0c.u;
                    }
                }
            }
        }
        return o2cVar.a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof g3c)) {
            z90.a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        o2c o2cVar = (o2c) this.t.getValue();
        g3c g3cVar = o2cVar.a;
        o2cVar.b = null;
        o2cVar.a = (g3c) obj;
        return g3cVar;
    }
}
