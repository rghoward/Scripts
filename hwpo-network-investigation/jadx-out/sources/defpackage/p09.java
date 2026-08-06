package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p09 implements m09, f19 {
    public final /* synthetic */ n09 t;
    public n76 u;
    public c19 v;

    public p09(n09 n09Var) {
        this.t = n09Var;
        Object objD = n09Var.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objD instanceof Bundle ? (Bundle) objD : null;
        int i = 1;
        if (bundle != null && this.v == null) {
            c19 c19Var = new c19(new e19(this, new s97(1, this)));
            this.v = c19Var;
            c19Var.b(bundle);
        }
        n09Var.b(new jk0(this, i), "androidx.savedstate.SavedStateRegistry");
    }

    @Override // defpackage.m09
    public final boolean a(Object obj) {
        return this.t.a(obj);
    }

    @Override // defpackage.m09
    public final m09.a b(mh4 mh4Var, String str) {
        return this.t.b(mh4Var, str);
    }

    @Override // defpackage.m09
    public final Map<String, List<Object>> c() {
        return this.t.c();
    }

    @Override // defpackage.m09
    public final Object d(String str) {
        return this.t.d(str);
    }

    @Override // defpackage.m76
    public final s66 getLifecycle() {
        n76 n76Var = this.u;
        if (n76Var != null) {
            return n76Var;
        }
        n76 n76Var2 = new n76(this, false);
        this.u = n76Var2;
        return n76Var2;
    }

    @Override // defpackage.f19
    public final b19 getSavedStateRegistry() {
        c19 c19Var = this.v;
        if (c19Var == null) {
            c19 c19Var2 = new c19(new e19(this, new s97(1, this)));
            this.v = c19Var2;
            c19Var2.b(null);
            c19Var = c19Var2;
        }
        return c19Var.b;
    }
}
