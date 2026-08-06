package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rk8 implements g76 {
    public final f19 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b19.b {
        public final LinkedHashSet a = new LinkedHashSet();

        public a(b19 b19Var) {
            b19Var.c("androidx.savedstate.Restarter", this);
        }

        @Override // b19.b
        public final Bundle a() {
            Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            zx.b(bundleC, "classes_to_restore", th1.T(this.a));
            return bundleC;
        }
    }

    public rk8(f19 f19Var) {
        this.t = f19Var;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        if (aVar != s66.a.ON_CREATE) {
            sx0.a("Next event must be ON_CREATE");
            return;
        }
        m76Var.getLifecycle().c(this);
        f19 f19Var = this.t;
        Bundle bundleA = f19Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            aa0.c("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, rk8.class.getClassLoader()).asSubclass(b19.a.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((b19.a) objNewInstance).a(f19Var);
                    } catch (Exception e) {
                        jl.a(ct1.a("Failed to instantiate ", str2), e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                jl.a(sk0.c("Class ", str2, " wasn't found"), e3);
                return;
            }
        }
    }
}
