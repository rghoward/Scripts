package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final qp1<?> a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public a(qp1<?> qp1Var) {
            this.a = qp1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final fg8<?> a;
        public final boolean b;

        public b(fg8 fg8Var, boolean z) {
            this.a = fg8Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a.equals(this.a) && bVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qp1 qp1Var = (qp1) obj;
            a aVar = new a(qp1Var);
            Iterator it = qp1Var.b.iterator();
            while (it.hasNext()) {
                fg8 fg8Var = (fg8) it.next();
                boolean z = qp1Var.e == 0;
                b bVar = new b(fg8Var, !z);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set = (Set) map.get(bVar);
                if (!set.isEmpty() && z) {
                    x24.b(fg8Var, ".", "Multiple components provide ");
                    return;
                }
                set.add(aVar);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            for (a aVar2 : (Set) it2.next()) {
                for (ay2 ay2Var : aVar2.a.c) {
                    if (ay2Var.c == 0) {
                        Set<a> set2 = (Set) map.get(new b(ay2Var.a, ay2Var.b == 2));
                        if (set2 != null) {
                            for (a aVar3 : set2) {
                                aVar2.b.add(aVar3);
                                aVar3.c.add(aVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<a> hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        for (a aVar4 : hashSet) {
            if (aVar4.c.isEmpty()) {
                hashSet2.add(aVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            a aVar5 = (a) hashSet2.iterator().next();
            hashSet2.remove(aVar5);
            i++;
            for (a aVar6 : aVar5.b) {
                aVar6.c.remove(aVar5);
                if (aVar6.c.isEmpty()) {
                    hashSet2.add(aVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (a aVar7 : hashSet) {
            if (!aVar7.c.isEmpty() && !aVar7.b.isEmpty()) {
                arrayList2.add(aVar7.a);
            }
        }
        throw new cy2("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
