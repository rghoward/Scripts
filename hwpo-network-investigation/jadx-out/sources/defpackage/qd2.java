package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd2<T> implements j9a<T> {
    public final int t;
    public final int u;
    public kp8 v;

    public qd2() {
        if (!l6b.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            z90.a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.t = Integer.MIN_VALUE;
        this.u = Integer.MIN_VALUE;
    }

    @Override // defpackage.j9a
    public final kp8 b() {
        return this.v;
    }

    @Override // defpackage.j9a
    public final void d(hq9 hq9Var) throws Throwable {
        hq9Var.e(this.t, this.u);
    }

    @Override // defpackage.j9a
    public final void e(kp8 kp8Var) {
        this.v = kp8Var;
    }

    @Override // defpackage.k76
    public final void a() {
    }

    @Override // defpackage.k76
    public final void f() {
    }

    @Override // defpackage.k76
    public final void k() {
    }

    @Override // defpackage.j9a
    public final void c(hq9 hq9Var) {
    }

    @Override // defpackage.j9a
    public final void g(Drawable drawable) {
    }

    @Override // defpackage.j9a
    public final void h(Drawable drawable) {
    }
}
