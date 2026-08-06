package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b19 {
    public final e19 a;
    public rk8.a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(f19 f19Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        Bundle a();
    }

    public b19(e19 e19Var) {
        this.a = e19Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        e19 e19Var = this.a;
        if (!e19Var.g) {
            aa0.c("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = e19Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                xx.e(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            e19Var.f = null;
        }
        return bundle;
    }

    public final b b(String str) {
        b bVar;
        e19 e19Var = this.a;
        synchronized (e19Var.c) {
            Iterator it = e19Var.d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                b bVar2 = (b) entry.getValue();
                if (xj5.a(str2, str)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b bVar) {
        bVar.getClass();
        e19 e19Var = this.a;
        synchronized (e19Var.c) {
            if (e19Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            e19Var.d.put(str, bVar);
            g2b g2bVar = g2b.a;
        }
    }

    public final void d() {
        if (!this.a.h) {
            aa0.c("Can not perform this action after onSaveInstanceState");
            return;
        }
        rk8.a aVar = this.b;
        if (aVar == null) {
            aVar = new rk8.a(this);
        }
        this.b = aVar;
        try {
            p56.a.class.getDeclaredConstructor(null);
            rk8.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a.add(p56.a.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + p56.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
