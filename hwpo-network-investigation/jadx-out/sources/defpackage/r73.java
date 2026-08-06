package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r73 extends es7 implements im8 {
    public final dt7 A;
    public final o7a B;
    public final Drawable y;
    public final dt7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<q73> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final q73 invoke() {
            return new q73(r73.this);
        }
    }

    public r73(Drawable drawable) {
        drawable.getClass();
        this.y = drawable;
        this.z = bl7.i(0);
        ss5 ss5Var = s73.a;
        this.A = bl7.i(new cr9((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : p50.b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.B = new o7a(new a());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.es7
    public final boolean a(float f) {
        this.y.setAlpha(uh8.g(wk6.b(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.im8
    public final void b() {
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.im8
    public final void c() {
        Drawable drawable = this.y;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.im8
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.B.getValue();
        Drawable drawable = this.y;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.es7
    public final boolean e(wh1 wh1Var) {
        this.y.setColorFilter(wh1Var != null ? wh1Var.a : null);
        return true;
    }

    @Override // defpackage.es7
    public final void f(tq5 tq5Var) {
        int i;
        tq5Var.getClass();
        int iOrdinal = tq5Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                u.b();
                return;
            }
        } else {
            i = 0;
        }
        this.y.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es7
    public final long h() {
        return ((cr9) this.A.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es7
    public final void i(d73 d73Var) {
        d73Var.getClass();
        n41 n41VarA = d73Var.Y0().a();
        ((Number) this.z.getValue()).intValue();
        int iB = wk6.b(cr9.d(d73Var.c()));
        int iB2 = wk6.b(cr9.b(d73Var.c()));
        Drawable drawable = this.y;
        drawable.setBounds(0, 0, iB, iB2);
        try {
            n41VarA.f();
            Canvas canvas = pl.a;
            drawable.draw(((ol) n41VarA).a);
        } finally {
            n41VarA.o();
        }
    }
}
