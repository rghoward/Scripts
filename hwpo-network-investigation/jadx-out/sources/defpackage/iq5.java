package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iq5 implements im8, o72 {
    public final h72 t;
    public final ci4<t72, r02<? super g2b>, Object> u;
    public final o02 v;
    public dz9 w;

    /* JADX WARN: Multi-variable type inference failed */
    public iq5(h72 h72Var, ci4<? super t72, ? super r02<? super g2b>, ? extends Object> ci4Var) {
        this.t = h72Var;
        this.u = ci4Var;
        this.v = u72.a(h72Var.c0(this));
    }

    @Override // defpackage.o72
    public final void B(h72 h72Var, Throwable th) throws Throwable {
        du1 du1Var = (du1) h72Var.d0(du1.u);
        if (du1Var != null) {
            du1Var.b(this, th);
        }
        o72 o72Var = (o72) this.t.d0(o72.a.t);
        if (o72Var == null) {
            throw th;
        }
        o72Var.B(h72Var, th);
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    @Override // defpackage.h72
    public final h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    @Override // defpackage.im8
    public final void b() {
        dz9 dz9Var = this.w;
        if (dz9Var != null) {
            dz9Var.A(new d56());
        }
        this.w = null;
    }

    @Override // defpackage.im8
    public final void c() {
        dz9 dz9Var = this.w;
        if (dz9Var != null) {
            dz9Var.A(new d56());
        }
        this.w = null;
    }

    @Override // defpackage.h72
    public final h72 c0(h72 h72Var) {
        return h72.a.C0100a.c(this, h72Var);
    }

    @Override // defpackage.im8
    public final void d() {
        dz9 dz9Var = this.w;
        if (dz9Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            dz9Var.k(cancellationException);
        }
        this.w = oy0.d(this.v, null, null, this.u, 3);
    }

    @Override // defpackage.h72
    public final <E extends h72.a> E d0(h72.b<E> bVar) {
        return (E) h72.a.C0100a.a(this, bVar);
    }

    @Override // h72.a
    public final h72.b<?> getKey() {
        return o72.a.t;
    }
}
