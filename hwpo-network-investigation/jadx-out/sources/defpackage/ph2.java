package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ph2 {
    public static final ph2 a = new ph2();
    public static final fg5 b = new fg5(1900, 2100, 1);
    public static final a c = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements s99 {
    }

    public static lh2 c(jt1 jt1Var) {
        fi1 fi1Var = (fi1) jt1Var.F(hi1.a);
        lh2 lh2Var = fi1Var.b0;
        if (lh2Var != null) {
            jt1Var.K(642290457);
            jt1Var.B();
            return lh2Var;
        }
        jt1Var.K(642416503);
        long jC = hi1.c(fi1Var, fk2.a);
        long jC2 = hi1.c(fi1Var, fk2.r);
        long jC3 = hi1.c(fi1Var, fk2.p);
        long jC4 = hi1.c(fi1Var, fk2.w);
        long jC5 = hi1.c(fi1Var, fk2.v);
        long j = fi1Var.s;
        gi1 gi1Var = fk2.E;
        long jC6 = hi1.c(fi1Var, gi1Var);
        long jB = uh1.b(0.38f, hi1.c(fi1Var, gi1Var));
        gi1 gi1Var2 = fk2.m;
        long jC7 = hi1.c(fi1Var, gi1Var2);
        gi1 gi1Var3 = fk2.C;
        long jC8 = hi1.c(fi1Var, gi1Var3);
        long jB2 = uh1.b(0.38f, hi1.c(fi1Var, gi1Var3));
        gi1 gi1Var4 = fk2.B;
        long jC9 = hi1.c(fi1Var, gi1Var4);
        long jB3 = uh1.b(0.38f, hi1.c(fi1Var, gi1Var4));
        gi1 gi1Var5 = fk2.n;
        long jC10 = hi1.c(fi1Var, gi1Var5);
        long jB4 = uh1.b(0.38f, hi1.c(fi1Var, gi1Var5));
        gi1 gi1Var6 = fk2.j;
        long jC11 = hi1.c(fi1Var, gi1Var6);
        long jB5 = uh1.b(0.38f, hi1.c(fi1Var, gi1Var6));
        gi1 gi1Var7 = fk2.i;
        lh2 lh2Var2 = new lh2(jC, jC2, jC3, jC4, jC5, j, jC6, jB, jC7, jC8, jB2, jC9, jB3, jC10, jB4, jC11, jB5, hi1.c(fi1Var, gi1Var7), uh1.b(0.38f, hi1.c(fi1Var, gi1Var7)), hi1.c(fi1Var, gi1Var2), hi1.c(fi1Var, fk2.k), hi1.c(fi1Var, fk2.t), hi1.c(fi1Var, fk2.u), hi1.c(fi1Var, kw0.a), jm7.c(fi1Var, jt1Var));
        fi1Var.b0 = lh2Var2;
        jt1Var.B();
        return lh2Var2;
    }

    public final void a(final Long l, final int i, final yh2 yh2Var, final ox6 ox6Var, final long j, jt1 jt1Var, final int i2) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(1913724796);
        int i3 = i2 | (bj4VarO.J(l) ? 4 : 2) | (bj4VarO.h(i) ? 32 : 16) | (bj4VarO.J(yh2Var) ? 256 : 128) | (bj4VarO.i(j) ? 16384 : 8192);
        if (bj4VarO.A(i3 & 1, (74899 & i3) != 74898)) {
            bj4VarO.v0();
            if ((i2 & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            bj4VarO.K(2088426481);
            Locale locale = ((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            bj4VarO.B();
            String strA = yh2Var.a(l, locale, false);
            String strA2 = yh2Var.a(l, locale, true);
            String strB = BuildConfig.FLAVOR;
            if (strA2 == null) {
                bj4VarO.K(380185931);
                if (i == 0) {
                    bj4VarO.K(843549871);
                    strA2 = ws3.b(bj4VarO, R.string.m3c_date_picker_no_selection_description);
                    bj4VarO.U(false);
                } else if (i == 1) {
                    bj4VarO.K(843552842);
                    strA2 = ws3.b(bj4VarO, R.string.m3c_date_input_no_input_description);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(380407362);
                    bj4VarO.U(false);
                    strA2 = BuildConfig.FLAVOR;
                }
                bj4VarO.U(false);
            } else {
                bj4VarO.K(843542258);
                bj4VarO.U(false);
            }
            if (strA == null) {
                bj4VarO.K(380507587);
                if (i == 0) {
                    bj4VarO.K(843560257);
                    strA = ws3.b(bj4VarO, R.string.m3c_date_picker_headline);
                    bj4VarO.U(false);
                } else if (i == 1) {
                    bj4VarO.K(843562784);
                    strA = ws3.b(bj4VarO, R.string.m3c_date_input_headline);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(380705954);
                    bj4VarO.U(false);
                    strA = BuildConfig.FLAVOR;
                }
                bj4VarO.U(false);
            } else {
                bj4VarO.K(843557408);
                bj4VarO.U(false);
            }
            if (i == 0) {
                bj4VarO.K(843570444);
                strB = ws3.b(bj4VarO, R.string.m3c_date_picker_headline_description);
                bj4VarO.U(false);
            } else if (i == 1) {
                bj4VarO.K(843573323);
                strB = ws3.b(bj4VarO, R.string.m3c_date_input_headline_description);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(381043234);
                bj4VarO.U(false);
            }
            String str = String.format(strB, Arrays.copyOf(new Object[]{strA2}, 1));
            boolean zJ = bj4VarO.J(str);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh2(0, str);
                bj4VarO.C(objF);
            }
            bj4Var = bj4VarO;
            mia.b(strA, pb9.b(ox6Var, false, (oh4) objF), j, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, null, bj4Var, (i3 >> 6) & 896, 24576, 245752);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(l, i, yh2Var, ox6Var, j, i2) { // from class: nh2
                public final /* synthetic */ Long u;
                public final /* synthetic */ int v;
                public final /* synthetic */ yh2 w;
                public final /* synthetic */ ox6 x;
                public final /* synthetic */ long y;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(199681);
                    this.t.a(this.u, this.v, this.w, this.x, this.y, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public final void b(final int i, final ox6 ox6Var, final long j, jt1 jt1Var, final int i2) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-390880814);
        int i3 = i2 | (bj4VarO.h(i) ? 4 : 2) | (bj4VarO.i(j) ? 256 : 128);
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i2 & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            if (i == 0) {
                bj4VarO.K(-1974299164);
                mia.b(ws3.b(bj4VarO, R.string.m3c_date_picker_title), ox6Var, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, i3 & 1008, 0, 262136);
                bj4Var = bj4VarO;
                bj4Var.U(false);
            } else {
                bj4Var = bj4VarO;
                if (i == 1) {
                    bj4Var.K(-1974291869);
                    mia.b(ws3.b(bj4Var, R.string.m3c_date_input_title), ox6Var, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, i3 & 1008, 0, 262136);
                    bj4Var = bj4Var;
                    bj4Var.U(false);
                } else {
                    bj4Var.K(-1073325776);
                    bj4Var.U(false);
                }
            }
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i, ox6Var, j, i2) { // from class: oh2
                public final /* synthetic */ int u;
                public final /* synthetic */ ox6 v;
                public final /* synthetic */ long w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(3121);
                    this.t.b(this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
