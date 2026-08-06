package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class th1 extends rh1 {
    public static <T> T A(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object B(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> int C(Iterable<? extends T> iterable, T t) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                ws0.m();
                throw null;
            }
            if (xj5.a(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void D(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, oh4 oh4Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            r2a.a(sb, obj, oh4Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void E(List list, StringBuilder sb, md3 md3Var, int i) {
        if ((i & 64) != 0) {
            md3Var = null;
        }
        D(list, sb, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "...", md3Var);
    }

    public static String F(Iterable iterable, String str, String str2, String str3, oh4 oh4Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        String str6 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
        if ((i & 32) != 0) {
            oh4Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        D(iterable, sb, str4, str5, str6, "...", oh4Var);
        return sb.toString();
    }

    public static <T> T G(List<? extends T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        px1.b("List is empty.");
        return null;
    }

    public static <T> T H(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable I(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList J(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && xj5.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList K(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            rh1.o(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList L(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static <T> List<T> M(Iterable<? extends T> iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return T(iterable);
        }
        List<T> listV = V(iterable);
        Collections.reverse(listV);
        return listV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> N(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List<T> listV = V(iterable);
            rh1.t(comparator, listV);
            return listV;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return T(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List<T> listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List O(int i, List list) {
        list.getClass();
        if (i < 0) {
            ca0.a(pk.d(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return hf3.t;
        }
        if (i >= list.size()) {
            return T(list);
        }
        if (i == 1) {
            return ws0.h(x(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return ws0.k(arrayList);
    }

    public static boolean[] P(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void Q(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] R(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] S(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> T(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return ws0.k(V(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return hf3.t;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return ws0.h(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList U(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final <T> List<T> V(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Q(iterable, arrayList);
        return arrayList;
    }

    public static <T> Set<T> W(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Q(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> X(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(pi6.g(collection.size()));
                    Q(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set<T> setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                setSingleton.getClass();
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Q(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set<T> setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                setSingleton2.getClass();
                return setSingleton2;
            }
        }
        return of3.t;
    }

    public static <T> boolean u(Iterable<? extends T> iterable, T t) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return C(iterable, t) >= 0;
    }

    public static List v(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size <= 0) {
            return hf3.t;
        }
        if (size == 1) {
            return ws0.h(G(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList w(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T x(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) y((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        px1.b("Collection is empty.");
        return null;
    }

    public static <T> T y(List<? extends T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        px1.b("List is empty.");
        return null;
    }

    public static <T> T z(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
