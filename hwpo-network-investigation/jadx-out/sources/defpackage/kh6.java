package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh6<K, V> implements Map<K, V>, Serializable, bo5 {
    public static final kh6 G;
    public int A;
    public int B;
    public mh6<K> C;
    public nh6<V> D;
    public lh6<K, V> E;
    public boolean F;
    public K[] t;
    public V[] u;
    public int[] v;
    public int[] w;
    public int x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, zn5 {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.u;
            kh6<K, V> kh6Var = this.t;
            if (i >= kh6Var.y) {
                vl.b();
                return null;
            }
            this.u = i + 1;
            this.v = i;
            c cVar = new c(kh6Var, i);
            b();
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<K, V> implements Map.Entry<K, V>, zn5 {
        public final kh6<K, V> t;
        public final int u;
        public final int v;

        public c(kh6<K, V> kh6Var, int i) {
            kh6Var.getClass();
            this.t = kh6Var;
            this.u = i;
            this.v = kh6Var.A;
        }

        public final void a() {
            if (this.t.A != this.v) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return xj5.a(entry.getKey(), getKey()) && xj5.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return this.t.t[this.u];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            V[] vArr = this.t.u;
            vArr.getClass();
            return vArr[this.u];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            a();
            kh6<K, V> kh6Var = this.t;
            kh6Var.b();
            V[] vArr = kh6Var.u;
            if (vArr == null) {
                int length = kh6Var.t.length;
                if (length < 0) {
                    z90.a("capacity must be non-negative.");
                    return null;
                }
                vArr = (V[]) new Object[length];
                kh6Var.u = vArr;
            }
            int i = this.u;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d<K, V> {
        public final kh6<K, V> t;
        public int u;
        public int v;
        public int w;

        public d(kh6<K, V> kh6Var) {
            kh6Var.getClass();
            this.t = kh6Var;
            this.v = -1;
            this.w = kh6Var.A;
            b();
        }

        public final void a() {
            if (this.t.A == this.w) {
                return;
            }
            yk.b();
        }

        public final void b() {
            while (true) {
                int i = this.u;
                kh6<K, V> kh6Var = this.t;
                if (i >= kh6Var.y || kh6Var.v[i] >= 0) {
                    return;
                } else {
                    this.u = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.u < this.t.y;
        }

        public final void remove() {
            a();
            if (this.v == -1) {
                aa0.c("Call next() before removing element from the iterator.");
                return;
            }
            kh6<K, V> kh6Var = this.t;
            kh6Var.b();
            kh6Var.j(this.v);
            this.v = -1;
            this.w = kh6Var.A;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, zn5 {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i = this.u;
            kh6<K, V> kh6Var = this.t;
            if (i >= kh6Var.y) {
                vl.b();
                return null;
            }
            this.u = i + 1;
            this.v = i;
            K k = kh6Var.t[i];
            b();
            return k;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, zn5 {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i = this.u;
            kh6<K, V> kh6Var = this.t;
            if (i >= kh6Var.y) {
                vl.b();
                return null;
            }
            this.u = i + 1;
            this.v = i;
            V[] vArr = kh6Var.u;
            vArr.getClass();
            V v = vArr[this.v];
            b();
            return v;
        }
    }

    static {
        kh6 kh6Var = new kh6(0);
        kh6Var.F = true;
        G = kh6Var;
    }

    public kh6(int i) {
        if (i < 0) {
            z90.a("capacity must be non-negative.");
            throw null;
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.t = kArr;
        this.u = null;
        this.v = iArr;
        this.w = new int[iHighestOneBit];
        this.x = 2;
        this.y = 0;
        this.z = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(K k) {
        b();
        while (true) {
            int iH = h(k);
            int i = this.x * 2;
            int length = this.w.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.w;
                int i3 = iArr[iH];
                if (i3 == 0) {
                    int i4 = this.y;
                    K[] kArr = this.t;
                    if (i4 >= kArr.length) {
                        e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.y = i5;
                    kArr[i4] = k;
                    this.v[i4] = iH;
                    iArr[iH] = i5;
                    this.B++;
                    this.A++;
                    if (i2 > this.x) {
                        this.x = i2;
                    }
                    return i4;
                }
                if (xj5.a(this.t[i3 - 1], k)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    i(this.w.length * 2);
                    break;
                }
                iH = iH == 0 ? this.w.length - 1 : iH - 1;
            }
        }
    }

    public final void b() {
        if (this.F) {
            e44.b();
        }
    }

    public final void c(boolean z) {
        int i;
        V[] vArr = this.u;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.y;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.v;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.t;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.w[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        s.c(i3, i, this.t);
        if (vArr != null) {
            s.c(i3, this.y, vArr);
        }
        this.y = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.y - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.v;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.w[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        s.c(0, this.y, this.t);
        V[] vArr = this.u;
        if (vArr != null) {
            s.c(0, this.y, vArr);
        }
        this.B = 0;
        this.y = 0;
        this.A++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Collection<?> collection) {
        boolean zA;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = f(entry.getKey());
                    if (iF < 0) {
                        zA = false;
                    } else {
                        V[] vArr = this.u;
                        vArr.getClass();
                        zA = xj5.a(vArr[iF], entry.getValue());
                    }
                    if (!zA) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        K[] kArr = this.t;
        int length = kArr.length;
        int i2 = this.y;
        int i3 = length - i2;
        int i4 = i2 - this.B;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            int length2 = kArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.t = (K[]) Arrays.copyOf(kArr, i6);
            V[] vArr = this.u;
            this.u = vArr != null ? (V[]) Arrays.copyOf(vArr, i6) : null;
            this.v = Arrays.copyOf(this.v, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.w.length) {
                i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        lh6<K, V> lh6Var = this.E;
        if (lh6Var != null) {
            return lh6Var;
        }
        lh6<K, V> lh6Var2 = new lh6<>(this);
        this.E = lh6Var2;
        return lh6Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.B == map.size() && d(map.entrySet());
    }

    public final int f(K k) {
        int iH = h(k);
        int i = this.x;
        while (true) {
            int i2 = this.w[iH];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (xj5.a(this.t[i3], k)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.w.length - 1 : iH - 1;
        }
    }

    public final int g(V v) {
        int i = this.y;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.v[i] >= 0) {
                V[] vArr = this.u;
                vArr.getClass();
                if (xj5.a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        V[] vArr = this.u;
        vArr.getClass();
        return vArr[iF];
    }

    public final int h(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.z;
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.u;
            kh6<K, V> kh6Var = bVar.t;
            if (i2 >= kh6Var.y) {
                vl.b();
                return 0;
            }
            bVar.u = i2 + 1;
            bVar.v = i2;
            K k = kh6Var.t[i2];
            int iHashCode = k != null ? k.hashCode() : 0;
            V[] vArr = kh6Var.u;
            vArr.getClass();
            V v = vArr[bVar.v];
            int iHashCode2 = v != null ? v.hashCode() : 0;
            bVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void i(int i) {
        int[] iArr;
        this.A++;
        int i2 = 0;
        if (this.y > this.B) {
            c(false);
        }
        this.w = new int[i];
        this.z = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.y) {
            int i3 = i2 + 1;
            int iH = h(this.t[i2]);
            int i4 = this.x;
            while (true) {
                iArr = this.w;
                if (iArr[iH] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    aa0.c("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iH = iH == 0 ? iArr.length - 1 : iH - 1;
            }
            iArr[iH] = i3;
            this.v[i2] = iH;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.B == 0;
    }

    public final void j(int i) {
        int i2;
        int i3;
        int iH;
        int[] iArr;
        K[] kArr = this.t;
        kArr.getClass();
        kArr[i] = null;
        V[] vArr = this.u;
        if (vArr != null) {
            vArr[i] = null;
        }
        int length = this.v[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.w.length - 1 : length - 1;
                int[] iArr2 = this.w;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.x) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iH = h(this.t[i3]) - length;
                    iArr = this.w;
                }
            } while ((iH & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.v[i3] = i4;
        }
        this.v[i] = -1;
        this.B--;
        this.A++;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        mh6<K> mh6Var = this.C;
        if (mh6Var != null) {
            return mh6Var;
        }
        mh6<K> mh6Var2 = new mh6<>(this);
        this.C = mh6Var2;
        return mh6Var2;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        b();
        int iA = a(k);
        V[] vArr = this.u;
        if (vArr == null) {
            int length = this.t.length;
            if (length < 0) {
                z90.a("capacity must be non-negative.");
                return null;
            }
            vArr = (V[]) new Object[length];
            this.u = vArr;
        }
        if (iA >= 0) {
            vArr[iA] = v;
            return null;
        }
        int i = (-iA) - 1;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        b();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            V[] vArr = this.u;
            if (vArr == null) {
                int length = this.t.length;
                if (length < 0) {
                    z90.a("capacity must be non-negative.");
                    return;
                } else {
                    vArr = (V[]) new Object[length];
                    this.u = vArr;
                }
            }
            if (iA >= 0) {
                vArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!xj5.a(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        b();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        V[] vArr = this.u;
        vArr.getClass();
        V v = vArr[iF];
        j(iF);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.B * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = bVar.u;
            kh6<K, V> kh6Var = bVar.t;
            if (i2 >= kh6Var.y) {
                vl.b();
                return null;
            }
            bVar.u = i2 + 1;
            bVar.v = i2;
            K k = kh6Var.t[i2];
            if (k == kh6Var) {
                sb.append("(this Map)");
            } else {
                sb.append(k);
            }
            sb.append('=');
            V[] vArr = kh6Var.u;
            vArr.getClass();
            V v = vArr[bVar.v];
            if (v == kh6Var) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            bVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        nh6<V> nh6Var = this.D;
        if (nh6Var != null) {
            return nh6Var;
        }
        nh6<V> nh6Var2 = new nh6<>(this);
        this.D = nh6Var2;
        return nh6Var2;
    }

    public kh6() {
        this(8);
    }
}
