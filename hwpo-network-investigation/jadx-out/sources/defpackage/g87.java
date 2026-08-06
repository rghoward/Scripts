package defpackage;

import defpackage.i87;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g87<T extends i87> {
    public final T a;
    public final hf3 b;
    public final hf3 c;
    public boolean d;
    public e87 e;

    public g87() {
        throw null;
    }

    public g87(T t, boolean z) {
        this.a = t;
        hf3 hf3Var = hf3.t;
        this.b = hf3Var;
        this.c = hf3Var;
        l87.a aVar = l87.a.a;
        this.d = z;
    }

    public void b() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public void d(d87 d87Var) {
        d87Var.getClass();
    }

    public final void e() {
        e87 e87Var = this.e;
        if (e87Var == null || !e87Var.c.remove(this)) {
            return;
        }
        k87 k87Var = e87Var.b;
        k87Var.getClass();
        if (equals(k87Var.f)) {
            int i = k87Var.g;
            if (i == -1) {
                l87.a aVar = l87.a.a;
                a();
            } else if (i == 1) {
                l87.a aVar2 = l87.a.a;
            }
            k87Var.f = null;
            k87Var.g = 0;
            k87Var.h = null;
        }
        k87Var.d.remove(this);
        k87Var.e.remove(this);
        this.e = null;
        k87Var.b();
    }

    public final void f(boolean z) {
        k87 k87Var;
        if (this.d == z) {
            return;
        }
        this.d = z;
        e87 e87Var = this.e;
        if (e87Var == null || (k87Var = e87Var.b) == null) {
            return;
        }
        k87Var.b();
    }

    public void a() {
    }

    public void c(d87 d87Var) {
    }
}
