package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g6c implements a8c, r7c {
    public final String t;
    public final HashMap u = new HashMap();

    public g6c(String str) {
        this.t = str;
    }

    public abstract a8c a(cgc cgcVar, List list);

    @Override // defpackage.a8c
    public final String c() {
        return this.t;
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
        if (!(obj instanceof g6c)) {
            return false;
        }
        g6c g6cVar = (g6c) obj;
        String str = this.t;
        if (str != null) {
            return str.equals(g6cVar.t);
        }
        return false;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return new j7c(this.u.keySet().iterator());
    }

    public final int hashCode() {
        String str = this.t;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.r7c
    public final a8c i(String str) {
        HashMap map = this.u;
        return map.containsKey(str) ? (a8c) map.get(str) : a8c.l;
    }

    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        return "toString".equals(str) ? new i8c(this.t) : r7c.l(this, new i8c(str), cgcVar, arrayList);
    }

    @Override // defpackage.r7c
    public final void k(String str, a8c a8cVar) {
        HashMap map = this.u;
        if (a8cVar == null) {
            map.remove(str);
        } else {
            map.put(str, a8cVar);
        }
    }

    @Override // defpackage.r7c
    public final boolean o(String str) {
        return this.u.containsKey(str);
    }

    @Override // defpackage.a8c
    public a8c n() {
        return this;
    }
}
