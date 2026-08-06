package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b2a extends gw2 implements a73 {
    public final bo J;
    public final ga3 K;
    public RenderNode L;

    public b2a(z6a z6aVar, bo boVar, ga3 ga3Var) {
        this.J = boVar;
        this.K = ga3Var;
        c2(z6aVar);
    }

    public static boolean f2(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode g2() {
        RenderNode renderNode = this.L;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = a2a.a();
        this.L = renderNodeA;
        return renderNodeA;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01e7 A[PHI: r20
      0x01e7: PHI (r20v2 boolean) = (r20v1 boolean), (r20v11 boolean) binds: [B:92:0x019c, B:100:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        boolean zF2;
        boolean z;
        char c;
        float f;
        s41 s41Var = tr5Var.t;
        long jC = s41Var.c();
        bo boVar = this.J;
        boVar.k(jC);
        Canvas canvasA = pl.a(s41Var.u.a());
        boVar.d.getValue();
        if (cr9.e(s41Var.c())) {
            tr5Var.K1();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        ga3 ga3Var = this.K;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = ga3Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = ga3Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = ga3Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = ga3Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = ga3Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = ga3Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = ga3Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = ga3Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            tr5Var.K1();
            return;
        }
        float fU0 = tr5Var.U0(30.0f);
        boolean z2 = ga3.f(ga3Var.d) || ga3.g(ga3Var.h) || ga3.f(ga3Var.e) || ga3.g(ga3Var.i);
        boolean z3 = ga3.f(ga3Var.f) || ga3.g(ga3Var.j) || ga3.f(ga3Var.g) || ga3.g(ga3Var.k);
        if (z2 && z3) {
            g2().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z2) {
            g2().setPosition(0, 0, (wk6.b(fU0) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z3) {
                tr5Var.K1();
                return;
            }
            g2().setPosition(0, 0, canvasA.getWidth(), (wk6.b(fU0) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = g2().beginRecording();
        boolean zG = ga3.g(ga3Var.j);
        fl7 fl7Var = fl7.u;
        if (zG) {
            EdgeEffect edgeEffectA = ga3Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = ga3Var.a(fl7Var);
                ga3Var.j = edgeEffectA;
            }
            f2(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (ga3.f(ga3Var.f)) {
            EdgeEffect edgeEffectC = ga3Var.c();
            zF2 = f2(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (ga3.g(ga3Var.f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (boVar.e() & 4294967295L));
                EdgeEffect edgeEffectA2 = ga3Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = ga3Var.a(fl7Var);
                    ga3Var.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fB = i >= 31 ? ix.b(edgeEffectC) : 0.0f;
                float f2 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    ix.c(edgeEffectA2, fB, f2);
                } else {
                    edgeEffectA2.onPull(fB, f2);
                }
            }
        } else {
            zF2 = false;
        }
        boolean zG2 = ga3.g(ga3Var.h);
        fl7 fl7Var2 = fl7.t;
        if (zG2) {
            EdgeEffect edgeEffectA3 = ga3Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = ga3Var.a(fl7Var2);
                ga3Var.h = edgeEffectA3;
            }
            f2(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (ga3.f(ga3Var.d)) {
            EdgeEffect edgeEffectE = ga3Var.e();
            zF2 = f2(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zF2;
            if (ga3.g(ga3Var.d)) {
                z = z3;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (boVar.e() >> 32));
                EdgeEffect edgeEffectA4 = ga3Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = ga3Var.a(fl7Var2);
                    ga3Var.h = edgeEffectA4;
                }
                c = ' ';
                int i2 = Build.VERSION.SDK_INT;
                float fB2 = i2 >= 31 ? ix.b(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    ix.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            } else {
                z = z3;
                c = ' ';
            }
        } else {
            z = z3;
            c = ' ';
        }
        if (ga3.g(ga3Var.k)) {
            EdgeEffect edgeEffectA5 = ga3Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = ga3Var.a(fl7Var);
                ga3Var.k = edgeEffectA5;
            }
            f2(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (ga3.f(ga3Var.g)) {
            EdgeEffect edgeEffectD = ga3Var.d();
            zF2 = f2(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zF2;
            if (ga3.g(ga3Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (boVar.e() & 4294967295L));
                EdgeEffect edgeEffectA6 = ga3Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = ga3Var.a(fl7Var);
                    ga3Var.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fB3 = i3 >= 31 ? ix.b(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    ix.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
        }
        if (ga3.g(ga3Var.i)) {
            EdgeEffect edgeEffectA7 = ga3Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = ga3Var.a(fl7Var2);
                ga3Var.i = edgeEffectA7;
            }
            f = 0.0f;
            f2(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f = 0.0f;
        }
        if (ga3.f(ga3Var.e)) {
            EdgeEffect edgeEffectB = ga3Var.b();
            boolean z4 = f2(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zF2;
            if (ga3.g(ga3Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (boVar.e() >> c));
                EdgeEffect edgeEffectA8 = ga3Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = ga3Var.a(fl7Var2);
                    ga3Var.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fB4 = i4 >= 31 ? ix.b(edgeEffectB) : f;
                float f3 = 1.0f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    ix.c(edgeEffectA8, fB4, f3);
                } else {
                    edgeEffectA8.onPull(fB4, f3);
                }
            }
            zF2 = z4;
        }
        if (zF2) {
            boVar.f();
        }
        float f4 = z ? f : fU0;
        if (z2) {
            fU0 = f;
        }
        tq5 layoutDirection = tr5Var.getLayoutDirection();
        ol olVar = new ol();
        olVar.a = recordingCanvasBeginRecording;
        long jC2 = s41Var.c();
        tx2 tx2VarB = s41Var.u.b();
        tq5 tq5VarC = s41Var.u.c();
        n41 n41VarA = s41Var.u.a();
        long jD = s41Var.u.d();
        s41.b bVar = s41Var.u;
        ko4 ko4Var = bVar.b;
        bVar.f(tr5Var);
        bVar.g(layoutDirection);
        bVar.e(olVar);
        bVar.h(jC2);
        bVar.b = null;
        olVar.f();
        try {
            s41Var.u.a.f(f4, fU0);
            try {
                tr5Var.K1();
                float f5 = -f4;
                float f6 = -fU0;
                s41Var.u.a.f(f5, f6);
                olVar.o();
                s41.b bVar2 = s41Var.u;
                bVar2.f(tx2VarB);
                bVar2.g(tq5VarC);
                bVar2.e(n41VarA);
                bVar2.h(jD);
                bVar2.b = ko4Var;
                g2().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f5, f6);
                canvasA.drawRenderNode(g2());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th) {
                s41Var.u.a.f(-f4, -fU0);
                throw th;
            }
        } catch (Throwable th2) {
            olVar.o();
            s41.b bVar3 = s41Var.u;
            bVar3.f(tx2VarB);
            bVar3.g(tq5VarC);
            bVar3.e(n41VarA);
            bVar3.h(jD);
            bVar3.b = ko4Var;
            throw th2;
        }
    }
}
