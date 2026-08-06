package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l56 {
    public final yo.a.b a;
    public final nd5 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public kha j;
    public ria k;
    public ag7 l;
    public sk8 m;
    public sk8 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = xk6.a();
    public final Matrix q = new Matrix();

    public l56(yo.a.b bVar, nd5 nd5Var) {
        this.a = bVar;
        this.b = nd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    public final void a() {
        nd5 nd5Var = this.b;
        InputMethodManager inputMethodManagerA = nd5Var.a();
        View view = nd5Var.a;
        if (!inputMethodManagerA.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        xk6.d(fArr);
        qq5 qq5VarS = this.a.t.S();
        if (qq5VarS != null) {
            if (!qq5VarS.e()) {
                qq5VarS = null;
            }
            if (qq5VarS != null) {
                qq5VarS.y(fArr);
            }
        }
        g2b g2bVar = g2b.a;
        sk8 sk8Var = this.n;
        sk8Var.getClass();
        float f = -sk8Var.a;
        sk8 sk8Var2 = this.n;
        sk8Var2.getClass();
        xk6.f(fArr, f, -sk8Var2.b);
        Matrix matrix = this.q;
        b23.h(matrix, fArr);
        kha khaVar = this.j;
        khaVar.getClass();
        long j = khaVar.b;
        ag7 ag7Var = this.l;
        ag7Var.getClass();
        ria riaVar = this.k;
        riaVar.getClass();
        sk8 sk8Var3 = this.m;
        sk8Var3.getClass();
        sk8 sk8Var4 = this.n;
        sk8Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        lja ljaVar = khaVar.c;
        int iF = lja.f(j);
        builder.setSelectionRange(iF, lja.e(j));
        jt8 jt8Var = jt8.u;
        if (z && iF >= 0) {
            int iB = ag7Var.b(iF);
            sk8 sk8VarC = riaVar.c(iB);
            float f2 = uh8.f(sk8VarC.a, 0.0f, (int) (riaVar.c >> 32));
            boolean zA = k56.a(sk8Var3, f2, sk8VarC.b);
            boolean zA2 = k56.a(sk8Var3, f2, sk8VarC.d);
            boolean z5 = riaVar.a(iB) == jt8Var;
            int i = (zA || zA2) ? 1 : 0;
            if (!zA || !zA2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f3 = sk8VarC.b;
            float f4 = sk8VarC.d;
            builder.setInsertionMarkerLocation(f2, f3, f4, f4, i);
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
                    float f5 = fArr2[i2];
                    float f6 = fArr2[i2 + 1];
                    int i3 = iE;
                    float f7 = fArr2[i2 + 2];
                    float f8 = fArr2[i2 + 3];
                    int i4 = iB2;
                    int i5 = (sk8Var3.a < f7 ? 1 : 0) & (f5 < sk8Var3.c ? 1 : 0) & (sk8Var3.b < f8 ? 1 : 0) & (f6 < sk8Var3.d ? 1 : 0);
                    if (!k56.a(sk8Var3, f5, f6) || !k56.a(sk8Var3, f7, f8)) {
                        i5 |= 2;
                    }
                    if (riaVar.a(iB4) == jt8Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder.addCharacterBounds(i6, f5, f6, f7, f8, i5);
                    iF2 = i6 + 1;
                    iE = i3;
                    iB2 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            uc2.a(builder, sk8Var4);
        }
        if (i7 >= 34 && z4) {
            wc2.a(builder, riaVar, sk8Var3);
        }
        nd5Var.a().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
