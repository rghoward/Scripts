package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class to1<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object C = new Object();
    public transient a A;
    public transient e B;
    public transient Object t;
    public transient int[] u;
    public transient Object[] v;
    public transient Object[] w;
    public transient int x;
    public transient int y;
    public transient c z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            to1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iD = to1Var.d(entry.getKey());
            return iD != -1 && e18.a(to1Var.j()[iD], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            return mapB != null ? mapB.entrySet().iterator() : new ro1(to1Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (to1Var.f()) {
                return false;
            }
            int iC = to1Var.c();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = to1Var.t;
            Objects.requireNonNull(obj2);
            int iC2 = uo1.c(key, value, iC, obj2, to1Var.h(), to1Var.i(), to1Var.j());
            if (iC2 == -1) {
                return false;
            }
            to1Var.e(iC2, iC);
            to1Var.y--;
            to1Var.x += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return to1.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class b<T> implements Iterator<T> {
        public int t;
        public int u;
        public int v;

        public b() {
            this.t = to1.this.x;
            this.u = to1.this.isEmpty() ? -1 : 0;
            this.v = -1;
        }

        public abstract T a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            to1 to1Var = to1.this;
            if (to1Var.x != this.t) {
                yk.b();
                return null;
            }
            if (!hasNext()) {
                vl.b();
                return null;
            }
            int i = this.u;
            this.v = i;
            T tA = a(i);
            int i2 = this.u + 1;
            if (i2 >= to1Var.y) {
                i2 = -1;
            }
            this.u = i2;
            return tA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            to1 to1Var = to1.this;
            if (to1Var.x != this.t) {
                yk.b();
                return;
            }
            xl7.q("no calls to next() since the last call to remove()", this.v >= 0);
            this.t += 32;
            to1Var.remove(to1Var.i()[this.v]);
            this.u--;
            this.v = -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            to1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return to1.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            return mapB != null ? mapB.keySet().iterator() : new qo1(to1Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            if (mapB != null) {
                return mapB.keySet().remove(obj);
            }
            return to1Var.g(obj) != to1.C;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return to1.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d extends y1<K, V> {
        public final K t;
        public int u;

        public d(int i) {
            Object obj = to1.C;
            this.t = (K) to1.this.i()[i];
            this.u = i;
        }

        public final void a() {
            int i = this.u;
            K k = this.t;
            to1 to1Var = to1.this;
            if (i != -1 && i < to1Var.size()) {
                if (e18.a(k, to1Var.i()[this.u])) {
                    return;
                }
            }
            Object obj = to1.C;
            this.u = to1Var.d(k);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.t;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            if (mapB != null) {
                return mapB.get(this.t);
            }
            a();
            int i = this.u;
            if (i == -1) {
                return null;
            }
            return (V) to1Var.j()[i];
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            K k = this.t;
            if (mapB != null) {
                return mapB.put(k, v);
            }
            a();
            int i = this.u;
            if (i == -1) {
                to1Var.put(k, v);
                return null;
            }
            V v2 = (V) to1Var.j()[i];
            to1Var.j()[this.u] = v;
            return v2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            to1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            to1 to1Var = to1.this;
            Map<K, V> mapB = to1Var.b();
            return mapB != null ? mapB.values().iterator() : new so1(to1Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return to1.this.size();
        }
    }

    public static <K, V> to1<K, V> a(int i) {
        to1<K, V> to1Var = new to1<>();
        xl7.f("Expected size must be >= 0", i >= 0);
        to1Var.x = Math.min(Math.max(i, 1), 1073741823);
        return to1Var;
    }

    public final Map<K, V> b() {
        Object obj = this.t;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.x & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.x += 32;
        Map<K, V> mapB = b();
        if (mapB != null) {
            this.x = Math.min(Math.max(size(), 3), 1073741823);
            mapB.clear();
            this.t = null;
            this.y = 0;
            return;
        }
        Arrays.fill(i(), 0, this.y, (Object) null);
        Arrays.fill(j(), 0, this.y, (Object) null);
        Object obj = this.t;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.y, 0);
        this.y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.y; i++) {
            if (e18.a(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iE = su0.e(obj);
        int iC = c();
        Object obj2 = this.t;
        Objects.requireNonNull(obj2);
        int iD = uo1.d(iE & iC, obj2);
        if (iD == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iE & i;
        do {
            int i3 = iD - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && e18.a(obj, i()[i3])) {
                return i3;
            }
            iD = i4 & iC;
        } while (iD != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.t;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i3];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i3];
        objArrI[i3] = null;
        objArrJ[i3] = null;
        iArrH[i] = iArrH[i3];
        iArrH[i3] = 0;
        int iE = su0.e(obj2) & i2;
        int iD = uo1.d(iE, obj);
        if (iD == size) {
            uo1.e(iE, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iD - 1;
            int i5 = iArrH[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrH[i4] = uo1.b(i5, i + 1, i2);
                return;
            }
            iD = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.A = aVar2;
        return aVar2;
    }

    public final boolean f() {
        return this.t == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.t;
            Objects.requireNonNull(obj2);
            int iC2 = uo1.c(obj, null, iC, obj2, h(), i(), null);
            if (iC2 != -1) {
                Object obj3 = j()[iC2];
                e(iC2, iC);
                this.y--;
                this.x += 32;
                return obj3;
            }
        }
        return C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return (V) j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.u;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object objA = uo1.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            uo1.e(i3 & i5, i4 + 1, objA);
        }
        Object obj = this.t;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iD = uo1.d(i6, obj);
            while (iD != 0) {
                int i7 = iD - 1;
                int i8 = iArrH[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iD2 = uo1.d(i10, objA);
                uo1.e(i10, iD, objA);
                iArrH[i7] = uo1.b(i9, iD2, i5);
                iD = i8 & i;
            }
        }
        this.t = objA;
        this.x = uo1.b(this.x, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.z;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.z = cVar2;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K r23, V r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to1.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        V v = (V) g(obj);
        if (v == C) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapB = b();
        return mapB != null ? mapB.size() : this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.B = eVar2;
        return eVar2;
    }
}
