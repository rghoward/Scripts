package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j87 {
    public e87 a;
    public boolean b;

    public final void a() {
        e87 e87Var = this.a;
        if (e87Var == null) {
            aa0.c("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            e87Var.d(this, null);
        }
        k87 k87Var = e87Var.b;
        yg7 yg7Var = e87Var.a;
        k87Var.getClass();
        if (equals(k87Var.h) && -1 == k87Var.g) {
            g87<?> g87VarC = k87Var.f;
            if (g87VarC == null) {
                g87VarC = k87Var.c(-1);
            }
            k87Var.f = null;
            k87Var.g = 0;
            k87Var.h = null;
            if (g87VarC == null) {
                Runnable runnable = yg7Var.a.a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                l87.a aVar = l87.a.a;
                g87VarC.b();
            }
            k87Var.a.setValue(l87.a.a);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
