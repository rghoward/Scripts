package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class mf6<T, Y> {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<Y> {
        public final Y a;
        public final int b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, Object obj) {
            this.a = obj;
            this.b = i;
        }
    }

    public mf6(long j) {
        this.b = j;
    }

    public final synchronized Y a(T t) {
        a aVar;
        aVar = (a) this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public int b(Y y) {
        return 1;
    }

    public final synchronized Y d(T t, Y y) {
        int iB = b(y);
        long j = iB;
        if (j >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += j;
        }
        a aVar = (a) this.a.put(t, y == null ? null : new a(iB, y));
        if (aVar != null) {
            this.c -= (long) aVar.b;
            if (!aVar.a.equals(y)) {
                c(t, aVar.a);
            }
        }
        e(this.b);
        return aVar != null ? aVar.a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.c -= (long) aVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.a);
        }
    }

    public void c(T t, Y y) {
    }
}
