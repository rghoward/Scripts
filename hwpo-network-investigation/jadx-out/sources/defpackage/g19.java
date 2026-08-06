package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g19 extends thb.e implements thb.c {
    public final Application a;
    public final thb.a b;
    public final Bundle c;
    public final s66 d;
    public final b19 e;

    public g19(Application application, f19 f19Var, Bundle bundle) {
        thb.a aVar;
        f19Var.getClass();
        this.e = f19Var.getSavedStateRegistry();
        this.d = f19Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (thb.a.c == null) {
                thb.a.c = new thb.a(application);
            }
            aVar = thb.a.c;
            aVar.getClass();
        } else {
            aVar = new thb.a(null);
        }
        this.b = aVar;
    }

    @Override // thb.e
    public final void a(mhb mhbVar) {
        s66 s66Var = this.d;
        if (s66Var != null) {
            b19 b19Var = this.e;
            b19Var.getClass();
            p56.a(mhbVar, b19Var, s66Var);
        }
    }

    public final mhb b(Class cls, String str) {
        q09 q09Var;
        cls.getClass();
        s66 s66Var = this.d;
        if (s66Var == null) {
            ru3.f("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = et.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? h19.a(h19.b, cls) : h19.a(h19.a, cls);
        if (constructorA == null) {
            if (application != null) {
                return this.b.create(cls);
            }
            if (thb.d.a == null) {
                thb.d.a = new thb.d();
            }
            thb.d.a.getClass();
            return bb7.a(cls);
        }
        b19 b19Var = this.e;
        b19Var.getClass();
        Bundle bundleA = b19Var.a(str);
        if (bundleA == null) {
            bundleA = this.c;
        }
        if (bundleA == null) {
            q09Var = new q09();
        } else {
            ClassLoader classLoader = q09.class.getClassLoader();
            classLoader.getClass();
            bundleA.setClassLoader(classLoader);
            kh6 kh6Var = new kh6(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                str2.getClass();
                kh6Var.put(str2, bundleA.get(str2));
            }
            q09Var = new q09(pi6.f(kh6Var));
        }
        s09 s09Var = new s09(str, q09Var);
        s09Var.k(s66Var, b19Var);
        p56.b(s66Var, b19Var);
        mhb mhbVarB = (!zIsAssignableFrom || application == null) ? h19.b(cls, constructorA, q09Var) : h19.b(cls, constructorA, application, q09Var);
        mhbVarB.addCloseable("androidx.lifecycle.savedstate.vm.tag", s09Var);
        return mhbVarB;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
        lb2Var.getClass();
        String str = (String) lb2Var.a(thb.b);
        if (str == null) {
            aa0.c("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (lb2Var.a(x09.a) == null || lb2Var.a(x09.b) == null) {
            if (this.d != null) {
                return (T) b(cls, str);
            }
            aa0.c("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) lb2Var.a(thb.a.d);
        boolean zIsAssignableFrom = et.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? h19.a(h19.b, cls) : h19.a(h19.a, cls);
        if (constructorA == null) {
            return (T) this.b.create(cls, lb2Var);
        }
        return (!zIsAssignableFrom || application == null) ? (T) h19.b(cls, constructorA, x09.a(lb2Var)) : (T) h19.b(cls, constructorA, application, x09.a(lb2Var));
    }

    public g19() {
        this.b = new thb.a(null);
    }

    @Override // thb.c
    public final <T extends mhb> T create(wn5<T> wn5Var, lb2 lb2Var) {
        return (T) create(me3.b(wn5Var), lb2Var);
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, canonicalName);
        }
        z90.a("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
