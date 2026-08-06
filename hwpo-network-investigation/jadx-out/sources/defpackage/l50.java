package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l50 {
    public final Object a;
    public final b85 b;

    public l50(Object obj, b85 b85Var) {
        this.a = obj;
        this.b = b85Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (obj instanceof l50) {
                l50 l50Var = (l50) obj;
                Object obj2 = l50Var.a;
                Object obj3 = this.a;
                if (obj3 == obj2) {
                    zA = true;
                } else if ((obj3 instanceof k85) && (obj2 instanceof k85)) {
                    k85 k85Var = (k85) obj3;
                    k85 k85Var2 = (k85) obj2;
                    if (xj5.a(k85Var.a, k85Var2.a) && xj5.a(k85Var.b, k85Var2.b) && xj5.a(k85Var.e, k85Var2.e) && xj5.a(k85Var.f, k85Var2.f) && k85Var.g == k85Var2.g && xj5.a(k85Var.i, k85Var2.i) && xj5.a(k85Var.k, k85Var2.k) && k85Var.m == k85Var2.m && k85Var.n == k85Var2.n && k85Var.o == k85Var2.o && k85Var.p == k85Var2.p && k85Var.q == k85Var2.q && k85Var.r == k85Var2.r && k85Var.s == k85Var2.s && xj5.a(k85Var.y, k85Var2.y) && k85Var.z == k85Var2.z && k85Var.h == k85Var2.h && xj5.a(k85Var.A, k85Var2.A)) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else {
                    zA = xj5.a(obj3, obj2);
                }
                if (!zA || !xj5.a(this.b, l50Var.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = 0;
        if (obj instanceof k85) {
            k85 k85Var = (k85) obj;
            int iHashCode2 = (k85Var.b.hashCode() + (k85Var.a.hashCode() * 31)) * 961;
            ar6.a aVar = k85Var.e;
            int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            String str = k85Var.f;
            iHashCode = k85Var.A.t.hashCode() + ((k85Var.h.hashCode() + ((k85Var.z.hashCode() + ((k85Var.y.hashCode() + ((k85Var.s.hashCode() + ((k85Var.r.hashCode() + ((k85Var.q.hashCode() + uo2.a(uo2.a(uo2.a(uo2.a((ho2.a((k85Var.g.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 961, 31, k85Var.i) + Arrays.hashCode(k85Var.k.t)) * 31, k85Var.m, 31), k85Var.n, 31), k85Var.o, 31), k85Var.p, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else if (obj != null) {
            iHashCode = obj.hashCode();
        }
        return this.b.hashCode() + (iHashCode * 31);
    }
}
