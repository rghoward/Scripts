package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wf7<N> implements p20<N> {
    public final p20<N> a;
    public final int b;
    public int c;

    public wf7(p20<N> p20Var, int i) {
        this.a = p20Var;
        this.b = i;
    }

    @Override // defpackage.p20
    public final N a() {
        return this.a.a();
    }

    @Override // defpackage.p20
    public final void b(ci4<? super N, Object, g2b> ci4Var, Object obj) {
        this.a.b(ci4Var, obj);
    }

    @Override // defpackage.p20
    public final void c(int i, N n) {
        this.a.c(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // defpackage.p20
    public final void d(N n) {
        this.c++;
        this.a.d(n);
    }

    @Override // defpackage.p20
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.p20
    public final void f(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.p20
    public final void g(int i, int i2) {
        this.a.g(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.p20
    public final void h() {
        if (this.c <= 0) {
            pt1.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.p20
    public final void i(int i, N n) {
        this.a.i(i + (this.c == 0 ? this.b : 0), n);
    }
}
