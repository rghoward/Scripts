package defpackage;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 implements u11 {
    public final a0a a;
    public final li8 b;
    public final ConcurrentHashMap<LocalDate, jd8> c;

    public v11() {
        a0a a0aVarB = b0a.b(null);
        this.a = a0aVarB;
        this.b = yk2.b(a0aVarB);
        this.c = new ConcurrentHashMap<>();
    }

    @Override // defpackage.u11
    public final li8 b() {
        return this.b;
    }

    @Override // defpackage.u11
    public final sc8 c(int i) {
        Object obj;
        Collection<jd8> collectionValues = this.c.values();
        collectionValues.getClass();
        Collection<jd8> collection = collectionValues;
        ArrayList arrayList = new ArrayList(ph1.n(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((jd8) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            rh1.o((Iterable) obj2, arrayList2);
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            obj = arrayList2.get(i2);
            i2++;
            if (((sc8) obj).a == i) {
                return (sc8) obj;
            }
        }
        obj = null;
        return (sc8) obj;
    }

    @Override // defpackage.qe1
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.u11
    public final void e(sc8 sc8Var) {
        LocalDate localDateM = sc8Var.e.m();
        ConcurrentHashMap<LocalDate, jd8> concurrentHashMap = this.c;
        jd8 jd8Var = concurrentHashMap.get(localDateM);
        if (jd8Var == null) {
            return;
        }
        List<sc8> list = jd8Var.a;
        Iterator<sc8> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().a == sc8Var.a) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, sc8Var);
        concurrentHashMap.put(localDateM, new jd8(arrayList, jd8Var.b));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(concurrentHashMap);
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, linkedHashMap);
    }

    @Override // defpackage.u11
    public final void f(HashMap map) {
        ConcurrentHashMap<LocalDate, jd8> concurrentHashMap = this.c;
        concurrentHashMap.putAll(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(concurrentHashMap);
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, linkedHashMap);
    }

    @Override // defpackage.u11
    public final jd8 g(LocalDate localDate) {
        localDate.getClass();
        jd8 jd8Var = this.c.get(localDate);
        if (jd8Var != null) {
            return jd8Var;
        }
        jd8.Companion.getClass();
        return jd8.c;
    }

    @Override // defpackage.u11
    public final Set<LocalDate> j() {
        Set<LocalDate> setKeySet = this.c.keySet();
        setKeySet.getClass();
        return setKeySet;
    }
}
