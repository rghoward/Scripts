package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class np implements cs7 {
    public final Paint a;
    public int b;
    public Shader c;
    public wh1 d;

    public np() {
        this(new Paint(7));
    }

    @Override // defpackage.cs7
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // defpackage.cs7
    public final void b(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.cs7
    public final long c() {
        return u7d.c(this.a.getColor());
    }

    @Override // defpackage.cs7
    public final void d(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.cs7
    public final Shader e() {
        return this.c;
    }

    @Override // defpackage.cs7
    public final void f(long j) {
        this.a.setColor(u7d.l(j));
    }

    public final int g() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : op.a.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int h() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : op.a.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void i(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            tqb.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(nl.b(i)));
        }
    }

    public final void j(wh1 wh1Var) {
        this.d = wh1Var;
        this.a.setColorFilter(wh1Var != null ? wh1Var.a : null);
    }

    public final void k(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void l(int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.a.setStrokeCap(cap);
    }

    public final void m(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.a.setStrokeJoin(join);
    }

    public final void n(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void o(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void p(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public np(Paint paint) {
        this.a = paint;
        this.b = 3;
    }
}
