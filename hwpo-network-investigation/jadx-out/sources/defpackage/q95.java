package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q95<E> extends b95<E> implements Set<E> {
    public static final /* synthetic */ int v = 0;
    public transient k95<E> u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<E> extends b95.a<E> {
        @Override // b95.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            e.getClass();
            c(e);
            return this;
        }

        public q95<E> g() {
            int i = this.b;
            if (i == 0) {
                int i2 = q95.v;
                return wl8.C;
            }
            Object[] objArr = this.a;
            if (i != 1) {
                q95<E> q95VarO = q95.o(i, objArr);
                this.b = q95VarO.size();
                this.c = true;
                return q95VarO;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i3 = q95.v;
            return new xq9(obj);
        }
    }

    public static int n(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            xl7.f("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> q95<E> o(int i, Object... objArr) {
        if (i == 0) {
            return wl8.C;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new xq9(obj);
        }
        int iN = n(i);
        Object[] objArr2 = new Object[iN];
        int i2 = iN - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                ac4.c(pp2.a(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iD = su0.d(iHashCode);
            while (true) {
                int i6 = iD & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iD++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new xq9(obj4);
        }
        if (n(i4) < iN / 2) {
            return o(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new wl8(i3, i2, i4, objArr, objArr2);
    }

    public static <E> q95<E> p(Collection<? extends E> collection) {
        if ((collection instanceof q95) && !(collection instanceof SortedSet)) {
            q95<E> q95Var = (q95) collection;
            if (!q95Var.k()) {
                return q95Var;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    @SafeVarargs
    public static <E> q95<E> r(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        xl7.f("the total number of elements must fit in an int", eArr.length <= 2147483641);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return o(length, objArr);
    }

    @Override // defpackage.b95
    public k95<E> d() {
        k95<E> k95Var = this.u;
        if (k95Var != null) {
            return k95Var;
        }
        k95<E> k95VarQ = q();
        this.u = k95VarQ;
        return k95VarQ;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q95) && (this instanceof wl8) && (((q95) obj) instanceof wl8) && ((wl8) this).x != obj.hashCode()) {
            return false;
        }
        return lk9.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lk9.c(this);
    }

    public k95<E> q() {
        Object[] array = toArray(b95.t);
        k95.b bVar = k95.u;
        return k95.n(array.length, array);
    }
}
