package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i07 {
    public static final c e = new c();
    public static final a f = new a();
    public final at3.c d;
    public final ArrayList a = new ArrayList();
    public final HashSet c = new HashSet();
    public final c b = e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements kx6<Object, Object> {
        @Override // defpackage.kx6
        public final kx6.a<Object> a(Object obj, int i, int i2, xk7 xk7Var) {
            return null;
        }

        @Override // defpackage.kx6
        public final boolean b(Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final lx6<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, lx6<? extends Model, ? extends Data> lx6Var) {
            this.a = cls;
            this.b = cls2;
            this.c = lx6Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
    }

    public i07(at3.c cVar) {
        this.d = cVar;
    }

    public final synchronized <Model, Data> kx6<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.a;
            int size = arrayList2.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                b bVar = (b) obj;
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.b.isAssignableFrom(cls2)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.d(this));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                at3.c cVar2 = this.d;
                cVar.getClass();
                return new h07(arrayList, cVar2);
            }
            if (arrayList.size() == 1) {
                return (kx6) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new sl8.c("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                b bVar = (b) obj;
                if (!this.c.contains(bVar) && bVar.a.isAssignableFrom((Class<?>) cls)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.d(this));
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            b bVar = (b) obj;
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
