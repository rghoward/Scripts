package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r47 implements m76, whb, wt4, f19 {
    public final u47 A = new u47(this);
    public final c57 t;
    public c67 u;
    public final Bundle v;
    public s66.b w;
    public final o77 x;
    public final String y;
    public final Bundle z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static r47 a(c57 c57Var, c67 c67Var, Bundle bundle, s66.b bVar, o77 o77Var) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            c67Var.getClass();
            bVar.getClass();
            return new r47(c57Var, c67Var, bundle, bVar, o77Var, string, null);
        }
    }

    public r47(c57 c57Var, c67 c67Var, Bundle bundle, s66.b bVar, o77 o77Var, String str, Bundle bundle2) {
        this.t = c57Var;
        this.u = c67Var;
        this.v = bundle;
        this.w = bVar;
        this.x = o77Var;
        this.y = str;
        this.z = bundle2;
        new o7a(new ol2(1, this));
    }

    public final void a(s66.b bVar) {
        u47 u47Var = this.A;
        u47Var.getClass();
        u47Var.k = bVar;
        u47Var.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof r47)) {
            r47 r47Var = (r47) obj;
            Bundle bundle = r47Var.v;
            if (xj5.a(this.y, r47Var.y) && xj5.a(this.u, r47Var.u) && xj5.a(this.A.j, r47Var.A.j) && xj5.a(getSavedStateRegistry(), r47Var.getSavedStateRegistry())) {
                Bundle bundle2 = this.v;
                if (xj5.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!xj5.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // defpackage.wt4
    public final lb2 getDefaultViewModelCreationExtras() {
        Application application;
        u47 u47Var = this.A;
        u47Var.getClass();
        z17 z17Var = new z17((Object) null);
        r47 r47Var = u47Var.a;
        LinkedHashMap linkedHashMap = z17Var.a;
        linkedHashMap.put(x09.a, r47Var);
        linkedHashMap.put(x09.b, r47Var);
        Bundle bundleA = u47Var.a();
        if (bundleA != null) {
            linkedHashMap.put(x09.c, bundleA);
        }
        c57 c57Var = this.t;
        if (c57Var == null) {
            application = null;
        } else {
            Context context = c57Var.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(thb.a.d, application2);
        }
        return z17Var;
    }

    @Override // defpackage.wt4
    public final thb.c getDefaultViewModelProviderFactory() {
        return this.A.l;
    }

    @Override // defpackage.m76
    public final s66 getLifecycle() {
        return this.A.j;
    }

    @Override // defpackage.f19
    public final b19 getSavedStateRegistry() {
        return this.A.h.b;
    }

    @Override // defpackage.whb
    public final vhb getViewModelStore() {
        u47 u47Var = this.A;
        if (!u47Var.i) {
            aa0.c("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (u47Var.j.d == s66.b.t) {
            aa0.c("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        o77 o77Var = u47Var.e;
        if (o77Var != null) {
            return o77Var.a(u47Var.f);
        }
        aa0.c("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        return null;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.u.hashCode() + (this.y.hashCode() * 31);
        Bundle bundle = this.v;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.A.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.A.toString();
    }
}
