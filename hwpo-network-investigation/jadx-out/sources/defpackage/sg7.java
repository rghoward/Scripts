package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sg7 implements OnBackAnimationCallback {
    public final /* synthetic */ tg7 a;

    public sg7(tg7 tg7Var) {
        this.a = tg7Var;
    }

    public final void onBackCancelled() {
        tg7 tg7Var = this.a;
        e87 e87Var = tg7Var.a;
        if (e87Var == null) {
            aa0.c("This input is not added to any dispatcher.");
            return;
        }
        if (!tg7Var.b) {
            e87Var.d(tg7Var, null);
        }
        k87 k87Var = e87Var.b;
        k87Var.getClass();
        if (tg7Var.equals(k87Var.h) && -1 == k87Var.g) {
            g87<?> g87VarC = k87Var.f;
            if (g87VarC == null) {
                g87VarC = k87Var.c(-1);
            }
            k87Var.f = null;
            k87Var.g = 0;
            k87Var.h = null;
            if (g87VarC != null) {
                l87.a aVar = l87.a.a;
                g87VarC.a();
            }
            k87Var.a.setValue(l87.a.a);
        }
        tg7Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        d87 d87VarA = m87.a(backEvent);
        tg7 tg7Var = this.a;
        e87 e87Var = tg7Var.a;
        if (e87Var == null) {
            aa0.c("This input is not added to any dispatcher.");
            return;
        }
        if (tg7Var.b) {
            k87 k87Var = e87Var.b;
            k87Var.getClass();
            if (tg7Var.equals(k87Var.h) && -1 == k87Var.g) {
                g87<?> g87VarC = k87Var.f;
                if (g87VarC == null) {
                    g87VarC = k87Var.c(-1);
                }
                if (g87VarC != null) {
                    new l87.b(d87VarA, -1);
                    g87VarC.c(d87VarA);
                }
                a0a a0aVar = k87Var.a;
                l87.b bVar = new l87.b(d87VarA, -1);
                a0aVar.getClass();
                a0aVar.l(null, bVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        d87 d87VarA = m87.a(backEvent);
        tg7 tg7Var = this.a;
        e87 e87Var = tg7Var.a;
        if (e87Var == null) {
            aa0.c("This input is not added to any dispatcher.");
        } else {
            if (tg7Var.b) {
                return;
            }
            e87Var.d(tg7Var, d87VarA);
            tg7Var.b = true;
        }
    }
}
