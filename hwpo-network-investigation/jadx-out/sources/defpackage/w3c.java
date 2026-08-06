package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w3c implements Map.Entry, Comparable {
    public final Comparable t;
    public Object u;
    public final /* synthetic */ z3c v;

    public w3c(z3c z3cVar, Comparable comparable, Object obj) {
        this.v = z3cVar;
        this.t = comparable;
        this.u = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.t.compareTo(((w3c) obj).t);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.t;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.u;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.t;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.u;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.v.g();
        Object obj2 = this.u;
        this.u = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.t);
        String strValueOf2 = String.valueOf(this.u);
        return w27.a(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
