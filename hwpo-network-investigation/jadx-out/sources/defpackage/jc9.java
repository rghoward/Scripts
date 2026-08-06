package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jc9 {
    public static final Comparator<ub9>[] a;
    public static final a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<ub9, ub9, Integer> {
        public static final a u = new a(2);

        @Override // defpackage.ci4
        public final Integer invoke(ub9 ub9Var, ub9 ub9Var2) {
            ub9 ub9Var3 = ub9Var2;
            Object objValueOf = Float.valueOf(0.0f);
            lb9 lb9Var = ub9Var.d;
            gc9<Float> gc9Var = ac9.u;
            Object objD = lb9Var.t.d(gc9Var);
            if (objD == null) {
                objD = objValueOf;
            }
            float fFloatValue = ((Number) objD).floatValue();
            Object objD2 = ub9Var3.d.t.d(gc9Var);
            if (objD2 != null) {
                objValueOf = objD2;
            }
            return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator t;

        public b(Comparator comparator) {
            this.t = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.t.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            return qr5.m0.compare(((ub9) t).c, ((ub9) t2).c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> implements Comparator {
        public final /* synthetic */ b t;

        public c(b bVar) {
            this.t = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.t.compare(t, t2);
            return iCompare != 0 ? iCompare : eo7.f(Integer.valueOf(((ub9) t).f), Integer.valueOf(((ub9) t2).f));
        }
    }

    static {
        Comparator<ub9>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new c(new b(i == 0 ? ry8.t : qf6.t));
            i++;
        }
        a = comparatorArr;
        b = a.u;
    }

    public static final void a(ub9 ub9Var, ArrayList arrayList, om omVar, pm pmVar, e27 e27Var) {
        lb9 lb9Var = ub9Var.d;
        Object objD = lb9Var.t.d(ac9.n);
        if (objD == null) {
            objD = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        if ((zBooleanValue || ((Boolean) pmVar.invoke(ub9Var)).booleanValue()) && ((Boolean) omVar.invoke(ub9Var)).booleanValue()) {
            arrayList.add(ub9Var);
        }
        if (zBooleanValue) {
            e27Var.i(ub9Var.f, b(ub9Var, omVar, pmVar, ub9.j(7, ub9Var)));
            return;
        }
        List listJ = ub9.j(7, ub9Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((ub9) listJ.get(i), arrayList, omVar, pmVar, e27Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList b(ub9 ub9Var, om omVar, pm pmVar, List list) {
        int i;
        e27 e27Var = ag5.a;
        e27 e27Var2 = new e27();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((ub9) list.get(i2), arrayList, omVar, pmVar, e27Var2);
        }
        int i3 = 1;
        char c2 = ub9Var.c.S == tq5.u ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                ub9 ub9Var2 = (ub9) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new js7(ub9Var2.h(), ws0.j(ub9Var2)));
                    break;
                }
                float f = ub9Var2.h().b;
                float f2 = ub9Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        sk8 sk8Var = (sk8) ((js7) arrayList2.get(i6)).t;
                        float f3 = sk8Var.b;
                        i = i3;
                        float f4 = sk8Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new js7(new sk8(Math.max(sk8Var.a, 0.0f), Math.max(sk8Var.b, f), Math.min(sk8Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((js7) arrayList2.get(i6)).u));
                            ((List) ((js7) arrayList2.get(i6)).u).add(ub9Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new js7(ub9Var2.h(), ws0.j(ub9Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        rh1.t(nra.t, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator<ub9> comparator = a[c2 ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            js7 js7Var = (js7) arrayList2.get(i8);
            rh1.t(comparator, (List) js7Var.u);
            arrayList3.addAll((Collection) js7Var.u);
        }
        final a aVar = b;
        rh1.t(new Comparator() { // from class: ic9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) aVar.invoke(obj, obj2)).intValue();
            }
        }, arrayList3);
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) e27Var2.b(((ub9) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) pmVar.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
