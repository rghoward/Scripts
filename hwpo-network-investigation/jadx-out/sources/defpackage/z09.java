package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z09 implements b19.b {
    public final b19 a;
    public boolean b;
    public Bundle c;
    public final o7a d;

    public z09(b19 b19Var, final whb whbVar) {
        b19Var.getClass();
        this.a = b19Var;
        this.d = new o7a(new mh4() { // from class: y09
            @Override // defpackage.mh4
            public final Object invoke() {
                return x09.c(whbVar);
            }
        });
    }

    @Override // b19.b
    public final Bundle a() {
        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleC.putAll(bundle);
        }
        for (Map.Entry entry : ((a19) this.d.getValue()).t.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((q09) entry.getValue()).b.e.a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleC.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleC;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleC.putAll(bundle);
        }
        if (bundleA != null) {
            bundleC.putAll(bundleA);
        }
        this.c = bundleC;
        this.b = true;
    }
}
