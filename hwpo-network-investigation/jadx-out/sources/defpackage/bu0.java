package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 {
    public static final bu0 a = new bu0();
    public static final float b = 640.0f;
    public static final float c = 56.0f;
    public static final float d = 125.0f;

    public final void a(ox6 ox6Var, float f, float f2, jl9 jl9Var, long j, jt1 jt1Var, final int i) {
        bj4 bj4Var;
        final ox6 ox6Var2;
        final float f3;
        final float f4;
        final jl9 jl9Var2;
        final long j2;
        jl9 jl9Var3;
        long jD;
        float f5;
        float f6;
        ox6 ox6Var3;
        bj4 bj4VarO = jt1Var.o(-1364277227);
        int i2 = i | 9654;
        if (bj4VarO.A(i2 & 1, (i2 & 9363) != 9362)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                float f7 = kr5.d;
                float f8 = kr5.c;
                jl9Var3 = ((ul9) bj4VarO.F(wl9.a)).e;
                jD = hi1.d(kr5.b, bj4VarO);
                f5 = f8;
                f6 = f7;
                ox6Var3 = ox6.a.t;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var;
                f6 = f;
                f5 = f2;
                jl9Var3 = jl9Var;
                jD = j;
            }
            bj4VarO.V();
            String strB = ws3.b(bj4VarO, R.string.m3c_bottom_sheet_drag_handle_description);
            xya xyaVar = dn9.a;
            ox6 ox6VarK = eo7.k(ox6Var3, 0.0f, 22.0f, 1);
            boolean zJ = bj4VarO.J(strB);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new yt0(0, strB);
                bj4VarO.C(objF);
            }
            bj4Var = bj4VarO;
            v5a.a(pb9.b(ox6VarK, false, (oh4) objF), jl9Var3, jD, 0L, 0.0f, 0.0f, null, gr1.b(-1039573072, new au0(f6, f5), bj4VarO), bj4Var, 12582912, 120);
            f4 = f5;
            jl9Var2 = jl9Var3;
            j2 = jD;
            f3 = f6;
            ox6Var2 = ox6Var3;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            ox6Var2 = ox6Var;
            f3 = f;
            f4 = f2;
            jl9Var2 = jl9Var;
            j2 = j;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var2, f3, f4, jl9Var2, j2, i) { // from class: zt0
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ float v;
                public final /* synthetic */ float w;
                public final /* synthetic */ jl9 x;
                public final /* synthetic */ long y;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(196609);
                    this.t.a(this.u, this.v, this.w, this.x, this.y, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
