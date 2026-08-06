package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xj2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                hc9 hc9Var = (hc9) obj;
                ec9.c(hc9Var, 0);
                ec9.b((String) obj2, hc9Var);
                return g2b.a;
            case 1:
                xu4 xu4Var = (xu4) obj2;
                x27 x27Var = (x27) obj;
                t78.a<Long> aVar = xu4.c;
                Map<t78.a<?>, Object> mapA = x27Var.a();
                LinkedHashMap linkedHashMap = x27Var.a;
                long j = 0;
                for (Map.Entry<t78.a<?>, Object> entry : mapA.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        t78.a<?> key = entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = xu4Var.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                u.c(obj3, "duplicate element: ");
                                return null;
                            }
                            x27Var.g(key, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            key.getClass();
                            x27Var.e();
                            linkedHashMap.remove(key);
                        }
                    }
                }
                if (j != 0) {
                    x27Var.g(aVar, Long.valueOf(j));
                    return null;
                }
                aVar.getClass();
                x27Var.e();
                linkedHashMap.remove(aVar);
                return null;
            default:
                hu9 hu9Var = (hu9) ((oh4) obj2).invoke((ou9) obj);
                synchronized (qu9.c) {
                    qu9.d = qu9.d.j(hu9Var.g());
                    g2b g2bVar = g2b.a;
                }
                return hu9Var;
        }
    }
}
