package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mp7<T> implements tz7<T> {
    public static final mp7<Object> e = new mp7<>(oo7.b.g);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    public mp7(int i, int i2, List list) {
        list.getClass();
        this.a = new ArrayList(list);
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((cva) it.next()).b.size();
        }
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.tz7
    public final int a() {
        return this.b;
    }

    @Override // defpackage.tz7
    public final int b() {
        return this.c;
    }

    @Override // defpackage.tz7
    public final int c() {
        return this.d;
    }

    public final hjb.a d(int i) {
        ArrayList arrayList;
        int i2 = 0;
        int size = i - this.c;
        while (true) {
            arrayList = this.a;
            if (size < ((cva) arrayList.get(i2)).b.size() || i2 >= ws0.g(arrayList)) {
                break;
            }
            size -= ((cva) arrayList.get(i2)).b.size();
            i2++;
        }
        cva cvaVar = (cva) arrayList.get(i2);
        int i3 = i - this.c;
        int size2 = ((getSize() - i) - this.d) - 1;
        Integer numC = u30.C(((cva) th1.y(arrayList)).a);
        numC.getClass();
        return new hjb.a(cvaVar.c, size, i3, size2, numC.intValue(), f());
    }

    public final T e(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((cva) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((cva) arrayList.get(i2)).b.get(i);
    }

    public final int f() {
        Integer numValueOf;
        int[] iArr = ((cva) th1.G(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final tr7<T> g(oo7<T> oo7Var) {
        oo7Var.getClass();
        boolean z = oo7Var instanceof oo7.b;
        ArrayList arrayList = this.a;
        if (!z) {
            if (!(oo7Var instanceof oo7.a)) {
                aa0.c("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            fg5 fg5Var = new fg5(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                cva cvaVar = (cva) it.next();
                for (int i : cvaVar.a) {
                    if (fg5Var.d(i)) {
                        size += cvaVar.b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i2 = this.b - size;
            this.b = i2;
            int i3 = this.d;
            this.d = 0;
            return new tr7.b(this.c + i2, size, 0, i3);
        }
        oo7.b bVar = (oo7.b) oo7Var;
        List<cva<T>> list = bVar.b;
        Iterator<T> it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((cva) it2.next()).b.size();
        }
        int iOrdinal = bVar.a.ordinal();
        if (iOrdinal == 0) {
            aa0.c("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (iOrdinal == 1) {
            int i4 = this.c;
            arrayList.addAll(0, list);
            this.b += size2;
            this.c = bVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                rh1.o(((cva) it3.next()).b, arrayList2);
            }
            return new tr7.d(arrayList2, this.c, i4);
        }
        if (iOrdinal != 2) {
            u.b();
            return null;
        }
        int i5 = this.d;
        int i6 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += size2;
        this.d = bVar.d;
        int i7 = this.c + i6;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            rh1.o(((cva) it4.next()).b, arrayList3);
        }
        return new tr7.a(i7, arrayList3, this.d, i5);
    }

    @Override // defpackage.tz7
    public final int getSize() {
        return this.c + this.b + this.d;
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(e(i2));
        }
        String strF = th1.F(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.c);
        sb.append(" placeholders), ");
        sb.append(strF);
        sb.append(", (");
        return i34.b(this.d, " placeholders)]", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mp7(oo7.b<T> bVar) {
        this(bVar.c, bVar.d, bVar.b);
        bVar.getClass();
    }
}
