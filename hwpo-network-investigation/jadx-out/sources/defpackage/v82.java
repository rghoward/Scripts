package defpackage;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v82 implements kh9 {
    public final se2 a;
    public final u82 b;

    public v82(se2 se2Var, ey3 ey3Var) {
        this.a = se2Var;
        this.b = new u82(ey3Var);
    }

    @Override // defpackage.kh9
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.kh9
    public final void b(kh9.b bVar) {
        String str = "App Quality Sessions session changed: " + bVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        u82 u82Var = this.b;
        String str2 = bVar.a;
        synchronized (u82Var) {
            if (!Objects.equals(u82Var.c, str2)) {
                u82.a(u82Var.a, u82Var.b, str2);
                u82Var.c = str2;
            }
        }
    }

    public final void d(String str) {
        u82 u82Var = this.b;
        synchronized (u82Var) {
            if (!Objects.equals(u82Var.b, str)) {
                u82.a(u82Var.a, str, u82Var.c);
                u82Var.b = str;
            }
        }
    }

    @Override // defpackage.kh9
    public final void c() {
    }
}
