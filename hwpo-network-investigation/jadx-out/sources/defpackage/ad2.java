package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final class ad2 {
    public final cm a;
    public final md5 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public kha j;
    public ria k;
    public ag7 l;
    public sk8 n;
    public sk8 o;
    public final Object c = new Object();
    public oh4<? super xk6, g2b> m = zc2.u;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = xk6.a();
    public final Matrix r = new Matrix();

    public ad2(cm cmVar, md5 md5Var) {
        this.a = cmVar;
        this.b = md5Var;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    public final void a() {
        md5 md5Var = this.b;
        ss5 ss5Var = md5Var.b;
        InputMethodManager inputMethodManager = (InputMethodManager) ss5Var.getValue();
        View view = md5Var.a;
        if (inputMethodManager.isActive(view)) {
            oh4<? super xk6, g2b> oh4Var = this.m;
            float[] fArr = this.q;
            oh4Var.invoke(new xk6(fArr));
            this.a.r(fArr);
            Matrix matrix = this.r;
            b23.h(matrix, fArr);
            kha khaVar = this.j;
            khaVar.getClass();
            long j = khaVar.b;
            ag7 ag7Var = this.l;
            ag7Var.getClass();
            ria riaVar = this.k;
            riaVar.getClass();
            sk8 sk8Var = this.n;
            sk8Var.getClass();
            sk8 sk8Var2 = this.o;
            sk8Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            lja ljaVar = khaVar.c;
            int iF = lja.f(j);
            builder.setSelectionRange(iF, lja.e(j));
            jt8 jt8Var = jt8.u;
            if (z && iF >= 0) {
                int iB = ag7Var.b(iF);
                sk8 sk8VarC = riaVar.c(iB);
                float f = uh8.f(sk8VarC.a, 0.0f, (int) (riaVar.c >> 32));
                boolean zA = xc2.a(sk8Var, f, sk8VarC.b);
                boolean zA2 = xc2.a(sk8Var, f, sk8VarC.d);
                boolean z5 = riaVar.a(iB) == jt8Var;
                int i = (zA || zA2) ? 1 : 0;
                if (!zA || !zA2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f2 = sk8VarC.b;
                float f3 = sk8VarC.d;
                builder.setInsertionMarkerLocation(f, f2, f3, f3, i);
            }
            if (z2) {
                int iF2 = ljaVar != null ? lja.f(ljaVar.a) : -1;
                int iE = ljaVar != null ? lja.e(ljaVar.a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder.setComposingText(iF2, khaVar.a.u.subSequence(iF2, iE));
                    int iB2 = ag7Var.b(iF2);
                    int iB3 = ag7Var.b(iE);
                    float[] fArr2 = new float[(iB3 - iB2) * 4];
                    riaVar.b.a(ay.c(iB2, iB3), fArr2);
                    while (iF2 < iE) {
                        int iB4 = ag7Var.b(iF2);
                        int i2 = (iB4 - iB2) * 4;
                        float f4 = fArr2[i2];
                        float f5 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f6 = fArr2[i2 + 2];
                        float f7 = fArr2[i2 + 3];
                        int i4 = iB2;
                        int i5 = (sk8Var.a < f6 ? 1 : 0) & (f4 < sk8Var.c ? 1 : 0) & (sk8Var.b < f7 ? 1 : 0) & (f5 < sk8Var.d ? 1 : 0);
                        if (!xc2.a(sk8Var, f4, f5) || !xc2.a(sk8Var, f6, f7)) {
                            i5 |= 2;
                        }
                        if (riaVar.a(iB4) == jt8Var) {
                            i5 |= 4;
                        }
                        int i6 = iF2;
                        builder.addCharacterBounds(i6, f4, f5, f6, f7, i5);
                        iF2 = i6 + 1;
                        iE = i3;
                        iB2 = i4;
                    }
                }
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33 && z3) {
                tc2.a(builder, sk8Var2);
            }
            if (i7 >= 34 && z4) {
                vc2.a(builder, riaVar, sk8Var);
            }
            ((InputMethodManager) ss5Var.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
