package defpackage;

import android.text.SpannableStringBuilder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ym7 implements jac {
    public static final gi1 A;
    public static final gi1 B;
    public static final gi1 C;
    public static final gi1 D;
    public static final gi1 E;
    public static final gi1 F;
    public static final gi1 G;
    public static final gi1 H;
    public static final gi1 I;
    public static final gi1 J;
    public static final gi1 K;
    public static final gi1 L;
    public static final gi1 M;
    public static final gi1 N;
    public static final gi1 O;
    public static final gi1 P;
    public static final gi1 Q;
    public static final gi1 R;
    public static final gi1 S;
    public static final gi1 T;
    public static final gi1 U;
    public static final gi1 V;
    public static final gi1 W;
    public static final /* synthetic */ ym7 X;
    public static final gi1 t;
    public static final pl9 u;
    public static final gi1 v;
    public static final gi1 w;
    public static final gi1 x;
    public static final gi1 y;
    public static final gi1 z;

    static {
        gi1 gi1Var = gi1.F;
        t = gi1Var;
        u = pl9.v;
        gi1 gi1Var2 = gi1.A;
        v = gi1Var2;
        w = gi1Var2;
        x = gi1Var2;
        y = gi1Var2;
        z = gi1Var2;
        A = gi1Var2;
        gi1 gi1Var3 = gi1.t;
        B = gi1Var3;
        C = gi1Var2;
        D = gi1Var3;
        gi1 gi1Var4 = gi1.B;
        E = gi1Var4;
        F = gi1Var3;
        G = gi1Var3;
        H = gi1Var3;
        I = gi1Var2;
        J = gi1Var;
        K = gi1Var4;
        L = gi1Var;
        M = gi1Var4;
        N = gi1Var4;
        O = gi1Var2;
        P = gi1Var4;
        Q = gi1Var4;
        R = gi1Var4;
        S = gi1Var4;
        T = gi1Var4;
        U = gi1.D;
        V = gi1Var4;
        W = gi1Var4;
        X = new ym7();
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static float c(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int d(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Double.valueOf(l6c.u.get().c());
    }
}
