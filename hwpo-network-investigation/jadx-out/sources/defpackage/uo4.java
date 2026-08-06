package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uo4 implements no4 {
    public final u41 b;
    public final s41 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;

    public uo4() {
        u41 u41Var = new u41();
        s41 s41Var = new s41();
        this.b = u41Var;
        this.c = s41Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        e(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = uh1.b;
        this.n = j;
        this.o = j;
        this.q = 8.0f;
        this.u = 0;
    }

    @Override // defpackage.no4
    public final void A(n41 n41Var) {
        Canvas canvas = pl.a;
        ((ol) n41Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.no4
    public final int B() {
        return this.u;
    }

    @Override // defpackage.no4
    public final float C() {
        return 0.0f;
    }

    @Override // defpackage.no4
    public final boolean D() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.no4
    public final float E() {
        return this.p;
    }

    @Override // defpackage.no4
    public final void F(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.no4
    public final long G() {
        return this.n;
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
        return this.o;
    }

    @Override // defpackage.no4
    public final void K() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        f();
    }

    @Override // defpackage.no4
    public final float L() {
        return this.q;
    }

    @Override // defpackage.no4
    public final void M(tx2 tx2Var, tq5 tq5Var, ko4 ko4Var, ko4.a aVar) {
        s41 s41Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            u41 u41Var = this.b;
            ol olVar = u41Var.a;
            Canvas canvas = olVar.a;
            olVar.a = recordingCanvasBeginRecording;
            s41.b bVar = s41Var.u;
            bVar.f(tx2Var);
            bVar.g(tq5Var);
            bVar.b = ko4Var;
            bVar.h(this.e);
            bVar.e(olVar);
            aVar.invoke(s41Var);
            u41Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.no4
    public final void N(long j, int i, int i2) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = c43.c(j);
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
        this.u = i;
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
        return this.m;
    }

    @Override // defpackage.no4
    public final float U() {
        return this.l;
    }

    @Override // defpackage.no4
    public final int V() {
        return this.j;
    }

    @Override // defpackage.no4
    public final float a() {
        return this.i;
    }

    @Override // defpackage.no4
    public final void b(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    public final void c() {
        boolean z = this.r;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.s) {
            this.s = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.t) {
            this.t = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.no4
    public final void d(float f) {
        this.m = f;
        this.d.setElevation(f);
    }

    public final void e(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void f() {
        int i = this.u;
        if (i != 1 && this.j == 3) {
            e(this.d, i);
        } else {
            e(this.d, 1);
        }
    }

    @Override // defpackage.no4
    public final void h(float f) {
        this.p = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.no4
    public final void i(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(nl.a(i));
        f();
    }

    @Override // defpackage.no4
    public final wh1 j() {
        return null;
    }

    @Override // defpackage.no4
    public final void k(float f) {
        this.l = f;
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
        this.n = j;
        this.d.setAmbientShadowColor(u7d.l(j));
    }

    @Override // defpackage.no4
    public final void r(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.no4
    public final void s(boolean z) {
        this.r = z;
        c();
    }

    @Override // defpackage.no4
    public final void u(long j) {
        this.o = j;
        this.d.setSpotShadowColor(u7d.l(j));
    }

    @Override // defpackage.no4
    public final void w(float f) {
        this.q = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.no4
    public final float x() {
        return this.k;
    }

    @Override // defpackage.no4
    public final void y(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        c();
    }

    @Override // defpackage.no4
    public final void z() {
        this.d.discardDisplayList();
    }
}
