package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jn4 extends gw2 implements a73 {
    public final bo J;
    public final ga3 K;
    public final go7 L;

    public jn4(z6a z6aVar, bo boVar, ga3 ga3Var, go7 go7Var) {
        this.J = boVar;
        this.K = ga3Var;
        this.L = go7Var;
        c2(z6aVar);
    }

    public static boolean f2(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        boolean zF2;
        char c;
        long j;
        s41 s41Var = tr5Var.t;
        long jC = s41Var.c();
        bo boVar = this.J;
        boVar.k(jC);
        if (cr9.e(s41Var.c())) {
            tr5Var.K1();
            return;
        }
        tr5Var.K1();
        boVar.d.getValue();
        Canvas canvasA = pl.a(s41Var.u.a());
        ga3 ga3Var = this.K;
        boolean zF = ga3.f(ga3Var.f);
        go7 go7Var = this.L;
        if (zF) {
            zF2 = f2(270.0f, (((long) Float.floatToRawIntBits(tr5Var.U0(go7Var.b(tr5Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (s41Var.c() & 4294967295L)))) << 32), ga3Var.c(), canvasA);
        } else {
            zF2 = false;
        }
        if (ga3.f(ga3Var.d)) {
            c = ' ';
            j = 4294967295L;
            zF2 = f2(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(tr5Var.U0(go7Var.d()))) & 4294967295L), ga3Var.e(), canvasA) || zF2;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (ga3.f(ga3Var.g)) {
            zF2 = f2(90.0f, (((long) Float.floatToRawIntBits(tr5Var.U0(go7Var.c(tr5Var.getLayoutDirection())) + (-((float) wk6.b(Float.intBitsToFloat((int) (s41Var.c() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), ga3Var.d(), canvasA) || zF2;
        }
        if (ga3.f(ga3Var.e)) {
            EdgeEffect edgeEffectB = ga3Var.b();
            zF2 = f2(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (s41Var.c() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (s41Var.c() & j))) + tr5Var.U0(go7Var.a()))) & j), edgeEffectB, canvasA) || zF2;
        }
        if (zF2) {
            boVar.f();
        }
    }
}
