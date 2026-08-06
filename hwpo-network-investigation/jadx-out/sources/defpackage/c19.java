package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c19 {
    public final e19 a;
    public final b19 b;

    public c19(e19 e19Var) {
        this.a = e19Var;
        this.b = new b19(e19Var);
    }

    public final void a() {
        this.a.a();
    }

    public final void b(Bundle bundle) {
        e19 e19Var = this.a;
        f19 f19Var = e19Var.a;
        if (!e19Var.e) {
            e19Var.a();
        }
        if (f19Var.getLifecycle().b().compareTo(s66.b.w) >= 0) {
            p.b(f19Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (e19Var.g) {
            aa0.c("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                xx.e("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        e19Var.f = bundle2;
        e19Var.g = true;
    }

    public final void c(Bundle bundle) {
        e19 e19Var = this.a;
        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        Bundle bundle2 = e19Var.f;
        if (bundle2 != null) {
            bundleC.putAll(bundle2);
        }
        synchronized (e19Var.c) {
            try {
                for (Map.Entry entry : e19Var.d.entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleA = ((b19.b) entry.getValue()).a();
                    str.getClass();
                    bundleA.getClass();
                    bundleC.putBundle(str, bundleA);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bundleC.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleC);
    }
}
