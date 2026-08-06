package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 implements gn1 {
    public final a0a a;
    public final j74 b;

    public jn1() {
        a0a a0aVarB = b0a.b(null);
        this.a = a0aVarB;
        this.b = new j74(yk2.b(a0aVarB));
    }

    @Override // defpackage.gn1
    public final j74 a() {
        return this.b;
    }

    @Override // defpackage.gn1
    public final Object b(long j) {
        Iterable iterable = (List) this.a.getValue();
        if (iterable == null) {
            iterable = hf3.t;
        }
        for (Object obj : iterable) {
            if (((gk1) obj).a == j) {
                return obj;
            }
        }
        return null;
    }

    @Override // defpackage.gn1
    public final g2b c() {
        a0a a0aVar = this.a;
        Iterable iterable = (List) a0aVar.getValue();
        if (iterable == null) {
            iterable = hf3.t;
        }
        ArrayList arrayList = new ArrayList(ph1.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gk1.a((gk1) it.next(), null, false, true, null, 1007));
        }
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }

    @Override // defpackage.gn1
    public final g2b clear() {
        this.a.setValue(null);
        return g2b.a;
    }

    @Override // defpackage.gn1
    public final g2b d(gk1 gk1Var) {
        a0a a0aVar = this.a;
        Collection collection = (List) a0aVar.getValue();
        if (collection == null) {
            collection = hf3.t;
        }
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gk1 gk1Var2 = (gk1) obj;
            Long l = gk1Var2.b;
            long jLongValue = l != null ? l.longValue() : gk1Var2.a;
            Long l2 = gk1Var.b;
            if (l2 == null) {
                l2 = new Long(gk1Var.a);
            }
            if (jLongValue == l2.longValue()) {
                gk1Var2 = gk1Var;
            }
            arrayList2.add(gk1Var2);
        }
        a0aVar.getClass();
        a0aVar.l(null, arrayList2);
        return g2b.a;
    }

    @Override // defpackage.gn1
    public final g2b e(long j) {
        a0a a0aVar = this.a;
        Collection collection = (List) a0aVar.getValue();
        if (collection == null) {
            collection = hf3.t;
        }
        ArrayList arrayList = new ArrayList(collection);
        final hn1 hn1Var = new hn1(j);
        arrayList.removeIf(new Predicate() { // from class: in1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) hn1Var.invoke(obj)).booleanValue();
            }
        });
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }

    @Override // defpackage.gn1
    public final g2b f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new Long(((gk1) obj).a));
        }
        a0a a0aVar = this.a;
        Iterable iterable = (List) a0aVar.getValue();
        if (iterable == null) {
            iterable = hf3.t;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : iterable) {
            gk1 gk1Var = (gk1) obj2;
            if (gk1Var.b != null && !arrayList2.contains(new Long(gk1Var.a))) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayListK = th1.K(arrayList, arrayList3);
        a0aVar.getClass();
        a0aVar.l(null, arrayListK);
        return g2b.a;
    }

    @Override // defpackage.gn1
    public final g2b g(gk1 gk1Var) {
        a0a a0aVar = this.a;
        Collection collection = (List) a0aVar.getValue();
        if (collection == null) {
            collection = hf3.t;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add(gk1Var);
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }

    @Override // defpackage.gn1
    public final void h(String str, s60 s60Var) {
        Object next;
        str.getClass();
        a0a a0aVar = this.a;
        Iterable<gk1> iterable = (List) a0aVar.getValue();
        if (iterable == null) {
            iterable = hf3.t;
        }
        int i = 10;
        ArrayList arrayList = new ArrayList(ph1.n(iterable, 10));
        for (gk1 gk1VarA : iterable) {
            Iterator<T> it = gk1VarA.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                m89 m89Var = (m89) next;
                if (m89Var.j == u60.w && xj5.a(m89Var.c, str)) {
                    break;
                }
            }
            m89 m89Var2 = (m89) next;
            if (m89Var2 != null) {
                List<m89> list = gk1VarA.i;
                ArrayList arrayList2 = new ArrayList(ph1.n(list, i));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m89 m89VarA = (m89) it2.next();
                    Iterator it3 = it2;
                    if (m89VarA.a == m89Var2.a) {
                        m89VarA = m89.a(m89Var2, null, s60Var, 24575);
                    }
                    arrayList2.add(m89VarA);
                    it2 = it3;
                }
                gk1VarA = gk1.a(gk1VarA, null, false, false, arrayList2, 767);
            }
            arrayList.add(gk1VarA);
            i = 10;
        }
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
    }
}
