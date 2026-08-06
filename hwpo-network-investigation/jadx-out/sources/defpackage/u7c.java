package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class u7c implements a8c, r7c {
    public final HashMap t = new HashMap();

    @Override // defpackage.a8c
    public final String c() {
        return "[object Object]";
    }

    @Override // defpackage.a8c
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u7c) {
            return this.t.equals(((u7c) obj).t);
        }
        return false;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return new j7c(this.t.keySet().iterator());
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // defpackage.r7c
    public final a8c i(String str) {
        HashMap map = this.t;
        return map.containsKey(str) ? (a8c) map.get(str) : a8c.l;
    }

    @Override // defpackage.a8c
    public a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        return "toString".equals(str) ? new i8c(toString()) : r7c.l(this, new i8c(str), cgcVar, arrayList);
    }

    @Override // defpackage.r7c
    public final void k(String str, a8c a8cVar) {
        HashMap map = this.t;
        if (a8cVar == null) {
            map.remove(str);
        } else {
            map.put(str, a8cVar);
        }
    }

    @Override // defpackage.a8c
    public final a8c n() {
        u7c u7cVar = new u7c();
        for (Map.Entry entry : this.t.entrySet()) {
            boolean z = entry.getValue() instanceof r7c;
            HashMap map = u7cVar.t;
            if (z) {
                map.put((String) entry.getKey(), (a8c) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((a8c) entry.getValue()).n());
            }
        }
        return u7cVar;
    }

    @Override // defpackage.r7c
    public final boolean o(String str) {
        return this.t.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.t;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
