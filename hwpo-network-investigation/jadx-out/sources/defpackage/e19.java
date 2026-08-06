package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e19 {
    public final f19 a;
    public final s97 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final pd7 c = new pd7(2);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public e19(f19 f19Var, s97 s97Var) {
        this.a = f19Var;
        this.b = s97Var;
    }

    public final void a() {
        f19 f19Var = this.a;
        if (f19Var.getLifecycle().b() != s66.b.u) {
            aa0.c("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                aa0.c("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            f19Var.getLifecycle().a(new g76() { // from class: d19
                @Override // defpackage.g76
                public final void t(m76 m76Var, s66.a aVar) {
                    s66.a aVar2 = s66.a.ON_START;
                    e19 e19Var = this.t;
                    if (aVar == aVar2) {
                        e19Var.h = true;
                    } else if (aVar == s66.a.ON_STOP) {
                        e19Var.h = false;
                    }
                }
            });
            this.e = true;
        }
    }
}
