package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class os1 extends hh0 {
    public final t72 c;
    public ci4<? super r54<gh0>, ? super r02<? super g2b>, ? extends Object> d;
    public zx0 e;
    public dz9 f;
    public boolean g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.activity.compose.ComposePredictiveBackHandler$currentOnBack$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<r54<? extends gh0>, r02<? super g2b>, Object> {
        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(2, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(r54<? extends gh0> r54Var, r02<? super g2b> r02Var) {
            return ((a) create(r54Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return g2b.a;
        }
    }

    public os1(t72 t72Var, i78 i78Var) {
        super(i78Var);
        this.c = t72Var;
        this.d = new a(2, null);
    }

    @Override // defpackage.hh0
    public final void b() {
        zx0 zx0Var = this.e;
        if (zx0Var != null) {
            zx0Var.p(new CancellationException("onBack cancelled"), true);
        }
        dz9 dz9Var = this.f;
        if (dz9Var != null) {
            dz9Var.k(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.hh0
    public final void c() {
        if (this.e != null && !this.g) {
            b();
        }
        if (this.e == null) {
            this.g = false;
            this.e = da1.a(-2, 4, xx0.t);
            this.f = oy0.d(this.c, null, null, new ps1(this, null), 3);
        }
        zx0 zx0Var = this.e;
        if (zx0Var != null) {
            zx0Var.g(null);
        }
        this.g = false;
    }

    @Override // defpackage.hh0
    public final void d(gh0 gh0Var) {
        zx0 zx0Var = this.e;
        if (zx0Var != null) {
            zx0Var.n(gh0Var);
        }
    }

    @Override // defpackage.hh0
    public final void e() {
        b();
        if (super.a()) {
            this.g = true;
            this.e = da1.a(-2, 4, xx0.t);
            this.f = oy0.d(this.c, null, null, new ps1(this, null), 3);
        }
    }

    public final void f(boolean z) {
        dz9 dz9Var;
        if (!z && super.a() && (dz9Var = this.f) != null && !dz9Var.h()) {
            b();
        }
        this.a.setEnabled(z);
        this.b.f(z);
    }
}
