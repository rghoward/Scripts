package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lx7<E> extends d2<E> implements Collection, ao5 {
    public int A;
    public j2 t;
    public Object[] u;
    public Object[] v;
    public int w;
    public x17 x = new x17();
    public Object[] y;
    public Object[] z;

    public lx7(j2 j2Var, Object[] objArr, Object[] objArr2, int i) {
        this.t = j2Var;
        this.u = objArr;
        this.v = objArr2;
        this.w = i;
        this.y = objArr;
        this.z = objArr2;
        this.A = j2Var.size();
    }

    public static void i(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] C(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            c78.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            c78.a("negative shift");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrR = r(objArr);
        int iC = t2.c(i, i2);
        int i3 = i2 - 5;
        objArrR[iC] = C((Object[]) objArrR[iC], i, i3, it);
        while (true) {
            iC++;
            if (iC >= 32 || !it.hasNext()) {
                break;
            }
            objArrR[iC] = C((Object[]) objArrR[iC], 0, i3, it);
        }
        return objArrR;
    }

    public final Object[] D(Object[] objArr, int i, Object[][] objArr2) {
        i30 i30Var = new i30(objArr2);
        int i2 = i >> 5;
        int i3 = this.w;
        Object[] objArrC = i2 < (1 << i3) ? C(objArr, i, i3, i30Var) : r(objArr);
        while (i30Var.hasNext()) {
            this.w += 5;
            objArrC = v(objArrC);
            int i4 = this.w;
            C(objArrC, 1 << i4, i4, i30Var);
        }
        return objArrC;
    }

    public final void E(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.A;
        int i2 = i >> 5;
        int i3 = this.w;
        if (i2 > (1 << i3)) {
            this.y = F(this.w + 5, v(objArr), objArr2);
            this.z = objArr3;
            this.w += 5;
            this.A++;
            return;
        }
        if (objArr == null) {
            this.y = objArr2;
            this.z = objArr3;
            this.A = i + 1;
        } else {
            this.y = F(i3, objArr, objArr2);
            this.z = objArr3;
            this.A++;
        }
    }

    public final Object[] F(int i, Object[] objArr, Object[] objArr2) {
        int iC = t2.c(d() - 1, i);
        Object[] objArrR = r(objArr);
        if (i == 5) {
            objArrR[iC] = objArr2;
            return objArrR;
        }
        objArrR[iC] = F(i - 5, (Object[]) objArrR[iC], objArr2);
        return objArrR;
    }

    public final int G(oh4 oh4Var, Object[] objArr, int i, int i2, pe7 pe7Var, ArrayList arrayList, ArrayList arrayList2) {
        if (p(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = pe7Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrU = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) oh4Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrU = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : u();
                    i2 = 0;
                }
                objArrU[i2] = obj2;
                i2++;
            }
        }
        pe7Var.a = objArrU;
        if (objArr2 != objArrU) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int H(oh4<? super E, Boolean> oh4Var, Object[] objArr, int i, pe7 pe7Var) {
        Object[] objArrR = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (oh4Var.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrR = r(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrR[i2] = obj;
                i2++;
            }
        }
        pe7Var.a = objArrR;
        return i2;
    }

    public final int I(oh4<? super E, Boolean> oh4Var, int i, pe7 pe7Var) {
        int iH = H(oh4Var, this.z, i, pe7Var);
        Object obj = pe7Var.a;
        if (iH == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iH, i, (Object) null);
        this.z = objArr;
        this.A -= i - iH;
        return iH;
    }

    public final boolean J(oh4<? super E, Boolean> oh4Var) {
        int i;
        oh4<? super E, Boolean> oh4Var2 = oh4Var;
        int iQ = Q();
        Object[] objArrW = null;
        pe7 pe7Var = new pe7(null);
        boolean z = false;
        if (this.y != null) {
            n1 n1VarQ = q(0);
            int iH = 32;
            while (iH == 32 && n1VarQ.hasNext()) {
                iH = H(oh4Var2, (Object[]) n1VarQ.next(), 32, pe7Var);
            }
            if (iH == 32) {
                int I = I(oh4Var2, iQ, pe7Var);
                if (I == 0) {
                    z(this.A, this.w, this.y);
                }
                if (I != iQ) {
                }
            } else {
                int i2 = (n1VarQ.t - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iG = iH;
                while (n1VarQ.hasNext()) {
                    iG = G(oh4Var2, (Object[]) n1VarQ.next(), 32, iG, pe7Var, arrayList2, arrayList);
                    oh4Var2 = oh4Var;
                }
                int iG2 = G(oh4Var, this.z, iQ, iG, pe7Var, arrayList2, arrayList);
                Object obj = pe7Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iG2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrC = this.y;
                if (zIsEmpty) {
                    objArrC.getClass();
                } else {
                    objArrC = C(objArrC, i2, this.w, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    c78.a("invalid size");
                }
                if (size == 0) {
                    this.w = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.w;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.w = i - 5;
                        Object[] objArr2 = objArrC[0];
                        objArr2.getClass();
                        objArrC = objArr2;
                    }
                    objArrW = w(i3, i, objArrC);
                }
                this.y = objArrW;
                this.z = objArr;
                this.A = size + iG2;
            }
            z = true;
        } else if (I(oh4Var2, iQ, pe7Var) != iQ) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] L(Object[] objArr, int i, int i2, pe7 pe7Var) {
        int iC = t2.c(i2, i);
        if (i == 0) {
            Object obj = objArr[iC];
            Object[] objArrR = r(objArr);
            gz3.f(iC, iC + 1, 32, objArr, objArrR);
            objArrR[31] = pe7Var.a;
            pe7Var.a = obj;
            return objArrR;
        }
        int iC2 = objArr[31] == null ? t2.c(N() - 1, i) : 31;
        Object[] objArrR2 = r(objArr);
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj2 = objArrR2[iC2];
                obj2.getClass();
                objArrR2[iC2] = L((Object[]) obj2, i3, 0, pe7Var);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj3 = objArrR2[iC];
        obj3.getClass();
        objArrR2[iC] = L((Object[]) obj3, i3, i2, pe7Var);
        return objArrR2;
    }

    public final Object M(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.A - i;
        Object[] objArr2 = this.z;
        if (i4 == 1) {
            Object obj = objArr2[0];
            z(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrR = r(objArr2);
        gz3.f(i3, i3 + 1, i4, objArr2, objArrR);
        objArrR[i4 - 1] = null;
        this.y = objArr;
        this.z = objArrR;
        this.A = (i + i4) - 1;
        this.w = i2;
        return obj2;
    }

    public final int N() {
        int i = this.A;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] O(Object[] objArr, int i, int i2, E e, pe7 pe7Var) {
        int iC = t2.c(i2, i);
        Object[] objArrR = r(objArr);
        if (i != 0) {
            Object obj = objArrR[iC];
            obj.getClass();
            objArrR[iC] = O((Object[]) obj, i - 5, i2, e, pe7Var);
            return objArrR;
        }
        if (objArrR != objArr) {
            ((AbstractList) this).modCount++;
        }
        pe7Var.a = objArrR[iC];
        objArrR[iC] = e;
        return objArrR;
    }

    public final void P(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrU;
        if (i3 < 1) {
            c78.a("requires at least one nullBuffer");
        }
        Object[] objArrR = r(objArr);
        objArr2[0] = objArrR;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            gz3.f(size + 1, i4, i2, objArrR, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrU = objArrR;
            } else {
                objArrU = u();
                i3--;
                objArr2[i3] = objArrU;
            }
            int i7 = i2 - i6;
            gz3.f(0, i7, i2, objArrR, objArr3);
            gz3.f(size + 1, i4, i7, objArrR, objArrU);
            objArr3 = objArrU;
        }
        Iterator<? extends E> it = collection.iterator();
        i(objArrR, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrU2 = u();
            i(objArrU2, 0, it);
            objArr2[i8] = objArrU2;
        }
        i(objArr3, 0, it);
    }

    public final int Q() {
        int i = this.A;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        l96.b(i, d());
        if (i == d()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        if (i >= iN) {
            n(i - iN, e, this.y);
            return;
        }
        pe7 pe7Var = new pe7(null);
        Object[] objArr = this.y;
        objArr.getClass();
        n(0, pe7Var.a, l(objArr, this.w, i, e, pe7Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        Object[] objArrU;
        l96.b(i, this.A);
        if (i == this.A) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.A - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.z;
            Object[] objArrR = r(objArr);
            gz3.f(size2 + 1, i3, Q(), objArr, objArrR);
            i(objArrR, i3, collection.iterator());
            this.z = objArrR;
            this.A = collection.size() + this.A;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iQ = Q();
        int size3 = collection.size() + this.A;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= N()) {
            objArrU = u();
            collection2 = collection;
            P(collection2, i, this.z, iQ, objArr2, size, objArrU);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.z;
            if (size3 > iQ) {
                int i4 = size3 - iQ;
                Object[] objArrT = t(i4, objArr3);
                k(collection2, i, i4, objArr2, size, objArrT);
                objArr2 = objArr2;
                objArrU = objArrT;
            } else {
                objArrU = u();
                int i5 = iQ - size3;
                gz3.f(0, i5, iQ, objArr3, objArrU);
                int i6 = 32 - i5;
                Object[] objArrT2 = t(i6, this.z);
                int i7 = size - 1;
                objArr2[i7] = objArrT2;
                k(collection2, i, i6, objArr2, i7, objArrT2);
                collection2 = collection2;
            }
        }
        this.y = D(this.y, i2, objArr2);
        this.z = objArrU;
        this.A = collection2.size() + this.A;
        return true;
    }

    @Override // defpackage.d2
    public final int d() {
        return this.A;
    }

    @Override // defpackage.d2
    public final E e(int i) {
        l96.a(i, d());
        ((AbstractList) this).modCount++;
        int iN = N();
        if (i >= iN) {
            return (E) M(this.y, iN, this.w, i - iN);
        }
        pe7 pe7Var = new pe7(this.z[0]);
        Object[] objArr = this.y;
        objArr.getClass();
        M(L(objArr, this.w, i, pe7Var), iN, this.w, 0);
        return (E) pe7Var.a;
    }

    public final j2 f() {
        j2 jx7Var;
        Object[] objArr = this.y;
        if (objArr == this.u && this.z == this.v) {
            jx7Var = this.t;
        } else {
            this.x = new x17();
            this.u = objArr;
            Object[] objArr2 = this.z;
            this.v = objArr2;
            if (objArr == null) {
                jx7Var = objArr2.length == 0 ? es9.u : new es9(Arrays.copyOf(objArr2, this.A));
            } else {
                jx7Var = new jx7(objArr, objArr2, this.A, this.w);
            }
        }
        this.t = jx7Var;
        return jx7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        l96.a(i, d());
        if (N() <= i) {
            objArr = this.z;
        } else {
            Object[] objArr2 = this.y;
            objArr2.getClass();
            for (int i2 = this.w; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t2.c(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final int j() {
        return ((AbstractList) this).modCount;
    }

    public final void k(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.y == null) {
            aa0.c("root is null");
            return;
        }
        int i4 = i >> 5;
        n1 n1VarQ = q(N() >> 5);
        int i5 = i3;
        Object[] objArrT = objArr2;
        while (n1VarQ.t - 1 != i4) {
            Object[] objArr3 = (Object[]) n1VarQ.previous();
            gz3.f(0, 32 - i2, 32, objArr3, objArrT);
            objArrT = t(i2, objArr3);
            i5--;
            objArr[i5] = objArrT;
        }
        Object[] objArr4 = (Object[]) n1VarQ.previous();
        int iN = i3 - (((N() >> 5) - 1) - i4);
        if (iN < i3) {
            objArr2 = objArr[iN];
            objArr2.getClass();
        }
        P(collection, i, objArr4, 32, objArr, iN, objArr2);
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, pe7 pe7Var) {
        Object obj2;
        int iC = t2.c(i2, i);
        if (i == 0) {
            pe7Var.a = objArr[31];
            Object[] objArrR = r(objArr);
            gz3.f(iC + 1, iC, 31, objArr, objArrR);
            objArrR[iC] = obj;
            return objArrR;
        }
        Object[] objArrR2 = r(objArr);
        int i3 = i - 5;
        Object obj3 = objArrR2[iC];
        obj3.getClass();
        objArrR2[iC] = l((Object[]) obj3, i3, i2, obj, pe7Var);
        while (true) {
            iC++;
            if (iC >= 32 || (obj2 = objArrR2[iC]) == null) {
                break;
            }
            objArrR2[iC] = l((Object[]) obj2, i3, 0, pe7Var.a, pe7Var);
        }
        return objArrR2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        l96.b(i, this.A);
        return new nx7(this, i);
    }

    public final void n(int i, Object obj, Object[] objArr) {
        int iQ = Q();
        Object[] objArrR = r(this.z);
        Object[] objArr2 = this.z;
        if (iQ >= 32) {
            Object obj2 = objArr2[31];
            gz3.f(i + 1, i, 31, objArr2, objArrR);
            objArrR[i] = obj;
            E(objArr, objArrR, v(obj2));
            return;
        }
        gz3.f(i + 1, i, iQ, objArr2, objArrR);
        objArrR[i] = obj;
        this.y = objArr;
        this.z = objArrR;
        this.A++;
    }

    public final boolean p(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.x;
    }

    public final n1 q(int i) {
        Object[] objArr = this.y;
        if (objArr == null) {
            aa0.c("Invalid root");
            return null;
        }
        int iN = N() >> 5;
        l96.b(i, iN);
        int i2 = this.w;
        return i2 == 0 ? new aq9(i, objArr) : new xxa(objArr, i, iN, i2 / 5);
    }

    public final Object[] r(Object[] objArr) {
        if (objArr == null) {
            return u();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] objArrU = u();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        gz3.i(0, length, 6, objArr, objArrU);
        return objArrU;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<?> collection) {
        return J(new oh4() { // from class: kx7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        l96.a(i, d());
        if (N() > i) {
            pe7 pe7Var = new pe7(null);
            Object[] objArr = this.y;
            objArr.getClass();
            this.y = O(objArr, this.w, i, e, pe7Var);
            return (E) pe7Var.a;
        }
        Object[] objArrR = r(this.z);
        if (objArrR != this.z) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrR[i2];
        objArrR[i2] = e;
        this.z = objArrR;
        return e2;
    }

    public final Object[] t(int i, Object[] objArr) {
        if (p(objArr)) {
            gz3.f(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrU = u();
        gz3.f(i, 0, 32 - i, objArr, objArrU);
        return objArrU;
    }

    public final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.x;
        return objArr;
    }

    public final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.x;
        return objArr;
    }

    public final Object[] w(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            c78.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iC = t2.c(i, i2);
        Object obj = objArr[iC];
        obj.getClass();
        Object objW = w(i, i2 - 5, (Object[]) obj);
        if (iC < 31) {
            int i3 = iC + 1;
            if (objArr[i3] != null) {
                if (p(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrU = u();
                gz3.f(0, 0, i3, objArr, objArrU);
                objArr = objArrU;
            }
        }
        if (objW == objArr[iC]) {
            return objArr;
        }
        Object[] objArrR = r(objArr);
        objArrR[iC] = objW;
        return objArrR;
    }

    public final Object[] x(Object[] objArr, int i, int i2, pe7 pe7Var) {
        Object[] objArrX;
        int iC = t2.c(i2 - 1, i);
        if (i == 5) {
            pe7Var.a = objArr[iC];
            objArrX = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrX = x((Object[]) obj, i - 5, i2, pe7Var);
        }
        if (objArrX == null && iC == 0) {
            return null;
        }
        Object[] objArrR = r(objArr);
        objArrR[iC] = objArrX;
        return objArrR;
    }

    public final void z(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.z = objArr;
            this.A = i;
            this.w = i2;
            return;
        }
        pe7 pe7Var = new pe7(null);
        objArr.getClass();
        Object[] objArrX = x(objArr, i2, i, pe7Var);
        objArrX.getClass();
        Object obj = pe7Var.a;
        obj.getClass();
        this.z = (Object[]) obj;
        this.A = i;
        if (objArrX[1] == null) {
            this.y = (Object[]) objArrX[0];
            this.w = i2 - 5;
        } else {
            this.y = objArrX;
            this.w = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iQ = Q();
        if (iQ < 32) {
            Object[] objArrR = r(this.z);
            objArrR[iQ] = e;
            this.z = objArrR;
            this.A = d() + 1;
        } else {
            E(this.y, this.z, v(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iQ = Q();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iQ >= collection.size()) {
            Object[] objArrR = r(this.z);
            i(objArrR, iQ, it);
            this.z = objArrR;
            this.A = collection.size() + this.A;
            return true;
        }
        int size = ((collection.size() + iQ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrR2 = r(this.z);
        i(objArrR2, iQ, it);
        objArr[0] = objArrR2;
        for (int i = 1; i < size; i++) {
            Object[] objArrU = u();
            i(objArrU, 0, it);
            objArr[i] = objArrU;
        }
        this.y = D(this.y, N(), objArr);
        Object[] objArrU2 = u();
        i(objArrU2, 0, it);
        this.z = objArrU2;
        this.A = collection.size() + this.A;
        return true;
    }
}
