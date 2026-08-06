package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k95<E> extends b95<E> implements List<E>, RandomAccess {
    public static final b u = new b(ul8.x, 0);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<E> extends b95.a<E> {
        public a() {
            super(4);
        }

        @Override // b95.b
        public final b95.b a(Object obj) {
            c(obj);
            return this;
        }

        public final void f(Object... objArr) {
            int length = objArr.length;
            pp0.b(length, objArr);
            e(length);
            System.arraycopy(objArr, 0, this.a, this.b, length);
            this.b += length;
        }

        public final ul8 g() {
            this.c = true;
            return k95.n(this.b, this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<E> extends h1<E> {
        public final k95<E> w;

        public b(k95<E> k95Var, int i) {
            super(k95Var.size(), i);
            this.w = k95Var;
        }

        @Override // defpackage.h1
        public final E a(int i) {
            return this.w.get(i);
        }
    }

    public static ul8 B(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            sk5.a(arrayList, it);
            list = arrayList;
        }
        Object[] array = list.toArray();
        pp0.b(array.length, array);
        Arrays.sort(array, comparator);
        return n(array.length, array);
    }

    public static ul8 n(int i, Object[] objArr) {
        return i == 0 ? ul8.x : new ul8(i, objArr);
    }

    public static <E> a<E> o(int i) {
        zg1.b(i, "expectedSize");
        return new a<>(i);
    }

    public static <E> k95<E> p(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return q((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return ul8.x;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return v(next);
        }
        a aVar = new a();
        aVar.c(next);
        while (it.hasNext()) {
            aVar.c(it.next());
        }
        return aVar.g();
    }

    public static <E> k95<E> q(Collection<? extends E> collection) {
        if (!(collection instanceof b95)) {
            Object[] array = collection.toArray();
            pp0.b(array.length, array);
            return n(array.length, array);
        }
        k95<E> k95VarD = ((b95) collection).d();
        if (!k95VarD.k()) {
            return k95VarD;
        }
        Object[] array2 = k95VarD.toArray(b95.t);
        return n(array2.length, array2);
    }

    public static ul8 r(Object[] objArr) {
        if (objArr.length == 0) {
            return ul8.x;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        pp0.b(objArr2.length, objArr2);
        return n(objArr2.length, objArr2);
    }

    public static ul8 u(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        pp0.b(5, objArr);
        return n(5, objArr);
    }

    public static ul8 v(Object obj) {
        Object[] objArr = {obj};
        pp0.b(1, objArr);
        return n(1, objArr);
    }

    public static ul8 w(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        pp0.b(2, objArr);
        return n(2, objArr);
    }

    @SafeVarargs
    public static ul8 x(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        xl7.f("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        pp0.b(length, objArr2);
        return n(length, objArr2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: C */
    public k95<E> subList(int i, int i2) {
        xl7.p(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? ul8.x : new d(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.b95
    public int e(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && e18.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (e18.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.b95
    /* JADX INFO: renamed from: l */
    public final w2b iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i) {
        xl7.o(i, size());
        return isEmpty() ? u : new b(this, i);
    }

    public k95<E> z() {
        return size() <= 1 ? this : new c(this);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c<E> extends k95<E> {
        public final transient k95<E> v;

        public c(k95<E> k95Var) {
            this.v = k95Var;
        }

        @Override // defpackage.k95, java.util.List
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public final k95<E> subList(int i, int i2) {
            k95<E> k95Var = this.v;
            xl7.p(i, i2, k95Var.size());
            return k95Var.subList(k95Var.size() - i2, k95Var.size() - i).z();
        }

        @Override // defpackage.k95, defpackage.b95, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.v.contains(obj);
        }

        @Override // java.util.List
        public final E get(int i) {
            k95<E> k95Var = this.v;
            xl7.k(i, k95Var.size());
            return k95Var.get((k95Var.size() - 1) - i);
        }

        @Override // defpackage.k95, java.util.List
        public final int indexOf(Object obj) {
            k95<E> k95Var = this.v;
            int iLastIndexOf = k95Var.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (k95Var.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // defpackage.k95, defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // defpackage.b95
        public final boolean k() {
            return this.v.k();
        }

        @Override // defpackage.k95, java.util.List
        public final int lastIndexOf(Object obj) {
            k95<E> k95Var = this.v;
            int iIndexOf = k95Var.indexOf(obj);
            if (iIndexOf >= 0) {
                return (k95Var.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // defpackage.k95, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.v.size();
        }

        @Override // defpackage.k95
        public final k95<E> z() {
            return this.v;
        }

        @Override // defpackage.k95, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends k95<E> {
        public final transient int v;
        public final transient int w;

        public d(int i, int i2) {
            this.v = i;
            this.w = i2;
        }

        @Override // defpackage.k95, java.util.List
        /* JADX INFO: renamed from: C */
        public final k95<E> subList(int i, int i2) {
            xl7.p(i, i2, this.w);
            int i3 = this.v;
            return k95.this.subList(i + i3, i2 + i3);
        }

        @Override // defpackage.b95
        public final Object[] f() {
            return k95.this.f();
        }

        @Override // java.util.List
        public final E get(int i) {
            xl7.k(i, this.w);
            return k95.this.get(i + this.v);
        }

        @Override // defpackage.b95
        public final int i() {
            return k95.this.j() + this.v + this.w;
        }

        @Override // defpackage.k95, defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // defpackage.b95
        public final int j() {
            return k95.this.j() + this.v;
        }

        @Override // defpackage.b95
        public final boolean k() {
            return true;
        }

        @Override // defpackage.k95, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.w;
        }

        @Override // defpackage.k95, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    @Override // defpackage.b95
    @Deprecated
    public final k95<E> d() {
        return this;
    }
}
