package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class r91<E> extends x0<g2b> implements p91<E> {
    public final zx0 y;

    public r91(h72 h72Var, zx0 zx0Var) {
        super(h72Var, true);
        this.y = zx0Var;
    }

    @Override // defpackage.ll5
    public final void A(CancellationException cancellationException) {
        this.y.p(cancellationException, true);
        z(cancellationException);
    }

    @Override // defpackage.sc9
    public final Object a(r02 r02Var, Object obj) {
        return this.y.a(r02Var, obj);
    }

    @Override // defpackage.tj8
    public final m99 b() {
        return this.y.b();
    }

    @Override // defpackage.tj8
    public final m99 c() {
        return this.y.c();
    }

    @Override // defpackage.tj8
    public final Object d() {
        return this.y.d();
    }

    @Override // defpackage.sc9
    public final void f(pa8 pa8Var) {
        this.y.f(pa8Var);
    }

    @Override // defpackage.sc9
    public final boolean g(Throwable th) {
        return this.y.p(th, false);
    }

    @Override // defpackage.tj8
    public final Object i(p6a p6aVar) {
        zx0 zx0Var = this.y;
        zx0Var.getClass();
        return zx0.K(zx0Var, p6aVar);
    }

    @Override // defpackage.tj8
    public final ca1<E> iterator() {
        zx0 zx0Var = this.y;
        zx0Var.getClass();
        return new zx0.a();
    }

    @Override // defpackage.ll5, defpackage.el5
    public final void k(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new fl5(D(), null, this);
        }
        A(cancellationException);
    }

    @Override // defpackage.sc9
    public final Object n(E e) {
        return this.y.n(e);
    }

    @Override // defpackage.sc9
    public final boolean o() {
        return this.y.o();
    }

    @Override // defpackage.tj8
    public final Object q(dj1 dj1Var) {
        zx0 zx0Var = this.y;
        zx0Var.getClass();
        return zx0.L(zx0Var, dj1Var);
    }
}
