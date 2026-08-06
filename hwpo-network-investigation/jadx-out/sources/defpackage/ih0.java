package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 {
    public final e87 a;
    public final zg7 b;

    public ih0(e87 e87Var, zg7 zg7Var) {
        this.a = e87Var;
        this.b = zg7Var;
        if ((e87Var == null ? zg7Var : e87Var) != null) {
            return;
        }
        z90.a("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(hh0 hh0Var) {
        e87 e87Var = this.a;
        if (e87Var != null) {
            e87.a(e87Var, hh0Var.b);
            return;
        }
        zg7 zg7Var = this.b;
        if (zg7Var != null) {
            zg7Var.b(hh0Var.a);
        } else {
            aa0.c("Unreachable");
        }
    }

    public final void b(hh0 hh0Var) throws Exception {
        if (this.a != null) {
            hh0Var.b.e();
        } else if (this.b != null) {
            hh0Var.a.remove();
        } else {
            aa0.c("Unreachable");
        }
    }
}
