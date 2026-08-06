package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cgc {
    public final cgc a;
    public final q8c b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public cgc(cgc cgcVar, q8c q8cVar) {
        this.a = cgcVar;
        this.b = q8cVar;
    }

    public final a8c a(a8c a8cVar) {
        return this.b.b(this, a8cVar);
    }

    public final a8c b(a2c a2cVar) {
        a8c a8cVarB = a8c.l;
        Iterator itQ = a2cVar.q();
        while (itQ.hasNext()) {
            a8cVarB = this.b.b(this, a2cVar.t(((Integer) itQ.next()).intValue()));
            if (a8cVarB instanceof d4c) {
                break;
            }
        }
        return a8cVarB;
    }

    public final cgc c() {
        return new cgc(this, this.b);
    }

    public final boolean d(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        cgc cgcVar = this.a;
        if (cgcVar != null) {
            return cgcVar.d(str);
        }
        return false;
    }

    public final void e(String str, a8c a8cVar) {
        cgc cgcVar;
        HashMap map = this.c;
        if (!map.containsKey(str) && (cgcVar = this.a) != null && cgcVar.d(str)) {
            cgcVar.e(str, a8cVar);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (a8cVar == null) {
                map.remove(str);
            } else {
                map.put(str, a8cVar);
            }
        }
    }

    public final void f(String str, a8c a8cVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        HashMap map = this.c;
        if (a8cVar == null) {
            map.remove(str);
        } else {
            map.put(str, a8cVar);
        }
    }

    public final a8c g(String str) {
        HashMap map = this.c;
        if (map.containsKey(str)) {
            return (a8c) map.get(str);
        }
        cgc cgcVar = this.a;
        if (cgcVar != null) {
            return cgcVar.g(str);
        }
        z90.a(al.d(str, " is not defined"));
        return null;
    }
}
