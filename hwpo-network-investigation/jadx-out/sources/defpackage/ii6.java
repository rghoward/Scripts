package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ii6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u60.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final ArrayList a(List list, p43 p43Var) {
        p43Var.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m89 m89VarA = (m89) it.next();
            if (a.a[m89VarA.j.ordinal()] == 1) {
                m89VarA = m89.a(m89VarA, null, p43Var.a(m89VarA.c), 24575);
            }
            arrayList.add(m89VarA);
        }
        return arrayList;
    }

    public static final ArrayList b(List list, p43 p43Var) {
        p43Var.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l89 l89VarA = (l89) it.next();
            if (a.a[l89VarA.v.ordinal()] == 1) {
                l89VarA = l89.a(l89VarA, p43Var.a(l89VarA.w), null, 15359);
            }
            arrayList.add(l89VarA);
        }
        return arrayList;
    }
}
