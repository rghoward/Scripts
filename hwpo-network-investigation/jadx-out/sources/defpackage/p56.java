package defpackage;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p56 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b19.a {
        @Override // b19.a
        public final void a(f19 f19Var) {
            if (!(f19Var instanceof whb)) {
                p.b(f19Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                return;
            }
            vhb viewModelStore = ((whb) f19Var).getViewModelStore();
            b19 savedStateRegistry = f19Var.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.a;
            for (String str : new HashSet(linkedHashMap.keySet())) {
                str.getClass();
                mhb mhbVar = (mhb) linkedHashMap.get(str);
                if (mhbVar != null) {
                    p56.a(mhbVar, savedStateRegistry, f19Var.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements g76 {
        public final /* synthetic */ s66 t;
        public final /* synthetic */ b19 u;

        public b(s66 s66Var, b19 b19Var) {
            this.t = s66Var;
            this.u = b19Var;
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            if (aVar == s66.a.ON_START) {
                this.t.c(this);
                this.u.d();
            }
        }
    }

    public static final void a(mhb mhbVar, b19 b19Var, s66 s66Var) {
        b19Var.getClass();
        s66Var.getClass();
        s09 s09Var = (s09) mhbVar.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (s09Var == null || s09Var.v) {
            return;
        }
        s09Var.k(s66Var, b19Var);
        b(s66Var, b19Var);
    }

    public static void b(s66 s66Var, b19 b19Var) {
        s66.b bVarB = s66Var.b();
        if (bVarB == s66.b.u || bVarB.compareTo(s66.b.w) >= 0) {
            b19Var.d();
        } else {
            s66Var.a(new b(s66Var, b19Var));
        }
    }
}
