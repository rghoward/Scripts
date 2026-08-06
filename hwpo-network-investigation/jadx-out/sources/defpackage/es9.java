package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class es9<E> extends j2<E> implements j95<E> {
    public static final es9 u = new es9(new Object[0]);
    public final Object[] t;

    public es9(Object[] objArr) {
        this.t = objArr;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.t.length;
    }

    @Override // defpackage.j2
    public final j2 e(int i, E e) {
        Object[] objArr = this.t;
        l96.b(i, objArr.length);
        if (i == objArr.length) {
            return f(e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            gz3.i(0, i, 6, objArr, objArr2);
            gz3.f(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = e;
            return new es9(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        gz3.f(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = e;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new jx7(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.j2
    public final j2 f(E e) {
        Object[] objArr = this.t;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e;
            return new es9(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new jx7(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr = this.t;
        l96.a(i, objArr.length);
        return (E) objArr[i];
    }

    @Override // defpackage.j2
    public final j2 i(Collection<? extends E> collection) {
        Object[] objArr = this.t;
        if (collection.size() + objArr.length > 32) {
            lx7 lx7VarJ = j();
            lx7VarJ.addAll(collection);
            return lx7VarJ.f();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new es9(objArrCopyOf);
    }

    @Override // defpackage.m1, java.util.List
    public final int indexOf(Object obj) {
        return u30.A(this.t, obj);
    }

    @Override // defpackage.j2
    public final lx7 j() {
        return new lx7(this, null, this.t, 0);
    }

    @Override // defpackage.j2
    public final j2 k(i2 i2Var) {
        Object[] objArr = this.t;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) i2Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? u : new es9(gz3.k(0, length, objArrCopyOf));
    }

    @Override // defpackage.j2
    public final j2 l(int i) {
        Object[] objArr = this.t;
        l96.a(i, objArr.length);
        if (objArr.length == 1) {
            return u;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        gz3.f(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new es9(objArrCopyOf);
    }

    @Override // defpackage.m1, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.t;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.m1, java.util.List
    public final ListIterator<E> listIterator(int i) {
        Object[] objArr = this.t;
        l96.b(i, objArr.length);
        return new wx0(i, objArr.length, objArr);
    }

    @Override // defpackage.j2
    public final j2 n(int i, E e) {
        Object[] objArr = this.t;
        l96.a(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e;
        return new es9(objArrCopyOf);
    }
}
