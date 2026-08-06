package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qt8 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final pt8<T, R> c;

        public a(Class<T> cls, Class<R> cls2, pt8<T, R> pt8Var) {
            this.a = cls;
            this.b = cls2;
            this.c = pt8Var;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            arrayList = (List) this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<a> list = (List) this.b.get((String) obj);
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
