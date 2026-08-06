package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fv9<T> implements Parcelable, m0a, List<T>, RandomAccess, ao5 {
    public static final Parcelable.Creator<fv9<Object>> CREATOR = new a();
    public k0a t;

    public fv9(j2 j2Var) {
        hu9 hu9VarJ = qu9.j();
        k0a k0aVar = new k0a(hu9VarJ.g(), j2Var);
        if (!(hu9VarJ instanceof fn4)) {
            k0aVar.b = new k0a(1L, j2Var);
        }
        this.t = k0aVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            j2 j2VarF = j2Var.f(t);
            if (j2VarF.equals(j2Var)) {
                return false;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i, j2VarF, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            j2 j2VarI = j2Var.i(collection);
            if (xj5.a(j2VarI, j2Var)) {
                return false;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i, j2VarI, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        hu9 hu9VarJ;
        k0a k0aVar = this.t;
        k0aVar.getClass();
        synchronized (qu9.c) {
            hu9VarJ = qu9.j();
            k0a k0aVar2 = (k0a) qu9.w(k0aVar, this, hu9VarJ);
            synchronized (gv9.a) {
                k0aVar2.c = es9.u;
                k0aVar2.d++;
                k0aVar2.e++;
            }
        }
        qu9.n(hu9VarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return gv9.c(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return gv9.c(this).c.containsAll(collection);
    }

    @Override // defpackage.m0a
    public final o0a d() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) gv9.c(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return gv9.c(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return gv9.c(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    public final void j(int i, int i2) {
        int i3;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i3 = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            lx7 lx7VarJ = j2Var.j();
            lx7VarJ.subList(i, i2).clear();
            j2 j2VarF = lx7VarJ.f();
            if (xj5.a(j2VarF, j2Var)) {
                return;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i3, j2VarF, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return gv9.c(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new h0a(this, 0);
    }

    @Override // defpackage.m0a
    public final void q(o0a o0aVar) {
        o0aVar.b = this.t;
        this.t = (k0a) o0aVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            int iIndexOf = j2Var.indexOf(obj);
            j2 j2VarL = iIndexOf != -1 ? j2Var.l(iIndexOf) : j2Var;
            if (xj5.a(j2VarL, j2Var)) {
                return false;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i, j2VarL, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            j2 j2VarK = j2Var.k(new i2(0, collection));
            if (xj5.a(j2VarK, j2Var)) {
                return false;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i, j2VarK, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection<?> collection) {
        return gv9.e(this, new oh4() { // from class: dv9
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        T t2 = get(i);
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i2 = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            j2 j2VarN = j2Var.n(i, t);
            if (j2VarN.equals(j2Var)) {
                break;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i2, j2VarN, false);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return gv9.c(this).c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            c78.a("fromIndex or toIndex are out of bounds");
        }
        return new s3a(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }

    public final String toString() {
        k0a k0aVar = this.t;
        k0aVar.getClass();
        return "SnapshotStateList(value=" + ((k0a) qu9.h(k0aVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j2 j2Var = gv9.c(this).c;
        int size = j2Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(j2Var.get(i2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.ClassLoaderCreator<fv9<Object>> {
        public static fv9 a(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            int i = parcel.readInt();
            if (i == 0) {
                return new fv9();
            }
            lx7 lx7VarJ = es9.u.j();
            for (int i2 = 0; i2 < i; i2++) {
                lx7VarJ.add(parcel.readValue(classLoader));
            }
            return new fv9(lx7VarJ.f());
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new fv9[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ fv9<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) mh1.c(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new h0a(this, i);
    }

    public fv9() {
        this(es9.u);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i2 = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            j2 j2VarE = j2Var.e(i, t);
            if (j2VarE.equals(j2Var)) {
                return;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i2, j2VarE, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection<? extends T> collection) {
        return gv9.e(this, new oh4() { // from class: ev9
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        T t = get(i);
        do {
            synchronized (gv9.a) {
                k0a k0aVar = this.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i2 = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            j2 j2VarL = j2Var.l(i);
            if (j2VarL.equals(j2Var)) {
                break;
            }
            k0a k0aVar3 = this.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, this, hu9VarJ), i2, j2VarL, true);
            }
            qu9.n(hu9VarJ, this);
        } while (!zB);
        return t;
    }
}
