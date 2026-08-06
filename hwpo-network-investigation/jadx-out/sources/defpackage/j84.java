package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j84 {
    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void b(final boolean z, final ci4 ci4Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1818896922);
        int i2 = (bj4VarO.c(z) ? 4 : 2) | i | (bj4VarO.j(ci4Var) ? 32 : 16);
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            n64.a(z, ci4Var, bj4VarO, i2 & 126);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(z, ci4Var, i) { // from class: b57
                public final /* synthetic */ boolean t;
                public final /* synthetic */ ci4 u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    j84.b(this.t, this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final ox6 c(ox6 ox6Var, oh4 oh4Var) {
        return ox6Var.H(new i84(oh4Var));
    }

    public static final void d(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }
}
