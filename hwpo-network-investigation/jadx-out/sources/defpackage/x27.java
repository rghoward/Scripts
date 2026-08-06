package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x27 extends t78 {
    public final LinkedHashMap a;
    public final h60 b;

    public /* synthetic */ x27(int i, boolean z) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    @Override // defpackage.t78
    public final Map<t78.a<?>, Object> a() {
        js7 js7Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iG = pi6.g(ph1.n(setEntrySet, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                js7Var = new js7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                js7Var = new js7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(js7Var.t, js7Var.u);
        }
        Map<t78.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t78
    public final <T> T b(t78.a<T> aVar) {
        aVar.getClass();
        T t = (T) this.a.get(aVar);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        return (T) Arrays.copyOf(bArr, bArr.length);
    }

    public final void e() {
        if (((AtomicBoolean) this.b.t).get()) {
            aa0.c("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof x27) {
            LinkedHashMap linkedHashMap = ((x27) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = xj5.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f() {
        e();
        this.a.clear();
    }

    public final <T> void g(t78.a<T> aVar, T t) {
        aVar.getClass();
        h(aVar, t);
    }

    public final void h(t78.a<?> aVar, Object obj) {
        aVar.getClass();
        e();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            e();
            linkedHashMap.remove(aVar);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(th1.X((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(aVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(aVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(aVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return th1.F(this.a.entrySet(), ",\n", "{\n", "\n}", new f7(2), 24);
    }

    public x27(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new h60(z);
    }

    public x27() {
        this(3, false);
    }
}
