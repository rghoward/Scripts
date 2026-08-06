package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vo4 implements no4 {
    public static final a x = new a();
    public final w63 b;
    public final u41 c;
    public final ihb d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public vo4(w63 w63Var) {
        u41 u41Var = new u41();
        s41 s41Var = new s41();
        this.b = w63Var;
        this.c = u41Var;
        ihb ihbVar = new ihb(w63Var, u41Var, s41Var);
        this.d = ihbVar;
        this.e = w63Var.getResources();
        this.f = new Rect();
        w63Var.addView(ihbVar);
        ihbVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = uh1.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.no4
    public final void A(n41 n41Var) {
        Rect rect;
        boolean z = this.k;
        ihb ihbVar = this.d;
        if (z) {
            if ((this.m || ihbVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = ihbVar.getWidth();
                rect.bottom = ihbVar.getHeight();
            } else {
                rect = null;
            }
            ihbVar.setClipBounds(rect);
        }
        Canvas canvas = pl.a;
        if (((ol) n41Var).a.isHardwareAccelerated()) {
            this.b.a(n41Var, ihbVar, ihbVar.getDrawingTime());
        }
    }

    @Override // defpackage.no4
    public final int B() {
        return this.o;
    }

    @Override // defpackage.no4
    public final float C() {
        return 0.0f;
    }

    @Override // defpackage.no4
    public final float E() {
        return this.w;
    }

    @Override // defpackage.no4
    public final void F(long j) {
        long j2 = 9223372034707292159L & j;
        ihb ihbVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            ihbVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            ihbVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                lhb.a(ihbVar);
                return;
            }
            this.q = true;
            ihbVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            ihbVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.no4
    public final long G() {
        return this.u;
    }

    @Override // defpackage.no4
    public final float H() {
        return 0.0f;
    }

    @Override // defpackage.no4
    public final void I() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.no4
    public final long J() {
        return this.v;
    }

    @Override // defpackage.no4
    public final void K() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        e();
    }

    @Override // defpackage.no4
    public final float L() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.no4
    public final void M(tx2 tx2Var, tq5 tq5Var, ko4 ko4Var, ko4.a aVar) {
        ihb ihbVar = this.d;
        ViewParent parent = ihbVar.getParent();
        w63 w63Var = this.b;
        if (parent == null) {
            w63Var.addView(ihbVar);
        }
        ihbVar.z = tx2Var;
        ihbVar.A = tq5Var;
        ihbVar.B = aVar;
        ihbVar.C = ko4Var;
        if (ihbVar.isAttachedToWindow()) {
            ihbVar.setVisibility(4);
            ihbVar.setVisibility(0);
            try {
                u41 u41Var = this.c;
                a aVar2 = x;
                ol olVar = u41Var.a;
                Canvas canvas = olVar.a;
                olVar.a = aVar2;
                w63Var.a(olVar, ihbVar, ihbVar.getDrawingTime());
                u41Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.no4
    public final void N(long j, int i, int i2) {
        boolean zB = kg5.b(this.j, j);
        ihb ihbVar = this.d;
        if (zB) {
            int i3 = this.h;
            if (i3 != i) {
                ihbVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                ihbVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || ihbVar.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            ihbVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                ihbVar.setPivotX(i5 / 2.0f);
                ihbVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.no4
    public final float O() {
        return 0.0f;
    }

    @Override // defpackage.no4
    public final void P() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.no4
    public final float Q() {
        return 0.0f;
    }

    @Override // defpackage.no4
    public final void R(int i) {
        this.o = i;
        e();
    }

    @Override // defpackage.no4
    public final Matrix S() {
        return this.d.getMatrix();
    }

    @Override // defpackage.no4
    public final float T() {
        return this.t;
    }

    @Override // defpackage.no4
    public final float U() {
        return this.s;
    }

    @Override // defpackage.no4
    public final int V() {
        return this.n;
    }

    @Override // defpackage.no4
    public final float a() {
        return this.p;
    }

    @Override // defpackage.no4
    public final void b(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    public final void c(int i) {
        ihb ihbVar = this.d;
        boolean z = true;
        if (i == 1) {
            ihbVar.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                ihbVar.setLayerType(0, paint);
                z = false;
            } else {
                ihbVar.setLayerType(0, paint);
            }
        }
        ihbVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.no4
    public final void d(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    public final void e() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            c(i);
        } else {
            c(1);
        }
    }

    @Override // defpackage.no4
    public final void h(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.no4
    public final void i(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(nl.b(i)));
        e();
    }

    @Override // defpackage.no4
    public final wh1 j() {
        return null;
    }

    @Override // defpackage.no4
    public final void k(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.no4
    public final void m() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.no4
    public final void n() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.no4
    public final void p(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            lhb.b(u7d.l(j), this.d);
        }
    }

    @Override // defpackage.no4
    public final void r(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.no4
    public final void s(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.no4
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            lhb.c(u7d.l(j), this.d);
        }
    }

    @Override // defpackage.no4
    public final void w(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.no4
    public final float x() {
        return this.r;
    }

    @Override // defpackage.no4
    public final void y(Outline outline, long j) {
        ihb ihbVar = this.d;
        ihbVar.x = outline;
        ihbVar.invalidateOutline();
        if ((this.m || ihbVar.getClipToOutline()) && outline != null) {
            ihbVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.no4
    public final void z() {
        this.b.removeViewInLayout(this.d);
    }
}
