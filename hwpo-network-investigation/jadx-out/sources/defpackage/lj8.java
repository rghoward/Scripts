package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lj8 implements lkb {
    public final LinkedHashMap<ar6.a, ArrayList<a>> a = new LinkedHashMap<>();
    public int b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final WeakReference<Bitmap> b;
        public final Map<String, Object> c;
        public final int d;

        public a(int i, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i2) {
            this.a = i;
            this.b = weakReference;
            this.c = map;
            this.d = i2;
        }
    }

    @Override // defpackage.lkb
    public final synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            d();
        }
    }

    @Override // defpackage.lkb
    public final synchronized ar6.b b(ar6.a aVar) {
        try {
            ArrayList<a> arrayList = this.a.get(aVar);
            ar6.b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = arrayList.get(i);
                Bitmap bitmap = aVar2.b.get();
                ar6.b bVar2 = bitmap != null ? new ar6.b(bitmap, aVar2.c) : null;
                if (bVar2 != null) {
                    bVar = bVar2;
                    break;
                }
            }
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 10) {
                d();
            }
            return bVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lkb
    public final synchronized void c(ar6.a aVar, Bitmap bitmap, Map<String, ? extends Object> map, int i) {
        try {
            LinkedHashMap<ar6.a, ArrayList<a>> linkedHashMap = this.a;
            ArrayList<a> arrayList = linkedHashMap.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(aVar, arrayList);
            }
            ArrayList<a> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            a aVar2 = new a(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(aVar2);
                    break;
                }
                a aVar3 = arrayList2.get(i2);
                if (i >= aVar3.d) {
                    if (aVar3.a != iIdentityHashCode || aVar3.b.get() != bitmap) {
                        arrayList2.add(i2, aVar2);
                        break;
                    } else {
                        arrayList2.set(i2, aVar2);
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        this.b = 0;
        Iterator<ArrayList<a>> it = this.a.values().iterator();
        while (it.hasNext()) {
            ArrayList<a> next = it.next();
            if (next.size() <= 1) {
                a aVar = (a) th1.A(next);
                if ((aVar != null ? aVar.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).b.get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
