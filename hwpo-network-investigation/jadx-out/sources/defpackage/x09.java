package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x09 {
    public static final b a = new b();
    public static final c b = new c();
    public static final d c = new d();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements thb.c {
        @Override // thb.c
        public final <T extends mhb> T create(wn5<T> wn5Var, lb2 lb2Var) {
            return new a19();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements lb2.b<f19> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements lb2.b<whb> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements lb2.b<Bundle> {
    }

    public static final q09 a(lb2 lb2Var) {
        q09 q09Var;
        lb2Var.getClass();
        f19 f19Var = (f19) lb2Var.a(a);
        Bundle bundle = null;
        if (f19Var == null) {
            z90.a("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        whb whbVar = (whb) lb2Var.a(b);
        if (whbVar == null) {
            z90.a("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) lb2Var.a(c);
        String str = (String) lb2Var.a(thb.b);
        if (str == null) {
            z90.a("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        b19.b bVarB = f19Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        z09 z09Var = bVarB instanceof z09 ? (z09) bVarB : null;
        if (z09Var == null) {
            aa0.c("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = c(whbVar).t;
        q09 q09Var2 = (q09) linkedHashMap.get(str);
        if (q09Var2 != null) {
            return q09Var2;
        }
        z09Var.b();
        Bundle bundle3 = z09Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                z09Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            q09Var = new q09();
        } else {
            ClassLoader classLoader = q09.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            kh6 kh6Var = new kh6(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                kh6Var.put(str2, bundle2.get(str2));
            }
            q09Var = new q09(pi6.f(kh6Var));
        }
        linkedHashMap.put(str, q09Var);
        return q09Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends f19 & whb> void b(T t) {
        s66.b bVarB = t.getLifecycle().b();
        if (bVarB != s66.b.u && bVarB != s66.b.v) {
            z90.a("Failed requirement.");
        } else if (t.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            z09 z09Var = new z09(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", z09Var);
            t.getLifecycle().a(new r09(z09Var));
        }
    }

    public static final a19 c(whb whbVar) {
        thb thbVarA = thb.b.a(whbVar, new a(), 4);
        return (a19) thbVarA.a.a(ll8.a(a19.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
