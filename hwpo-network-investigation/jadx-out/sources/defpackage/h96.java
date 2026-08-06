package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h96 {
    public static final a a = new a();
    public static final b b = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends h96 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        @Override // defpackage.h96
        public final void a(long j, Object obj) {
            Object objUnmodifiableList;
            List list = (List) h3b.c.i(j, obj);
            if (list instanceof h26) {
                objUnmodifiableList = ((h26) list).m0();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof k98) && (list instanceof zi5.c)) {
                    zi5.c cVar = (zi5.c) list;
                    if (cVar.s()) {
                        cVar.g();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            h3b.p(j, obj, objUnmodifiableList);
        }

        @Override // defpackage.h96
        public final void b(long j, Object obj, Object obj2) {
            List list;
            List list2;
            List listH;
            List list3 = (List) h3b.c.i(j, obj2);
            int size = list3.size();
            List list4 = (List) h3b.c.i(j, obj);
            if (list4.isEmpty()) {
                if (list4 instanceof h26) {
                    listH = new g26(size);
                } else {
                    listH = ((list4 instanceof k98) && (list4 instanceof zi5.c)) ? ((zi5.c) list4).h(size) : new ArrayList(size);
                }
                h3b.p(j, obj, listH);
                list2 = listH;
            } else {
                if (c.isAssignableFrom(list4.getClass())) {
                    ArrayList arrayList = new ArrayList(list4.size() + size);
                    arrayList.addAll(list4);
                    h3b.p(j, obj, arrayList);
                    list = arrayList;
                } else if (list4 instanceof x2b) {
                    x2b x2bVar = (x2b) list4;
                    g26 g26Var = new g26(x2bVar.size() + size);
                    g26Var.addAll(x2bVar);
                    h3b.p(j, obj, g26Var);
                    list = g26Var;
                } else if ((list4 instanceof k98) && (list4 instanceof zi5.c)) {
                    zi5.c cVar = (zi5.c) list4;
                    if (!cVar.s()) {
                        list2 = list4;
                        list2 = list4;
                        list2 = list4;
                        zi5.c cVarH = cVar.h(list4.size() + size);
                        h3b.p(j, obj, cVarH);
                        list2 = cVarH;
                    }
                }
                list2 = list;
            }
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            int size2 = list2.size();
            int size3 = list3.size();
            if (size2 > 0 && size3 > 0) {
                list2.addAll(list3);
            }
            if (size2 > 0) {
                list3 = list2;
            }
            h3b.p(j, obj, list3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends h96 {
        @Override // defpackage.h96
        public final void a(long j, Object obj) {
            ((zi5.c) h3b.c.i(j, obj)).g();
        }

        @Override // defpackage.h96
        public final void b(long j, Object obj, Object obj2) {
            h3b.e eVar = h3b.c;
            zi5.c cVarH = (zi5.c) eVar.i(j, obj);
            zi5.c cVar = (zi5.c) eVar.i(j, obj2);
            int size = cVarH.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarH.s()) {
                    cVarH = cVarH.h(size2 + size);
                }
                cVarH.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarH;
            }
            h3b.p(j, obj, cVar);
        }
    }

    public abstract void a(long j, Object obj);

    public abstract void b(long j, Object obj, Object obj2);
}
