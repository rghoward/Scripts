package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hp7<Key, Value> {
    public final qr7 a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public final zx0 e;
    public final zx0 f;
    public final LinkedHashMap g;
    public final l27 h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<Key, Value> {
        public final a47 a = new a47();
        public final hp7<Key, Value> b;

        public a(qr7 qr7Var) {
            this.b = new hp7<>(qr7Var);
        }
    }

    public hp7(qr7 qr7Var) {
        this.a = qr7Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.e = da1.a(-1, 6, null);
        this.f = da1.a(-1, 6, null);
        this.g = new LinkedHashMap();
        l27 l27Var = new l27();
        l27Var.c(wb6.t, ub6.b.b);
        this.h = l27Var;
    }

    public final as7<Key, Value> a(hjb.a aVar) {
        Integer numValueOf;
        qr7 qr7Var = this.a;
        int i = qr7Var.a;
        ArrayList arrayList = this.c;
        List listT = th1.T(arrayList);
        if (aVar != null) {
            int i2 = aVar.e;
            int i3 = -this.d;
            int size = (arrayList.size() - 1) - this.d;
            int size2 = 0;
            int i4 = i3;
            while (i4 < i2) {
                size2 += i4 > size ? i : ((zr7.b.C0297b) arrayList.get(this.d + i4)).t.size();
                i4++;
            }
            int i5 = size2 + aVar.f;
            if (i2 < i3) {
                i5 -= i;
            }
            numValueOf = Integer.valueOf(i5);
        } else {
            numValueOf = null;
        }
        return new as7<>(listT, numValueOf, qr7Var, 0);
    }

    public final boolean b(int i, wb6 wb6Var, zr7.b.C0297b<Key, Value> c0297b) {
        wb6Var.getClass();
        c0297b.getClass();
        int i2 = c0297b.w;
        List<Value> list = c0297b.t;
        int i3 = c0297b.x;
        int iOrdinal = wb6Var.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                aa0.c("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                aa0.c("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(c0297b);
            this.d = 0;
            g2b g2bVar = g2b.a;
            return true;
        }
        LinkedHashMap linkedHashMap = this.g;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                u.b();
                return false;
            }
            if (arrayList2.isEmpty()) {
                aa0.c("should've received an init before append");
                return false;
            }
            if (i == 0) {
                arrayList.add(c0297b);
                if (i3 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap.remove(wb6.v);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                aa0.c("should've received an init before prepend");
                return false;
            }
            if (i == 0) {
                arrayList.add(0, c0297b);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap.remove(wb6.u);
                return true;
            }
        }
        return false;
    }

    public final oo7.b c(zr7.b.C0297b c0297b, wb6 wb6Var) {
        int size;
        c0297b.getClass();
        int iOrdinal = wb6Var.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = 0 - this.d;
        } else {
            if (iOrdinal != 2) {
                u.b();
                return null;
            }
            size = (this.c.size() - this.d) - 1;
        }
        List listH = ws0.h(new cva(size, c0297b.t));
        int iOrdinal2 = wb6Var.ordinal();
        l27 l27Var = this.h;
        if (iOrdinal2 == 0) {
            oo7.b<Object> bVar = oo7.b.g;
            return oo7.b.a.a(listH, 0, 0, l27Var.d(), null);
        }
        if (iOrdinal2 == 1) {
            oo7.b<Object> bVar2 = oo7.b.g;
            return new oo7.b(wb6.u, listH, 0, -1, l27Var.d(), null);
        }
        if (iOrdinal2 != 2) {
            u.b();
            return null;
        }
        oo7.b<Object> bVar3 = oo7.b.g;
        return new oo7.b(wb6.v, listH, -1, 0, l27Var.d(), null);
    }
}
