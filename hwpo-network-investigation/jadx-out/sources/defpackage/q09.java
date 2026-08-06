package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q09 {
    public final LinkedHashMap a;
    public final v09 b;

    public q09() {
        this.a = new LinkedHashMap();
        this.b = new v09(if3.t);
    }

    public final <T> T a(String str) {
        T t;
        v09 v09Var = this.b;
        LinkedHashMap linkedHashMap = v09Var.a;
        LinkedHashMap linkedHashMap2 = v09Var.d;
        try {
            i37 i37Var = (i37) linkedHashMap2.get(str);
            if (i37Var != null && (t = (T) i37Var.getValue()) != null) {
                return t;
            }
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            v09Var.c.remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(Object obj, String str) {
        Object obj2;
        if (obj != null) {
            ArrayList arrayList = w09.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                do {
                    if (i < size) {
                        obj2 = arrayList.get(i);
                        i++;
                    }
                } while (!((Class) obj2).isInstance(obj));
            }
            ca0.c(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = w09.a;
        Object obj3 = this.a.get(str);
        k27 k27Var = obj3 instanceof k27 ? (k27) obj3 : null;
        if (k27Var != null) {
            k27Var.j(obj);
        }
        this.b.a(obj, str);
    }

    public q09(kh6 kh6Var) {
        this.a = new LinkedHashMap();
        this.b = new v09(kh6Var);
    }
}
