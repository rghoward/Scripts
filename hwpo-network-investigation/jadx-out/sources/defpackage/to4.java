package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class to4 implements no4 {
    public static final AtomicBoolean x = new AtomicBoolean(true);
    public final u41 b;
    public final s41 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;

    public to4(cm cmVar, u41 u41Var, s41 s41Var) {
        this.b = u41Var;
        this.c = s41Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", cmVar);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (x.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                ln8.c(renderNodeCreate, ln8.a(renderNodeCreate));
                ln8.d(renderNodeCreate, ln8.b(renderNodeCreate));
            }
            kn8.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        e(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = uh1.b;
        this.q = j;
        this.r = j;
        this.t = 8.0f;
    }

    @Override // defpackage.no4
    public final void A(n41 n41Var) {
        Canvas canvas = pl.a;
        DisplayListCanvas displayListCanvas = ((ol) n41Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.no4
    public final int B() {
        return this.j;
    }

    @Override // defpackage.no4
    public final float C() {
        return 0.0f;
    }

    @Override // defpackage.no4
    public final boolean D() {
        return this.d.isValid();
    }

    @Override // defpackage.no4
    public final float E() {
        return this.s;
    }

    @Override // defpackage.no4
    public final void F(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.no4
    public final long G() {
        return this.q;
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
        return this.r;
    }

    @Override // defpackage.no4
    public final void K() {
        f();
    }

    @Override // defpackage.no4
    public final float L() {
        return this.t;
    }

    @Override // defpackage.no4
    public final void M(tx2 tx2Var, tq5 tq5Var, ko4 ko4Var, ko4.a aVar) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            ol olVar = this.b.a;
            Canvas canvas = olVar.a;
            olVar.a = canvasStart;
            s41 s41Var = this.c;
            s41.b bVar = s41Var.u;
            long jC = c43.c(this.e);
            tx2 tx2VarB = bVar.b();
            tq5 tq5VarC = bVar.c();
            n41 n41VarA = bVar.a();
            long jD = bVar.d();
            ko4 ko4Var2 = bVar.b;
            bVar.f(tx2Var);
            bVar.g(tq5Var);
            bVar.e(olVar);
            bVar.h(jC);
            bVar.b = ko4Var;
            olVar.f();
            try {
                aVar.invoke(s41Var);
                olVar.o();
                bVar.f(tx2VarB);
                bVar.g(tq5VarC);
                bVar.e(n41VarA);
                bVar.h(jD);
                bVar.b = ko4Var2;
                olVar.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                olVar.o();
                s41.b bVar2 = s41Var.u;
                bVar2.f(tx2VarB);
                bVar2.g(tq5VarC);
                bVar2.e(n41VarA);
                bVar2.h(jD);
                bVar2.b = ko4Var2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // defpackage.no4
    public final void N(long j, int i, int i2) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (kg5.b(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
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
        this.j = i;
        f();
    }

    @Override // defpackage.no4
    public final Matrix S() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.no4
    public final float T() {
        return this.p;
    }

    @Override // defpackage.no4
    public final float U() {
        return this.o;
    }

    @Override // defpackage.no4
    public final int V() {
        return this.k;
    }

    @Override // defpackage.no4
    public final float a() {
        return this.l;
    }

    @Override // defpackage.no4
    public final void b(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    public final void c() {
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.v) {
            this.v = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.no4
    public final void d(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    public final void e(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void f() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            e(i);
        } else {
            e(1);
        }
    }

    @Override // defpackage.no4
    public final void h(float f) {
        this.s = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.no4
    public final void i(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(nl.b(i)));
        f();
    }

    @Override // defpackage.no4
    public final wh1 j() {
        return null;
    }

    @Override // defpackage.no4
    public final void k(float f) {
        this.o = f;
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
            this.q = j;
            ln8.c(this.d, u7d.l(j));
        }
    }

    @Override // defpackage.no4
    public final void r(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.no4
    public final void s(boolean z) {
        this.u = z;
        c();
    }

    @Override // defpackage.no4
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            ln8.d(this.d, u7d.l(j));
        }
    }

    @Override // defpackage.no4
    public final void w(float f) {
        this.t = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.no4
    public final float x() {
        return this.n;
    }

    @Override // defpackage.no4
    public final void y(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        c();
    }

    @Override // defpackage.no4
    public final void z() {
        kn8.a(this.d);
    }
}
