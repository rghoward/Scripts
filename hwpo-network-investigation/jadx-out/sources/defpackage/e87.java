package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e87 {
    public final yg7 a;
    public final k87 b = new k87();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public e87(yg7 yg7Var) {
        this.a = yg7Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(e87 e87Var, g87 g87Var) {
        e87Var.getClass();
        g87Var.getClass();
        if (e87Var.c.add(g87Var)) {
            k87 k87Var = e87Var.b;
            k87Var.getClass();
            if (g87Var.e != null) {
                ca0.c(g87Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            k87Var.e.addFirst(g87Var);
            g87Var.e = e87Var;
            k87Var.b();
        }
    }

    public final void b(j87 j87Var) {
        if (this.d.add(j87Var)) {
            this.b.a(this, j87Var, -1);
        }
    }

    public final void c(tg7 tg7Var, int i) {
        if (i != 1 && i != 0) {
            ca0.a(pp2.a(i, "Unsupported priority value: "));
        } else if (this.d.add(tg7Var)) {
            this.b.a(this, tg7Var, i);
        }
    }

    public final void d(j87 j87Var, d87 d87Var) {
        k87 k87Var = this.b;
        k87Var.getClass();
        if (k87Var.g != 0) {
            return;
        }
        g87<?> g87VarC = k87Var.c(-1);
        k87Var.f = g87VarC;
        k87Var.g = -1;
        k87Var.h = j87Var;
        if (d87Var != null) {
            if (g87VarC != null) {
                new l87.b(d87Var, -1);
                g87VarC.d(d87Var);
            }
            a0a a0aVar = k87Var.a;
            l87.b bVar = new l87.b(d87Var, -1);
            a0aVar.getClass();
            a0aVar.l(null, bVar);
        }
    }
}
