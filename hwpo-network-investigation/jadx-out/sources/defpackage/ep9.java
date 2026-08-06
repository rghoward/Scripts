package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ep9<K, V> {
    public int[] t;
    public Object[] u;
    public int v;

    public ep9(int i) {
        this.t = i == 0 ? ty1.a : new int[i];
        this.u = i == 0 ? ty1.c : new Object[i << 1];
    }

    public final int a(V v) {
        int i = this.v * 2;
        Object[] objArr = this.u;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (v.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.v;
        int[] iArr = this.t;
        if (iArr.length < i) {
            this.t = Arrays.copyOf(iArr, i);
            this.u = Arrays.copyOf(this.u, i * 2);
        }
        if (this.v == i2) {
            return;
        }
        yk.b();
    }

    public final int c(int i, Object obj) {
        int i2 = this.v;
        if (i2 == 0) {
            return -1;
        }
        int iD = ty1.d(i2, i, this.t);
        if (iD < 0 || xj5.a(obj, this.u[iD << 1])) {
            return iD;
        }
        int i3 = iD + 1;
        while (i3 < i2 && this.t[i3] == i) {
            if (xj5.a(obj, this.u[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iD - 1; i4 >= 0 && this.t[i4] == i; i4--) {
            if (xj5.a(obj, this.u[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.v > 0) {
            this.t = ty1.a;
            this.u = ty1.c;
            this.v = 0;
        }
        if (this.v <= 0) {
            return;
        }
        yk.b();
    }

    public boolean containsKey(K k) {
        return d(k) >= 0;
    }

    public boolean containsValue(V v) {
        return a(v) >= 0;
    }

    public final int d(K k) {
        return k == null ? e() : c(k.hashCode(), k);
    }

    public final int e() {
        int i = this.v;
        if (i == 0) {
            return -1;
        }
        int iD = ty1.d(i, 0, this.t);
        if (iD < 0 || this.u[iD << 1] == null) {
            return iD;
        }
        int i2 = iD + 1;
        while (i2 < i && this.t[i2] == 0) {
            if (this.u[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iD - 1; i3 >= 0 && this.t[i3] == 0; i3--) {
            if (this.u[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ep9) {
                int i = this.v;
                if (i != ((ep9) obj).v) {
                    return false;
                }
                ep9 ep9Var = (ep9) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    K kF = f(i2);
                    V vJ = j(i2);
                    Object obj2 = ep9Var.get(kF);
                    if (vJ == null) {
                        if (obj2 != null || !ep9Var.containsKey(kF)) {
                            return false;
                        }
                    } else if (!vJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.v != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.v;
            for (int i4 = 0; i4 < i3; i4++) {
                K kF2 = f(i4);
                V vJ2 = j(i4);
                Object obj3 = ((Map) obj).get(kF2);
                if (vJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kF2)) {
                        return false;
                    }
                } else if (!vJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final K f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.v) {
            z = true;
        }
        if (z) {
            return (K) this.u[i << 1];
        }
        z90.a(pp2.a(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public void g(ep9<? extends K, ? extends V> ep9Var) {
        ep9Var.getClass();
        int i = ep9Var.v;
        b(this.v + i);
        if (this.v != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ep9Var.f(i2), ep9Var.j(i2));
            }
        } else if (i > 0) {
            gz3.e(0, 0, i, ep9Var.t, this.t);
            gz3.f(0, 0, i << 1, ep9Var.u, this.u);
            this.v = i;
        }
    }

    public V get(K k) {
        int iD = d(k);
        if (iD >= 0) {
            return (V) this.u[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int iD = d(obj);
        return iD >= 0 ? (V) this.u[(iD << 1) + 1] : v;
    }

    public V h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.v)) {
            z90.a(pp2.a(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.u;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i4 = i2 - 1;
        int[] iArr = this.t;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                gz3.e(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.u;
                gz3.f(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.u;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.t = Arrays.copyOf(iArr, i7);
            this.u = Arrays.copyOf(this.u, i7 << 1);
            if (i2 != this.v) {
                yk.b();
                return null;
            }
            if (i > 0) {
                gz3.e(0, 0, i, iArr, this.t);
                gz3.f(0, 0, i3, objArr, this.u);
            }
            if (i < i4) {
                int i8 = i + 1;
                gz3.e(i, i8, i2, iArr, this.t);
                gz3.f(i3, i8 << 1, i2 << 1, objArr, this.u);
            }
        }
        if (i2 == this.v) {
            this.v = i4;
            return v;
        }
        yk.b();
        return null;
    }

    public int hashCode() {
        int[] iArr = this.t;
        Object[] objArr = this.u;
        int i = this.v;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public V i(int i, V v) {
        boolean z = false;
        if (i >= 0 && i < this.v) {
            z = true;
        }
        if (!z) {
            z90.a(pp2.a(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.u;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final boolean isEmpty() {
        return this.v <= 0;
    }

    public final V j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.v) {
            z = true;
        }
        if (z) {
            return (V) this.u[(i << 1) + 1];
        }
        z90.a(pp2.a(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public V put(K k, V v) {
        int i = this.v;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iC = k != null ? c(iHashCode, k) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.u;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iC;
        int[] iArr = this.t;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.t = Arrays.copyOf(iArr, i4);
            this.u = Arrays.copyOf(this.u, i4 << 1);
            if (i != this.v) {
                yk.b();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.t;
            int i5 = i3 + 1;
            gz3.e(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.u;
            gz3.f(i5 << 1, i3 << 1, this.v << 1, objArr2, objArr2);
        }
        int i6 = this.v;
        if (i == i6) {
            int[] iArr3 = this.t;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.u;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.v = i6 + 1;
                return null;
            }
        }
        yk.b();
        return null;
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final boolean remove(K k, V v) {
        int iD = d(k);
        if (iD < 0 || !xj5.a(v, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iD = d(k);
        if (iD < 0 || !xj5.a(v, j(iD))) {
            return false;
        }
        i(iD, v2);
        return true;
    }

    public final int size() {
        return this.v;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.v * 28);
        sb.append('{');
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kF = f(i2);
            if (kF != sb) {
                sb.append(kF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vJ = j(i2);
            if (vJ != sb) {
                sb.append(vJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V remove(K k) {
        int iD = d(k);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iD = d(k);
        if (iD >= 0) {
            return i(iD, v);
        }
        return null;
    }

    public ep9() {
        this(0);
    }
}
