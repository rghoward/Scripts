package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t9d {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final void a(cgc cgcVar, zyb zybVar) {
        lqc lqcVar = new lqc(zybVar);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            zxb zxbVarClone = zybVar.b.clone();
            a8c a8cVarA = ((y7c) treeMap.get(num)).a(cgcVar, Collections.singletonList(lqcVar));
            int iG = a8cVarA instanceof d5c ? gic.g(((d5c) a8cVarA).t.doubleValue()) : -1;
            if (iG == 2 || iG == -1) {
                zybVar.b = zxbVarClone;
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            a8c a8cVarA2 = ((y7c) treeMap2.get((Integer) it.next())).a(cgcVar, Collections.singletonList(lqcVar));
            if (a8cVarA2 instanceof d5c) {
                gic.g(((d5c) a8cVarA2).t.doubleValue());
            }
        }
    }
}
