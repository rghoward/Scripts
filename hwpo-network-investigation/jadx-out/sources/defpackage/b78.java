package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b78 implements jac {
    public static final /* synthetic */ b78 t = new b78();

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(str);
    }

    public static void c(int i) {
        if (i >= 0) {
            return;
        }
        zn3.b();
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ac4.c(str);
    }

    public static boolean e(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = n47.t;
            }
        } else {
            if (!(collection instanceof ew9)) {
                return false;
            }
            objComparator = ((ew9) collection).comparator();
        }
        return comparator.equals(objComparator);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().w());
    }
}
