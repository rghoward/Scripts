package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sl8 {
    public final mx6 a;
    public final zf3 b;
    public final qt8 c;
    public final tt8 d;
    public final com.bumptech.glide.load.data.b e;
    public final xua f;
    public final w75 g;
    public final nx6 h = new nx6();
    public final tb6 i = new tb6();
    public final at3.c j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends a {
    }

    public sl8() {
        at3.c cVar = new at3.c(new z58(20), new bt3(), new ct3());
        this.j = cVar;
        this.a = new mx6(cVar);
        this.b = new zf3();
        this.c = new qt8();
        this.d = new tt8();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new xua();
        this.g = new w75();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        qt8 qt8Var = this.c;
        synchronized (qt8Var) {
            try {
                ArrayList arrayList2 = new ArrayList(qt8Var.a);
                qt8Var.a.clear();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    qt8Var.a.add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        qt8Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, xf3 xf3Var) {
        zf3 zf3Var = this.b;
        synchronized (zf3Var) {
            zf3Var.a.add(new zf3.a(cls, xf3Var));
        }
    }

    public final void b(Class cls, st8 st8Var) {
        tt8 tt8Var = this.d;
        synchronized (tt8Var) {
            tt8Var.a.add(new tt8.a(cls, st8Var));
        }
    }

    public final void c(Class cls, Class cls2, lx6 lx6Var) {
        mx6 mx6Var = this.a;
        synchronized (mx6Var) {
            i07 i07Var = mx6Var.a;
            synchronized (i07Var) {
                try {
                    i07.b bVar = new i07.b(cls, cls2, lx6Var);
                    ArrayList arrayList = i07Var.a;
                    arrayList.add(arrayList.size(), bVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            mx6Var.b.a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, pt8 pt8Var) {
        qt8 qt8Var = this.c;
        synchronized (qt8Var) {
            qt8Var.a(str).add(new qt8.a<>(cls, cls2, pt8Var));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        w75 w75Var = this.g;
        synchronized (w75Var) {
            arrayList = w75Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new b("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final <Model> List<kx6<Model, ?>> f(Model model) {
        List<kx6<Model, ?>> listUnmodifiableList;
        mx6 mx6Var = this.a;
        mx6Var.getClass();
        Class<?> cls = model.getClass();
        synchronized (mx6Var) {
            mx6.a.C0204a c0204a = (mx6.a.C0204a) mx6Var.b.a.get(cls);
            listUnmodifiableList = c0204a == null ? null : c0204a.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(mx6Var.a.b(cls));
                if (((mx6.a.C0204a) mx6Var.b.a.put(cls, new mx6.a.C0204a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new c("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<kx6<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            kx6<Model, ?> kx6Var = listUnmodifiableList.get(i);
            if (kx6Var.b(model)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(kx6Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new c("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    public final <X> com.bumptech.glide.load.data.a<X> g(X x) {
        com.bumptech.glide.load.data.a<X> aVarB;
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            try {
                ov9.c(x);
                com.bumptech.glide.load.data.a.InterfaceC0047a interfaceC0047a = (com.bumptech.glide.load.data.a.InterfaceC0047a) bVar.a.get(x.getClass());
                if (interfaceC0047a == null) {
                    for (com.bumptech.glide.load.data.a.InterfaceC0047a interfaceC0047a2 : bVar.a.values()) {
                        if (interfaceC0047a2.a().isAssignableFrom(x.getClass())) {
                            interfaceC0047a = interfaceC0047a2;
                            break;
                        }
                    }
                }
                if (interfaceC0047a == null) {
                    interfaceC0047a = com.bumptech.glide.load.data.b.b;
                }
                aVarB = interfaceC0047a.b(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarB;
    }

    public final void h(com.bumptech.glide.load.data.a.InterfaceC0047a interfaceC0047a) {
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            bVar.a.put(interfaceC0047a.a(), interfaceC0047a);
        }
    }

    public final void i(Class cls, Class cls2, eu8 eu8Var) {
        xua xuaVar = this.f;
        synchronized (xuaVar) {
            xuaVar.a.add(new xua.a(cls, cls2, eu8Var));
        }
    }
}
